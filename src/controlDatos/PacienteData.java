package controlDatos;

import entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Statement;
import stuff.Utileria;

public class PacienteData {

    private Connection conec;

    public PacienteData() {
        conec = Conexion.getConexion();
    }

    public void cargarPaciente(Paciente paciente) {
        String sql = "INSERT INTO `paciente`(`dni`, `apellido`, `nombre`, `pesoActual`, altura, edad, genero, `domicilio`, `telefono`, `email`, `estado`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getAltura());
            ps.setInt(6, paciente.getEdad());
            ps.setString(7, paciente.getGenero());
            ps.setString(8, paciente.getDomicilio());
            ps.setString(9, paciente.getTelefono());
            ps.setString(10, paciente.getEmail());
            ps.setInt(11, paciente.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                Utileria.mensaje("Se cargo el paciente correctamente");
            }
            rs.close();
            ps.close();
        } catch (SQLIntegrityConstraintViolationException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
            Utileria.mensaje("Ya existe un paciente cargado con ese DNI");
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET dni=?, apellido=?, nombre=?, pesoActual=?, altura=?, edad=?, genero=?, domicilio=?, telefono=?, email=?, estado=? WHERE idPaciente=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setDouble(4, paciente.getPesoActual());
            ps.setDouble(5, paciente.getAltura());
            ps.setInt(6, paciente.getEdad());
            ps.setString(7, paciente.getGenero());
            ps.setString(8, paciente.getDomicilio());
            ps.setString(9, paciente.getTelefono());
            ps.setString(10, paciente.getEmail());
            ps.setInt(11, paciente.getEstado());
            ps.setInt(12, paciente.getIdPaciente());
            ps.executeUpdate();
            ps.close();
//            Utileria.mensaje("Se modifico el paciente correctamente");
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
            ps.close();
            //mensaje
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Paciente buscarPacienteCodigo(int id) {
        Paciente pac = null;
        String sql = "SELECT dni, apellido, nombre, pesoActual, altura, edad, genero, domicilio, telefono, email, idPaciente, estado FROM paciente WHERE idPaciente=?";
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
                pac.setEdad(rs.getInt("edad"));
                pac.setAltura(rs.getDouble("altura"));
                pac.setGenero(rs.getString("genero"));
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
        String sql = "SELECT dni, apellido, nombre, pesoActual, altura, edad, genero, domicilio, telefono, email, idPaciente, estado FROM paciente WHERE dni=?";
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
                pac.setEdad(rs.getInt("edad"));
                pac.setAltura(rs.getDouble("altura"));
                pac.setGenero(rs.getString("genero"));
            } else {
                Utileria.mensaje("No se encontro paciente");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return pac;
    }

    public ArrayList<Paciente> AdminPacientes(String seleccion, String ingreso, int estado) {
        if (!seleccion.equals("Seleccionar")) {
            ArrayList<Paciente> pacientes = new ArrayList<>();
            Paciente paciente = null;
            String sql;
            if (ingreso.isEmpty() || (ingreso.isEmpty() && seleccion.equals("dni"))) {
                if (estado == 1 || estado == -1) {
                    sql = "SELECT* FROM paciente WHERE estado>=?";
                } else {
                    sql = "SELECT* FROM paciente WHERE estado=?";
                }
            } else if (seleccion.equals("nombre")) {
                if (estado == 1 || estado == -1) {
                    sql = "SELECT* FROM paciente WHERE nombre like ? and estado>=?";
                } else {
                    sql = "SELECT* FROM paciente WHERE nombre like ? and estado=?";
                }
            } else if (seleccion.equals("apellido")) {
                if (estado == 1 || estado == -1) {
                    sql = "SELECT* FROM paciente WHERE apellido like ? and estado>=?";
                } else {
                    sql = "SELECT* FROM paciente WHERE apellido like ? and estado=?";
                }
            } else {
                if (estado == 1 || estado == -1) {
                    sql = "SELECT* FROM paciente WHERE dni = ? and estado>=?";
                } else {
                    sql = "SELECT* FROM paciente WHERE dni = ? and estado=?";
                }
            }
            try {
                PreparedStatement ps = conec.prepareStatement(sql);

                if (!ingreso.isEmpty()) {
                    if (!seleccion.equals("dni")) {
                        ps.setString(1, ingreso + "%");
                    } else {
                        ps.setInt(1, Integer.valueOf(ingreso));
                    }
                    ps.setInt(2, estado);
                } else {
                    ps.setInt(1, estado);
                }
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    paciente = new Paciente();
                    paciente.setIdPaciente(rs.getInt("idPaciente"));
                    paciente.setDni(rs.getInt("dni"));
                    paciente.setNombre(rs.getString("nombre"));
                    paciente.setApellido(rs.getString("apellido"));
                    paciente.setPesoActual(rs.getFloat("pesoActual"));
                    paciente.setAltura(rs.getFloat("altura"));
                    paciente.setEdad(rs.getInt("edad"));
                    paciente.setGenero(rs.getString("genero"));
                    paciente.setDomicilio(rs.getString("domicilio"));
                    paciente.setTelefono(rs.getString("telefono"));
                    paciente.setEmail(rs.getString("email"));
                    paciente.setEstado(rs.getInt("estado"));
                    pacientes.add(paciente);
                }
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
            }
            return pacientes;
        } else {
            return new ArrayList<>();
        }
    }

