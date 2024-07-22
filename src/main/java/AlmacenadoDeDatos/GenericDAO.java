/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AlmacenadoDeDatos;

import java.util.List;

/**
 *
 * @author Sebas
 */
public interface GenericDAO<T, K> {
    boolean insertar(T obj);
    List<T> obtenerTodos();
    boolean modificar(T obj);
    boolean eliminar(K id);
    T buscarPorId(K id);
}
