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
                        
                        <li class="nav-item active ">
                            <a class="nav-link " href="admin_dash_studentD.jsp">Student</a>
                        </li>



                        <li class="nav-item  ">
                            <a class="nav-link " href="admin_dash_noticeD.jsp">Notice</a>
                        </li>




                        <li class="nav-item  ">
                            <a class="nav-link " href="admin_dash_addNotice.jsp">Add Notice</a>
                        </li>


                        <li class="nav-item">
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
            <h5 class="text-center text-success ">STUDENT DETAILS</h5>
            <hr>       

            <div class="row ">
                <div class=" col-md-12">
                    <table class="table border">
                        <thead>
                            <tr class=" bg-info text-white">
                                <th>Sch./Roll No.</th>
                                <th>Name</th>
                                <th>Degree</th>  
                                <th>Email</th> 
                                <th>Mobile</th>
                                <th>Password</th>
                                <th>Action</th>

                            </tr>
                        </thead>   
                        <tbody>
                            <%
                                Connection con;
//                                PreparedStatement ps;
                                ResultSet x;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");

                                String query = "select * from studentregister";
                                Statement st = con.createStatement();

                                x = st.executeQuery(query);

                                while (x.next()) {
                                    String scholar = x.getString("scholar");

                            %>


                            <tr>
                                <td><%=x.getString("scholar")%></td>
                                <td><%=x.getString("name")%></td>
                                <td><%=x.getString("degree")%></td>
                                <td><%=x.getString("email")%></td>
                                <td><%=x.getString("mobile")%></td>
                                <td><%=x.getString("pass")%></td>                    
                                <td>
                                    <a href="studentD_edit.jsp?scholar=<%=scholar%>" class="btn btn-success">Edit</a>
                                    <a href="studentD_delete.jsp?scholar=<%=scholar%>" class="btn btn-danger">Delete</a>
                                </td>
                            </tr>
                            <%
                                }

                            %>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <div style="margin-top: 100px" >  
            <div class="p-2 text-center text-white " style="background-color:#27354e;" >
                <p class="footer">Copyright &copy;2021 | Designed By Pawan Kumar |</p> 
            </div>
        </div>    

    </body>
</html>