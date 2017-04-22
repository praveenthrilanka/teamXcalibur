<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>


<!-- START CONTENT -->

<script src="js/jquery-1.11.2.min.js"></script>

<%
    String successmsg = request.getParameter("scs");
    System.out.println(successmsg);
    if (successmsg != null) {
        if (successmsg.equals("hold")) {
%>
<script type="text/javascript">
    $(document).ready(function () {
        $('#heldSuccess').modal('show');
    });
</script>
<%
} else if (successmsg.equals("continue")) {
%>
<script type="text/javascript">
    $(document).ready(function () {
        $('#continueSuccess').modal('show');
    });
</script>

<%
        }
    }
%>


<%
    String pos = Employee.getEmployee((String) session.getAttribute("eid")).getPosition();
    if (!(pos.equals("Project Manager") || pos.equals("PM/MSD"))) {
        response.sendRedirect("Login.jsp");
    }
%>


<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Project> pro = Project.getProjectByPMid((String) session.getAttribute("eid"));
    ArrayList<Project> Projectcount = Project.getOngoingProjectByPMid((String) session.getAttribute("eid"));
    ArrayList<Project> ProjectRejectedcount = Project.getRejectedProjectByPMid((String) session.getAttribute("eid"));
    ArrayList<Project> ProjectApprovedcount = Project.getApprovedProjectByPMid((String) session.getAttribute("eid"));
    String arr1[] = {"bs-calltoaction bs-calltoaction-lightred", "bs-calltoaction bs-calltoaction-yellow", "bs-calltoaction bs-calltoaction-green", "bs-calltoaction bs-calltoaction-grey","bs-calltoaction bs-calltoaction-orange"};
    String arr2[] = {"btn btn-lg btn-block btn-lightred", "btn btn-lg btn-block btn-yellow", "btn btn-lg btn-block btn-green", "btn btn-lg btn-block btn-grey","btn btn-lg btn-block btn-orange"};
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:6%; margin-left: 5%; display:inline-block;width:100%;padding:25px 0 0 15px;'>



        <div class="col-sm-10">
            <div class="market-updates">
                <a href="OngoingProjects_PM.jsp">
                    <div class="col-md-3 market-update-gd">
                        <div class="market-update-block clr-block-5">
                            <div class="col-md-6 market-update-left">
                                <h3><% out.print(Projectcount.size()); %></h3>
                                <h4>Ongoing Projects</h4>
                            </div>
                            <div class="col-md-4 market-update-right">
                                <i class="fa fa-eye"> </i>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                </a>
                
                <a href="RejectedProjects_PM.jsp">
                <div class="col-md-3 market-update-gd">
                    <div class="market-update-block clr-block-4">
                        <div class="col-md-6 market-update-left">
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
                
                <a href="ApprovedProjects_PM.jsp">
                    <div class="col-md-3 market-update-gd">
                        <div class="market-update-block clr-block-1">
                            <div class="col-md-6 market-update-left">
                                <h3><%out.print(ProjectApprovedcount.size());%></h3>
                                <h4>Approved Projects</h4>
                            </div>
                            <div class="col-md-4 market-update-right">
                                <i class="fa fa-file-text-o"> </i>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                    </div>
                </a>              
                <a href="HeldProjects.jsp">
                    <div class="col-md-3 market-update-gd">
                        <div class="market-update-block clr-block-6">
                            <div class="col-md-6 market-update-left">
                                <h3></h3>
                                <h4 style="position:absolute ; top:5em">Hold Projects</h4>
                            </div>
                            <div class="col-md-4 market-update-right">
                                <i class="fa fa-file-text-o"> </i>
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
                int a = 1;
                String color;
                String borderColor;
                for (int x = 0; x < pro.size(); x++) {
                pr = pro.get(x);
                String currentStatus;
                
                 currentStatus = pr.getStatusByProject(pr.getProjectno(),(String) session.getAttribute("eid"));
                 
                  if(currentStatus.equals("SRS is not uploaded yet")){ 
                    color = arr1[3];
                    borderColor = arr2[3];
                  }
                  else if(currentStatus.equals("Stakeholders are not assigned yet")){
                      color = arr1[0];
                      borderColor = arr2[0];
                  }
                  else if(currentStatus.substring(0,8).equals("Approval")){
                      color = arr1[1];
                      borderColor = arr2[1];
                  }
                  else if(currentStatus.substring(0,11).equals("Rejected by")){
                      color = arr1[4];
                      borderColor = arr2[4];
                      
                  }else if(currentStatus.equals("The project is approved")){
                      color = arr1[2];
                      borderColor = arr2[2];
                  }
                  else{
                      color = null;
                      borderColor = null;
                  }
            %>

            <div class="<% out.print(color); %>">
                <div class="row">
                    <div class="col-md-9 cta-contents">
                        <h4 class="cta-title"><% out.print(pr.getProjectname()); %></h4>
                        <div class="cta-desc">

                            <br/>
                            <label>Status</label><span style="padding:2.7em;">:</span><span style="padding:0em;"><% out.print(currentStatus); %></span>
                        </div>
                    </div>
                    <div class="col-md-3 cta-button">
                        <a href="../SetUser?pno=<% out.print(pr.getProjectno()); %>&direct=pm" class="<% out.print(borderColor); %>">View Project</a>
                        <div align="right" style="margin-top:3px;">
                            <a data-target="#holdModel<% out.print(a); %>" data-toggle="modal" href="#" class="<% out.print(borderColor); %>" style=" width: 65px;"><i class="fa fa-eye-slash icon-sm "></i></a>
                        </div></div>
                </div>
            </div>

            <!--Model starts-->
            <div class="modal fade" id="holdModel<% out.print(a); %>" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title">Are You Sure?</h4>
                        </div>   
                        <div class="modal-body">
                            Do you want to hold this project? Once the project is held, Stakeholders won't able to see the project. But still you can find the project
                            from 'Hold Projects'.
                        </div>
                        <div class="modal-footer">
                            <a href="../HoldProject?pno=<% out.print(pr.getProjectno()); %>&status=hold" class="btn btn-success" type="button" >Hold</a>
                            <a class="btn btn-success" type="button" data-dismiss="modal" >Cancel</a>
                        </div>
                    </div>
                </div>
            </div>
            <!--model End-->

            <%
                    
                    a++;
                }
            %>

            <div class="modal fade" id="heldSuccess" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title">Success</h4>
                        </div>   
                        <div class="modal-body">
                            The Project held successfully. You Can continue project whenever you want.
                        </div>
                        <div class="modal-footer">

                            <a class="btn btn-success" type="button" data-dismiss="modal" >Got It</a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="modal fade" id="continueSuccess" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title">Success</h4>
                        </div>   
                        <div class="modal-body">
                            The Project is continued successfully. Stakeholders can see the project now.
                        </div>
                        <div class="modal-footer">

                            <a class="btn btn-success" type="button" data-dismiss="modal" >Got It</a>
                        </div>
                    </div>
                </div>
            </div>

        </div>
    </section>
</section>
<!-- END CONTENT -->


<%@ include file="Down.jsp" %>