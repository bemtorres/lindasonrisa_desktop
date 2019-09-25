/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author benja
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setTitle("Linda Sonrisa");
        setLocationRelativeTo(null);
        setResizable(false);    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);     
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
        jLabelVersion4 = new javax.swing.JLabel();
        jLabelVersion6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        txtUsername = new javax.swing.JTextField();
        BtnSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JButton();
        jLabelVersion2 = new javax.swing.JLabel();
        jLabelVersion1 = new javax.swing.JLabel();
        BtnEntrar1 = new javax.swing.JPanel();
        btnEntrar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabelVersion8 = new javax.swing.JLabel();
        jLabelVersion9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabelVersion10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setIconImages(null);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(36, 46, 68));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVersion4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelVersion4.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersion4.setText("USUARIO");
        jPanel1.add(jLabelVersion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, -1));

        jLabelVersion6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelVersion6.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersion6.setText("Iniciar Sesión");
        jPanel1.add(jLabelVersion6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 232, 10));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, 232, 26));

        txtPassword.setBackground(new java.awt.Color(36, 46, 68));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setText("jPasswordField1");
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 230, 30));

        txtUsername.setBackground(new java.awt.Color(36, 46, 68));
        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setText("Ingresa tu nombre de usuario");
        txtUsername.setBorder(null);
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUsernameMouseClicked(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 230, 30));

        BtnSalir.setBackground(new java.awt.Color(255, 51, 51));
        BtnSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalir.setBackground(new java.awt.Color(243, 84, 93));
        btnSalir.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        BtnSalir.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel1.add(BtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, 80, 30));

        jLabelVersion2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelVersion2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersion2.setText("CONTRASEÑA");
        jPanel1.add(jLabelVersion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, -1));

        jLabelVersion1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabelVersion1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersion1.setText("¿Recuperar Contraseña?");
        jLabelVersion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelVersion1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabelVersion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, 20));

        BtnEntrar1.setBackground(new java.awt.Color(89, 199, 198));
        BtnEntrar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntrar2.setBackground(new java.awt.Color(255, 153, 153));
        btnEntrar2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnEntrar2.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar2.setText("Entrar");
        btnEntrar2.setBorder(null);
        btnEntrar2.setBorderPainted(false);
        btnEntrar2.setContentAreaFilled(false);
        btnEntrar2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEntrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrar2ActionPerformed(evt);
            }
        });
        BtnEntrar1.add(btnEntrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel1.add(BtnEntrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 130, 40));

        jPanel3.setBackground(new java.awt.Color(89, 199, 198));

        jLabelVersion8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelVersion8.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersion8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVersion8.setText("Sistema de Gestión");

        jLabelVersion9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelVersion9.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersion9.setText("V1.0");

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/200 200.png"))); // NOI18N

        jLabelVersion10.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabelVersion10.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVersion10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVersion10.setText("Odontológica");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 121, Short.MAX_VALUE)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabelVersion9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelVersion10, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelVersion8, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelVersion8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelVersion10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabelVersion9)
                .addGap(41, 41, 41))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMouseClicked
        // TODO add your handling code here:
        txtUsername.setText("");
    }//GEN-LAST:event_txtUsernameMouseClicked

    private void btnEntrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEntrar2ActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jLabelVersion1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelVersion1MouseClicked
        // TODO add your handling code here:
        RecuperarContrasena v = new RecuperarContrasena();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabelVersion1MouseClicked

    @Override
    public Image getIconImage() {
       Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("img/200 200.png"));


       return retValue;
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnEntrar1;
    private javax.swing.JPanel BtnSalir;
    private javax.swing.JButton btnEntrar2;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelVersion1;
    private javax.swing.JLabel jLabelVersion10;
    private javax.swing.JLabel jLabelVersion2;
    private javax.swing.JLabel jLabelVersion4;
    private javax.swing.JLabel jLabelVersion6;
    private javax.swing.JLabel jLabelVersion8;
    private javax.swing.JLabel jLabelVersion9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
