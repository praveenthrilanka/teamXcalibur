<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Employee"%>
<%@ include file="Up.jsp" %>
<%@ include file="Admin_Sidebar.jsp" %>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Employee> employee = Employee.getEmployee();
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="page-title">

                <div class="pull-left">
                    <h1 class="title">Users</h1>                            
                </div>
            </div>
        </div>
        <div class="clearfix"></div>
        <div class="col-lg-12">
            <section class="box ">
                <header class="panel_header">
                    <h2 class="title pull-left">Our Team</h2>
                </header>
                <div class="content-body">    
                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="row">
                                <div class="col-md-2 col-sm-2 col-xs-2"></div>
                                <div class="col-md-8 col-sm-8 col-xs-8">
                                    <div class="input-group primary">
                                        <span class="input-group-addon">                
                                            <span class="arrow"></span>
                                            <i class="fa fa-search"></i>
                                        </span>
                                        <input type="text" class="form-control search-page-input" placeholder="Search" value="">
                                    </div>
                                </div>
                                <div class="col-md-2 col-sm-2 col-xs-2"></div>
                            </div>
                            <br/>
                            <div class="row">


                                <%
                                    Employee emp;
                                    for (int x = 0; x < employee.size(); x++) {
                                        emp = employee.get(x);
                                %>
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" width="200px" height="200px" src="../GetIconByID?id=<%out.print(emp.getEmployeeid());%>" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h4><% out.print(emp.getEmployeename()); %></h4>
                                            <span style="color:black">User ID : </span><span><%out.print(emp.getEmployeeid());%></span><br/>
                                            <span><% out.print(emp.getPosition()); %></span><br/>
                                            <span><% out.print(emp.getEmail()); %></span><br/>    

                                        </div>
                                        <p><% out.print(emp.getDepartmentid()); %></p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp?id=<%out.print(emp.getEmployeeid());%>&email=<%out.print(emp.getEmail());%>"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>       
                                </div>
                                <%
                                    }
                                %>


                            </div>


                        </div>
                    </div>
                </div>
            </section></div>
    </section></section>

<!-- END CONTENT -->



<%@ include file="Down.jsp" %>