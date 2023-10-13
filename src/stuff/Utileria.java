package stuff;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Utileria {
    private int cont;

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

    public Utileria(int cont) {
        this.cont = cont;
    }

    public void ordenamientoDeTabla(JTable nombre) {
        //ordena la tabla segun donde le de click en la cabecera
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(nombre.getModel());
        nombre.setRowSorter(sorter);

        nombre.getTableHeader().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                
                if (e.getClickCount() == cont) {
                    int colum = nombre.columnAtPoint(e.getPoint());
                    sorter.toggleSortOrder(colum);
                    cont += 1;
                }
            }
        });
    }

    //
}
