package ramaale;

import controlDatos.DietaData;
import entidades.Dieta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;

public class ListaDietaVen extends javax.swing.JInternalFrame {

    private DefaultTableModel modeloT = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListaDietaVen() {
        initComponents();
//        cargarCombo();
        armarCabecera();
        jcBox.setSelectedIndex(-1);
//        DietaData ddata = new DietaData();
//        actualizarTabla(ddata.listaDietas());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxt = new javax.swing.JTextField();
        jcBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDieta = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();
        jbNuevaDieta = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        jbDetalle = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();

        jtxt.setText("Busqueda");
        jtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtKeyTyped(evt);
            }
        });

        jcBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Nombre Dieta", "Nombre Paciente", "Apellido Paciente" }));
        jcBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBoxActionPerformed(evt);
            }
        });

        tableDieta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableDieta);

        jbModificar.setText("Modificar Dieta");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbNuevaDieta.setText("Nueva Dieta");
        jbNuevaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaDietaActionPerformed(evt);
            }
        });

        jbEditar.setText("Editar Dieta/Comida");

        jbDetalle.setText("Ver Detalle");
        jbDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetalleActionPerformed(evt);
            }
        });

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbNuevaDieta)
                                .addGap(18, 18, 18)
                                .addComponent(jbEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCerrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbModificar)
                                .addGap(18, 18, 18)
                                .addComponent(jbDetalle)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcBox))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbDetalle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaDieta)
                    .addComponent(jbEditar)
                    .addComponent(jbCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbNuevaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaDietaActionPerformed
//        DietaData ddata = new DietaData();
        Dieta dieta = new Dieta();
        NuevaDietaVen ven = new NuevaDietaVen(dieta);
        escritorioTestAle.escritorioAl.add(ven);
        ven.toFront();
        ven.setVisible(true);
    }//GEN-LAST:event_jbNuevaDietaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (tableDieta.getSelectedRow() >= 0) {
            DietaData ddata = new DietaData();
            Dieta dieta = ddata.buscarDietaXid((int) tableDieta.getValueAt(tableDieta.getSelectedRow(), 0));
            NuevaDietaVen ven = new NuevaDietaVen(dieta);
            escritorioTestAle.escritorioAl.add(ven);
            ven.toFront();
            ven.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
//        actualizarTabla(ddata.listaDietasEnAlta());
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetalleActionPerformed
        if (tableDieta.getSelectedRow() >= 0) {
            DietaData ddata = new DietaData();
            Dieta dieta = ddata.buscarDietaXid((int) tableDieta.getValueAt(tableDieta.getSelectedRow(), 0));
            DetallesDieta ven = new DetallesDieta(dieta);
            escritorioTestAle.escritorioAl.add(ven);
            ven.toFront();
            ven.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbDetalleActionPerformed

    private void jcBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBoxActionPerformed
        DietaData ddata = new DietaData();
        if (jcBox.getSelectedIndex() == 0) {
            actualizarTabla(ddata.listaDietasEnAlta());
        } else if (!jtxt.getText().equals("Busqueda")) {
            System.out.println("filtro: " + jcBox.getSelectedIndex() + ", buscando: " + jtxt.getText());
            //comando para buscar
            actualizarTabla(ddata.listaDietas2(jtxt.getText(), jcBox.getSelectedIndex()));
        }
    }//GEN-LAST:event_jcBoxActionPerformed

    private void jtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtKeyTyped
        if (jtxt.getText().equals("Busqueda")) {
            jtxt.setText("");
        }
    }//GEN-LAST:event_jtxtKeyTyped

    private void jtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtKeyReleased
        DietaData ddata = new DietaData();
        if (jcBox.getSelectedIndex() <= 0) {
            //no pasa nada
        } else {
            System.out.println("filtro: " + jcBox.getSelectedIndex() + ", buscando: " + jtxt.getText());
            //comando para buscar
            actualizarTabla(ddata.listaDietas2(jtxt.getText(), jcBox.getSelectedIndex()));
        }
    }//GEN-LAST:event_jtxtKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbDetalle;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevaDieta;
    private javax.swing.JComboBox<String> jcBox;
    private javax.swing.JTextField jtxt;
    private javax.swing.JTable tableDieta;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla(List<Dieta> lista) {
        borrarFilas();
        for (Dieta dieta : lista) {
            modeloT.addRow(new Object[]{
                dieta.getIdDieta(),
                dieta.getNombre(),
                dieta.getPaciente().getApellido() + ", " + dieta.getPaciente().getNombre(),
                dieta.getPesoInicial(),
                dieta.getPesoObjetivo(),
                dieta.getFechaInicial(),
                dieta.getFechaFinal()
            });
        }
    }

    private void armarCabecera() {
        modeloT.addColumn("Codigo");
        modeloT.addColumn("Dieta");
        modeloT.addColumn("Paciente");
        modeloT.addColumn("Peso Inicial");
        modeloT.addColumn("Peso Objetivo");
        modeloT.addColumn("Fecha Inicial");
        modeloT.addColumn("Fecha Final");
        tableDieta.setModel(modeloT);
    }

    private void borrarFilas() {
        int f = tableDieta.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloT.removeRow(f);
        }
    }

//    private void cargarCombo() {
//        jcBox.addItem("Todas");
//        jcBox.addItem("Nombre Dieta");
//        jcBox.addItem("Nombre Paciente");
//        jcBox.addItem("Apellido Paciente");
//
//        jcBox.setSelectedIndex(-1);
//    }
//
} // llave final
