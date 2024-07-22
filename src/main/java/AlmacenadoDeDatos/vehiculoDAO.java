/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author eduardo
 */
import Objetos.Vehiculo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class vehiculoDAO implements VehiculoDAOInterface {

    private final String archivoVehiculos = "vehiculos.txt";

    @Override
    public boolean insertar(Vehiculo vehiculo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoVehiculos, true))) {
            bw.write(vehiculoToString(vehiculo));
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Vehiculo> obtenerTodosLosVehiculos() {
        List<Vehiculo> vehiculos = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoVehiculos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                vehiculos.add(stringToVehiculo(linea));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return vehiculos;
    }

    @Override
    public boolean modificar(Vehiculo vehiculo) {
        List<Vehiculo> vehiculos = obtenerTodosLosVehiculos();
        boolean encontrado = false;

        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getIdVehiculo() == vehiculo.getIdVehiculo()) {
                vehiculos.set(i, vehiculo);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoVehiculos))) {
                for (Vehiculo v : vehiculos) {
                    bw.write(vehiculoToString(v));
                    bw.newLine();
                }
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }

    @Override
    public boolean eliminar(String matricula) {
        List<Vehiculo> vehiculos = obtenerTodosLosVehiculos();
        boolean encontrado = vehiculos.removeIf(v -> v.getMatricula().equals(matricula));

        if (encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoVehiculos))) {
                for (Vehiculo v : vehiculos) {
                    bw.write(vehiculoToString(v));
                    bw.newLine();
                }
                return true;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false;
    }

    @Override
    public Vehiculo buscarVehiculoPorId(String matricula) {
        List<Vehiculo> vehiculos = obtenerTodosLosVehiculos();

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getMatricula().equals(matricula)) {
                return vehiculo;
            }
        }

        return null;
    }

    private String vehiculoToString(Vehiculo vehiculo) {
        return vehiculo.getIdVehiculo() + ","
                + vehiculo.getMarca() + ","
                + vehiculo.getModelo() + ","
                + vehiculo.getAño() + ","
                + vehiculo.getMatricula() + ","
                + vehiculo.getEspecial();
    }

    private Vehiculo stringToVehiculo(String linea) {
        String[] partes = linea.split(",");
        return new Vehiculo(
                Integer.parseInt(partes[0]),
                partes[1],
                partes[2],
                partes[3],
                partes[4],
                partes[5]
        );
    }
}
