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

public class Document {

    private String doctypeid;
    private String doctype;

    public Document(String doctypeid, String doctype) {
        this.doctypeid = doctypeid;
        this.doctype = doctype;

    }

    public String getDoctypeid() {
        return doctypeid;
    }

    public void setDoctypeid(String doctypeid) {
        this.doctypeid = doctypeid;
    }

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
    }

    public static ArrayList<Document> getDocumentType() {
        ArrayList<Document> doc = new ArrayList<Document>();
        Connection con = DatabaseConnection.createConnection();
        try {

            PreparedStatement ps = con.prepareStatement("select * from doctype");
            ResultSet rst = ps.executeQuery();

            while (rst.next()) {
                Document d = new Document(rst.getString("doctypeid"), rst.getString("doctype"));
                doc.add(d);
            }
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignIn.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Something went wrong in Connection " + ex);
        }
        return doc;
    }

}
