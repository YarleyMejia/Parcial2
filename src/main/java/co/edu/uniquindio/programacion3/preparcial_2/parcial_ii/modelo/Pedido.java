package co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo;



import java.io.Serializable;
import java.util.List;

public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    private String fecha;
    private String total;
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(){

    }

    public Pedido(String fecha, String total, Cliente cliente, List<Producto> productos) {
        this.fecha = fecha;
        this.total = total;
        this.cliente = cliente;
        this.productos = productos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
