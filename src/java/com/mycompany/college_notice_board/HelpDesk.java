/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Sneha
 */
@WebServlet(name = "HelpDesk", urlPatterns = {"/HelpDesk"})
public class HelpDesk extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            String nm=request.getParameter("uname");
            String em =request.getParameter("uemail");
            String mb=request.getParameter("umobile");
            String mg=request.getParameter("msg");
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board","root","");
            Statement st =con.createStatement();
            int x=st.executeUpdate("INSERT INTO `helpdesk` ( `name`, `email`, `mobile`, `msg`) VALUES ('"+nm+"','"+em+"', '"+mb+"', '"+mg+"')");
           if(x!=0)
           {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('messege sent Successfully! ');");
                out.println("location='student_helpdesk.jsp';");
                out.println("</script>");  
                 
               
           }
           else
           {
               response.sendRedirect("student_helpdesk.jsp");
           }
        }
        catch(IOException | ClassNotFoundException | SQLException e){
            out.println(e);

        }
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>

}