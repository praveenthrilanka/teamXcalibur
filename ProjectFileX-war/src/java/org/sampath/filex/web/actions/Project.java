
package org.sampath.filex.web.actions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;


public class Project {

    private String projectno;
    private String projectname;
    private String datentime;
    private String baid;
    private String pmid;
    private String msdid;
    private String srsid;

      
    public Project(String projectno, String projectname, String datentime, String baid, String pmid, String msdid,String srsid) {
        this.projectno = projectno;
        this.projectname = projectname;
        this.datentime = datentime;
        this.baid = baid;
        this.pmid = pmid;
        this.msdid = msdid;
        this.srsid=srsid;
    }
    
     public String getSrsid() {
        return srsid;
    }

    public void setSrsid(String srsnid) {
        this.srsid = srsid;
    }

    public String getProjectno() {
        return projectno;
    }

    public void setProjectno(String projectno) {
        this.projectno = projectno;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getDatentime() {
        return datentime;
    }

    public void setDatentime(String datentime) {
        this.datentime = datentime;
    }

    public String getBaid() {
        return baid;
    }

    public void setBaid(String baid) {
        this.baid = baid;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public String getMsdid() {
        return msdid;
    }

    public void setMsdid(String msdid) {
        this.msdid = msdid;
    }
    
    public static ArrayList<Project> getProjectByPMid(String pmid){
        ArrayList<Project> project=new ArrayList<Project>();
//        FileControll fc=new FileControll();
        System.out.println(pmid);
        Connection con=DatabaseConnection.createConnection();        
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from employee e,project p,srs s where e.EMPID=p.PMID and p.PNO=s.PNO and p.PMID='"+pmid+"'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            Project p;
            
            while(rs.next()){
                p= getProjectFromRS(rs);
                project.add(p);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
    }
    
    public static ArrayList<Project> getProjectByBAid(String baid){
        ArrayList<Project> project=new ArrayList<Project>();
//        FileControll fc=new FileControll();
        System.out.println(baid);
        Connection con=DatabaseConnection.createConnection();        
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from employee e,project p,srs s where e.EMPID=p.PMID and p.PNO=s.PNO and p.BAID='"+baid+"'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            Project p;
            
            while(rs.next()){
                p= getProjectFromRS(rs);
                project.add(p);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
    }
    
    
    public static Project getProjectFromRS(ResultSet rs) throws SQLException {
         return new Project(
                 rs.getString("PNO"),
                 rs.getString("PNAME"),
                 rs.getString("CREATEDDATENTIME"),
                 rs.getString("BAID"),
                 rs.getString("PMID"),
                 rs.getString("MSDID"),
                 rs.getString("DOCNO"));
        
     }
    
    public static Project getProject(String pid){
        Project project = null;
        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from project p,srs s where p.pno=s.pno and p.pno='"+pid+"'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            
            
            if(rs.next()){
                project= getProjectFromRS(rs);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
  
    }
    
    
    
}
