package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import org.sampath.filex.web.actions.Notification;
import org.sampath.filex.web.actions.Employee;
import org.sampath.filex.web.actions.Project;

public final class EditProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/filexweb/Up.jsp");
    _jspx_dependants.add("/filexweb/Sidebar.jsp");
    _jspx_dependants.add("/filexweb/Down.jsp");
  }

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
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\" \">\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" />\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>FileX : Sampath Bank</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("        <meta content=\"\" name=\"description\" />\r\n");
      out.write("        <meta content=\"\" name=\"author\" />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"logos/fav-icon.ico\" type=\"image/x-icon\"/>    <!-- Favicon -->\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"images/apple-touch-icon-57-precomposed.png\">\t<!-- For iPhone -->\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"images/apple-touch-icon-114-precomposed.png\">    <!-- For iPhone 4 Retina display -->\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"images/apple-touch-icon-72-precomposed.png\">    <!-- For iPad -->\r\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"images/apple-touch-icon-144-precomposed.png\">    <!-- For iPad Retina display -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- CORE CSS FRAMEWORK - START -->\r\n");
      out.write("        <link href=\"plugins/pace/pace-theme-flash.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>\r\n");
      out.write("        <link href=\"plugins/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"plugins/bootstrap/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"fonts/font-awesome/css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/animate.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"plugins/perfect-scrollbar/perfect-scrollbar.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!-- CORE CSS FRAMEWORK - END -->\r\n");
      out.write("\r\n");
      out.write("        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> \r\n");
      out.write("        <link href=\"plugins/jquery-ui/smoothness/jquery-ui.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/><link href=\"assets/plugins/rickshaw-chart/css/graph.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/><link href=\"assets/plugins/rickshaw-chart/css/detail.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/><link href=\"assets/plugins/rickshaw-chart/css/legend.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/><link href=\"assets/plugins/rickshaw-chart/css/extensions.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/><link href=\"assets/plugins/rickshaw-chart/css/rickshaw.min.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/><link href=\"assets/plugins/rickshaw-chart/css/lines.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\"/>        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- CORE CSS TEMPLATE - START -->\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <!-- CORE CSS TEMPLATE - END -->\r\n");
      out.write("\r\n");
      out.write("        ");

            session = request.getSession(false);

            if (session.getAttribute("eid") == null) {
                response.sendRedirect("Login.jsp");
            }

            Employee e = Employee.getEmployee((String) session.getAttribute("eid"));


        
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <!-- END HEAD -->\r\n");
      out.write("\r\n");
      out.write("    <!-- BEGIN BODY -->\r\n");
      out.write("    <body class=\" \" style=\"background-color: #f1f2f7;\"><!-- START TOPBAR -->\r\n");
      out.write("        <div class='page-topbar '>\r\n");
      out.write("            <div class='logo-area'>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class='quick-area'>\r\n");
      out.write("                <div class='pull-left'>\r\n");
      out.write("                    <ul class=\"info-menu left-links list-inline list-unstyled\">\r\n");
      out.write("                        <li class=\"sidebar-toggle-wrap\">\r\n");
      out.write("                            <a href=\"#\" data-toggle=\"sidebar\" class=\"sidebar_toggle\">\r\n");
      out.write("                                <i class=\"fa fa-bars\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        ");
                            ArrayList<Notification> notifications = Notification.getAllNotification(e.getEmployeeid());
                            int count = Notification.notificationInfo(e.getEmployeeid());
                            String empPosition = null;
                            if (e.getPosition().equals("Business Analyist")) {
                                empPosition = "ba";
                            } else if (e.getPosition().equals("Project Manager")) {
                                empPosition = "pm";
                            } else if (e.getPosition().equals("PM/MSD")) {
                                empPosition = "pm";
                            } else if (e.getPosition().equals("ManagerSD")) {
                                empPosition = "msd";
                            } else if (e.getPosition().equals("Stakeholder")) {
                                empPosition = "esh";
                            }

                        
      out.write("\r\n");
      out.write("                        <li class=\"notify-toggle-wrapper\">\r\n");
      out.write("                            <a href=\"#\" data-toggle=\"dropdown\" class=\"toggle\">\r\n");
      out.write("                                <i class=\"fa fa-bell\"></i>\r\n");
      out.write("                                ");
if (count != 0) { 
      out.write("\r\n");
      out.write("                                <span class=\"badge badge-orange\">");
 out.print(count); 
      out.write("</span>\r\n");
      out.write("                                ");

                                    }
                                
      out.write("\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu notifications animated fadeIn\">\r\n");
      out.write("                                <li class=\"total\">\r\n");
      out.write("                                    <span class=\"small\">\r\n");
      out.write("                                        You have <strong>");
 out.print(count); 
      out.write("</strong> new notifications.\r\n");
      out.write("                                        <a href=\"javascript:;\" class=\"pull-right\">Mark all as Read</a>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list\">\r\n");
      out.write("\r\n");
      out.write("                                    <ul class=\"dropdown-menu-list list-unstyled ps-scrollbar\">\r\n");
      out.write("                                        ");


                                            Notification n;
                                            String status = null;
                                            for (int x = 0; x < notifications.size(); x++) {
                                                n = notifications.get(x);
                                                if (Notification.getStatus(n.getNotifino()).equals("comment")) {
                                                    status = n.getEmpname() + " commented on project - " + n.getPname();
                                                } else if (Notification.getStatus(n.getNotifino()).equals("project")) {
                                                    status = n.getEmpname() + " assigned you as the " + e.getPosition() + " of the Project - " + n.getPname();
                                                } else if (Notification.getStatus(n.getNotifino()).equals("srs")) {
                                                    status = n.getEmpname() + " uploaded the SRS of the Project - " + n.getPname();
                                                }

                                        
      out.write("\r\n");
      out.write("                                        <li class=\"unread available\"> \r\n");
      out.write("                                            <a href=\"../NotificationHandling?pno=");
 out.print(n.getPno()); 
      out.write("&direct=");
 out.print(empPosition); 
      out.write("&status=viewNoti&empid=");
 out.print(e.getEmployeeid()); 
      out.write("&notifino=");
 out.print(n.getNotifino()); 
      out.write("\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <img class=\"notification-icon\" src=\"../GetIconByID?id=");
out.print(n.getEmpid());
      out.write("\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>");
 out.print(status); 
      out.write(" </strong>\r\n");
      out.write("                                                        <span class=\"time small\">");
 out.print(n.getDatentime()); 
      out.write("</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        ");

                                            }
                                        
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"external\">\r\n");
      out.write("                                    <a href=\"javascript:;\">\r\n");
      out.write("                                        <span>Read All Notifications</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\t\t\r\n");
      out.write("                <div class='pull-right'>\r\n");
      out.write("                    <ul class=\"info-menu right-links list-inline list-unstyled\">\r\n");
      out.write("                        <li class=\"profile\">\r\n");
      out.write("                            <a href=\"#\" data-toggle=\"dropdown\" class=\"toggle\">\r\n");
      out.write("                                <img src=\"../GetIconByID?id=");
 out.print(e.getEmployeeid()); 
      out.write("\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                <span>");
 out.print(e.getEmployeename()); 
      out.write(" <i class=\"fa fa-angle-down\"></i></span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu profile animated fadeIn\">\r\n");
      out.write("                                <li>\r\n");
      out.write("                                    <a href=\"EditProfile.jsp\">\r\n");
      out.write("                                        <i class=\"fa fa-wrench\"></i>\r\n");
      out.write("                                        Settings\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"last\">\r\n");
      out.write("                                    <a href=\"../SignOut\">\r\n");
      out.write("                                        <i class=\"fa fa-lock\"></i>\r\n");
      out.write("                                        Logout\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\t\t\t\r\n");
      out.write("                </div>\t\t\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- END TOPBAR -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- START CONTAINER -->\r\n");
      out.write("        <div class=\"page-container row-fluid\">\r\n");
      out.write("\r\n");
      out.write("            <!-- SIDEBAR - START -->\r\n");
      out.write("            <div class=\"page-sidebar \">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <!-- MAIN MENU - START -->\r\n");
      out.write("                <div class=\"page-sidebar-wrapper\" id=\"main-menu-wrapper\"> \r\n");
      out.write("\r\n");
      out.write("                    <!-- USER INFO - START -->\r\n");
      out.write("                    <div class=\"profile-info row\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"profile-image col-md-4 col-sm-4 col-xs-4\">\r\n");
      out.write("                            <a href=\"ui-profile.html\">\r\n");
      out.write("                                <img src=\"../GetIconByID?id=");
 out.print(e.getEmployeeid()); 
      out.write("\" class=\"img-responsive img-circle\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"profile-details col-md-8 col-sm-8 col-xs-8\">\r\n");
      out.write("\r\n");
      out.write("                            <h3>\r\n");
      out.write("                                <a href=\"ui-profile.html\">");
