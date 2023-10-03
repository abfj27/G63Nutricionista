package controlDatos;

import java.sql.Connection;

public class DietaData {

    private Connection conec;

    public DietaData() {
        conec = Conexion.getConexion();
    }
}
