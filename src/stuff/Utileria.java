package stuff;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;

public class Utileria {
    
    public static void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static LocalDate convertirLocalDate(Date d) {
        LocalDate fn = null;
        if (d != null) {
            Instant instant = d.toInstant();
            ZoneId zonaHoraria = ZoneId.systemDefault();
            fn = instant.atZone(zonaHoraria).toLocalDate();
        }
        return fn;
    }

    public static Date convertirDate(LocalDate ld) {
        Date date = null;
        if (ld != null) {
            return java.sql.Date.valueOf(ld);
        } else {
            return date;
        }
    }

    //
}
