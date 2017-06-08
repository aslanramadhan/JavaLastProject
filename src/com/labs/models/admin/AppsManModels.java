/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labs.models.admin;

import com.labs.models.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class AppsManModels {

    private Connection connection;
    private Statement s;
    private ResultSet res;
    
    public void updateData(String title, String slogan, String footer, String meta){
        this.connection = Db.getConnection();
        try{
          String sql = "UPDATE siteInfo SET title = '"+title+"', slogan = '"+slogan+"', footer = '"+footer+"', meta ='"+meta+"' WHERE id = 1";
          s = connection.createStatement();
          s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Updated", title, 1);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
