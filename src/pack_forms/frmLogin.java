package pack_forms;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Image;
import javax.swing.JOptionPane;
import pack_clases.Usuario;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
        ImageIcon imagen = new ImageIcon("src/pack_imagenes/login.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
        lblFondo.setIcon(icono);
        this.setLocationRelativeTo(null);
        txtUsuario.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPasword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Usuario:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 210, 60, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Contraseña:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 290, 80, 20);

        txtUsuario.setToolTipText("Ingrese su nombre de usuario");
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(160, 200, 160, 30);

        txtPasword.setToolTipText("Ingrese su contraseña");
        jPanel1.add(txtPasword);
        txtPasword.setBounds(160, 280, 160, 30);

        btnIngresar.setText("Ingresar");
        btnIngresar.setToolTipText("Inica sesión");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(150, 390, 80, 30);

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("admin");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 230, 40, 20);

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("123");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 320, 30, 14);
        jPanel1.add(lblFondo);
        lblFondo.setBounds(0, 0, 370, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Usuario obj = new Usuario();
        obj.setUser("admin");
        obj.setPasword("123");

        if (txtUsuario.getText().equals(obj.getUser()) && txtPasword.getText().equals(obj.getPasword())) {
            this.dispose();
            JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
                    + "satisfactoriamente al sistema", "Mensaje de bienvenida",
                    JOptionPane.INFORMATION_MESSAGE);
            frmCruzDelSur frm = new frmCruzDelSur();
            frm.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
                    + "Por favor ingrese un usuario y/o contraseña correctos",
                    "Acceso denegado", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPasswordField txtPasword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
