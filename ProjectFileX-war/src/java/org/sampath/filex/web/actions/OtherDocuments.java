/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reshani
 */

public class OtherDocuments {
    private String doctypeid;
    private String pno;
    private String docname;
    private String docno;
    
    public OtherDocuments(String doctypeid, String pno, String docname,String docno){
      this.doctypeid = doctypeid ;
      this.pno = pno;
      this.docname = docname;
      this.docno = docno;
      
    }
    
    public String getDocno(){
        return docno;
    }
    
    public void setString(String docno){
        this.docno = docno;
    }
    
    public String getDocName(){
        return docname;
    }
    
    public void setDocName(String docname){
        this.docname = docname;
    }
    
    public String getDoctypeId(){
        return doctypeid;
    }
    
    public void setDoctypeid(String doctypeid){
        this.doctypeid = doctypeid;
    }
    
    public String getPno(){
        return pno;
    }
    
    public void setPno(String pno){
        this.pno = pno;
    }
    
     public static OtherDocuments getDocumentFromRS(ResultSet rs) throws SQLException {
         return new OtherDocuments(
                 
                 rs.getString("DOCTYPEID"),
                 rs.getString("PNO"),
                 rs.getString("DOCNAME"),
                 rs.getString("DOCNO"));
                 
        
     }
     
     public static ArrayList<OtherDocuments> getDocuments(String doctypeid , String pno){
        ArrayList<OtherDocuments> document = new ArrayList<OtherDocuments>();
        
        System.out.println(doctypeid);
        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from otherdocument d where d.doctypeid = '"+doctypeid+"' and d.pno = '"+pno+"'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            OtherDocuments od;
            
            while(rs.next()){
                od= getDocumentFromRS(rs);
                document.add(od);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return document;
    }
     
     
     
    
            
}
