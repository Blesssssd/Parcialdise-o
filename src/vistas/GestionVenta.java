/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import Controlador.ControladorArticulo;
import Controlador.ControladorVenta;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Articulo;
import modelo.Venta;

/**
 *
 * @author HP
 */
public class GestionVenta extends javax.swing.JFrame {

    ControladorVenta gestionVentas;

    /**
     * Creates new form JfrmVentas
     */
    public GestionVenta() {
        initComponents();
        gestionVentas = new ControladorVenta();
        llenarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        labelArticulo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        labelFecha = new javax.swing.JLabel();
        labelUnidad = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        txtArticulo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtUnidad = new javax.swing.JTextField();
        btnVender = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de Venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelArticulo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        labelArticulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelArticulo.setText("Articulo");
        bg.add(labelArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 25));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 100, 25));

        labelFecha.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        labelFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelFecha.setText("Fecha");
        bg.add(labelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 25));

        labelUnidad.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        labelUnidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUnidad.setText("Unidad");
        bg.add(labelUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 130, 25));

        labelTotal.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        labelTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTotal.setText("Total");
        bg.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, 25));
        bg.add(txtArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 100, 25));
        bg.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 100, 25));
        bg.add(txtUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 100, 25));

        btnVender.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        bg.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 100, -1));

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        bg.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        labelCodigo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        labelCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCodigo.setText("Codigo");
        bg.add(labelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 25));
        bg.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 100, 25));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 370));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tabla", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 18))); // NOI18N

        TablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Articulo ", "Fecha", "Unidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(TablaVentas);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 400, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        Menu ventana = new Menu();
        ventana.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        String codigo = txtCodigo.getText();
        String fecha = txtFecha.getText();
        int unidad = Integer.parseInt(txtUnidad.getText());
        String nombreA = txtArticulo.getText();
        double total = Double.parseDouble(txtTotal.getText());

        if (gestionVentas.registrarVenta(codigo, fecha, unidad, nombreA, total)) {
            JOptionPane.showMessageDialog(this, "Guardado exitosamente");
            limpiar();
            llenarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar");
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    public void limpiar() {
        txtArticulo.setText("");
        txtFecha.setText("");
        txtTotal.setText("");
        txtUnidad.setText("");
        txtCodigo.setText("");
    }

    public void llenarTabla() {
        DefaultTableModel model = new DefaultTableModel();
        List<Venta> lista = gestionVentas.obtenerLista();
        model.setColumnIdentifiers(new Object[]{"codigo", "fecha", "unidad", "articulo", "total"});
        TablaVentas.setModel(model);
        for (int i = 0; i < lista.size(); i++) {
            model.addRow(new Object[]{
                lista.get(i).getCodigo(),
                lista.get(i).getFecha(),
                lista.get(i).getUnidad(),
                lista.get(i).getNombreA(),
                lista.get(i).getTotal(),});

        }
    }

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
//            java.util.logging.Logger.getLogger(GestionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(GestionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(GestionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(GestionVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
////                new GestionVenta().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVentas;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnVender;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelArticulo;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelFecha;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelUnidad;
    private javax.swing.JTextField txtArticulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtUnidad;
    // End of variables declaration//GEN-END:variables
}