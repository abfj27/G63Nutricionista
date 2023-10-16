package controlDatos;

import entidades.Dieta;
import entidades.Paciente;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import stuff.Utileria;

public class DietaData {

    private Connection conec;

    public DietaData() {
        conec = Conexion.getConexion();
    }

    public void cargarDieta(Dieta dieta) {
        String sql = "INSERT INTO dieta (nombre, idPaciente, pesoInicial, pesoObjetivo, fechaInicial, fechaFinal, estado) VALUES (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDouble(3, dieta.getPesoInicial());
            ps.setDouble(4, dieta.getPesoObjetivo());
            ps.setDate(5, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setInt(7, dieta.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dieta.setIdDieta(rs.getInt(1));
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
            // mensaje
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarDieta(Dieta dieta) {
        String sql = "UPDATE dieta SET nombre=?, idPaciente=?, pesoInicial=?, pesoObjetivo=?, fechaInicial=?, fechaFinal=?, estado=? WHERE idDieta=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getPaciente().getIdPaciente());
            ps.setDouble(3, dieta.getPesoInicial());
            ps.setDouble(4, dieta.getPesoObjetivo());
            ps.setDate(5, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setInt(7, dieta.getEstado());
            ps.setInt(8, dieta.getIdDieta());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarDieta(Dieta dieta) {
        String sql = "UPDATE dieta SET estado=0 WHERE idDieta=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dieta.getIdDieta());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Dieta> listaDietasAll() {
        List<Dieta> lista = new ArrayList<>();
        PacienteData pdata = new PacienteData();
        String sql = "SELECT * FROM dieta";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                Paciente paciente = new Paciente();
                dieta.setNombre(rs.getString(1));
                paciente = pdata.buscarPacienteCodigo(rs.getInt(2));
                dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getDouble(3));
                dieta.setPesoObjetivo(rs.getDouble(4));
                dieta.setFechaInicial(Utileria.convertirLocalDate(rs.getDate(5)));
                dieta.setFechaFinal(Utileria.convertirLocalDate(rs.getDate(6)));
                dieta.setIdDieta(rs.getInt(7));
                dieta.setEstado(rs.getInt(8));
                lista.add(dieta);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Dieta> listaDietas() {
        List<Dieta> lista = new ArrayList<>();
        PacienteData pdata = new PacienteData();
        String sql = "SELECT * FROM dieta WHERE dieta.estado > 0";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                Paciente paciente = new Paciente();
                dieta.setNombre(rs.getString(1));
                paciente = pdata.buscarPacienteCodigo(rs.getInt(2));
                dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getDouble(3));
                dieta.setPesoObjetivo(rs.getDouble(4));
                dieta.setFechaInicial(Utileria.convertirLocalDate(rs.getDate(5)));
                dieta.setFechaFinal(Utileria.convertirLocalDate(rs.getDate(6)));
                dieta.setIdDieta(rs.getInt(7));
                dieta.setEstado(rs.getInt(8));
                lista.add(dieta);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Dieta> listaDietasEnAlta() {
        List<Dieta> lista = new ArrayList<>();
        PacienteData pdata = new PacienteData();
        String sql = "SELECT * FROM dieta WHERE dieta.estado >= 2";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                Paciente paciente = new Paciente();
                dieta.setNombre(rs.getString(1));
                paciente = pdata.buscarPacienteCodigo(rs.getInt(2));
                dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getDouble(3));
                dieta.setPesoObjetivo(rs.getDouble(4));
                dieta.setFechaInicial(Utileria.convertirLocalDate(rs.getDate(5)));
                dieta.setFechaFinal(Utileria.convertirLocalDate(rs.getDate(6)));
                dieta.setIdDieta(rs.getInt(7));
                dieta.setEstado(rs.getInt(8));
                lista.add(dieta);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    //
}
