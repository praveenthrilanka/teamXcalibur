package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.sampath.filex.web.actions.Project;
import org.sampath.filex.web.actions.Employee;

public final class Comment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"shortcut icon\" href=\"logos/fav-icon.ico\" type=\"image/x-icon\"/>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Comment</title>\r\n");
      out.write("        \r\n");
      out.write("        ");

            session=request.getSession(false);
            System.out.println(session.getAttribute("eid")+"***"+session.getAttribute("pno"));
            Employee e=Employee.getEmployee((String)session.getAttribute("eid"));
            System.out.println("Employee done");
            Project p=Project.getProject((String)session.getAttribute("pno"));
            System.out.println("Project done");
        
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    </head>\r\n");
      out.write("     <body>\r\n");
      out.write("        <div style =\"margin: auto;width: 95%;border: 2px solid orange;position: absolute;top: 30%; left: 2%;  padding: 10px\">\r\n");
      out.write("          <form name=\"commentform\" method=\"post\" action=\"../SetComment\">\r\n");
      out.write("            <table>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td rowspan=\"2\"><img class=\"img-circle\" src=\"../GetIconByID?id=");
out.print(e.getEmployeeid());
      out.write("\" alt=\"User\" width=\"60\" height=\"60\"></td>\r\n");
      out.write("                        <td>Employe Name:</td>\r\n");
      out.write("                        \r\n");
      out.write("                        <td>");
 out.print(e.getEmployeename()); 
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                   <tr>\r\n");
      out.write("                        \r\n");
      out.write("                        <td><span style=\"color: #9d9d9d;\">Project Name:</span></td>\r\n");
      out.write("                        \r\n");
      out.write("                        <td><span style=\"color: #9d9d9d;\">");
 out.print(p.getProjectname()); 
      out.write("</span></td>\r\n");
      out.write("                        <br/>\r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                        <td colspan=\"3\"><textarea name=\"commentstr\" cols=\"45\" rows=\"4\" placeholder=\"Enter your comment here..!\"></textarea></td>\r\n");
      out.write("                        \r\n");
      out.write("                   </tr>\r\n");
      out.write("                   <tr>\r\n");
      out.write("                        <td><input type = \"submit\" name= \"commentbtn\" value = \"Comment\" ></td>\r\n");
      out.write("                                        \r\n");
      out.write("                   </tr>\r\n");
      out.write("                   \r\n");
      out.write("            </table>\r\n");
      out.write("          </form>\r\n");
      out.write("            \r\n");
      out.write("       </div>\r\n");
      out.write("          \r\n");
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
