package controlDatos;

import entidades.Dieta;
import entidades.Paciente;
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

    public ArrayList<Dieta> adminDieta(String seleccion, String ingreso, int estado) {
        ArrayList<Dieta> dietas = new ArrayList<>();
        Dieta dieta = null;
        Paciente paciente = null;
        String sql;
        if (ingreso.isEmpty()) {
            if (estado == 1 || estado == -1) {
                sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.estado>=? group by d.idDieta";
            } else {
                sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.estado=? group by d.idDieta";
            }
        } else if (seleccion.equals("nombre paciente")) {
            if (estado == 1 || estado == -1) {
                sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.idPaciente in(SELECT idPaciente from paciente where nombre like ?) and d.estado>=? group by d.idDieta";
            } else {
                sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.idPaciente in(SELECT idPaciente from paciente where nombre like ?) and d.estado=? group by d.idDieta";
            }
        } else if (seleccion.equals("nombre dieta")) {
            if (estado == 1 || estado == -1) {
                sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.nombre like ? and d.estado>=? group by d.idDieta";
            } else {
                sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.nombre like ? and d.estado=? group by d.idDieta";
            }
        } else {
            if (estado == 1 || estado == -1) {
                sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.idPaciente in(SELECT idPaciente from paciente where dni=?) and d.estado>=? group by d.idDieta";
            } else {
                sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.idPaciente in(SELECT idPaciente from paciente where dni=?) and d.estado>=? group by d.idDieta";
            }
        }

        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            if (seleccion.equals("nombre paciente") || seleccion.equals("nombre dieta")) {
                ps.setString(1, ingreso + "%");
            } else if (seleccion.equals("dni")) {
                if (ingreso.isEmpty()) {
                    ingreso = "0";
                }
                ps.setInt(1, Integer.valueOf(ingreso));
            }
            if (!ingreso.isEmpty()) {
                ps.setInt(2, estado);
            } else {
                ps.setInt(1, estado);
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                paciente = new Paciente();
                dieta = new Dieta();
                paciente.setIdPaciente(rs.getInt("p.idPaciente"));
                paciente.setDni(rs.getInt("p.dni"));
                paciente.setNombre(rs.getString("p.nombre"));
                paciente.setApellido(rs.getString("p.apellido"));
                paciente.setPesoActual(rs.getFloat("p.pesoActual"));
                paciente.setAltura(rs.getFloat("p.altura"));
                paciente.setEdad(rs.getInt("p.edad"));
                paciente.setGenero(rs.getString("p.genero"));
                paciente.setDomicilio(rs.getString("p.domicilio"));
                paciente.setTelefono(rs.getString("p.telefono"));
                paciente.setEmail(rs.getString("p.email"));
                paciente.setEstado(rs.getInt("p.estado"));

                dieta.setIdDieta(rs.getInt("d.idDieta"));
                dieta.setNombre(rs.getString("d.nombre"));
                dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getFloat("d.pesoInicial"));
                dieta.setPesoObjetivo(rs.getFloat("d.pesoObjetivo"));
                dieta.setFechaInicial(rs.getDate("d.fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("d.fechaFinal").toLocalDate());
                dieta.setFechaUltimaVisita(rs.getDate("max(v.fecha)").toLocalDate());
                dieta.setEstado(rs.getInt("d.estado"));
                dietas.add(dieta);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dietas;
    }

    public Dieta AdminBuscar(int dni) {
        Dieta dieta = null;
        Paciente paciente = null;
        String sql = "SELECT *,max(v.fecha) FROM dieta d join paciente p on (d.idPaciente=p.idPaciente) JOIN visita v on(d.idDieta=v.idDieta) WHERE d.idPaciente in(SELECT idPaciente from paciente where dni=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                dieta = new Dieta();
                paciente.setIdPaciente(rs.getInt("p.idPaciente"));
                paciente.setDni(rs.getInt("p.dni"));
                paciente.setNombre(rs.getString("p.nombre"));
                paciente.setApellido(rs.getString("p.apellido"));
                paciente.setPesoActual(rs.getFloat("p.pesoActual"));
                paciente.setAltura(rs.getFloat("p.altura"));
                paciente.setEdad(rs.getInt("p.edad"));
                paciente.setGenero(rs.getString("p.genero"));
                paciente.setDomicilio(rs.getString("p.domicilio"));
                paciente.setTelefono(rs.getString("p.telefono"));
                paciente.setEmail(rs.getString("p.email"));
                paciente.setEstado(rs.getInt("p.estado"));
                dieta.setIdDieta(rs.getInt("d.idDieta"));
                dieta.setNombre(rs.getString("d.nombre"));
                dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getFloat("d.pesoInicial"));
                dieta.setPesoObjetivo(rs.getFloat("d.pesoObjetivo"));
                dieta.setFechaInicial(rs.getDate("d.fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("d.fechaFinal").toLocalDate());
                dieta.setFechaUltimaVisita(rs.getDate("max(v.fecha)").toLocalDate());
                dieta.setEstado(rs.getInt("d.estado"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dieta;
    }

    public void adminEliminar(int dni) {
        String sql = "UPDATE `dieta` SET estado=0 WHERE idPaciente = (SELECT idPaciente from paciente where dni=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeLargeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void adminDarAlta(int dni) {
        String sql = "UPDATE `dieta` SET estado=2 WHERE idPaciente = (SELECT idPaciente from paciente where dni=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeLargeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void adminDarBaja(int dni) {
        String sql = "UPDATE `dieta` SET estado=1 WHERE idPaciente = (SELECT idPaciente from paciente where dni=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeLargeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //
}
