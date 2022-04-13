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
                <h5 style="color: yellow;">College Notice Board</h5>

                <!--                <button type="button" class="navbar-toggler " data-toggle="collapse" data-target="#mymenu">
                                    <span class="navbar-toggler-icon "></span>
                
                                </button>-->
                <div class="collapse navbar-collapse  text-center" id="mymenu">
                    <ul class=" navbar-nav ml-auto" >
                        <li class="nav-item  ">
                            <a class="nav-link  " href="home.jsp">Home</a>
                        </li>

                        <li class="nav-item  ">
                            <a class="nav-link " href="student_login.jsp">Student</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" href="student_helpdesk.jsp">Help Desk</a>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link" href="admin_login.jsp">Admin</a>
                        </li>

                    </ul>
                </div>
            </div>     
        </nav>

        <div class="container py-5">

            <div class="row justify-content-center align-items-center ">

                <div class="col-md-5 " style="background-color: rgb(227, 239, 250);">

                    <div class="col-md-12 py-4">

                        <div class="text-center text-info" >
                            <h4>Admin Login</h4>
                        </div>

                        <hr class="bg-info">

                        <form action="AdminLog" method="POST">

                            <div class="form-group">
                                <label >Username</label>
                                <input type="text" class="form-control" name="uname" Required placeholder="Enter Username">
                            </div>

                            <div class="form-group">
                                <label >Password</label>
                                <input type="password" class="form-control" name="upass" Required placeholder="Password">
                            </div>

                            <button type="submit" class="btn btn-primary">Login</button>

                        </form>
                    </div>                       
                </div>     
            </div>  
        </div>  

        <div style="margin-top: 100px">  
            <div class="p-2 text-center text-white " style="background-color:#27354e; margin-top: 80px;" >
                <p class="footer">Copyright &copy;2021 | Designed By Pawan Kumar |</p> 
            </div>
        </div>    
    </body>
</html>