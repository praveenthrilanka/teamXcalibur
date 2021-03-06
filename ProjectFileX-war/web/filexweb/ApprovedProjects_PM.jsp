<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>


<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Project> pro = Project.getApprovedProjectByPMid((String) session.getAttribute("eid"));
    String arr1[] = {"bs-calltoaction bs-calltoaction-lightred", "bs-calltoaction bs-calltoaction-yellow", "bs-calltoaction bs-calltoaction-green", "bs-calltoaction bs-calltoaction-grey"};
    String arr2[] = {"btn btn-lg btn-block btn-lightred", "btn btn-lg btn-block btn-yellow", "btn btn-lg btn-block btn-green", "btn btn-lg btn-block btn-grey"};
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px; margin-left: 5%; display:inline-block;width:95%;padding:25px 0 0 15px;'>
        <div class="col-sm-10">
            <b><h2>Approved Projects</h2></b><br/>
            <%
                Project pr;
                String color;
                String borderColor;
                for (int x = 0; x < pro.size(); x++) {
                pr = pro.get(x);
                String currentStatus;
                
                 currentStatus = pr.getStatusByProject(pr.getProjectno(),(String) session.getAttribute("eid"));
                   if(currentStatus.equals("The project is approved")){
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
                            <label>Status</label><span style="padding:2.7em;">:</span><span style="padding:0em;"><% out.print(Project.getStatusByProject(pr.getProjectno(),(String) session.getAttribute("eid"))); %></span>
                        </div>
                    </div>
                    <div class="col-md-3 cta-button">
                        <a href="../SetUser?pno=<% out.print(pr.getProjectno()); %>&direct=ba" class="<% out.print(borderColor); %>">View Project</a>
                    </div>
                </div>
            </div>

            <% 
                }
            %>




        </div>


    </section>
</section>
<!-- END CONTENT -->



<%@ include file="Down.jsp" %>