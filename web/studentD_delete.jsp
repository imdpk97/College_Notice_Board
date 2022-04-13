<%@page import="java.sql.*" %>
<%@page import="javax.servlet.*" %>


<%

    String scholar = request.getParameter("scholar");
    Connection con;
    PreparedStatement ps;
//    ResultSet x;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");

    ps = con.prepareStatement("delete from studentregister where scholar = ?");
    ps.setString(1, scholar);
    ps.executeUpdate();

    response.sendRedirect("admin_dash_studentD.jsp");%>

%>


