<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>


<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Project> pro = Project.getProjectByBAid((String) session.getAttribute("eid"));
    ArrayList<Project> Projectcount = Project.getOngoingProjectByBAid((String) session.getAttribute("eid"));
    ArrayList<Project> ProjectRejectedcount = Project.getRejectedProjectByBAid((String) session.getAttribute("eid"));
    ArrayList<Project> ProjectApprovedcount = Project.getApprovedProjectByBAid((String) session.getAttribute("eid"));
    String arr1[] = {"bs-calltoaction bs-calltoaction-warning", "bs-calltoaction bs-calltoaction-primary", "bs-calltoaction bs-calltoaction-info", "bs-calltoaction bs-calltoaction-success"};
    String arr2[] = {"btn btn-lg btn-block btn-warning", "btn btn-lg btn-block btn-primary", "btn btn-lg btn-block btn-info", "btn btn-lg btn-block btn-success"};
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:6%; margin-left: 5%; display:inline-block;width:100%;padding:25px 0 0 15px;'>



        <div class="col-sm-10">
            <div class="market-updates">
                <a href="OngoingProjects.jsp">
                    <div class="col-md-4 market-update-gd">
                        <div class="market-update-block clr-block-1">
                            <div class="col-md-8 market-update-left">
                                <h3><% out.print(Projectcount.size()); %></h3>
                                <h4>Ongoing Projects</h4>
                            </div>
                            <div class="col-md-4 market-update-right">
                                <i class="fa fa-file-text-o"> </i>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                </a>
                <a href="ApprovedProjects.jsp">
                    <div class="col-md-4 market-update-gd">
                        <div class="market-update-block clr-block-2">
                            <div class="col-md-8 market-update-left">
                                <h3><%out.print(ProjectApprovedcount.size());%></h3>
                                <h4>Approved Projects</h4>
                            </div>
                            <div class="col-md-4 market-update-right">
                                <i class="fa fa-eye"> </i>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                </a>  
                    <a href="RejectedProjects.jsp">
                    <div class="col-md-4 market-update-gd">
                        <div class="market-update-block clr-block-3">
                            <div class="col-md-8 market-update-left">
                                <h3><%out.print(ProjectRejectedcount.size());%></h3>
                                <h4>Rejected Projects</h4>
                            </div>
                            <div class="col-md-4 market-update-right">
                                <i class="fa fa-eye"> </i>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                </a>            
                <div class="clearfix"> </div>
                <br/>
            </div>

            <%
                Project pr;
                int c = 0;
                for (int x = 0; x < pro.size(); x++) {
                    c = c % 4;
                    pr = pro.get(x);
            %>

            <div class="<% out.print(arr1[c]); %>">
                <div class="row">
                    <div class="col-md-9 cta-contents">
                        <h4 class="cta-title"><% out.print(pr.getProjectname()); %></h4>
                        <div class="cta-desc">
                            
                            <br/>
                            <label>Status</label><span style="padding:2.7em;">:</span><span style="padding:0em;"><% out.print(Project.getStatusByProject(pr.getProjectno(),(String) session.getAttribute("eid"))); %></span>
                        </div>
                    </div>
                    <div class="col-md-3 cta-button">
                        <a href="../SetUser?pno=<% out.print(pr.getProjectno()); %>&direct=ba" class="<% out.print(arr2[c]); %>">View Project</a>
                    </div>
                </div>
            </div>

            <% c++;
                }
            %>

        </div>
    </section>
</section>
<!-- END CONTENT -->


<%@ include file="Down.jsp" %>