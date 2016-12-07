/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sampath.filex.web.actions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ashantha
 */
public class DatabaseConnection {
    
    public static Connection createConnection() {
        try {
            Class.forName(Constants.DRIVER_NAME);
            Connection conn = DriverManager.getConnection(Constants.DB_URL, Constants.DB_USERNAME, Constants.DB_PASSWORD);
            System.out.println("Connection Established");
            return conn;
        } catch (ClassNotFoundException ex) {

            System.out.println("CNFE " + ex.getMessage());
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("SQLE " + ex.getMessage());
        }
        return null;

    }
    
    
}
