<%@page import="java.sql.*" %>
<%@page import="javax.servlet.*" %>


<%
    
                    String id=request.getParameter("id");
                   Connection con;
                   PreparedStatement ps;
                   ResultSet x;
                   Class.forName("com.mysql.jdbc.Driver");
                   con= DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board","root","");
                    
                   ps=con.prepareStatement("delete from notifications where id = ?");
                  ps.setString(1, id);
                  ps.executeUpdate();
      

                  response.sendRedirect("admin_dash_noticeD.jsp");%>
                        
%>


