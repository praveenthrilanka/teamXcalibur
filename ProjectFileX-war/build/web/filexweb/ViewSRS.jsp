<%-- 
    Document   : ViewSRS
    Created on : Oct 19, 2016, 9:01:47 AM
    Author     : Ashantha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="logos/fav-icon.ico" type="image/x-icon"/>
        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    
        <%@ page contentType="text/html"%>
        <%@ page import = "javax.servlet.RequestDispatcher" %>
        <%
             RequestDispatcher rd = request.getRequestDispatcher("../GetFile");
             request.setAttribute("msg","HI Welcome");
             rd.forward(request, response);
        %>
    
    </head>
        
    <body>
       <div style ="margin: auto;width: 14%;border: 2px solid orange;position: absolute;top: 45%; left: 45%;  padding: 10px">
         <form action="../GetFile" method="post">
           <input type="submit" value="View SRS" class="btn btn-warning">
         </form>
       </div>
    </body>
</html>
