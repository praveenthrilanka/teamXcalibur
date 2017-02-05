<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="Admin_Sidebar.jsp" %>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Employee> employee = Employee.getProjectByPMid((String) session.getAttribute("eid"));

    String arr1[] = {"bs-calltoaction bs-calltoaction-warning", "bs-calltoaction bs-calltoaction-primary", "bs-calltoaction bs-calltoaction-info", "bs-calltoaction bs-calltoaction-success"};
    String arr2[] = {"btn btn-lg btn-block btn-warning", "btn btn-lg btn-block btn-primary", "btn btn-lg btn-block btn-info", "btn btn-lg btn-block btn-success"};
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
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h3>Iraj Weerarathna</h3>
                                            <span>Engineering</span>
                                        </div>
                                        <p>Building amazing and powerful tools is our motto.</p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h3>Malith Perera</h3>
                                            <span>Design Manager</span>
                                        </div>
                                        <p>Building amazing and powerful tools is our motto.</p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h3>Dasun Viduranga</h3>
                                            <span>Designer</span>
                                        </div>
                                        <p>Building amazing and powerful tools is our motto.</p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h3>Saman Gamage</h3>
                                            <span>UI/UX</span>
                                        </div>
                                        <p>Building amazing and powerful tools is our motto.</p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h3>Bathiya Jayakodi</h3>
                                            <span>Engineering</span>
                                        </div>
                                        <p>Building amazing and powerful tools is our motto.</p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h3>Sadun Perera</h3>
                                            <span>Design Manager</span>
                                        </div>
                                        <p>Building amazing and powerful tools is our motto.</p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h3>Lahiru Perera</h3>
                                            <span>Designer</span>
                                        </div>
                                        <p>Building amazing and powerful tools is our motto.</p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="col-sm-4 col-md-3">
                                    <div class="team-member ">
                                        <div class="team-img">
                                            <img class="img-responsive" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="team-info">
                                            <h3>Chilli Thilanka</h3>
                                            <span>UI/UX</span>
                                        </div>
                                        <p>Building amazing and powerful tools is our motto.</p>
                                        <ul class="social-icons list-inline list-unstyled">
                                            <li><a href="Admin_edit_user.jsp"><i class="fa fa-gear icon-bordered icon-primary icon-xs"></i></a></li>
                                            <li><a href="#"><i class="fa fa-trash-o icon-bordered icon-primary icon-xs"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </section></div>
    </section></section>

<!-- END CONTENT -->



<%@ include file="Down.jsp" %>