<%-- 
    Document   : SubWall
    Created on : Oct 19, 2016, 9:41:10 AM
    Author     : Ashantha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <%@ page contentType="text/html"%>
        <%@ page import = "javax.servlet.RequestDispatcher" %>
        <%
             RequestDispatcher rd = request.getRequestDispatcher("../GetComment");
             request.setAttribute("msg","HI Welcome");
             rd.forward(request, response);
        %>
        
    </head>
    <body>
       
    </body>
</html>
