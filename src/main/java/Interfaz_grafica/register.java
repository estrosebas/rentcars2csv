package Interfaz_grafica;
/**
 *
 * @author eduardo
 */
import AlmacenadoDeDatos.clienteDAO;
import Objetos.Cliente;
import Objetos.Usuario;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
//import Entidad.Login;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class register extends javax.swing.JFrame {

    ImageIcon iconoPersonalizado = new ImageIcon(register.class.getResource("/cheque.png"));
    ImageIcon iconoPersonalizadoAlerta = new ImageIcon(register.class.getResource("/alerta.png"));
//ImageIcon iconoPersonalizado = new ImageIcon(getImage(getClass().getResource("/beca.png"));
    int xMouse, yMouse;

    public register() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Dominic");
    }

    public Image getIconImage() {
        //Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("/beca.png"));
        Image retValue = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/beca.png"));

        return retValue;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        loginBtn1 = new javax.swing.JPanel();
        loginBtnTxt1 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        correotxt = new javax.swing.JTextField();
        contraseñatxt = new javax.swing.JPasswordField();
        userLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        userLabel1 = new javax.swing.JLabel();
        direcciontxt = new javax.swing.JTextField();
        userLabel2 = new javax.swing.JLabel();
        usuariotxt = new javax.swing.JTextField();
        userLabel3 = new javax.swing.JLabel();
        userLabel4 = new javax.swing.JLabel();
        userLabel5 = new javax.swing.JLabel();
        nombretxt = new javax.swing.JTextField();
        ntelefonotxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginBtn.setBackground(new java.awt.Color(0, 134, 190));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        loginBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("Login");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 100, 40));

        loginBtn1.setBackground(new java.awt.Color(0, 134, 190));
        loginBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtn1MouseClicked(evt);
            }
        });

        loginBtnTxt1.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        loginBtnTxt1.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt1.setText("Register");
        loginBtnTxt1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginBtnTxt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxt1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginBtn1Layout = new javax.swing.GroupLayout(loginBtn1);
        loginBtn1.setLayout(loginBtn1Layout);
        loginBtn1Layout.setHorizontalGroup(
            loginBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        loginBtn1Layout.setVerticalGroup(
            loginBtn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, 40));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("DOMINIC");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        correotxt.setBackground(new java.awt.Color(102, 102, 102));
        correotxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        correotxt.setForeground(new java.awt.Color(0, 102, 102));
        correotxt.setBorder(null);
        bg.add(correotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 220, 30));

        contraseñatxt.setBackground(new java.awt.Color(102, 102, 102));
        contraseñatxt.setForeground(new java.awt.Color(0, 102, 102));
        contraseñatxt.setBorder(null);
        bg.add(contraseñatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 220, 30));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 0, 0));
        userLabel.setText("DIRECCION");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setForeground(new java.awt.Color(0, 0, 0));
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        userLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel1.setForeground(new java.awt.Color(0, 0, 0));
        userLabel1.setText("USUARIO");
        bg.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        direcciontxt.setBackground(new java.awt.Color(102, 102, 102));
        direcciontxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        direcciontxt.setForeground(new java.awt.Color(0, 102, 102));
        direcciontxt.setBorder(null);
        bg.add(direcciontxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 220, 30));

        userLabel2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel2.setForeground(new java.awt.Color(0, 0, 0));
        userLabel2.setText("CORREO");
        bg.add(userLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        usuariotxt.setBackground(new java.awt.Color(102, 102, 102));
        usuariotxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        usuariotxt.setForeground(new java.awt.Color(0, 102, 102));
        usuariotxt.setBorder(null);
        bg.add(usuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 220, 30));

        userLabel3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel3.setForeground(new java.awt.Color(0, 0, 0));
        userLabel3.setText("NOMBRE");
        bg.add(userLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        userLabel4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel4.setForeground(new java.awt.Color(0, 0, 0));
        userLabel4.setText("N-TELEFONO");
        bg.add(userLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        userLabel5.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        userLabel5.setForeground(new java.awt.Color(0, 0, 0));
        userLabel5.setText("N-TELEFONO");
        bg.add(userLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        nombretxt.setBackground(new java.awt.Color(102, 102, 102));
        nombretxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombretxt.setForeground(new java.awt.Color(0, 102, 102));
        nombretxt.setBorder(null);
        bg.add(nombretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 220, 30));

        ntelefonotxt.setBackground(new java.awt.Color(102, 102, 102));
        ntelefonotxt.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ntelefonotxt.setForeground(new java.awt.Color(0, 102, 102));
        ntelefonotxt.setBorder(null);
        bg.add(ntelefonotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 220, 30));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        login framelogin = new login();
        framelogin.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void loginBtnTxt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxt1MouseClicked
        String usuario = usuariotxt.getText();
        String contrasena = contraseñatxt.getText();
        String nombre = nombretxt.getText();
        String direccion = direcciontxt.getText();
        int ntelefono = Integer.parseInt(ntelefonotxt.getText());
        String correo = correotxt.getText();
        
        // Crear una instancia de Cliente
        Cliente nuevoCliente = new Cliente(0, nombre, direccion, ntelefono, correo, usuario, contrasena, false);

        // Crear una instancia de clienteDAO
        clienteDAO dao = new clienteDAO();

        // Intentar insertar el nuevo cliente en la base de datos
        boolean exito = dao.insertar(nuevoCliente);

        // Proporcionar retroalimentación al usuario
        if (exito) {
            JOptionPane.showMessageDialog(this, "Registro exitoso");
            login frammelogin = new login();
            frammelogin.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el cliente");
        }
    }//GEN-LAST:event_loginBtnTxt1MouseClicked

    private void loginBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtn1MouseClicked
        
    }//GEN-LAST:event_loginBtn1MouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginBtnMouseClicked

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    /*private void escribirNumSesion(int id) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_SESION))) {
            bw.write(String.valueOf(id));  // Convertir entero a cadena antes de escribir
        } catch (IOException e) {
            e.printStackTrace(); // Manejo adecuado de excepciones
        }
    }*/
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPasswordField contraseñatxt;
    private javax.swing.JTextField correotxt;
    private javax.swing.JTextField direcciontxt;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JPanel loginBtn1;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel loginBtnTxt1;
    private javax.swing.JTextField nombretxt;
    private javax.swing.JTextField ntelefonotxt;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JLabel userLabel2;
    private javax.swing.JLabel userLabel3;
    private javax.swing.JLabel userLabel4;
    private javax.swing.JLabel userLabel5;
    private javax.swing.JTextField usuariotxt;
    // End of variables declaration//GEN-END:variables
}
