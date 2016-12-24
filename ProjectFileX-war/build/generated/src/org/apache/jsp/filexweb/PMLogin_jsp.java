package org.apache.jsp.filexweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import org.sampath.filex.web.actions.Project;

public final class PMLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            \n");
      out.write("            td{\n");
      out.write("                padding:15px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        ");

            session=request.getSession(false);
       
        ArrayList<Project> project=Project.getProjectByEid((String)session.getAttribute("eid"));
        System.out.println("Output test2");
        
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body background=\"SampathBack.jpg\">\n");
      out.write("       \n");
      out.write("         <div style=\"text-align:center;  margin: auto;width: 50%; position: absolute;top: 10%; left: 20%;  padding: 10px\">\n");
      out.write("            <h2>Currently Assigned Projects</h2>   \n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div style=\"overflow-y:scroll; height:fit-content; text-align: left; margin:auto; position:absolute; left:20%; padding:10%\">\n");
      out.write("                   \n");
      out.write("        <table border=\"0px\" >\n");
      out.write("           \n");
      out.write("           <tr>\n");
      out.write("           <td>Project No</td>\n");
      out.write("           <td>Project Name</td>\n");
      out.write("           <td>Date Created</td>\n");
      out.write("           <td>BA ID</td>\n");
      out.write("           <td>PM ID</td>\n");
      out.write("           <td>MSD ID</td>\n");
      out.write("           </tr>\n");
      out.write("     \n");
      out.write("           \n");
      out.write("        \n");
      out.write("        ");

        Project pr;    
        for(int x=0;x<project.size();x++){
        
        pr=project.get(x);
        
      out.write("\n");
      out.write("      \n");
      out.write("       <tr>\n");
      out.write("       <td> ");
 out.print(pr.getProjectno()); 
      out.write("</td>        \n");
      out.write("       <td><a>");
 out.print(pr.getProjectname()); 
      out.write("</a></td>            \n");
      out.write("       <td>");
 out.print(pr.getDatentime()); 
      out.write("</td>            \n");
      out.write("       <td>");
 out.print(pr.getBaid()); 
      out.write("</td>            \n");
      out.write("       <td>");
 out.print(pr.getPmid()); 
      out.write("</td>            \n");
      out.write("       <td>");
 out.print(pr.getMsdid()); 
      out.write("</td> \n");
      out.write("       </tr>\n");
      out.write("       ");
 }
      out.write("\n");
      out.write("       </table>\n");
      out.write("       </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
