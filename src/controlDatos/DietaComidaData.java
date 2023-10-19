package controlDatos;

import entidades.Comida;
import entidades.Dieta;
import entidades.DietaComida;
import entidades.Horario;
import entidades.Porcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import stuff.Utileria;

public class DietaComidaData {

    private Connection conec;

    public DietaComidaData() {
        conec = Conexion.getConexion();
    }

    public void cargarDietaComida(DietaComida dc) {
        String sql = "INSERT INTO dietacomida (idComida, idDieta, horario, porcion, estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getComida().getIdComida());
            ps.setInt(2, dc.getDieta().getIdDieta());
            ps.setString(3, String.valueOf(dc.getHorario()));
            ps.setString(4, String.valueOf(dc.getPorcion()));
            ps.setInt(5, dc.getEstado());
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
        String sql = "UPDATE dietacomida SET idComida=?, idDieta=?, horario=?, porcion=?, estado=? WHERE idDC=? ";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, dc.getComida().getIdComida());
            ps.setInt(2, dc.getDieta().getIdDieta());
            ps.setString(3, String.valueOf(dc.getHorario()));
            ps.setString(4, String.valueOf(dc.getPorcion()));
            ps.setInt(5, dc.getEstado());
            ps.setInt(6, dc.getIdDC());
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

    public void eliminarDietaComida(int idDietaComida) {
        String sql = "DELETE FROM `dietacomida` WHERE idDC = ?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idDietaComida);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public DietaComida buscarDC(int idDieta, int idComida) {
        DietaComida dc = new DietaComida();
        ComidaData cdata = new ComidaData();
        DietaData ddata = new DietaData();
        String sql = "SELECT * FROM dietacomida WHERE idComida = ? AND idDieta = ?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(2, idDieta);
            ps.setInt(1, idComida);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Comida comida = cdata.buscarComida(rs.getInt(1));
                Dieta dieta = ddata.buscarDietaXid(rs.getInt(2));
                dc.setComida(comida);
                dc.setDieta(dieta);
                dc.setHorario(Horario.valueOf(rs.getString(3)));
                dc.setPorcion(Porcion.valueOf(rs.getString(4)));
                dc.setIdDC(rs.getInt(5));
                dc.setEstado(rs.getInt(6));
            } else {
                Utileria.mensaje("No se encontro DATO. 'error.116'");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DietaComidaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dc;
    }

    public List<DietaComida> listaComidasEnDieta(int idDieta) {
        List<DietaComida> lista = new ArrayList<>();
        ComidaData cdata = new ComidaData();
        DietaData ddata = new DietaData();
        String sql = "SELECT * FROM dietacomida WHERE idDieta = ?";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DietaComida cd = new DietaComida();
                Comida comida = cdata.buscarComida(rs.getInt(1));
                Dieta dieta = ddata.buscarDietaXid(rs.getInt(2));
                cd.setComida(comida);
                cd.setDieta(dieta);
                cd.setHorario(Horario.valueOf(rs.getString(3)));
                cd.setPorcion(Porcion.valueOf(rs.getString(4)));
                cd.setIdDC(rs.getInt(5));
                cd.setEstado(rs.getInt(6));
                lista.add(cd);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Comida> listaComidasNoEnDieta(int idDieta) {
        List<Comida> lista = new ArrayList<>();
        String sql = "SELECT * from comida where estado=2 and idComida not in (SELECT idComida from dietacomida where idDieta=?)";
        try {
            PreparedStatement ps = conec.prepareStatement(sql);
            ps.setInt(1, idDieta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                comida.setNombre(rs.getString(1));
                comida.setDetalle(rs.getString(2));
                comida.setCalorias(rs.getInt(3));
                comida.setIdComida(rs.getInt(4));
                comida.setEstado(rs.getInt(5));
                lista.add(comida);
            }
            rs.close();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
