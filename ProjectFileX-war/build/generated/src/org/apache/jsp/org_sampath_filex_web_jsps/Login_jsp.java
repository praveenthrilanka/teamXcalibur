package org.apache.jsp.org_sampath_filex_web_jsps;

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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ManualCSS.css\">\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("            background-image: url(\"SampathBack.jpg\");\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-size: 100% auto;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <script> \n");
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
      out.write("  \t</script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body background=\"SampathBack.jpg\">\n");
      out.write("        <div style=\"text-align:center;  margin: auto;width: 40%;border: 2px solid orange;position: absolute;top: 25%; left: 30%;  padding: 10px\">\n");
      out.write("            <h2>Login</h2>\n");
      out.write("            <form name=\"login\" action=\"../DataBaseConnection\" method=\"post\" onsubmit=\"return validateForm();\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label>Employee ID:</label>\n");
      out.write("                <input type=\"text\" name=\"un\" class=\"form-control\" placeholder=\"Enter ID\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"pwd\">Password:</label>\n");
      out.write("                <input type=\"password\" name=\"pw\" class=\"form-control\" placeholder=\"Enter password\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"checkbox\">\n");
      out.write("                <label><input type=\"checkbox\"> Remember me</label>\n");
      out.write("              </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-default\">Sign In</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
