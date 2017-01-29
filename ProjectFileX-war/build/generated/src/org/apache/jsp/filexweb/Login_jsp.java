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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>FileX - Login</title>\n");
      out.write("<link rel=\"shortcut icon\" href=\"logos/fav-icon.ico\" type=\"image/x-icon\"/>\n");
      out.write("<link href=\"css/stylex.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script src=\"js/easyResponsiveTabs.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("<script> \n");
      out.write("            function validateForm() \n");
      out.write("            { if(document.login.un.value===\"\") \n");
      out.write("            { \n");
      out.write("            alert(\"User Name should not be blank..!\"); \n");
      out.write("            document.srslogin.srsid.focus(); \n");
      out.write("            return false;\n");
      out.write("            } \n");
      out.write("            if(document.login.pw.value===\"\") \n");
      out.write("            { \n");
      out.write("            alert(\"Password should not be blank..!\"); \n");
      out.write("            document.srslogin.srsid.focus(); \n");
      out.write("            return false;\n");
      out.write("            } \n");
      out.write("            } \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"main\">\n");
      out.write("\t\t<div class=\"login-form\">\n");
      out.write("\t\t\t<div class=\"sap_tabs w3ls-tabs\">\n");
      out.write("\t\t\t\t<div id=\"horizontalTab\" style=\"display: block; width: 100%; margin: 0px;\">\n");
      out.write("\t\t\t\t\t<ul class=\"resp-tabs-list\">\n");
      out.write("\t\t\t\t\t\t<li class=\"\"><img class=\"logo\" src=\"images/logo.png\"/></li> \n");
      out.write("\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"resp-tabs-container\">\n");
      out.write("\t\t\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-0\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"login-agileits-top\"> \n");
      out.write("\t\t\t\t\t\t\t\t<form name=\"login\" action=\"../SignIn\" method=\"post\" onsubmit=\"return validateForm();\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>User Name </p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"un\" required=\"\"/>\n");
      out.write("\t\t\t\t\t\t\t\t\t<p>Password</p>\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"password\" name=\"pw\" required=\"\"/>\t \n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" id=\"brand\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label for=\"brand\"><span></span> Remember me ?</label> \n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"LOGIN\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>  \n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div> \n");
      out.write("\t\t\t\t\t\t<div class=\"tab-1 resp-tab-content\" aria-labelledby=\"tab_item-1\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t</div>\t \n");
      out.write("\t\t\t</div> \n");
      out.write("\n");
      out.write("\t\t\t <script> \n");
      out.write("\t            function validateForm() \n");
      out.write("\t            { if(document.login.UserName.value===\"\") \n");
      out.write("\t            { \n");
      out.write("\t            alert(\"User Name should not be blank..!\"); \n");
      out.write("\t            return false;\n");
      out.write("\t            } \n");
      out.write("\t            if(document.login.Password.value===\"\") \n");
      out.write("\t            { \n");
      out.write("\t            alert(\"Password should not be blank..!\"); \n");
      out.write("\t            return false;\n");
      out.write("\t            } \n");
      out.write("\t            } \n");
      out.write("  \t\t\t</script>\n");
      out.write("  \n");
      out.write("\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t$(document).ready(function () {\n");
      out.write("\t\t\t\t\t$('#horizontalTab').easyResponsiveTabs({\n");
      out.write("\t\t\t\t\t\ttype: 'default',        \n");
      out.write("\t\t\t\t\t\twidth: 'auto',\n");
      out.write("\t\t\t\t\t\tfit: true  \n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\n");
      out.write("\t\t</div>\t\n");
      out.write("\t</div>\t\n");
      out.write("</body>\n");
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
