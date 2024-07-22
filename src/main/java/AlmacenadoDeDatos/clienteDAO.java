/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AlmacenadoDeDatos;

/**
 *
 * @author eduardo
 */
import Objetos.Cliente;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class clienteDAO implements ClienteDAOInterface {

    private static final String FILE_NAME = "clientes.txt";

    @Override
    public boolean insertar(Cliente cliente) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            bw.write(cliente.toCSV());
            bw.newLine();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Cliente> obtenerTodosLosClientes() {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                Cliente cliente = Cliente.fromCSV(line);
                clientes.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    @Override
    public boolean modificar(Cliente cliente) {
        List<Cliente> clientes = obtenerTodosLosClientes();
        boolean encontrado = false;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Cliente c : clientes) {
                if (c.getIdCliente() == cliente.getIdCliente()) {
                    bw.write(cliente.toCSV());
                    encontrado = true;
                } else {
                    bw.write(c.toCSV());
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return encontrado;
    }

    @Override
    public boolean eliminar(String username) {
        List<Cliente> clientes = obtenerTodosLosClientes();
        boolean encontrado = clientes.removeIf(c -> c.getUser().equals(username));

        if (encontrado) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
                for (Cliente c : clientes) {
                    bw.write(c.toCSV());
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
    public Cliente buscarClientePorId(String username) {
        List<Cliente> clientes = obtenerTodosLosClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getUser().equals(username)) {
                return cliente;
            }
        }

        return null;
    }

    @Override
    public Cliente autenticar(String username, String contrasena) {
        List<Cliente> clientes = obtenerTodosLosClientes();

        for (Cliente cliente : clientes) {
            if (cliente.getUser().equals(username) && cliente.getContrasena().equals(contrasena)) {
                return cliente;
            }
        }

        return null;
    }
}