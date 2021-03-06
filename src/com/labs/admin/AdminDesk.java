/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labs.admin;

import com.labs.main.MainFrame;
import com.labs.models.Db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author user
 */
public class AdminDesk extends javax.swing.JFrame {

    private Connection connection;
    private Statement s;
    private ResultSet res;
    
    private String id;
    
    /**
     * Creates new form AdminDesk
     */
    public AdminDesk() {
        initComponents();
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskPaneAdmin = new javax.swing.JDesktopPane();
        lblApps = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblFolder = new javax.swing.JLabel();
        lblLogOut = new javax.swing.JLabel();
        lblAps = new javax.swing.JLabel();
        lblUs = new javax.swing.JLabel();
        lblFl = new javax.swing.JLabel();
        lblLO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));

        lblApps.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/labs/assets/ic_apps.png"))); // NOI18N
        lblApps.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAppsMouseClicked(evt);
            }
        });

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/labs/assets/ic_user.png"))); // NOI18N
        lblUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblUserMouseClicked(evt);
            }
        });

        lblFolder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/labs/assets/ic_folder.png"))); // NOI18N
        lblFolder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFolderMouseClicked(evt);
            }
        });

        lblLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/labs/assets/ic_log.png"))); // NOI18N
        lblLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOutMouseClicked(evt);
            }
        });

        lblAps.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblAps.setForeground(new java.awt.Color(255, 255, 255));
        lblAps.setText("Apps Info");

        lblUs.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblUs.setForeground(new java.awt.Color(255, 255, 255));
        lblUs.setText("Users");

        lblFl.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblFl.setForeground(new java.awt.Color(255, 255, 255));
        lblFl.setText("Files");

        lblLO.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblLO.setForeground(new java.awt.Color(255, 255, 255));
        lblLO.setText("Log Out");

        deskPaneAdmin.setLayer(lblApps, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPaneAdmin.setLayer(lblUser, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPaneAdmin.setLayer(lblFolder, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPaneAdmin.setLayer(lblLogOut, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPaneAdmin.setLayer(lblAps, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPaneAdmin.setLayer(lblUs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPaneAdmin.setLayer(lblFl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        deskPaneAdmin.setLayer(lblLO, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout deskPaneAdminLayout = new javax.swing.GroupLayout(deskPaneAdmin);
        deskPaneAdmin.setLayout(deskPaneAdminLayout);
        deskPaneAdminLayout.setHorizontalGroup(
            deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskPaneAdminLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAps)
                    .addGroup(deskPaneAdminLayout.createSequentialGroup()
                        .addGroup(deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deskPaneAdminLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblFl))
                            .addGroup(deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblUser, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblFolder)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, deskPaneAdminLayout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblUs))))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                .addGroup(deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogOut)
                    .addComponent(lblLO))
                .addGap(11, 11, 11))
            .addGroup(deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deskPaneAdminLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(lblApps)
                    .addContainerGap(401, Short.MAX_VALUE)))
        );
        deskPaneAdminLayout.setVerticalGroup(
            deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskPaneAdminLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogOut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAps)
                    .addComponent(lblLO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblUser)
                .addGap(1, 1, 1)
                .addComponent(lblUs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFl)
                .addContainerGap())
            .addGroup(deskPaneAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(deskPaneAdminLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblApps)
                    .addContainerGap(391, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPaneAdmin)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deskPaneAdmin)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void getData(){
        this.connection = Db.getConnection();
        System.out.println(id);
        try {
            s = connection.createStatement();
            String sql = "SELECT * FROM siteInfo WHERE id = 1";
            res = s.executeQuery(sql);
            while (res.next()) {
                String title = res.getString(2);
                setTitle(title+" - Admin Desktop");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    private void lblAppsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAppsMouseClicked
        AppsManager app = new AppsManager();
        deskPaneAdmin.add(app);
        app.setVisible(true);
    }//GEN-LAST:event_lblAppsMouseClicked

    private void lblLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOutMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new MainFrame().setVisible(true);
    }//GEN-LAST:event_lblLogOutMouseClicked

    private void lblUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblUserMouseClicked
        UserManager usr = new UserManager();
        deskPaneAdmin.add(usr);
        usr.setVisible(true);
    }//GEN-LAST:event_lblUserMouseClicked

    private void lblFolderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFolderMouseClicked
        FileManager fm = new FileManager();
        deskPaneAdmin.add(fm);
        fm.setVisible(true);
    }//GEN-LAST:event_lblFolderMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDesk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDesk().setVisible(true);
                new MainFrame().setVisible(false);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane deskPaneAdmin;
    private javax.swing.JLabel lblApps;
    private javax.swing.JLabel lblAps;
    private javax.swing.JLabel lblFl;
    private javax.swing.JLabel lblFolder;
    private javax.swing.JLabel lblLO;
    private javax.swing.JLabel lblLogOut;
    private javax.swing.JLabel lblUs;
    private javax.swing.JLabel lblUser;
    // End of variables declaration//GEN-END:variables
}
