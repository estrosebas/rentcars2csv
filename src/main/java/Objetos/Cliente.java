/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author eduardo
 */
public class Cliente extends Usuario {

    private int idCliente;
    private String nombre;
    private String direccion;
    private int nTelefono;
    private String correo;
    private boolean esAdmini;

    public Cliente(int idCliente, String nombre, String direccion, int nTelefono, String correo, String user, String contrasena, boolean esAdmini) {
        super(user, contrasena, esAdmini);
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nTelefono = nTelefono;
        this.correo = correo;
        this.esAdmini = esAdmini;
    }

    // Otros constructores...

    public boolean isEsAdmini() {
        return esAdmini;
    }

    public void setEsAdmini(boolean esAdmini) {
        this.esAdmini = esAdmini;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getnTelefono() {
        return nTelefono;
    }

    public void setnTelefono(int nTelefono) {
        this.nTelefono = nTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String toCSV() {
        return idCliente + "," + nombre + "," + direccion + "," + nTelefono + "," + correo + "," + getUser() + "," + getContrasena() + "," + esAdmini;
    }

    public static Cliente fromCSV(String csv) {
        String[] parts = csv.split(",");
        return new Cliente(
                Integer.parseInt(parts[0]),
                parts[1],
                parts[2],
                Integer.parseInt(parts[3]),
                parts[4],
                parts[5],
                parts[6],
                Boolean.parseBoolean(parts[7])
        );
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", direccion=" + direccion + ", nTelefono=" + nTelefono + ", correo=" + correo + ", esAdmini=" + esAdmini + '}';
    }
}