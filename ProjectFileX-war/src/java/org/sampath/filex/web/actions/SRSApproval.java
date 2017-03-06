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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Ashantha
 */
public class SRSApproval extends HttpServlet {

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
       HttpSession session=request.getSession();
       String pno=(String)session.getAttribute("pno");
       String eshid=(String)session.getAttribute("eid");
       String status=request.getParameter("status");
       
        try {
            Connection con=DatabaseConnection.createConnection();
            System.out.println("Connection Established");
            
            PreparedStatement ps=con.prepareStatement("select docno from srs where pno='"+pno+"'");
            ResultSet rs=ps.executeQuery();
            String docno=null;
            if(rs.next())
                docno=rs.getString("DOCNO");
            
            if(status.equals("approve"))
            {
                ps=con.prepareStatement("update srsapprovedby set status='approved' where stkid='"+eshid+"' and srsversion='"+Project.getSRSVersionByDOCID(docno)+"' and docno='"+docno+"'");
                rs=ps.executeQuery();
            }
            else if(status.equals("reject"))
            {
                ps=con.prepareStatement("update srsapprovedby set status='rejected' where stkid='"+eshid+"' and srsversion='"+Project.getSRSVersionByDOCID(docno)+"' and docno='"+docno+"'");
                rs=ps.executeQuery();
            }
            
            con.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        
        response.sendRedirect("filexweb/SubWall.jsp");
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
