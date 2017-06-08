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

/**
 *
 * @author user
 */
public class FileManModels {
    
    private Connection connection;
    private Statement s;
    private ResultSet res;
    
    public void deleteData(String id){
        this.connection = Db.getConnection();
        try {
            String sql = "DELETE FROM files WHERE id = '"+id+"'";
            s = connection.createStatement();
            s.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Delete Data Success","File Deleted",JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
