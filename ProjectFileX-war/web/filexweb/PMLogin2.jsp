<%-- 
    Document   : PMLogin
    Created on : Dec 15, 2016, 2:40:56 PM
    Author     : Erandi
--%>
<%@page import="org.sampath.filex.web.actions.DateString"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Project"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/ManualCSS.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        <style>
            body {
            background-image: url("SampathBack.jpg");
            background-repeat: no-repeat;
            background-size: 100% auto;
            }
            
            td{
                padding:15px;
            }
        </style>
        
        <%
            session=request.getSession(false);
        ArrayList<Project> project=null;
            
        project=Project.getProjectByPMid(request.getParameter("eid"));
        
        System.out.println("Output test2");
        %>
        
       
    </head>
    <body>
       
         <div style="text-align:center;  margin: auto;width: 50%; position: absolute;top: 10%; left: 20%;  padding: 10px">
              <h2>Currently Assigned Projects</h2> 
        </div>
       
        <div style="text-align: left; margin:auto; position:absolute; left:20%; padding:10%">
                   
        <table class="table table-hover inverse" border="0px" >
           
           <thead class="thead-inverse">
           <tr>
           <th>Project No</th>
           <th>Project Name</th>
           <th>Date Created</th>
           <th>BA ID</th>
           <th>PM ID</th>
           <th>MSD ID</th>
           </tr>
           </thead>
     
           
        
        <%
        Project pr;    
        for(int x=0;x<project.size();x++){
        
        pr=project.get(x);
        %>
      
       <tr>
       <td> <% out.print(pr.getProjectno()); %></td>        
       <td><a href="../FileControll?redirect=wall&pno=<% out.print(pr.getProjectno()); %>&srsid=<% out.print(pr.getSrsid()); %>"><% out.print(pr.getProjectname()); %></a></td>            
       <td><% out.print(pr.getDatentime()); %></td>            
       <td><% out.print(pr.getBaid()); %></td>            
       <td><% out.print(pr.getPmid()); %></td>            
       <td><% out.print(pr.getMsdid()); %></td> 
       </tr>
       <% }%>
       </table>
       </div>
        
    </body>
</html>


