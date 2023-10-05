package controlDatos;

import entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;

public class ComidaData {

    private Connection conec;

    public ComidaData() {
        conec = Conexion.getConexion();
    }
//    private String nombre;
//    private String detalle;
//    private int calorias;
//    private int idComida;
//    private int estado;

    public void cargarComida(Comida comida) {
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
                comida.setIdComida(1);
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
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
    //
}
