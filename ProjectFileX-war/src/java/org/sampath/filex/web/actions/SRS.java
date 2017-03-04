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
 * @author Ashantha
 */
public class SRS {

    
    private String pno;
    private String srsversion;
    private String change;
    private String date;
    
    public SRS(String pno, String srsversion, String change, String date) {
        this.pno = pno;
        this.srsversion = srsversion;
        this.change = change;
        this.date = date;
    }
    
    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getSrsversion() {
        return srsversion;
    }

    public void setSrsversion(String srsversion) {
        this.srsversion = srsversion;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }


  
    
    
      
    public static ArrayList<SRS> getSRSDetails(String pno){
        ArrayList<SRS> srsdetails=new ArrayList<SRS>();

        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select v.docno,v.srsversion,v.changes,v.modifieddate from versionhistory v,srs s \n" +
                                                      "where v.docno=s.docno and s.pno='"+pno+"' order by v.srsversion desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            SRS s;
            
            while(rs.next()){
                s= getSRSDetailsFromRS(rs);
                srsdetails.add(s);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return srsdetails;
    }
 
    public static SRS getSRSDetailsFromRS(ResultSet rs) throws SQLException {
         return new SRS(
                 rs.getString("DOCNO"),
                 rs.getString("SRSVERSION"),
                 rs.getString("CHANGES"),
                 rs.getString("MODIFIEDDATE"));
        
     } 
    
}