/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.OdontologoDAO;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import modelo.Odontologo;
import procedimientos.ColorearFilas;
import procedimientos.Encryptar;

/**
 *
 * @author MR-BM
 */
public class Configuracion extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public int id_odontologo;
    public Odontologo odontologo;
    
    //Colores
    ColorearFilas colores = new ColorearFilas();
    
    public Configuracion() {
        initComponents();
        setTitle("Linda Sonrisa");
        setLocationRelativeTo(null);
        setResizable(false);    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);   
        this.setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());     
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
        lblNombreOdontologo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        btnAgendaHoyDisa = new javax.swing.JLabel();
        btnCalendarioDisa = new javax.swing.JLabel();
        btnHistorialM1 = new javax.swing.JLabel();
        btnHistorialM = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        Vertical1 = new javax.swing.JLabel();
        Vertical = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNuevo2 = new javax.swing.JPasswordField();
        txtPassActual = new javax.swing.JPasswordField();
        txtNuevo1 = new javax.swing.JPasswordField();
        lblAgenda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardarCambios = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        homeIcon = new javax.swing.JLabel();
        Titulo2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lblRun = new javax.swing.JLabel();
        lblNombreOdo = new javax.swing.JLabel();
        FondoMedio3 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        FondoMedio1 = new javax.swing.JLabel();
        FondoPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreOdontologo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNombreOdontologo.setText("Odontólogo");
        jPanel1.add(lblNombreOdontologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 140, 20));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, -1));

        btnAgendaHoyDisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgendaDisa.png"))); // NOI18N
        btnAgendaHoyDisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendaHoyDisaMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgendaHoyDisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 270, 60));

        btnCalendarioDisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCalendarioDisabled.png"))); // NOI18N
        btnCalendarioDisa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalendarioDisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalendarioDisaMouseClicked(evt);
            }
        });
        jPanel1.add(btnCalendarioDisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 60));

        btnHistorialM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHistorialDisabled.png"))); // NOI18N
        btnHistorialM1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHistorialM1MouseClicked(evt);
            }
        });
        jPanel1.add(btnHistorialM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 270, 70));

        btnHistorialM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHistorial.png"))); // NOI18N
        jPanel1.add(btnHistorialM, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 270, 50));

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/configuracion.png"))); // NOI18N
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseClicked(evt);
            }
        });
        jPanel1.add(btnConfiguracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 270, 50));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Odontólogo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 140, 20));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 620, 270, 50));

        Vertical1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vertical.png"))); // NOI18N
        jPanel1.add(Vertical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 640));

        Vertical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/vertical.png"))); // NOI18N
        jPanel1.add(Vertical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, -1, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 720));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNuevo2.setForeground(new java.awt.Color(119, 119, 119));
        txtNuevo2.setText("jPasswordField1");
        txtNuevo2.setBorder(null);
        txtNuevo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNuevo2FocusGained(evt);
            }
        });
        txtNuevo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevo2KeyTyped(evt);
            }
        });
        jPanel2.add(txtNuevo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 290, 30));

        txtPassActual.setForeground(new java.awt.Color(119, 119, 119));
        txtPassActual.setText("jPasswordField1");
        txtPassActual.setBorder(null);
        txtPassActual.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassActualFocusGained(evt);
            }
        });
        txtPassActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassActualKeyTyped(evt);
            }
        });
        jPanel2.add(txtPassActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 290, 30));

        txtNuevo1.setForeground(new java.awt.Color(119, 119, 119));
        txtNuevo1.setText("jPasswordField1");
        txtNuevo1.setBorder(null);
        txtNuevo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNuevo1FocusGained(evt);
            }
        });
        txtNuevo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNuevo1KeyTyped(evt);
            }
        });
        jPanel2.add(txtNuevo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 290, 30));

        lblAgenda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblAgenda.setForeground(new java.awt.Color(68, 68, 68));
        lblAgenda.setText("Configuración");
        lblAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgendaMouseClicked(evt);
            }
        });
        jPanel2.add(lblAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cActual.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 350, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cNueva.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 330, 70));

        btnGuardarCambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar cambios.png"))); // NOI18N
        btnGuardarCambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGuardarCambios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarCambiosMouseClicked(evt);
            }
        });
        jPanel2.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(68, 68, 68));
        jSeparator1.setToolTipText("");
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 100, 10));

        homeIcon.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        homeIcon.setForeground(new java.awt.Color(68, 68, 68));
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jPanel2.add(homeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 60, 60));

        Titulo2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        Titulo2.setForeground(new java.awt.Color(68, 68, 68));
        Titulo2.setText("Información del Odontólogo");
        jPanel2.add(Titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 310, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cNueva.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 330, 70));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setText("Nombre Usuario:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 140, 30));

        lblUsername.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 200, 30));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Correo:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 30));

        lblCorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 210, 30));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Nombre:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 140, 30));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Run:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 30));

        jSeparator4.setForeground(new java.awt.Color(68, 68, 68));
        jSeparator4.setToolTipText("");
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, 10));

        lblRun.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(lblRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 210, 30));

        lblNombreOdo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(lblNombreOdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, 30));

        FondoMedio3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        FondoMedio3.setText("jLabel1");
        jPanel2.add(FondoMedio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 420, 210));

        Titulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(68, 68, 68));
        Titulo.setText("Configuración");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 390, 60));

        FondoMedio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        FondoMedio1.setText("jLabel1");
        jPanel2.add(FondoMedio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 420, 450));

        FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoCompleto.png"))); // NOI18N
        jPanel2.add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1089, 800));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1010, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        odontologo = (new OdontologoDAO()).buscar(id_odontologo);
        lblNombreOdontologo.setText(odontologo.nombreCompleto());
        lblCorreo.setText(odontologo.getCorreo());
        lblNombreOdo.setText(odontologo.nombreCompleto());
        lblRun.setText(odontologo.getRun());
        lblUsername.setText(odontologo.getUsername());
    }//GEN-LAST:event_formWindowActivated

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnHistorialM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialM1MouseClicked
        // TODO add your handling code here:
        HistorialMedico i = new HistorialMedico();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHistorialM1MouseClicked

    private void lblAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendaMouseClicked
        // TODO add your handling code here:
        Configuracion i = new Configuracion();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAgendaMouseClicked

    private void btnConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseClicked
        // TODO add your handling code here:
        Configuracion i = new Configuracion();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConfiguracionMouseClicked

    private void btnAgendaHoyDisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaHoyDisaMouseClicked
        // TODO add your handling code here:
        Inicio i = new Inicio();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgendaHoyDisaMouseClicked

    private void btnCalendarioDisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalendarioDisaMouseClicked
        // TODO add your handling code here:
        Calendario i = new Calendario();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCalendarioDisaMouseClicked

    private void btnGuardarCambiosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarCambiosMouseClicked
        // TODO add your handling code here:

        if(txtPassActual.getPassword()!=null && txtNuevo1.getPassword()!=null && txtNuevo2.getPassword()!=null){
            
            try {
                char[] passwordActual = txtPassActual.getPassword();
                String passwordActual1 = new String(passwordActual);
                String p1 = Encryptar.encryptar(passwordActual1);
                
                char[] passwordNuevo1 = txtNuevo1.getPassword();
                String passwordNuevo11 = new String(passwordNuevo1);
                String p2 = Encryptar.encryptar(passwordNuevo11);
                
                char[] passwordNuevo2 = txtNuevo2.getPassword();
                String passwordActual12 = new String(passwordNuevo2);
                String p3 = Encryptar.encryptar(passwordActual12);
                
                
                
                Odontologo o = (new OdontologoDAO()).buscar(id_odontologo);
                if(o.getPassword().equals(p1)){
                    if(p2.equals(p3)){
                        if(p1.equals(p2)){
                            o.setPassword(p2);
                            int estado = (new OdontologoDAO()).modificar(o);
                            if(estado==1){
                                
                            }else{
                                // no se pudo codificar
                            }
                        }else{
                            //son la misma clave
                        }
                    }else{
                        // No son iguales
                    }
                }else{
//                no son la misma
                }
            } catch (NoSuchAlgorithmException ex) {
                // un problema muy grande
                Logger.getLogger(Configuracion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            // no hay nada
        }
        
       
    }//GEN-LAST:event_btnGuardarCambiosMouseClicked

    private void txtPassActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassActualKeyTyped
        // TODO add your handling code here:
        char[] passwordActual = txtPassActual.getPassword();
        String p1 = new String(passwordActual);
        if (p1.length() >= 8 ) // limit textfield to 3 characters
            evt.consume(); 
    }//GEN-LAST:event_txtPassActualKeyTyped

    private void txtNuevo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevo1KeyTyped
        // TODO add your handling code here:
        
        char[] passwordActual = txtNuevo1.getPassword();
        String p1 = new String(passwordActual);
        if (p1.length() >= 8 ) // limit textfield to 3 characters
            evt.consume(); 
    }//GEN-LAST:event_txtNuevo1KeyTyped

    private void txtNuevo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNuevo2KeyTyped
        // TODO add your handling code here:
        char[] passwordActual = txtNuevo2.getPassword();
        String p1 = new String(passwordActual);
        if (p1.length() >= 8 ) // limit textfield to 3 characters
            evt.consume(); 
    }//GEN-LAST:event_txtNuevo2KeyTyped

    private void txtNuevo2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNuevo2FocusGained
        // TODO add your handling code here:
         txtNuevo2.setText("");
    }//GEN-LAST:event_txtNuevo2FocusGained

    private void txtNuevo1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNuevo1FocusGained
        // TODO add your handling code here:
        txtNuevo1.setText("");
    }//GEN-LAST:event_txtNuevo1FocusGained

    private void txtPassActualFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassActualFocusGained
        // TODO add your handling code here:
        txtPassActual.setText("");
    }//GEN-LAST:event_txtPassActualFocusGained

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
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Configuracion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Configuracion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoMedio1;
    private javax.swing.JLabel FondoMedio3;
    private javax.swing.JLabel FondoPrincipal;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo2;
    private javax.swing.JLabel Vertical;
    private javax.swing.JLabel Vertical1;
    private javax.swing.JLabel btnAgendaHoyDisa;
    private javax.swing.JLabel btnCalendarioDisa;
    private javax.swing.JLabel btnConfiguracion;
    private javax.swing.JLabel btnGuardarCambios;
    private javax.swing.JLabel btnHistorialM;
    private javax.swing.JLabel btnHistorialM1;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblAgenda;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombreOdo;
    private javax.swing.JLabel lblNombreOdontologo;
    private javax.swing.JLabel lblRun;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField txtNuevo1;
    private javax.swing.JPasswordField txtNuevo2;
    private javax.swing.JPasswordField txtPassActual;
    // End of variables declaration//GEN-END:variables

    
}
