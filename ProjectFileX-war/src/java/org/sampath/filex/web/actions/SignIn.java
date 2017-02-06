/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

import org.sampath.filex.web.actions.DatabaseConnection;

/**
 *
 * @author Ashantha
 */
public class SignIn extends HttpServlet {

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
       
            Connection con=DatabaseConnection.createConnection();
            String un=request.getParameter("un");
            String pw=request.getParameter("pw");
            
            pw=EncryptPassword.cryptWithMD5(pw);
            System.out.println(pw);
            
            HttpSession session=request.getSession();
            session.setAttribute("eid", un);
            
            //Mail.sendmail("ashantha.lahiru@gmail.com,erandiatapattu@gmail.com", "Test Title", "Test");

        try {            
            PreparedStatement ps=con.prepareStatement("select * from employee where empid='"+un+"'");
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                System.out.println("empid"+rs.getString("empid")+"//"+un);
                System.out.println("pword"+rs.getString("password")+"//"+pw);
                if(rs.getString("empid").trim().equals(un.trim()) && rs.getString("password").trim().equals(pw.trim()))
                {
                    
                    if(rs.getString("ba").equals("y") && rs.getString("pm").equals("n") && rs.getString("msd").equals("n") && rs.getString("extsh").equals("n")){
                        response.sendRedirect("filexweb/BA_Projects.jsp");
                        session.setAttribute("home", "BA_Projects.jsp");
                    }
                    else if(rs.getString("ba").equals("n") && rs.getString("pm").equals("y") && rs.getString("msd").equals("n") && rs.getString("extsh").equals("n")){
                        response.sendRedirect("filexweb/PM_Projects.jsp");
                        session.setAttribute("home", "PM_Projects.jsp");
                    }
                    else if(rs.getString("ba").equals("n") && rs.getString("pm").equals("y") && rs.getString("msd").equals("y") && rs.getString("extsh").equals("n")){
                        response.sendRedirect("filexweb/MSDnPM.jsp");
                        session.setAttribute("home", "MSDnPM.jsp");
                    }
                    else if(rs.getString("ba").equals("n") && rs.getString("pm").equals("n") && rs.getString("msd").equals("y") && rs.getString("extsh").equals("n")){
                        response.sendRedirect("filexweb/MSD_Dashboard.jsp");
                        session.setAttribute("home", "MSD_Dashboard.jsp");
                    }
                    else if(rs.getString("ba").equals("n") && rs.getString("pm").equals("n") && rs.getString("msd").equals("n") && rs.getString("extsh").equals("y")){
                        response.sendRedirect("filexweb/ExStkLogin.jsp");
                        session.setAttribute("home", "ExStkLogin.jsp");
                    }
                    else if(rs.getString("ba").equals("x") && rs.getString("pm").equals("x") && rs.getString("msd").equals("x") && rs.getString("extsh").equals("x")){
                        response.sendRedirect("filexweb/Admin_Dashboard.jsp");
                        session.setAttribute("home", "Admin_Dashboard.jsp");
                    }
                    else
                        response.sendRedirect("filexweb/Login-invalid.jsp");    
                }
                else
                    response.sendRedirect("filexweb/Login-invalid.jsp");
            }
            else{
            System.out.println("There is no such a EmployeeID");
            response.sendRedirect("filexweb/Login-invalid.jsp");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
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
