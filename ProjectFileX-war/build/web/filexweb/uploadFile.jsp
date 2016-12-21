<%-- 
    Document   : uploadFile
    Created on : Oct 13, 2016, 1:49:46 AM
    Author     : Reshani
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
        <title>UPLOAD Page</title>

        <script> 
            function validateForm() 
            { if(document.srslogin.srsid.value==="") 
            { 
            alert("User Name should not be blank..!"); 
            document.srslogin.srsid.focus(); 
            return false;
            } 
            } 
  	</script>

        <%
        session=request.getSession(false);
        if(session.getAttribute("eid")==null){
            response.sendRedirect("Login.jsp");
        }        
        %>
      
    </head>

    <body background="SampathBack.jpg">
        <div style="text-align:center;  margin: auto;width: 40%;border: 2px solid orange;position: absolute;top: 20%; left: 30%;  padding: 10px">
            <h2>Add SRS Document:</h2>
        </div>
        
        <div style ="margin: auto;width: 40%;border: 2px solid orange;position: absolute;top: 40%; left: 30%;  padding: 10px">
            <form name="srslogin" action ="../FileControll" method = "post" enctype="multipart/form-data" onsubmit="return validateForm();">
                <table style="width:100%;padding: 50px;">
                     
                    <tr>
                        <td>Enter SRS ID</td>
                        <td> : </td>
                        <td><input type = "text" name="srsid" size="8.5" ></td>
                    </tr>
                    
                    <tr>
                        <td>Enter Project No:</td>
                        <td> : </td>
                        <td><input type = "text" name="pno" size="8.5" ></td>
                    </tr>
                    
                   <tr>
                        <td>Select File</td>
                        <td> : </td>
                        <td><input type = "file" name="filex" ></td>
                   </tr>
                   <tr>
                        <td><input type = "submit" name= "submit" value = "Upload File" ></td>
                        <td><input type="submit" name="getsrs" value="View SRS" /><td>
                   </tr>
                   
                   <tr>
                       <td><input type="submit" name="viewwall" value="View Project" /></td>
                       <td><input type="reset" value="Clear"></td>
                   </tr>
                </table>
            </form>
            
        </div>
        
    </body>
</html>
