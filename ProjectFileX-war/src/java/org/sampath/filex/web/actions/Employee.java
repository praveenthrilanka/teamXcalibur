/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.sampath.filex.web.actions.Employee.getEmployeeFromRS;


public class Employee {

    private String employeeid;
    private String employeename;
    private String departmentid;
    private Blob photo;
    private String position;
    private String departement;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public Employee(String employeeid, String employeename, String departmentid, Blob photo, String department, String position, String email) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.departmentid = departmentid;
        this.photo = photo;
        this.position = position;
        this.departement = department;
        this.email = email;
    }

    public Blob getPhoto() {
        return photo;
    }

    public void setPhoto(Blob photo) {
        this.photo = photo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(String departmentid) {
        this.departmentid = departmentid;
    }

    public static ArrayList<Employee> getEmployee() {
        ArrayList<Employee> employee = new ArrayList<Employee>();
//        FileControll fc=new FileControll();
//        System.out.println("THIS IS FC.SRSID"+fc.srsid);
        Connection con = DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps = con.prepareStatement("select * from employee e,department d where e.depid=d.depid and password is not null");
            ResultSet rs = ps.executeQuery();
            System.out.println("Execution done");
            Employee e;

            while (rs.next()) {
                e = getEmployeeFromRS(rs);
                employee.add(e);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return employee;
    }

    public static Employee getEmployeeFromRS(ResultSet rs) throws SQLException {
        String position;

        if (rs.getString("ba").equals("y") && rs.getString("pm").equals("n") && rs.getString("msd").equals("n") && rs.getString("extsh").equals("n")) {
            position = "Business Analyist";
        } else if (rs.getString("ba").equals("n") && rs.getString("pm").equals("y") && rs.getString("msd").equals("n") && rs.getString("extsh").equals("n")) {
            position = "Project Manager";
        } else if (rs.getString("ba").equals("n") && rs.getString("pm").equals("y") && rs.getString("msd").equals("y") && rs.getString("extsh").equals("n")) {
            position = "PM/MSD";
        } else if (rs.getString("ba").equals("n") && rs.getString("pm").equals("n") && rs.getString("msd").equals("y") && rs.getString("extsh").equals("n")) {
            position = "ManagerSD";
        } else if (rs.getString("ba").equals("n") && rs.getString("pm").equals("n") && rs.getString("msd").equals("n") && rs.getString("extsh").equals("y")) {
            position = "Stakeholder";
        } else if (rs.getString("ba").equals("x") && rs.getString("pm").equals("x") && rs.getString("msd").equals("x") && rs.getString("extsh").equals("x")) {
            position = "Administrator";
        } else {
            position = "FleX User";
        }

        return new Employee(
                rs.getString("EMPID"),
                rs.getString("EMPNAME"),
                rs.getString("DEPID"),
                rs.getBlob("PHOTO"),
                rs.getString("DEPNME"),
                position,
                rs.getString("EMAIL"));

    }

    public static Employee getEmployee(String eid) {
        Employee employee = null;
        Connection con = DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps = con.prepareStatement("select * from employee e,department d where e.depid=d.depid and e.empid='" + eid + "'");
            ResultSet rs = ps.executeQuery();
            System.out.println("Execution done");

            if (rs.next()) {
                employee = getEmployeeFromRS(rs);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return employee;

    }

    public static ArrayList<Employee> getStakeHolders() {
        ArrayList<Employee> employee = new ArrayList<Employee>();
        Connection con = DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps = con.prepareStatement("select * from employee e,department d where e.depid=d.depid and e.extsh='y'");
            ResultSet rs = ps.executeQuery();
            System.out.println("Execution done");
            Employee e;

            while (rs.next()) {
                e = getEmployeeFromRS(rs);
                employee.add(e);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return employee;
    }

    public static ArrayList<Employee> getUpdatedStakeHolders(String pno) {
        ArrayList<Employee> employee = new ArrayList<Employee>();
        Connection con = DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps = con.prepareStatement("select * from employee e,department d where e.depid=d.depid and e.extsh='y'");
            ResultSet rs = ps.executeQuery();
            PreparedStatement p = con.prepareStatement("select e.empid from srsapprovedby sa,project p,srs s,employee e where sa.DOCNO=s.DOCNO and s.PNO=p.PNO and e.empid=sa.STKID and p.PNO='" + pno + "'");
            ResultSet r = p.executeQuery();

            PreparedStatement c = con.prepareStatement("select COUNT(*) as count from srsapprovedby sa,project p,srs s,employee e where sa.DOCNO=s.DOCNO and s.PNO=p.PNO and e.empid=sa.STKID and p.PNO='" + pno + "'");
            ResultSet count = c.executeQuery();

            int employeecount = 0;

            if (count.next()) {
                employeecount = count.getInt("count");
            }
            System.out.println(employeecount + "eeeeeeeeeeeeeeeeeeeeeeeee");
            String a[] = new String[employeecount];

            for (int x = 0; x < a.length; x++) {
                r.next();
                a[x] = r.getString("empid");
                System.out.println(a[x]);
            }

            System.out.println("Execution done");
            Employee e;

            while (rs.next()) {
                String eid = rs.getString("empid");
                boolean check = false;
                for (int x = 0; x < employeecount; x++) {
                    if (a[x].equals(eid)) {
                        check = true;
                    }
                }
                if (check == true) {
                    continue;
                } else {
                    e = getEmployeeFromRS(rs);
                }
                employee.add(e);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return employee;
    }
}