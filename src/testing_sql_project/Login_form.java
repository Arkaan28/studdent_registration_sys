/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testing_sql_project;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.Media;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author arkaa
 */
public class Login_form extends javax.swing.JFrame {

    /**
     * Creates new form Login_form
     */
    public Login_form() {
        initComponents();
        this.setLocationRelativeTo(null);
        
//        creating border for the jpanel_login_title
        
        Border jpanel_title_border = BorderFactory.createMatteBorder(0,1,1,1,Color.blue);
        jPanel_title.setBorder(jpanel_title_border);
        
//        creating a border for the close and minimize buttons
        Border close_min_butBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jclose_button.setBorder(close_min_butBorder);
        jmin_button.setBorder(close_min_butBorder);
        
        Border user_pass_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(150,150,150));
        jTextField_username.setBorder(user_pass_border);
        jPasswordField.setBorder(user_pass_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jLogintoRegister_Label = new javax.swing.JLabel();
        jclose_button = new javax.swing.JLabel();
        jmin_button = new javax.swing.JLabel();
        jPanel_title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 0, 51)));

        jPanel2.setBackground(new java.awt.Color(100, 100, 100));

        jPanel3.setBackground(new java.awt.Color(200, 200, 200));

        jTextField_username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_username.setForeground(new java.awt.Color(150, 150, 150));
        jTextField_username.setText("username");
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });

        jPasswordField.setForeground(new java.awt.Color(150, 150, 150));
        jPasswordField.setText("password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });
        jPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldActionPerformed(evt);
            }
        });

        jButton_login.setBackground(new java.awt.Color(0, 0, 204));
        jButton_login.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
        jButton_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_loginMouseExited(evt);
            }
        });
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jLogintoRegister_Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLogintoRegister_Label.setForeground(new java.awt.Color(51, 0, 255));
        jLogintoRegister_Label.setText("Don't have an account? Sign up");
        jLogintoRegister_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLogintoRegister_LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLogintoRegister_LabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLogintoRegister_LabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(234, 234, 234))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPasswordField)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLogintoRegister_Label)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLogintoRegister_Label)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jclose_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jclose_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jclose_button.setText("X");
        jclose_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jclose_button.setPreferredSize(new java.awt.Dimension(10, 17));
        jclose_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jclose_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jclose_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jclose_buttonMouseExited(evt);
            }
        });

        jmin_button.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jmin_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jmin_button.setText(" - ");
        jmin_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jmin_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmin_buttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jmin_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jmin_buttonMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("LOGIN");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(107, 107, 107))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jmin_button)
                .addGap(18, 18, 18)
                .addComponent(jclose_button, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jclose_button, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmin_button)))
                    .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmin_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmin_buttonMouseEntered
        Border close_min_butBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jmin_button.setBorder(close_min_butBorder);
        jmin_button.setForeground(Color.white);

    }//GEN-LAST:event_jmin_buttonMouseEntered

    private void jmin_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmin_buttonMouseExited
        Border close_min_butBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jmin_button.setBorder(close_min_butBorder);
        jmin_button.setForeground(Color.black);
    }//GEN-LAST:event_jmin_buttonMouseExited

    private void jclose_buttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jclose_buttonMouseEntered
        Border close_min_butBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.red);
        jclose_button.setBorder(close_min_butBorder);
        jclose_button.setForeground(Color.red);

    }//GEN-LAST:event_jclose_buttonMouseEntered

    private void jclose_buttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jclose_buttonMouseExited
        Border close_min_butBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jclose_button.setBorder(close_min_butBorder);
        jclose_button.setForeground(Color.black);
    }//GEN-LAST:event_jclose_buttonMouseExited

    private void jPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldActionPerformed

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        if (jTextField_username.getText().trim().toLowerCase().equals("username")){
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost
        if (jTextField_username.getText().trim().toLowerCase().equals("") || 
                jTextField_username.getText().trim().toLowerCase().equals("username")){
            jTextField_username.setText("username");
            jTextField_username.setForeground(new Color(150, 150, 150));
        }
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        String pass = String.valueOf(jPasswordField.getPassword());
        if (pass.trim().toLowerCase().equals("password")){
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        String pass = String.valueOf(jPasswordField.getPassword());
        if (pass.trim().toLowerCase().equals("") || pass.trim().toLowerCase().equals("password")){
            jPasswordField.setText("password");
            jPasswordField.setForeground(new Color(150, 150, 150));
        }
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
        PreparedStatement st;
        ResultSet rs;
        
        String username = jTextField_username.getText();
        String password = String.valueOf(jPasswordField.getPassword());
        
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        
        try {
            st = MyConn.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            
            rs = st.executeQuery();
            
            if (rs.next()){
                Menu_Form form = new Menu_Form();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username/password","Login Error",2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login_form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_loginActionPerformed

    private void jButton_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseEntered
        jButton_login.setBackground(new Color(0,150,240));
    }//GEN-LAST:event_jButton_loginMouseEntered

    private void jButton_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_loginMouseExited
        jButton_login.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jButton_loginMouseExited

    private void jmin_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmin_buttonMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jmin_buttonMouseClicked

    private void jclose_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jclose_buttonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jclose_buttonMouseClicked

    private void jLogintoRegister_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogintoRegister_LabelMouseEntered
        // TODO add your handling code here:
        jLogintoRegister_Label.setForeground(new Color(0,150,200));
    }//GEN-LAST:event_jLogintoRegister_LabelMouseEntered

    private void jLogintoRegister_LabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogintoRegister_LabelMouseExited
        // TODO add your handling code here:
        jLogintoRegister_Label.setForeground(new Color(51,0,255));
    }//GEN-LAST:event_jLogintoRegister_LabelMouseExited

    private void jLogintoRegister_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLogintoRegister_LabelMouseClicked
        // TODO add your handling code here:
        Registration_form rf = new Registration_form();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLogintoRegister_LabelMouseClicked

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
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_login;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLogintoRegister_Label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField_username;
    private javax.swing.JLabel jclose_button;
    private javax.swing.JLabel jmin_button;
    // End of variables declaration//GEN-END:variables
}