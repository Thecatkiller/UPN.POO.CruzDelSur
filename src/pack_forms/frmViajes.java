/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack_forms;

import java.awt.Dimension;
import pack_forms.frmIngresarViaje;

/**
 *
 * @author Bryan
 */
public class frmViajes extends javax.swing.JInternalFrame {

    frmIngresarViaje ingresarviajes;

    public frmViajes(String a) {
        initComponents();
        ingresarviajes = new frmIngresarViaje();
        add(ingresarviajes);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mingresar = new javax.swing.JMenuItem();
        msalir = new javax.swing.JMenuItem();

        setPreferredSize(new java.awt.Dimension(815, 481));

        jMenu1.setText("Viajes");

        mingresar.setText("Ingresar Viajes");
        mingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mingresarActionPerformed(evt);
            }
        });
        jMenu1.add(mingresar);

        msalir.setText("Salir");
        msalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msalirActionPerformed(evt);
            }
        });
        jMenu1.add(msalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 823, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mingresarActionPerformed

        ingresarviajes.setVisible(true);

    }//GEN-LAST:event_mingresarActionPerformed

    private void msalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_msalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mingresar;
    private javax.swing.JMenuItem msalir;
    // End of variables declaration//GEN-END:variables
}
