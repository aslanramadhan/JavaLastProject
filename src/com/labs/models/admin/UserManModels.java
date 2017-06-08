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
public class UserManModels {
    private Connection connection;
    private Statement s;
    private ResultSet res;
    
    public void addData(String username, String password, String name, String email){
        this.connection = Db.getConnection();
        try {
            String sql = "INSERT INTO users(username,password) VALUES ('"+username+"','"+password+"')";
            s = connection.createStatement();
            s.executeUpdate(sql);
            String sel = "SELECT id FROM users WHERE username = '"+username+"'";
            s = connection.createStatement();
            res = s.executeQuery(sel);
            while (res.next()) {
                String acc = "INSERT INTO accounts(id,name,email) VALUES ('"+res.getString(1)+"','"+name+"','"+email+"')";
                s = connection.createStatement();
                s.executeUpdate(acc);
                JOptionPane.showMessageDialog(null, "Insert Data Success", "New User", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void updateData(String id, String username, String name, String email){
        this.connection = Db.getConnection();
        try{
          String sql = "UPDATE users SET username = '"+username+"' WHERE id = '"+id+"'";
          s = connection.createStatement();
          s.executeUpdate(sql);
          String profile = "UPDATE accounts SET name = '"+name+"', email = '"+email+"' WHERE id = '"+id+"'";
          s = connection.createStatement();
          s.executeUpdate(profile);
          JOptionPane.showMessageDialog(null, "Data Updated", "User", 1);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void deleteData(String id){
        this.connection = Db.getConnection();
        try{
          String sql = "DELETE FROM users WHERE id = '"+id+"'";
          s = connection.createStatement();
          s.executeUpdate(sql);
          JOptionPane.showMessageDialog(null, "Data Deleted", "User", 1);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
