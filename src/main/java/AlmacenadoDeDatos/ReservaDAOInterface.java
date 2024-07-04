/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author eduardo
 */
import Objetos.Reserva;
import java.util.List;

public interface ReservaDAOInterface {
    boolean insertar(Reserva reserva);
    List<Reserva> obtenerTodasLasReservas();
    boolean modificar(Reserva reserva);
    boolean eliminar(int idReserva);
    Reserva buscarReservaPorId(int idReserva);
}
