<%-- 
    Document   : home
    Created on : Jun 5, 2021, 2:20:42 PM
    Author     : Sneha Kumari
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">


        <title>HOME</title>
        <style>
            hr{
                height: 2px;
                background-color: greenyellow;
                border: none;
            }
        </style> 

    </head>
    <body>
        <nav class="navbar navbar-expand-sm p-2 sticky-top navbar-dark ">
            <div class="container">
                <h5 style="color: yellow;">College Notice Board</h5>

                <!--class="text-info"-->

<!--                <button type="button" class="navbar-toggler " data-toggle="collapse" data-target="#mymenu">
                    <span class="navbar-toggler-icon "></span>

                </button>-->
                <div class="collapse navbar-collapse  text-center" id="mymenu">
                    <ul class=" navbar-nav ml-auto" >
                        <li class="nav-item active">
                            <a class="nav-link " href="home.jsp">Home</a>
                        </li>


                        <li class="nav-item ">
                            <a class="nav-link " href="student_login.jsp">Student</a>
                        </li>


                        <li class="nav-item">
                            <a class="nav-link" href="student_helpdesk.jsp">Help Desk</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="admin_login.jsp">Admin</a>
                        </li>

                    </ul>
                </div>
            </div>     
        </nav>

        <div class="container py-5 z-depth-1">

            <!--Section: Content-->
            <section class=" text-center text-lg-left dark-grey-text">

                <!--Grid row-->
                <div class="row">

                    <!--Grid column-->
                    <div class="col-md-5 mb-4 py-4 mb-md-0">

                        <h3 class="font-weight-bold">Welcome to College Notice Board</h3>
                        <hr>

                        <ul>
                            <li>This web application helps the students to retrieve all the notices directly through their cell phones, laptops and computers.</li>
                        </ul>
                        <ul>
                            <li>If any students face any type of problems related to notifications and forget password then they can convey to us using HelpDesk tab.</li>
                        </ul> 
                        <ul>  
                            <li>First of all new students have to register themselves to see the Notice-Board and also they can download the notices.</li>
                        </ul> 



                    </div>

                    <div class="col-md-6 mb-9 mb-md-0">
                        <!--Image-->
                        <div class="view overlay z-depth-1-half">
                            <img src="image/snarv.jpeg" class="img-fluid" style="margin-left: 100px; "alt="">
                        </div>

                    </div>

                </div>

            </section>

        </div>  

        <div  style="margin-top: 40px">  
            <div class="p-2 text-center text-white " style="background-color:#27354e;" >
                <p class="footer">Copyright &copy;2021 | Designed By Pawan Kumar  |</p> 
            </div>
        </div>    

    </body>
</html> 
