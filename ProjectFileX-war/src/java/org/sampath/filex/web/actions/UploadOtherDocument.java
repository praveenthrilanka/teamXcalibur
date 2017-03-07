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
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig(maxFileSize = 16177215)
public class UploadOtherDocument extends HttpServlet {

     
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
        
        
        
       
      //  String docid=request.getParameter("docID"); 
       
        String newDocName = request.getParameter("narration");
        
        String docType = request.getParameter("doctype");
        
        String pno =(String)session.getAttribute("pno");
        
        Connection con=DatabaseConnection.createConnection();
        
       
        
         try {
             
        

        InputStream inputStream = null; // input stream of the upload file
         
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("otherFile");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
            System.out.println("File found,");
            

            PreparedStatement statement = con.prepareStatement("INSERT INTO otherdocument(docno, doctypeid ,doc, pno,docname) values (?,?,?,?,?)");
           
            // setting up values to columns.
            
            statement.setString(1,"");  // generated dinamically in the table
            
            System.out.println("set1 done");
            
            statement.setString(2,docType);
            
            System.out.println("set 2 is done");
            
            
            if (inputStream != null) {
                // fetches input stream of the upload file for the blob column
                statement.setBinaryStream(3,inputStream,inputStream.available());
                System.out.println("Input Stream Done");
            }
            
            statement.setString(4,pno);  // called by the session
            
            System.out.println("set 4 is done");
            
            statement.setString(5, newDocName);
            
           
 
            int row = statement.executeUpdate();
            if (row > 0) {
                System.out.println("Document uploaded and saved into database");
            }
            con.close();
            response.sendRedirect("filexweb/message.jsp?message=Document uploaded successfully..!");
            
        }
        else 
            System.out.println("No file found");
        
            
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
