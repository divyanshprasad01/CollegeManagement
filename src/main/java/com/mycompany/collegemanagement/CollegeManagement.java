
package com.mycompany.collegemanagement;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CollegeManagement extends javax.swing.JFrame implements ActionListener{
    
    String userId;
    String password;
    String USER_TYPE;
    
    
    
    
    public CollegeManagement() {
        initComponents();
        
        LoginBtn.addActionListener(this);
        AdminBtn.setSelected(true);
        AdminBtn.addActionListener(this);
        StudentBtn.addActionListener(this);
        FacultyBtn.addActionListener(this);
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        UserId = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        LoginBtn = new javax.swing.JButton();
        FacultyBtn = new javax.swing.JToggleButton();
        StudentBtn = new javax.swing.JToggleButton();
        AdminBtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(218, 255, 251));

        jPanel1.setBackground(new java.awt.Color(0, 28, 48));

        jLabel1.setBackground(new java.awt.Color(0, 28, 48));
        jLabel1.setFont(new java.awt.Font("Dubai", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(218, 255, 251));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GALGOTIAS UNIVERSITY");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(218, 255, 251)));
        jLabel1.setOpaque(true);

        jPanel3.setBackground(new java.awt.Color(0, 28, 48));

        UserId.setBackground(new java.awt.Color(45, 67, 86));
        UserId.setForeground(new java.awt.Color(218, 255, 251));
        UserId.setText("  USER ID");
        UserId.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(218, 255, 251)));
        UserId.setCaretColor(new java.awt.Color(255, 255, 255));
        UserId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserIdActionPerformed(evt);
            }
        });

        Password.setBackground(new java.awt.Color(45, 67, 86));
        Password.setForeground(new java.awt.Color(218, 255, 251));
        Password.setText("  PASSWORD");
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(218, 255, 251)));
        Password.setCaretColor(new java.awt.Color(255, 255, 255));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        LoginBtn.setBackground(new java.awt.Color(3, 201, 136));
        LoginBtn.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("LOGIN");
        LoginBtn.setBorder(null);
        LoginBtn.setFocusable(false);

        FacultyBtn.setBackground(new java.awt.Color(23, 107, 135));
        FacultyBtn.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        FacultyBtn.setForeground(new java.awt.Color(255, 255, 255));
        FacultyBtn.setText("FACULTY");
        FacultyBtn.setBorder(null);
        FacultyBtn.setFocusable(false);

        StudentBtn.setBackground(new java.awt.Color(23, 107, 135));
        StudentBtn.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        StudentBtn.setForeground(new java.awt.Color(255, 255, 255));
        StudentBtn.setText("STUDENT");
        StudentBtn.setBorder(null);
        StudentBtn.setFocusable(false);
        StudentBtn.setPreferredSize(new java.awt.Dimension(65, 23));

        AdminBtn.setBackground(new java.awt.Color(23, 107, 135));
        AdminBtn.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        AdminBtn.setForeground(new java.awt.Color(255, 255, 255));
        AdminBtn.setText("ADMIN");
        AdminBtn.setBorder(null);
        AdminBtn.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(367, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(AdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FacultyBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(343, 343, 343))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FacultyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StudentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(UserId, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void UserIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserIdActionPerformed
        
    }//GEN-LAST:event_UserIdActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    
    
    
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CollegeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CollegeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CollegeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CollegeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CollegeManagement().setVisible(true);
            }
        });
        
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton AdminBtn;
    private javax.swing.JToggleButton FacultyBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField Password;
    private javax.swing.JToggleButton StudentBtn;
    private javax.swing.JTextField UserId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == AdminBtn){
            StudentBtn.setSelected(false);
            FacultyBtn.setSelected(false);
        }else if(e.getSource() == StudentBtn){
            AdminBtn.setSelected(false);
            FacultyBtn.setSelected(false);
        }else if(e.getSource()== FacultyBtn){
            AdminBtn.setSelected(false);
            StudentBtn.setSelected(false);
        }else if(e.getSource() == LoginBtn){
            
            if(AdminBtn.isSelected()){
                USER_TYPE = AdminBtn.getText().toUpperCase();
                new AdminPortal(userId, password, USER_TYPE).setVisible(true);
            }else if(StudentBtn.isSelected()){
                USER_TYPE = StudentBtn.getText().toUpperCase();
                new StudentPortal(userId,password,USER_TYPE).setVisible(true);
            }else if(FacultyBtn.isSelected()){
                USER_TYPE = FacultyBtn.getText().toUpperCase();
                new FacultyPortal(userId, password, USER_TYPE).setVisible(true);
            }
            
            userId = UserId.getText();
            password = Password.getText();
            
            
            
            this.dispose();
        }
        
        
        
        
    }
}
