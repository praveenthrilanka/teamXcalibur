

<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Notification"%>
<%@page import="org.sampath.filex.web.actions.Employee"%>

<!DOCTYPE html>
<html class=" ">
    <head>

        <meta http-equiv="content-type" content="text/html;charset=UTF-8" />
        <meta charset="utf-8" />
        <title>FileX : Sampath Bank</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
        <meta content="" name="description" />
        <meta content="" name="author" />

        <link rel="shortcut icon" href="logos/fav-icon.ico" type="image/x-icon"/>    <!-- Favicon -->
        <link rel="apple-touch-icon-precomposed" href="images/apple-touch-icon-57-precomposed.png">	<!-- For iPhone -->
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/apple-touch-icon-114-precomposed.png">    <!-- For iPhone 4 Retina display -->
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/apple-touch-icon-72-precomposed.png">    <!-- For iPad -->
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/apple-touch-icon-144-precomposed.png">    <!-- For iPad Retina display -->





        <!-- CORE CSS FRAMEWORK - START -->
        <link href="plugins/pace/pace-theme-flash.css" rel="stylesheet" type="text/css" media="screen"/>
        <link href="plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="fonts/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css"/>
        <link href="css/animate.min.css" rel="stylesheet" type="text/css"/>
        <link href="plugins/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS FRAMEWORK - END -->
        
        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> 
        <link href="plugins/daterangepicker/css/daterangepicker-bs3.css" rel="stylesheet" type="text/css" media="screen"/>

             
        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 
       
        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> 
        <link href="plugins/jquery-ui/smoothness/jquery-ui.min.css" rel="stylesheet" type="text/css" media="screen"/><!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> 


        <!-- CORE CSS TEMPLATE - START -->
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/responsive.css" rel="stylesheet" type="text/css"/>
        <!-- CORE CSS TEMPLATE - END -->

        <%
            session = request.getSession(false);

            if (session.getAttribute("eid") == null) {
                response.sendRedirect("Login.jsp");
            }

            Employee e = Employee.getEmployee((String) session.getAttribute("eid"));

        %>

    </head>
    <!-- END HEAD -->

    <!-- BEGIN BODY -->
    <body class=" " style="background-color: #f1f2f7;"><!-- START TOPBAR -->
        <div class='page-topbar '>
            <div class='logo-area'>

            </div>
            <div class='quick-area'>
                <div class='pull-left'>
                    <ul class="info-menu left-links list-inline list-unstyled">
                        <li class="sidebar-toggle-wrap">
                            <a href="#" data-toggle="sidebar" class="sidebar_toggle">
                                <i class="fa fa-bars"></i>
                            </a>
                        </li>


                        <%ArrayList<Notification> notifications = Notification.getAllNotification(e.getEmployeeid());
                            int count = Notification.notificationInfo(e.getEmployeeid());
                            String empPosition = null;
                            if (e.getPosition().equals("Business Analyist")) {
                                empPosition = "ba";
                            } else if (e.getPosition().equals("Project Manager")) {
                                empPosition = "pm";
                            } else if (e.getPosition().equals("PM/MSD")) {
                                empPosition = "pmMsd";
                            } else if (e.getPosition().equals("ManagerSD")) {
                                empPosition = "msd";
                            } else if (e.getPosition().equals("Stakeholder")) {
                                empPosition = "esh";
                            }

                        %>
                        <li class="notify-toggle-wrapper">
                            <a href="#" data-toggle="dropdown" class="toggle">
                                <i class="fa fa-bell"></i>
                                <%if (count != 0) { %>
                                <span class="badge badge-orange"><% out.print(count); %></span>
                                <%
                                    }
                                %>
                            </a>
                            <ul class="dropdown-menu notifications animated fadeIn">
                                <li class="total">
                                    <span class="small">
                                        You have <strong><% out.print(count); %></strong> new notifications.

                                    </span>
                                </li>
                                <li class="list">

                                    <ul class="dropdown-menu-list list-unstyled ps-scrollbar">
                                        <%

                                            Notification n;
                                            String status = null;
                                            for (int x = 0; x < notifications.size(); x++) {
                                                n = notifications.get(x);
                                                if (Notification.getStatus(n.getNotifino()).equals("comment")) {
                                                    status = n.getEmpname() + " commented on project - " + n.getPname();
                                                } else if (Notification.getStatus(n.getNotifino()).equals("project")) {
                                                    if (e.getPosition().equals("Business Analyist")) {
                                                        status = n.getEmpname() + " assigned you as the Business Analyist of the Project - " + n.getPname();
                                                    } else {
                                                        status = n.getEmpname() + " assigned you as the Project Manager of the Project - " + n.getPname();
                                                    }
                                                } else if (Notification.getStatus(n.getNotifino()).equals("srs")) {
                                                    status = n.getEmpname() + " uploaded the SRS of the Project - " + n.getPname();
                                                }

                                        %>
                                        <li class="unread available"> 
                                            <a href="../NotificationHandling?pno=<% out.print(n.getPno()); %>&direct=<% out.print(empPosition); %>&status=viewNoti&empid=<% out.print(e.getEmployeeid()); %>&notifino=<% out.print(n.getNotifino()); %>">
                                                <div class="notice-icon">
                                                    <img class="notification-icon" src="../GetIconByID?id=<%out.print(n.getEmpid());%>">
                                                </div>
                                                <div>
                                                    <span class="name">
                                                        <strong><% out.print(status); %> </strong>
                                                        <span class="time small"><% out.print(n.getDatentime()); %></span>
                                                    </span>
                                                </div>
                                            </a>
                                        </li>
                                        <%
                                            }
                                        %>
                                    </ul>

                                </li>

                                <li class="external">
                                    <a href="javascript:;">
                                        <span></span>
                                    </a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>		
                <div class='pull-right'>
                    <ul class="info-menu right-links list-inline list-unstyled">
                        <li class="profile">
                            <a href="#" data-toggle="dropdown" class="toggle">
                                <img src="../GetIconByID?id=<% out.print(e.getEmployeeid()); %>" alt="user-image" class="img-circle img-inline">
                                <span><% out.print(e.getEmployeename()); %> <i class="fa fa-angle-down"></i></span>
                            </a>
                            <ul class="dropdown-menu profile animated fadeIn">
                                <li>
                                    <a href="EditProfile.jsp">
                                        <i class="fa fa-wrench"></i>
                                        Settings
                                    </a>
                                </li>

                                <li class="last">
                                    <a href="../SignOut">
                                        <i class="fa fa-lock"></i>
                                        Logout
                                    </a>
                                </li>
                            </ul>
                        </li>

                    </ul>			
                </div>		
            </div>

        </div>
        <!-- END TOPBAR -->


        <!-- START CONTAINER -->
        <div class="page-container row-fluid">

            <!-- SIDEBAR - START -->
            <div class="page-sidebar ">


                <!-- MAIN MENU - START -->
                <div class="page-sidebar-wrapper" id="main-menu-wrapper"> 

                    <!-- USER INFO - START -->
                    <div class="profile-info row">

                        <div class="profile-image col-md-4 col-sm-4 col-xs-4">
                            <a href="#">
                                <img src="../GetIconByID?id=<% out.print(e.getEmployeeid()); %>" class="img-responsive img-circle">
                            </a>
                        </div>

                        <div class="profile-details col-md-8 col-sm-8 col-xs-8">

                            <h3>
                                <a href="#"><%out.print(e.getEmployeename());%></a>

                                <!-- Available statuses: online, idle, busy, away and offline -->
                                <span class="profile-status online"></span>
                            </h3>

                            <p class="profile-title"><%out.print(e.getPosition());%></p>
                            <p class="profile-title" style="color: #919191 6; "><%out.print(e.getDepartement());%></p>

                        </div>

                    </div>
                    <!-- USER INFO - END -->

