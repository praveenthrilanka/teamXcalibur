package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>FileX - Login</title>\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"logos/fav-icon.ico\" type=\"image/x-icon\"/>\r\n");
      out.write("        <link href=\"css/stylex.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            function validateForm()\r\n");
      out.write("            {\r\n");
      out.write("                if (document.login.un.value === \"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"User Name should not be blank..!\");\r\n");
      out.write("                    document.srslogin.srsid.focus(null,null,document;\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if (document.login.pw.value === \"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Password should not be blank..!\");\r\n");
      out.write("                    document.srslogin.srsid.focus();\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("           history.pushState(null,null,document.URL);\r\n");
      out.write("                window.addEventListener('popstate',function(){\r\n");
      out.write("                    history.pushState(null,null,document.URL);\r\n");
      out.write("                    \r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <br/><br/><br/>\r\n");
      out.write("            <div class=\"login-form\">\r\n");
      out.write("                <div class=\"sap_tabs w3ls-tabs\">\r\n");
      out.write("                    <div id=\"horizontalTab\" style=\"display: block; width: 100%; margin: 0px;\">\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"resp-tabs-list\">\r\n");
      out.write("                            <li class=\"\"><img width=\"1050\" src=\"images/logo.png\"/></li> \r\n");
      out.write("                        </ul>\t\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"resp-tabs-container\">\r\n");
      out.write("                            <div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-0\">\r\n");
      out.write("                                <div class=\"login-agileits-top\"> \r\n");
      out.write("                                    <form name=\"login\" action=\"../SignIn\" method=\"post\" onsubmit=\"return validateForm();\">\r\n");
      out.write("                                        <p>User Name </p>\r\n");
      out.write("                                        <input type=\"text\" name=\"un\" required=\"\"/>\r\n");
      out.write("                                        <p>Password</p>\r\n");
      out.write("                                        <input type=\"password\" name=\"pw\" required=\"\"/>\t \r\n");
      out.write("                                        <br/><br/>\r\n");
      out.write("                                        <input type=\"submit\" value=\"LOGIN\">\r\n");
      out.write("                                    </form>  \r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div> \r\n");
      out.write("                            <div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-1\">\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\t\t\t\t\t\t\t\r\n");
      out.write("                    </div>\t \r\n");
      out.write("                </div> \r\n");
      out.write("\r\n");
      out.write("                <script type=\"text/javascript\">\r\n");
      out.write("                    function validateForm()\r\n");
      out.write("                    {\r\n");
      out.write("                        if (document.login.UserName.value === \"\")\r\n");
      out.write("                        {\r\n");
      out.write("                            alert(\"User Name should not be blank..!\");\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                        if (document.login.Password.value === \"\")\r\n");
      out.write("                        {\r\n");
      out.write("                            alert(\"Password should not be blank..!\");\r\n");
      out.write("                            return false;\r\n");
      out.write("                        }\r\n");
      out.write("                    }\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                 history.pushState(null,null,document.URL);\r\n");
      out.write("                 window.addEventListener('popstate',function(){\r\n");
      out.write("                 history.pushState(null,null,document.URL);\r\n");
      out.write("                    \r\n");
      out.write("                });\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                    $(document).ready(function () {\r\n");
      out.write("                        $('#horizontalTab').easyResponsiveTabs({\r\n");
      out.write("                            type: 'default',\r\n");
      out.write("                            width: 'auto',\r\n");
      out.write("                            fit: true\r\n");
      out.write("                        });\r\n");
      out.write("                    });\r\n");
      out.write("                </script>\r\n");
      out.write("\r\n");
      out.write("            </div>\t\r\n");
      out.write("        </div>\t\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
