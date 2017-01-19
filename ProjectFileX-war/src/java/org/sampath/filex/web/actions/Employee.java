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

/**
 *
 * @author Ashantha
 */
public class Employee {
    
    private String employeeid;
    private String employeename;
    private String departmentid;
    private Blob photo;
    private String position;
    
    
    public Employee(String employeeid, String employeename, String departmentid,Blob photo,String position) {
        this.employeeid = employeeid;
        this.employeename = employeename;
        this.departmentid = departmentid;
        this.photo=photo;
        this.position=position;
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
    

    public static ArrayList<Employee> getEmployee(){
        ArrayList<Employee> employee=new ArrayList<Employee>();
//        FileControll fc=new FileControll();
//        System.out.println("THIS IS FC.SRSID"+fc.srsid);
        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from employee");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            Employee e;
            
            while(rs.next()){
                e= getEmployeeFromRS(rs);
                employee.add(e);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return employee;
    }
    
    public static Employee getEmployeeFromRS(ResultSet rs) throws SQLException {
            String position;
            if(rs.getString("BA").equalsIgnoreCase("y"))
                position="Business Analyist";
            else if(rs.getString("PM").equalsIgnoreCase("y"))
                position="PM/MSD";
            else
                position="Stakeholder";
        
            return new Employee(
                 rs.getString("EMPID"),
                 rs.getString("EMPNAME"),
                 rs.getString("DEPID"),
                 rs.getBlob("PHOTO"),
                 position);
        
     }
    
    public static Employee getEmployee(String eid){
        Employee employee = null;
        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from employee where empid='"+eid+"'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            
            
            if(rs.next()){
                employee= getEmployeeFromRS(rs);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return employee;
  
    }
    
        public static ArrayList<Employee> getStakeHolders(){
        ArrayList<Employee> employee=new ArrayList<Employee>();
        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from employee where extsh='y'");
            ResultSet rs=ps.executeQuery();
            System.out.println("Execution done");
            Employee e;
            
            while(rs.next()){
                e= getEmployeeFromRS(rs);
                employee.add(e);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return employee;
    }
    
    
}
