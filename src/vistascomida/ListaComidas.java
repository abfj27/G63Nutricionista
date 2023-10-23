/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistascomida;

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
public class ListaComidas extends javax.swing.JInternalFrame {

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

    public ListaComidas() {
        initComponents();
        detectorCerradoVentada();
        jTComidas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.click = 1;
        Utileria utileria = new Utileria(click);
        Cabecera();
        utileria.ordenamientoDeTabla(jTComidas);
        cargarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTingreso = new javax.swing.JTextField();
        jCbFiltrado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jRbActivos = new javax.swing.JRadioButton();
        jRbTodos = new javax.swing.JRadioButton();
        jRbInactivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTComidas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBalta = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBnuevo = new javax.swing.JButton();
        jBbaja = new javax.swing.JButton();
        jBcerrar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 500));

        jTingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTingresoKeyReleased(evt);
            }
        });

        jCbFiltrado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jCbFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbFiltradoActionPerformed(evt);
            }
        });

        jLabel1.setText("Listado de las comidas segun filtrado elegido");

        buttonGroup1.add(jRbActivos);
        jRbActivos.setText("Estados Activos");
        jRbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbActivosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRbTodos);
        jRbTodos.setText("Todos");
        jRbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRbInactivos);
        jRbInactivos.setText("Estado Inactivos");
        jRbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRbInactivosActionPerformed(evt);
            }
        });

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
        jTComidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTComidasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTComidas);

        jLabel2.setText("Seleccionar filtrado:");

        jLabel3.setText("Ingrese que buscar:");

        jBalta.setText("Alta");
        jBalta.setEnabled(false);
        jBalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBaltaActionPerformed(evt);
            }
        });

        jBmodificar.setText("Modificar");
        jBmodificar.setEnabled(false);
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });

        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });

        jBbaja.setText("Baja");
        jBbaja.setEnabled(false);
        jBbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbajaActionPerformed(evt);
            }
        });

        jBcerrar.setText("Cerrar");
        jBcerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRbActivos)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                                .addComponent(jTingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCbFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRbInactivos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                                .addComponent(jRbTodos))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBalta, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 437, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBcerrar)))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbActivos)
                    .addComponent(jRbTodos)
                    .addComponent(jRbInactivos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBalta)
                    .addComponent(jBbaja))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBnuevo)
                    .addComponent(jBmodificar)
                    .addComponent(jBcerrar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTingresoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTingresoKeyReleased
        // TODO add your handling code here:
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
        // TODO add your handling code here:
        borrarFila();
        this.estado = 2;
        Cabecera();
        obtencionDeDatos();

    }//GEN-LAST:event_jRbActivosActionPerformed

    private void jRbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbInactivosActionPerformed
        // TODO add your handling code here:
        borrarFila();
        this.estado = 1;
        Cabecera();
        obtencionDeDatos();

    }//GEN-LAST:event_jRbInactivosActionPerformed

    private void jRbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRbTodosActionPerformed
        // TODO add your handling code here:
        borrarFila();
        this.estado = 0;
        Cabecera();
        obtencionDeDatos();

    }//GEN-LAST:event_jRbTodosActionPerformed

    private void jCbFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbFiltradoActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
        filaS = jTComidas.getSelectedRow();
        jBmodificar.setEnabled(true);
        if (estado == 0) {
            if (jTComidas.getValueAt(filaS, 3) == "true") {
                jBalta.setEnabled(false);
                jBbaja.setEnabled(true);
            } else if (jTComidas.getValueAt(filaS, 3) == "false") {
                jBalta.setEnabled(true);
                jBbaja.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTComidasMouseClicked

    private void jBaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBaltaActionPerformed
        // TODO add your handling code here:
        if (filaS != -1) {
            cd.darAlta(jTComidas.getValueAt(filaS, 0).toString(), Integer.valueOf(jTComidas.getValueAt(filaS, 2).toString()));
            borrarFila();
            obtencionDeDatos();
            filaS = -1;
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jBaltaActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // TODO add your handling code here:
        if (filaS != -1) {
            comEnv = cd.buscarComida(jTComidas.getValueAt(filaS, 0).toString(), Integer.valueOf(jTComidas.getValueAt(filaS, 2).toString()));
            crear_modificar_comida cmc = new crear_modificar_comida(comEnv);
            cmc.addInternalFrameListener(internalFrameListener);
            getParent().add(cmc);
            cmc.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        crear_modificar_comida cmc = new crear_modificar_comida(comEnv);
        if (filaS != -1) {
            cmc.addInternalFrameListener(internalFrameListener);
        }
        getParent().add(cmc);
        cmc.setVisible(true);
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbajaActionPerformed
        // TODO add your handling code here:
        if (filaS != -1) {
            cd.darBaja(jTComidas.getValueAt(filaS, 0).toString(), Integer.valueOf(jTComidas.getValueAt(filaS, 2).toString()));
            borrarFila();
            obtencionDeDatos();
            filaS = -1;
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jBbajaActionPerformed

    private void jBcerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcerrarActionPerformed
        // TODO add your handling code here:
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jBcerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBalta;
    private javax.swing.JButton jBbaja;
    private javax.swing.JButton jBcerrar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JComboBox<String> jCbFiltrado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRbActivos;
    private javax.swing.JRadioButton jRbInactivos;
    private javax.swing.JRadioButton jRbTodos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTComidas;
    private javax.swing.JTextField jTingreso;
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
        jBalta.setEnabled(false);
        jBbaja.setEnabled(false);
        jBmodificar.setEnabled(false);
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
                jBbaja.setEnabled(true);
                jBmodificar.setEnabled(true);
            } else if (estado == 1) {
                jBalta.setEnabled(true);
                jBmodificar.setEnabled(true);
            }
        }
    }

//    public void ordenamientoDeTabla() {
//        //ordena la tabla segun donde le de click en la cabecera
//        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jTComidas.getModel());
//        jTComidas.setRowSorter(sorter);
//
//        jTComidas.getTableHeader().addMouseListener(new MouseAdapter() {
//
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                if (e.getClickCount() == e.getClickCount()) {
//                    int colum = jTComidas.columnAtPoint(e.getPoint());
//                    sorter.toggleSortOrder(colum);
//                    click += 1;
//                }
//            }
//        });
//    }
    private void detectorCerradoVentada() {
        internalFrameListener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                // This code will be executed when the second JInternalFrame is closed
                borrarFila();
                obtencionDeDatos();
            }
        };
    }
}
