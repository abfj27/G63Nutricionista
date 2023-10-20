package controlDatos;

import entidades.Visita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;
import stuff.Utileria;

public class VisitaData {

    private Connection conec;

    public VisitaData() {
        conec = Conexion.getConexion();
    }

    public void cargarVisita(Visita visita) {
        String sql = "INSERT INTO visita (idDieta, idPaciente, peso, fecha, estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, visita.getDieta().getIdDieta());
            ps.setInt(2, visita.getPaciente().getIdPaciente());
            ps.setDouble(3, visita.getPeso());
            ps.setDate(4, Date.valueOf(visita.getFecha()));
            ps.setInt(5, visita.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1));
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cargarVisita2(Visita visita) {
        String sql = "INSERT INTO visita ( idPaciente, peso, fecha, estado) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setInt(1, visita.getDieta().getIdDieta());
            ps.setInt(1, visita.getPaciente().getIdPaciente());
            ps.setDouble(2, visita.getPeso());
            ps.setDate(3, Date.valueOf(visita.getFecha()));
            ps.setInt(4, visita.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                visita.setIdVisita(rs.getInt(1));
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarVisita(Visita visita) {
        String sql = "UPDATE visita SET idDieta=?, idPaciente=?, peso=?, fecha=?, estado=? WHERE idVisita=? ";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, visita.getDieta().getIdDieta());
            ps.setInt(2, visita.getPaciente().getIdPaciente());
            ps.setDouble(3, visita.getPeso());
            ps.setDate(4, Date.valueOf(visita.getFecha()));
            ps.setInt(5, visita.getEstado());
            ps.setInt(6, visita.getIdVisita());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarVisita(Visita visita) {
        String sql = "UPDATE visita SET estado=0 WHERE idVisita=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, visita.getIdVisita());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public List<Visita> obtenerHistorial(int idPaciente) {
        List<Visita> historial = new ArrayList<>();
        String sql = "SELECT * FROM visita WHERE idPaciente=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
           ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Visita visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setPaciente(new PacienteData().buscarPacienteCodigo(rs.getInt("idPaciente")));
                visita.setDieta(new DietaData().buscarDietaCodigo(rs.getInt("idDieta")));
                visita.setPeso(rs.getDouble("peso"));
                visita.setFecha(rs.getDate("fecha").toLocalDate());
                visita.setEstado(rs.getInt("estado"));
                historial.add(visita);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(VisitaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return historial;
    }
    

} // Llave final
