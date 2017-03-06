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
import java.sql.ResultSet;
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

            
            HttpSession session=request.getSession(false);
            String eid=(String) session.getAttribute("eid");

            String editedpw=request.getParameter("pw");
            String emailnew=request.getParameter("email");
            
            String newpass=request.getParameter("npw");
            String cnewpass=request.getParameter("cnpw");
            
           String editedcnewpass=EncryptPassword.cryptWithMD5(cnewpass);

            
            editedpw=EncryptPassword.cryptWithMD5(editedpw);
            System.out.println(editedpw);
            
         Connection con=DatabaseConnection.createConnection();
         
         
try {
          
            
            
     PreparedStatement ps=con.prepareStatement("select * from employee where empid='"+eid+"'");
     ResultSet rs=ps.executeQuery();
         
    if(rs.next()){
         
        if(rs.getString("empid").trim().equals(eid.trim()) && rs.getString("password").trim().equals(editedpw.trim())){     
         boolean piccheck= request.getParameter("propicchk")!=null;
         boolean pwcheck= request.getParameter("pwchk")!=null;
         boolean emailcheck= request.getParameter("emailchk")!=null;

         
         if((piccheck== true && emailcheck==false && pwcheck==false)){
                    
           InputStream inputStream = null; // input stream of the upload file
         
           // obtains the upload file part in this multipart request
        
           Part filePart = request.getPart("logo");
           //System.out.println(editedpw);
           if (filePart != null){
           // prints out some information for debugging
           System.out.println(filePart.getName());
           System.out.println(filePart.getSize());
           System.out.println(filePart.getContentType());
             
           // obtains input stream of the upload file
           inputStream = filePart.getInputStream();
           System.out.println("File found,");
            

           PreparedStatement statement = con.prepareStatement("update employee set photo=?  where empid=?");

           if (inputStream != null){
                // fetches input stream of the upload file for the blob column
                statement.setBinaryStream(1,inputStream,inputStream.available());
                System.out.println("Input Stream Done");
           }
            
           statement.setString(2,eid);

           int row = statement.executeUpdate();
              if (row > 0) {
              System.out.println("File uploaded and saved into database");
              }
            
           response.sendRedirect("filexweb/message.jsp?message=Your rofile pictutre updated successfully.!");
         
            
           }
            else 
            System.out.println("No file found");
                     

        
       
         }  
         
         else if((piccheck==false && emailcheck==true && pwcheck==false)){
             
            PreparedStatement statement = con.prepareStatement("update employee set email=?  where empid=?");
            statement.setString(1,emailnew);
            statement.setString(2,eid);
                         
            int row = statement.executeUpdate();
            if(row > 0){
                System.out.println("File uploaded and saved into database");
            }
      

            response.sendRedirect("filexweb/message.jsp?message=Your email address updated successfully.!");

                  
        }
        
         
         else if((piccheck==false && emailcheck==false && pwcheck==true)){
             
            if(newpass.equals(cnewpass) && !(newpass.equals("") && (cnewpass.equals("")))){
   
                PreparedStatement statement = con.prepareStatement("update employee set password=? where empid=?");
    
                statement.setString(1,editedcnewpass);
                statement.setString(2,eid);


                int row = statement.executeUpdate();
                if (row>0) {
                   System.out.println("File uploaded and saved into database");
                }
                response.sendRedirect("filexweb/message.jsp?message=Your password updated successfully.!");
             


            }
            
            else if(cnewpass.equals("") && (!newpass.equals(""))){
            
                response.sendRedirect("filexweb/failmessage.jsp?failmessage=Confirm your password!");
            }
            
            else if(newpass.equals("") && (!cnewpass.equals(""))){
            
                response.sendRedirect("filexweb/failmessage.jsp?failmessage=Enter your new password first!");
            }
            
            else if(newpass.equals("") && (cnewpass.equals(""))){
            
                response.sendRedirect("filexweb/failmessage.jsp?failmessage=Fill out the password fields!");
            }
            
            
            else{
             
                response.sendRedirect("filexweb/failmessage.jsp?failmessage=Passwords do not match!");

            }
          
         
        }
         
         else if((piccheck==true && emailcheck==true && pwcheck==false)){
         
                          
           InputStream inputStream = null; // input stream of the upload file
         
           // obtains the upload file part in this multipart request
        
           Part filePart = request.getPart("logo");
           //System.out.println(editedpw);
           if (filePart != null){
           // prints out some information for debugging
           System.out.println(filePart.getName());
           System.out.println(filePart.getSize());
           System.out.println(filePart.getContentType());
             
           // obtains input stream of the upload file
           inputStream = filePart.getInputStream();
           System.out.println("File found,");
            

           PreparedStatement statement = con.prepareStatement("update employee set photo=?  where empid=?");

           if (inputStream != null){
                // fetches input stream of the upload file for the blob column
                statement.setBinaryStream(1,inputStream,inputStream.available());
                System.out.println("Input Stream Done");
           }
            
           statement.setString(2,eid);

           int row = statement.executeUpdate();
              if (row > 0) {
              System.out.println("File uploaded and saved into database");
              }
            
         
            
           }
            else 
            System.out.println("No file found");
                     
           PreparedStatement statement1 = con.prepareStatement("update employee set email=?  where empid=?");
            statement1.setString(1,emailnew);
            statement1.setString(2,eid);
                         
            int row = statement1.executeUpdate();
            if(row > 0){
                System.out.println("File uploaded and saved into database");
            }
         

            response.sendRedirect("filexweb/message.jsp?message=Your Profile Picture and E-mail Address updated successfully.!");

        
         
         }
         
         
         
         
         else if((piccheck== true && emailcheck==false && pwcheck==true)){
                InputStream inputStream = null; // input stream of the upload file
         
           // obtains the upload file part in this multipart request
        
           Part filePart = request.getPart("logo");
           //System.out.println(editedpw);
           if (filePart != null){
           // prints out some information for debugging
           System.out.println(filePart.getName());
           System.out.println(filePart.getSize());
           System.out.println(filePart.getContentType());
             
           // obtains input stream of the upload file
           inputStream = filePart.getInputStream();
           System.out.println("File found,");
            

           PreparedStatement statement = con.prepareStatement("update employee set photo=?  where empid=?");

           if (inputStream != null){
                // fetches input stream of the upload file for the blob column
                statement.setBinaryStream(1,inputStream,inputStream.available());
                System.out.println("Input Stream Done");
           }
            
           statement.setString(2,eid);

           int row = statement.executeUpdate();
              if (row > 0) {
              System.out.println("File uploaded and saved into database");
              }
            
            
           }
            else 
            System.out.println("No file found");
           
           
           
              if(newpass.equals(cnewpass) && !(newpass.equals("") && (cnewpass.equals("")))){
   
                PreparedStatement statement = con.prepareStatement("update employee set password=? where empid=?");
    
                statement.setString(1,editedcnewpass);
                statement.setString(2,eid);


                int row = statement.executeUpdate();
                if (row>0) {
                   System.out.println("File uploaded and saved into database");
                }
                response.sendRedirect("filexweb/message.jsp?message=Your Password and Profile Picture updated successfully.!");
               


            }
            
            else if(cnewpass.equals("") && (!newpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Profile Picture updated successfully..Please confirm your password to change it!");
            }
            
            else if(newpass.equals("") && (!cnewpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Profile Picture updated successfully..First enter your new password  to change it!");
            }
            
            else if(newpass.equals("") && (cnewpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Profile Picture updated successfully..Please fill out the password fields to change your password!");
            }
            
            
            else{
             
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Profile Picture updated successfully.Entered new passwords do not match!");

            }
             
         
         
         }
         
         
         else if((piccheck==false && emailcheck==true && pwcheck==true)){
             
             
             if(newpass.equals(cnewpass) && !(newpass.equals("") && (cnewpass.equals("")))){
   
                PreparedStatement statement = con.prepareStatement("update employee set password=? where empid=?");
    
                statement.setString(1,editedcnewpass);
                statement.setString(2,eid);


                int row = statement.executeUpdate();
                if (row>0) {
                   System.out.println("File uploaded and saved into database");
                }
                response.sendRedirect("filexweb/message.jsp?message=Your Email and Password  updated successfully.!");
            


            }
            
            else if(cnewpass.equals("") && (!newpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Your E-nail Address updated successfully..Please confirm your password to change it!");
            }
            
            else if(newpass.equals("") && (!cnewpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Your E-mail Address updated successfully..First enter your new password  to change it!");
            }
            
            else if(newpass.equals("") && (cnewpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Your E-mail Address updated successfully..Please fill out the password fields to change your password!");
            }
            
            
            else{
             
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Your E-mail Address  updated successfully.Entered new passwords do not match!");

            }
          
              PreparedStatement statement = con.prepareStatement("update employee set email=?  where empid=?");
            statement.setString(1,emailnew);
            statement.setString(2,eid);
                         
            int row = statement.executeUpdate();
            if(row > 0){
                System.out.println("File uploaded and saved into database");
            }
            
             
         }
         
         else if((pwcheck==true) && (piccheck==true) &&(emailcheck==true)){
           

               
             if(newpass.equals(cnewpass) && !(newpass.equals("") && (cnewpass.equals("")))){
   
                PreparedStatement statement = con.prepareStatement("update employee set password=? where empid=?");
    
                statement.setString(1,editedcnewpass);
                statement.setString(2,eid);


                int row = statement.executeUpdate();
                if (row>0) {
                   System.out.println("File uploaded and saved into database");
                }
                response.sendRedirect("filexweb/message.jsp?message=Your E-mail Address, Profile Picture and the Password updated successfully.!");
            


            }
            
            else if(cnewpass.equals("") && (!newpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Your E-nail Address and Profile Picture updated successfully..Please confirm your password to change it!");
            }
            
            else if(newpass.equals("") && (!cnewpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Your E-mail Address and Profile Picture updated successfully..First enter your new password  to change it!");
            }
            
            else if(newpass.equals("") && (cnewpass.equals(""))){
            
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Your E-mail Address and Profile Picture updated successfully..Please fill out the password fields to change your password!");
            }
            
            
            else{
             
                response.sendRedirect("filexweb/Successandfailmessage.jsp?sfmessage=Your E-mail Address and Profile Picture updated successfully.Entered new passwords do not match!");

            }
          
              PreparedStatement statemente = con.prepareStatement("update employee set email=?  where empid=?");
            statemente.setString(1,emailnew);
            statemente.setString(2,eid);
                         
            int rowe = statemente.executeUpdate();
            if(rowe > 0){
                System.out.println("File uploaded and saved into database");
            }
             
            
                 InputStream inputStream = null; // input stream of the upload file
         
           // obtains the upload file part in this multipart request
        
           Part filePart = request.getPart("logo");
           //System.out.println(editedpw);
           if (filePart != null){
           // prints out some information for debugging
           System.out.println(filePart.getName());
           System.out.println(filePart.getSize());
           System.out.println(filePart.getContentType());
             
           // obtains input stream of the upload file
           inputStream = filePart.getInputStream();
           System.out.println("File found,");
            

           PreparedStatement statement1 = con.prepareStatement("update employee set photo=?  where empid=?");

           if (inputStream != null){
                // fetches input stream of the upload file for the blob column
                statement1.setBinaryStream(1,inputStream,inputStream.available());
                System.out.println("Input Stream Done");
           }
            
           statement1.setString(2,eid);

           int row1 = statement1.executeUpdate();
              if (row1 > 0) {
              System.out.println("File uploaded and saved into database");
              }
            
       
            
           }
            else 
            System.out.println("No file found");
           
             
         }
         
         
        
        
          if ((pwcheck==false) && (piccheck==false) &&(emailcheck==false)){
         
                   response.sendRedirect("filexweb/failmessage.jsp?failmessage=Please use the checkboxes to select the change you wish to make!");

         
        }
           

        
        } else
             response.sendRedirect("filexweb/failmessage.jsp?failmessage=failed to edit your profile.! Please enter the correct password");

        
   } 
       
         
        
} catch (SQLException ex) {
            Logger.getLogger(SetIcon.class.getName()).log(Level.SEVERE, null, ex);
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
