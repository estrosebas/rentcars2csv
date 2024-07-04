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
import AlmacenadoDeDatos.reservaDAO;
import AlmacenadoDeDatos.vehiculoDAO;
import Objetos.Cliente;
import Objetos.Reserva;
import Objetos.Vehiculo;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import javax.swing.ImageIcon;

public class reserva extends javax.swing.JFrame {

    /**
     * Creates new form conductores
     */
    public reserva() {
        initComponents();
        consultarReservas();
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
        tablaReservas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Reserva");

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "marca", "modelo", "año", "matricula", "especial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaReservas);
        if (tablaReservas.getColumnModel().getColumnCount() > 0) {
            tablaReservas.getColumnModel().getColumn(0).setResizable(false);
            tablaReservas.getColumnModel().getColumn(1).setResizable(false);
            tablaReservas.getColumnModel().getColumn(2).setResizable(false);
            tablaReservas.getColumnModel().getColumn(3).setResizable(false);
            tablaReservas.getColumnModel().getColumn(4).setResizable(false);
            tablaReservas.getColumnModel().getColumn(5).setResizable(false);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
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

        try {
            // Solicitar datos de la reserva al usuario
            String idVehiculoStr = JOptionPane.showInputDialog("Ingresa el ID del vehículo:");
            int idVehiculo = Integer.parseInt(idVehiculoStr);

            String fechaRecojidaStr = JOptionPane.showInputDialog("Ingresa la fecha de recogida (YYYY-MM-DD):");
            Date fechaRecojida = Date.valueOf(fechaRecojidaStr);

            String fechaEntregaStr = JOptionPane.showInputDialog("Ingresa la fecha de entrega (YYYY-MM-DD):");
            Date fechaEntrega = Date.valueOf(fechaEntregaStr);

            String tarifaStr = JOptionPane.showInputDialog("Ingresa la tarifa:");
            double tarifa = Double.parseDouble(tarifaStr);

            String[] estadosReserva = {"confirmada", "pendiente", "cancelada"};
            String estadoReserva = (String) JOptionPane.showInputDialog(null,
                    "Selecciona el estado de la reserva:",
                    "Estado de Reserva",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    estadosReserva,
                    estadosReserva[0]);

            String entregaVehiculo = JOptionPane.showInputDialog("Ingresa el lugar de entrega del vehículo:");
            String recogidaVehiculo = JOptionPane.showInputDialog("Ingresa el lugar de recogida del vehículo:");

            int seguroOption = JOptionPane.showConfirmDialog(null,
                    "¿La reserva incluye seguro?",
                    "Seguro",
                    JOptionPane.YES_NO_OPTION);
            boolean seguro = (seguroOption == JOptionPane.YES_OPTION);

            String tiempoReservaStr = JOptionPane.showInputDialog("Ingresa el tiempo de la reserva (en días):");
            int tiempoReserva = Integer.parseInt(tiempoReservaStr);

            int asistenciaOption = JOptionPane.showConfirmDialog(null,
                    "¿La reserva incluye asistencia?",
                    "Asistencia",
                    JOptionPane.YES_NO_OPTION);
            boolean asistencia = (asistenciaOption == JOptionPane.YES_OPTION);

            // Crear una instancia de Reserva con los datos proporcionados
            Reserva nuevaReserva = new Reserva(0, idVehiculo, fechaRecojida, fechaEntrega, tarifa, estadoReserva, entregaVehiculo, recogidaVehiculo, seguro, tiempoReserva, asistencia);

            // Crear una instancia de reservaDAO
            reservaDAO rDAO = new reservaDAO();

            // Intentar insertar la nueva reserva en la base de datos
            boolean exito = rDAO.insertar(nuevaReserva);

            // Proporcionar retroalimentación al usuario
            if (exito) {
                JOptionPane.showMessageDialog(this, "Reserva creada exitosamente");
                consultarReservas(); // Método para actualizar la tabla de reservas después de la inserción
            } else {
                JOptionPane.showMessageDialog(this, "Error al crear la reserva");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String idReservaStr = JOptionPane.showInputDialog("Ingresa el ID del vehículo a eliminar:");
        int idReserva = Integer.parseInt(idReservaStr);
        // Aquí deberías solicitar al usuario el ID de la reserva que desea eliminar utilizando JOptionPane
        // Crear una instancia de reservaDAO
        reservaDAO rDAO = new reservaDAO();

        // Intentar eliminar la reserva de la base de datos
        boolean exito = rDAO.eliminar(idReserva);

        // Proporcionar retroalimentación al usuario
        if (exito) {
            JOptionPane.showMessageDialog(this, "Reserva eliminada exitosamente");
            consultarReservas(); // Método para actualizar la tabla de reservas después de la eliminación
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar la reserva");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // Solicitar el ID de la reserva a modificar
            String idReservaStr = JOptionPane.showInputDialog("Ingresa el ID de la reserva a modificar:");
            int idReserva = Integer.parseInt(idReservaStr);

            // Crear una instancia de reservaDAO
            reservaDAO rDAO = new reservaDAO();

            // Buscar la reserva por ID
            Reserva reserva = rDAO.buscarReservaPorId(idReserva);

            if (reserva != null) {
                // Pedir nuevos datos al usuario, mostrando los datos actuales como sugerencia
                String nuevoIdVehiculoStr = JOptionPane.showInputDialog("Ingresa el nuevo ID del vehículo:", reserva.getIdVehiculo());
                int nuevoIdVehiculo = Integer.parseInt(nuevoIdVehiculoStr);

                String nuevaFechaRecojidaStr = JOptionPane.showInputDialog("Ingresa la nueva fecha de recogida (YYYY-MM-DD):", reserva.getFechaRecojida().toString());
                Date nuevaFechaRecojida = Date.valueOf(nuevaFechaRecojidaStr);

                String nuevaFechaEntregaStr = JOptionPane.showInputDialog("Ingresa la nueva fecha de entrega (YYYY-MM-DD):", reserva.getFechaEntrega().toString());
                Date nuevaFechaEntrega = Date.valueOf(nuevaFechaEntregaStr);

                String nuevaTarifaStr = JOptionPane.showInputDialog("Ingresa la nueva tarifa:", String.valueOf(reserva.getTarifa()));
                double nuevaTarifa = Double.parseDouble(nuevaTarifaStr);

                String[] estadosReserva = {"confirmada", "pendiente", "cancelada"};
                String nuevoEstadoReserva = (String) JOptionPane.showInputDialog(null,
                        "Selecciona el nuevo estado de la reserva:",
                        "Estado de Reserva",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        estadosReserva,
                        reserva.getEstadoReserva());

                String nuevaEntregaVehiculo = JOptionPane.showInputDialog("Ingresa el nuevo lugar de entrega del vehículo:", reserva.getEntregaVehiculo());
                String nuevaRecogidaVehiculo = JOptionPane.showInputDialog("Ingresa el nuevo lugar de recogida del vehículo:", reserva.getRecogidaVehiculo());

                int nuevoSeguroOption = JOptionPane.showConfirmDialog(null,
                        "¿La reserva incluye seguro?",
                        "Seguro",
                        JOptionPane.YES_NO_OPTION);
                boolean nuevoSeguro = (nuevoSeguroOption == JOptionPane.YES_OPTION);

                String nuevoTiempoReservaStr = JOptionPane.showInputDialog("Ingresa el nuevo tiempo de la reserva (en días):", String.valueOf(reserva.getTiempoReserva()));
                int nuevoTiempoReserva = Integer.parseInt(nuevoTiempoReservaStr);

                int nuevaAsistenciaOption = JOptionPane.showConfirmDialog(null,
                        "¿La reserva incluye asistencia?",
                        "Asistencia",
                        JOptionPane.YES_NO_OPTION);
                boolean nuevaAsistencia = (nuevaAsistenciaOption == JOptionPane.YES_OPTION);

                // Actualizar los datos de la reserva
                reserva.setIdVehiculo(nuevoIdVehiculo);
                reserva.setFechaRecojida(nuevaFechaRecojida);
                reserva.setFechaEntrega(nuevaFechaEntrega);
                reserva.setTarifa(nuevaTarifa);
                reserva.setEstadoReserva(nuevoEstadoReserva);
                reserva.setEntregaVehiculo(nuevaEntregaVehiculo);
                reserva.setRecogidaVehiculo(nuevaRecogidaVehiculo);
                reserva.setSeguro(nuevoSeguro);
                reserva.setTiempoReserva(nuevoTiempoReserva);
                reserva.setAsistencia(nuevaAsistencia);

                // Intentar modificar la reserva en la base de datos
                boolean exito = rDAO.modificar(reserva);

                // Proporcionar retroalimentación al usuario
                if (exito) {
                    JOptionPane.showMessageDialog(this, "Reserva modificada exitosamente");
                    consultarReservas(); // Método para actualizar la tabla de reservas después de la modificación
                } else {
                    JOptionPane.showMessageDialog(this, "Error al modificar la reserva");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Reserva no encontrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos: " + e.getMessage());
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
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reserva().setVisible(true);
            }
        });
    }

    void consultarReservas() {
        reservaDAO rDAO = new reservaDAO();

        // Obtener la lista de todas las reservas
        List<Reserva> reservas = rDAO.obtenerTodasLasReservas();

        // Limpia las filas existentes en la tabla
        DefaultTableModel modeloReservas = (DefaultTableModel) tablaReservas.getModel();
        while (modeloReservas.getRowCount() > 0) {
            modeloReservas.removeRow(0);
        }

        // Iterar sobre la lista de reservas y agregarlas a la tabla
        for (Reserva reserva : reservas) {
            Object[] filaReserva = new Object[]{
                reserva.getIdReserva(),
                reserva.getIdVehiculo(),
                reserva.getFechaRecojida(),
                reserva.getFechaEntrega(),
                reserva.getTarifa(),
                reserva.getEstadoReserva(),
                reserva.getEntregaVehiculo(),
                reserva.getRecogidaVehiculo(),
                reserva.getSeguro(),
                reserva.getTiempoReserva(),
                reserva.getAsistencia()
            };
            modeloReservas.addRow(filaReserva);
        }

        tablaReservas.setModel(modeloReservas);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaReservas;
    // End of variables declaration//GEN-END:variables
}
