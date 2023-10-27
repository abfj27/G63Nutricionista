package vistasdieta;

import controlDatos.ComidaData;
import controlDatos.DietaComidaData;
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
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;
import vistas01.EscritorioColor2;

public class ModificarComidaEnDieta2 extends javax.swing.JInternalFrame {

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
    private int mouseX, mouseY;

    public ModificarComidaEnDieta2() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public ModificarComidaEnDieta2(Dieta dieta) {
        detectorCerradoVentada();
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbCerrar1 = new rsbuttom.RSButtonMetro();
        jbDetalle = new rsbuttom.RSButtonMetro();
        jbModificar = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Comidas en la Dieta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setMinimumSize(new java.awt.Dimension(725, 500));
        setPreferredSize(new java.awt.Dimension(725, 500));
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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 65, 43));
        jLabel1.setText("Nombre de Dieta: ");

        jlNombreDieta.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlNombreDieta.setForeground(new java.awt.Color(41, 65, 43));
        jlNombreDieta.setText("Nombre Dieta");

        jtComidasEnDieta.setBackground(new java.awt.Color(227, 238, 228));
        jtComidasEnDieta.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtComidasEnDieta.setForeground(new java.awt.Color(41, 65, 43));
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
        jtComidasEnDieta.setGridColor(new java.awt.Color(59, 107, 65));
        jtComidasEnDieta.setSelectionBackground(new java.awt.Color(59, 107, 65));
        jtComidasEnDieta.setSelectionForeground(new java.awt.Color(130, 186, 137));
        jScrollPane1.setViewportView(jtComidasEnDieta);

        jtListaDeComidas.setBackground(new java.awt.Color(227, 238, 228));
        jtListaDeComidas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtListaDeComidas.setForeground(new java.awt.Color(41, 65, 43));
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
        jtListaDeComidas.setGridColor(new java.awt.Color(59, 107, 65));
        jtListaDeComidas.setSelectionBackground(new java.awt.Color(59, 107, 65));
        jtListaDeComidas.setSelectionForeground(new java.awt.Color(130, 186, 137));
        jScrollPane2.setViewportView(jtListaDeComidas);

        jbSacarDe.setBackground(new java.awt.Color(235, 235, 231));
        jbSacarDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jbSacarDe.setBorder(null);
        jbSacarDe.setBorderPainted(false);
        jbSacarDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSacarDe.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jbSacarDe.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar2.png"))); // NOI18N
        jbSacarDe.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        jbSacarDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSacarDeActionPerformed(evt);
            }
        });

        jbAgregarA.setBackground(new java.awt.Color(235, 235, 231));
        jbAgregarA.setForeground(new java.awt.Color(235, 235, 231));
        jbAgregarA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitar.png"))); // NOI18N
        jbAgregarA.setBorder(null);
        jbAgregarA.setBorderPainted(false);
        jbAgregarA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbAgregarA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitar.png"))); // NOI18N
        jbAgregarA.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitar2.png"))); // NOI18N
        jbAgregarA.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/quitar.png"))); // NOI18N
        jbAgregarA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarAActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Comidas en Dieta:");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 65, 43));
        jLabel4.setText("Lista de Comidas:");

        jbCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jbCerrar1.setText("CERRAR");
        jbCerrar1.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbCerrar1.setFocusPainted(false);
        jbCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar1ActionPerformed(evt);
            }
        });

        jbDetalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver dieta.png"))); // NOI18N
        jbDetalle.setText("DETALLE");
        jbDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetalleActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
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
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jbDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jbSacarDe)
                                                    .addComponent(jbAgregarA)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel3)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))))
                                .addGap(0, 17, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jbSacarDe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAgregarA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            ModificarDietaComida2 ven = new ModificarDietaComida2(dc);
            ven.addInternalFrameListener(internalFrameListener);
            EscritorioColor2.escritorio.add(ven);
            ven.toFront();
            ven.setVisible(true);
            //
        } else if (jtComidasEnDieta.getSelectedRow() != -1) {
            jtComidasEnDieta.clearSelection();
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
        } else if (jtListaDeComidas.getSelectedRow() != -1) {

        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
        borrarFilas();
        cargarTablas();
    }//GEN-LAST:event_jbSacarDeActionPerformed

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

    private void jbDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetalleActionPerformed
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
    }//GEN-LAST:event_jbDetalleActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jtComidasEnDieta.getSelectedRow() >= 0) {
            ComidaData cdata = new ComidaData();
            String nombre = (String) jtComidasEnDieta.getValueAt(jtComidasEnDieta.getSelectedRow(), 0);
            int calorias = (int) jtComidasEnDieta.getValueAt(jtComidasEnDieta.getSelectedRow(), 3);
            Comida com = cdata.buscarComida(nombre, calorias);
            //
            ModificarDietaComida2 ven = new ModificarDietaComida2(dietaV.getIdDieta(), com.getIdComida());
            ven.addInternalFrameListener(internalFrameListener);
            EscritorioColor2.escritorio.add(ven);
            ven.toFront();
            ven.setVisible(true);
            //Utileria.centrarInternalFrame(EscritorioColor2.escritorio, ven);
            //
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla 'Comidas en Dieta'");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbAgregarA;
    private rsbuttom.RSButtonMetro jbCerrar1;
    private rsbuttom.RSButtonMetro jbDetalle;
    private rsbuttom.RSButtonMetro jbModificar;
    private javax.swing.JButton jbSacarDe;
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

    private void detectorCerradoVentada() {
        internalFrameListener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                borrarFilas();
                cargarTablas();
            }
        };
    }
    //
}
