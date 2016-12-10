<%-- 
    Document   : SubWall
    Created on : Oct 19, 2016, 9:41:10 AM
    Author     : Ashantha
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Comment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/ManualCSS.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Sub Wall</title>
    </head>
    <body style="background-image: url(Filex.jpg); background-repeat: no-repeat; background-size: 20% auto;">>
       <br/><br/><br/>
       <div style ="margin: auto;width: 95%; left: 1%;  padding: 1px">
       <a  href="Comment.jsp" class="btn btn-info" role="button">Comment</a>
       </div>
       <br/><br/><br/>
       <div style ="margin: auto;width: 90%;position:absolute; border:1px solid lightgray;top: 18%; left: 3%;  padding: 5px">
       
       <%
       System.out.println("Output test");
       ArrayList<Comment> comments=Comment.getComment();
       System.out.println("Output test2");
       for(int x=0;x<comments.size();x++){
       Comment c;
       c=comments.get(x);    
       %>
       
       <table height="5%">
       <tr>
       <td rowspan="3"><img class="image-responsive" src="user2.jpeg" alt="User" width="50" height="50"></td>
       <td> <% out.print(c.getEmployeename());%></td>        
       </tr>
       <tr>
       <td><%out.print(c.getCreateddatentime());%></td>            
       </tr>
       <tr>
       <td><%out.print(c.getDescription());%></td>            
       </tr>
       </table>
       <hr width="95%">
       <% }%>
       
       </div>
       
       
    </body>
</html>
