/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author eduardo
 */
import Objetos.Vehiculo;
import java.util.List;

public interface VehiculoDAOInterface {

    boolean insertar(Vehiculo vehiculo);

    List<Vehiculo> obtenerTodosLosVehiculos();

    boolean modificar(Vehiculo vehiculo);

    boolean eliminar(String matricula);

    Vehiculo buscarVehiculoPorId(String matricula);
}
