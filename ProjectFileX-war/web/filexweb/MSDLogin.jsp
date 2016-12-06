<%-- 
    Document   : MSDLogin
    Created on : Oct 20, 2016, 8:22:35 AM
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
            
            td{
                padding:15px;
            }
        </style>
        
    </head>
    <body background="SampathBack.jpg">
        <div style="text-align:center;  margin: auto;width: 50%; position: absolute;top: 10%; left: 20%;  padding: 10px">
            <h2>Create New Project</h2>   
        </div>
        
        <div style="text-align: left; margin:auto; position:absolute; left:20%; top:10%; padding:10%">
        
        <form name="project" action="../ProjectControl" method="post">
        <table border="0px" width="150%" padding="10">
            
        <tr>
            <td>
                <label>Project ID</label>
            </td>   
            <td>
                <input type="text" name="pno">
            </td>
        </tr>
        <tr>
            <td>
                <label>Project Name</label>
            </td>   
            <td>
                <input type="text" name="pname">
            </td>
        </tr>
              
        <tr>            
            <td>
            <label> Project Manager</label>
            </td>
            <td>
            <select name="pm"> 
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
            <td>
            <label> Business Analyst</label>
            </td>
            
            <td>
            <select name="ba"> 
                <option> Select Business Analyst</option>|
                <option>Business Analyst 1 </option>
                <option>Business Analyst 2 </option>
                <option>Business Analyst 3 </option>
            </select>
            </td>
            
             <td>
                 <button type="submit" class="btn btn-warning"><a href="MSDViewPM.jsp"> View currently assigned projects</a></button> 
            </td>
        </tr>
        
        <tr>
            <td colspan="3"> <input type="submit" value="Create"/> </td>
        </tr>
        
        </table>
        </form>
        </div>
        
    </body>
</html>
