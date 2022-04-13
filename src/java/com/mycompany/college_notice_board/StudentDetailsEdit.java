package com.mycompany.college_notice_board;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "StudentDetailsEdit", urlPatterns = {"/StudentDetailsEdit"})
public class StudentDetailsEdit extends HttpServlet {

    PrintWriter out = null;
    HttpSession session;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try {

            out = response.getWriter();
            session = request.getSession();
            String op = request.getParameter("op");
            System.out.println("Op:  " + op);
            if (op != null && op.equalsIgnoreCase("update")) {

                System.out.println("scholar " + request.getParameter("scholar"));
                int sch = Integer.parseInt(request.getParameter("scholar"));
                String nm = request.getParameter("name");
                String deg = request.getParameter("degree");
                String email = request.getParameter("email");
                String mob = request.getParameter("mobile");
                
                System.out.println(nm + " " + deg + " " + email + " " + mob);

                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");
                Statement st = con.createStatement();
                int x = st.executeUpdate("update studentregister set name='" + nm + "', degree='" + deg + "', email='" + email + "', mobile='" + mob + "' where scholar=" + sch + " ");

                if (x != 0) {
                    
                 out.println("<script type=\"text/javascript\">");
                out.println("alert('Student Detail has been updated Successfully..');");
                out.println("location='admin_dash_studentD.jsp';");
                out.println("</script>");
                    
                    //session.setAttribute("email", email);
                    //session.setAttribute("updated", "Student Detail has been updated Successfully..");
                   // response.sendRedirect("admin_dash_studentD.jsp");
                } else {
                    out.println("Oops! Something went wrong...");
                }
            }

        } catch (IOException | ClassNotFoundException | SQLException e) {
            out.println(e);

        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception e) {
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception e) {
        }

    }

}