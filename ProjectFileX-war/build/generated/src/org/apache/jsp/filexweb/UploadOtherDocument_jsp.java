package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import org.sampath.filex.web.actions.Document;
import java.util.ArrayList;
import org.sampath.filex.web.actions.Notification;
import org.sampath.filex.web.actions.Employee;
import org.sampath.filex.web.actions.Project;

public final class UploadOtherDocument_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/filexweb/Up.jsp");
    _jspx_dependants.add("/filexweb/BA_Sidebar_Project.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\" \">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- \r\n");
      out.write("         * @Package: Ultra Admin - Responsive Theme\r\n");
      out.write("         * @Subpackage: Bootstrap\r\n");
      out.write("         * @Version: 2.0\r\n");
      out.write("         * This file is part of Ultra Admin Theme.\r\n");
      out.write("        -->\r\n");
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

            if(session.getAttribute("eid")==null)
            response.sendRedirect("Login.jsp");
            
            Employee e = Employee.getEmployee((String) session.getAttribute("eid"));


        
      out.write("\r\n");
      out.write("        \r\n");
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
      out.write("                        <li class=\"message-toggle-wrapper\">\r\n");
      out.write("                            <a href=\"#\" data-toggle=\"dropdown\" class=\"toggle\">\r\n");
      out.write("                                <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("                                <span class=\"badge badge-primary\">7</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu messages animated fadeIn\">\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"list\">\r\n");
      out.write("\r\n");
      out.write("                                    <ul class=\"dropdown-menu-list list-unstyled ps-scrollbar\">\r\n");
      out.write("                                        <li class=\"unread status-available\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"user-img\">\r\n");
      out.write("                                                    <img src=\"data/profile/avatar-1.png\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Clarine Vassar</strong>\r\n");
      out.write("                                                        <span class=\"time small\">- 15 mins ago</span>\r\n");
      out.write("                                                        <span class=\"profile-status available pull-right\"></span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <span class=\"desc small\">\r\n");
      out.write("                                                        Sometimes it takes a lifetime to win a battle.\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" status-away\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"user-img\">\r\n");
      out.write("                                                    <img src=\"data/profile/avatar-2.png\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Brooks Latshaw</strong>\r\n");
      out.write("                                                        <span class=\"time small\">- 45 mins ago</span>\r\n");
      out.write("                                                        <span class=\"profile-status away pull-right\"></span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <span class=\"desc small\">\r\n");
      out.write("                                                        Sometimes it takes a lifetime to win a battle.\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" status-busy\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"user-img\">\r\n");
      out.write("                                                    <img src=\"data/profile/avatar-3.png\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Clementina Brodeur</strong>\r\n");
      out.write("                                                        <span class=\"time small\">- 1 hour ago</span>\r\n");
      out.write("                                                        <span class=\"profile-status busy pull-right\"></span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <span class=\"desc small\">\r\n");
      out.write("                                                        Sometimes it takes a lifetime to win a battle.\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" status-offline\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"user-img\">\r\n");
      out.write("                                                    <img src=\"data/profile/avatar-4.png\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Carri Busey</strong>\r\n");
      out.write("                                                        <span class=\"time small\">- 5 hours ago</span>\r\n");
      out.write("                                                        <span class=\"profile-status offline pull-right\"></span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <span class=\"desc small\">\r\n");
      out.write("                                                        Sometimes it takes a lifetime to win a battle.\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" status-offline\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"user-img\">\r\n");
      out.write("                                                    <img src=\"data/profile/avatar-5.png\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Melissa Dock</strong>\r\n");
      out.write("                                                        <span class=\"time small\">- Yesterday</span>\r\n");
      out.write("                                                        <span class=\"profile-status offline pull-right\"></span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <span class=\"desc small\">\r\n");
      out.write("                                                        Sometimes it takes a lifetime to win a battle.\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" status-available\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"user-img\">\r\n");
      out.write("                                                    <img src=\"data/profile/avatar-1.png\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Verdell Rea</strong>\r\n");
      out.write("                                                        <span class=\"time small\">- 14th Mar</span>\r\n");
      out.write("                                                        <span class=\"profile-status available pull-right\"></span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <span class=\"desc small\">\r\n");
      out.write("                                                        Sometimes it takes a lifetime to win a battle.\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" status-busy\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"user-img\">\r\n");
      out.write("                                                    <img src=\"data/profile/avatar-2.png\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Linette Lheureux</strong>\r\n");
      out.write("                                                        <span class=\"time small\">- 16th Mar</span>\r\n");
      out.write("                                                        <span class=\"profile-status busy pull-right\"></span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <span class=\"desc small\">\r\n");
      out.write("                                                        Sometimes it takes a lifetime to win a battle.\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" status-away\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"user-img\">\r\n");
      out.write("                                                    <img src=\"data/profile/avatar-3.png\" alt=\"user-image\" class=\"img-circle img-inline\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Araceli Boatright</strong>\r\n");
      out.write("                                                        <span class=\"time small\">- 16th Mar</span>\r\n");
      out.write("                                                        <span class=\"profile-status away pull-right\"></span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                    <span class=\"desc small\">\r\n");
      out.write("                                                        Sometimes it takes a lifetime to win a battle.\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("\r\n");
      out.write("                                    </ul>\r\n");
      out.write("\r\n");
      out.write("                                </li>\r\n");
      out.write("\r\n");
      out.write("                                <li class=\"external\">\r\n");
      out.write("                                    <a href=\"javascript:;\">\r\n");
      out.write("                                        <span>Read All Messages</span>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("                        ");

                            ArrayList<Notification> notifications =Notification.getNotificationByEMPID(e.getEmployeeid());
                            int count= Notification.notificationInfo(e.getEmployeeid());
                        
      out.write("\r\n");
      out.write("                        <li class=\"notify-toggle-wrapper\">\r\n");
      out.write("                            <a href=\"#\" data-toggle=\"dropdown\" class=\"toggle\">\r\n");
      out.write("                                <i class=\"fa fa-bell\"></i>\r\n");
      out.write("                                <span class=\"badge badge-orange\">");
 out.print(count); 
      out.write("</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu notifications animated fadeIn\">\r\n");
      out.write("                                <li class=\"total\">\r\n");
      out.write("                                    <span class=\"small\">\r\n");
      out.write("                                        You have <strong>3</strong> new notifications.\r\n");
      out.write("                                        <a href=\"javascript:;\" class=\"pull-right\">Mark all as Read</a>\r\n");
      out.write("                                    </span>\r\n");
      out.write("                                </li>\r\n");
      out.write("                                <li class=\"list\">\r\n");
      out.write("\r\n");
      out.write("                                    <ul class=\"dropdown-menu-list list-unstyled ps-scrollbar\">\r\n");
      out.write("                                        ");

                                            
                                            Notification n;
                                            for(int x=0;x<notifications.size();x++){
                                            n=notifications.get(x);
                                            
                                        
      out.write("\r\n");
      out.write("                                        <li class=\"unread available\"> \r\n");
      out.write("                                            <a href=\"../SetUser?pno=");
 out.print(n.getPno()); 
      out.write("&direct=ba\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <img class=\"notification-icon\" src=\"../GetIconByID?id=");
out.print(n.getEmpid());
      out.write("\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>");
 out.print(n.getEmpname()); 
      out.write(" commented on project - ");
 out.print(n.getPname()); 
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
      out.write("                                        \r\n");
      out.write("                                        ");
  
                                            notifications =Notification.getProjectNotificationByEMPID(e.getEmployeeid());
                                            for(int x=0;x<notifications.size();x++){
                                            n=notifications.get(x);
                                        
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                                        <li class=\"unread away\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    \r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <img class=\"notification-icon\" src=\"../GetIconByID?id=");
out.print(n.getEmpid());
      out.write("\">\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>");
 out.print(n.getEmpname()); 
      out.write(" assigned you as the ");
 out.print(e.getPosition()); 
      out.write(" of the Project - ");
 out.print(n.getPname()); 
      out.write("</strong>\r\n");
      out.write("                                                        <span class=\"time small\">");
 out.print(n.getDatentime()); 
      out.write("</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        \r\n");
      out.write("                                        ");

                                        }
                                        
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                                        ");
  
                                            notifications =Notification.getSRSNotificationByEMPID(e.getEmployeeid());
                                            for(int x=0;x<notifications.size();x++){
                                            n=notifications.get(x);
                                        
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                                        <li class=\"unread away\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <img class=\"notification-icon\" src=\"../GetIconByID?id=");
out.print(n.getEmpid());
      out.write("\">\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>");
 out.print(n.getEmpname()); 
      out.write(" uploaded the SRS of the Project - ");
 out.print(n.getPname()); 
      out.write("</strong>\r\n");
      out.write("                                                        <span class=\"time small\">");
 out.print(n.getDatentime()); 
      out.write("</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        \r\n");
      out.write("                                        ");

                                        }
                                        
      out.write("\r\n");
      out.write("                                        \r\n");
      out.write("                                        <!--<li class=\"unread away\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <i class=\"fa fa-envelope\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>45 new messages</strong>\r\n");
      out.write("                                                        <span class=\"time small\">45 mins ago</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" busy\"> \r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <i class=\"fa fa-times\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Server IP Blocked</strong>\r\n");
      out.write("                                                        <span class=\"time small\">1 hour ago</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" offline\">\r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <i class=\"fa fa-user\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>10 Orders Shipped</strong>\r\n");
      out.write("                                                        <span class=\"time small\">5 hours ago</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" offline\"> \r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <i class=\"fa fa-user\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>New Comment on blog</strong>\r\n");
      out.write("                                                        <span class=\"time small\">Yesterday</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" available\"> \r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <i class=\"fa fa-check\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Great Speed Notify</strong>\r\n");
      out.write("                                                        <span class=\"time small\">14th Mar</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                        <li class=\" busy\"> \r\n");
      out.write("                                            <a href=\"javascript:;\">\r\n");
      out.write("                                                <div class=\"notice-icon\">\r\n");
      out.write("                                                    <i class=\"fa fa-times\"></i>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div>\r\n");
      out.write("                                                    <span class=\"name\">\r\n");
      out.write("                                                        <strong>Team Meeting at 6PM</strong>\r\n");
      out.write("                                                        <span class=\"time small\">16th Mar</span>\r\n");
      out.write("                                                    </span>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>-->\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("        <!-- START CONTAINER -->\r\n");
      out.write("        <div class=\"page-container row-fluid\">\r\n");
      out.write("            \r\n");
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
      out.write('\n');
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                <ul class='wraplist'>\t\r\n");
      out.write("                        \r\n");
      out.write("                    ");

                    String pno=(String)session.getAttribute("pno");
                    if(pno!=null){
                    Project p=Project.getProject(pno);
                    String srsid="Not Uploaded";
                    try{
                    if(p.getSrsid()!=null){
                    session.setAttribute("srsid", p.getSrsid() );
                    srsid=p.getSrsid();}
                    else
                    srsid="Not Uploaded";
                    }
                    catch(NullPointerException ex){
                    
                    }
                    
      out.write("  \r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"open\"> <a> <i class=\"fa fa-folder-open\"></i> <span class=\"title\">");
 out.print(p.getProjectname()); 
      out.write("</span></a>\r\n");
      out.write("                            <ul class=\"sub-menu\">\r\n");
      out.write("                                <li > <a> <span class=\"title\">SRS ID : ");
 out.print(srsid); 
      out.write("</span> </a> </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                    ");

                    }
                    
      out.write("\r\n");
      out.write("                            \r\n");
      out.write("                            <br/><br/>\r\n");
      out.write("                        <li class=\"\"> \r\n");
      out.write("                            <a href=\"BA_Projects.jsp\">\r\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i>\r\n");
      out.write("                                <span class=\"title\">Home</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- MAIN MENU - END -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <!--  SIDEBAR - END -->\r\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("            <!-- START CONTENT -->\n");
      out.write("            <section id=\"main-content\" class=\" \">\n");
      out.write("                <section class=\"wrapper\" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>\n");
      out.write("\t\t<div class=\"login-form\" style =\"\">\n");
      out.write("                    <h4>Upload Documents</h4>\n");
      out.write("\n");
      out.write("                        <form name=\"AddOtherDocument\" method=\"post\" action=\"../UploadOtherDocument\" enctype=\"multipart/form-data\">\n");
      out.write("\n");
      out.write("                        <label>Document ID:</label>\n");
      out.write("                            <input type=\"text\" name=\"docID\" placeholder=\"Enter Document ID\" required> <br/><br/>\n");
      out.write("                                            \n");
      out.write("                             ");

                                
                                                ArrayList<Document> dd = Document.getDocumentType();
                                                //String prefList = s.getCompanies();
                                                //ArrayList<Company> list = CompanyDA.getCompany(s.getField()) ; 
                                                int num = dd.size();
                                                if(num==0){
                                                    out.print("Sorry. No Document types  available.!");
                                                }
                                                else{
                                                    for(int i=0;i<num;i++){
                                                        //prefList=prefList.replace(list.get(i).getShortName(),""+(i+1));

                                           
                             
      out.write("  \n");
      out.write("                             \n");
      out.write("                            <select name=\"");
      out.print("doctype"+i );
      out.write("\" id=\"");
      out.print(i );
      out.write("\";\">  \n");
      out.write("                            <option value = \"0\">Select Document Type</option>\n");
      out.write("                            \n");
      out.write("                            ");

                                
                               for(int j=0;j<num;j++){

                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <option value =");
      out.print(dd.get(j). getDoctypeid() );
      out.write(' ');
      out.write('>');
      out.print(dd.get(j).getDoctype() );
      out.write(" </option>\n");
      out.write("                            ");

                                    
                                }
                            
      out.write("\n");
      out.write("                            <option vlaue = \"add\" href = \"#\">(+)Add new..</option>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            </select>\n");
      out.write("                            \n");
      out.write("                            ");

                                                   }
                                               }
                                            
      out.write("\n");
      out.write("                           \n");
      out.write("                            <br />\n");
      out.write("                            <br />\n");
      out.write("                            <br />\n");
      out.write("                            \n");
      out.write("                                    \n");
      out.write("                                <div style=\"display:block; margin:auto; width:30%;\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/upload.png\" id=\"output\" width=\"130\" height=\"130\"/>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t\t<div style=\"display:block; margin:auto; width:45%;\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"file\" name=\"otherFile\" accept=\".pdf , .docx \" onchange=\"loadFile(event)\" required/>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t    <br/><br/><br/>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("                            <input style=\"background-color:#FF9D26; border:none;\" class=\"btn btn-info btn-block\" type=\"submit\" value=\"Upload Document\">\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\t\t\t\n");
      out.write("                                            \n");
      out.write("                        <script>\n");
      out.write("\t\t\t\t\t\t  var loadFile = function(event) {\n");
      out.write("\t\t\t\t\t\t    var output = document.getElementById('output');\n");
      out.write("\t\t\t\t\t\t    output.src = URL.createObjectURL(event.target.files[0]);\n");
      out.write("\t\t\t\t\t\t  };\n");
      out.write("\t\t\t</script>\n");
      out.write("                </section></section>>\n");
      out.write("\n");
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
