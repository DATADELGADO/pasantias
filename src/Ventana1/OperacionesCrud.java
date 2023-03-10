package Ventana1;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OperacionesCrud {

    public static boolean login(String[] usuario, Connection conexion) {
        boolean bandera = false;
        try {
            String query = "select * from login where idusuario = ? and password = ?;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, usuario[0]);
            ps.setString(2, usuario[1]);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                bandera = true;
            }
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean insertarLogin(String[] usuario, Connection conexion) {
        boolean bandera = false;
        String query = "INSERT INTO login(idusuario, password, correo, ciudad) values(?,?,?,?);";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, usuario[0]);
            ps.setString(2, usuario[1]);
            ps.setString(3, usuario[2]);
            ps.setString(4, usuario[3]);

            ps.execute();
            bandera = true;

        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    public static String retornaIdusuarioAutomatico(Connection conexion) {
        String usuarioAuto = "";
        try {
            String query = "SELECT IDUSUARIO FROM LOGIN\n"
                    + "ORDER BY IDUSUARIO DESC\n"
                    + "LIMIT 1;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idusuario = rs.getString(1);
                String numero = "";
                for (int i = 0; i < idusuario.length(); i++) {
                    if (i != 0) {
                        numero = numero + idusuario.charAt(i);
                    }
                }
                int n = Integer.parseInt(numero) + 1;
                usuarioAuto = "U" + n;
            }

        } catch (Exception e) {

        }
        return usuarioAuto;
    }

    public static String retornaIdproductoAutomatico(Connection conexion) {
        String id = "";
        try {
            String query = "SELECT IDPRODUCTO FROM PRODUCTO ORDER BY IDPRODUCTO DESC LIMIT 1";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String x = rs.getString(1);
                String a = "";
                for (int i = 0; i < x.length(); i++) {
                    if (i != 0) {
                        a = a + x.charAt(i);
                    }
                }
                int n = Integer.parseInt(a) + 1;
                id = x.charAt(0) + "" + n;
            }
        } catch (Exception e) {

        }
        return id;

    }

    public static boolean insertar(Usuario usuario, Connection conexion) {
        boolean bandera = false;
        String query = "INSERT INTO USUARIO(idUsuario,nombre,apellidos,dni) VALUES(?,?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, usuario.getIdUsuario());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellidos());
            ps.setString(4, usuario.getDni());
            ps.execute();
            bandera = true;

        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean insertarEquipo(Producto producto, Connection conexion) {
        boolean bandera = false;
        String query = "INSERT INTO PRODUCTO(idProducto,nombre,marca,especificacion,cantidad) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, producto.getIdProducto());
            ps.setString(2, producto.getNombreProducto());
            ps.setString(3, producto.getMarca());
            ps.setString(4, producto.getEspecificacion());
            ps.setInt(5, producto.getCantidad());
            ps.execute();
            bandera = true;

        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    public static List<Usuariosxproducto> mostrarPrestamos(Connection conexion) {
        List<Usuariosxproducto> prestamos_al = new ArrayList<Usuariosxproducto>();
        try {
            String query = "select u.idusuario, u.nombre, u.apellidos, u.dni, p.idproducto, p.nombre, p.marca, p.especificacion, x.fecha, x.cantidadPrestada\n"
                    + "from usuario u, producto p, usuarios_x_producto x\n"
                    + "where u.idusuario = x.idusuario and x.idproducto = p.idproducto and x.cantidadPrestada > 0;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                prestamos_al.add(new Usuariosxproducto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), Integer.parseInt(rs.getString(10))));
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(5));

            }

        } catch (Exception e) {
            prestamos_al = null;
        }
        return prestamos_al;
    }

    public static List<Usuariosxproducto> mostrarPrestamosBuscar(Connection conexion, String busqueda) {
        List<Usuariosxproducto> prestamos_al = new ArrayList<Usuariosxproducto>();
        try {
            String query = "select u.idusuario, u.nombre, u.apellidos, u.dni, p.idproducto, p.nombre, p.marca, p.especificacion, x.fecha, x.cantidadPrestada\n"
                    + "from usuario u, producto p, usuarios_x_producto x\n"
                    + "where u.idusuario = x.idusuario and x.idproducto = p.idproducto and x.cantidadPrestada > 0 and u.nombre LIKE '%" + busqueda + "%';";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                prestamos_al.add(new Usuariosxproducto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), Integer.parseInt(rs.getString(10))));
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(5));

            }

        } catch (Exception e) {
            prestamos_al = null;
        }
        return prestamos_al;
    }

    public static boolean actualizarCantidadEquipo(int c, String id, Connection conexion) {
        boolean bandera = false;
        try {
            String query = "UPDATE producto set cantidad = cantidad + ? where idproducto = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, c);
            ps.setString(2, id);
            ps.executeUpdate();
            bandera = true;
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static List<Usuariosxproducto> historial(Connection conexion) {
        List<Usuariosxproducto> historial_al = new ArrayList<Usuariosxproducto>();
        try {
            String query = "select u.idusuario, u.nombre, u.apellidos, u.dni, p.idproducto, p.nombre, p.marca, p.especificacion, x.fecha, x.cantidadPrestada\n"
                    + "from usuario u, producto p, usuarios_x_producto x\n"
                    + "where u.idusuario = x.idusuario and x.idproducto = p.idproducto and x.cantidadPrestada > 0\n"
                    + "order by x.fecha desc;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                historial_al.add(new Usuariosxproducto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), Integer.parseInt(rs.getString(10))));

            }

        } catch (Exception e) {

        }
        return historial_al;
    }

    public static List<Usuariosxproducto> mostrarHistorialUsuario(Connection conexion, String id) {
        List<Usuariosxproducto> prestamos_al = new ArrayList<Usuariosxproducto>();
        try {
            String query = "select u.idusuario, u.nombre, u.apellidos, u.dni, p.idproducto, p.nombre, p.marca, p.especificacion, x.fecha, x.cantidadPrestada\n"
                    + "from usuario u, producto p, usuarios_x_producto x\n"
                    + "where u.idusuario = x.idusuario and x.idproducto = p.idproducto and u.idusuario = ? order by x.fecha desc;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                prestamos_al.add(new Usuariosxproducto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), Integer.parseInt(rs.getString(10))));
            }
        } catch (Exception e) {
            prestamos_al = null;
        }
        return prestamos_al;
    }

    public static List<Usuario> mostrarTodo(Connection conexion) {
        List<Usuario> usuarios_al = new ArrayList<Usuario>();
        try {
            String query = "SELECT * FROM USUARIO";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                usuarios_al.add(new Usuario(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
            usuarios_al = null;
        }
        return usuarios_al;
    }

    public static boolean eliminarUsuario(Connection conexion, String id) {
        boolean bandera = false;
        String query = "DELETE FROM USUARIO WHERE idUsuario = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            bandera = true;
        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean eliminarProducto(Connection conexion, String id) {
        boolean bandera = false;
        String query = "DELETE FROM PRODUCTO WHERE idProducto = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
            bandera = true;
        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    public static List<Producto> mostrarTodoMateriales(Connection conexion) {
        List<Producto> productos_al = new ArrayList<Producto>();
        try {
            String query = "SELECT * FROM PRODUCTO";
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                productos_al.add(new Producto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
            }
        } catch (Exception e) {
            productos_al = null;
        }
        return productos_al;
    }

    public static Object[] actualizarPrestamo(Usuariosxproducto x, Connection conexion, int cantidad) {
        boolean bandera = false;
        int s = x.getCantidadPrestada() - cantidad;
        try {
            String query = "UPDATE usuarios_x_producto set cantidadPrestada = cantidadPrestada - ? where idproducto = ? and idusuario = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, cantidad);
            ps.setString(2, x.getIdProducto());
            ps.setString(3, x.getIdUsuario());
            ps.executeUpdate();
            bandera = true;
        } catch (Exception e) {
            bandera = false;
        }
        System.out.println(bandera);
        Object[] c = {bandera, s};
        return c;
    }

    public static boolean eliminarPrestamo(Usuariosxproducto x, Connection conexion) {
        boolean bandera = false;
        String query = "DELETE FROM usuarios_x_producto WHERE idUsuario = ? and idProducto = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, x.getIdUsuario());
            ps.setString(2, x.getIdProducto());
            ps.executeUpdate();
            bandera = true;
        } catch (SQLException e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean comprobarStock(Usuariosxproducto x, Connection conexion) {
        boolean bandera = false;
        try {
            String query = "SELECT * FROM producto where idproducto = ? and cantidad >= ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, x.getIdProducto());
            ps.setInt(2, x.getCantidadPrestada());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                bandera = true;
            }
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean actualizarStockProducto(Usuariosxproducto x, Connection conexion) {
        boolean bandera = false;
        try {
            String query = "UPDATE producto set cantidad = cantidad - ? where idproducto = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setInt(1, x.getCantidadPrestada());
            ps.setString(2, x.getIdProducto());
            ps.executeUpdate();
            bandera = true;
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static int insertarPrestamo(Usuariosxproducto x, Connection conexion) {
        int bandera = 0;
        try {
            if (comprobarStock(x, conexion)) {
                String query = "INSERT INTO usuarios_x_producto(idusuario,idproducto,fecha,cantidadPrestada) VALUES(?,?,?,?);";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setString(1, x.getIdUsuario());
                ps.setString(2, x.getIdProducto());
                ps.setString(3, x.getFecha());
                ps.setInt(4, x.getCantidadPrestada());
                ps.execute();
                if (actualizarStockProducto(x, conexion)) {
                    bandera = 1;
                } else {
                    System.out.println("NO SE HIZO LA QUERY COMPROBAR STOCK");
                }
            } else {
                bandera = -1;
            }

        } catch (Exception e) {
            bandera = 0;
        }
        return bandera;
    }

    public static int comprobarIDS(Usuariosxproducto x, Connection conexion) {
        int cantidad = 0;

        try {
            String query = "SELECT cantidadPrestada FROM usuarios_x_producto where idusuario = ? and idproducto = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, x.getIdUsuario());
            ps.setString(2, x.getIdProducto());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cantidad = rs.getInt(1);
            }

        } catch (Exception e) {

        }
        return cantidad;
    }

    public static int actualizarCantidadPrestamo(Usuariosxproducto x, Connection conexion, int cantidad) {
        int bandera = 0;
        try {
            if (comprobarStock(x, conexion)) {
                String query = "UPDATE usuarios_x_producto SET cantidadPrestada = ? where idUsuario = ? and idProducto = ?";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, cantidad + x.getCantidadPrestada());
                ps.setString(2, x.getIdUsuario());
                ps.setString(3, x.getIdProducto());
                ps.executeUpdate();
                if (actualizarStockProducto(x, conexion)) {
                    bandera = 1;
                }
            } else {
                bandera = -1;
            }
        } catch (Exception e) {
            bandera = 0;
        }
        return bandera;
    }

    public static String busquedaUsuario(String busqueda, Connection conexion) {
        String nombre = "";

        try {
            String query = "Select nombre, apellidos from usuario where idUsuario = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, busqueda);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nombre = rs.getString(1) + " " + rs.getString(2);
            }

        } catch (Exception e) {

        }
        return nombre;
    }

    public static boolean actualizarUsuario(Usuario x, Connection conexion) {
        boolean bandera = false;
        try {
            String query = "UPDATE usuario set nombre = ?, apellidos = ?, dni = ? where idUsuario = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, x.getNombre());
            ps.setString(2, x.getApellidos());
            ps.setString(3, x.getDni());
            ps.setString(4, x.getIdUsuario());
            ps.executeUpdate();
            bandera = true;
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static boolean actualizarEquipo(Producto x, Connection conexion) {
        boolean bandera = false;
        try {
            String query = "UPDATE producto set nombre = ?, marca = ?, especificacion = ?, cantidad = ? where idProducto = ?";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, x.getNombreProducto());
            ps.setString(2, x.getMarca());
            ps.setString(3, x.getEspecificacion());
            ps.setInt(4, x.getCantidad());
            ps.setString(5, x.getIdProducto());
            ps.executeUpdate();
            bandera = true;
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }

    public static Usuariosxproducto consultaPrestamo(String iu, String ip, Connection conexion) {
        Usuariosxproducto u = null;

        try {
            String query = "Select * from usuarios_x_producto where idUsuario = ? and idProducto = ?;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, iu);
            ps.setString(2, ip);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u = new Usuariosxproducto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            }

        } catch (Exception e) {
            u = null;
        }
        return u;
    }

    public static String[] configuracionCuenta(Connection conexion, String id) {
        String[] usuario = null;
        try {
            String query = "select u.nombre, u.apellidos, u.dni, l.correo, l.ciudad\n"
                    + "from usuario u, login l\n"
                    + "where u.idusuario = l.idusuario and u.idusuario = ?;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String[] susuario = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                usuario = susuario;
            }
        } catch (Exception e) {
            usuario = null;
        }
        return usuario;
    }

    public static boolean actualizarUsuarioConfiguracion(Connection conexion, String[] u, String id) {
        boolean bandera = false;
        try {
            String query = "update usuario u, login l set u.nombre = ?, u.apellidos= ?, u.dni= ?, l.correo= ?, l.ciudad = ? where u.idusuario = l.idusuario and u.idusuario = ?;";
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, u[0]);
            ps.setString(2, u[1]);
            ps.setString(3, u[2]);
            ps.setString(4, u[3]);
            ps.setString(5, u[4]);
            ps.setString(6, id);
            ps.executeUpdate();
            bandera = true;
        } catch (Exception e) {
            bandera = false;
        }
        return bandera;
    }
}
