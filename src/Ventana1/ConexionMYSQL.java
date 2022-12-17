package Ventana1;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConexionMYSQL {

    private String baseDatos;
    private Connection conexion;

    public ConexionMYSQL() {
    }

    public ConexionMYSQL(String baseDatos) {
        setConexion(baseDatos);
    }

    public void setConexion(String baseDatos) {
        String url = "jdbc:mysql://localhost:3306/" + baseDatos;
        try {
            conexion = DriverManager.getConnection(url, "root", "25800307");
        } catch (Exception ex) {
            conexion = null;
        }
    }

    public Connection getConexion() {
        return conexion;
    }

}
