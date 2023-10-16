package co.edu.uniquindio.programacion3.preparcial_2.parcial_ii.modelo;

public class Cliente {

    private String codigo;
    private String cedula;
    private String tipoIdentificacion;
    private String nombre;
    private String apellidos;
    private String telefono;

    public Cliente(){

    }

    public Cliente(String codigo, String cedula, String tipoIdentificacion, String nombre, String apellidos, String telefono) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.tipoIdentificacion = tipoIdentificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return codigo + "@" + cedula + "@" + tipoIdentificacion
                + "@" + nombre  + "@" + apellidos  + "@" + telefono;
    }
}

