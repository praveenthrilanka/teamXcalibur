<%-- 
    Document   : ManagerSDLogin
    Created on : Oct 14, 2016, 8:22:58 AM
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
            <h2>Select Project Manager and Business Analyst</h2>   
        </div>
        
        <div style="text-align: left; margin:auto; position:absolute; left:20%; top:15%; padding:10%">
        <table border="0px" width="150%">
        <tr>            
            <td>
            <label> Project Manager</label>
            </td>
            <td>
            <select> 
                <option> Select Project Manager</option>|
                <option>Project Manager 1 </option>
                <option>Project Manager 2 </option>
                <option>Project Manager 3 </option>
            </select>
            </td>
            
            <td>
                <button type="submit" class="btn btn-warning"> <a href="MSDViewPM.jsp"> View currently assigned projects</a> </button> 
            </td>
        </tr>

        <tr>
            <td><br/><br/>
            <label> Business Analyst</label>
            </td>
            
            <td><br/><br/>
            <select> 
                <option> Select Business Analyst</option>|
                <option>Business Analyst 1 </option>
                <option>Business Analyst 2 </option>
                <option>Business Analyst 3 </option>
            </select>
            </td>
            
             <td><br/><br/>
                 <button type="submit" class="btn btn-warning"><a href="MSDViewPM.jsp"> View currently assigned projects</a></button> 
            </td>
        </tr>
        </table>
        </div>
        
    </body>
</html>

