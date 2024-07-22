/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author eduardo
 */

import Objetos.Cliente;
import java.util.List;

public interface ClienteDAOInterface {
    boolean insertar(Cliente cliente);
    List<Cliente> obtenerTodosLosClientes();
    boolean modificar(Cliente cliente);
    boolean eliminar(String idCliente);
    Cliente buscarClientePorId(String username);
    Cliente autenticar(String username, String contrasena);
}