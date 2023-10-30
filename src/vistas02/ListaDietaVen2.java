package vistas02;

import controlDatos.DietaData;
import entidades.Dieta;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;
import vistas02.EscritorioColor2;

public class ListaDietaVen2 extends javax.swing.JInternalFrame {

    private int mouseX, mouseY;
    private InternalFrameListener internalFrameListener;

    private DefaultTableModel modeloT = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListaDietaVen2() {
        detectorCerradoVentada();
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        armarCabecera();
        jcBox.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxt = new javax.swing.JTextField();
        jcBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDieta = new javax.swing.JTable();
        jbCerrar1 = new vistas02rsbuttom.RSButtonMetro();
        jbDetallesDieta = new vistas02rsbuttom.RSButtonMetro();
        jbModificarDieta1 = new vistas02rsbuttom.RSButtonMetro();
        jbNuevaDieta = new vistas02rsbuttom.RSButtonMetro();
        jbEditarComidas = new vistas02rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Dietas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 500));
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

        jtxt.setBackground(new java.awt.Color(246, 246, 246));
        jtxt.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtxt.setForeground(new java.awt.Color(59, 107, 65));
        jtxt.setText("Busqueda");
        jtxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtxt.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtxt.setSelectionColor(new java.awt.Color(130, 186, 137));
        jtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtKeyTyped(evt);
            }
        });

        jcBox.setBackground(new java.awt.Color(246, 246, 246));
        jcBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jcBox.setForeground(new java.awt.Color(59, 107, 65));
        jcBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Nombre Dieta", "Nombre Paciente", "Apellido Paciente" }));
        jcBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 2, true));
        jcBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jcBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBoxActionPerformed(evt);
            }
        });

        tableDieta.setBackground(new java.awt.Color(227, 238, 228));
        tableDieta.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableDieta.setForeground(new java.awt.Color(41, 65, 43));
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
        tableDieta.setColumnSelectionAllowed(true);
        tableDieta.setGridColor(new java.awt.Color(59, 107, 65));
        tableDieta.setSelectionBackground(new java.awt.Color(59, 107, 65));
        tableDieta.setSelectionForeground(new java.awt.Color(130, 186, 137));
        tableDieta.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableDieta.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableDieta);
        tableDieta.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jbCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jbCerrar1.setText("CERRAR");
        jbCerrar1.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbCerrar1.setFocusPainted(false);
        jbCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar1ActionPerformed(evt);
            }
        });

        jbDetallesDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver dieta 2.png"))); // NOI18N
        jbDetallesDieta.setText("VER DETALLES");
        jbDetallesDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetallesDietaActionPerformed(evt);
            }
        });

        jbModificarDieta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar dieta.png"))); // NOI18N
        jbModificarDieta1.setText("MODIFICAR");
        jbModificarDieta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarDieta1ActionPerformed(evt);
            }
        });

        jbNuevaDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nueva dieta.png"))); // NOI18N
        jbNuevaDieta.setText("NUEVA");
        jbNuevaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaDietaActionPerformed(evt);
            }
        });

        jbEditarComidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar comida.png"))); // NOI18N
        jbEditarComidas.setText("EDITAR COMIDAS");
        jbEditarComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarComidasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jcBox, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbNuevaDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbModificarDieta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbDetallesDieta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbEditarComidas, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                            .addComponent(jbCerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcBox))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificarDieta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEditarComidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDetallesDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBoxActionPerformed
        DietaData ddata = new DietaData();
        if (jcBox.getSelectedIndex() == 0) {
            actualizarTabla(ddata.listaDietasEnAlta());
        } else if (!jtxt.getText().equals("Busqueda")) {
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

        } else {
            actualizarTabla(ddata.listaDietas2(jtxt.getText(), jcBox.getSelectedIndex()));
        }
    }//GEN-LAST:event_jtxtKeyReleased

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

    private void jbModificarDieta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarDieta1ActionPerformed
        if (tableDieta.getSelectedRow() >= 0) {
            DietaData ddata = new DietaData();
            Dieta dieta = ddata.buscarDietaXid((int) tableDieta.getValueAt(tableDieta.getSelectedRow(), 0));
            NuevaDietaVen2 ven = new NuevaDietaVen2(dieta);
            EscritorioColor2.escritorio.add(ven);
            ven.addInternalFrameListener(internalFrameListener);
            ven.toFront();
            ven.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbModificarDieta1ActionPerformed

    private void jbDetallesDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetallesDietaActionPerformed
        if (tableDieta.getSelectedRow() >= 0) {
            DietaData ddata = new DietaData();
            Dieta dieta = ddata.buscarDietaXid((int) tableDieta.getValueAt(tableDieta.getSelectedRow(), 0));
            DetallesDieta2 ven = new DetallesDieta2(dieta);
            EscritorioColor2.escritorio.add(ven);
            ven.toFront();
            ven.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbDetallesDietaActionPerformed

    private void jbNuevaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaDietaActionPerformed
        Dieta dieta = new Dieta();
        NuevaDietaVen2 ven = new NuevaDietaVen2(dieta);
        EscritorioColor2.escritorio.add(ven);
        ven.addInternalFrameListener(internalFrameListener);
        ven.toFront();
        ven.setVisible(true);
    }//GEN-LAST:event_jbNuevaDietaActionPerformed

    private void jbEditarComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarComidasActionPerformed
        if (tableDieta.getSelectedRow() >= 0) {
            DietaData ddata = new DietaData();
            Dieta dieta = ddata.buscarDietaXid((int) tableDieta.getValueAt(tableDieta.getSelectedRow(), 0));
            ModificarComidaEnDieta2 ven = new ModificarComidaEnDieta2(dieta);
            ven.setVisible(true);
            EscritorioColor2.escritorio.add(ven);
            EscritorioColor2.escritorio.moveToFront(ven);
            Utileria.centrarInternalFrame(EscritorioColor2.escritorio, ven);
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbEditarComidasActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private vistas02rsbuttom.RSButtonMetro jbCerrar1;
    private vistas02rsbuttom.RSButtonMetro jbDetallesDieta;
    private vistas02rsbuttom.RSButtonMetro jbEditarComidas;
    private vistas02rsbuttom.RSButtonMetro jbModificarDieta1;
    private vistas02rsbuttom.RSButtonMetro jbNuevaDieta;
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
        Utileria.ajustarTabla(tableDieta);
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

    private void detectorCerradoVentada() {
        internalFrameListener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                borrarFilas();
                DietaData ddata = new DietaData();
                if (jcBox.getSelectedIndex() == 0) {
                    actualizarTabla(ddata.listaDietasEnAlta());
                } else if (!jtxt.getText().equals("Busqueda")) {
                    actualizarTabla(ddata.listaDietas2(jtxt.getText(), jcBox.getSelectedIndex()));
                }
            }
        };
    }
//
} // llave final
