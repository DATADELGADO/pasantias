package Ventana1;

public class Producto {

    private String idProducto;
    private String nombre;
    private String marca;
    private String especificacion;
    private int cantidad;

    public Producto() {
    }

    public Producto(String idProducto, String nombre, String marca, String especificacion, int cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.especificacion = especificacion;
        this.cantidad = cantidad;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", marca=" + marca + ", especificacion=" + especificacion + ", cantidad=" + cantidad + '}';
    }
    
}
