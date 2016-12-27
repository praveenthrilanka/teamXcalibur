<%-- 
    Document   : Comment
    Created on : Oct 18, 2016, 12:02:45 PM
    Author     : Ashantha
--%>

<%@page import="org.sampath.filex.web.actions.Project"%>
<%@page import="org.sampath.filex.web.actions.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="logos/fav-icon.ico" type="image/x-icon"/>
        <link rel="stylesheet" href="css/bootstrap.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Comment-Edit</title>
   
        <%
            session=request.getSession(false);
            
            Employee e=Employee.getEmployee((String)session.getAttribute("eid"));
            Project p=Project.getProject((String)session.getAttribute("pno"));
        %>
        
    </head>
     <body>
        <div style ="margin: auto;width: 95%;border: 2px solid orange;position: absolute;top: 30%; left: 2%;  padding: 10px">
          <form name="commentform" method="post" action="../EditComment">
            <table>
                    <tr>
                        <td rowspan="2"><img class="img-circle" src="../GetIconByID?id=<%out.print(e.getEmployeeid());%>" alt="User" width="60" height="60"></td>
                        <td>Employe Name:</td>
                        
                        <td><% out.print(e.getEmployeename()); %></td>
                    </tr>
                    
                   <tr>
                        
                        <td>Project Name:</td>
                        
                        <td><% out.print(p.getProjectname()); %></td>
                   </tr>
                   <tr
                        <% 
                            String commentid = request.getParameter("commentid");
                            String description = request.getParameter("description");
                            String status=request.getParameter("editcomment");
                        %>
                        <td colspan="3"><textarea name="commentstr" cols="45" rows="4" placeholder="Enter your comment here..!"><% out.print(description);%></textarea></td>
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
