package controlDatos;

import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;

public class PacienteData {

    private Connection conec;

    public PacienteData() {
        conec = Conexion.getConexion();
    }

    public void cargarPaciente(Paciente paciente) {
        String sql = "INSERT INTO `paciente`(`dni`, `apellido`, `nombre`, `pesoActual`, `domicilio`, `telefono`, `email`, `estado`) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setString(5, paciente.getDomicilio());
            ps.setString(6, paciente.getTelefono());
            ps.setString(7, paciente.getEmail());
            ps.setInt(8, paciente.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
            // mensaje
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET dni=?, apellido=?, nombre=?, pesoActual=?, domicilio=?, telefono=?, email=?, estado=? WHERE idPaciente=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setString(5, paciente.getDomicilio());
            ps.setString(6, paciente.getTelefono());
            ps.setString(7, paciente.getEmail());
            ps.setInt(8, paciente.getEstado());
            ps.setInt(9, paciente.getIdPaciente());
            ps.executeUpdate();
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET estado=0 WHERE idPaciente=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, paciente.getIdPaciente());
            ps.executeUpdate();
            //mensaje
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Paciente buscarPacienteCodigo(int id) {
        Paciente pac = null;
        String sql = "SELECT dni, apellido, nombre, pesoActual, domicilio, telefono, email, idPaciente, estado FROM paciente WHERE idPaciente=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pac = new Paciente();
                pac.setDni(rs.getInt("dni"));
                pac.setApellido(rs.getString("apellido"));
                pac.setNombre(rs.getString("nombre"));
                pac.setPesoActual(rs.getDouble("pesoActual"));
                pac.setDomicilio(rs.getString("domicilio"));
                pac.setTelefono(rs.getString("telefono"));
                pac.setEmail(rs.getString("email"));
                pac.setIdPaciente(rs.getInt("idPaciente"));
                pac.setEstado(rs.getInt("estado"));
            } else {
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pac;
    }

    public Paciente buscarPacienteDocumento(int dni) {
        Paciente pac = null;
        String sql = "SELECT dni, apellido, nombre, pesoActual, domicilio, telefono, email, idPaciente, estado FROM paciente WHERE dni=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                pac = new Paciente();
                pac.setDni(rs.getInt("dni"));
                pac.setApellido(rs.getString("apellido"));
                pac.setNombre(rs.getString("nombre"));
                pac.setPesoActual(rs.getDouble("pesoActual"));
                pac.setDomicilio(rs.getString("domicilio"));
                pac.setTelefono(rs.getString("telefono"));
                pac.setEmail(rs.getString("email"));
                pac.setIdPaciente(rs.getInt("idPaciente"));
                pac.setEstado(rs.getInt("estado"));
            } else {
                //mensaje
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pac;
    }
    //
}
