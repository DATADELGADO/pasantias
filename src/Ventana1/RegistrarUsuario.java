package Ventana1;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class RegistrarUsuario extends javax.swing.JFrame {

    public static Connection conexion = Ventana_login.conexion;

    public RegistrarUsuario() {
        initComponents();
        personalizar_JFrame();
        nuevoUsuario();
    }

    public void personalizar_JFrame() {
        //this.setIconImage(Toolkit.getDefaultToolkit().createImage(VentanaPrincipal.class.getResource("w2.jpg")));
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("ALMACEN");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.CYAN);

    }

    public void nuevoUsuario() {
        txtUsuarioAuto.setText(OperacionesCrud.retornaIdusuarioAutomatico(conexion));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuarioAuto = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        boxMostrarB = new javax.swing.JCheckBox();
        boxMostrarA = new javax.swing.JCheckBox();
        txtRecontrasena = new javax.swing.JPasswordField();
        txtContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ALMACEN");
        jLabel2.setOpaque(true);

        jLabel4.setText("NOMBRE");

        jLabel6.setText("APELLIDOS");

        jLabel7.setText("DNI");

        jLabel8.setText("CORREO");

        jLabel9.setText("CIUDAD");

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("SIGN UP IN ALMACEN");
        jLabel5.setOpaque(true);

        jButton1.setText("SIGN UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("CONTRASEÑA");

        jLabel11.setText("REPITE CONTRASEÑA");

        txtUsuarioAuto.setEnabled(false);

        jLabel12.setText("ID USUARIO");

        boxMostrarB.setText("MOSTRAR");
        boxMostrarB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMostrarBActionPerformed(evt);
            }
        });

        boxMostrarA.setText("MOSTRAR");
        boxMostrarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMostrarAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUsuarioAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addGap(74, 74, 74))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(55, 55, 55))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(txtCiudad, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                                .addComponent(txtRecontrasena)
                                .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boxMostrarB)
                    .addComponent(boxMostrarA))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(356, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(300, 300, 300)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuarioAuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(boxMostrarA)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(boxMostrarB)
                            .addComponent(txtRecontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(97, 97, 97))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(555, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = txtNombre.getText().toUpperCase().trim().replaceAll("\\s+", " ");
        String apellidos = txtApellidos.getText().toUpperCase().trim().replaceAll("\\s+", " ");
        String dni = txtDni.getText().toUpperCase().trim().replaceAll("\\s+", "");
        String correo = txtCorreo.getText().toUpperCase().trim().replaceAll("\\s+", "");
        String contrasena = String.valueOf(txtContrasena.getPassword()).trim().replaceAll("\\s+", "");
        String recontrasena = String.valueOf(txtRecontrasena.getPassword()).trim().replaceAll("\\s+", "");
        String ciudad = txtCiudad.getText().toUpperCase().trim().replaceAll("\\s+", " ");
        System.out.println(contrasena + "    " + recontrasena);
        if (nombre.matches("[a-zA-ZÑ\\s]+")
                && apellidos.matches("[a-zA-ZÑ\\s]+")
                && dni.matches("[a-zA-ZÑñ0-9]+")
                && correo.matches("[\\+a-zA-ZÑ0-9\\._-]+(@[A-ZÑ]+)(\\.COM)")
                && contrasena.matches("[([a-zA-ZñÑ])||([0-9])||([\\-_+.*@])]{8,15}") //"/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$/"
                && recontrasena.matches("[([a-zA-ZñÑ])||([0-9])||([\\-_+.*@])]{8,15}") //"/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])([A-Za-z\\d$@$!%*?&]|[^ ]){8,15}$/"
                && ciudad.matches("[a-zA-ZÑ\\s]+")) {
            if (contrasena.equalsIgnoreCase(recontrasena)) {
                Usuario usuario = new Usuario(txtUsuarioAuto.getText(), nombre, apellidos, dni);
                String[] usuario_login = {txtUsuarioAuto.getText(), contrasena, correo, ciudad};
                if (OperacionesCrud.insertar(usuario, conexion) && OperacionesCrud.insertarLogin(usuario_login, conexion)) {
                    JOptionPane.showMessageDialog(this, "USUARIO CREADO CORRECTAMENTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR: CREAR USUARIO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "LA CONTRASEÑA NO COINCIDE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            String mensaje = "ERROR EN LOS CAMPOS: ";
            if (!nombre.matches("[a-zA-ZÑ\\s]+")) {
                mensaje = mensaje + "  (NOMBRE)";
            }
            if (!apellidos.matches("[a-zA-ZÑ\\s]+")) {
                mensaje = mensaje + "  (APELLIDOS)";
            }
            if (!dni.matches("[a-zA-ZÑñ0-9]+")) {
                mensaje = mensaje + "  (DNI)";
            }
            if (!correo.matches("[\\+a-zA-ZÑ0-9\\._-]+(@[A-ZÑ]+)(\\.COM)")) {
                mensaje = mensaje + "  (CORREO)";
            }
            if (!contrasena.matches("[([a-zA-ZñÑ])||([0-9])||([\\-_+.*@])]{8,15}")) {
                mensaje = mensaje + "  (CONTRASEÑA: DEBE CONTENER ENTRE 8 Y 15 CARACTERES FORMADOS POR NUMEROS, LETRAS, -_+.*@)";
            }
            if (!recontrasena.matches("[([a-zA-ZñÑ])||([0-9])||([\\-_+.*@])]{8,15}")) {
                mensaje = mensaje + "  (REPETIR CONTRASEÑA)";
            }
            if (!ciudad.matches("[a-zA-ZÑ\\s]+")) {
                mensaje = mensaje + "  (CIUDAD)";
            }
            JOptionPane.showMessageDialog(this, mensaje, "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxMostrarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMostrarAActionPerformed
        if(boxMostrarA.isSelected()){
          txtContrasena.setEchoChar((char)0);
        }else{
            txtContrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_boxMostrarAActionPerformed

    private void boxMostrarBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMostrarBActionPerformed
        if(boxMostrarB.isSelected()){
          txtRecontrasena.setEchoChar((char)0);
        }else{
            txtRecontrasena.setEchoChar('*');
        }
    }//GEN-LAST:event_boxMostrarBActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxMostrarA;
    private javax.swing.JCheckBox boxMostrarB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCiudad;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtRecontrasena;
    private javax.swing.JTextField txtUsuarioAuto;
    // End of variables declaration//GEN-END:variables
}
