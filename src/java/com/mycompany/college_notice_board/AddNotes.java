package com.mycompany.college_notice_board;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(name = "AddNotes", urlPatterns = {"/AddNotes"})
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
        maxFileSize = 1024 * 1024 * 1000, // 1 GB
        maxRequestSize = 1024 * 1024 * 1000)   	// 1 GB
public class AddNotes extends HttpServlet {

    PrintWriter out = null;
    Connection con = null;
//    PreparedStatement ps = null;
//    HttpSession session = null;
    Statement st = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        out = response.getWriter();
        /*   try {  */

        out = response.getWriter();
//            session = request.getSession(false);
        String folderName = "resources";
        String uploadPath = request.getServletContext().getRealPath("") + File.separator + folderName;

        File dir = new File(uploadPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        try {

            String Date = request.getParameter("sdate");
            String Subject = request.getParameter("nsub");
            Part filePart = request.getPart("filen");
            String fileName = filePart.getSubmittedFileName();
            String npath = folderName + File.separator + fileName;
            InputStream is = filePart.getInputStream();
            Files.copy(is, Paths.get(uploadPath + File.separator + fileName), StandardCopyOption.REPLACE_EXISTING);

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");
            st = con.createStatement();

            int x = st.executeUpdate("INSERT INTO `notifications` (`s_date`, `sub`, `filename`, `path`) VALUES ('" + Date + "', '" + Subject + "', '" + fileName + "', '" + npath + "')");

            if (x != 0) {
//                    session.setAttribute("fileName", fileName);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Notice Added Successfully! ');");
                out.println("location='admin_dash_addNotice.jsp';");
                out.println("</script>");

            }
        } catch (IOException | ClassNotFoundException | SQLException e) {
            out.println(e);

        }

        /*  } catch (IOException | ClassNotFoundException | SQLException e) {
            
            out.println(e);

        } */
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNotes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

//package com.mycompany.college_notice_board;
//
////import com.servlet.db.DB;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.PrintWriter;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.nio.file.StandardCopyOption;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.MultipartConfig;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import javax.servlet.http.Part;
//
//@WebServlet(name = "AddNotes", urlPatterns = {"/AddNotes"})
//@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
//        maxFileSize = 1024 * 1024 * 1000, // 1 GB
//        maxRequestSize = 1024 * 1024 * 1000)   	// 1 GB
//public class AddNotes extends HttpServlet {
//
//    PrintWriter out = null;
//    Connection con = null;
//    PreparedStatement ps = null;
//    HttpSession session = null;
//    Statement st = null;
//
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        out = response.getWriter();
//        try {
//
//            out = response.getWriter();
//            session = request.getSession(false);
//            String folderName = "resources";
//            String uploadPath = request.getServletContext().getRealPath("") + File.separator + folderName;//for netbeans use this code
//
//            File dir = new File(uploadPath);
//            if (!dir.exists()) {
//                dir.mkdirs();
//            }
//
//            String Date = request.getParameter("sdate");
//            String Subject = request.getParameter("nsub");
//            Part filePart = request.getPart("filen");//Textbox value of name file.
//            String fileName = filePart.getSubmittedFileName();
//            String path = folderName + File.separator + fileName;
//            InputStream is = filePart.getInputStream();
//            Files.copy(is, Paths.get(uploadPath + File.separator + fileName), StandardCopyOption.REPLACE_EXISTING);
//
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");
//            st = con.createStatement();
//
//            try {
////                con = DB.getConnection();
////                System.out.println("connection done");
//
//                String sql = "insert into notifications(s_date,sub,filename,path) values(?,?,?,?)";
//                ps = con.prepareStatement(sql);
//                ps.setString(1, Date);
//                ps.setString(2, Subject);
//                ps.setString(3, fileName);
//                ps.setString(4, path);
//
//                int status = ps.executeUpdate();
//
//                if (status > 0) {
//                    session.setAttribute("fileName", fileName);
//                    out.println("<script type=\"text/javascript\">");
//                    out.println("alert('Notice Added Successfully! ');");
//                    out.println("location='addnotes.jsp';");
//                    out.println("</script>");
//
//                } 
////                else {
////                    response.sendRedirect("addnotes.jsp");
////                }
//            } catch (SQLException e) {
//                out.println("Exception: " + e);
//                System.out.println("Exception1: " + e);
//            }
//
//        } catch (IOException | ClassNotFoundException | SQLException e) {
//            
//            out.println(e);
//
//        }
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
////    @Override
////    public String getServletInfo() {
////        return "Short description";
////    }
//
//}

