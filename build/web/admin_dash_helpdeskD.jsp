<%-- 
    Document   : admin_helpdesk
    Created on : 19 Jun, 2021, 9:15:54 PM
    Author     : Sneha kum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<%@page import="javax.servlet.*" %>


<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">


        <title>Admin</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm p-2 sticky-top navbar-dark ">
            <div class="container">
                <h5 style="color: yellow;">Admin</h5>

                <button type="button" class="navbar-toggler " data-toggle="collapse" data-target="#mymenu">
                    <span class="navbar-toggler-icon "></span>

                </button>
                <div class="collapse navbar-collapse  text-center" id="mymenu">
                    <ul class=" navbar-nav ml-auto" >
                        
                         <li class="nav-item">
                            <a class="nav-link" href="admin_dash_studentStatus.jsp">Status</a>
                        </li>
                        
                        <li class="nav-item  ">
                            <a class="nav-link " href="admin_dash_studentD.jsp">Student</a>
                        </li>

                        <li class="nav-item  ">
                            <a class="nav-link " href="admin_dash_noticeD.jsp">Notice</a>
                        </li>

                        <li class="nav-item  ">
                            <a class="nav-link " href="admin_dash_addNotice.jsp">Add Notice</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="admin_dash_helpdeskD.jsp">Help Desk</a>
                        </li>
                        <li class="nav-item p-1 ">
                            <a class=" btn btn-danger btn-sm " href="admin_login.jsp">Logout</a>
                        </li>
                    </ul>
                </div>
            </div>     
        </nav>

        <div class="container-fluid contact-form ">

            <hr>
            <h5 class="text-center text-success ">HELP DETAILS</h5>
            <hr>

            <div class="row ">
                <div class=" col-md-12">
                    <table class="table border">
                        <thead>
                            <tr class=" bg-info text-white">
                                <th>Name</th>
                                <th>Email</th> 
                                <th>Mobile</th>
                                <th>Message</th>
                                <th>Action</th>

                            </tr>
                        </thead>   
                        <tbody>
                            <%
                                Connection con;
                                PreparedStatement ps;
                                ResultSet x;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");

                                String query = "select * from helpdesk";
                                Statement st = con.createStatement();

                                x = st.executeQuery(query);

                                while (x.next()) {
                                    String id = x.getString("id");

                            %>

                            <tr>
                                <td><%=x.getString("name")%></td>
                                <td><%=x.getString("email")%></td>
                                <td><%=x.getString("mobile")%></td>
                                <td><%=x.getString("msg")%></td>                    
                                <td><a href="helpdeskD_delete.jsp?id=<%=id%>" class="btn btn-danger">Delete</a></td>
                            </tr>
                            <%
                               }

                            %>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div >  
            <div class="p-2 text-center text-white " style="background-color:#27354e; margin-top: 220px;" >
                <p class="footer">Copyright &copy;2021 | Designed By Pawan Kumar |</p> 
            </div>
        </div>    

    </body>
</html>