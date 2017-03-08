<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>


<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<%
    ArrayList<Project> pro = Project.getOngoingProjectByBAid((String) session.getAttribute("eid"));
    String arr1[] = {"bs-calltoaction bs-calltoaction-warning", "bs-calltoaction bs-calltoaction-primary", "bs-calltoaction bs-calltoaction-info", "bs-calltoaction bs-calltoaction-success"};
    String arr2[] = {"btn btn-lg btn-block btn-warning", "btn btn-lg btn-block btn-primary", "btn btn-lg btn-block btn-info", "btn btn-lg btn-block btn-success"};
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:6%; margin-left: 5%; display:inline-block;width:100%;padding:25px 0 0 15px;'>



        <div class="col-sm-10">
            <b><h2>Ongoing Projects</h2></b><br/>
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
                            <label>Project ID</label><span style="padding:1em;">:</span><span style="padding:1.8em;"><% out.print(pr.getProjectno()); %></span>
                            <br/>
                            <label>Status</label><span style="padding:2.7em;">:</span><span style="padding:0em;">Pending</span>
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