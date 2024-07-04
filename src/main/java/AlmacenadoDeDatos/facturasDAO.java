/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author eduardo
 */
import Objetos.Facturas;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class facturasDAO implements FacturasDAOInterface {
    private final String archivoFacturas = "facturas.txt";

    @Override
    public boolean insertar(Facturas factura) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoFacturas, true))) {
            bw.write(facturaToString(factura));
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean modificar(Facturas factura) {
        List<Facturas> facturas = obtenerTodasLasFacturas();
        boolean encontrado = false;

        for (int i = 0; i < facturas.size(); i++) {
            if (facturas.get(i).getId_factura() == factura.getId_factura()) {
                facturas.set(i, factura);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoFacturas))) {
                for (Facturas f : facturas) {
                    bw.write(facturaToString(f));
                    bw.newLine();
                }
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean eliminar(int idFactura) {
        List<Facturas> facturas = obtenerTodasLasFacturas();
        boolean encontrado = facturas.removeIf(f -> f.getId_factura() == idFactura);

        if (encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoFacturas))) {
                for (Facturas f : facturas) {
                    bw.write(facturaToString(f));
                    bw.newLine();
                }
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }

    @Override
    public Facturas buscarFacturaPorId(int idFactura) {
        List<Facturas> facturas = obtenerTodasLasFacturas();

        for (Facturas factura : facturas) {
            if (factura.getId_factura() == idFactura) {
                return factura;
            }
        }

        return null;
    }

    @Override
    public List<Facturas> obtenerTodasLasFacturas() {
        List<Facturas> facturas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoFacturas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                facturas.add(stringToFactura(linea));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return facturas;
    }

    private String facturaToString(Facturas factura) {
        return factura.getId_factura() + "," +
               factura.getId_reserva() + "," +
               factura.getFecha_emision().toString() + "," +
               factura.getTotal() + "," +
               factura.getMetodo_pago();
    }

    private Facturas stringToFactura(String linea) {
        String[] partes = linea.split(",");
        return new Facturas(
                Integer.parseInt(partes[0]),
                Integer.parseInt(partes[1]),
                Date.valueOf(partes[2]),
                Double.parseDouble(partes[3]),
                partes[4]
        );
    }
}