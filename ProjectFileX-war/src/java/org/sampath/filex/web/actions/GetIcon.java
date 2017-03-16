/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class GetIcon extends HttpServlet {

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
            throws ServletException, IOException  {
        super.init();
        HttpSession session=request.getSession(false);
        if(session.getAttribute("eid")==null){
            response.sendRedirect("Login.jsp");
        }     
        String empid=(String)session.getAttribute("eid");
        
        response.setContentType("image/jpg");
        //PrintWriter out = response.getWriter();
        response.setHeader("Content-disposition","inline; filename=Logo.jpg" );
        
        
        
        Connection con=DatabaseConnection.createConnection();
        
        try {
   
        //InputStream inputStream = null; // input stream of the upload file
        ResultSet rset=null;
        ServletOutputStream os = response.getOutputStream();
        System.out.println("SOS done");
        PreparedStatement pstmt = con.prepareStatement("Select PHOTO from employee where empid='"+empid+"'");
        //pstmt.setString(1, bookId.trim());
        rset = pstmt.executeQuery();
        System.out.println("Query execution done");
        if (rset.next()){
               
                Blob blob = rset.getBlob("photo");
                if(blob==null)
                    response.sendRedirect("filexweb/images/user/user.png"); 
                else
                    System.out.println("NOT NULL");
                try{
                InputStream inputStream = blob.getBinaryStream();
                //OutputStream outputStream = new FileOutputStream(filePath);
                
                int bytesRead = -1;
                byte[] buffer = new byte[4096];
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }
                }
                catch(NullPointerException ex)
                {
                System.out.println("FOUND EXCEPTION");
                //InputStream is = new BufferedInputStream(new FileInputStream("user.png"));
                }
        }
        else
            System.out.println("File read faild");
        
            
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


