/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author eduardo
 */
import java.sql.Date;
public class Reserva {
    private int idReserva;
    private int idVehiculo;
    private Date fechaRecojida;
    private Date fechaEntrega;
    private Double tarifa;
    private String estadoReserva;
    private String entregaVehiculo;
    private String recogidaVehiculo;
    private Boolean seguro;
    private int tiempoReserva;
    private Boolean asistencia;

    public Reserva(int idReserva, int idVehiculo, Date fechaRecojida, Date fechaEntrega, Double tarifa, String estadoReserva, String entregaVehiculo, String recogidaVehiculo, Boolean seguro, int tiempoReserva, Boolean asistencia) {
        this.idReserva = idReserva;
        this.idVehiculo = idVehiculo;
        this.fechaRecojida = fechaRecojida;
        this.fechaEntrega = fechaEntrega;
        this.tarifa = tarifa;
        this.estadoReserva = estadoReserva;
        this.entregaVehiculo = entregaVehiculo;
        this.recogidaVehiculo = recogidaVehiculo;
        this.seguro = seguro;
        this.tiempoReserva = tiempoReserva;
        this.asistencia = asistencia;
    }

    
    
    
    
    
    public Reserva(int idReserva, Date fechaRecojida, Date fechaEntrega, Double tarifa, String estadoReserva) {
        this.idReserva = idReserva;
        this.fechaRecojida = fechaRecojida;
        this.fechaEntrega = fechaEntrega;
        this.tarifa = tarifa;
        this.estadoReserva = estadoReserva;
    }

    public Reserva(int idReserva, Double tarifa, String estadoReserva) {
        this.idReserva = idReserva;
        this.tarifa = tarifa;
        this.estadoReserva = estadoReserva;
    }

    public Boolean getSeguro() {
        return seguro;
    }

    public int getTiempoReserva() {
        return tiempoReserva;
    }

    public void setTiempoReserva(int tiempoReserva) {
        this.tiempoReserva = tiempoReserva;
    }

    public void setSeguro(Boolean seguro) {
        this.seguro = seguro;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public Boolean getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Reserva(int idReserva, Double tarifa) {
        this.idReserva = idReserva;
        this.tarifa = tarifa;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public String getEntregaVehiculo() {
        return entregaVehiculo;
    }

    public void setEntregaVehiculo(String entregaVehiculo) {
        this.entregaVehiculo = entregaVehiculo;
    }

    public String getRecogidaVehiculo() {
        return recogidaVehiculo;
    }

    public void setRecogidaVehiculo(String recogidaVehiculo) {
        this.recogidaVehiculo = recogidaVehiculo;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaRecojida() {
        return fechaRecojida;
    }

    public void setFechaRecojida(Date fechaRecojida) {
        this.fechaRecojida = fechaRecojida;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }
    
}
