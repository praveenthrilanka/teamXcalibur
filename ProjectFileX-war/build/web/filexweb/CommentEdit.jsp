<%-- 
    Document   : Comment
    Created on : Oct 18, 2016, 12:02:45 PM
    Author     : Ashantha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/ManualCSS.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    
        <style>
            body {
            background-image: url("Filex.jpg");
            background-repeat: no-repeat;
            background-size: 30% auto;
            }
            
            th, td {
                padding: 10px;
                text-align: left;
            }
        </style>
    
    </head>
     <body>
        <div style ="margin: auto;width: 95%;border: 2px solid orange;position: absolute;top: 30%; left: 2%;  padding: 10px">
          <form name="commentform" method="post" action="../EditComment">
            <table>
                    <tr>
                        <td rowspan="2"><img src="user2.jpeg" alt="User"></td>
                        <td>Employe Name:</td>
                        
                        <td>*******************</td>
                    </tr>
                    
                   <tr>
                        
                        <td>Project Name:</td>
                        
                        <td>*******************</td>
                   </tr>
                   <tr
                        <% 
                            String commentid = request.getParameter("commentid");
                            String description = request.getParameter("description");
                            String status=request.getParameter("editcomment");
                        %>
                        <td colspan="3"><textarea name="commentstr" cols="60" rows="4" placeholder="Enter your comment here..!"><% out.print(description);%></textarea></td>
                   <input type="hidden" name="commentid" value="<%out.print(commentid);%>">
                   <input type="hidden" name="editcomment" value="<%out.print(status);%>">
                   </tr>
                   <tr>
                       
                        <td><input type = "submit" name= "commentbtn" value = "Comment" ></td>
                                    
                   </tr>
                   
            </table>
          </form>
            
       </div>
          
    </body>
</html>
