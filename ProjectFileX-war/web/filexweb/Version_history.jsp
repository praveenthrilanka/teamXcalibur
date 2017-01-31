<%@page import="org.sampath.filex.web.actions.Stakeholder"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="Admin_Sidebar.jsp" %>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="page-title">

                <div class="pull-left">
                    <h1 class="title">Version History</h1>                            
                </div>
            </div>
        </div>
        <%
            session=request.getSession();
            String pno=(String)session.getAttribute("pno");
            Project p=Project.getProject(pno);
            
            Employee ba=Employee.getEmployee(p.getBaid());
            Employee msd=Employee.getEmployee(p.getMsdid());
            Employee pm=Employee.getEmployee(p.getPmid());
           
        
        %>
        
        
        <div class="clearfix"></div>
        <div class="col-lg-12">
            <section class="box ">
                <header class="panel_header">
                    <h2 class="title pull-left"><% out.print(p.getProjectname()); %></h2>
                </header>
                <div class="content-body">    
                    <div class="row">
                        <div class="col-md-1 col-sm-1 col-xs-1"></div>
                        <div class="col-md-11 col-sm-11 col-xs-11">

                            <div class="uprofile_wall_posts col-md-12 col-sm-12 col-xs-12">
                                <div class="pic-wrapper col-md-1 col-sm-1 col-xs-2 text-center">
                                    <img src="images/person-4.jpg" class="" alt="">
                                </div>
                                <div class="info-wrapper col-md-11 col-sm-11 col-xs-10">					
                                    <div class="username">
                                        <span>Manager SD </span><span class="bold"><% out.print(msd.getEmployeename()); %></span> Created the Project <span class="bold"><% out.print(p.getProjectname()); %></span>	
                                    </div>
                                    <div class="info text-muted">
                                        <span>Assigned Project Manager : </span><span class="bold"><% out.print(pm.getEmployeename()); %></span><br/>
                                        <span>Assigned Business Analyst : </span><span class="bold"><% out.print(ba.getEmployeename()); %></span>
                                    </div>	
                                    <div class="info-details">
                                        <ul class="list-unstyled list-inline">
                                            <li><a href="#" class="text-muted"><% out.print(p.getDatentime()); %></a></li>
                                            <li><a href="#" class="text-muted"><i class="fa fa-comment"></i> 584</a></li>
                                            <li><a href="#" class="text-orange"><i class="fa fa-heart"></i> 12k</a></li>
                                            <li><a href="#" class="text-info"><i class="fa fa-reply"></i> Reply</a></li>
                                            <li><a href="#" class="text-warning"><i class="fa fa-star"></i> Favourite</a></li>
                                            <li><a href="#" class="text-muted">More</a></li>
                                        </ul>

                                    </div>
                                    <div class="clearfix"></div>
                                    
                                    <div class="clearfix"></div>
                                    <div class="comment">
                                        <div class="pic-wrapper col-md-1 col-sm-1 col-xs-2 text-center">
                                            <img data-src-retina="images/person-4.jpg" data-src="images/person-4.jpg" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="info-wrapper col-md-11 col-sm-11 col-xs-10">					
                                            <div class="username">
                                                <span>Project Manager </span><span class="bold"><% out.print(pm.getEmployeename()); %></span> <span>Approved</span><span> the document</span> <!-- approved or Reject if approved view the stake holders-->
                                            </div>
                                            <div class="info text-muted">
                                                <span class="bold">Added Stakeholders</span><br/>
                                                
                                                <%
                                                 ArrayList<Stakeholder> s=Stakeholder.getStakeholders(pno, "1");
                                                Stakeholder sh;
                                                for(int x=0;x<s.size();x++){
                                                    sh=s.get(x);
                                                %>
                                                
                                                <span><% out.print(sh.getName()); %> (<% out.print(sh.getDepartment()); %>)</span><br/>
                                                <% } %>
                                            </div>	
                                            <div class="info-details">
                                                <ul class="list-unstyled list-inline">
                                                    <li><a href="#" class="text-muted">8 Minutes ago</a></li>
                                                    <li><a href="#" class="text-orange"><i class="fa fa-heart"></i> Liked</a></li>
                                                    <li><a href="#" class="text-muted">More</a></li>
                                                </ul>
                                            </div>

                                        </div>	
                                        <div class="clearfix"></div>						
                                    </div>
                                    
                                    <div class="comment">
                                        <div class="pic-wrapper col-md-1 col-sm-1 col-xs-2 text-center">
                                            <img data-src-retina="images/person-4.jpg" data-src="images/person-4.jpg" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="info-wrapper col-md-11 col-sm-11 col-xs-10">					
                                            <div class="username">
                                                <span>Business Analyst </span><span class="bold"><% out.print(ba.getEmployeename()); %></span> <span>Uploaded the</span> <span class="bold">SRS</span>
                                            </div>
                                            <div class="info text-muted">
                                                <span class="bold">SRS Version : </span><span class="bold">1</span>
                                            </div>	
                                            <div class="info-details">
                                                <ul class="list-unstyled list-inline">
                                                    <li><a href="#" class="text-muted">10 Minutes ago</a></li>
                                                    <li><a href="#" class="text-orange"><i class="fa fa-heart-o"></i> Like</a></li>
                                                    <li><a href="#" class="text-muted">More</a></li>
                                                </ul>
                                            </div>

                                        </div>	
                                        <div class="clearfix"></div>						
                                    </div>
                                    
                                    <div class="clearfix"></div>
                                    <div class="comment">
                                        <div class="pic-wrapper col-md-1 col-sm-1 col-xs-2 text-center">
                                            <img data-src-retina="images/person-4.jpg" data-src="images/person-4.jpg" src="images/person-4.jpg" alt="">
                                        </div>
                                        <div class="info-wrapper col-md-11 col-sm-11 col-xs-10">					
                                            <div class="username">
                                                <span>Ext. Stakeholder </span><span class="bold">Amarasiri Peris (IT Systems)</span> <span>Approved</span> <span>the Document</span>
                                            </div>
                                            <div class="info text-muted">
                                                <span class="bold">Comment : </span><span>Test comment</span>
                                            </div>	
                                            <div class="info-details">
                                                <ul class="list-unstyled list-inline">
                                                    <li><a href="#" class="text-muted">10 Minutes ago</a></li>
                                                    <li><a href="#" class="text-orange"><i class="fa fa-heart-o"></i> Like</a></li>
                                                    <li><a href="#" class="text-muted">More</a></li>
                                                </ul>
                                            </div>

                                        </div>	
                                        <div class="clearfix"></div>						
                                    </div>
                                   
                                    <div class="clearfix"></div>	

                                </div>
                            </div>
                        </div>
                        </section></div>
            </section></section>

    <!-- END CONTENT -->



    <%@ include file="Down.jsp" %>