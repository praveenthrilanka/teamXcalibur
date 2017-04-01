
<%@page import="org.sampath.filex.web.actions.SRS"%>
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>

<!-- START CONTENT -->
<%      
            String msd=request.getParameter("msd");
            String pm=request.getParameter("pm");
            String ba=request.getParameter("ba");
            String drange=request.getParameter("drange");
            String sts=request.getParameter("status");
            System.out.println("Hello HTere********************************************************");
            System.out.println("THIS IS CHECK IGNORE THIS msd "+msd+"PM"+pm+"ba"+ba+"drange"+drange+sts);
            ArrayList<Project> pro=Project.getProjectSummary(msd, pm, ba, drange);
            Project p;
%>

<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>

        <div class="clearfix"></div>
        <div class="col-lg-12">
            
                        <section class="box ">

                            <div class="content-body">    
                                <div class="row">
                                    <div class="col-md-12 col-sm-12 col-xs-12">

                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th>No</th>
                                                    <th>Project Name</th>
                                                    <th>Status</th>
                                                    <th>Created Date</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <%
                                                    for(int x=0;x<pro.size();x++)
                                                    {
                                                        p=pro.get(x);
                                                        String projectStatus=SRS.getProjectStatusByStakeholder(p.getProjectno());
                                                        if(!sts.equals("all"))
                                                        {
                                                            if(!sts.equals(projectStatus))
                                                            continue;
                                                        }
                                                %>
                                                <tr>
                                                    <th scope="row"><% out.print(x+1); %></th>
                                                    <td><% out.print(p.getProjectname()); %></td>
                                                    <td><% out.print(projectStatus); %></td>
                                                    <td><% out.print(p.getDatentime()); %></td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                            </tbody>
                                        </table>

                                    </div>
                                </div>
                        </section>
                    </div>

            </section>
    </section>






<%@ include file="Down.jsp" %>