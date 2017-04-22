<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>

<%
            if (!Employee.getEmployee((String)session.getAttribute("eid")).getPosition().equals("Business Analyist"))
            {
                response.sendRedirect("Login.jsp");
            }
%>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Project> pro = Project.getProjectByBAid((String) session.getAttribute("eid"));
    ArrayList<Project> Projectcount = Project.getOngoingProjectByBAid((String) session.getAttribute("eid"));
    ArrayList<Project> ProjectRejectedcount = Project.getRejectedProjectByBAid((String) session.getAttribute("eid"));
    ArrayList<Project> ProjectApprovedcount = Project.getApprovedProjectByBAid((String) session.getAttribute("eid"));
    String arr1[] = {"bs-calltoaction bs-calltoaction-red", "bs-calltoaction bs-calltoaction-yellow", "bs-calltoaction bs-calltoaction-green", "bs-calltoaction bs-calltoaction-grey"};
    String arr2[] = {"btn btn-lg btn-block btn-red", "btn btn-lg btn-block btn-yellow", "btn btn-lg btn-block btn-green", "btn btn-lg btn-block btn-grey"};
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:6%; margin-left: 5%; display:inline-block;width:100%;padding:25px 0 0 15px;'>


<!--Ongoing Projects Count-->
        <div class="col-sm-10">
            <div class="market-updates">
                <a href="OngoingProjects.jsp">
                    <div class="col-md-4 market-update-gd">
                        <div class="market-update-block clr-block-5">
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

<!--Approved Projects Count-->                                
                <a href="ApprovedProjects.jsp">
                    <div class="col-md-4 market-update-gd">
                        <div class="market-update-block clr-block-1" >
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

<!--Rejected Project Count -->                                
                <a href="RejectedProjects.jsp">
                    <div class="col-md-4 market-update-gd">
                        <div class="market-update-block clr-block-4">
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
                String color;
                String borderColor;
                for (int x = 0; x < pro.size(); x++) {
                pr = pro.get(x);
                String currentStatus;
                
                 currentStatus = pr.getStatusByProject(pr.getProjectno(),(String) session.getAttribute("eid"));
                 
                  if(currentStatus == "SRS is not uploaded yet"){ 
                    color = arr1[0];
                    borderColor = arr2[0];
                  }
                  else if(currentStatus == "Stakeholders are not assigned yet"){
                      color = arr1[3];
                      borderColor = arr2[3];
                  }
                  else if(currentStatus.substring(0,8).equals("Approval")){
                      color = arr1[1];
                      borderColor = arr2[1];
                  }
                  else if(currentStatus.substring(0,11).equals("Rejected by")){
                      color = arr1[0];
                      borderColor = arr2[0];
                      
                  }else if(currentStatus == "The project is approved"){
                      color = arr1[2];
                      borderColor = arr2[2];
                  }
                  else{
                      color = null;
                      borderColor = null;
                  }
                  
            %>
            
                 
                 
                 
            
           

<!--Display Project List-->            
            <div class="<%out.print(color);%>"> <!-- color -->
                <div class="row">
                    <div class="col-md-9 cta-contents">
                        <h4 class="cta-title"><% out.print(pr.getProjectname()); %></h4>
                        <div class="cta-desc">
                            
                            <br/>
                            <label>Status</label><span style="padding:2.7em;">:</span><span style="padding:0em;"><% out.print(Project.getStatusByProject(pr.getProjectno(),(String) session.getAttribute("eid"))); %></span>
                        </div>
                    </div>
                    <div class="col-md-3 cta-button">
                        <a href="../SetUser?pno=<% out.print(pr.getProjectno()); %>&direct=ba" class="<%out.print(borderColor); %>">View Project</a> <!--color-->
                    </div>
                </div>
            </div>

            <%;
                }
            %>

        </div>
            
             <script>
                    
                      history.pushState(null,null,document.URL);
                window.addEventListener('popstate',function(){
                    history.pushState(null,null,document.URL);
                    
                });
                
               </script>

    </section>
</section>
<!-- END CONTENT -->


<%@ include file="Down.jsp" %>