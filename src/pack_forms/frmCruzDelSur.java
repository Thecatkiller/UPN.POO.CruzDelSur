package pack_forms;

import java.awt.Dimension;
import pack_clases.ImagenFondo;

public class frmCruzDelSur extends javax.swing.JFrame {

    private frmCliente primer_hijo;
    private frmViajes segundo_hijo;
    private frmMovilidad tercer_hijo;
    private frmConductor cuarto_hijo;
    private int estado;

    //interaccion con botones
    private void mostrarFrm() {
        if (estado == 1) {
            primer_hijo.show();
            segundo_hijo.setVisible(false);
            tercer_hijo.setVisible(false);
            cuarto_hijo.setVisible(false);
            btnCliente.setBackground(new java.awt.Color(204, 204, 0));
            btnCliente.setForeground(new java.awt.Color(50, 0, 255));
            btnViaje.setBackground(new java.awt.Color(255, 255, 255));
            btnViaje.setForeground(new java.awt.Color(50, 0, 255));
            btnMovilidad.setBackground(new java.awt.Color(255, 255, 255));
            btnMovilidad.setForeground(new java.awt.Color(50, 0, 255));
            btnConductor.setBackground(new java.awt.Color(255, 255, 255));
            btnConductor.setForeground(new java.awt.Color(50, 0, 255));
        } else if (estado == 2) {
            segundo_hijo.show();
            primer_hijo.setVisible(false);
            tercer_hijo.setVisible(false);
            cuarto_hijo.setVisible(false);
            btnCliente.setBackground(new java.awt.Color(255, 255, 255));
            btnCliente.setForeground(new java.awt.Color(50, 0, 255));
            btnViaje.setBackground(new java.awt.Color(204, 204, 0));
            btnViaje.setForeground(new java.awt.Color(50, 0, 255));
            btnMovilidad.setBackground(new java.awt.Color(255, 255, 255));
            btnMovilidad.setForeground(new java.awt.Color(50, 0, 255));
            btnConductor.setBackground(new java.awt.Color(255, 255, 255));
            btnConductor.setForeground(new java.awt.Color(50, 0, 255));
        } else if (estado == 3) {
            tercer_hijo.show();
            primer_hijo.setVisible(false);
            segundo_hijo.setVisible(false);
            cuarto_hijo.setVisible(false);
            btnCliente.setBackground(new java.awt.Color(255, 255, 255));
            btnCliente.setForeground(new java.awt.Color(50, 0, 255));
            btnViaje.setBackground(new java.awt.Color(255, 255, 255));
            btnViaje.setForeground(new java.awt.Color(50, 0, 255));
            btnMovilidad.setBackground(new java.awt.Color(204, 204, 0));
            btnMovilidad.setForeground(new java.awt.Color(50, 0, 255));
            btnConductor.setBackground(new java.awt.Color(255, 255, 255));
            btnConductor.setForeground(new java.awt.Color(50, 0, 255));
        } else {
            cuarto_hijo.show();
            primer_hijo.setVisible(false);
            segundo_hijo.setVisible(false);
            tercer_hijo.setVisible(false);
            btnCliente.setBackground(new java.awt.Color(255, 255, 255));
            btnCliente.setForeground(new java.awt.Color(50, 0, 255));
            btnViaje.setBackground(new java.awt.Color(255, 255, 255));
            btnViaje.setForeground(new java.awt.Color(50, 0, 255));
            btnMovilidad.setBackground(new java.awt.Color(255, 255, 255));
            btnMovilidad.setForeground(new java.awt.Color(50, 0, 255));
            btnConductor.setBackground(new java.awt.Color(204, 204, 0));
            btnConductor.setForeground(new java.awt.Color(50, 0, 255));
        }
    }

