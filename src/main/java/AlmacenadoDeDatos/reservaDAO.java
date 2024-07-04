/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmacenadoDeDatos;
/**
 *
 * @author eduardo
 */
import Objetos.Reserva;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class reservaDAO implements ReservaDAOInterface {
    private final String archivoReservas = "reservas.txt";

    @Override
    public boolean insertar(Reserva reserva) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoReservas, true))) {
            bw.write(reservaToString(reserva));
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Reserva> obtenerTodasLasReservas() {
        List<Reserva> reservas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoReservas))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                reservas.add(stringToReserva(linea));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return reservas;
    }

    @Override
    public boolean modificar(Reserva reserva) {
        List<Reserva> reservas = obtenerTodasLasReservas();
        boolean encontrado = false;

        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdReserva() == reserva.getIdReserva()) {
                reservas.set(i, reserva);
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoReservas))) {
                for (Reserva r : reservas) {
                    bw.write(reservaToString(r));
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
    public boolean eliminar(int idReserva) {
        List<Reserva> reservas = obtenerTodasLasReservas();
        boolean encontrado = reservas.removeIf(r -> r.getIdReserva() == idReserva);

        if (encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoReservas))) {
                for (Reserva r : reservas) {
                    bw.write(reservaToString(r));
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
    public Reserva buscarReservaPorId(int idReserva) {
        List<Reserva> reservas = obtenerTodasLasReservas();

        for (Reserva reserva : reservas) {
            if (reserva.getIdReserva() == idReserva) {
                return reserva;
            }
        }

        return null;
    }

    private String reservaToString(Reserva reserva) {
        return reserva.getIdReserva() + "," +
               reserva.getIdVehiculo() + "," +
               reserva.getFechaRecojida().toString() + "," +
               reserva.getFechaEntrega().toString() + "," +
               reserva.getTarifa() + "," +
               reserva.getEstadoReserva() + "," +
               reserva.getEntregaVehiculo() + "," +
               reserva.getRecogidaVehiculo() + "," +
               reserva.getSeguro() + "," +
               reserva.getTiempoReserva() + "," +
               reserva.getAsistencia();
    }

    private Reserva stringToReserva(String linea) {
        String[] partes = linea.split(",");
        return new Reserva(
                Integer.parseInt(partes[0]),
                Integer.parseInt(partes[1]),
                Date.valueOf(partes[2]),
                Date.valueOf(partes[3]),
                Double.parseDouble(partes[4]),
                partes[5],
                partes[6],
                partes[7],
                Boolean.parseBoolean(partes[8]),
                Integer.parseInt(partes[9]),
                Boolean.parseBoolean(partes[10])
        );
    }
}