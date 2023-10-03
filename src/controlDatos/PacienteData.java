package controlDatos;

import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PacienteData {

    private Connection conec;

    public PacienteData() {
        conec = Conexion.getConexion();
    }
// cargarPaciente o newPaciente?

    public void cargarPaciente(Paciente paciente) {
        String sql = "INSERT INTO `paciente`(`dni`, `apellido`, `nombre`, `pesoActual`, `domicilio`, `telefono`, `email`, `estado`) VALUES (?,?,?,?,?,?,?,?)";
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
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(8));
                System.out.println(paciente.getIdPaciente());
            }
            rs.close();
            ps.close();
            //mensaje
        } catch (SQLIntegrityConstraintViolationException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
            // mensaje
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // modificarPaciente o updatePaciente??
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
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // deletePaciente? bajaPaciente? eliminarPaciente?
    public void eliminarPaciente() {
        String sql = "UPDATE paciente SET estado=0 WHERE idPaciente=?";

        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            // falta cambiar el 0 por paciente.getidPaciente o similar
            ps.setInt(1, 0);
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void buscarPaciente() {

    }
    //
}
