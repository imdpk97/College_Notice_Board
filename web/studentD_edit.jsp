<%-- 
    Document   : studentD_edit
    Created on : 25 Jun, 2021, 9:48:43 PM
    Author     : Sneha kumari
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%--<%@page import="com.java.DB"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Edit Employee</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        
       <%
            if (request.getParameter("scholar") == null)
                response.sendRedirect("admin_dash_studentD.jsp");
            else {
                int scholar = Integer.parseInt(request.getParameter("scholar"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");
                    String sql = "select * from studentregister where scholar=?";
                    PreparedStatement smt = con.prepareStatement(sql);
                    smt.setInt(1, scholar);
                    ResultSet rs = smt.executeQuery();
                    if (rs.next()) {%>

                    <form action="StudentDetailsEdit?op=update" method="POST" >
            <div class="container-fluid contact-form ">

                <hr>
                <h4 class="text-center text-success ">Notice Update</h4>
                <hr>

                <div class="row ">
                    <div class=" col-md-12">
                        <table class="table border">
                            <thead>
                                <tr class=" bg-info text-white">

                                    <th>Name</th>
                                    <th>Degree</th>
                                    <th>Email</th> 
                                    <th>Mobile</th> 

                                </tr>
                            <input type="hidden" name="scholar" value="<%=scholar%>"/>

                            <td><input type="text" name="name" id="name"   value="<%=rs.getString("name")%>"/></td>

                            <td><input type="text" name="degree" id="pdegree" required="required" value="<%=rs.getString("degree")%>"/></td>

                            <td><input type="email" name="email" id="temail" value="<%=rs.getString("email")%>"/></td>

                            <td><input type="text" name="mobile" id="mobile" value="<%=rs.getString("mobile")%>"/></td>
                            
                        </table>

                    </div>
                </div>
            </div>

            <!--<center><button class="btn btn-success"><input type="submit" value="Update"></button></center>-->
            <center><button class="btn btn-success">Update</button></center>

        </form>
        <%}
                } catch (Exception e) {
                    System.out.println("Error  " + e.getMessage());
                }
            }
        %>

        <br><br>
        <div class="text-center mb-3">

            <!--<button type="submit" class="btn btn-primary" href="admin_notes.jsp">Back</button>-->
            <button class="btn btn-primary"><a href="admin_dash_studentD.jsp" style="text-decoration: none; color: white">Back</a></button>
        </div>


        <div style="margin-top: 270px">  
            <div class="p-2 text-center text-white " style="background-color:#27354e;" >
                <p class="footer">Copyright &copy;2021 | Designed By Pawan Kumar |</p> 
            </div>
        </div> 
        
</body>
</html>










<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="javax.servlet.*" %> --%>
<%-- <%
    String id = request.getParameter("id");

    Connection con;
    PreparedStatement ps;
    ResultSet x;

    Class.forName("com.mysql.jdbc.Driver");

    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");

    ps = con.prepareStatement("select * from notifications where id=?");

    ps.setInt(1, Integer.parseInt(id));

    x = ps.executeQuery();
    x.next();
    String s_date = x.getString(1);
    String sub = x.getString(2);
    String file = x.getString(3);
    con.close();
%>--%>

<!doctype html>
<%-- <html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">

    </head>
    <body>

        <%
            if (request.getParameter("id") == null)
                response.sendRedirect("admin_dash_noticeD.jsp");
            else {
                int id = Integer.parseInt(request.getParameter("id"));
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");
                    String sql = "select * from notifications where id=?";
                    PreparedStatement smt = con.prepareStatement(sql);
                    smt.setInt(1, id);
                    ResultSet rs = smt.executeQuery();
                    if (rs.next()) {%>

        <form action="UpdateNotice?op=update" method="post">
            <div class="container-fluid contact-form ">

                <hr>
                <h5 class="text-center text-success ">Notice Update</h5>
                <hr>

                <div class="row ">
                    <div class=" col-md-12">
                        <table class="table border">
                            <thead>
                                <tr class=" bg-info text-white">

                                    <th>Date</th>
                                    <th>Subject</th>
                                    <th>File</th> 

                                </tr>

                            <td><input type="text" name="s_date" id="s_date"   value="<%=rs.getString("s_date")%>"/></td>

                            <td><input type="text" name="sub" id="name" required="required" value="<%=rs.getString("sub")%>"/></td>

                            <td><input type="file" name="file" id="userid" value="<%=rs.getString("filename")%>"/></td>

                        </table>

                    </div>
                </div>
            </div>

            <!--<center><button class="btn btn-success"><input type="submit" value="Update"></button></center>-->
            <center><button class="btn btn-success">Update</button></center>

        </form>
        <%}
                } catch (Exception e) {
                    System.out.println("Error  " + e.getMessage());
                }
            }
        %>

        <br><br>
        <div class="text-center mb-3">

            <!--<button type="submit" class="btn btn-primary" href="admin_notes.jsp">Back</button>-->
            <button class="btn btn-primary"><a href="admin_dash_noticeD.jsp" style="text-decoration: none; color: white">Back</a></button>
        </div>


        <div style="margin-top: 270px">  
            <div class="p-2 text-center text-white " style="background-color:#27354e;" >
                <p class="footer">Copyright &copy;2021 | Designed By Sneha |</p> 
            </div>
        </div> 

    </body>
</html> --%>






