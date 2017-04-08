/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpSession;
import org.sampath.filex.web.actions.Project;
import org.sampath.filex.web.actions.Stakeholder;

public class AddStakeholders extends HttpServlet {

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
        HttpSession session=request.getSession(false);
        String selection;
        String priority;
        String docno=request.getParameter("docno");
        String srsversion=Project.getSRSVersionByDOCID(docno);
        int count=Integer.parseInt(request.getParameter("count"));
        Project p=Project.getProject((String)session.getAttribute("pno"));
        Date dte=new Date();  
        String date;
        try {
            Connection con=DatabaseConnection.createConnection();
            System.out.println("Connection Established");

            for(int x=0;x<count;x++)
            {
                
            date="novalue";
            selection=request.getParameter("selection_"+x);
            priority=request.getParameter("prio_"+x);
                if(selection.equals("0"))
                    continue;
                else{
                System.out.println(docno+"   |  "+selection+"   |  "+priority);
                if(priority.equals("1"))
                {
                    
                    String mail="You have been assigned to the project '"+p.getProjectname()+"'.\n\n"
                            + "Please log in to FileX system to refer the document and feel free to "
                            + "approve/reject document with your suggestions.\n\n"
                            + "Thank You.";
                    
                    PreparedStatement ps=con.prepareStatement("select email from employee where empid='"+selection+"'");
                    ResultSet rs=ps.executeQuery();
                    if(rs.next())
                    Mail.sendmail(rs.getString("EMAIL"), "Kind Reminder",mail);
                    date=DateString.getDate(dte.toString());
                }
                
                PreparedStatement ps=con.prepareStatement("insert/*+append*/ into srsapprovedby values ('"+docno+"','"+srsversion+"','"+selection+"','"+priority+"','noresponse','novalue','"+date+"')");

                ResultSet rs=ps.executeQuery();
                }
            }
            
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
   
        response.sendRedirect("filexweb/AddStakeHolders.jsp");
        
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
