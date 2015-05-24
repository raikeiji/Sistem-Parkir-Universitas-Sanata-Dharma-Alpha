/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.control.LoginControl;
import com.model.LoginModel;
import com.view.admin.AdminMainFrame;
import com.view.in.PetugasMasukParkirFrame;
import com.view.out.PetugasKeluarParkirFrame;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rai
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public LoginFrame() {
        initComponents();
        TampilanAwal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle1 = new javax.swing.JLabel();
        jLabelLogoSistemParkir = new javax.swing.JLabel();
        jLabelUSD = new javax.swing.JLabel();
        jPanelFormLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNoID = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jButtonLogin = new javax.swing.JButton();
        jButtonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Login");

        jPanelTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTitle1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTitle1.setText("SISTEM PARKIR UNIVERSITAS SANATA DHARMA");

        jLabelLogoSistemParkir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo_48px.png"))); // NOI18N

        jLabelUSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo sadhar_48px.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelLogoSistemParkir)
                .addGap(18, 18, 18)
                .addComponent(jLabelUSD)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogoSistemParkir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUSD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanelFormLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 2, 10))); // NOI18N

        jLabel1.setText("Nomor Identitas");

        jLabel2.setText("Password");

        jTextFieldNoID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNoIDMouseClicked(evt);
            }
        });
        jTextFieldNoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoIDActionPerformed(evt);
            }
        });

        jPasswordField.setText("jPasswordField1");
        jPasswordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelFormLoginLayout = new javax.swing.GroupLayout(jPanelFormLogin);
        jPanelFormLogin.setLayout(jPanelFormLoginLayout);
        jPanelFormLoginLayout.setHorizontalGroup(
            jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLoginLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNoID, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFormLoginLayout.setVerticalGroup(
            jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFormLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFormLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonKeluar.setText("Keluar");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKeluar)
                    .addComponent(jButtonLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelFormLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelFormLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNoIDActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        try {
            com.model.LoginModel lm = new LoginModel();

            lm.setId_petugas(jTextFieldNoID.getText());
            lm.setPassword(jPasswordField.getText());

            status = cekDataLogin(lm);

            switch (status) {
                case "penjagain":
                    com.view.in.PetugasMasukParkirFrame in = new PetugasMasukParkirFrame();
                    in.setVisible(true);
                    break;
                case "penjagaout":
                    com.view.out.PetugasKeluarParkirFrame out = new PetugasKeluarParkirFrame();
                    out.setVisible(true);
                    break;
                case "admin" :
                    com.view.admin.AdminMainFrame adm=new AdminMainFrame();
                    adm.setVisible(true);
                    break;
            }

            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonKeluarActionPerformed

    private void jTextFieldNoIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNoIDMouseClicked
        jTextFieldNoID.setText("");
    }//GEN-LAST:event_jTextFieldNoIDMouseClicked

    private void jPasswordFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldMouseClicked
        jPasswordField.setText("");
    }//GEN-LAST:event_jPasswordFieldMouseClicked

    private void TampilanAwal() {
        jTextFieldNoID.setText("Masukkan Nomor ID Anda");
        jTextFieldNoID.setPreferredSize(jTextFieldNoID.getPreferredSize());
        jTextFieldNoID.setForeground(Color.GRAY);
        jPasswordField.setText("***********");
        jPasswordField.setPreferredSize(jPasswordField.getPreferredSize());
        jPasswordField.setForeground(Color.GRAY);
    }

    public String cekDataLogin(com.model.LoginModel lg) throws SQLException {
        PreparedStatement prepare = null;
        ResultSet result = null;

        String id_number = lg.getId_petugas();
        String password = lg.getPassword();

        try {
            conn=com.connection.Koneksi.getDBConnection();
            conn.setAutoCommit(true);
            String sql = "SELECT id_petugas, nama_petugas, password, status FROM PETUGAS WHERE ID_PETUGAS=? AND PASSWORD=?";
            prepare = conn.prepareStatement(sql);
            prepare.setString(1, id_number);
            prepare.setString(2, password);
            result = prepare.executeQuery();
            if (result.next()) {
                status = result.getString("status");

            }
            conn.commit();
            conn.close();
        } catch (SQLException e) {
            
            conn.rollback();
        }
        return status;
    }

//    public static LoginControl getKoneksiLogin() throws SQLException {
//        LoginControl kon = new LoginControl(com.connection.Koneksi.getDBConnection());
//        return kon;
//    }

    String status = "";
    private Connection conn = null;

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
//                try {
//                    UIManager.setLookAndFeel(WindowsLookAndFeel.class.getName());
//                } catch (ClassNotFoundException ex) {
//                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (InstantiationException ex) {
//                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (IllegalAccessException ex) {
//                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
//                } catch (UnsupportedLookAndFeelException ex) {
//                    Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogoSistemParkir;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelUSD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFormLogin;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextFieldNoID;
    // End of variables declaration//GEN-END:variables
}
