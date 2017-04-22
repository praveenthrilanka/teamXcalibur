<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>



<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<script src="js/jquery-1.11.2.min.js"></script>


</style>

<%
    ArrayList<Project> project = Project.getProjectByMsdId((String) session.getAttribute("eid"));

     String arr1[] = {"bs-calltoaction bs-calltoaction-lightred", "bs-calltoaction bs-calltoaction-yellow", "bs-calltoaction bs-calltoaction-green", "bs-calltoaction bs-calltoaction-grey","bs-calltoaction bs-calltoaction-orange"};
    String arr2[] = {"btn btn-lg btn-block btn-lightred", "btn btn-lg btn-block btn-yellow", "btn btn-lg btn-block btn-green", "btn btn-lg btn-block btn-grey","btn btn-lg btn-block btn-orange"};
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:6%; margin-left: 5%; display:inline-block;width:100%;padding:25px 0 0 15px;'>
            <div class="col-sm-8"></div>  
            <div class="col-sm-4">
            <a href="Project_Summary.jsp"><button type="button" class="btn btn-purple btn-corner" ><i class="fa fa-search"></i><span> Search Projects</span></button></a>

            </div>            <br/>
        <div class="col-sm-10">

            <%
                Project p;
               String color;
                String borderColor;
                for (int x = 0; x < project.size(); x++) {
                p = project.get(x);
                String currentStatus;
                
                 currentStatus = p.getStatusByProject(p.getProjectno(),(String) session.getAttribute("eid"));
                 
                  if(currentStatus.equals("SRS is not uploaded yet")){ 
                    color = arr1[3];
                    borderColor = arr2[3];
                  }
                  else if(currentStatus.equals("Stakeholders are not assigned yet")){
                      color = arr1[4];
                      borderColor = arr2[4];
                  }
                  else if(currentStatus.substring(0,8).equals("Approval")){
                      color = arr1[1];
                      borderColor = arr2[1];
                  }
                  else if(currentStatus.substring(0,11).equals("Rejected by")){
                      color = arr1[0];
                      borderColor = arr2[0];
                      
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
                        <h4 class="cta-title"><% out.print(p.getProjectname()); %></h4>
                        <div class="cta-desc">
                            <br/>
                            <label>Status</label><span style="padding:2.7em;">:</span><span style="padding:0em;"><% out.print(currentStatus); %></span>
                        </div>
                    </div>
                    <div class="col-md-3 cta-button">
                        <div align="right">
                            <a href="../SetUser?pno=<% out.print(p.getProjectno()); %>&direct=msd" class="<% out.print(borderColor); %>">View Project</a>

                            <a  data-toggle="modal" data-target="#ultraModal<%out.print(p.getProjectno());%> "title="Delete Project"class="<% out.print(borderColor); %>" align="right" style="height: 40px; width: 20px;"><img src="images/projectbin.png" width="18px" height="18px"/></a>
                        </div> 
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
                            <div align="right">
                                <button data-dismiss="modal" class="btn btn-default" type="button">No</button>
                                <button  id="modalbutton" class="btn btn-success" onclick="showDiv()" >Yes</button>
                            </div>
                            <script>
                                function showDiv() {  //  display the input of the admin's password

                                    document.getElementById('div_pass').style.display = 'block';
                                }
                            </script>
                            <form name="admispass" action="../DelProject" method="post">

                                <div id="div_pass" style="display:none">
                                    </br>
                                    <div id="adminpass">
                                        <label>Enter the Administrator password :</label> 
                                        <input type="password" id="adminpass" name="adminpw" placeholder="Password here.." required=""/>
                                        <input type="hidden" name="pno" value="<%out.print(p.getProjectno());%>"/>

                                    </div> 
                                    <br /> 
                                </div>

                        </div>


                        <div class="modal-footer">
                            <button data-dismiss="modal" class="btn btn-default" type="button">Cancel</button>
                            <input   type="submit" value="Delete" class="btn btn-warning"/>
                        </div>
                        </form>

                    </div>
                </div>
            </div>



            <!--model End-->
            <%
                   
                }
            %>

        </div>

        <script>




            $(document).ready(fuction()
            {
                $('.clickme').click(function (e) {
                    e.preventDefault()


                });

            }
            );


        </script>
        <!--Model starts-->



    </section>
</section>
<!-- END CONTENT -->



<%@ include file="Down.jsp" %>