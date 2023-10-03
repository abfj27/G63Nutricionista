package controlDatos;

import java.sql.Connection;

public class DietaComidaData {
 private Connection conec;

    public DietaComidaData() {
        conec = Conexion.getConexion();
    }
}
