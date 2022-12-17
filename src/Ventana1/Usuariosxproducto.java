package Ventana1;

public class Usuariosxproducto {
private String idUsuario;
private String idProducto;
private String fecha;
private int cantidadPrestada;

    public Usuariosxproducto() {
    }

    public Usuariosxproducto(String idUsuario, String idProducto, String fecha, int cantidadPrestada) {
        this.idUsuario = idUsuario;
        this.idProducto = idProducto;
        this.fecha = fecha;
        this.cantidadPrestada = cantidadPrestada;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidadPrestada() {
        return cantidadPrestada;
    }

    public void setCantidadPrestada(int cantidadPrestada) {
        this.cantidadPrestada = cantidadPrestada;
    }

    @Override
    public String toString() {
        return "Usuariosxproducto{" + "idUsuario=" + idUsuario + ", idProducto=" + idProducto + ", fecha=" + fecha + ", cantidadPrestada=" + cantidadPrestada + '}';
    }

}
