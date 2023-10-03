package controlDatos;

import java.sql.Connection;

public class VisitaData {
 private Connection conec;

    public VisitaData() {
        conec = Conexion.getConexion();
    }
}
