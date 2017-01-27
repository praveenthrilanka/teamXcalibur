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
    private String empid;
    
    public Notification(String empname, String pname, String datentime,String pno,String empid) {
        this.empname = empname;
        this.pname = pname;
        this.datentime = datentime;
        this.pno=pno;
        this.empid=empid;
    }
    
    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
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
                 rs.getString("PNO"),
                 rs.getString("EMPID"));
     }
    
    public static void setNotification(String notifino,String docid){
     
         Connection con=DatabaseConnection.createConnection();
        try {
            PreparedStatement ps=con.prepareStatement("select unique baid,pmid,msdid from comments c,srs s,project p where c.srsno=s.docno and s.pno=p.pno and s.docno='"+docid+"'");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                ps=con.prepareStatement("insert into notifiedlist values ('"+notifino+"','"+rs.getString("BAID")+"','')");
                ps.executeQuery();
                ps=con.prepareStatement("insert into notifiedlist values ('"+notifino+"','"+rs.getString("PMID")+"','')");
                ps.executeQuery();
                ps=con.prepareStatement("insert into notifiedlist values ('"+notifino+"','"+rs.getString("MSDID")+"','')");
                ps.executeQuery();
            }
            
            ps=con.prepareStatement("select stkid from SRSApprovedBy where docno='"+docid+"' and srsversion='"+Project.getSRSVersionByDOCID(docid)+"'");
            rs=ps.executeQuery();
            while(rs.next())
            {
                ps=con.prepareStatement("insert into notifiedlist values ('"+notifino+"','"+rs.getString("stkid")+"','')");
                ps.executeQuery();
            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
     
     }
    
     public static void setNotificationByProject(String notifino,String pno){
     
            Connection con=DatabaseConnection.createConnection();
            try {
            PreparedStatement ps=con.prepareStatement("select baid,pmid from project where pno='"+pno+"'");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                ps=con.prepareStatement("insert into notifiedlist values ('"+notifino+"','"+rs.getString("BAID")+"','')");
                ps.executeQuery();
                ps=con.prepareStatement("insert into notifiedlist values ('"+notifino+"','"+rs.getString("PMID")+"','')");
                ps.executeQuery();
                
            }
            
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
     
     }
     
     public static ArrayList<Notification> getProjectNotificationByEMPID(String empid)
    {
        ArrayList<Notification> notification=new ArrayList<Notification>();
        Connection con=DatabaseConnection.createConnection();
        try {
            PreparedStatement ps=con.prepareStatement("select e.empname,p.pname,p.createddatentime,p.pno,e.empid\n" +
                                                      "from notifiedlist l, notification n, employee e, project p \n" +
                                                      "where l.notifino=n.notifino and n.prono=p.pno and p.msdid=e.empid and l.empid='"+empid+"' and l.status is null order by p.pno desc");
            
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
     
     public static void setNotificationBySRS(String notifino,String pno){
            Connection con=DatabaseConnection.createConnection();
            try {
            PreparedStatement ps=con.prepareStatement("select msdid,pmid from project where pno='"+pno+"'");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {   
                System.out.println("Sub query start");
                ps=con.prepareStatement("insert into notifiedlist values ('"+notifino+"','"+rs.getString("PMID")+"','')");
                ps.executeQuery();
                System.out.println("Sub query 1 done");
                ps=con.prepareStatement("insert into notifiedlist values ('"+notifino+"','"+rs.getString("MSDID")+"','')");
                ps.executeQuery();
                System.out.println("Sub query 2 done");
            }
            
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
     
     }
     
     public static ArrayList<Notification> getSRSNotificationByEMPID(String empid)
    {
        ArrayList<Notification> notification=new ArrayList<Notification>();
        Connection con=DatabaseConnection.createConnection();
        try {
            PreparedStatement ps=con.prepareStatement("select e.empname,p.pname,p.createddatentime,p.pno,e.empid\n" +
"  from notifiedlist l, notification n, employee e, project p,srs s\n" +
"  where l.notifino=n.notifino and n.srsno=s.docno and s.pno=p.pno and p.baid=e.empid and l.empid='it010' and l.status is null order by s.docno desc");
            
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
     
     
}
