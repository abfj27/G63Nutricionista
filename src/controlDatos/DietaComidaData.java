package controlDatos;

import entidades.DietaComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DietaComidaData {
    
    private Connection conec;
    
    public DietaComidaData() {
        conec = Conexion.getConexion();
    }
    
    public void cargarDietaComida(DietaComida dc) {
        String sql = "INSERT INTO dietacomida (idComida, idDieta, horario, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getComida().getIdComida());
            ps.setInt(2, dc.getDieta().getIdDieta());
            ps.setString(3, String.valueOf(dc.getHorario()));
            ps.setInt(4, dc.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dc.setIdDC(rs.getInt(1));
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
            // mensaje
        } catch (SQLException ex) {
            Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificarDietaComida(DietaComida dc) {
        String sql = "UPDATE dietacomida SET idComida=?, idDieta=?, horario=?, estado=? WHERE idDC=? ";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dc.getComida().getIdComida());
            ps.setInt(2, dc.getDieta().getIdDieta());
            ps.setString(3, String.valueOf(dc.getHorario()));
            ps.setInt(4, dc.getEstado());
            ps.setInt(5, dc.getIdDC());
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
