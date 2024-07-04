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
public class remision {
    private int id_guia;
    private int numero_guia;
    private Date fecha_emision;
    private int id_vehiculo;
    private int id_cliente;
    private String estado;

    public remision(int id_guia, int numero_guia, Date fecha_emision, int id_vehiculo, int id_cliente, String estado) {
        this.id_guia = id_guia;
        this.numero_guia = numero_guia;
        this.fecha_emision = fecha_emision;
        this.id_vehiculo = id_vehiculo;
        this.id_cliente = id_cliente;
        this.estado = estado;
    }

    public remision(int numero_guia, Date fecha_emision, int id_vehiculo, int id_cliente, String estado) {
        this.numero_guia = numero_guia;
        this.fecha_emision = fecha_emision;
        this.id_vehiculo = id_vehiculo;
        this.id_cliente = id_cliente;
        this.estado = estado;
    }

    public int getId_guia() {
        return id_guia;
    }

    public void setId_guia(int id_guia) {
        this.id_guia = id_guia;
    }

    public int getNumero_guia() {
        return numero_guia;
    }

    public void setNumero_guia(int numero_guia) {
        this.numero_guia = numero_guia;
    }

    public Date getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(Date fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public int getId_vehiculo() {
        return id_vehiculo;
    }

    public void setId_vehiculo(int id_vehiculo) {
        this.id_vehiculo = id_vehiculo;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
