/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.FichaClienteDAO;
import dao.HorarioDAO;
import dao.OdontologoDAO;
import dao.ReservaHoraDAO;
import dao.ServicioDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import modelo.Odontologo;
import modelo.ReservaHora;
import procedimientos.ColorearFilas;

/**
 *
 * @author MR-BM
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public int id_odontologo;
    public Odontologo odontologo;
    
    //Colores
    ColorearFilas colores = new ColorearFilas();
    
    public Inicio() {
        initComponents();
        setTitle("Linda Sonrisa");
        setLocationRelativeTo(null);
        setResizable(false);    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        actualizarTabla();
        
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
        btnAgendaHoy = new javax.swing.JLabel();
        btnAgendaHoyDisa = new javax.swing.JLabel();
        btnCalendarioDisa = new javax.swing.JLabel();
        btnCalendario = new javax.swing.JLabel();
        btnHistorialM1 = new javax.swing.JLabel();
        btnHistorialM = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        Vertical1 = new javax.swing.JLabel();
        Vertical = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaReserva = new javax.swing.JTable();
        lblAgenda = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        homeIcon = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        FondoMedio = new javax.swing.JLabel();
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

        btnAgendaHoy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgendaHoy.png"))); // NOI18N
        btnAgendaHoy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgendaHoy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgendaHoyMouseClicked(evt);
            }
        });
        jPanel1.add(btnAgendaHoy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 270, 60));

        btnAgendaHoyDisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAgendaDisa.png"))); // NOI18N
        jPanel1.add(btnAgendaHoyDisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 270, 60));

        btnCalendarioDisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCalendarioDisabled.png"))); // NOI18N
        btnCalendarioDisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCalendarioDisaMouseClicked(evt);
            }
        });
        jPanel1.add(btnCalendarioDisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 60));

        btnCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCalendario.png"))); // NOI18N
        jPanel1.add(btnCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 270, 60));

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

        TablaReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Fecha", "Horario", "Servicio", "Run", "Nombre Completo", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaReserva.setFocusable(false);
        TablaReserva.setIntercellSpacing(new java.awt.Dimension(0, 0));
        TablaReserva.setRowHeight(25);
        TablaReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaReservaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaReserva);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 900, 440));

        lblAgenda.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblAgenda.setForeground(new java.awt.Color(68, 68, 68));
        lblAgenda.setText("Agenda Hoy");
        lblAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAgenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgendaMouseClicked(evt);
            }
        });
        jPanel2.add(lblAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 90, 20));

        jSeparator1.setForeground(new java.awt.Color(68, 68, 68));
        jSeparator1.setToolTipText("");
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 100, 10));

        homeIcon.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        homeIcon.setForeground(new java.awt.Color(68, 68, 68));
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home.png"))); // NOI18N
        jPanel2.add(homeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 60, 60, 60));

        Titulo.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        Titulo.setForeground(new java.awt.Color(68, 68, 68));
        Titulo.setText("Lista de Pacientes Hoy");
        jPanel2.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 400, 60));

        FondoMedio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        FondoMedio.setText("jLabel1");
        jPanel2.add(FondoMedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1000, 400));

        FondoMedio1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        FondoMedio1.setText("jLabel1");
        jPanel2.add(FondoMedio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1000, 450));

        FondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoCompleto.png"))); // NOI18N
        jPanel2.add(FondoPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1089, 800));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 1010, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        odontologo = (new OdontologoDAO()).buscar(id_odontologo);
        lblNombreOdontologo.setText(odontologo.getNombres() + " " + odontologo.getApellidos());
    }//GEN-LAST:event_formWindowActivated

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void TablaReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaReservaMouseClicked
        // hacer doble click
        DefaultTableModel modelo=(DefaultTableModel) TablaReserva.getModel(); 
        if(evt.getClickCount()==2){
//            JOptionPane.showMessageDialog(rootPane, "has tocado" + TablaReserva.getSelectedRow());
            int x = TablaReserva.getSelectedRow(); //Busco la posicion de la fila
            int y=0; // 0 es porque se que en la posicion de la columna 0 tengo los rut

            int id = (int) modelo.getValueAt(x, y); // Busco el elemento con las coordenadas X,Y
            ReservaHora r = (new ReservaHoraDAO()).buscar(id);
        
//            System.out.println(r.toString());
            
            Paciente paciente = new Paciente();
            paciente.id_odontologo = id_odontologo;
            paciente.id_reservar_hora = r.getId_reservar_hora();
            paciente.setVisible(true);
            this.setVisible(false);
            
        }
        
    }//GEN-LAST:event_TablaReservaMouseClicked

    private void btnHistorialM1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistorialM1MouseClicked
        // TODO add your handling code here:
        HistorialMedico i = new HistorialMedico();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHistorialM1MouseClicked

    private void btnAgendaHoyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgendaHoyMouseClicked
        // TODO add your handling code here:
        Inicio i = new Inicio();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAgendaHoyMouseClicked

    private void lblAgendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgendaMouseClicked
        // TODO add your handling code here:
        Inicio i = new Inicio();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblAgendaMouseClicked

    private void btnCalendarioDisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalendarioDisaMouseClicked
        // TODO add your handling code here:
        Calendario i = new Calendario();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCalendarioDisaMouseClicked

    private void btnConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseClicked
        // TODO add your handling code here:
        Configuracion i = new Configuracion();
        i.id_odontologo = id_odontologo;
        i.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConfiguracionMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoMedio;
    private javax.swing.JLabel FondoMedio1;
    private javax.swing.JLabel FondoPrincipal;
    private javax.swing.JTable TablaReserva;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Vertical;
    private javax.swing.JLabel Vertical1;
    private javax.swing.JLabel btnAgendaHoy;
    private javax.swing.JLabel btnAgendaHoyDisa;
    private javax.swing.JLabel btnCalendario;
    private javax.swing.JLabel btnCalendarioDisa;
    private javax.swing.JLabel btnConfiguracion;
    private javax.swing.JLabel btnHistorialM;
    private javax.swing.JLabel btnHistorialM1;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAgenda;
    private javax.swing.JLabel lblNombreOdontologo;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla() {
        DefaultTableModel modelo = (DefaultTableModel) TablaReserva.getModel();
        modelo.setRowCount(0);
        
        
//         DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
         
         DateFormat hoy = new SimpleDateFormat("yyyy-MM-dd");
         DateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
//         DateFormat dateFormat2 = new SimpleDateFormat("dd-MM-yyyy");
         Date date = new Date();
//         System.out.println(hoy.toString());

        String fecha_hoy = hoy.format(date);
        ArrayList<ReservaHora> arrayReserva = new ArrayList<>();
        try {
            arrayReserva = (new ReservaHoraDAO()).mostrarPorFecha(fecha_hoy);
            
            Object[] columna = new Object[7];
            
            for (ReservaHora r: arrayReserva) {
                columna[0] = r.getId_reservar_hora();
                columna[1] = formato.format(date);
                columna[2] = (new HorarioDAO()).buscar(r.getId_horario()).getHorario();                
                columna[3] = (new ServicioDAO()).buscar(r.getId_servicio()).getNombre_servicio();
                columna[4] = (new FichaClienteDAO()).buscar(r.getId_ficha_cliente()).getRut();
                columna[5] = (new FichaClienteDAO()).buscar(r.getId_ficha_cliente()).getNombreCompleto();
                if(r.getId_estado_reserva()==0){
                    columna[6] = "Cancelado";
                }else if (r.getId_estado_reserva()==1) {
                    columna[6] = "Pendiente";
                }else if(r.getId_estado_reserva()==2){
                    columna[6] = "Atendido";
                }else{
                    columna[6] = "No Asistió";
                }                
                
                modelo.addRow(columna);
                TablaReserva.setModel(modelo);
            }
            
//            TablaReserva.setDefaultRenderer(TablaReserva.getColumnClass(2),colores);
        } catch (Exception ex) {
            System.out.println("Error " + ex.toString());
        }
    }
}
