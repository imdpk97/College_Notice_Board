<!doctype html>
<html lang="en">
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">

        <title>Student</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-sm p-2 sticky-top navbar-dark ">
            <div class="container">
                <h5 style="color: yellow;">College Notice Board</h5>

                <button type="button" class="navbar-toggler " data-toggle="collapse" data-target="#mymenu">
                    <span class="navbar-toggler-icon "></span>

                </button>
                <div class="collapse navbar-collapse  text-center" id="mymenu">
                    <ul class=" navbar-nav ml-auto" >
                        <li class="nav-item  ">
                            <a class="nav-link " href="home.jsp">Home</a>
                        </li>

                        <li class="nav-item active  ">
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

        <div class="container py-2">

            <div class="row justify-content-center align-items-center ">

                <div class="col-md-6 " style="background-color: rgb(227, 239, 250);">

                    <div class="col-md-14 py-3">

                        <div class="text-center text-info" >
                            <h4> Student Registration</h4>
                        </div>

                        <hr class="bg-info">
                        <%--<c:if test="${not empty loginError}">
                             <script>
                                 window.addEventListener("load", function () {
                                     alert("${loginError}");
                                 };
                             </script>
                         </c:if>--%>

                        <form action="StudentReg" method="POST">

                            <div class="form-group">
                                <label >Scholar No./Roll No.</label>
                                <input type="Username" class="form-control" name="uscholar" Required placeholder="Enter Roll No.">
                            </div>
                            <div class="form-group">
                                <label for="exampleInputPassword1">Name</label>
                                <input type="text" class="form-control" name="uname" Required placeholder="Enter Your Name">
                            </div>

                            <div class="form-group">
                                <label for="exampleFormControlSelect1">Degree</label>
                                <select class="form-control" name="udegree" id="exampleFormControlSelect1">
                                    
                                    <option>MCA</option>
                                    <option>M.Tech</option>
                                    <option>B.Tech</option>

                                </select>
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Email</label>
                                <input type="email" class="form-control" name="uemail" Required placeholder="Email@gmail.com">
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Phone</label>
                                <input type="text" class="form-control" name="umobile"Required placeholder="Mobile Number">
                            </div>

                            <div class="form-group">
                                <label for="exampleInputPassword1">Password</label>
                                <input type="password" class="form-control" name="upass" Required placeholder="Password">
                            </div>

                            <button type="submit" class="btn btn-primary">Register</button>
                            <a class="text-success px-3" href="student_login.jsp">Click here to Student Login</a>

                        </form>

                    </div>   

                </div>

            </div>  
        </div>
                        

        <div  style="margin-top: 30px"> 

            <div class="p-2 text-center text-white " style="background-color:#27354e;" >
                <p class="footer">Copyright &copy;2021 | Designed By Pawan Kumar |</p> 
            </div>

        </div> 

    </body>
</html>