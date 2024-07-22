/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author Sebas
 */
public class ClienteDAOFactoryImpl implements ClienteDAOFactory {
    @Override
    public ClienteDAOInterface createClienteDAO() {
        return new clienteDAO();
    }
}
