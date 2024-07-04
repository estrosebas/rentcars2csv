/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz_grafica;

/**
 *
 * @author eduardo
 */
import AlmacenadoDeDatos.clienteDAO;
import Objetos.Cliente;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;

public class conductores extends javax.swing.JFrame {

    /**
     * Creates new form conductores
     */
    public conductores() {
        initComponents();
        consultarconductores();
        setLocationRelativeTo(null);
        setTitle("Dominic");
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaconductores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Conductores / Choferes");

        tablaconductores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "usaurio", "nombre", "telefono", "correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaconductores);
        if (tablaconductores.getColumnModel().getColumnCount() > 0) {
            tablaconductores.getColumnModel().getColumn(0).setResizable(false);
            tablaconductores.getColumnModel().getColumn(1).setResizable(false);
            tablaconductores.getColumnModel().getColumn(2).setResizable(false);
            tablaconductores.getColumnModel().getColumn(3).setResizable(false);
            tablaconductores.getColumnModel().getColumn(4).setResizable(false);
        }

        jButton1.setText("registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton3)))
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String usuario = JOptionPane.showInputDialog("Ingresa tu usuario:");
        String contrasena = JOptionPane.showInputDialog("Ingresa tu contraseña:");
        String nombre = JOptionPane.showInputDialog("Ingresa tu nombre:");
        String direccion = JOptionPane.showInputDialog("Ingresa tu dirección:");
        String telefonoStr = JOptionPane.showInputDialog("Ingresa tu número de teléfono:");
        int ntelefono = Integer.parseInt(telefonoStr);
        String correo = JOptionPane.showInputDialog("Ingresa tu correo:");

        // Crear una instancia de Cliente
        Cliente nuevoCliente = new Cliente(0, nombre, direccion, ntelefono, correo, usuario, contrasena, false);

        // Crear una instancia de clienteDAO
        clienteDAO dao = new clienteDAO();

        // Intentar insertar el nuevo cliente en la base de datos
        boolean exito = dao.insertar(nuevoCliente);

        // Proporcionar retroalimentación al usuario
        if (exito) {
            JOptionPane.showMessageDialog(this, "Registro exitoso");
            consultarconductores();
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el cliente");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String idClienteStr = JOptionPane.showInputDialog("Ingresa el ID del cliente a eliminar:");
        int idCliente = Integer.parseInt(idClienteStr);

        // Crear una instancia de clienteDAO
        clienteDAO dao = new clienteDAO();

        // Intentar eliminar el cliente de la base de datos
        boolean exito = dao.eliminar(idCliente);

        // Proporcionar retroalimentación al usuario
        if (exito) {
            JOptionPane.showMessageDialog(this, "Cliente eliminado exitosamente");
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el cliente");
        }
        consultarconductores();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String idClienteStr = JOptionPane.showInputDialog("Ingresa el ID del cliente a modificar:");
        int idCliente = Integer.parseInt(idClienteStr);

        // Crear una instancia de clienteDAO
        clienteDAO dao = new clienteDAO();

        // Buscar el cliente por ID
        Cliente cliente = dao.buscarClientePorId(idCliente);

        if (cliente != null) {
            // Pedir nuevos datos al usuario
            String nuevoNombre = JOptionPane.showInputDialog("Ingresa el nuevo nombre:", cliente.getNombre());
            String nuevaDireccion = JOptionPane.showInputDialog("Ingresa la nueva dirección:", cliente.getDireccion());
            String nuevoTelefonoStr = JOptionPane.showInputDialog("Ingresa el nuevo número de teléfono:", String.valueOf(cliente.getnTelefono()));
            int nuevoTelefono = Integer.parseInt(nuevoTelefonoStr);
            String nuevoCorreo = JOptionPane.showInputDialog("Ingresa el nuevo correo:", cliente.getCorreo());
            String nuevoUsuario = JOptionPane.showInputDialog("Ingresa el nuevo usuario:", cliente.getUser());
            String nuevaContrasena = JOptionPane.showInputDialog("Ingresa la nueva contraseña:", cliente.getContrasena());
            boolean esAdmini = cliente.isEsAdmini(); // Suponiendo que el rol de administrador no se cambia

            // Actualizar los datos del cliente
            cliente.setNombre(nuevoNombre);
            cliente.setDireccion(nuevaDireccion);
            cliente.setnTelefono(nuevoTelefono);
            cliente.setCorreo(nuevoCorreo);
            cliente.setUser(nuevoUsuario);
            cliente.setContrasena(nuevaContrasena);

            // Intentar modificar el cliente en la base de datos
            boolean exito = dao.modificar(cliente);

            // Proporcionar retroalimentación al usuario
            if (exito) {
                JOptionPane.showMessageDialog(this, "Cliente modificado exitosamente");
                consultarconductores();
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar el cliente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        MenuPrincipal frame = new MenuPrincipal();
        frame.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(conductores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new conductores().setVisible(true);
            }
        });
    }

    void consultarconductores() {
        clienteDAO cDAO = new clienteDAO();

        // Obtener la lista de todos los distritos
        List<Cliente> listachof = cDAO.obtenerTodosLosClientes();

        // Limpia las filas existentes en la tabla
        DefaultTableModel modelodistrictrepre = (DefaultTableModel) tablaconductores.getModel();
        while (modelodistrictrepre.getRowCount() > 0) {
            modelodistrictrepre.removeRow(0);
        }

        // Iterar sobre la lista de distritos y agregarlos a la tabla
        for (Cliente client : listachof) {
            Object[] filaDistrito = new Object[]{
                client.getIdCliente(),
                client.getUser(),
                client.getNombre(),
                client.getnTelefono(),
                client.getCorreo()

            };
            modelodistrictrepre.addRow(filaDistrito);
        }

        tablaconductores.setModel(modelodistrictrepre);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaconductores;
    // End of variables declaration//GEN-END:variables
}
