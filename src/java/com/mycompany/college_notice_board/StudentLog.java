package com.mycompany.college_notice_board;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "StudentLog", urlPatterns = {"/StudentLog"})
public class StudentLog extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            
            String em=request.getParameter("uemail");
            String pswd =request.getParameter("upass");    
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board","root","");
            Statement st =con.createStatement();
            ResultSet x=st.executeQuery("select * from `studentregister` where `email`='"+em+"' and `pass`='"+pswd+"'");
           if(x.next())
           {
               response.sendRedirect("student_dash_noticeD.jsp");
                   
           }
           else
           {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Invalid UserId or Password! ');");
                out.println("location='student_login.jsp';");
                out.println("</script>");
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












//package com.mycompany.college_notice_board;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//@WebServlet(name = "StudentLog", urlPatterns = {"/StudentLog"})
//public class StudentLog extends HttpServlet {
//
//   
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try {
//            
//            String em=request.getParameter("uemail");
//            String pswd =request.getParameter("upass");
//            
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board","root","");
//            Statement st =con.createStatement();
//            ResultSet x=st.executeQuery("select * from `studentregister` where `email`='"+em+"' and `pass`='"+pswd+"'");
//           if(x.next())
//           {
//               response.sendRedirect("student_dash.jsp");
//                 
//               
//           }
//           else
//           {
//                out.println("<script type=\"text/javascript\">");
//                out.println("alert('Invalid UserId or Password! ');");
//                out.println("location='student_login.jsp';");
//                out.println("</script>");
//           }
//           
//         
//           
//        }
//        catch(IOException | ClassNotFoundException | SQLException e){
//            out.println(e);
//
//        }
//    }
//
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
//    
////    @Override
////    public String getServletInfo() {
////        return "Short description";
////    }// </editor-fold>
//
//}
