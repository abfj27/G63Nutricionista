package vistas02;

import controlDatos.PacienteData;
import entidades.Paciente;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;
import vistas01.DatosPaciente;


/**
 *
 * @author Equipo
 */
public class AdministrativoPacientes2 extends javax.swing.JInternalFrame {

        private int mouseX, mouseY;
    private int num;
    private Paciente pacEnv;
    private int click;
    private int filaS = -1;
    private int estado;
    private InternalFrameListener internalFrameListener;
    private PacienteData pd = new PacienteData();
    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public AdministrativoPacientes2(int num) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        if (num == 1) {
            setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(41, 65, 43)));
            this.num = num;
            jTpacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            jbAltaBaja.setSize(109, 32);
            jbAltaBaja.setText("Seleccion paciente");
            jRbActivos.setSelected(true);
            jRbActivos.setVisible(false);
            estado = 2;
            jbVer.setVisible(false);
            jbEliminar.setVisible(false);
            jRbInactivos.setVisible(false);
            jRbTodos.setVisible(false);
        } else if (num == 2) {
            detectorCerradoVentada();
            setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Pacientes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(41, 65, 43)));
            this.num = num;
            jTpacientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            jbAltaBaja.setText("Modificar");
            jRbActivos.setSelected(true);
            jRbActivos.setVisible(false);
            estado = 2;
            jbVer.setVisible(false);
            jbEliminar.setVisible(false);
            jRbInactivos.setVisible(false);
            jRbTodos.setVisible(false);
        }
        this.click = 1;
        Utileria utileria = new Utileria(click);
        Cabecera();
        utileria.ordenamientoDeTabla(jTpacientes);
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
        jTpacientes = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jbCerrar1 = new vistas02rsbuttom.RSButtonMetro();
        jbVer = new vistas02rsbuttom.RSButtonMetro();
        jbEliminar = new vistas02rsbuttom.RSButtonMetro();
        jbAltaBaja = new vistas02rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Admin. Pacientes", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(41, 65, 43))); // NOI18N
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

        jTpacientes.setBackground(new java.awt.Color(227, 238, 228));
        jTpacientes.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTpacientes.setForeground(new java.awt.Color(41, 65, 43));
        jTpacientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jTpacientes.setGridColor(new java.awt.Color(59, 107, 65));
        jTpacientes.setSelectionBackground(new java.awt.Color(59, 107, 65));
        jTpacientes.setSelectionForeground(new java.awt.Color(130, 186, 137));
        jTpacientes.getTableHeader().setReorderingAllowed(false);
        jTpacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTpacientesMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTpacientes);

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
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addComponent(jTingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCbFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRbActivos)
                        .addGap(88, 88, 88)
                        .addComponent(jRbInactivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRbTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAltaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jCbFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRbActivos)
                    .addComponent(jRbInactivos)
                    .addComponent(jRbTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbVer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAltaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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
            if (jCbFiltrado.getSelectedIndex() != 0 && num == 0 && !jRbActivos.isSelected() && !jRbInactivos.isSelected()) {
                jRbTodos.setSelected(true);
            }
            obtencionDeDatos();
            if (jCbFiltrado.getSelectedIndex() == 0 && num == 0) {
                buttonGroup1.clearSelection();
                jTingreso.setText("");
                borrarFila();
            }
        } catch (NumberFormatException e) {
            return;
        }
    }//GEN-LAST:event_jCbFiltradoActionPerformed

    private void jTpacientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTpacientesMouseReleased
        filaS = jTpacientes.getSelectedRow();
        if (estado != 1) {
            jbEliminar.setEnabled(true);
            jbVer.setEnabled(true);
        }
        if (estado == 0) {
            if (jTpacientes.getValueAt(filaS, 4) == "true" || jTpacientes.getValueAt(filaS, 4) == "false") {
                jbAltaBaja.setEnabled(true);
                jbEliminar.setEnabled(true);
            } else if (jTpacientes.getValueAt(filaS, 4) == "eliminado") {
                jbAltaBaja.setEnabled(true);
                jbEliminar.setEnabled(false);
            }
        }
    }//GEN-LAST:event_jTpacientesMouseReleased

    private void jbVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerActionPerformed
        if (filaS != -1) {
            pacEnv = pd.buscarPacienteDocumento(Integer.valueOf(jTpacientes.getValueAt(filaS, 2).toString()));
            DatosPaciente dp = new DatosPaciente(pacEnv);
            getParent().add(dp);
            dp.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbVerActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        int[] filasS = jTpacientes.getSelectedRows();
        if (filaS != -1) {
            for (Integer re : filasS) {
                pd.eliminarPaciAdmin(Integer.valueOf(jTpacientes.getValueAt(re, 2).toString()));
            }
            borrarFila();
            obtencionDeDatos();
            filaS = -1;
        } else {
            Utileria.mensaje("Debe seleccionar una fila");
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbAltaBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAltaBajaActionPerformed
        int[] filasS = jTpacientes.getSelectedRows();
        if (jbAltaBaja.getText().equals("Alta/Baja")) {
            if (filaS != -1) {
                for (Integer re : filasS) {
                    if (estado == 1 || jTpacientes.getValueAt(re, 4) == "false" || jTpacientes.getValueAt(re, 4) == "eliminado") {
                        pd.darAlta(Integer.valueOf(jTpacientes.getValueAt(re, 2).toString()));
                    } else if (jTpacientes.getValueAt(re, 4) == "true") {
                        pd.darBaja(Integer.valueOf(jTpacientes.getValueAt(re, 2).toString()));
                    }
                }
                borrarFila();
                obtencionDeDatos();
                filaS = -1;
            } else {
                Utileria.mensaje("Debe seleccionar una fila");
            }
        } else if (jbAltaBaja.getText().equals("Modificar")) {
            if (filaS != -1) {
                int dni = pd.buscarPacienteDocumento(Integer.valueOf(jTpacientes.getValueAt(filaS, 2).toString())).getDni();
                ModificarPaciente2 ven = new ModificarPaciente2(dni, 1);
                ven.addInternalFrameListener(internalFrameListener);
                EscritorioColor2.escritorio.add(ven);
                ven.toFront();
                ven.setVisible(true);
            } else {
                Utileria.mensaje("Debe seleccionar una fila");
            }
        } else {
            if (jTpacientes.getSelectedRow() >= 0) {
                int dni = pd.buscarPacienteDocumento(Integer.valueOf(jTpacientes.getValueAt(jTpacientes.getSelectedRow(), 2).toString())).getDni();
                NuevaDietaVen2.recibir(dni);
                this.dispose();
            } else {
                Utileria.mensaje("Debe seleccionar una fila");
            }
        }
    }//GEN-LAST:event_jbAltaBajaActionPerformed

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

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
    private javax.swing.JTextField jTingreso;
    private javax.swing.JTable jTpacientes;
    private vistas02rsbuttom.RSButtonMetro jbAltaBaja;
    private vistas02rsbuttom.RSButtonMetro jbCerrar1;
    private vistas02rsbuttom.RSButtonMetro jbEliminar;
    private vistas02rsbuttom.RSButtonMetro jbVer;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox() {
        jCbFiltrado.addItem("nombre");
        jCbFiltrado.addItem("apellido");
        jCbFiltrado.addItem("dni");
    }

    private void borrarFila() {
        int filas = modelo.getRowCount() - 1;
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void Cabecera() {
        modelo.setColumnCount(0);
        if (estado == 1 || (estado == 2 && num >= 1)) {
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("DNI");
            modelo.addColumn("Sexo");
            jTpacientes.setModel(modelo);
        } else {
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("DNI");
            modelo.addColumn("Sexo");
            modelo.addColumn("Estado");
            jTpacientes.setModel(modelo);
        }
    }

    private void obtencionDeDatos() {
        String estadoImp;
        jbAltaBaja.setEnabled(false);
        jbEliminar.setEnabled(false);
        String seleccion = jCbFiltrado.getSelectedItem().toString();
        String ingreso = jTingreso.getText();
        ArrayList<Paciente> pacientes = new ArrayList<>();
        if (num >= 1) {
            pacientes = pd.ListaPacientes(seleccion, ingreso, estado);
        } else {
            pacientes = pd.AdminPacientes(seleccion, ingreso, (estado - 1));
        }
        if (!pacientes.isEmpty()) {
            for (Paciente recorrer : pacientes) {
                if (recorrer.getEstado() == 2) {
                    estadoImp = "true";
                } else if (recorrer.getEstado() == 1) {
                    estadoImp = "false";
                } else {
                    estadoImp = "eliminado";
                }
                if (estado == 1 || num >= 1) {
                    modelo.addRow(new Object[]{recorrer.getNombre(), recorrer.getApellido(), recorrer.getDni(), recorrer.getGenero()});
                } else {
                    modelo.addRow(new Object[]{recorrer.getNombre(), recorrer.getApellido(), recorrer.getDni(), recorrer.getGenero(), estadoImp});
                }
            }
            if (estado == 2) {
                jbAltaBaja.setEnabled(true);
                jbEliminar.setEnabled(true);
            } else if (estado == 1) {
                jbAltaBaja.setEnabled(true);
                jbEliminar.setEnabled(false);
            }
        }
        Utileria.ajustarTabla(jTpacientes);
    }

    private void detectorCerradoVentada() {
        internalFrameListener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                borrarFila();
                obtencionDeDatos();
                filaS = -1;
            }
        };
    }
}
