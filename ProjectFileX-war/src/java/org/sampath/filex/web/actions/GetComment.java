/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ashantha
 */
public class GetComment extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        FileControll fc=new FileControll();
        
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("Driver Found");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Driver not Found"+ex);
        }
        try {
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
            System.out.println("Connection Established");
            PreparedStatement ps=con.prepareStatement("select * from employee e,comments c where e.EMPID=c.EMPID and c.SRSNO='"+fc.srsid+"' order by comno desc");
            ResultSet rs=ps.executeQuery();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<link rel=\"stylesheet\" href=\"css/ManualCSS.css\">");
            out.println("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">");
            out.println("<script src=\"js/jquery.min.js\"></script>");
            out.println("<script src=\"js/bootstrap.min.js\"></script>");
            out.println("<head>");
            out.println("<title>Servlet GetComment</title>");          
            out.println("</head>");
            out.println("<body style=\"background-image: url(Filex.jpg); background-repeat: no-repeat; background-size: 20% auto;\">");
            
            
            out.println("<br/><br/><br/>");
            out.println("<div style =\"margin: auto;width: 95%; left: 1%;  padding: 1px\">");
            out.println("<a  href=\"Comment.jsp\" class=\"btn btn-info\" role=\"button\">Comment</a>");
            out.println("</div>");
            out.println("<br/><br/><br/>");
            out.println("<div style =\"margin: auto;width: 90%;position:absolute; border:1px solid lightgray;top: 18%; left: 3%;  padding: 5px\">");
            while(rs.next()){
            //String date = rs.getString("date");
            //System.out.println(date);  
            
            out.println("<table height=\"5%\">");
            out.println("<tr>");
            out.println("<td rowspan=\"3\"><img class=\"image-responsive\" src=\"user2.jpeg\" alt=\"User\" width=\"50\" height=\"50\"></td>");
            out.println("<td>"+rs.getString("empname")+"</td>");        
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+rs.getString("createddatentime")+"</td>");            
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+rs.getString("description")+"</td>");            
            out.println("</tr>");
            out.println("</table>");
            out.println("<hr width=\"95%\">");
            
            }
            /*out.println("</div>");
            out.println("<form action=\"../Intermediate\" method=\"post\">");
            out.println("<input type=\"submit\" value=\"Comment\"/>");
            out.println("</form>");*/
            
                    
            
            
            out.println("</body>");
            out.println("</html>");
            
            //response.sendRedirect("filexweb/Comment.jsp");
            
        } catch (SQLException ex) {
            Logger.getLogger(DataBaseConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
