
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

<style type="text/css">

@media all {
	.page-break	{ display: none; }
}    
    
@media print{
  body{ background-color:#FFFFFF; background-image:none; color:#000000 ;position: absolute; top: 0; left: 0;}
  .page-sidebar { display:none;}
  .page-topbar { display:none;}
  .page-title { display:none;}
  .box{ position: absolute; width:100%; height: 100%; position:fixed;
    padding:0;
    margin:0;

    top:0;
    left:0;

    width: 100%;
    height: 100%;}
  .content-body{position: absolute;left:0;}
  .page-break	{ display: block; page-break-before: always; }
}
</style>


<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>

        <div class="clearfix"></div>
        <div class="col-lg-12">
            
                        <section class="box ">

                            <div class="content-body">    
                                <div class="row">
                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                       <% if(pro.size()==0){ %>
                                       <h4 align="center">No Search Results Found</h4>
                                       <%}else{%>
                                       
                                        <table class="table table-striped">
                                            <thead>
                                                <tr>
                                                    <th>No</th>
                                                    <th>Project Name</th>
                                                    <th>Status</th>
                                                    <th>MSD ID</th>
                                                    <th>PM ID</th>
                                                    <th>BA ID</th>
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
                                                    <td><a href="Version_History_Summary.jsp?pno=<% out.print(p.getProjectno()); %>"><% out.print(p.getProjectname()); %></a></td>
                                                    <td><% out.print(Project.getStatusByProjectForSummary(p.getProjectno())); %></td>
                                                    <td><% out.print(p.getMsdid()); %></td>
                                                    <td><% out.print(p.getPmid()); %></td>
                                                    <td><% out.print(p.getBaid()); %></td>
                                                    <td><% out.print(p.getDatentime()); %></td>
                                                </tr>
                                                <%
                                                    }
                                                %>
                                            </tbody>
                                        </table>
                                            <%}%>

                                    </div>
                                </div>
                        </section>
                    </div>

            </section>
    </section>






<%@ include file="Down.jsp" %>