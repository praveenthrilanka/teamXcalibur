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

    
    private String projectname;
    private String msdname;
    private String pmname;
    private String baname;
    private String srsversion;
    private String description;
    private String datentime;
    
    public SRS(String projectname, String msdname, String pmname, String baname, String srsversion, String description, String datentime) {
        this.projectname = projectname;
        this.msdname = msdname;
        this.pmname = pmname;
        this.baname = baname;
        this.srsversion = srsversion;
        this.description = description;
        this.datentime = datentime;
    }
    
    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getMsdname() {
        return msdname;
    }

    public void setMsdname(String msdname) {
        this.msdname = msdname;
    }

    public String getPmname() {
        return pmname;
    }

    public void setPmname(String pmname) {
        this.pmname = pmname;
    }

    public String getBaname() {
        return baname;
    }

    public void setBaname(String baname) {
        this.baname = baname;
    }

    public String getSrsversion() {
        return srsversion;
    }

    public void setSrsversion(String srsversion) {
        this.srsversion = srsversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDatentime() {
        return datentime;
    }

    public void setDatentime(String datentime) {
        this.datentime = datentime;
    }
    
      
    public static ArrayList<SRS> getSRSDetails(String srsid){
        ArrayList<SRS> srsdetails=new ArrayList<SRS>();

        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from employee e,comments c where e.EMPID=c.EMPID and c.SRSNO='"+srsid+"' order by comno desc");
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
                 rs.getString("COMNO"),
                 rs.getString("DESCRIPTION"),
                 rs.getString("CREATEDDATENTIME"),
                 rs.getString("EMPID"),
                 rs.getString("SRSNO"),
                 rs.getString("AGRNO"),
                 rs.getString("EMPNAME"));
        
     } 
    
}
