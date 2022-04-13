<%-- 
    Document   : helpdesk_delete
    Created on : 19 Jun, 2021, 9:32:24 PM
    Author     : Sneha kumari
--%>

<%@page import="java.sql.*" %>
<%@page import="javax.servlet.*" %>


<%
    
                    String id=request.getParameter("id");
                   Connection con;
                   PreparedStatement ps;
                   ResultSet x;
                   Class.forName("com.mysql.jdbc.Driver");
                   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board","root","");
                    
                   ps=con.prepareStatement("delete from helpdesk where id = ?");
                  ps.setString(1, id);
                  ps.executeUpdate();
      

                  response.sendRedirect("admin_dash_helpdeskD.jsp");%>
                        
%>