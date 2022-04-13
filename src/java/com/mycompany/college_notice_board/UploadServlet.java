package com.mycompany.college_notice_board;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
//import com.servlet.db.DB;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(name = "UploadServlet", urlPatterns = {"/UploadServlet"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
        maxFileSize = 1024 * 1024 * 1000, // 1 GB
        maxRequestSize = 1024 * 1024 * 1000)   	// 1 GB
public class UploadServlet extends HttpServlet {

    PrintWriter out = null;
    Connection con = null;
    PreparedStatement ps = null;
    HttpSession session = null;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain;charset=UTF-8");
        try {
            out = response.getWriter();
            session = request.getSession(false);
            String folderName = "resources";
            String uploadPath = request.getServletContext().getRealPath("") + File.separator + folderName;//for netbeans use this code
            //String uploadPath = request.getServletContext().getRealPath("") + folderName;//for eclipse use this code
            File dir = new File(uploadPath);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            Part filePart = request.getPart("filen");//Textbox value of name file.
            String Date = request.getParameter("sdate");//Textbox value of name firstname.
            String Subject = request.getParameter("nsub");//Textbox value of name lastname.
            String fileName = filePart.getSubmittedFileName();
            String path = folderName + File.separator + fileName;
            /*      Timestamp added_date = new Timestamp(System.currentTimeMillis()); */
//            System.out.println("fileName: " + fileName);
//            System.out.println("Path: " + uploadPath);
//            System.out.println("Name: " + Date);
            InputStream is = filePart.getInputStream();
            Files.copy(is, Paths.get(uploadPath + File.separator + fileName), StandardCopyOption.REPLACE_EXISTING);

            try {
//                con = DB.getConnection();
                System.out.println("connection done");
                String sql = "insert into notifications(s_date,sub,filename,path) values(?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, Date);
                ps.setString(2, Subject);
                ps.setString(3, fileName);
                ps.setString(4, path);

                int status = ps.executeUpdate();
                if (status > 0) {
                    session.setAttribute("fileName", fileName);
                    String msg = "Notice uploaded successfully...";
                    request.setAttribute("msg", msg);
                    RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
                    rd.forward(request, response);
                    System.out.println("Notice uploaded successfully...");
                    System.out.println("Uploaded Path: " + uploadPath);
                }
            } catch (SQLException e) {
                out.println("Exception: " + e);
                System.out.println("Exception1: " + e);
            } finally {
                try {
                    if (ps != null) {
                        ps.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    out.println(e);
                }
            }

        } catch (IOException | ServletException e) {
            out.println("Exception: " + e);
            System.out.println("Exception2: " + e);
        }
    }

}
