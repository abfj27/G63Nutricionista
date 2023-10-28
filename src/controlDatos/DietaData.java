package controlDatos;

import entidades.Dieta;
import entidades.Paciente;
import entidades.Visita;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.time.LocalDate;
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
                Utileria.mensaje("Dieta cargada satisfactoriamente...");
            }
            VisitaData vdata = new VisitaData();
            Visita vis = new Visita();
            System.out.println(dieta.getIdDieta());
            vis.setPaciente(dieta.getPaciente());
            vis.setDieta(dieta);
            vis.setPeso(dieta.getPesoInicial());
            vis.setFecha(dieta.getFechaInicial());
            vis.setEstado(2);
            vdata.cargarVisita(vis);
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
            Utileria.mensaje("Dieta modificada satisfactoriamente...");
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
                dieta.setFechaInicial(rs.getDate(5).toLocalDate());
                dieta.setFechaFinal(rs.getDate(6).toLocalDate());
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
                dieta.setFechaInicial(rs.getDate(5).toLocalDate());
                dieta.setFechaFinal(rs.getDate(6).toLocalDate());
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
                dieta.setFechaInicial(rs.getDate(5).toLocalDate());
                dieta.setFechaFinal(rs.getDate(6).toLocalDate());
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

    public List<Dieta> listaDietas2(String string, int num) {
        List<Dieta> lista = new ArrayList<>();
        PacienteData pdata = new PacienteData();
        String sql = crearString1(string, num);
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
                dieta.setFechaInicial(rs.getDate(5).toLocalDate());
                dieta.setFechaFinal(rs.getDate(6).toLocalDate());
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

    private String crearString1(String string, int num) {
        String sql = "";
        switch (num) {
            case 0: //Todas
                sql = "SELECT dieta.*, paciente.apellido, paciente.nombre\n"
                        + "FROM dieta JOIN paciente ON(paciente.idPaciente=dieta.idPaciente)\n"
                        + "WHERE dieta.estado >= 2";
                break;
            case 1: //Nombre Dieta
                sql = "SELECT dieta.*, paciente.apellido, paciente.nombre\n"
                        + "FROM dieta JOIN paciente ON(paciente.idPaciente=dieta.idPaciente)\n"
                        + "WHERE dieta.estado >= 2 AND dieta.nombre LIKE '" + string + "%'";
                break;
            case 2: //Nombre Paciente
                sql = "SELECT dieta.*, paciente.apellido, paciente.nombre\n"
                        + "FROM dieta JOIN paciente ON(paciente.idPaciente=dieta.idPaciente)\n"
                        + "WHERE dieta.estado >= 2 AND paciente.nombre LIKE '" + string + "%'";
                break;
            case 3: //Apellido Paciente
                sql = "SELECT dieta.*, paciente.apellido, paciente.nombre\n"
                        + "FROM dieta JOIN paciente ON(paciente.idPaciente=dieta.idPaciente)\n"
                        + "WHERE dieta.estado >= 2 AND paciente.apellido LIKE '" + string + "%'";
                break;
        }
        return sql;
    }

    public Dieta buscarDietaXid(int id) {
        Dieta dieta = new Dieta();
        PacienteData pdata = new PacienteData();
        String sql = "SELECT nombre, idPaciente, pesoInicial, pesoObjetivo, fechaInicial , fechaFinal, idDieta, estado FROM dieta WHERE idDieta = ?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Paciente paciente = new Paciente();
                paciente = pdata.buscarPacienteCodigo(rs.getInt("idPaciente"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoObjetivo(rs.getDouble("pesoObjetivo"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setEstado(rs.getInt("estado"));
            } else {
                // mensaje
                System.out.println("elol");
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dieta;
    }

    public Dieta dietaFechaFinalMax(int dni) {
        Dieta dietaFechaMax = null;
        String sql = "SELECT d.* FROM dieta d where d.estado=2 and d.fechaFinal=(SELECT max(fechaFinal) from dieta where (idPaciente=d.idPaciente)) and d.idPaciente=(SELECT idPaciente from paciente WHERE dni=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                PacienteData pd = new PacienteData();
                dietaFechaMax = new Dieta();
                dietaFechaMax.setNombre(rs.getString("nombre"));
                dietaFechaMax.setPaciente(pd.buscarPacienteDocumento(dni));
                dietaFechaMax.setPesoInicial(rs.getFloat("pesoInicial"));
                dietaFechaMax.setPesoObjetivo(rs.getFloat("pesoObjetivo"));
                dietaFechaMax.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dietaFechaMax.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dietaFechaMax.setIdDieta(rs.getInt("idDieta"));
                dietaFechaMax.setEstado(rs.getInt("estado"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dietaFechaMax;
    }

    //
    //
    //
    public ArrayList<Dieta> adminDieta(String seleccion, String ingreso, int estado) {
        ArrayList<Dieta> dietas = new ArrayList<>();
        Dieta dieta = null;
        Paciente paciente = null;
        String sql;
        if (ingreso.isEmpty() || (ingreso.isEmpty() && seleccion.equals("dni paciente"))) {
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
//            if (seleccion.equals("nombre paciente") || seleccion.equals("nombre dieta")) {
//                ps.setString(1, ingreso + "%");
//            } else if (seleccion.equals("dni")) {
//                if (ingreso.isEmpty()) {
//                    ingreso = "0";
//                }
//                ps.setInt(1, Integer.valueOf(ingreso));
//            }
            if (!ingreso.isEmpty()) {
                if (!seleccion.equals("dni paciente")) {
                    ps.setString(1, ingreso + "%");
                } else {
                    ps.setInt(1, Integer.valueOf(ingreso));
                }
                ps.setInt(2, estado);
            } else {
                ps.setInt(1, estado);
            }

//            Utileria.mensaje(estado + " " + seleccion + " " + sql);
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
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
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

    public Dieta AdminBuscarXDniYFechas(int dni, LocalDate fechaInicial, LocalDate fechaFinal) {
        Dieta dieta = null;
        Paciente paciente = null;
        String sql = "SELECT* from dieta where idPaciente=(SELECT idPaciente from paciente where dni=? and fechaInicial=? and fechaFinal=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ps.setDate(2, Date.valueOf(fechaInicial));
            ps.setDate(3, Date.valueOf(fechaFinal));
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                PacienteData pd = new PacienteData();
                paciente = pd.buscarPacienteDocumento(dni);
//                paciente = pd.buscarPacienteCodigo(rs.getInt("idPaciente"));
                dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPaciente(paciente);
//                dieta.setPaciente(pd.buscarPacienteCodigo(rs.getInt("idPaciente")));
                dieta.setPesoInicial(rs.getFloat("pesoInicial"));
                dieta.setPesoObjetivo(rs.getFloat("pesoObjetivo"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setEstado(rs.getInt("estado"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dieta;
    }

    public Dieta BuscarXDniYFechaFinal(int dni) {
        Dieta dieta = null;
        Paciente paciente = null;
        String sql = "SELECT d.* FROM dieta d WHERE d.estado=2 and d.idPaciente=(SELECT idPaciente from paciente where dni=?) and d.fechaFinal=(SELECT MAX(dieta.fechaFinal) from dieta where idPaciente=d.idPaciente)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                PacienteData pd = new PacienteData();
                paciente = pd.buscarPacienteDocumento(dni);
                dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPaciente(paciente);
                dieta.setPesoInicial(rs.getFloat("pesoInicial"));
                dieta.setPesoObjetivo(rs.getFloat("pesoObjetivo"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setEstado(rs.getInt("estado"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dieta;
    }

    public void adminEliminar(int dni, LocalDate fechaInicial, LocalDate fechaFinal) {
        String sql = "UPDATE `dieta` SET estado=0 WHERE fechaInicial=? and fechaFinal=? and idPaciente = (SELECT idPaciente from paciente where dni=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicial));
            ps.setDate(2, Date.valueOf(fechaFinal));
            ps.setInt(3, dni);
            ps.executeLargeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void adminDarAlta(int dni, LocalDate fechaInicial, LocalDate fechaFinal) {
        String sql = "UPDATE `dieta` SET estado=2 WHERE fechaInicial=? and fechaFinal=? and idPaciente = (SELECT idPaciente from paciente where dni=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicial));
            ps.setDate(2, Date.valueOf(fechaFinal));
            ps.setInt(3, dni);
            ps.executeLargeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void adminDarBaja(int dni, LocalDate fechaInicial, LocalDate fechaFinal) {
        String sql = "UPDATE `dieta` SET estado=1 WHERE fechaInicial=? and fechaFinal=? and idPaciente = (SELECT idPaciente from paciente where dni=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fechaInicial));
            ps.setDate(2, Date.valueOf(fechaFinal));
            ps.setInt(3, dni);
            ps.executeLargeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Dieta buscarDietaCodigo(int idDieta) {
        Dieta dieta = null;
        String sql = "SELECT * FROM dieta WHERE idDieta=?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dieta = new Dieta();
                dieta.setNombre(rs.getString("nombre"));
                dieta.setPaciente(new PacienteData().buscarPacienteCodigo(rs.getInt("idPaciente")));
                dieta.setPesoInicial(rs.getDouble("pesoInicial"));
                dieta.setPesoObjetivo(rs.getDouble("pesoObjetivo"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setEstado(rs.getInt("estado"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dieta;
    }

    public List<Dieta> pacienteDieta(int check, String apellido) {
        List<Dieta> lista = new ArrayList<>();
        PacienteData pdata = new PacienteData();
        String sql = SQLpacienteDieta(check, apellido);
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
                dieta.setFechaInicial(rs.getDate(5).toLocalDate());
                dieta.setFechaFinal(rs.getDate(6).toLocalDate());
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

    private String SQLpacienteDieta(int check, String apellido) {
        String sql = "";
        switch (check) {
            case 1: // completado
                sql = "SELECT dieta.*, paciente.apellido FROM dieta JOIN paciente ON(paciente.idPaciente=dieta.idPaciente)\n"
                        + "WHERE dieta.estado >= 1  AND paciente.apellido LIKE '" + apellido + "%' AND fechaFinal <= CURDATE()";
                break;
            case 2: // incompleto
                sql = "SELECT dieta.*, paciente.apellido FROM dieta JOIN paciente ON(paciente.idPaciente=dieta.idPaciente)\n"
                        + "WHERE dieta.estado >= 1  AND paciente.apellido LIKE '" + apellido + "%' AND fechaFinal <= CURDATE()";
                break;
            case 3: // curso
                sql = "SELECT dieta.*, paciente.apellido FROM dieta JOIN paciente ON(paciente.idPaciente=dieta.idPaciente)\n"
                        + "WHERE dieta.estado >= 1  AND paciente.apellido LIKE '" + apellido + "%' AND fechaFinal > CURDATE()";
                break;
            default:    // todos
                sql = "SELECT * from dieta WHERE dieta.estado >= 1  AND paciente.apellido LIKE '" + apellido + "%'";
        }
        return sql;
    }
//

    public List<Dieta> dietasFiltrar(int check, String ingreso) {
        ArrayList<Dieta> dietas = new ArrayList<>();
        String sql = "";
        switch (check) {
            case 1:
                 if (ingreso.isEmpty()) {
                    sql = "Select d.* from dieta d where d.estado=2 and fechaFinal<=curdate() and fechaFinal=(SELECT max(fechaFinal) from dieta d2 where d2.idPaciente=d.idPaciente)";
                } else {
                    sql = "Select d.* from dieta d where d.idPaciente in (SELECT idPaciente from paciente where apellido like ?) and d.estado=2 and d.fechaFinal<=curdate() and fechaFinal=(SELECT max(fechaFinal) from dieta d2 where d2.idPaciente=d.idPaciente)";
                }
                break;
            case 2:
                if (ingreso.isEmpty()) {
                    sql = "Select d.* from dieta d where d.estado=2 and fechaFinal<=curdate() and fechaFinal=(SELECT max(fechaFinal) from dieta d2 where d2.idPaciente=d.idPaciente)";
                } else {
                    sql = "Select d.* from dieta d where d.idPaciente in (SELECT idPaciente from paciente where apellido like ?) and d.estado=2 and d.fechaFinal<=curdate() and fechaFinal=(SELECT max(fechaFinal) from dieta d2 where d2.idPaciente=d.idPaciente)";
                }
                break;
            case 3:
                if (ingreso.isEmpty()) {
                    sql = "Select d.* from dieta d where d.estado=2 and fechaFinal>=curdate() and fechaFinal=(SELECT max(fechaFinal) from dieta d2 where d2.idPaciente=d.idPaciente)";
                } else {
                    sql = "Select d.* from dieta d where d.idPaciente in (SELECT idPaciente from paciente where apellido like ?) and d.estado=2 and d.fechaFinal>=curdate() and fechaFinal=(SELECT max(fechaFinal) from dieta d2 where d2.idPaciente=d.idPaciente)";
                }
                break;
            default:
                if (ingreso.isEmpty()) {
                    sql = "Select d.* from dieta d where d.estado=2 and d.fechaFinal=(SELECT max(fechaFinal) from dieta d2 where d2.idPaciente=d.idPaciente)";
                } else {
                    sql = "Select d.* from dieta d where d.idPaciente in (SELECT idPaciente from paciente where apellido like ?) and d.estado=2 and fechaFinal=(SELECT max(fechaFinal) from dieta d2 where d2.idPaciente=d.idPaciente)";
                }

        }
        
        try {
          PreparedStatement ps = conec.prepareStatement(sql);
            if (!ingreso.isEmpty()) {
                ps.setString(1, ingreso + "%");
            }
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PacienteData pd = new PacienteData();
                Dieta dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setPaciente(pd.buscarPacienteCodigo(rs.getInt("idPaciente")));
                dieta.setPesoInicial(rs.getFloat("pesoInicial"));
                dieta.setPesoObjetivo(rs.getFloat("pesoObjetivo"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setEstado(rs.getInt("estado"));
                dietas.add(dieta);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
        //verificacion por peso de ultima visita
        ArrayList<Dieta> dietasVeri = new ArrayList<>();
        for (Dieta re : dietas) {
            Visita uv = ultimaVisita(re.getPaciente().getIdPaciente());
            try {
                switch (check) {
                    case 1:
                        if (uv.getPeso() >= re.getPesoObjetivo() - 5 && uv.getPeso() <= re.getPesoObjetivo() + 5) {
                            dietasVeri.add(re);
                        }
                        break;
                    case 2:
                        if (uv.getPeso() < re.getPesoObjetivo() - 5 || uv.getPeso() > re.getPesoObjetivo() + 5) {
                            dietasVeri.add(re);
                        }
                        break;
                    case 3:
                    default:
                        dietasVeri.add(re);
                }
            } catch (NullPointerException e) {

            }
        }
        return dietasVeri;
    }

    private Visita ultimaVisita(int idPaciente) {
        Visita visita = null;
        String sql = "SELECT * FROM visita v where v.estado=2 and v.idPaciente=? and v.fecha=(SELECT max(fecha) from visita v2 where v2.idPaciente=v.idPaciente) and v.idVisita=(Select max(v3.idVisita) from visita v3 where v3.idPaciente=v.idPaciente)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                PacienteData pd = new PacienteData();
                visita = new Visita();
                visita.setIdVisita(rs.getInt("idVisita"));
                visita.setDieta(buscarDietaXid(rs.getInt("idDieta")));
                visita.setPaciente(pd.buscarPacienteCodigo(rs.getInt("idPaciente")));
                visita.setPeso(rs.getFloat("peso"));
                visita.setFecha(rs.getDate("fecha").toLocalDate());
                visita.setEstado(rs.getInt("estado"));
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return visita;
    }
}
