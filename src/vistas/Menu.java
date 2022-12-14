/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Controlador.ControladorUsuario;

/**
 *
 * @author Juan Potes
 */
public class Menu extends javax.swing.JFrame {
    private ControladorUsuario GestionUsuario;
    private Login ventanaLogin;

    /**
     * Creates new form JfrmGestion
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(this);
        GestionUsuario = new ControladorUsuario();
    }

    public ControladorUsuario getGestionUsuario() {
        return GestionUsuario;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnGestionUser = new javax.swing.JButton();
        btnGestionArti = new javax.swing.JButton();
        btnVender = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGestionUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGestionUser.setText("Gestionar Usuario");
        btnGestionUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        btnGestionArti.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnGestionArti.setText("Gestionar Articulo");
        btnGestionArti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionArtiActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionArti, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        btnVender.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        jPanel1.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 150, 170, -1));

        btnSalir.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 190, 170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGestionUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionUserActionPerformed
        // TODO add your handling code here:
        GestionUsuario ventana = new GestionUsuario();
        ventana.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnGestionUserActionPerformed

    private void btnGestionArtiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionArtiActionPerformed
        // TODO add your handling code here:
        
        RegistroArticulos ventana = new  RegistroArticulos();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGestionArtiActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        GestionVenta ventana = new GestionVenta ();
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVenderActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        Login ventanaLogin = new Login();
        ventanaLogin.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnSalirActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
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
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGestionArti;
    private javax.swing.JButton btnGestionUser;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
