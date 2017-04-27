<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>


<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Project> pro = Project.getHeldProjectByPMid((String) session.getAttribute("eid"));
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px; margin-left: 5%; display:inline-block;width:95%;padding:25px 0 0 15px;'>

        <div class="col-sm-10">
            <b><h2>Hold Projects</h2></b><br/>
            <%
                Project pr;
                int a = 1;
                for (int x = 0; x < pro.size(); x++) {
                    
                    pr = pro.get(x);
            %>

            <div class="bs-calltoaction bs-calltoaction-info">
                <div class="row">
                    <div class="col-md-9 cta-contents">
                        <h4 class="cta-title"><% out.print(pr.getProjectname()); %></h4>
                        <div class="cta-desc">
                            <br/>
                            <label>Status</label><span style="padding:2.7em;">:</span><span style="padding:0em;"><% out.print(Project.getStatusByProject(pr.getProjectno(), (String) session.getAttribute("eid"))); %></span>
                        </div>
                    </div>
                    <div class="col-md-3 cta-button">
                        <a href="../SetUser?pno=<% out.print(pr.getProjectno()); %>&direct=pm" class="btn btn-lg btn-block btn-info">View Project</a>

                        <div align="right" style="margin-top:3px;">
                            <a data-target="#continueModel<% out.print(a); %>" data-toggle="modal" href="#" class="btn btn-lg btn-block btn-info" style=" width: 65px;"><i class="fa fa-eye icon-sm "></i></a>
                        </div></div>
                    </div>
                </div>
            

            <!--Model starts-->
            <div class="modal fade" id="continueModel<% out.print(a); %>" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                            <h4 class="modal-title">Are You Sure?</h4>
                        </div>   
                        <div class="modal-body">
                            Do you want to continue this project? Once the project is continued, Stakeholders will be able to see the project.
                        </div>
                        <div class="modal-footer">
                            <a href="../HoldProject?pno=<% out.print(pr.getProjectno()); %>&status=continue" class="btn btn-success" type="button" >Continue</a>
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



            </div>
        </div>


    </section>
</section>
<!-- END CONTENT -->



<%@ include file="Down.jsp" %>