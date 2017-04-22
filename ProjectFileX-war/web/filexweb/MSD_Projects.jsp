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

    String arr1[] = {"bs-calltoaction bs-calltoaction-lightred", "bs-calltoaction bs-calltoaction-yellow", "bs-calltoaction bs-calltoaction-green", "bs-calltoaction bs-calltoaction-grey", "bs-calltoaction bs-calltoaction-orange"};
    String arr2[] = {"btn btn-lg btn-block btn-lightred", "btn btn-lg btn-block btn-yellow", "btn btn-lg btn-block btn-green", "btn btn-lg btn-block btn-grey", "btn btn-lg btn-block btn-orange"};
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

                    currentStatus = p.getStatusByProject(p.getProjectno(), (String) session.getAttribute("eid"));

                    if (currentStatus.equals("SRS is not uploaded yet")) {
                        color = arr1[3];
                        borderColor = arr2[3];
                    } else if (currentStatus.equals("Stakeholders are not assigned yet")) {
                        color = arr1[4];
                        borderColor = arr2[4];
                    } else if (currentStatus.substring(0, 8).equals("Approval")) {
                        color = arr1[1];
                        borderColor = arr2[1];
                    } else if (currentStatus.substring(0, 11).equals("Rejected by")) {
                        color = arr1[0];
                        borderColor = arr2[0];

                    } else if (currentStatus.equals("The project is approved")) {
                        color = arr1[2];
                        borderColor = arr2[2];
                    } else {
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
                        </div> 
                    </div>
                </div>
            </div>

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