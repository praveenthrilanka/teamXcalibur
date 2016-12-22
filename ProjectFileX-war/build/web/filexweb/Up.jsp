<%@page import="org.sampath.filex.web.actions.Employee"%>
<!DOCTYPE HTML>
<html>
    <head>
        <title>Home</title>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

        <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
        <link href="css/style1.css" rel='stylesheet' type='text/css' />
        <link rel="icon" href="favicon.ico" type="image/x-icon" >
        <link href="css/font-awesome.css" rel="stylesheet"> 

        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="js/modernizr.custom.js"></script>

        <script src="js/metisMenu.min.js"></script>
        <script src="js/custom.js"></script>
        <link href="css/custom.css" rel="stylesheet">

        <%
            session = request.getSession(false);

            Employee e = Employee.getEmployee((String) session.getAttribute("eid"));
            String url;

            if(e.getPicurl()==null){
                url = "images/user/user.png";
            }
            else{
                url = e.getPicurl();
            }


        %>

    </head> 
    <body class="cbp-spmenu-push">
        <div class="main-content">

            <!-- header-starts -->
            <div class="sticky-header header-section ">
                <div class="header-left">
                    <!--logo -->
                    <div class="logo">
                        <img id="logo" src="images/fileXlogo.png" alt="Logo" width="100"/> 
                    </div>
                    <!--//logo-->
                    <div class="user-right">

                    </div>
                    <div class="clearfix"> </div>
                </div>

                <div class="header-right">


                    <div class="profile_medile"><!--notifications of menu start -->

                        <div ><!--notifications of menu start -->

                            <div class="profile_details">	

                                <ul>
                                    <li class="dropdown profile_details_drop">
                                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                                            <div class="profile_img">	

                                                <div class="prfil-imge"><div class="user-name"><p style="color:#FFA500; font-weight: bold;"><% out.print(e.getEmployeename()); %></p><span><% out.print(e.getPosition()); %></span></div><img width="50" height="50" style="border-radius: 50%;" src="<% out.print(url); %>" alt="">		       
                                                </div> 

                                                <div class="clearfix"></div>


                                            </div>	
                                        </a>
                                        <ul class="dropdown-menu drp-mnu">
                                            <li> <a href="#"><i class="fa fa-cog"></i> Settings</a> </li> 
                                            <li> <a href="#"><i class="fa fa-user"></i> Profile</a> </li> 
                                            <li> <a href="#"><i class="fa fa-sign-out"></i> Logout</a> </li>
                                        </ul>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </div>
                    <ul class="nofitications-dropdown">
                        <li class="dropdown head-dpdn">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><img src="images/msg.png" width="30px"><span class="badge">3</span></a>
                            <ul class="dropdown-menu anti-dropdown-menu">
                                <li>
                                    <div class="notification_header">
                                        <h3>You have 3 new messages</h3>
                                    </div>
                                </li>
                                <li><a href="#">
                                        <div class="user_img"><img src="images/1.png" alt=""></div>
                                        <div class="notification_desc">
                                            <p>Erandi Atapattu </p>
                                            <p><span>1 hour ago</span></p>
                                        </div>
                                        <div class="clearfix"></div>	
                                    </a></li>
                                <li class="odd"><a href="#">
                                        <div class="user_img"><img src="images/2.png" alt=""></div>
                                        <div class="notification_desc">
                                            <p>Reshani Mihirika </p>
                                            <p><span>1 hour ago</span></p>
                                        </div>
                                        <div class="clearfix"></div>	
                                    </a></li>
                                <li><a href="#">
                                        <div class="user_img"><img src="images/3.png" alt=""></div>
                                        <div class="notification_desc">
                                            <p>Nishani Abeysinghe </p>
                                            <p><span>1 hour ago</span></p>
                                        </div>
                                        <div class="clearfix"></div>	
                                    </a></li>
                                <li>
                                    <div class="notification_bottom">
                                        <a href="#">See all messages</a>
                                    </div> 
                                </li>
                            </ul>
                        </li>
                        <li class="dropdown head-dpdn">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false"><img src="images/bell.png" width="30px"><span class="badge blue">3</span></a>
                            <ul class="dropdown-menu anti-dropdown-menu">
                                <li>
                                    <div class="notification_header">
                                        <h3>You have 3 new notification</h3>
                                    </div>
                                </li>
                                <li><a href="#">
                                        <div class="user_img"><img src="images/2.png" alt=""></div>
                                        <div class="notification_desc">
                                            <p>Erandi Atapattu </p>
                                            <p><span>1 hour ago</span></p>
                                        </div>
                                        <div class="clearfix"></div>	
                                    </a></li>
                                <li class="odd"><a href="#">
                                        <div class="user_img"><img src="images/1.png" alt=""></div>
                                        <div class="notification_desc">
                                            <p>Reshani Mihirika </p>
                                            <p><span>1 hour ago</span></p>
                                        </div>
                                        <div class="clearfix"></div>	
                                    </a></li>
                                <li><a href="#">
                                        <div class="user_img"><img src="images/3.png" alt=""></div>
                                        <div class="notification_desc">
                                            <p>Nishani Abeysinghe </p>
                                            <p><span>1 hour ago</span></p>
                                        </div>
                                        <div class="clearfix"></div>	
                                    </a></li>
                                <li>
                                    <div class="notification_bottom">
                                        <a href="#">See all notifications</a>
                                    </div> 
                                </li>
                            </ul>
                        </li>	
                    </ul>
                </div>


                <div class="clearfix"> </div>	
            </div>
            <!-- //header-ends -->

