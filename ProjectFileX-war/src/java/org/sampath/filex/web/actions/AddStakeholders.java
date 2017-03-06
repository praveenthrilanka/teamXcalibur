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
import javax.servlet.http.HttpSession;
import org.sampath.filex.web.actions.Project;
import org.sampath.filex.web.actions.Stakeholder;
/**
 *
 * @author Ashantha
 */
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
        
        String selection;
        String priority;
        String docno=request.getParameter("docno");
        String srsversion=Project.getSRSVersionByDOCID(docno);
        int count=Integer.parseInt(request.getParameter("count"));
          
        try {
            Connection con=DatabaseConnection.createConnection();
            System.out.println("Connection Established");

            for(int x=0;x<count;x++)
            {
            selection=request.getParameter("selection"+x);
            priority=request.getParameter("prio"+x);
                if(selection.equals("0"))
                    continue;
                else{
                System.out.println(docno+"   |  "+selection+"   |  "+priority);



                PreparedStatement ps=con.prepareStatement("insert/*+append*/ into srsapprovedby values ('"+docno+"','"+srsversion+"','"+selection+"','"+priority+"','noresponse')");

                ResultSet rs=ps.executeQuery();
                }
            }
            
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
   
        response.sendRedirect("filexweb/message.jsp?message=Stakeholders added successfully..!");
        
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
