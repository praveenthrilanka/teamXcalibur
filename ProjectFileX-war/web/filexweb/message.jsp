<%-- 
    Document   : message
    Created on : Dec 6, 2016, 8:01:13 PM
    Author     : Ashantha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>fileX</title>
    </head>
    <body>
        <% 
        String message = request.getParameter("message");
        out.print("<h3 align=\"center\">"+message+"</h3>");
        %>
    </body>
</html>
