/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.sql.Date;

/**
 *
 * @author eduardo
 */
public class Facturas {
    private int id_factura;
    private int id_reserva;
    private Date fecha_emision;
    private Double total;
    private String metodo_pago;

    public Facturas(int id_factura, int id_reserva, Date fecha_emision, Double total, String metodo_pago) {
        this.id_factura = id_factura;
        this.id_reserva = id_reserva;
        this.fecha_emision = fecha_emision;
        this.total = total;
        this.metodo_pago = metodo_pago;
    }

    public Facturas(int id_reserva, Date fecha_emision, Double total, String metodo_pago) {
        this.id_reserva = id_reserva;
        this.fecha_emision = fecha_emision;
        this.total = total;
        this.metodo_pago = metodo_pago;
    }

    public Facturas(int id_reserva, Double total, String metodo_pago) {
        this.id_reserva = id_reserva;
        this.total = total;
        this.metodo_pago = metodo_pago;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    
    
}
