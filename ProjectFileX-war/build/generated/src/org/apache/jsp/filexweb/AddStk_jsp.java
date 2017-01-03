package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddStk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html class=\" \">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- \r\n");
      out.write("      \r\n");
      out.write("        -->\r\n");
      out.write("        <meta http-equiv=\"content-type\" content=\"text/html;charset=UTF-8\" />\r\n");
      out.write("        <meta charset=\"utf-8\" />\r\n");
      out.write("        <title>Ultra Admin : Rickshaw Charts</title>\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />\r\n");
      out.write("        <meta content=\"\" name=\"description\" />\r\n");
      out.write("        <meta content=\"\" name=\"author\" />\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"assets/images/favicon.png\" type=\"image/x-icon\" />    <!-- Favicon -->\r\n");
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
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <!-- END HEAD -->\r\n");
      out.write("\r\n");
      out.write("    <!-- BEGIN BODY -->\r\n");
      out.write("    <body class=\" \" style=\"background-color: #f1f2f7;\"><!-- START TOPBAR -->\r\n");
      out.write("        \r\n");
      out.write("\t\t\r\n");
      out.write("        \r\n");
      out.write("        <!-- START CONTENT -->\r\n");
      out.write("            <section id=\"main-content\" class=\" \">\r\n");
      out.write("                <section class=\"wrapper\" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>\r\n");
      out.write("\t\t\t\t<div class=\"login-form\" style =\"\">\r\n");
      out.write("\t\t\t\t\t<h4>Add Stakeholders</h4>\r\n");
      out.write("\t\t\t\t\t<h5><strong></strong></h5>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t           <center>\r\n");
      out.write("                               <select id=\"drop\">\r\n");
      out.write("                                  <option value=\"1\">lahiru</option>\r\n");
      out.write("                                  <option value=\"2\">wela</option>\r\n");
      out.write("                                  <option value=\"3\">reshani</option>\r\n");
      out.write("                                  <option value=\"4\">erandi</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                                <br/><br/>\r\n");
      out.write("                        <button class=\"btn btn-warning\" onclick=\"myFunction()\">Add Stakeholder</button>\r\n");
      out.write("\t\t\t\t\t\t<br/>\r\n");
      out.write("\t\t\t\t\t</center>\r\n");
      out.write("                    <p id=\"demo\"><br/></p>\r\n");
      out.write("                    <br/><br/>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("                                            \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <script>\r\n");
      out.write("                var stk = [];\r\n");
      out.write("                var e = document.getElementById(\"drop\");\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    document.getElementById(\"demo\").innerHTML = stk;\r\n");
      out.write("\r\n");
      out.write("                function myFunction() {\r\n");
      out.write("                var e = document.getElementById(\"drop\");\r\n");
      out.write("                    var strUser = e.options[e.selectedIndex].text;\r\n");
      out.write("                    stk.push(strUser);\r\n");
      out.write("                    document.getElementById(\"demo\").innerHTML = stk;\r\n");
      out.write("                }\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("                </section></section>>\r\n");
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
      out.write("        <!-- General section box modal start -->\r\n");
      out.write("        <div class=\"modal\" id=\"section-settings\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ultraModal-Label\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog animated bounceInDown\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\r\n");
      out.write("                        <h4 class=\"modal-title\">Section Settings</h4>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("\r\n");
      out.write("                        Body goes here...\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-footer\">\r\n");
      out.write("                        <button data-dismiss=\"modal\" class=\"btn btn-default\" type=\"button\">Close</button>\r\n");
      out.write("                        <button class=\"btn btn-success\" type=\"button\">Save changes</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- modal end -->\r\n");
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
