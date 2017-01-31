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
public class Stakeholder {

    private String empid;
    private String name;
    private String department;
    private String priorityno;
    private String status;
    
    public Stakeholder(String empid, String name, String department, String priorityno, String status) {
        this.empid = empid;
        this.name = name;
        this.department = department;
        this.priorityno = priorityno;
        this.status = status;
    }
    
    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPriorityno() {
        return priorityno;
    }

    public void setPriorityno(String priorityno) {
        this.priorityno = priorityno;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static ArrayList<Stakeholder> getStakeholders(String pno,String version){
        ArrayList<Stakeholder> stakeholder=new ArrayList<Stakeholder>();

        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select e.empid,e.empname,a.priorityno,a.status,d.depnme,a.srsversion,s.pno from srsapprovedby a, employee e, department d,srs s\n" +
                                                      "where s.docno=a.docno and a.stkid=e.empid and e.depid=d.depid and s.pno='"+pno+"' and a.srsversion='"+version+"' order by priorityno");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            Stakeholder s;
            
            while(rs.next()){
                s= getStakeholdersFromRS(rs);
                stakeholder.add(s);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return stakeholder;
    }
 
    public static Stakeholder getStakeholdersFromRS(ResultSet rs) throws SQLException {
         return new Stakeholder(
                 rs.getString("EMPID"),
                 rs.getString("EMPNAME"),
                 rs.getString("DEPNME"),
                 rs.getString("PRIORITYNO"),
                 rs.getString("STATUS"));
        
     }
    
      public static void setStakeholders(String pno,String version){

        ArrayList<Stakeholder> stakeholder=Stakeholder.getStakeholders(pno,String.valueOf(Integer.parseInt(version)-1));
        System.out.print("Added"+version+"Size"+stakeholder.size());
        
        Connection con=DatabaseConnection.createConnection();
        try {
            Stakeholder s=null;
            for(int x=0;x<stakeholder.size();x++)
            {
                s=stakeholder.get(x);
                System.out.println(s.getName()+"Added"+version);
                PreparedStatement ps=con.prepareStatement("insert into srsapprovedby values((SELECT docno FROM srs WHERE pno = '"+pno+"'),'"+version+"','"+s.getEmpid()+"','"+s.getPriorityno()+"','')");
                ps.executeQuery();
            }
            
           
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
       
    }
  
    
}