    public frmCruzDelSur() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(55, 100, 247));
        jDesktopPane1.setBorder(new ImagenFondo());
        this.setLocationRelativeTo(null);
        Dimension d = jDesktopPane1.getSize();

        primer_hijo = new frmCliente("1");
        primer_hijo.setClosable(false);
        primer_hijo.setResizable(false);
        primer_hijo.setLocation(0, -23);
        primer_hijo.setSize(d.width, d.height + 23);
        jDesktopPane1.add(primer_hijo);

        segundo_hijo = new frmViajes("2");
        segundo_hijo.setClosable(false);
        segundo_hijo.setResizable(false);
        segundo_hijo.setLocation(0, -23);
        segundo_hijo.setSize(d.width, d.height + 23);
        jDesktopPane1.add(segundo_hijo);

        tercer_hijo = new frmMovilidad("3");
        tercer_hijo.setClosable(false);
        tercer_hijo.setResizable(false);
        tercer_hijo.setLocation(0, -23);
        tercer_hijo.setSize(d.width, d.height + 23);
        jDesktopPane1.add(tercer_hijo);

        cuarto_hijo = new frmConductor("4");
        cuarto_hijo.setClosable(false);
        cuarto_hijo.setResizable(false);
        cuarto_hijo.setLocation(0, -23);
        cuarto_hijo.setSize(d.width, d.height + 23);
        jDesktopPane1.add(cuarto_hijo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCliente = new javax.swing.JButton();
        btnViaje = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnMovilidad = new javax.swing.JButton();
        btnConductor = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 0));

        btnCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnCliente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(0, 0, 255));
        btnCliente.setText("Registro de cliente");
        btnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        btnViaje.setBackground(new java.awt.Color(255, 255, 255));
        btnViaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViaje.setForeground(new java.awt.Color(0, 0, 255));
        btnViaje.setText("Registro de viaje");
        btnViaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajeActionPerformed(evt);
            }
        });

        btnHorario.setBackground(new java.awt.Color(255, 255, 255));
        btnHorario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHorario.setForeground(new java.awt.Color(0, 0, 255));
        btnHorario.setText("Registro Horario");
        btnHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnMovilidad.setBackground(new java.awt.Color(255, 255, 255));
        btnMovilidad.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMovilidad.setForeground(new java.awt.Color(0, 0, 255));
        btnMovilidad.setText("Registro movilidad");
        btnMovilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMovilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovilidadActionPerformed(evt);
            }
        });

        btnConductor.setBackground(new java.awt.Color(255, 255, 255));
        btnConductor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConductor.setForeground(new java.awt.Color(0, 0, 255));
        btnConductor.setText("Registro conductor");
        btnConductor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConductor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConductorActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 255));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Filosofia");
        jButton6.setBorder(null);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton7.setBackground(new java.awt.Color(0, 0, 255));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Centro de Ayuda");
        jButton7.setBorder(null);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton8.setBackground(new java.awt.Color(255, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Cerrar sesion");
        jButton8.setBorder(null);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_imagenes/barraTitulo.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMovilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addComponent(jDesktopPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(btnViaje, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnMovilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(btnConductor, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDesktopPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        estado = 1;
        mostrarFrm();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        frmPrincipal frm = new frmPrincipal();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void btnMovilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovilidadActionPerformed
        estado = 3;
        mostrarFrm();
    }//GEN-LAST:event_btnMovilidadActionPerformed

    private void btnViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajeActionPerformed
        estado = 2;
        mostrarFrm();
    }//GEN-LAST:event_btnViajeActionPerformed

    private void btnConductorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConductorActionPerformed
        estado = 4;
        mostrarFrm();
    }//GEN-LAST:event_btnConductorActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        frmCruzDelSur frm = new frmCruzDelSur();
        frm.setVisible(true);
        this.setVisible(false);
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmCruzDelSur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCruzDelSur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCruzDelSur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCruzDelSur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCruzDelSur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnConductor;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnMovilidad;
    private javax.swing.JButton btnViaje;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
