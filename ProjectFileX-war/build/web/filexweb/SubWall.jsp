<%@page import="org.sampath.filex.web.actions.SRS"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.sampath.filex.web.actions.Comment"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
           <%
                session=request.getSession();
                String pno=(String)session.getAttribute("pno");
                String eid=(String)session.getAttribute("eid");
                String status=SRS.getSRSStatus(pno, eid);
                String modal;
                
           %>
    
           <%   
                if(status!=null)
                {    
                    if(status.equals("approved"))
                    {
           %> 
                    <script type="text/javascript">
                        $(window).load(function(){
                            $('#ModalApproval').modal('show');
                        });
                    </script>
           <%       }
                    else if(status.equals("rejected"))
                    {
           %>
                    <script type="text/javascript">
                        $(window).load(function(){
                            $('#ModalRejection').modal('show');
                        });
                    </script>
           <%       }
                }
           %>
    
    <body onload="">
        <!--<a style="float:right;" title="Home" id="link" target="_parent" href="uploadFile.jsp"><img src="logos/home.png" height="40" width="40"></a>-->
        
       <div style ="margin: auto;width: 95%; left: 1%;  padding: 1px">
                     
           <%
               if(status!=null)
                {
                    if(!(status.equals("approved") || status.equals("rejected")) && status.equals("noresponse") )
                    {
           %>        
                    <a style="padding:10px" href="#" title="Approve" data-toggle="modal" data-target="#myModalApproval" role="button"><img src="logos/approve.png" height="40" width="40"></a>
                    <a style="padding:10px" href="#" title="Reject" data-toggle="modal" data-target="#myModalRejection" role="button"><img src="logos/reject.png" height="40" width="40"></a>
           <%
                    }
                }
               
           %>
           
          
           
           <a style="padding:10px" href="Comment.jsp" title="Add Comment" role="button"><img src="logos/addcomment.png" height="40" width="40"></a>
       </div>
        
       <div style ="margin: auto;width: 90%;position:absolute; border:1px solid lightgray;top: 8%; left: 5%;  padding: 8px">
       
       <%
                 
       
       if(session.getAttribute("srsid")==null){
       response.sendRedirect("message.jsp?message=Sorry, Selected project's comments are not available.");
       }        
       String srsid=(String)session.getAttribute("srsid");       
           
       System.out.println("Output test");
       ArrayList<Comment> comments=Comment.getComment(srsid);
       System.out.println("Output test2");
       int y=0;
       for(int x=0;x<comments.size();x++){
       Comment c;
       c=comments.get(x); 
       
       %>
       
       <table height="5%">
       <tr>
           <td rowspan="3"><img class="img-circle" src="../GetIconByID?id=<%out.print(c.getEmployeeid());%>" alt="User" width="60" height="60"></td>
       <td><span style="font-weight: bold; padding: 8px"> <% out.print(c.getEmployeename());%></span></td>        
       </tr>
       <tr>
       <td><span style="color: #9d9d9d; padding : 8px;"><%out.print(c.getCreateddatentime());%></span></td>            
       </tr>
       <tr>
       <td><div style="color: #777777; padding-left : 8px; padding-top: 4px;"><%out.print(c.getDescription());%></div></td>            
       </tr>
       <tr>
           <td></td>
       </tr>
       </table>
       <%
       if(session.getAttribute("eid").equals(c.getEmployeeid())){
           y++;
       %>
       <a style="float:right;" href="#" data-toggle="modal" data-target="#myModal<%out.print(y);%>" title="Delete Comment"><img src="logos/deletecomment.png" height="30" width="30"></a>
       <a style="float:right;" href="CommentEdit.jsp?description=<%out.print(c.getDescription());%>&commentid=<%out.print(c.getCommentno());%>&editcomment=edit" title="Edit Comment"><img src="logos/editcomment.png" height="30" width="30"></a>
       
       <div class="container">
      <!-- Modal -->
      <div class="modal fade" id="myModal<%out.print(y);%>" role="dialog">
        <div class="modal-dialog">

          <!-- Modal content-->
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title">Are you sure?</h4>
            </div>
            <div class="modal-body">
              <p>Once the comment is deleted, you will not be able to recover it.</p>
            </div>
            <div class="modal-footer">
              <a  href="../EditComment?description=<%out.print(c.getDescription());%>&commentid=<%out.print(c.getCommentno());%>&editcomment=delete" class="btn btn-default">Delete</a>
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
          </div>

        </div>
      </div>

        </div>
       
       <% } %>
       <hr width="95%">
    
       <% }%>
       </div>
       
       <!-- Modal for approval -->
      <div class="modal fade" id="myModalApproval" role="dialog">
        <div class="modal-dialog">

          <!-- Modal content-->
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title">Are you sure?</h4>
            </div>
            <div class="modal-body">
              <p>Once the SRS is approved, you will not be able to undo it.</p>
            </div>
            <div class="modal-footer">
                <a  href="../SRSApproval?status=approve" class="btn btn-default">Approve</a>
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
          </div>

        </div>
      </div>
       
        <!-- Modal for rejection -->
      <div class="modal fade" id="myModalRejection" role="dialog">
        <div class="modal-dialog">

          <!-- Modal content-->
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title">Are you sure?</h4>
            </div>
            <div class="modal-body">
              <p>Once the SRS is rejected, you will not be able to undo it.</p>
            </div>
            <div class="modal-footer">
              <a  href="../SRSApproval?status=reject" class="btn btn-default">Reject</a>
              <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
            </div>
          </div>

        </div>
      </div>
        
      <!-- Modal for approval -->
      <div class="modal fade" id="ModalApproval" role="dialog">
        <div class="modal-dialog">

          <!-- Modal content-->
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title">Approved</h4>
            </div>
            <div class="modal-body">
              <p>You have already approved the project.</p>
            </div>
            <div class="modal-footer">
              
              <button type="button" class="btn btn-default" data-dismiss="modal">Got It</button>
            </div>
          </div>

        </div>
      </div>
      
      <!-- Modal for Approval -->
      <div class="modal fade" id="ModalRejection" role="dialog">
        <div class="modal-dialog">

          <!-- Modal content-->
          <div class="modal-content">
            <div class="modal-header">
              <button type="button" class="close" data-dismiss="modal">&times;</button>
              <h4 class="modal-title">Already Rejected</h4>
            </div>
            <div class="modal-body">
              <p>You have already rejected the SRS.</p>
            </div>
            <div class="modal-footer">
           
              <button type="button" class="btn btn-default" data-dismiss="modal">Got It</button>
            </div>
          </div>

        </div>
      </div>
       
    </body>
</html>
