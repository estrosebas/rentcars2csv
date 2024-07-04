/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author eduardo
 */
public class Usuario {
    private int idusuario;
    String user;
    String contrasena;
    boolean esAdmini;

    public Usuario(String user, String contrasena, boolean esAdmini) {
        this.user = user;
        this.contrasena = contrasena;
        this.esAdmini = esAdmini;
    }

    public Usuario(int idusuario, String user, String contrasena, boolean esAdmini) {
        this.idusuario = idusuario;
        this.user = user;
        this.contrasena = contrasena;
        this.esAdmini = esAdmini;
    }

    public Usuario() {
    }
    

    public String getUser() {
        return user;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public void setUser(String user) {
        this.user = user;
    }

    

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEsAdmini() {
        return esAdmini;
    }

    public void setEsAdmini(boolean esAdmini) {
        this.esAdmini = esAdmini;
    }
    
    
}
