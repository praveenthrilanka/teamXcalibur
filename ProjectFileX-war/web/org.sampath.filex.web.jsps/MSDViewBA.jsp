<%-- 
    Document   : MSDViewBA
    Created on : Oct 14, 2016, 8:56:45 AM
    Author     : Erandi
--%>

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
        </style>
        
    </head>
    <body background="SampathBack.jpg">
        
        <div style="text-align:center;  margin: auto;width: 50%; position: absolute;top: 10%; left: 20%;  padding: 10px">
            <h2>Currently assigned projects of Business Analyst</h2>   
        </div>
        
        <div style="padding:10%; position:absolute; top:15% ;left:20%">
            <table border="1px" width="150%">
            <tr>
                <th>Project name</th>
                <th>Project number</th>
                <th>Start Date</th>
                <th>End Date</th>
            </tr>
        </table>    
        </div>

    </body>
</html>