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
import AlmacenadoDeDatos.facturasDAO;
import AlmacenadoDeDatos.vehiculoDAO;
import Objetos.Cliente;
import Objetos.Facturas;
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

public class facturas extends javax.swing.JFrame {

    /**
     * Creates new form conductores
     */
    public facturas() {
        initComponents();
        consultarFacturas();
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
        tablaFacturas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Facturas");

        tablaFacturas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id_factura", "id_reserva", "fecha emision", "total", "Metodo Pago"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaFacturas);
        if (tablaFacturas.getColumnModel().getColumnCount() > 0) {
            tablaFacturas.getColumnModel().getColumn(0).setResizable(false);
            tablaFacturas.getColumnModel().getColumn(1).setResizable(false);
            tablaFacturas.getColumnModel().getColumn(2).setResizable(false);
            tablaFacturas.getColumnModel().getColumn(3).setResizable(false);
            tablaFacturas.getColumnModel().getColumn(4).setResizable(false);
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

        try {
            // Solicitar el ID de la reserva asociada
            String idReservaStr = JOptionPane.showInputDialog("Ingresa el ID de la reserva:");
            int idReserva = Integer.parseInt(idReservaStr);

            // Solicitar la fecha de emisión de la factura
            String fechaEmisionStr = JOptionPane.showInputDialog("Ingresa la fecha de emisión (YYYY-MM-DD):");
            Date fechaEmision = Date.valueOf(fechaEmisionStr);

            // Solicitar el total de la factura
            String totalStr = JOptionPane.showInputDialog("Ingresa el total de la factura:");
            double total = Double.parseDouble(totalStr);

            // Crear un array de opciones para el método de pago
            String[] opcionesPago = {"Crédito", "Efectivo", "Débito"};

            // Mostrar un JOptionPane con botones para seleccionar el método de pago
            int metodoPagoSeleccionado = JOptionPane.showOptionDialog(null, "Selecciona el método de pago:", "Método de Pago", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPago, opcionesPago[0]);

            // Verificar la opción seleccionada y asignar el método de pago correspondiente
            String metodoPago;
            switch (metodoPagoSeleccionado) {
                case 0:
                    metodoPago = "Crédito";
                    break;
                case 1:
                    metodoPago = "Efectivo";
                    break;
                case 2:
                    metodoPago = "Débito";
                    break;
                default:
                    metodoPago = "Desconocido";
                    break;
            }

            // Crear una instancia de Facturas
            Facturas nuevaFactura = new Facturas(idReserva, fechaEmision, total, metodoPago);

            // Crear una instancia de facturasDAO
            facturasDAO dao = new facturasDAO();

            // Intentar insertar la nueva factura en la base de datos
            boolean exito = dao.insertar(nuevaFactura);

            // Proporcionar retroalimentación al usuario
            if (exito) {
                JOptionPane.showMessageDialog(this, "Factura registrada exitosamente");
                consultarFacturas(); // Método para actualizar la tabla de facturas después de la inserción
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar la factura");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // Solicitar el ID de la factura a modificar
            String idFacturaStr = JOptionPane.showInputDialog("Ingresa el ID de la factura a modificar:");
            int idFactura = Integer.parseInt(idFacturaStr);

            // Crear una instancia de facturasDAO
            facturasDAO dao = new facturasDAO();

            // Buscar la factura por ID
            Facturas factura = dao.buscarFacturaPorId(idFactura);

            if (factura != null) {
                // Pedir nuevos datos al usuario, mostrando los datos actuales como sugerencia
                String nuevoIdReservaStr = JOptionPane.showInputDialog("Ingresa el nuevo ID de la reserva:", factura.getId_reserva());
                int nuevoIdReserva = Integer.parseInt(nuevoIdReservaStr);

                String nuevaFechaEmisionStr = JOptionPane.showInputDialog("Ingresa la nueva fecha de emisión (YYYY-MM-DD):", factura.getFecha_emision().toString());
                Date nuevaFechaEmision = Date.valueOf(nuevaFechaEmisionStr);

                String nuevoTotalStr = JOptionPane.showInputDialog("Ingresa el nuevo total:", String.valueOf(factura.getTotal()));
                double nuevoTotal = Double.parseDouble(nuevoTotalStr);

                // Crear un array de opciones para el método de pago
                String[] opcionesPago = {"Crédito", "Efectivo", "Débito"};

                // Mostrar un JOptionPane con botones para seleccionar el nuevo método de pago
                int metodoPagoSeleccionado = JOptionPane.showOptionDialog(null, "Selecciona el nuevo método de pago:", "Nuevo Método de Pago", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPago, opcionesPago[0]);

                // Verificar la opción seleccionada y asignar el nuevo método de pago correspondiente
                String nuevoMetodoPago;
                switch (metodoPagoSeleccionado) {
                    case 0:
                        nuevoMetodoPago = "Crédito";
                        break;
                    case 1:
                        nuevoMetodoPago = "Efectivo";
                        break;
                    case 2:
                        nuevoMetodoPago = "Débito";
                        break;
                    default:
                        nuevoMetodoPago = "Desconocido";
                        break;
                }

                // Actualizar los datos de la factura
                factura.setId_reserva(nuevoIdReserva);
                factura.setFecha_emision(nuevaFechaEmision);
                factura.setTotal(nuevoTotal);
                factura.setMetodo_pago(nuevoMetodoPago);

                // Intentar modificar la factura en la base de datos
                boolean exito = dao.modificar(factura);

                // Proporcionar retroalimentación al usuario
                if (exito) {
                    JOptionPane.showMessageDialog(this, "Factura modificada exitosamente");
                    consultarFacturas(); // Método para actualizar la tabla de facturas después de la modificación
                } else {
                    JOptionPane.showMessageDialog(this, "Error al modificar la factura");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Factura no encontrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al ingresar los datos: " + e.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // Solicitar el ID de la factura a modificar
            String idFacturaStr = JOptionPane.showInputDialog("Ingresa el ID de la factura a modificar:");
            int idFactura = Integer.parseInt(idFacturaStr);

            // Crear una instancia de facturasDAO
            facturasDAO dao = new facturasDAO();

            // Buscar la factura por ID
            Facturas factura = dao.buscarFacturaPorId(idFactura);

            if (factura != null) {
                // Pedir nuevos datos al usuario, mostrando los datos actuales como sugerencia
                String nuevoIdReservaStr = JOptionPane.showInputDialog("Ingresa el nuevo ID de la reserva:", factura.getId_reserva());
                int nuevoIdReserva = Integer.parseInt(nuevoIdReservaStr);

                String nuevaFechaEmisionStr = JOptionPane.showInputDialog("Ingresa la nueva fecha de emisión (YYYY-MM-DD):", factura.getFecha_emision().toString());
                Date nuevaFechaEmision = Date.valueOf(nuevaFechaEmisionStr);

                String nuevoTotalStr = JOptionPane.showInputDialog("Ingresa el nuevo total:", String.valueOf(factura.getTotal()));
                double nuevoTotal = Double.parseDouble(nuevoTotalStr);

                // Crear un array de opciones para el método de pago
                String[] opcionesPago = {"Crédito", "Efectivo", "Débito"};

                // Mostrar un JOptionPane con botones para seleccionar el nuevo método de pago
                int metodoPagoSeleccionado = JOptionPane.showOptionDialog(null, "Selecciona el nuevo método de pago:", "Nuevo Método de Pago", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcionesPago, opcionesPago[0]);

                // Verificar la opción seleccionada y asignar el nuevo método de pago correspondiente
                String nuevoMetodoPago;
                switch (metodoPagoSeleccionado) {
                    case 0:
                        nuevoMetodoPago = "Crédito";
                        break;
                    case 1:
                        nuevoMetodoPago = "Efectivo";
                        break;
                    case 2:
                        nuevoMetodoPago = "Débito";
                        break;
                    default:
                        nuevoMetodoPago = "Desconocido";
                        break;
                }

                // Actualizar los datos de la factura
                factura.setId_reserva(nuevoIdReserva);
                factura.setFecha_emision(nuevaFechaEmision);
                factura.setTotal(nuevoTotal);
                factura.setMetodo_pago(nuevoMetodoPago);

                // Intentar modificar la factura en la base de datos
                boolean exito = dao.modificar(factura);

                // Proporcionar retroalimentación al usuario
                if (exito) {
                    JOptionPane.showMessageDialog(this, "Factura modificada exitosamente");
                    consultarFacturas(); // Método para actualizar la tabla de facturas después de la modificación
                } else {
                    JOptionPane.showMessageDialog(this, "Error al modificar la factura");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Factura no encontrada");
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
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new facturas().setVisible(true);
            }
        });
    }

    void consultarFacturas() {
        facturasDAO fDAO = new facturasDAO();

        // Obtener la lista de todas las facturas
        List<Facturas> listaFacturas = fDAO.obtenerTodasLasFacturas();

        // Limpia las filas existentes en la tabla
        DefaultTableModel modeloFacturas = (DefaultTableModel) tablaFacturas.getModel();
        while (modeloFacturas.getRowCount() > 0) {
            modeloFacturas.removeRow(0);
        }

        // Iterar sobre la lista de facturas y agregarlas a la tabla
        for (Facturas factura : listaFacturas) {
            Object[] filaFactura = new Object[]{
                factura.getId_factura(),
                factura.getId_reserva(),
                factura.getFecha_emision(),
                factura.getTotal(),
                factura.getMetodo_pago()
            };
            modeloFacturas.addRow(filaFactura);
        }

        tablaFacturas.setModel(modeloFacturas);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaFacturas;
    // End of variables declaration//GEN-END:variables
}
