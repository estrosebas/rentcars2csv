/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author eduardo
 */
import Objetos.Facturas;
import java.util.List;

public interface FacturasDAOInterface {
    boolean insertar(Facturas factura);
    boolean modificar(Facturas factura);
    boolean eliminar(int idFactura);
    Facturas buscarFacturaPorId(int idFactura);
    List<Facturas> obtenerTodasLasFacturas();
}