package controlDatos;

import entidades.DietaComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DietaComidaData {

    private Connection conec;

    public DietaComidaData() {
        conec = Conexion.getConexion();
    }

    public void cargarDietaComida(DietaComida dc) {
        String sql = "";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ////
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dc.setIdDC(1);
            }
            rs.close();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarDietaComida(DietaComida dc) {
        String sql = "";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ////
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarDietaComida(DietaComida dc) {
        String sql = "UPDATE dietacomida SET estado=0 WHERE idDC=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dc.getIdDC());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //
}
