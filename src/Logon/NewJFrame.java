package Logon;
import java.awt.Color;
public class NewJFrame extends javax.swing.JFrame {
    public NewJFrame() {
    this.setUndecorated(true);
      
initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocation(new java.awt.Point(0, 0));
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(650, 350));
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 350));
        jPanel1.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logon/1.png"))); // NOI18N
        jLabel6.setText(" ");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel6.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel6.setPreferredSize(new java.awt.Dimension(84, 27));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(360, 80, 260, 40);

        Id.setBackground(new java.awt.Color(44, 62, 80));
        Id.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Id.setForeground(new java.awt.Color(255, 255, 255));
        Id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Id.setText("UserName");
        Id.setBorder(null);
        Id.setCaretColor(new java.awt.Color(255, 255, 255));
        Id.setName("Id"); // NOI18N
        Id.setOpaque(false);
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });
        jPanel1.add(Id);
        Id.setBounds(402, 85, 210, 30);

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proceed");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1);
        jLabel1.setBounds(358, 250, 260, 41);

        jLabel7.setBackground(new java.awt.Color(127, 140, 141));
        jLabel7.setForeground(new java.awt.Color(127, 140, 141));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logon/3.png"))); // NOI18N
        jLabel7.setText(" ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jLabel7.setMaximumSize(new java.awt.Dimension(50, 50));
        jLabel7.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel7.setPreferredSize(new java.awt.Dimension(84, 27));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(360, 160, 260, 40);

        jLabel2.setFont(new java.awt.Font("Open Sans Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("x");
        jLabel2.setToolTipText("close");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(610, 5, 20, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sign In");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 40, 68, 32);

        Password.setBackground(new java.awt.Color(44, 62, 80));
        Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(204, 204, 204));
        Password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Password.setText("Password");
        Password.setAutoscrolls(false);
        Password.setBorder(null);
        Password.setCaretColor(new java.awt.Color(255, 255, 255));
        Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Password.setName("Password"); // NOI18N
        Password.setPreferredSize(new java.awt.Dimension(84, 27));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel1.add(Password);
        Password.setBounds(400, 165, 210, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logon/logo.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setIconTextGap(0);
        jLabel4.setMaximumSize(new java.awt.Dimension(104, 78));
        jLabel4.setPreferredSize(new java.awt.Dimension(300, 300));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(110, 70, 143, 144);

        jLabel5.setFont(new java.awt.Font("Open Sans Light", 0, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(236, 240, 241));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MeeGo");
        jLabel5.setDebugGraphicsOptions(javax.swing.DebugGraphics.FLASH_OPTION);
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 190, 200, 50);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("(Forgot Password ?)");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(360, 200, 110, 15);

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText(" ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(500, 120, 120, 14);

        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText(" ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(520, 200, 100, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(666, 388));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved

        jLabel2.setForeground(Color.MAGENTA);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
jLabel2.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String S1,S2;
        S1="Rohit";
        S2="12345";
        if(S1.equals(Id.getText()))
        {
     if(S2.equals(Password.getPassword()))  
     {
         this.setVisible(false);
       new LoginSuccess().setVisible(true);
    
     }
     else
     {
         jLabel10.setText("Password Incorrect");
     }
         }
        else
        {
        jLabel9.setText("UserName Incorrect ");
        }
            
    }//GEN-LAST:event_jLabel1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and disy the form */
      
                
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id;
    private javax.swing.JPasswordField Password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
