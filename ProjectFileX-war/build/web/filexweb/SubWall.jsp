<%-- 
    Document   : SubWall
    Created on : Oct 19, 2016, 9:41:10 AM
    Author     : Ashantha
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Comment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/ManualCSS.css">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>Sub Wall</title>
        
        <script type="text/javascript">
            document.getElementById('link').click();
        </script>
      
    </head>
    <body style="background-image: url(Filex.jpg); background-repeat: no-repeat; background-size: 20% auto;">
        <a style="float:right;" title="Home" id="link" target="_parent" href="uploadFile.jsp"><img src="logos/home.png" height="40" width="40"></a>
        <br/><br/><br/>
       <div style ="margin: auto;width: 95%; left: 1%;  padding: 1px">
       <a  href="Comment.jsp" title="Add Comment" role="button"><img src="logos/addcomment.png" height="40" width="40"></a>
       </div>
       <br/><br/><br/> 
       <div style ="margin: auto;width: 90%;position:absolute; border:1px solid lightgray;top: 18%; left: 3%;  padding: 5px">
       
       <%
       System.out.println("Output test");
       ArrayList<Comment> comments=Comment.getComment();
       System.out.println("Output test2");
       for(int x=0;x<comments.size();x++){
       Comment c;
       c=comments.get(x);    
       %>
       
       <table height="5%">
       <tr>
       <td rowspan="3"><img class="img-circle" src="logos/user.png" alt="User" width="60" height="60"></td>
       <td> <% out.print(c.getEmployeename());%></td>        
       </tr>
       <tr>
       <td><%out.print(c.getCreateddatentime());%></td>            
       </tr>
       <tr>
       <td><%out.print(c.getDescription());%></td>            
       </tr>
       <tr>
           <td></td>
       </tr>
       </table>
       <a style="float:right;" href="CommentEdit.jsp?description=<%out.print(c.getDescription());%>&commentid=<%out.print(c.getCommentno());%>" title="Delete Comment"><img src="logos/deletecomment.png" height="30" width="30"></a>
       <a style="float:right;" href="CommentEdit.jsp?description=<%out.print(c.getDescription());%>&commentid=<%out.print(c.getCommentno());%>" title="Edit Comment"><img src="logos/editcomment.png" height="30" width="30"></a>
       <hr width="95%">
       <% }%>
       
       </div>
       
       
    </body>
</html>