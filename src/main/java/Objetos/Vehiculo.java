/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author eduardo
 */
public class Vehiculo {
    private int idVehiculo;
    private String marca;
    private String modelo;
    private String año;
    private String matricula;
    private String especial;

    public Vehiculo(int idVehiculo, String marca, String modelo, String año, String matricula, String especial) {
        this.idVehiculo = idVehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.matricula = matricula;
        this.especial = especial;
    }

    public Vehiculo(String marca, String modelo, String año, String matricula, String especial) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.matricula = matricula;
        this.especial = especial;
    }

    

    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public Vehiculo(String marca, String modelo, String matricula, String especial) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.especial = especial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAño() {
        return año;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }
    
}
