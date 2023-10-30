package vistas02;

import controlDatos.ComidaData;
import entidades.Comida;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;

/**
 *
 * @author Equipo
 */
public class ListaComidas2 extends javax.swing.JInternalFrame {

    private int mouseX, mouseY;
    private InternalFrameListener internalFrameListener;
    private Comida comEnv;
    private int click;
    private int filaS = -1;
    private int estado;
    private ComidaData cd = new ComidaData();
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListaComidas2() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        detectorCerradoVentada();
        jTComidas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.click = 1;
        Utileria utileria = new Utileria(click);
        Cabecera();
        utileria.ordenamientoDeTabla(jTComidas);
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
        jTComidas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbCerrar1 = new vistas02rsbuttom.RSButtonMetro();
        jbModificar = new vistas02rsbuttom.RSButtonMetro();
        jbBaja = new vistas02rsbuttom.RSButtonMetro();
        jbAlta = new vistas02rsbuttom.RSButtonMetro();
        jbNuevo = new vistas02rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Comidas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(41, 65, 43))); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 500));
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
        jTingreso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
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
        jCbFiltrado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCbFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbFiltradoActionPerformed(evt);
            }
        });

        jRbActivos.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jRbActivos);
        jRbActivos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRbActivos.setForeground(new java.awt.Color(41, 65, 43));
        jRbActivos.setText("Estados Activos");
        jRbActivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRbActivos.setFocusPainted(false);
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
        jRbTodos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRbTodos.setFocusPainted(false);
        jRbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbTodosActionPerformed(evt);
            }
        });

        jRbInactivos.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jRbInactivos);
        jRbInactivos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRbInactivos.setForeground(new java.awt.Color(41, 65, 43));
        jRbInactivos.setText("Estado Inactivos");
        jRbInactivos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRbInactivos.setFocusPainted(false);
        jRbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbInactivosActionPerformed(evt);
            }
        });

        jTComidas.setBackground(new java.awt.Color(227, 238, 228));
        jTComidas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTComidas.setForeground(new java.awt.Color(41, 65, 43));
        jTComidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jTComidas.setGridColor(new java.awt.Color(59, 107, 65));
        jTComidas.setSelectionBackground(new java.awt.Color(59, 107, 65));
        jTComidas.setSelectionForeground(new java.awt.Color(130, 186, 137));
        jTComidas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTComidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTComidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTComidas);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 65, 43));
        jLabel2.setText("Seleccionar filtrado:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
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

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbBaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jbBaja.setText("BAJA");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jbAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aceptar.png"))); // NOI18N
        jbAlta.setText("ALTA");
        jbAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAltaActionPerformed(evt);
            }
        });

        jbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar verde.png"))); // NOI18N
        jbNuevo.setText("NUEVO");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRbActivos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCbFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRbInactivos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRbTodos))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbActivos)
                    .addComponent(jRbTodos)
                    .addComponent(jRbInactivos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
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
        Cabecera();
        obtencionDeDatos();
    }//GEN-LAST:event_jRbActivosActionPerformed

    private void jRbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbInactivosActionPerformed
        borrarFila();
        this.estado = 1;
        Cabecera();
        obtencionDeDatos();
    }//GEN-LAST:event_jRbInactivosActionPerformed

    private void jRbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbTodosActionPerformed
        borrarFila();
        this.estado = 0;
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

    private void jTComidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTComidasMouseClicked
        filaS = jTComidas.getSelectedRow();
        jbModificar.setEnabled(true);
        if (estado == 0) {
            if (jTComidas.getValueAt(filaS, 3) == "true") {
                jbAlta.setEnabled(false);
                jbBaja.setEnabled(true);
            } else if (jTComidas.getValueAt(filaS, 3) == "false") {
                jbAlta.setEnabled(true);
                jbBaja.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTComidasMouseClicked

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

    private void jbAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaActionPerformed
         if (jTComidas.getSelectedRow() >= 0) {
            cd.darBaja(jTComidas.getValueAt(jTComidas.getSelectedRow(), 0).toString(), Integer.valueOf(jTComidas.getValueAt(jTComidas.getSelectedRow(), 2).toString()));
           cd.darAlta(jTComidas.getValueAt(jTComidas.getSelectedRow(), 0).toString(), Integer.valueOf(jTComidas.getValueAt(jTComidas.getSelectedRow(), 2).toString()));
            borrarFila();
            obtencionDeDatos();
        }else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbAltaActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        if (jTComidas.getSelectedRow() >= 0) {
            cd.darBaja(jTComidas.getValueAt(jTComidas.getSelectedRow(), 0).toString(), Integer.valueOf(jTComidas.getValueAt(jTComidas.getSelectedRow(), 2).toString()));
            borrarFila();
            obtencionDeDatos();
        }else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        comEnv = null;
        crear_modificar_comida2 cmc = new crear_modificar_comida2(comEnv);
        if (filaS != -1) {
            filaS = 0;
            if (filaS == 0 || jTComidas.getModel().getRowCount() != 0) {
                cmc.addInternalFrameListener(internalFrameListener);
            }
        }
        getParent().add(cmc);
        cmc.setVisible(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (filaS != -1) {
            comEnv = cd.buscarComida(jTComidas.getValueAt(filaS, 0).toString(), Integer.valueOf(jTComidas.getValueAt(filaS, 2).toString()));
            crear_modificar_comida2 cmc = new crear_modificar_comida2(comEnv);
            cmc.addInternalFrameListener(internalFrameListener);
            getParent().add(cmc);
            cmc.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

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
    private javax.swing.JTable jTComidas;
    private javax.swing.JTextField jTingreso;
    private vistas02rsbuttom.RSButtonMetro jbAlta;
    private vistas02rsbuttom.RSButtonMetro jbBaja;
    private vistas02rsbuttom.RSButtonMetro jbCerrar1;
    private vistas02rsbuttom.RSButtonMetro jbModificar;
    private vistas02rsbuttom.RSButtonMetro jbNuevo;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox() {
        jCbFiltrado.addItem("nombre");
        jCbFiltrado.addItem("detalle");
        jCbFiltrado.addItem("calorias mayor a");
        jCbFiltrado.addItem("calorias menor a");
    }

    private void borrarFila() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void Cabecera() {
        modelo.setColumnCount(0);
        if (estado != 0) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Detalle");
            modelo.addColumn("Calorias");
            jTComidas.setModel(modelo);
        } else {
            modelo.addColumn("Nombre");
            modelo.addColumn("Detalle");
            modelo.addColumn("Calorias");
            modelo.addColumn("Estado");
            jTComidas.setModel(modelo);
        }

    }

    private void obtencionDeDatos() {
        String estadoImp;
        jbAlta.setEnabled(false);
        jbBaja.setEnabled(false);
        jbModificar.setEnabled(false);
        String seleccion = jCbFiltrado.getSelectedItem().toString();
        if (seleccion.equals("calorias mayor a")) {
            seleccion = "calorias1";
        } else if (seleccion.equals("calorias menor a")) {
            seleccion = "calorias2";
        }
        String ingreso = jTingreso.getText();
        ArrayList<Comida> comidas = cd.listaComidas(seleccion, ingreso, estado);
        if (!comidas.isEmpty()) {
            for (Comida recorrer : comidas) {
                if (recorrer.getEstado() == 2) {
                    estadoImp = "true";
                } else {
                    estadoImp = "false";
                }
                if (estado == 0) {
                    modelo.addRow(new Object[]{recorrer.getNombre(), recorrer.getDetalle(), recorrer.getCalorias(), estadoImp});
                } else {
                    modelo.addRow(new Object[]{recorrer.getNombre(), recorrer.getDetalle(), recorrer.getCalorias()});
                }
            }
            if (estado == 2) {
                jbBaja.setEnabled(true);
                jbModificar.setEnabled(true);
            } else if (estado == 1) {
                jbAlta.setEnabled(true);
                jbModificar.setEnabled(true);
            }
        }
    }

    private void detectorCerradoVentada() {
        internalFrameListener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                borrarFila();
                obtencionDeDatos();
            }
        };
    }
}
