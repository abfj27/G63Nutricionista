package controlDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

private static String url = "jdbc:mariadb://localhost/g63.nutricionista";    // cambiar nombre a base de datos: todo lo de la ultima barra /
private static String usuario = "root";
private static String password = "";
private static Conexion conexion;// = null;


private Conexion (){
    try {
        Class.forName("org.mariadb.jdbc.Driver");
    } catch (ClassNotFoundException ex) {
        mensaje("Error en cargar Drivers");
    }
}

    public static Connection getConexion() {
        Connection conec = null;
        
        if(conexion == null){
            conexion = new Conexion();
        }
        
        try {
            conec = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"+ "&user=" + usuario + "&password="+password);
        } catch (SQLException ex) {
            mensaje("error de conexion");
    }
        return conec;
    }

    private static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
