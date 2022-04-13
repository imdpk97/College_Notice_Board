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


        <title>Student</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm p-2 sticky-top navbar-dark ">
            <div class="container">
                <h5 style="color: yellow;">Student</h5>


<!--                <button type="button" class="navbar-toggler " data-toggle="collapse" data-target="#mymenu">
                    <span class="navbar-toggler-icon "></span>

                </button>-->
                <div class="collapse navbar-collapse  text-center" id="mymenu">
                    <ul class=" navbar-nav ml-auto" >

                        <li class="nav-item active ">
                            <a class="nav-link " href="student_dash_noticeD.jsp">Notice/Circular</a>
                        </li>


                        <li class="nav-item p-1 ">
                            <a class=" btn btn-danger btn-sm " href="student_login.jsp">Logout</a>
                        </li>


                    </ul>
                </div>
            </div>     
        </nav>

        <div class="container py-1">
            
            <div class="row justify-content-center align-items-center ">

                <div class="col-md-12" style="background-color: rgb(227, 239, 250);">

                    <div class="col-md-18 mt-2 py-2">

                        <div class="col-md-12 py-3">   
                            
                            <div class="text-center text-info" >
                                <h4>Notice Board</h4>
                            </div>
                            
                            <hr class="bg-info">    

                            <%
                                Connection con;
//                                PreparedStatement ps;
                                ResultSet x;
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/notice_board", "root", "");

                                String query = "select * from notifications";
                                Statement st = con.createStatement();

                                x = st.executeQuery(query);

                                while (x.next()) {


                            %>

                            <div class="px-1">
                                
                                <div class="card">
                                    
                                    <div class="card-body p-2">

                                        <div class="row">
                                            <div class="col-2">
                                                <p class=""><b class="text-center text-success">Date</b> : <%=x.getString("s_date")%></p>
                                            </div>

                                            <div class="col-7  ">
                                                <p><b class="text-center text-success">Subject</b> : <%=x.getString("sub")%></p>
                                            </div>

                                            <%--                                <div class="col-3 text-right ">
                                                                                <p class=""> <b class="text-center text-success">File</b> :  <%=x.getString("filename")%>
                                             
                                                                            </div>--%>

                                            <div class="col-3  text-right">
                                                <button type="download" class="btn btn-primary"><a href="NoticeDownload?fileName=<%=x.getString(4)%>" style="color: white">Download</a></button>
                                            </div>

                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br>

                            <%
                                }

                            %>       
                        </div>   

                    </div>

                </div>  
            </div>
        </div>

        <div style="margin-top: 70px">  
            <div class="p-2 text-center text-white " style="background-color:#27354e;" >
                <p class="footer">Copyright &copy;2021 | Designed By Pawan Kumar |</p> 
            </div>
        </div>    

    </body>
</html>