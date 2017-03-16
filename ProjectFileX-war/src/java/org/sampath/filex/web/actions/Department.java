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
import static org.sampath.filex.web.actions.Employee.getEmployeeFromRS;
import static org.sampath.filex.web.actions.Stakeholder.getStakeholdersFromRS;


public class Department {
    private String departmentid;
    private String depName;
    
    public Department(String departmentid, String depName){
        this.departmentid = departmentid;
        this.depName = depName;
        
    }
    
    public String getDepartmentID(){
        return departmentid;
    }
    
     public void setDepartmentID(String departmentid) {
        this.departmentid = departmentid;
    }
    
    public String getDepartmentName(){
        return depName;
    }
    
    public void setDepartmentName(String depName) {
        this.depName = depName;
    }
    
    
    public static ArrayList<Department> getDepartmentType(){
        ArrayList<Department> dep=new ArrayList<Department>();
        Connection con=DatabaseConnection.createConnection();
        try {
            System.out.println("Execution strt");
            PreparedStatement ps=con.prepareStatement("select * from department");
            ResultSet rst=ps.executeQuery();
            System.out.println("Execution done");
           
            
            while(rst.next()){
             Department d = new Department( rst.getString("depid"),rst.getString("depnme"));
             dep.add(d);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection "+ex);
        }
        return dep;
    }
    
}
