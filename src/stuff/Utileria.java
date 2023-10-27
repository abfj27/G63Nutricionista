package stuff;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Enumeration;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
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

    public static void ajustarTabla(JTable tabla) {
        Enumeration<TableColumn> columna = tabla.getColumnModel().getColumns();
        while (columna.hasMoreElements()) {
            ajustarColumnas(columna.nextElement(), tabla);
        }
    }

    private static void ajustarColumnas(TableColumn columna, JTable tabla) {
       int max = 0;

        TableCellRenderer render = tabla.getTableHeader().getDefaultRenderer();
        Component cabeza = render.getTableCellRendererComponent(tabla, columna.getHeaderValue(), false, false, 0, 0);
        max = Math.max(max, cabeza.getPreferredSize().width);

        for (int fila = 0; fila < tabla.getRowCount(); fila++) {
            TableCellRenderer render2 = tabla.getCellRenderer(fila, columna.getModelIndex());
            Component celda = render2.getTableCellRendererComponent(tabla, tabla.getValueAt(fila, columna.getModelIndex()), false, false, fila, columna.getModelIndex());
            max = Math.max(max, celda.getPreferredSize().width);
        }

        columna.setPreferredWidth(max);
    }

    public static void centrarInternalFrame(JDesktopPane escritorio, JInternalFrame ventana) {
        Dimension dts = escritorio.getSize();
        Dimension fs = ventana.getSize();
        ventana.setLocation((dts.width - fs.width) / 2, (dts.height - fs.height) / 2);
        ventana.show();
    }
    
     public static void fondo(JDesktopPane escritorio, JInternalFrame ventana, ImageIcon icono) {
        escritorio.removeAll();
        escritorio.repaint();
        ventana.setVisible(true);
        JLabel fondo = new JLabel(icono);
        fondo.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
        escritorio.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
        escritorio.add(ventana);
        escritorio.moveToFront(ventana);
        Utileria.centrarInternalFrame(escritorio, ventana);
    }
     
    //
}
