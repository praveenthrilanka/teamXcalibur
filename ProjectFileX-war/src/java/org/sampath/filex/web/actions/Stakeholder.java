
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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.sampath.filex.web.actions.Project.getProjectFromRS;

public class Stakeholder {

    private String empid;
    private String name;
    private String department;
    private String priorityno;
    private String status;
    private String email;
    private String assignedtime;
    private String responsetime;

    public String getAssignedtime() {
        return assignedtime;
    }

    public void setAssignedtime(String assignedtime) {
        this.assignedtime = assignedtime;
    }

    public Stakeholder(String empid, String name, String department, String email, String priorityno, String status) {
        this.empid = empid;
        this.name = name;
        this.department = department;
        this.email = email;
        this.priorityno = priorityno;
        this.status = status;
    }

    public Stakeholder(String empid, String name, String department, String email, String priorityno, String status, String responsetime, String assignedtime) {
        this.empid = empid;
        this.name = name;
        this.department = department;
        this.email = email;
        this.priorityno = priorityno;
        this.status = status;
        this.responsetime = responsetime;
        this.assignedtime = assignedtime;

    }

    public String getResponsetime() {
        return responsetime;
    }

    public void setResponsetime(String responsetime) {
        this.responsetime = responsetime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Stakeholder(String name, String priorityno, String department) {
        this.name = name;
        this.priorityno = priorityno;
        this.department = department;
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

    public static ArrayList<Stakeholder> getStakeholders(String pno, String version) {
        ArrayList<Stakeholder> stakeholder = new ArrayList<Stakeholder>();

        Connection con = DatabaseConnection.createConnection();
        try {

            PreparedStatement ps = con.prepareStatement("select e.empid,e.empname,a.priorityno,a.status,d.depnme,a.srsversion,s.pno,e.email from srsapprovedby a, employee e, department d,srs s\n"
                    + "where s.docno=a.docno and a.stkid=e.empid and e.depid=d.depid and s.pno='" + pno + "' and a.srsversion='" + version + "' order by priorityno");
            ResultSet rs = ps.executeQuery();

            Stakeholder s;

            while (rs.next()) {
                s = getStakeholdersFromRS(rs);
                stakeholder.add(s);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return stakeholder;
    }

    public static Stakeholder getStakeholdersFromRS(ResultSet rs) throws SQLException {
        return new Stakeholder(
                rs.getString("EMPID"),
                rs.getString("EMPNAME"),
                rs.getString("DEPNME"),
                rs.getString("EMAIL"),
                rs.getString("PRIORITYNO"),
                rs.getString("STATUS"));

    }

    public static void setStakeholders(String pno, String version) {

        ArrayList<Stakeholder> stakeholder = Stakeholder.getStakeholders(pno, String.valueOf(Integer.parseInt(version) - 1));

        Project p = Project.getProject(pno);
        Date dte = new Date();
        String date;

        Connection con = DatabaseConnection.createConnection();
        try {
            Stakeholder s = null;
            for (int x = 0; x < stakeholder.size(); x++) {
                date = "novalue";
                s = stakeholder.get(x);
                if (s.getPriorityno().equals("1")) {
                    String mail = "You have been assigned to the project '" + p.getProjectname() + "'.\n\n"
                            + "Please log in to FileX system to refer the document and feel free to "
                            + "approve/reject document with your suggestions.\n\n"
                            + "Thank You.";

                    Mail.sendmail(s.getEmail(), "Kind Reminder", mail);
                    date = DateString.getDate(dte.toString());

                }

                PreparedStatement ps = con.prepareStatement("insert into srsapprovedby values((SELECT docno FROM srs WHERE pno = '" + pno + "'),'" + version + "','" + s.getEmpid() + "','" + s.getPriorityno() + "','noresponse','novalue','" + date + "')");
                ps.executeQuery();
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }

    }

    public static ArrayList<Stakeholder> getAddedStake(String pno) {
        ArrayList<Stakeholder> addstk = new ArrayList<Stakeholder>();

        Connection con = DatabaseConnection.createConnection();
        String s = Project.getSRSVersion(pno);
        try {

            PreparedStatement ps = con.prepareStatement("select sa.priorityno,e.empname,d.depnme from srsapprovedby sa,project p,srs s,employee e,department d where sa.srsversion='" + s + "' and sa.DOCNO=s.DOCNO and s.PNO=p.PNO and e.empid=sa.STKID and e.depid=d.depid and p.PNO='" + pno + "' order by priorityno");
            ResultSet rs = ps.executeQuery();

            Stakeholder p;

            while (rs.next()) {
                p = getAddedStakeholdersFromRS(rs);
                addstk.add(p);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return addstk;
    }

    public static Stakeholder getAddedStakeholdersFromRS(ResultSet rs) throws SQLException {
        return new Stakeholder(
                rs.getString("EMPNAME"),
                rs.getString("PRIORITYNO"),
                rs.getString("DEPNME"));

    }

    public static String getStakeholdersEmail(String pno, String version, int prio) {
        String email = "";
        Connection con = DatabaseConnection.createConnection();
        try {

            PreparedStatement ps = con.prepareStatement("select e.email from srsapprovedby a, employee e,srs s\n"
                    + "where s.docno=a.docno and a.stkid=e.empid and s.pno='" + pno + "' and a.srsversion='" + version + "' and a.priorityno='" + prio + "' order by priorityno");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                email += rs.getString("EMAIL") + ",";
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return email;
    }

    public static ArrayList<Stakeholder> getStakeholdersForVH(String pno, String version) {
        ArrayList<Stakeholder> stakeholder = new ArrayList<Stakeholder>();

        Connection con = DatabaseConnection.createConnection();
        try {

            PreparedStatement ps = con.prepareStatement("select e.empid,e.empname,a.priorityno,a.status,d.depnme,a.srsversion,s.pno,e.email,a.datentime,a.assigneddate from srsapprovedby a, employee e, department d,srs s\n"
                    + "where s.docno=a.docno and a.stkid=e.empid and e.depid=d.depid and s.pno='" + pno + "' and a.srsversion='" + version + "' order by priorityno");
            ResultSet rs = ps.executeQuery();

            Stakeholder s;

            while (rs.next()) {
                s = getStakeholdersForVHFromRS(rs);
                stakeholder.add(s);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return stakeholder;
    }

    public static Stakeholder getStakeholdersForVHFromRS(ResultSet rs) throws SQLException {

        return new Stakeholder(
                rs.getString("EMPID"),
                rs.getString("EMPNAME"),
                rs.getString("DEPNME"),
                rs.getString("EMAIL"),
                rs.getString("PRIORITYNO"),
                rs.getString("STATUS"),
                rs.getString("DATENTIME"),
                rs.getString("ASSIGNEDDATE"));

    }
}
