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

                <!--
                                <button type="button" class="navbar-toggler " data-toggle="collapse" data-target="#mymenu">
                                    <span class="navbar-toggler-icon "></span>
                
                                </button>-->
                <div class="collapse navbar-collapse  text-center" id="mymenu">

                    <ul class=" navbar-nav ml-auto" >
                        
                         <li class="nav-item">
                            <a class="nav-link" href="admin_dash_studentStatus.jsp">Status</a>
                        </li>

                        <li class="nav-item  ">
                            <a class="nav-link " href="admin_dash_studentD.jsp">Student</a>
                        </li>

                        <li class="nav-item ">
                            <a class="nav-link " href="admin_dash_noticeD.jsp">Notice</a>
                        </li>

                        <li class="nav-item active">
                            <a class="nav-link " href="admin_dash_addNotice.jsp">Add Notice</a>
                        </li>


                        <li class="nav-item">
                            <a class="nav-link" href="admin_dash_helpdeskD.jsp">Help Desk</a>
                        </li>

                        <li class="nav-item p-1">
                            <a class=" btn btn-danger btn-sm " href="admin_login.jsp">Logout</a>
                        </li>

                    </ul>
                </div>
            </div>     
        </nav>


        <div class="container py-5">
            <div class="row justify-content-center align-items-center ">

                <div class="col-md-6 " style="background-color: rgb(227, 239, 250);">

                    <div class="col-md-12 py-4">

                        <div class="text-center text-info" >
                            <h4>Add New Notice</h4>
                        </div>

                        <hr class="bg-info">                  

                        <form action="AddNotes" method="post" enctype="multipart/form-data">

                            <label for="example-date-input">Date</label>
                            <input class="form-control" type="dob" name="sdate" class="form-group" placeholder="Available on">

                            <br/>

                            <label for="exampleInputPassword1">Subject</label>
                            <input type="text" class="form-control" name="nsub" Required placeholder="Enter Subject">

                            <br/>

                            <label for="exampleInputPassword1">Add File</label>
                            <input type="file" type="Choose File"  class="form-control" name="filen" />

                            <br/>

                            <!--<div class="text-center mb-3">-->
                            <center><button type="submit" class="btn btn-primary">Add Notice</button></center>
                            <!--</div>-->
                        </form>

                    </div>   

                </div>

            </div>  

        </div>


        <div >  
            <div class="p-2 text-center text-white " style="background-color:#27354e;" >
                <p class="footer">Copyright &copy;2021 | Designed By Pawan Kumar |</p> 
            </div>
        </div>    

    </body>
</html>