out.print(e.getEmployeename());
      out.write("</a>\r\n");
      out.write("\r\n");
      out.write("                                <!-- Available statuses: online, idle, busy, away and offline -->\r\n");
      out.write("                                <span class=\"profile-status online\"></span>\r\n");
      out.write("                            </h3>\r\n");
      out.write("\r\n");
      out.write("                            <p class=\"profile-title\">");
out.print(e.getPosition());
      out.write("</p>\r\n");
      out.write("                            <p class=\"profile-title\" style=\"color: #919191 6; \">");
out.print(e.getDepartement());
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- USER INFO - END -->\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                ");

                    session = request.getSession(false);
                
      out.write("\r\n");
      out.write("                    <ul class='wraplist'>\t\r\n");
      out.write("                            <li class=\"\"> \r\n");
      out.write("                                <a href=\"");
 out.print(session.getAttribute("home")); 
      out.write("\">\r\n");
      out.write("                                    <i class=\"fa fa-dashboard\"></i>\r\n");
      out.write("                                    <span class=\"title\">Home</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- MAIN MENU - END -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--  SIDEBAR - END -->\r\n");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("                    \r\n");
      out.write("            <!-- START CONTENT -->\r\n");
      out.write("            <section id=\"main-content\" class=\" \">\r\n");
      out.write("                <section class=\"wrapper\" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>\r\n");
      out.write("                    \r\n");
      out.write("                    <style>\r\n");
      out.write("\r\n");
      out.write("#dialogoverlay{\r\n");
      out.write("\t\r\n");
      out.write("        display: none;\r\n");
      out.write("\r\n");
      out.write("\topacity: .8;\r\n");
      out.write("\t\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\t\r\n");
      out.write("\ttop: 0px;\r\n");
      out.write("\t\r\n");
      out.write("\tleft: 0px;\r\n");
      out.write("\t\r\n");
      out.write("\tbackground: #FFF;\r\n");
      out.write("\t\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\t\r\n");
      out.write("\tz-index: 10;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("#dialogbox{\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\r\n");
      out.write("\tposition: fixed;\r\n");
      out.write("\r\n");
      out.write("\tbackground: #000;\r\n");
      out.write("\r\n");
      out.write("\tborder-radius:4px; \r\n");
      out.write("\r\n");
      out.write("\twidth:550px;\r\n");
      out.write("\r\n");
      out.write("\tz-index: 10;\r\n");
      out.write("\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("#dialogbox > div{background:#FFF; margin:1px;}\r\n");
      out.write("\r\n");
      out.write("#dialogbox >div > #dialogboxhead{\r\n");
      out.write("\t background: #fcfcfc; \r\n");
      out.write("\t font-size:19px;\r\n");
      out.write("\t padding:10px; \r\n");
      out.write("\t color:#000000;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("#dialogbox > div > #dialogboxbody{ \r\n");
      out.write("\tbackground:#ececec; \r\n");
      out.write("\tpadding:20px; \r\n");
      out.write("\tcolor:#000000; \r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("#dialogbox > div >#dialogboxfoot{\r\n");
      out.write(" \t background: #fcfcfc;\r\n");
      out.write("\t padding:10px; \r\n");
      out.write("\ttext-align:right; \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"login-form\" style =\"\">\r\n");
      out.write("\t\t\t\t\t<h4>Edit Your Profile</h4>\r\n");
      out.write("\t\t\t\t\t<h5><strong></strong></h5>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                        <form name=\"EditProfile\" method=\"post\" action=\"../SetIcon\" enctype=\"multipart/form-data\" onsubmit=\"return Validate();\">\r\n");
      out.write("                                          <input type=\"checkbox\" class=\"btn btn-success\" name=\"propicchk\" id=\"propiccheck\" value=\"Change the pic\">Change the profile picture<br/><br/>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display:block; margin:auto; width:30%;\">\r\n");
      out.write("\t\t\t\t\t\t\t<img style=\"border-radius: 50%;\" src=\"logos/user.png\" id=\"output\" width=\"130\" height=\"130\"/>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t\t<div style=\"display:block; margin:auto; width:45%;\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"file\" name=\"logo\" id=\"piclogo\" accept=\"image/*\"  onchange=\"loadFile(event)\"/>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("                                                \r\n");
      out.write("                                                \r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t    <br/><br/>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <input type=\"checkbox\" name=\"pwchk\" id=\"passcheck\" value=\"Change the passsword\">Change the password<br/><br/>\r\n");
      out.write("                                            \r\n");
      out.write("                                            <label>Password :</label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                            <input type=\"password\" id=oldpassword\" name=\"pw\" placeholder=\"Enter the old password\" required=\"\">\t\t\t\t<br/><br/>\r\n");
      out.write("                                            <input type=\"password\" id=newpassword\" name=\"npw\" placeholder=\"Enter the new password\">\t\t\t\t<br/><br/>\r\n");
      out.write("                                            <input type=\"password\" id=cnewpassword\" name=\"cnpw\" placeholder=\"Confirm the new password\">\t\t\t\t<br/><br/>\r\n");
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("\r\n");
      out.write("                                            <input type=\"checkbox\" name=\"emailchk\" id=\"emailcheck\" value=\"Change the email\">Change the email<br/><br/>\r\n");
      out.write("\r\n");
      out.write("                                            <label>Email :</label>\r\n");
      out.write("                                            <input type=\"text\" id=\"newname\" name=\"email\" placeholder=\"Enter email address\">\t\t\t\t<br/><br/><br/>\r\n");
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                            \r\n");
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\r\n");
      out.write("                                                \r\n");
      out.write("                                                <input style=\"background-color:#FF9D26; border:none;\" class=\"btn btn-info btn-block\" type=\"submit\" value=\"Set\" />\r\n");
      out.write("                                                <input style=\"background-color:FFC682; border:none;\" class=\"btn btn-info btn-block\" type=\"reset\" id=\"reset\" >\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write(" <div id=\"dialogoverlay\"></div>\r\n");
      out.write("  \r\n");
      out.write("<div id=\"dialogbox\">\r\n");
      out.write(" \r\n");
      out.write("\t <div>\r\n");
      out.write("    \r\n");
      out.write("\t\t<div id=\"dialogboxhead\"></div>\r\n");
      out.write("   \r\n");
      out.write("\t       <div id=\"dialogboxbody\"></div>\r\n");
      out.write("   \r\n");
      out.write("\t\t<div id=\"dialogboxfoot\"></div>\r\n");
      out.write(" \r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("                                   <script type=\"text/javascript\">\r\n");
      out.write("                                                   var loadFile = function(event) {\r\n");
      out.write("\t\t\t\t\t\t    var output = document.getElementById('output');\r\n");
      out.write("\t\t\t\t\t\t    output.src = URL.createObjectURL(event.target.files[0]);\r\n");
      out.write("\t\t\t\t\t\t  };\r\n");
      out.write("                                                  \r\n");
      out.write("                                                  \r\n");
      out.write("                                                \r\n");
      out.write("                                                  function Validate(){\r\n");
      out.write("                                                       if(document.getElementById(\"passcheck\").checked==true && document.getElementById(\"emailcheck\").checked==false && document.getElementById(\"propiccheck\").checked==false){ \r\n");
      out.write("                                                      \r\n");
      out.write("                                                      if((document.EditProfile.npw.value!=\"\" && document.EditProfile.cnpw.value!=\"\")&&(document.EditProfile.npw.value!=document.EditProfile.cnpw.value)){\r\n");
      out.write("                                                          \r\n");
      out.write("                                                          Alert.render(\"Passswords do not match!\");\r\n");
      out.write("                                                          document.EditProfile.cnpw.focus();\r\n");
      out.write("                                                          \r\n");
      out.write("                                                          return false;\r\n");
      out.write("                                                      }\r\n");
      out.write("                                                      \r\n");
      out.write("                                                      if(document.EditProfile.npw.value==\"\"&& document.EditProfile.cnpw.value!=\"\"){\r\n");
      out.write("                                                          \r\n");
      out.write("                                                          Alert.render(\"Enter the new password first!\");\r\n");
      out.write("                                                          document.EditProfile.cnpw.focus();\r\n");
      out.write("                                                          \r\n");
      out.write("                                                          return false;\r\n");
      out.write("                                                      }\r\n");
      out.write("                                                     if(document.EditProfile.npw.value!=\"\" && document.EditProfile.cnpw.value==\"\"){\r\n");
      out.write("                                                          \r\n");
      out.write("                                                          Alert.render(\"Confirm your password!\");\r\n");
      out.write("                                                          document.EditProfile.cnpw.focus();\r\n");
      out.write("                                                          \r\n");
      out.write("                                                          return false;\r\n");
      out.write("                                                      }\r\n");
      out.write("                                                     if(document.EditProfile.npw.value==\"\" && document.EditProfile.cnpw.value==\"\"){\r\n");
      out.write("                                                          \r\n");
      out.write("                                                          Alert.render(\"Fill out the password fields!\");\r\n");
      out.write("                                                          document.EditProfile.cnpw.focus();\r\n");
      out.write("                                                          \r\n");
      out.write("                                                          return false;\r\n");
      out.write("                                                      }\r\n");
      out.write("                                                     \r\n");
      out.write("                                                     \r\n");
      out.write("                                                      document.EditProfile.submit();\r\n");
      out.write("                                                  }\r\n");
      out.write("                                                  \r\n");
      out.write("                                            }\r\n");
      out.write("                                       \r\n");
      out.write("                                       function CustomAlert(){\r\n");
      out.write("  \r\n");
      out.write("   this.render = function(dialog){\r\n");
      out.write("   \r\n");
      out.write("     var winW = window.innerWidth;\r\n");
      out.write(" \r\n");
      out.write("     var winH = window.innerHeight;\r\n");
      out.write("       \r\n");
      out.write("     var dialogoverlay = document.getElementById('dialogoverlay');\r\n");
      out.write("        \r\n");
      out.write("     var dialogbox = document.getElementById('dialogbox');\r\n");
      out.write("        \r\n");
      out.write("      \r\n");
      out.write("     dialogoverlay.style.display = \"block\";\r\n");
      out.write("       \r\n");
      out.write("     dialogoverlay.style.height = winH+\"px\";\r\n");
      out.write("        \r\n");
      out.write("     dialogbox.style.left = (winW/2) - (550 * .5)+\"px\";\r\n");
      out.write("       \r\n");
      out.write("     dialogbox.style.top = \"100px\";\r\n");
      out.write("       \r\n");
      out.write("     dialogbox.style.display = \"block\";\r\n");
      out.write("      \r\n");
      out.write("   \r\n");
      out.write("    document.getElementById('dialogboxhead').innerHTML = \"OOPS..! Something went wrong..\";\r\n");
      out.write("        \r\n");
      out.write("    document.getElementById('dialogboxbody').innerHTML = dialog;\r\n");
      out.write("       \r\n");
      out.write("    document.getElementById('dialogboxfoot').innerHTML = '<button class=\"btn btn-success\" onclick=\"Alert.ok()\">OK</button>';\r\n");
      out.write("   \r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("    this.ok = function()\r\n");
      out.write("    {\r\n");
      out.write("\t\t\r\n");
      out.write("   document.getElementById('dialogbox').style.display = \"none\";\r\n");
      out.write("\t\t\r\n");
      out.write("   document.getElementById('dialogoverlay').style.display = \"none\";\r\n");
      out.write("\t\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("   var Alert = new CustomAlert();\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                   </script>\r\n");
      out.write("              \r\n");
      out.write("                </section></section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- LOAD FILES AT PAGE END FOR FASTER LOADING -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- CORE JS FRAMEWORK - START --> \r\n");
      out.write("        <script src=\"js/jquery-1.11.2.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("        <script src=\"js/jquery.easing.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("        <script src=\"plugins/bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("        <script src=\"plugins/pace/pace.min.js\" type=\"text/javascript\"></script>  \r\n");
      out.write("        <script src=\"plugins/perfect-scrollbar/perfect-scrollbar.min.js\" type=\"text/javascript\"></script> \r\n");
      out.write("        <script src=\"plugins/viewport/viewportchecker.js\" type=\"text/javascript\"></script>  \r\n");
      out.write("        <!-- CORE JS FRAMEWORK - END --> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - START --> \r\n");
      out.write("        <script src=\"plugins/rickshaw-chart/vendor/d3.v3.js\" type=\"text/javascript\"></script> <script src=\"assets/plugins/jquery-ui/smoothness/jquery-ui.min.js\" type=\"text/javascript\"></script> <script src=\"assets/plugins/rickshaw-chart/js/Rickshaw.All.js\"></script><script src=\"assets/js/chart-rickshaw.js\" type=\"text/javascript\"></script><!-- OTHER SCRIPTS INCLUDED ON THIS PAGE - END --> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- CORE TEMPLATE JS - START --> \r\n");
      out.write("        <script src=\"js/scripts.js\" type=\"text/javascript\"></script> \r\n");
      out.write("        <!-- END CORE TEMPLATE JS - END --> \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