    public ArrayList<Paciente> ListaPacientes(String seleccion, String ingreso, int estado) {
        if (!seleccion.equals("Seleccionar")) {
            ArrayList<Paciente> pacientes = new ArrayList<>();
            Paciente paciente = null;
            String sql;
            if (ingreso.isEmpty() || (ingreso.isEmpty() && seleccion.equals("dni"))) {
                sql = "SELECT* FROM paciente WHERE estado=2";
            } else if (seleccion.equals("nombre")) {
                sql = "SELECT* FROM paciente WHERE nombre like ? and estado=2";
            } else if (seleccion.equals("apellido")) {
                sql = "SELECT* FROM paciente WHERE apellido like ? and estado=2";
            } else {
                sql = "SELECT* FROM paciente WHERE dni = ? and estado=2";
            }

            try {
                PreparedStatement ps = conec.prepareStatement(sql);
                if (!ingreso.isEmpty()) {
                    if (!seleccion.equals("dni")) {
                        ps.setString(1, ingreso + "%");
                    } else {
                        ps.setInt(1, Integer.valueOf(ingreso));
                    }
                }
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    paciente = new Paciente();
                    paciente.setIdPaciente(rs.getInt("idPaciente"));
                    paciente.setDni(rs.getInt("dni"));
                    paciente.setNombre(rs.getString("nombre"));
                    paciente.setApellido(rs.getString("apellido"));
                    paciente.setPesoActual(rs.getFloat("pesoActual"));
                    paciente.setAltura(rs.getFloat("altura"));
                    paciente.setEdad(rs.getInt("edad"));
                    paciente.setGenero(rs.getString("genero"));
                    paciente.setDomicilio(rs.getString("domicilio"));
                    paciente.setTelefono(rs.getString("telefono"));
                    paciente.setEmail(rs.getString("email"));
                    paciente.setEstado(rs.getInt("estado"));
                    pacientes.add(paciente);
                }
                rs.close();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(ComidaData.class.getName()).log(Level.SEVERE, null, ex);
            }
            return pacientes;
        } else {
            return new ArrayList<>();
        }
    }

    public void darAlta(int dni) {
        String sql = "UPDATE paciente SET estado=2 where dni=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void darBaja(int dni) {
        String sql = "UPDATE paciente SET estado=1 where dni=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void eliminarPaciAdmin(int dni) {
        String sql = "UPDATE paciente SET estado=0 where dni=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.executeUpdate();
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ComidaData.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }
    //
}
