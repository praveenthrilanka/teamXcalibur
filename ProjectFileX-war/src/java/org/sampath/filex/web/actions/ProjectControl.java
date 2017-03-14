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

/**
 *
 * @author Ashantha
 */
public class ProjectControl extends HttpServlet {

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
        Date dte=new Date();
        HttpSession session=request.getSession();
        
        String pname=request.getParameter("pname");
        String pm=request.getParameter("pm");
        String ba=request.getParameter("ba");
        String msd=(String)session.getAttribute("eid");
        String notifino=null;
        String pno=null;
    

        
         
        if(request.getParameter("baassigned")!=null)
            response.sendRedirect("filexweb/PMLogin.jsp?eid="+ba);
        else if(request.getParameter("pmassigned")!=null)
            response.sendRedirect("filexweb/PMLogin2.jsp?eid="+pm);
        else
        {
            
             if(pm!=null && ba!=null){  
            try {
                Connection con=DatabaseConnection.createConnection();
                System.out.println("Connection Established");

                PreparedStatement ps=con.prepareStatement("insert into Project(PNAME,CREATEDDATENTIME,BAID,PMID,MSDID) values('"+pname+"','"+DateString.getDate(dte.toString())+"','"+ba+"','"+pm+"','"+msd+"')");
                ps.executeQuery();

                ps=con.prepareStatement("insert into notification(prono) values (PRO_SEQ.currval)");
                ps.executeQuery();
                System.out.println("Insert second Done ");
                ps=con.prepareStatement("SELECT notification_seq.currval as NOTIFINO FROM DUAL");
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                    notifino=rs.getString("NOTIFINO");

                ps=con.prepareStatement("SELECT PRO_SEQ.currval as PRONO FROM DUAL");
                rs=ps.executeQuery();
                if(rs.next())
                    pno=rs.getString("PRONO");

                System.out.println(pno+"Insert Done "+notifino);

                Notification.setNotificationByProject(notifino,pno);

                con.close();

            } catch (SQLException ex) {
                Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Something went wrong in Connection "+ex);
            }



         
            response.sendRedirect("filexweb/message.jsp?message=Project created successfully.!");
            
            
         }else
        {
          response.sendRedirect("filexweb/failmessage.jsp?failmessage=Assign both PM and BA to create a project.!");

        }
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
