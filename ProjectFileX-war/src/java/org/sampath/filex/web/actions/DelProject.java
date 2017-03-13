/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Nisha
 */
@WebServlet(name = "DelProject", urlPatterns = {"/DelProject"})
public class DelProject extends HttpServlet {

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
       System.out.println("________________");
      
            String adminpw=request.getParameter("adminpw");   
            String pno=request.getParameter("pno");        

            
            System.out.println("wooooooooooooooork"+adminpw);
            
        if(adminpw==null)
     {
         response.sendRedirect("filexweb/failmessage.jsp?failmessage=Admin password should ot be null !");
         
     }
     
     else
      
     {
      
            adminpw=EncryptPassword.cryptWithMD5(adminpw);
            System.out.println(adminpw);
            
            
            try{
                Connection con=DatabaseConnection.createConnection();
                System.out.println("Connection Establishedoooooo");
                
                
                PreparedStatement ps=con.prepareStatement("select * from employee where empid='ADMIN'");
                ResultSet rs=ps.executeQuery();
                
                
                if(rs.next()){
                      System.out.println("Connection true");

                    
                    if(rs.getString("password").trim().equals(adminpw.trim()))
                    {
                        
                           System.out.println("Connection trueeeeeeeeeeee");

                        PreparedStatement ps1=con.prepareStatement("Delete from Project where pno='"+pno+"'");
                        ps1.executeQuery();
                          System.out.println("pno"+pno);

                        
                        System.out.println("Query Works");
                        
                        
                        response.sendRedirect("filexweb/message.jsp?message=project deleted successfully !");
                        
                        
                    }
                    else
                    {
                        response.sendRedirect("filexweb/failmessage.jsp?failmessage=Incorrect admin password ! Try again");
                        
                        
                    }
                }
                
                
                
                
            }   catch (SQLException ex) {
                Logger.getLogger(DelProject.class.getName()).log(Level.SEVERE, null, ex);
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
