package Ventana1;

public class Producto extends Usuario{

    private String idProducto;
    private String nombreProducto;
    private String marca;
    private String especificacion;
    private int cantidad;

    public Producto() {
    }

    public Producto(String idProducto, String nombreProducto, String marca, String especificacion, int cantidad) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.especificacion = especificacion;
        this.cantidad = cantidad;
    }

    public Producto(String idProducto, String nombreProducto, String marca, String especificacion, String idUsuario, String nombre, String apellidos, String dni) {
        super(idUsuario, nombre, apellidos, dni);
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.especificacion = especificacion;
    }
    

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
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
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", marca=" + marca + ", especificacion=" + especificacion + ", cantidad=" + cantidad + '}';
    }
    
}
