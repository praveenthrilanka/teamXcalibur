<%-- 
    Document   : Login
    Created on : Oct 8, 2016, 9:08:51 PM
    Author     : Ashantha
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
        
        <script> 
            function validateForm() 
            { if(document.login.un.value==="") 
            { 
            alert("User Name should not be blank..!"); 
            document.srslogin.srsid.focus(); 
            return false;
            } 
            if(document.login.pw.value==="") 
            { 
            alert("Password should not be blank..!"); 
            document.srslogin.srsid.focus(); 
            return false;
            } 
            } 
  	</script>
        
    </head>
    <body background="SampathBack.jpg">
        <div style="text-align:center;  margin: auto;width: 40%;border: 2px solid orange;position: absolute;top: 25%; left: 30%;  padding: 10px">
            <h2>Login</h2>
            <form name="login" action="../SignIn" method="post" onsubmit="return validateForm();">
              <div class="form-group">
                <label>Employee ID:</label>
                <input type="text" name="un" class="form-control" placeholder="Enter ID">
              </div>
              <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" name="pw" class="form-control" placeholder="Enter password">
              </div>
              <div class="checkbox">
                <label><input type="checkbox"> Remember me</label>
              </div>
              <button type="submit" class="btn btn-default">Sign In</button>
            </form>
        </div>

    </body>
</html>
