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
        <!-- CORE CSS FRAMEWORK - START -->
        <link href="assets/plugins/pace/pace-theme-flash.css" rel="stylesheet" type="text/css" media="screen">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="css/bootstrap-theme.min.css" rel="stylesheet" type="text/css">
        <link href="fonts/font-awesome/css/font-awesome.css" rel="stylesheet" type="text/css">
        <link href="css/animate.min.css" rel="stylesheet" type="text/css">
        <link href="plugins/perfect-scrollbar/perfect-scrollbar.css" rel="stylesheet" type="text/css">
        <!-- CORE CSS FRAMEWORK - END -->



        <!-- CORE CSS TEMPLATE - START -->
        <link href="css/style.css" rel="stylesheet" type="text/css">
        <link href="css/responsive.css" rel="stylesheet" type="text/css">
        <!-- CORE CSS TEMPLATE - END -->

        <style type="text/css">.jqstooltip { position: absolute;left: 0px;top: 0px;visibility: hidden;background: rgb(0, 0, 0) transparent;background-color: rgba(0,0,0,0.6);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000);-ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000)";color: white;font: 10px arial, san serif;text-align: left;white-space: nowrap;padding: 5px;border: 1px solid white;z-index: 10000;}.jqsfield { color: white;font: 10px arial, san serif;text-align: left;}</style></head>

    <script type="text/javascript">
        document.getElementById('link').click();
    </script>

</head>
<%
    session = request.getSession();
    String pno = (String) session.getAttribute("pno");
    String eid = (String) session.getAttribute("eid");
    String status = SRS.getSRSStatus(pno, eid);
    String modal;

%>

<%               if (status != null) {
        if (status.equals("approved")) {
%> 
<script type="text/javascript">
    $(window).load(function () {
        $('#ModalApproval').modal('show');
    });
</script>
<%       } else if (status.equals("rejected")) {
%>
<script type="text/javascript">
    $(window).load(function () {
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
            if (status != null) {
                if (!(status.equals("approved") || status.equals("rejected")) && status.equals("noresponse")) {
        %>        
        <a style="padding:10px" href="#" title="Approve" data-toggle="modal" data-target="#myModalApproval" role="button"><img src="logos/approve.png" height="40" width="40"></a>
        <a style="padding:10px" href="#" title="Reject" data-toggle="modal" data-target="#myModalRejection" role="button"><img src="logos/reject.png" height="40" width="40"></a>
            <%
                    }
                }

            %>

        <a style="padding:10px" data-toggle="modal" href="#" data-target="#ultraModal1" title="Add Comment" role="button"><img src="logos/addcomment.png" height="40" width="40"></a>
    </div>


        <ul class="list-unstyled notification-widget ps-container ps-active-y" style="height: auto;">
            <%           if (session.getAttribute("srsid") == null) {
                    response.sendRedirect("message.jsp?message=Sorry, Selected project's comments are not available.");
                }
                String srsid = (String) session.getAttribute("srsid");
                
                String [] collorarray={"unread status-available"," status-away","status-busy","status-offline"," status-available"};

                System.out.println("Output test");
                ArrayList<Comment> comments = Comment.getComment(srsid);
                System.out.println("Output test2");
                //Variable y to declare the unique modals
                int y = 0,a=0;
                for (int x = 0; x < comments.size(); x++) {
                    Comment c;
                    c = comments.get(x);
                    a%=5;
            %>


            <li class="<% out.print(collorarray[a]); %>">
                <a href="javascript:;">
                    <div class="user-img">
                        <img src="../GetIconByID?id=<%out.print(c.getEmployeeid());%>" alt="user-image" style="width:50px;height:50px;" class="img-circle img-inline">
                    </div>
                    <div>
                        <span class="name">
                            <strong><% out.print(c.getEmployeename());%></strong>
                            <span class="desc small">
                                <%out.print(c.getDescription());%>
                            </span>
                            <span class="time small"><%out.print(c.getCreateddatentime());%></span>

                            <%
                                if (session.getAttribute("eid").equals(c.getEmployeeid())) {
                                    y++;
                            %>
                            <a style="float:right;" href="#" data-toggle="modal" data-target="#myModal<%out.print(y);%>" title="Delete Comment"><img src="logos/deletecomment.png" height="20" width="20"></a>
                            <!--<a style="float:right;" href="CommentEdit.jsp?description=<%//out.print(c.getDescription());%>&commentid=<%out.print(c.getCommentno());%>&editcomment=edit" title="Edit Comment"><img src="logos/editcomment.png" height="30" width="30"></a>-->

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
                        </span>

                    </div>
                </a>
            </li>

            <% a++;}%>
        

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
            <!--Model starts-->
            <div class="modal fade" id="ultraModal1" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/>
                    <div class="modal-content">
                        <div class="modal-header">
                            <button aria-hidden="true" data-dismiss="modal" class="close" type="button">×</button>
                            <h4 class="modal-title">Add Comment</h4>
                        </div>
                        <div class="modal-body">

                            <form name="commentform" method="post" action="../SetComment" class="form-horizontal" role="form">
                                <div class="input-group">
                                    <span class="input-group-addon">
                                        <span class="arrow"></span>
                                        <img src="images/addstk.png" width="25px" height="25px"/>     
                                    </span>
                                    <textarea name="commentstr" class="form-control" cols="5" rows="4" id="field-6"></textarea>
                                </div>
                                <br/>

                                <div class="input-group">
                                    <div class="">
                                        <button type="submit" class="btn btn-primary">Comment</button>
                                    </div>
                                </div>
                            </form>

                        </div>

                    </div>
                </div>
            </div>
            <!--model End-->
            </body>
            </html>
