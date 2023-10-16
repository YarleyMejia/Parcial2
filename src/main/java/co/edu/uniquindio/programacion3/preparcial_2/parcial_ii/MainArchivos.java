package co.edu.uniquindio.programacion3.preparcial_2.parcial_ii;

import co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo.Cliente;
import co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo.Producto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class MainArchivos {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Producto> productos = new ArrayList<>();

        clientes.add(new Cliente("4521", "104924", "CC", "ORLAY", "MOLINA", "31245853"));
        clientes.add(new Cliente("552", "102335", "CC", "profe", "BEDOYA", "31245853"));

        productos.add(new Producto("546546", "Jabon", "45000"));
        productos.add(new Producto("5326", "shampoo", "12000"));
        guardarDatos(clientes);
        guardarDatosProductos(productos);
    }

    private static void guardarDatos(ArrayList<Cliente> clientes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\Desktop\\Estudio Programacion III\\Programacion 3\\Parcial II\\src\\main\\resources\\co\\edu\\uniquindio\\programacion3\\preparcial_2\\parcial_ii\\Archivos\\clientes.txt"))) {
            for (Cliente cliente : clientes) {
                bw.write(cliente.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void guardarDatosProductos(ArrayList<Producto> productos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\Desktop\\Estudio Programacion III\\Programacion 3\\Parcial II\\src\\main\\resources\\co\\edu\\uniquindio\\programacion3\\preparcial_2\\parcial_ii\\Archivos\\productos.txt"))) {
            for (Producto producto : productos) {
                bw.write(producto.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
