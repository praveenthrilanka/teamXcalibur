package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_002dinvalid_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html><head>\r\n");
      out.write("        <title>FileX - Login</title>\r\n");
      out.write("        <link href=\"css/style-login-error.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"> \r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <br/><br/><br/><br/>\r\n");
      out.write("        <div class=\"not-found\" style=\"background-color:black; opacity:0.8;\">\r\n");
      out.write("            <div class=\"notfound-top\"><br>\r\n");
      out.write("                <img src=\"images/logo.png\" width=\"150px\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"content\">\r\n");
      out.write("                <img src=\"images/warning.gif\" alt=\"\" title=\"\" width=\"100px\">\r\n");
      out.write("                <br><br><font color=\"red\" size=\"4pt\">Invalid username or password</font>\r\n");
      out.write("                <br><br><button type=\"button\" class=\"btn btn-warning\" onclick=\"window.location.href = 'Login.jsp'\">Try Again</button>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"clear\"> </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body></html>");
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
