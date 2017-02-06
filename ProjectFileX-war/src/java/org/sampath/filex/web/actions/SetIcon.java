/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

/**
 *
 * @author Ashantha
 */
@MultipartConfig(maxFileSize = 16177215)
public class SetIcon extends HttpServlet {

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
        //PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        String eid = (String) session.getAttribute("eid");


            String editedpw=request.getParameter("pw");
            String email=request.getParameter("email");
            
            editedpw=EncryptPassword.cryptWithMD5(editedpw);
            System.out.println(editedpw);
            
         Connection con=DatabaseConnection.createConnection();
        
         try {

        InputStream inputStream = null; // input stream of the upload file
         
        // obtains the upload file part in this multipart request
        
        Part filePart = request.getPart("logo");
        System.out.println(editedpw);
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
            System.out.println("File found,");
            

            PreparedStatement statement = con.prepareStatement("update employee set photo=?,password=?,email=?  where empid=?");

            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBinaryStream(1,inputStream,inputStream.available());
                System.out.println("Input Stream Done");
            }
            statement.setString(2,editedpw);
            statement.setString(3,email);
            statement.setString(4,eid);


                int row = statement.executeUpdate();
                if (row > 0) {
                    System.out.println("File uploaded and saved into database");
                }

                response.sendRedirect("filexweb/message.jsp?message=Profile pictutre successfully updated.!");

            } else {
                System.out.println("No file found");
            }

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
