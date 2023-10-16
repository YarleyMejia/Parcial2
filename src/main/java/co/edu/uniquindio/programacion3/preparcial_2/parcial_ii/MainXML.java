package co.edu.uniquindio.programacion3.preparcial_2.parcial_ii;

import co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo.Cliente;
import co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo.Pedido;
import co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo.Producto;

import java.beans.XMLEncoder;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class MainXML {

    public static final String RUTA_ARCHIVO__XML = "C:\\Users\\lenovo\\Desktop\\Estudio Programacion III\\Programacion 3\\Parcial II\\src\\main\\resources\\co\\edu\\uniquindio\\programacion3\\preparcial_2\\parcial_ii\\Archivos\\pedidos.xml";

    public static void main(String[] args) {

        ArrayList<Producto> productos= new ArrayList<>();

        productos.add(new Producto("546546", "Jabon", "45000"));
        productos.add(new Producto("5326", "bolso", "12000"));

        Pedido pedido = new Pedido("12-10-2023", "45000", new Cliente("5454", "6565", "CC", "JORGE2", "Mendez", "312332"), productos);

        guardarRecursoXML(pedido);
    }

    public static void salvarRecursoSerializadoXML(String rutaArchivo, Object objeto) throws IOException {

        XMLEncoder codificadorXML;

        codificadorXML = new XMLEncoder(new FileOutputStream(rutaArchivo));
        codificadorXML.writeObject(objeto);
        codificadorXML.close();

    }

    public static void guardarRecursoXML(Pedido pedido) {

        try {
            salvarRecursoSerializadoXML(RUTA_ARCHIVO__XML, pedido);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}