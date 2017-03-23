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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class SetComment extends HttpServlet {

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
        String comment = request.getParameter("commentstr");
        Date date = new Date();
        HttpSession session = request.getSession(false);
        String srsid = (String) session.getAttribute("srsid");
        String eid = (String) session.getAttribute("eid");
        String notifino = null;

        try {
            Connection con = DatabaseConnection.createConnection();
            String datentime = DateString.getDate(date.toString());
            
            String editedString = comment.replace("'","''");
            
            PreparedStatement ps = con.prepareStatement("insert into comments values(emp_sequence.nextval,'" + editedString + "','" + datentime + "','" + session.getAttribute("eid") + "','" + srsid + "')");
            ps.executeQuery();
            System.out.println("Insert first Done ");
            //NOTIFICATION
            ps = con.prepareStatement("insert into notification(comno) values (EMP_SEQUENCE.currval)");
            ps.executeQuery();
            System.out.println("Insert second Done ");
            ps = con.prepareStatement("SELECT notification_seq.currval as NOTIFINO FROM DUAL");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                notifino = rs.getString("NOTIFINO");
            }
            //NOTIFICATION
            System.out.println("Insert Done " + notifino);

            Notification.setNotification(notifino, srsid, eid);

        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
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
