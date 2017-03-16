/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EditUser extends HttpServlet {

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

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String dept = request.getParameter("depName");
        String msd = request.getParameter("msd");
        String pm = request.getParameter("pm");
        String ba = request.getParameter("ba");
        String stk = request.getParameter("stk");
        String email = request.getParameter("email");

        String pw = EncryptPassword.cryptWithMD5(id);
        System.out.println(pw);
        
        try {
            Connection con = DatabaseConnection.createConnection();
            System.out.println("Connection Established");

            if ("y".equals(msd) && "y".equals(ba) || "y".equals(msd) && "y".equals(stk) || "y".equals(pm) && "y".equals(ba) || "y".equals(pm) && "y".equals(stk) || "y".equals(ba) && "y".equals(stk) || "y".equals(msd) && "y".equals(pm) && "y".equals(ba) || "y".equals(msd) && "y".equals(pm) && "y".equals(stk) || "y".equals(pm) && "y".equals(ba) && "y".equals(stk) || "y".equals(msd) && "y".equals(ba) && "y".equals(stk) || "y".equals(msd) && "y".equals(pm) && "y".equals(ba) && "y".equals(stk)) {
                con.close();
                response.sendRedirect("filexweb/message.jsp?message=Invalid Entry. Please try again!");
            }

            if ("y".equals(msd) && "y".equals(pm)) {
                PreparedStatement ps = con.prepareStatement("update employee set EMPNAME='"+name+"',PASSWORD='"+pw+"',DEPID='"+dept+"',BA='n',PM='y',MSD='y',EXTSH='n',EMAIL='"+email+"' where EMPID='"+id+"'");
                ps.executeQuery();
            } else if ("y".equals(msd)) {
                PreparedStatement ps = con.prepareStatement("update employee set EMPNAME='"+name+"',PASSWORD='"+pw+"',DEPID='"+dept+"',BA='n',PM='n',MSD='y',EXTSH='n',EMAIL='"+email+"' where EMPID='"+id+"'");
                ps.executeQuery();
            } else if ("y".equals(pm)) {
                PreparedStatement ps = con.prepareStatement("update employee set EMPNAME='"+name+"',PASSWORD='"+pw+"',DEPID='"+dept+"',BA='n',PM='y',MSD='n',EXTSH='n',EMAIL='"+email+"' where EMPID='"+id+"'");
                ps.executeQuery();
            } else if ("y".equals(ba)) {
                PreparedStatement ps = con.prepareStatement("update employee set EMPNAME='"+name+"',PASSWORD='"+pw+"',DEPID='"+dept+"',BA='y',PM='n',MSD='n',EXTSH='n',EMAIL='"+email+"' where EMPID='"+id+"'");
                ps.executeQuery();
            } else if ("y".equals(stk)) {
                PreparedStatement ps = con.prepareStatement("update employee set EMPNAME='"+name+"',PASSWORD='"+pw+"',DEPID='"+dept+"',BA='n',PM='n',MSD='n',EXTSH='y',EMAIL='"+email+"' where EMPID='"+id+"'");
                ps.executeQuery();
            }

            System.out.println("Insert Employee");
            con.close();
            response.sendRedirect("filexweb/message.jsp?message=User Updated successfully.!");
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
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
