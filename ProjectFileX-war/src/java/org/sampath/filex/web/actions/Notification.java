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
public class Notification {

    private String empname;
    private String pname;
    private String datentime;
    private String pno;
    
    public Notification(String empname, String pname, String datentime,String pno) {
        this.empname = empname;
        this.pname = pname;
        this.datentime = datentime;
        this.pno=pno;
    }
    
    
    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }
    
    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDatentime() {
        return datentime;
    }

    public void setDatentime(String datentime) {
        this.datentime = datentime;
    }
      
    
    public static int notificationInfo(String empid)
    {
        int commentscount=0;
        
         Connection con=DatabaseConnection.createConnection();
        try {
            PreparedStatement ps=con.prepareStatement("select count(empid) as countcom from notifiedlist where empid='it004' and status is null");
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
              commentscount=Integer.parseInt(rs.getString("COUNTCOM"));
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        
        return commentscount;
    }
    
    public static ArrayList<Notification> getNotificationByEMPID(String empid)
    {
        ArrayList<Notification> notification=new ArrayList<Notification>();
        Connection con=DatabaseConnection.createConnection();
        try {
            PreparedStatement ps=con.prepareStatement("select e.empname,p.pname,c.createddatentime,p.pno,e.empid\n" +
                                                      "from notifiedlist l, notification n,comments c, employee e,srs s, project p \n" +
                                                      "where l.notifino=n.notifino and n.comno=c.comno and c.empid=e.empid and c.srsno=s.docno and s.pno=p.pno and l.empid='"+empid+"' and l.status is null order by c.comno desc");
            
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            Notification n;
            
            while(rs.next()){
                if(rs.getString("EMPID").equals(empid))
                    continue;
                n= getNotificationFromRS(rs);
                notification.add(n);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return notification;
    }
    
    public static Notification getNotificationFromRS(ResultSet rs) throws SQLException {
            
            return new Notification(
                 rs.getString("EMPNAME"),
                 rs.getString("PNAME"),
                 rs.getString("CREATEDDATENTIME"),
                 rs.getString("PNO"));
     }
    
}
