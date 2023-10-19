package vistas2;

import controlDatos.ComidaData;
import controlDatos.DietaComidaData;
import controlDatos.DietaData;
import entidades.Comida;
import entidades.Dieta;
import entidades.DietaComida;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.plaf.basic.BasicListUI;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;
import vistas01.Escritorio0;
import vistasdieta.NuevaDietaVen;

public class ModificarComidaEnDieta extends javax.swing.JInternalFrame {

    private InternalFrameListener internalFrameListener;

    private DefaultTableModel modeloD = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private DefaultTableModel modeloC = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    private Dieta dietaV;

    public ModificarComidaEnDieta() {
        initComponents();
    }

    public ModificarComidaEnDieta(Dieta dieta) {
        detectorCerradoVentada();
        initComponents();
        dietaV = dieta;
        jlNombreDieta.setText(dietaV.getNombre());
        armarCabecera();
        cargarTablas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlNombreDieta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtComidasEnDieta = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtListaDeComidas = new javax.swing.JTable();
        jbSacarDe = new javax.swing.JButton();
        jbAgregarA = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbVerDetalle = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("Nombre de Dieta: ");

        jlNombreDieta.setText("txtLabel");

        jtComidasEnDieta.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtComidasEnDieta);

        jtListaDeComidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jtListaDeComidas);

        jbSacarDe.setText(">>");
        jbSacarDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSacarDeActionPerformed(evt);
            }
        });

        jbAgregarA.setText("<<");
        jbAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAActionPerformed(evt);
            }
        });

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbVerDetalle.setText("Ver Detalle");
        jbVerDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerDetalleActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel3.setText("Comidas en Dieta:");

        jLabel4.setText("Lista de Comidas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jlNombreDieta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jbModificar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbVerDetalle))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbSacarDe)
                                    .addComponent(jbAgregarA))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 183, Short.MAX_VALUE)
                                .addComponent(jbCerrar)
                                .addContainerGap())
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlNombreDieta))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jbSacarDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAgregarA)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbCerrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbVerDetalle)
                        .addComponent(jbModificar)))
                .addContainerGap(7, Short.MAX_VALUE))
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

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jtComidasEnDieta.getSelectedRow() >= 0) {
            ComidaData cdata = new ComidaData();
            String nombre = (String) jtComidasEnDieta.getValueAt(jtComidasEnDieta.getSelectedRow(), 0);
            int calorias = (int) jtComidasEnDieta.getValueAt(jtComidasEnDieta.getSelectedRow(), 3);
            Comida com = cdata.buscarComida(nombre, calorias);
            //
            ModificarDietaComida ven = new ModificarDietaComida(dietaV.getIdDieta(), com.getIdComida());
            ven.addInternalFrameListener(internalFrameListener);
            Escritorio0.escritorio.add(ven);
            ven.toFront();
            ven.setVisible(true);
            //
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla 'Comidas en Dieta'");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbVerDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerDetalleActionPerformed
        ComidaData cdata = new ComidaData();
        if (jtComidasEnDieta.getSelectedRow() >= 0) {
            String nombre = (String) jtComidasEnDieta.getValueAt(jtComidasEnDieta.getSelectedRow(), 0);
            int calorias = (int) jtComidasEnDieta.getValueAt(jtComidasEnDieta.getSelectedRow(), 3);
            Comida com = cdata.buscarComida(nombre, calorias);
            Utileria.mensaje(com.getDetalle());
        } else if (jtListaDeComidas.getSelectedRow() >= 0) {
            String nombre = (String) jtListaDeComidas.getValueAt(jtListaDeComidas.getSelectedRow(), 0);
            int calorias = (int) jtListaDeComidas.getValueAt(jtListaDeComidas.getSelectedRow(), 1);
            Comida com = cdata.buscarComida(nombre, calorias);
            Utileria.mensaje(com.getDetalle());
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbVerDetalleActionPerformed

    private void jbAgregarAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarAActionPerformed
        if (jtListaDeComidas.getSelectedRow() >= 0) {
            ComidaData cdata = new ComidaData();
            String nombre = (String) jtListaDeComidas.getValueAt(jtListaDeComidas.getSelectedRow(), 0);
            int calorias = (int) jtListaDeComidas.getValueAt(jtListaDeComidas.getSelectedRow(), 1);
            Comida com = cdata.buscarComida(nombre, calorias);
            DietaComida dc = new DietaComida();
            dc.setComida(com);
            dc.setDieta(dietaV);
            dc.setEstado(2);
            //
            ModificarDietaComida ven = new ModificarDietaComida(dc);
            ven.addInternalFrameListener(internalFrameListener);
            Escritorio0.escritorio.add(ven);
            ven.toFront();
            ven.setVisible(true);
            //
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbAgregarAActionPerformed

    private void jbSacarDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSacarDeActionPerformed
        if (jtComidasEnDieta.getSelectedRow() >= 0) {
            DietaComidaData dcdata = new DietaComidaData();
            ComidaData cdata = new ComidaData();
            String nombre = (String) jtComidasEnDieta.getValueAt(jtComidasEnDieta.getSelectedRow(), 0);
            int calorias = (int) jtComidasEnDieta.getValueAt(jtComidasEnDieta.getSelectedRow(), 3);
            Comida com = cdata.buscarComida(nombre, calorias);
            dcdata.eliminarDietaComida(dcdata.buscarDC(dietaV.getIdDieta(), com.getIdComida()).getIdDC());
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
        borrarFilas();
        cargarTablas();
    }//GEN-LAST:event_jbSacarDeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAgregarA;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSacarDe;
    private javax.swing.JButton jbVerDetalle;
    private javax.swing.JLabel jlNombreDieta;
    private javax.swing.JTable jtComidasEnDieta;
    private javax.swing.JTable jtListaDeComidas;
    // End of variables declaration//GEN-END:variables

    private void cargarTablas() {
        DietaComidaData dcd = new DietaComidaData();
        for (DietaComida dc : dcd.listaComidasEnDieta(dietaV.getIdDieta())) {
            modeloD.addRow(new Object[]{
                dc.getComida().getNombre(),
                dc.getHorario(),
                dc.getPorcion(),
                dc.getComida().getCalorias()
            });
        }
        for (Comida comida : dcd.listaComidasNoEnDieta(dietaV.getIdDieta())) {
            modeloC.addRow(new Object[]{
                comida.getNombre(),
                comida.getCalorias()
            });
        }
    }

//    private void cargarTablasD() {
//        DietaComidaData dcd = new DietaComidaData();
//        for (DietaComida dc : dcd.listaComidasEnDieta(dietaV.getIdDieta())) {
//            modeloD.addRow(new Object[]{
//                dc.getComida().getNombre(),
//                dc.getHorario(),
//                dc.getPorcion(),
//                dc.getComida().getCalorias()
//            });
//        }
//    }
//
//    private void cargarTablasC() {
//        DietaComidaData dcd = new DietaComidaData();
//        for (Comida comida : dcd.listaComidasNoEnDieta(dietaV.getIdDieta())) {
//            modeloC.addRow(new Object[]{
//                comida.getNombre(),
//                comida.getCalorias()
//            });
//        }
//    }
    private void armarCabecera() {
        modeloC.addColumn("Nombre");
        modeloC.addColumn("Calorias");
        jtListaDeComidas.setModel(modeloC);
        jtListaDeComidas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modeloD.addColumn("Nombre");
        modeloD.addColumn("Horario");
        modeloD.addColumn("Porcion");
        modeloD.addColumn("Calorias");
        jtComidasEnDieta.setModel(modeloD);
        jtComidasEnDieta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jtListaDeComidas.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                jtComidasEnDieta.clearSelection();
            }
        });
        jtComidasEnDieta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent lse) {
                jtListaDeComidas.clearSelection();
            }
        });
    }

    private void borrarFilas() {
        int f = jtComidasEnDieta.getRowCount() - 1;
        for (; f >= 0; f--) {
            modeloD.removeRow(f);
        }
        int k = jtListaDeComidas.getRowCount() - 1;
        for (; k >= 0; k--) {
            modeloC.removeRow(k);
        }
    }

//    private void borrarFilasD() {
//        int f = jtComidasEnDieta.getRowCount() - 1;
//        for (; f >= 0; f--) {
//            modeloD.removeRow(f);
//        }
//    }
//
//    private void borrarFilasC() {
//        int k = jtListaDeComidas.getRowCount() - 1;
//        for (; k >= 0; k--) {
//            modeloC.removeRow(k);
//        }
//    }
    private void detectorCerradoVentada() {
        internalFrameListener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                // This code will be executed when the second JInternalFrame is closed
                borrarFilas();
                cargarTablas();
            }
        };
    }
    //
}
