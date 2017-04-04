package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.sampath.filex.web.actions.SRS;
import java.util.ArrayList;
import org.sampath.filex.web.actions.Comment;

public final class SubWall_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ManualCSS.css\">\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Sub Wall</title>\r\n");
      out.write("        <!-- CORE CSS FRAMEWORK - START -->\r\n");
      out.write("        <link href=\"assets/plugins/pace/pace-theme-flash.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"fonts/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"css/animate.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"plugins/perfect-scrollbar/perfect-scrollbar.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <!-- CORE CSS FRAMEWORK - END -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- CORE CSS TEMPLATE - START -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("        <!-- CORE CSS TEMPLATE - END -->\r\n");
      out.write("\r\n");
      out.write("        <style type=\"text/css\">.jqstooltip { position: absolute;left: 0px;top: 0px;visibility: hidden;background: rgb(0, 0, 0) transparent;background-color: rgba(0,0,0,0.6);filter:progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000);-ms-filter: \"progid:DXImageTransform.Microsoft.gradient(startColorstr=#99000000, endColorstr=#99000000)\";color: white;font: 10px arial, san serif;text-align: left;white-space: nowrap;padding: 5px;border: 1px solid white;z-index: 10000;}.jqsfield { color: white;font: 10px arial, san serif;text-align: left;}</style></head>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        document.getElementById('link').click();\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");

    session = request.getSession();
    String pno = (String) session.getAttribute("pno");
    String eid = (String) session.getAttribute("eid");
    String status = SRS.getSRSStatus(pno, eid);
    String modal;


      out.write("\r\n");
      out.write("\r\n");
               if (status != null) {
        if (status.equals("approved")) {

      out.write(" \r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(window).load(function () {\r\n");
      out.write("        $('#ModalApproval').modal('show');\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
       } else if (status.equals("rejected")) {

      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    $(window).load(function () {\r\n");
      out.write("        $('#ModalRejection').modal('show');\r\n");
      out.write("    });\r\n");
      out.write("</script>\r\n");
       }
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onload=\"\">\r\n");
      out.write("    <!--<a style=\"float:right;\" title=\"Home\" id=\"link\" target=\"_parent\" href=\"uploadFile.jsp\"><img src=\"logos/home.png\" height=\"40\" width=\"40\"></a>-->\r\n");
      out.write("\r\n");
      out.write("    <div style =\"margin: auto;width: 95%; left: 1%;  padding: 1px\">\r\n");
      out.write("\r\n");
      out.write("        ");

            if (status != null) {
                if (!(status.equals("approved") || status.equals("rejected")) && status.equals("noresponse")) {
        
      out.write("        \r\n");
      out.write("        <a style=\"padding:10px\" href=\"#\" title=\"Approve\" data-toggle=\"modal\" data-target=\"#myModalApproval\" role=\"button\"><img src=\"logos/approve.png\" height=\"40\" width=\"40\"></a>\r\n");
      out.write("        <a style=\"padding:10px\" href=\"#\" title=\"Reject\" data-toggle=\"modal\" data-target=\"#myModalRejection\" role=\"button\"><img src=\"logos/reject.png\" height=\"40\" width=\"40\"></a>\r\n");
      out.write("            ");

                    }
                }

            
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <a style=\"padding:10px\" data-toggle=\"modal\" href=\"#\" data-target=\"#ultraModal1\" title=\"Add Comment\" role=\"button\"><img src=\"logos/addcomment.png\" height=\"40\" width=\"40\"></a>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"list-unstyled notification-widget ps-container ps-active-y\" style=\"height: auto;\">\r\n");
      out.write("            ");
           if (session.getAttribute("srsid") == null) {
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
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <li class=\"");
 out.print(collorarray[a]); 
      out.write("\">\r\n");
      out.write("                <a href=\"javascript:;\">\r\n");
      out.write("                    <div class=\"user-img\">\r\n");
      out.write("                        <img src=\"../GetIconByID?id=");
out.print(c.getEmployeeid());
      out.write("\" alt=\"user-image\" style=\"width:50px;height:50px;\" class=\"img-circle img-inline\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <span class=\"name\">\r\n");
      out.write("                            <strong>");
 out.print(c.getEmployeename());
      out.write("</strong>\r\n");
      out.write("                            <span class=\"desc small\">\r\n");
      out.write("                                ");
out.print(c.getDescription());
      out.write("\r\n");
      out.write("                            </span>\r\n");
      out.write("                            <span class=\"time small\">");
out.print(c.getCreateddatentime());
      out.write("</span>\r\n");
      out.write("\r\n");
      out.write("                            ");

                                if (session.getAttribute("eid").equals(c.getEmployeeid())) {
                                    y++;
                            
      out.write("\r\n");
      out.write("                            <a style=\"float:right;\" href=\"#\" data-toggle=\"modal\" data-target=\"#myModal");
out.print(y);
      out.write("\" title=\"Delete Comment\"><img src=\"logos/deletecomment.png\" height=\"20\" width=\"20\"></a>\r\n");
      out.write("                            <!--<a style=\"float:right;\" href=\"CommentEdit.jsp?description=");
//out.print(c.getDescription());
      out.write("&commentid=");
out.print(c.getCommentno());
      out.write("&editcomment=edit\" title=\"Edit Comment\"><img src=\"logos/editcomment.png\" height=\"30\" width=\"30\"></a>-->\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"container\">\r\n");
      out.write("                                <!-- Modal -->\r\n");
      out.write("                                <div class=\"modal fade\" id=\"myModal");
out.print(y);
      out.write("\" role=\"dialog\">\r\n");
      out.write("                                    <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("                                        <!-- Modal content-->\r\n");
      out.write("                                        <div class=\"modal-content\">\r\n");
      out.write("                                            <div class=\"modal-header\">\r\n");
      out.write("                                                <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                                                <h4 class=\"modal-title\">Are you sure?</h4>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"modal-body\">\r\n");
      out.write("                                                <p>Once the comment is deleted, you will not be able to recover it.</p>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"modal-footer\">\r\n");
      out.write("                                                <a  href=\"../EditComment?description=");
out.print(c.getDescription());
      out.write("&commentid=");
out.print(c.getCommentno());
      out.write("&editcomment=delete\" class=\"btn btn-default\">Delete</a>\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </span>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("\r\n");
      out.write("            ");
 a++;}
      out.write("\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("            <!-- Modal for approval -->\r\n");
      out.write("            <div class=\"modal fade\" id=\"myModalApproval\" role=\"dialog\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Modal content-->\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                            <h4 class=\"modal-title\">Are you sure?</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <p>Once the SRS is approved, you will not be able to undo it.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <a  href=\"../SRSApproval?status=approve\" class=\"btn btn-default\">Approve</a>\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Modal for rejection -->\r\n");
      out.write("            <div class=\"modal fade\" id=\"myModalRejection\" role=\"dialog\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Modal content-->\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                            <h4 class=\"modal-title\">Are you sure?</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <p>Once the SRS is rejected, you will not be able to undo it.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("                            <a  href=\"../SRSApproval?status=reject\" class=\"btn btn-default\">Reject</a>\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Modal for approval -->\r\n");
      out.write("            <div class=\"modal fade\" id=\"ModalApproval\" role=\"dialog\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Modal content-->\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                            <h4 class=\"modal-title\">Approved</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <p>You have already approved the project.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Got It</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <!-- Modal for Approval -->\r\n");
      out.write("            <div class=\"modal fade\" id=\"ModalRejection\" role=\"dialog\">\r\n");
      out.write("                <div class=\"modal-dialog\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Modal content-->\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("                            <h4 class=\"modal-title\">Already Rejected</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("                            <p>You have already rejected the SRS.</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-footer\">\r\n");
      out.write("\r\n");
      out.write("                            <button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Got It</button>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--Model starts-->\r\n");
      out.write("            <div class=\"modal fade\" id=\"ultraModal1\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ultraModal-Label\" aria-hidden=\"true\" style=\"display: none;\">\r\n");
      out.write("                <div class=\"modal-dialog animated fadeInUp\"><br/><br/><br/><br/><br/>\r\n");
      out.write("                    <div class=\"modal-content\">\r\n");
      out.write("                        <div class=\"modal-header\">\r\n");
      out.write("                            <button aria-hidden=\"true\" data-dismiss=\"modal\" class=\"close\" type=\"button\">×</button>\r\n");
      out.write("                            <h4 class=\"modal-title\">Add Comment</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                            <form name=\"commentform\" method=\"post\" action=\"../SetComment\" class=\"form-horizontal\" role=\"form\">\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <span class=\"input-group-addon\">\r\n");
      out.write("                                        <span class=\"arrow\"></span>\r\n");
      out.write("                                        <img src=\"images/addstk.png\" width=\"25px\" height=\"25px\"/>     \r\n");
      out.write("                                    </span>\r\n");
      out.write("                                    <textarea name=\"commentstr\" class=\"form-control\" cols=\"5\" rows=\"4\" id=\"field-6\"></textarea>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <br/>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"input-group\">\r\n");
      out.write("                                    <div class=\"\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\">Comment</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--model End-->\r\n");
      out.write("            </body>\r\n");
      out.write("            </html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
