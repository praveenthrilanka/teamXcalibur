
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

    public void setSrsid(String srsid) {
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
            PreparedStatement ps=con.prepareStatement("select * from employee e,project p,srs s where e.EMPID=p.PMID and p.PNO=s.PNO(+) and p.PMID='"+pmid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            System.out.println(pmid);
            
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
     public static ArrayList<Project> getProjectByMsdId(String msdid){
        ArrayList<Project> project=new ArrayList<Project>();
//        FileControll fc=new FileControll();
        System.out.println(msdid);
        Connection con=DatabaseConnection.createConnection();        
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from employee e,project p,srs s where e.EMPID=p.MSDID and p.PNO=s.PNO(+) and p.MSDID='"+msdid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            System.out.println(msdid);
            
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
    
    public static ArrayList<Project> getProjectByStkid(String stkid){
        ArrayList<Project> project=new ArrayList<Project>();
//        FileControll fc=new FileControll();
        System.out.println(stkid);
        Connection con=DatabaseConnection.createConnection();        
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from SRSApprovedBy a,project p,employee e,srs s where s.DOCNO=a.DOCNO and p.PNO=s.PNO(+) and a.STKID=e.EMPID and a.STKID='"+stkid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            System.out.println(stkid);
            Project p;
            
            while(rs.next()){
                String docno=rs.getString("DOCNO");
                String srsversion=Project.getSRSVersionByDOCID(docno);
                if(rs.getString("PRIORITYNO")==null)
                    continue;
                if(rs.getString("PRIORITYNO").equals("1") && rs.getString("SRSVERSION").equals(srsversion)){
                    p= getProjectFromRS(rs);
                    project.add(p);}
                else{
                    if(!rs.getString("SRSVERSION").equals(srsversion))
                        continue;
                    int prio=Integer.parseInt(rs.getString("PRIORITYNO"));
                    ps=con.prepareStatement("select status from SRSApprovedBy where docno='"+docno+"' and priorityno='"+(prio-1)+"' and srsversion='"+srsversion+"'");
                    ResultSet temprs=ps.executeQuery();
                    if(temprs.next())
                    {
                        try{
                            boolean approval=true;
                            //Since already in temprs.next(), initial check
                            if(!temprs.getString("status").toLowerCase().equals("approved"))
                                    approval=false;

                            while(temprs.next())
                            {
                                if(!temprs.getString("status").toLowerCase().equals("approved"))
                                {
                                    approval=false;
                                    break;
                                }
                            }
                            
                            if(approval)
                            {
                                p= getProjectFromRS(rs);
                                project.add(p);
                            }
                          }
                            catch(Exception r){
                            
                            }
                    }
                }
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
            PreparedStatement ps=con.prepareStatement("select * from employee e,project p,srs s where e.EMPID=p.PMID and p.PNO=s.PNO(+) and p.BAID='"+baid+"' order by p.pno desc");
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
            PreparedStatement ps=con.prepareStatement("select * from project p,srs s where p.pno=s.pno(+) and p.pno='"+pid+"'");
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
    
    public static String getSRSVersion(String pid){
            
            
        Connection con=DatabaseConnection.createConnection();
        String srsversion=null;
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select max(v.srsversion) as maxversion from versionhistory v,srs s where s.docno=v.docno and s.pno='"+pid+"'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            
            
            if(rs.next()){
                srsversion= rs.getString("maxversion");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
            return srsversion;
  
    }
    
    public static String getSRSVersionByDOCID(String docid){
            
            
        Connection con=DatabaseConnection.createConnection();
        String srsversion=null;
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select max(v.srsversion) as maxversion from versionhistory v,srs s where s.docno=v.docno and s.docno='"+docid+"'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            
            
            if(rs.next()){
                srsversion= rs.getString("maxversion");
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
            return srsversion;
  
    }
    
        public static String getStatusByProject(String pno,String eid){
            
            
        Connection con=DatabaseConnection.createConnection();
        String acknowledgement="Initial Project";
        try {
            System.out.println("Execution strt");
            
            //PreparedStatement ps=con.prepareStatement("select a.stkid,a.status from srsapprovedby a,srs s where s.docno=a.docno and pno='"+pno+"' and srsversion='"+Project.getSRSVersion(pno)+"' order by priorityno asc");
            PreparedStatement ps=con.prepareStatement("select a.stkid,a.status,a.priorityno from srsapprovedby a,srs s where s.docno=a.docno and pno='"+pno+"' and srsversion='"+Project.getSRSVersion(pno)+"' order by priorityno asc");
            ResultSet rs=ps.executeQuery();
            ps=con.prepareStatement("select a.stkid,a.status,a.priorityno from srsapprovedby a,srs s where s.docno=a.docno and pno='"+pno+"' and srsversion='"+Project.getSRSVersion(pno)+"' order by priorityno asc");
            ResultSet temp=ps.executeQuery();
            System.out.println("Execution done");
            int lastpriority=0;
            
            if(!temp.next())
                acknowledgement="Stakeholders are not assigned yet";
            else
            {
            while(rs.next())
            {
                    String status=rs.getString("STATUS");
                    
                if(status!=null)
                {    
                    if(status.equals("noresponse") && rs.getString("STKID").equals(eid))
                    {
                        acknowledgement="Waiting for your approval";
                        break;
                    }
                    else if(status.equals("rejected"))
                    {
                        acknowledgement="Rejected by " + Employee.getEmployee(rs.getString("STKID")).getEmployeename();
                        break;
                    }
                    else if(status.equals("noresponse"))
                    {   
                        int prio=0;
                        ps=con.prepareStatement("select * from srsapprovedby a,srs s where s.docno=a.docno and s.pno='"+pno+"' and a.stkid='"+eid+"'");
                        ResultSet rset=ps.executeQuery();
                        if(rset.next())
                            prio=Integer.parseInt(rset.getString("PRIORITYNO"));
                        if(prio==1)
                        {
                            if(rset.getString("STATUS").equals("noresponse"))
                            {   System.out.println(Integer.parseInt(rs.getString("PRIORITYNO"))+"----------------------------"+lastpriority);
                                acknowledgement="Waiting for your approval";
                                break;
                            }  
                        }
                        else if(prio!=0)
                        {
                        ps=con.prepareStatement("select a.status from srsapprovedby a,srs s where s.docno=a.docno and pno='"+pno+"' and a.priorityno='"+(prio-1)+"'");
                        ResultSet r=ps.executeQuery();
                        
                        if(r.next())
                        {
                            if(r.getString("STATUS").equals("approved") && !(rset.getString("STATUS").equals("approved") || rset.getString("STATUS").equals("rejected")) )
                            {   System.out.println(Integer.parseInt(rs.getString("PRIORITYNO"))+"--------------******--------------"+lastpriority);
                                acknowledgement="Waiting for your approval";
                                break;
                            }
                        }
                        }
                        
                        acknowledgement="Approval process at ";
                        int tempPrio=Integer.parseInt(rs.getString("PRIORITYNO"));
                        ps=con.prepareStatement("select * from srsapprovedby a,srs s where s.docno=a.docno and pno='"+pno+"' and a.priorityno='"+(tempPrio)+"'");
                        ResultSet r=ps.executeQuery();
                        int c=1;
                        while(r.next() )
                        {   if(!r.getString("STATUS").equals("noresponse"))
                            continue;
                            if(c==1)
                            acknowledgement+=Employee.getEmployee(r.getString("STKID")).getEmployeename();
                            else
                            acknowledgement+=", "+Employee.getEmployee(r.getString("STKID")).getEmployeename();
                            c++;
                        }
                        
                        break;
                    }
                    
                    acknowledgement="The project is approved";
                    
                    lastpriority=Integer.parseInt(rs.getString("PRIORITYNO"));
                    
                }
                else
                    acknowledgement="Undefined";
                
                }
            }
            
               
            
       con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
            return acknowledgement;
  
    }
    
    public static Boolean getAddedStakeholders(String pno){
            
            
        Connection con=DatabaseConnection.createConnection();
        boolean added=false;
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from srsapprovedby a, srs s where s.docno=a.docno and s.pno='"+pno+"'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
                        
               // System.out.println(rs.next());
                 added=rs.next();
                System.out.println("completed");
                
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
            return added ;
  
    }

public static ArrayList<Project> getOngoingProjectByBAid(String baid){
        ArrayList<Project> project=new ArrayList<Project>();
        System.out.println(baid);
        Connection con=DatabaseConnection.createConnection();        
        try {

            PreparedStatement ps=con.prepareStatement("select p.PNO , p.PNAME , p.CREATEDDATENTIME , P.BAID , p.PMID , p.MSDID,s.DOCNO  from employee e,project p,srs s where e.EMPID=p.BAID and p.PNO=s.PNO(+) and p.BAID='"+baid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done - getOngoingProjectByBAid");
            Project p;
            
            
            while(rs.next()){
               
                String pstatus=SRS.getProjectStatusByStakeholder(rs.getString("PNO"));
                
                if(rs.getString("PNO")!=null && pstatus!=null)
                {
                System.out.println("Checking the status");
                if(pstatus.equals("rejected") || pstatus.equals("ongoing") )
                {
                    
                    p= getProjectFromRS(rs);
                    project.add(p);
                   
                }
                }
            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
    }


public static ArrayList<Project> getRejectedProjectByBAid(String baid){
        ArrayList<Project> project=new ArrayList<Project>();
        System.out.println(baid);
        Connection con=DatabaseConnection.createConnection();        
        try {

            PreparedStatement ps=con.prepareStatement("select p.PNO , p.PNAME , p.CREATEDDATENTIME , P.BAID , p.PMID , p.MSDID,s.DOCNO  from employee e,project p,srs s where e.EMPID=p.BAID and p.PNO=s.PNO(+) and p.BAID='"+baid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done - getOngoingProjectByBAid");
            Project p;
            
            
            while(rs.next()){
               
                String pstatus=SRS.getProjectStatusByStakeholder(rs.getString("PNO"));
                
                if(rs.getString("PNO")!=null && pstatus!=null)
                {
                System.out.println("Checking the status");
                if(pstatus.equals("rejected"))
                {
                    
                    p= getProjectFromRS(rs);
                    project.add(p);
                   
                }
                }
            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
    }

public static ArrayList<Project> getApprovedProjectByBAid(String baid){
        ArrayList<Project> project=new ArrayList<Project>();
        System.out.println(baid);
        Connection con=DatabaseConnection.createConnection();        
        try {

            PreparedStatement ps=con.prepareStatement("select p.PNO , p.PNAME , p.CREATEDDATENTIME , P.BAID , p.PMID , p.MSDID,s.DOCNO  from employee e,project p,srs s where e.EMPID=p.BAID and p.PNO=s.PNO(+) and p.BAID='"+baid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done - getOngoingProjectByBAid");
            Project p;
            
            
            while(rs.next()){
               
                String pstatus=SRS.getProjectStatusByStakeholder(rs.getString("PNO"));
                
                if(rs.getString("PNO")!=null && pstatus!=null)
                {
                System.out.println("Checking the status");
                if(pstatus.equals("approved"))
                {
                    
                    p= getProjectFromRS(rs);
                    project.add(p);
                   
                }
                }
            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
    }
    

public static ArrayList<Project> getOngoingProjectByPMid(String pmid){
        ArrayList<Project> project=new ArrayList<Project>();
        System.out.println(pmid);
        Connection con=DatabaseConnection.createConnection();        
        try {

            PreparedStatement ps=con.prepareStatement("select p.PNO , p.PNAME , p.CREATEDDATENTIME , P.BAID , p.PMID , p.MSDID,s.DOCNO  from employee e,project p,srs s where e.EMPID=p.PMID and p.PNO=s.PNO(+) and p.PMID='"+pmid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done - getOngoingProjectByPMid");
            Project p;
            
            
            while(rs.next()){
               
                String pstatus=SRS.getProjectStatusByStakeholder(rs.getString("PNO"));
                
                if(rs.getString("PNO")!=null && pstatus!=null)
                {
                System.out.println("Checking the status");
                if(pstatus.equals("rejected") || pstatus.equals("ongoing") )
                {
                    
                    p= getProjectFromRS(rs);
                    project.add(p);
                   
                }
                }
            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
    }


public static ArrayList<Project> getRejectedProjectByPMid(String pmid){
        ArrayList<Project> project=new ArrayList<Project>();
        System.out.println(pmid);
        Connection con=DatabaseConnection.createConnection();        
        try {

            PreparedStatement ps=con.prepareStatement("select p.PNO , p.PNAME , p.CREATEDDATENTIME , P.BAID , p.PMID , p.MSDID,s.DOCNO  from employee e,project p,srs s where e.EMPID=p.PMID and p.PNO=s.PNO(+) and p.PMID='"+pmid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done - getOngoingProjectByPMid");
            Project p;
            
            
            while(rs.next()){
               
                String pstatus=SRS.getProjectStatusByStakeholder(rs.getString("PNO"));
                
                if(rs.getString("PNO")!=null && pstatus!=null)
                {
                System.out.println("Checking the status");
                if(pstatus.equals("rejected"))
                {
                    
                    p= getProjectFromRS(rs);
                    project.add(p);
                   
                }
                }
            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
    }


public static ArrayList<Project> getApprovedProjectByPMid(String pmid){
        ArrayList<Project> project=new ArrayList<Project>();
        System.out.println(pmid);
        Connection con=DatabaseConnection.createConnection();        
        try {

            PreparedStatement ps=con.prepareStatement("select p.PNO , p.PNAME , p.CREATEDDATENTIME , P.BAID , p.PMID , p.MSDID,s.DOCNO  from employee e,project p,srs s where e.EMPID=p.PMID and p.PNO=s.PNO(+) and p.PMID='"+pmid+"' order by p.pno desc");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done - getOngoingProjectByPMid");
            Project p;
            
            
            while(rs.next()){
               
                String pstatus=SRS.getProjectStatusByStakeholder(rs.getString("PNO"));
                
                if(rs.getString("PNO")!=null && pstatus!=null)
                {
                System.out.println("Checking the status");
                if(pstatus.equals("approved"))
                {
                    
                    p= getProjectFromRS(rs);
                    project.add(p);
                   
                }
                }
            }
            
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return project;
    }
    
}
