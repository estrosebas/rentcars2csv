/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author Sebas
 */
public class VehiculoDAOFactoryImpl implements VehiculoDAOFactory {
    @Override
    public VehiculoDAOInterface createVehiculoDAO() {
        return new vehiculoDAO();
    }
}
