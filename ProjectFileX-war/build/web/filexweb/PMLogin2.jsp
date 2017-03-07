<%@page import="org.sampath.filex.web.actions.DateString"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>


<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css'/>

      
        <%
            session=request.getSession(false);
        ArrayList<Project> project=null;
            
        project=Project.getProjectByPMid(request.getParameter("eid"));
        
        System.out.println("Output test2");
        %>
        
       
    <section id="main-content" class=" ">
        <section class="wrapper" style="margin-top:60px;display:inline-block;width:100%;padding:15px 0 0 15px;">

        <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
            <div class="page-title">

                <div class="pull-left">
                    <h1 class="title">View Assigned Projects</h1>                           
                </div>

            </div>
        </div>
        <div class="clearfix"></div>
        
        <section class="box ">
                            
            <div class="content-body">    
                <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">



                   
        <table id="example-1" class="table table-striped dt-responsive display dataTable dtr-inline" cellspacing="0" width="100%" role="grid" aria-describedby="example-1_info" style="width: 100%;">

            <thead>

                <tr role="row">

                    <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 291px;">Project Name</th>
                    <th class="sorting" tabindex="0" rowspan="1" colspan="1" style="width: 160px;">Date Created</th>

                </tr>
            </thead>

           
        
        <%
        Project pr;    
        for(int x=0;x<project.size();x++){
        
        pr=project.get(x);
        %>
      
       <tr>
       <td> <% out.print(pr.getProjectno()); %></td>        
       <td><% out.print(pr.getProjectname()); %></td>            
       <td><% out.print(pr.getDatentime()); %></td>            
 
       </tr>
       <% }%>
       </table>
       </div>
                    </div>
                </div>
        </div>
    </section></div>

</section>
</section>




<%@ include file="Down.jsp" %>


