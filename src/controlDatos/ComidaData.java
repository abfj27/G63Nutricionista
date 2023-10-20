package controlDatos;

import entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;
import stuff.Utileria;

public class ComidaData {

    private Connection conec;

    public ComidaData() {
        conec = Conexion.getConexion();
    }

    public void cargarComida(Comida comida) {
        if (buscarComida(comida.getNombre(), comida.getCalorias()) == null) {
            String sql = "INSERT INTO comida (nombre, detalle, calorias, estado) VALUES (?,?,?,?)";
            try {
                PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, comida.getNombre());
                ps.setString(2, comida.getDetalle());
                ps.setInt(3, comida.getCalorias());
                ps.setInt(4, comida.getEstado());
                ps.executeUpdate();
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    comida.setIdComida(rs.getInt(1));
                    Utileria.mensaje("Comida creada con exito");
                }
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (buscarComida(comida.getNombre(), comida.getCalorias()).getEstado() == 0) {
                comida.setIdComida((buscarComida(comida.getNombre(), comida.getCalorias())).getIdComida());
                modificarComida(comida);
                Utileria.mensaje("Comida creada con exito");
            } else {
                Utileria.mensaje("Comida ingresada ya existe y esta siendo utilizada");
            }
        }
    }

    public void modificarComida(Comida comida) {
        String sql = "UPDATE comida SET nombre=?, detalle=?, calorias=?, estado=? WHERE idComida=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setInt(3, comida.getCalorias());
            ps.setInt(4, comida.getEstado());
            ps.setInt(5, comida.getIdComida());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Utileria.mensaje("Comida ingresada ya existe y esta siendo utilizada");
        }
    }

    public void eliminarComida(Comida comida) {
        String sql = "UPDATE comida SET estado=0 WHERE idComida=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, comida.getIdComida());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Comida> listaComidas(String seleccion, String ingreso, int estado) {
        ArrayList<Comida> comidas = new ArrayList<>();
        Comida comida = null;
        String sql;
        if (ingreso.isEmpty()) {
            if (estado == 1 || estado == 2) {
                sql = "SELECT* FROM comida WHERE estado=?";
            } else {
                sql = "SELECT* FROM comida WHERE estado>?";
            }
        } else if (seleccion.equals("nombre")) {
            if (estado == 1 || estado == 2) {
                sql = "SELECT* FROM comida WHERE nombre like ? and estado=?";
            } else {
                sql = "SELECT* FROM comida WHERE nombre like ? and estado>?";
            }
        } else if (seleccion.equals("detalle")) {
            if (estado == 1 || estado == 2) {
                sql = "SELECT* FROM comida WHERE detalle like ? and estado=?";
            } else {
                sql = "SELECT* FROM comida WHERE detalle like ? and estado>?";
            }
        } else if (seleccion.equals("calorias1")) {
            if (estado == 1 || estado == 2) {
                sql = "SELECT* FROM comida WHERE calorias > ? and estado=?";
            } else {
                sql = "SELECT* FROM comida WHERE calorias > ? and estado>?";
            }
        } else {
            if (estado == 1 || estado == 2) {
                sql = "SELECT* FROM comida WHERE calorias < ? and estado=?";
            } else {
                sql = "SELECT* FROM comida WHERE calorias < ? and estado>?";
            }
        }

        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            if (seleccion.equals("detalle")) {
                ps.setString(1, "%" + ingreso + "%");
            } else if (seleccion.equals("calorias1") || seleccion.equals("calorias2")) {
                if (ingreso.isEmpty()) {
                    ingreso = "0";
                }
                ps.setInt(1, Integer.valueOf(ingreso));
            } else if (!ingreso.isEmpty()) {
                ps.setString(1, ingreso);
            }
            if (!ingreso.isEmpty()) {
                ps.setInt(2, estado);
            } else {
                ps.setInt(1, estado);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCalorias(rs.getInt("calorias"));
                comida.setEstado(rs.getInt("estado"));
                comidas.add(comida);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comidas;
    }

    public void darAlta(String nombre, int calorias) {
        String sql = "UPDATE comida SET estado=2 where nombre=? and calorias=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, calorias);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void darBaja(String nombre, int calorias) {
        String sql = "UPDATE comida SET estado=1 where nombre=? and calorias=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, calorias);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Comida> AdminListaComidas(String seleccion, String ingreso, int estado) {
        ArrayList<Comida> comidas = new ArrayList<>();
        Comida comida = null;
        String sql;
        if (ingreso.isEmpty()) {
            if (estado == 1 || estado == -1) {
                sql = "SELECT* FROM comida WHERE estado>=?";
            } else {
                sql = "SELECT* FROM comida WHERE estado=?";
            }
        } else if (seleccion.equals("nombre")) {
            if (estado == 1 || estado == -1) {
                sql = "SELECT* FROM comida WHERE nombre like ? and estado>=?";
            } else {
                sql = "SELECT* FROM comida WHERE nombre like ? and estado=?";
            }
        } else if (seleccion.equals("detalle")) {
            if (estado == 1 || estado == -1) {
                sql = "SELECT* FROM comida WHERE detalle like ? and estado>=?";
            } else {
                sql = "SELECT* FROM comida WHERE detalle like ? and estado=?";
            }
        } else if (seleccion.equals("calorias1")) {
            if (estado == 1 || estado == -1) {
                sql = "SELECT* FROM comida WHERE calorias > ? and estado>=?";
            } else {
                sql = "SELECT* FROM comida WHERE calorias > ? and estado=?";
            }
        } else {
            if (estado == 1 || estado == -1) {
                sql = "SELECT* FROM comida WHERE calorias < ? and estado>=?";
            } else {
                sql = "SELECT* FROM comida WHERE calorias < ? and estado=?";
            }
        }

        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            if (seleccion.equals("detalle")) {
                ps.setString(1, "%" + ingreso + "%");
            } else if (seleccion.equals("calorias1") || seleccion.equals("calorias2")) {
                if (ingreso.isEmpty()) {
                    ingreso = "0";
                }
                ps.setInt(1, Integer.valueOf(ingreso));
            } else if (!ingreso.isEmpty()) {
                ps.setString(1, ingreso);
            }
            if (!ingreso.isEmpty()) {
                ps.setInt(2, estado);
            } else {
                ps.setInt(1, estado);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCalorias(rs.getInt("calorias"));
                comida.setEstado(rs.getInt("estado"));
                comidas.add(comida);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comidas;
    }

    public void eliminar(String nombre, int calorias) {
        String sql = "UPDATE comida SET estado=0 where nombre=? and calorias=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, calorias);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Comida buscarComida(String nombre, int calorias) {
        Comida comida = null;
        String sql = "SELECT* FROM comida where nombre like ? and calorias=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, calorias);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCalorias(rs.getInt("calorias"));
                comida.setEstado(rs.getInt("estado"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comida;
    }

    public Comida buscarComida(int idComida) {
        Comida comida = null;
        String sql = "SELECT * FROM comida WHERE idComida = ?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idComida);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCalorias(rs.getInt("calorias"));
                comida.setEstado(rs.getInt("estado"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return comida;
    }

}
