package controlDatos;

import java.sql.Connection;

public class ComidaData {

    private Connection conec;

    public ComidaData() {
        conec = Conexion.getConexion();
    }
}
