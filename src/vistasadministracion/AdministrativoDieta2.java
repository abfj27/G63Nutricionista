package vistasadministracion;

import controlDatos.DietaData;
import entidades.Dieta;
import java.awt.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import stuff.Utileria;
import vistas01.EscritorioColor2;
import vistasdieta.DetallesDieta;

/**
 *
 * @author Equipo
 */
public class AdministrativoDieta2 extends javax.swing.JInternalFrame {

    private int mouseX, mouseY;
    private Dieta dietEnv;
    private int click;
    private int filaS = -1;
    private int estado;
    private DietaData dd = new DietaData();
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public AdministrativoDieta2() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.click = 1;
        Utileria utileria = new Utileria(click);
        Cabecera();
        utileria.ordenamientoDeTabla(jTdietas);
        cargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTingreso = new javax.swing.JTextField();
        jCbFiltrado = new javax.swing.JComboBox<>();
        jRbActivos = new javax.swing.JRadioButton();
        jRbTodos = new javax.swing.JRadioButton();
        jRbInactivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTdietas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbCerrar1 = new rsbuttom.RSButtonMetro();
        jbVer = new rsbuttom.RSButtonMetro();
        jbEliminar = new rsbuttom.RSButtonMetro();
        jbAltaBaja = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin. Dietas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setPreferredSize(new java.awt.Dimension(730, 500));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jTingreso.setBackground(new java.awt.Color(246, 246, 246));
        jTingreso.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTingreso.setForeground(new java.awt.Color(59, 107, 65));
        jTingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(154, 179, 155), 2));
        jTingreso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTingreso.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jTingreso.setSelectionColor(new java.awt.Color(130, 186, 137));
        jTingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTingresoKeyReleased(evt);
            }
        });

        jCbFiltrado.setBackground(new java.awt.Color(246, 246, 246));
        jCbFiltrado.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jCbFiltrado.setForeground(new java.awt.Color(59, 107, 65));
        jCbFiltrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jCbFiltrado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 2, true));
        jCbFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbFiltradoActionPerformed(evt);
            }
        });

        jRbActivos.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jRbActivos);
        jRbActivos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRbActivos.setForeground(new java.awt.Color(41, 65, 43));
        jRbActivos.setText("Estados True (1y2)");
        jRbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbActivosActionPerformed(evt);
            }
        });

        jRbTodos.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jRbTodos);
        jRbTodos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRbTodos.setForeground(new java.awt.Color(41, 65, 43));
        jRbTodos.setText("Todos");
        jRbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbTodosActionPerformed(evt);
            }
        });

        jRbInactivos.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jRbInactivos);
        jRbInactivos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRbInactivos.setForeground(new java.awt.Color(41, 65, 43));
        jRbInactivos.setText("Estado false(0)");
        jRbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbInactivosActionPerformed(evt);
            }
        });

        jTdietas.setBackground(new java.awt.Color(227, 238, 228));
        jTdietas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTdietas.setForeground(new java.awt.Color(41, 65, 43));
        jTdietas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTdietas.setGridColor(new java.awt.Color(59, 107, 65));
        jTdietas.setSelectionBackground(new java.awt.Color(59, 107, 65));
        jTdietas.setSelectionForeground(new java.awt.Color(130, 186, 137));
        jTdietas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTdietasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTdietas);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 65, 43));
        jLabel2.setText("Segun Filtro:");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Ingrese que buscar:");

        jbCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jbCerrar1.setText("CERRAR");
        jbCerrar1.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbCerrar1.setFocusPainted(false);
        jbCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar1ActionPerformed(evt);
            }
        });

        jbVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver2.png"))); // NOI18N
        jbVer.setText("VER");
        jbVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerActionPerformed(evt);
            }
        });

        jbEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        jbEliminar.setText("ELIMINAR");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbAltaBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/altabaja.png"))); // NOI18N
        jbAltaBaja.setText("ALTA/BAJA");
        jbAltaBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRbActivos)
                                .addGap(80, 80, 80)
                                .addComponent(jRbInactivos))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(jRbTodos))
                            .addComponent(jCbFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbAltaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCbFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRbActivos)
                    .addComponent(jRbInactivos)
                    .addComponent(jRbTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAltaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTingresoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTingresoKeyReleased
        borrarFila();
        try {
            if (jCbFiltrado.getSelectedIndex() == 0) {
                Utileria.mensaje("Debe seleccionar una categoria para filtrar");
            } else {
                if (jRbActivos.isSelected() || jRbInactivos.isSelected() || jRbTodos.isSelected()) {
                    if (jRbActivos.isSelected()) {
                        this.estado = 2;
                    } else if (jRbInactivos.isSelected()) {
                        this.estado = 1;
                    } else {
                        this.estado = 0;
                    }
                    obtencionDeDatos();
                }
            }
        } catch (NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_jTingresoKeyReleased

    private void jRbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbActivosActionPerformed
        borrarFila();
        this.estado = 2;
        this.filaS = -1;
        Cabecera();
        obtencionDeDatos();
    }//GEN-LAST:event_jRbActivosActionPerformed

    private void jRbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbInactivosActionPerformed
        borrarFila();
        this.estado = 1;
        this.filaS = -1;
        Cabecera();
        obtencionDeDatos();
    }//GEN-LAST:event_jRbInactivosActionPerformed

    private void jRbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbTodosActionPerformed
        borrarFila();
        this.estado = 0;
        this.filaS = -1;
        Cabecera();
        obtencionDeDatos();
    }//GEN-LAST:event_jRbTodosActionPerformed

    private void jCbFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbFiltradoActionPerformed
        borrarFila();
        try {
            if (jRbActivos.isSelected() || jRbInactivos.isSelected() || jRbTodos.isSelected()) {
                if (jRbActivos.isSelected()) {
                    this.estado = 2;
                } else if (jRbInactivos.isSelected()) {
                    this.estado = 1;
                } else {
                    this.estado = 0;
                }
            }
            if (jCbFiltrado.getSelectedIndex() != 0 && !jRbActivos.isSelected() && !jRbInactivos.isSelected()) {
                jRbTodos.setSelected(true);
            }
            obtencionDeDatos();
            if (jCbFiltrado.getSelectedIndex() == 0) {
                buttonGroup1.clearSelection();
                jTingreso.setText("");
                borrarFila();
            }
        } catch (NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_jCbFiltradoActionPerformed

    private void jTdietasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTdietasMouseClicked
        filaS = jTdietas.getSelectedRow();
        if (estado != 1) {
            jbEliminar.setEnabled(true);
            jbVer.setEnabled(true);
        }
        if (estado == 0) {
            if (jTdietas.getValueAt(filaS, 6) == "true" || jTdietas.getValueAt(filaS, 6) == "false") {
                jbAltaBaja.setEnabled(true);
                jbEliminar.setEnabled(true);
            } else if (jTdietas.getValueAt(filaS, 6) == "eliminado") {
                jbAltaBaja.setEnabled(true);
                jbEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTdietasMouseClicked

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

    private void jbVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerActionPerformed
        if (filaS != -1) {
            dietEnv = dd.AdminBuscarXDniYFechas(Integer.valueOf(jTdietas.getValueAt(filaS, 2).toString()), LocalDate.parse(String.valueOf(jTdietas.getValueAt(filaS, 4))), LocalDate.parse(String.valueOf(jTdietas.getValueAt(filaS, 5))));
            DetallesDieta dd = new DetallesDieta(dietEnv);
            EscritorioColor2.escritorio.add(dd);
            dd.toFront();
            dd.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbVerActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int[] filasS = jTdietas.getSelectedRows();
        if (filaS != -1) {
            for (Integer re : filasS) {
                dd.adminEliminar(Integer.valueOf(jTdietas.getValueAt(re, 2).toString()), LocalDate.parse(jTdietas.getValueAt(re, 4).toString()), LocalDate.parse(jTdietas.getValueAt(re, 5).toString()));
            }
            borrarFila();
            obtencionDeDatos();
            filaS = -1;
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaBajaActionPerformed
        int[] filasS = jTdietas.getSelectedRows();
        if (filaS != -1) {
            for (Integer re : filasS) {
                if (estado == 1 || jTdietas.getValueAt(re, 6) == "false" || jTdietas.getValueAt(re, 6) == "eliminado") {
                    dd.adminDarAlta(Integer.valueOf(jTdietas.getValueAt(re, 2).toString()), LocalDate.parse(jTdietas.getValueAt(re, 4).toString()), LocalDate.parse(jTdietas.getValueAt(re, 5).toString()));
                } else if (jTdietas.getValueAt(re, 6) == "true") {
                    dd.adminDarBaja(Integer.valueOf(jTdietas.getValueAt(re, 2).toString()), LocalDate.parse(jTdietas.getValueAt(re, 4).toString()), LocalDate.parse(jTdietas.getValueAt(re, 5).toString()));
                }
            }
            borrarFila();
            obtencionDeDatos();
            filaS = -1;
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbAltaBajaActionPerformed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            mouseX = evt.getX();
            mouseY = evt.getY();
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(getLocation().x + evt.getX() - mouseX, getLocation().y + evt.getY() - mouseY);
    }//GEN-LAST:event_formMouseDragged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jCbFiltrado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRbActivos;
    private javax.swing.JRadioButton jRbInactivos;
    private javax.swing.JRadioButton jRbTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTdietas;
    private javax.swing.JTextField jTingreso;
    private rsbuttom.RSButtonMetro jbAltaBaja;
    private rsbuttom.RSButtonMetro jbCerrar1;
    private rsbuttom.RSButtonMetro jbEliminar;
    private rsbuttom.RSButtonMetro jbVer;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox() {
        jCbFiltrado.addItem("nombre dieta");
        jCbFiltrado.addItem("nombre paciente");
        jCbFiltrado.addItem("dni paciente");
    }

    private void borrarFila() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void Cabecera() {
        modelo.setColumnCount(0);
        if (estado == 1) {
            modelo.addColumn("Nombre Dieta");
            modelo.addColumn("Paciente");
            modelo.addColumn("DNI");
            modelo.addColumn("Ultima Visita");
            modelo.addColumn("Fecha Inicial");
            modelo.addColumn("Fecha Final");
            jTdietas.setModel(modelo);
        } else {
            modelo.addColumn("Nombre Dieta");
            modelo.addColumn("Paciente");
            modelo.addColumn("DNI");
            modelo.addColumn("Ultima Visita");
            modelo.addColumn("Fecha Inicial");
            modelo.addColumn("Fecha Final");
            modelo.addColumn("Estado");
            jTdietas.setModel(modelo);
        }
    }

    private void obtencionDeDatos() {
        String estadoImp;
        jbAltaBaja.setEnabled(false);
        jbEliminar.setEnabled(false);
        String seleccion = jCbFiltrado.getSelectedItem().toString();
        String ingreso = jTingreso.getText();
        ArrayList<Dieta> dietas = dd.adminDieta(seleccion, ingreso, (estado - 1));
        if (!dietas.isEmpty()) {
            for (Dieta recorrer : dietas) {
                if (recorrer.getEstado() == 2) {
                    estadoImp = "true";
                } else if (recorrer.getEstado() == 1) {
                    estadoImp = "false";
                } else {
                    estadoImp = "eliminado";
                }
                if (estado != 1) {
                    modelo.addRow(new Object[]{recorrer.getNombre(), recorrer.getPaciente().getNombre(), recorrer.getPaciente().getDni(), recorrer.getFechaUltimaVisita(), recorrer.getFechaInicial(), recorrer.getFechaFinal(), estadoImp});
                } else {
                    modelo.addRow(new Object[]{recorrer.getNombre(), recorrer.getPaciente().getNombre(), recorrer.getPaciente().getDni(), recorrer.getFechaUltimaVisita(), recorrer.getFechaInicial(), recorrer.getFechaFinal()});
                }
                ajustarTabla(jTdietas);
            }
            if (estado == 2) {
                jbAltaBaja.setEnabled(true);
                jbEliminar.setEnabled(true);
            } else if (estado == 1) {
                jbAltaBaja.setEnabled(true);
                jbEliminar.setEnabled(false);
            }
        }
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
}
