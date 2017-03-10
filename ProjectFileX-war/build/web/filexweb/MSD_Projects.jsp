<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>


<!-- START CONTENT -->
            
            <link href="css/stylesba.css" rel='stylesheet' type='text/css' />
            <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
            
            <%

       
            ArrayList<Project> project=Project.getProjectByMsdId((String)session.getAttribute("eid"));

                
            String arr1[]={"bs-calltoaction bs-calltoaction-warning","bs-calltoaction bs-calltoaction-primary","bs-calltoaction bs-calltoaction-info","bs-calltoaction bs-calltoaction-success"};
            String arr2[]={"btn btn-lg btn-block btn-warning","btn btn-lg btn-block btn-primary","btn btn-lg btn-block btn-info","btn btn-lg btn-block btn-success"};
            %>
            
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:6%; margin-left: 5%; display:inline-block;width:100%;padding:25px 0 0 15px;'>
                   
                    
            <div class="col-sm-10">

                 <%
                    Project p; 
                    int c=0;
                    for(int x=0;x<project.size();x++){
                    c=c%4; 
                    p=project.get(x);
                 %>
                
                <div class="<% out.print(arr1[c]); %>">
                    <div class="row">
                        <div class="col-md-9 cta-contents">
                            <h4 class="cta-title"><% out.print(p.getProjectname()); %></h4>
                            <div class="cta-desc">
                                <br/>
                                <label>Status</label><span style="padding:2.7em;">:</span><span style="padding:0em;"><% out.print(Project.getStatusByProject(p.getProjectno(),(String) session.getAttribute("eid"))); %></span>
                            </div>
                        </div>
                        <div class="col-md-3 cta-button">
                            <a href="../SetUser?pno=<% out.print(p.getProjectno()); %>&direct=msd" class="<% out.print(arr2[c]); %>">View Project</a>
                            <a data-toggle="modal" data-target="#ultraModal<%out.print(p.getProjectno() );%> "title="Delete User" class="<% out.print(arr2[c]); %>">Delete Project</a>

                        </div>
                     </div>
                </div>
              
            
                   <!--model begins-->          
               <div class="modal fade" id="ultraModal<%out.print(p.getProjectno());%>" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                                            <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                                        <h4 class="modal-title">Are you sure you want to delete?</h4>
                                                    </div>
                                                    <div class="modal-body">
                                                        Once a project is deleted, you will not be able to recover it.
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                                                        <a  href="../DelProject?pno=<%out.print(p.getProjectno());%>" class="btn btn-success">Delete</a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <!--model End-->
                 <% c++; 
             }
             %>

            </div>
             
             <script>
                 
                 $(document).ready(fuction()
                 {
                     $('.clickme').click(function(e){
                         e.preventDefault()
                             
                
                     });
                    
                   });
                  
                 
             </script>
                                               <!--Model starts-->

                                         
             
                </section>
            </section>
            <!-- END CONTENT -->
            
            

<%@ include file="Down.jsp" %>