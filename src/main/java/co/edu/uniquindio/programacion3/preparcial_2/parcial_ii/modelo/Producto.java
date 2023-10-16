package co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo;

import java.io.Serializable;

public class Producto implements Serializable {

    private String codigo;
    private String nombre;
    private String precio;

    public Producto(){

    }

    public Producto(String codigo, String nombre, String precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return codigo + "#" + nombre + "#" + precio;
    }
}
