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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddEmp extends HttpServlet {

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

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String dept = request.getParameter("depName");
        String msd = request.getParameter("msd");
        String pm = request.getParameter("pm");
        String ba = request.getParameter("ba");
        String stk = request.getParameter("stk");
        String email = request.getParameter("email");
        String mail=null;
        
        System.out.println("YOUR ID IS"+id+"4654"+name);
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
                PreparedStatement ps = con.prepareStatement("insert into employee(EMPID,EMPNAME,PASSWORD,DEPID,BA,PM,MSD,EXTSH,EMAIL) values('" + id + "','" + name + "','" + pw + "','" + dept + "','n','y','y','n','" + email + "')");
                ps.executeQuery();
            } else if ("y".equals(msd)) {
                PreparedStatement ps = con.prepareStatement("insert into employee(EMPID,EMPNAME,PASSWORD,DEPID,BA,PM,MSD,EXTSH,EMAIL) values('" + id + "','" + name + "','" + pw + "','" + dept + "','n','n','y','n','" + email + "')");
                ps.executeQuery();
            } else if ("y".equals(pm)) {
                PreparedStatement ps = con.prepareStatement("insert into employee(EMPID,EMPNAME,PASSWORD,DEPID,BA,PM,MSD,EXTSH,EMAIL) values('" + id + "','" + name + "','" + pw + "','" + dept + "','n','y','n','n','" + email + "')");
                ps.executeQuery();
            } else if ("y".equals(ba)) {
                PreparedStatement ps = con.prepareStatement("insert into employee(EMPID,EMPNAME,PASSWORD,DEPID,BA,PM,MSD,EXTSH,EMAIL) values('" + id + "','" + name + "','" + pw + "','" + dept + "','y','n','n','n','" + email + "')");
                ps.executeQuery();
            } else if ("y".equals(stk)) {
                PreparedStatement ps = con.prepareStatement("insert into employee(EMPID,EMPNAME,PASSWORD,DEPID,BA,PM,MSD,EXTSH,EMAIL) values('" + id + "','" + name + "','" + pw + "','" + dept + "','n','n','n','y','" + email + "')");
                ps.executeQuery();
            }

            System.out.println("Insert Employee");
            con.close();
              mail  = "Hello, "+name+""
                      + "\nWe are pleased to have you as a user of 'FileX',"
                      + "the Online Document Sharing and Approval System of Sampath Bank"
                      + " PLC.\n"
                      + "\nPlease use your username as the password in your initial login.\n"
                      + "We recommend you to change your password to ensure the security of your profile.";
                     
                    
            
            Mail.sendmail(email, "Welcome to FileX",mail);
            
            response.sendRedirect("filexweb/message.jsp?message=User added successfully.!");
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
