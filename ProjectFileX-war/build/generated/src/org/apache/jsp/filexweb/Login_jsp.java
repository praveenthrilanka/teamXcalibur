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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ManualCSS.css\">\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body {\r\n");
      out.write("            background-image: url(\"SampathBack.jpg\");\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-size: 100% auto;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("        \r\n");
      out.write("        <script> \r\n");
      out.write("            function validateForm() \r\n");
      out.write("            { if(document.login.un.value===\"\") \r\n");
      out.write("            { \r\n");
      out.write("            alert(\"User Name should not be blank..!\"); \r\n");
      out.write("            document.srslogin.srsid.focus(); \r\n");
      out.write("            return false;\r\n");
      out.write("            } \r\n");
      out.write("            if(document.login.pw.value===\"\") \r\n");
      out.write("            { \r\n");
      out.write("            alert(\"Password should not be blank..!\"); \r\n");
      out.write("            document.srslogin.srsid.focus(); \r\n");
      out.write("            return false;\r\n");
      out.write("            } \r\n");
      out.write("            } \r\n");
      out.write("  \t</script>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body background=\"SampathBack.jpg\">\r\n");
      out.write("        <div style=\"text-align:center;  margin: auto;width: 40%;border: 2px solid orange;position: absolute;top: 25%; left: 30%;  padding: 10px\">\r\n");
      out.write("            <h2>Login</h2>\r\n");
      out.write("            <form name=\"login\" action=\"../SignIn\" method=\"post\" onsubmit=\"return validateForm();\">\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label>Employee ID:</label>\r\n");
      out.write("                <input type=\"text\" name=\"un\" class=\"form-control\" placeholder=\"Enter ID\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"form-group\">\r\n");
      out.write("                <label for=\"pwd\">Password:</label>\r\n");
      out.write("                <input type=\"password\" name=\"pw\" class=\"form-control\" placeholder=\"Enter password\">\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"checkbox\">\r\n");
      out.write("                <label><input type=\"checkbox\"> Remember me</label>\r\n");
      out.write("              </div>\r\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default\">Sign In</button>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
