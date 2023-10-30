package vistas02;

import controlDatos.DietaData;
import controlDatos.PacienteData;
import entidades.Dieta;
import entidades.Paciente;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;
import vistas01.Escritorio0;
import vistas02.EscritorioColor2;

public class ListadoPacienteConDieta2 extends javax.swing.JInternalFrame {

    private int mouseX, mouseY;

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListadoPacienteConDieta2() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        jtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltroKeyReleased(evt);
            }
        });
        armarCabecera();
        actualizarTabla();
        Utileria.ajustarTabla(jtListado);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jtFiltro = new javax.swing.JTextField();
        jrCompleta = new javax.swing.JRadioButton();
        jrIncompleta = new javax.swing.JRadioButton();
        jrTodos = new javax.swing.JRadioButton();
        jrCurso = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        jbCerrar1 = new vistas02rsbuttom.RSButtonMetro();
        jbFicha = new vistas02rsbuttom.RSButtonMetro();
        jlDocumento = new javax.swing.JLabel();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pacientes con Dietas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setTitle("Listado de Pacientes con Dietas");
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

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Buscar apellido:");

        jtFiltro.setBackground(new java.awt.Color(246, 246, 246));
        jtFiltro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtFiltro.setForeground(new java.awt.Color(59, 107, 65));
        jtFiltro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtFiltro.setCaretColor(new java.awt.Color(59, 107, 65));
        jtFiltro.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtFiltro.setSelectionColor(new java.awt.Color(130, 186, 137));
        jtFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFiltroActionPerformed(evt);
            }
        });
        jtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtFiltroKeyReleased(evt);
            }
        });

        jrCompleta.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jrCompleta);
        jrCompleta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jrCompleta.setForeground(new java.awt.Color(41, 65, 43));
        jrCompleta.setText("Completa");
        jrCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCompletaActionPerformed(evt);
            }
        });

        jrIncompleta.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jrIncompleta);
        jrIncompleta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jrIncompleta.setForeground(new java.awt.Color(41, 65, 43));
        jrIncompleta.setText("Incompleta");
        jrIncompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrIncompletaActionPerformed(evt);
            }
        });

        jrTodos.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jrTodos);
        jrTodos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jrTodos.setForeground(new java.awt.Color(41, 65, 43));
        jrTodos.setText("Todos");
        jrTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTodosActionPerformed(evt);
            }
        });

        jrCurso.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jrCurso);
        jrCurso.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jrCurso.setForeground(new java.awt.Color(41, 65, 43));
        jrCurso.setText("En curso");
        jrCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCursoActionPerformed(evt);
            }
        });

        jtListado.setBackground(new java.awt.Color(227, 238, 228));
        jtListado.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtListado.setForeground(new java.awt.Color(41, 65, 43));
        jtListado.setModel(new javax.swing.table.DefaultTableModel(
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
        jtListado.setGridColor(new java.awt.Color(59, 107, 65));
        jtListado.setSelectionBackground(new java.awt.Color(59, 107, 65));
        jtListado.setSelectionForeground(new java.awt.Color(130, 186, 137));
        jtListado.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jtListado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtListado);

        jbCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jbCerrar1.setText("CERRAR");
        jbCerrar1.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbCerrar1.setFocusPainted(false);
        jbCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar1ActionPerformed(evt);
            }
        });

        jbFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver ficha.png"))); // NOI18N
        jbFicha.setText("VER FICHA");
        jbFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFichaActionPerformed(evt);
            }
        });

        jlDocumento.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlDocumento.setForeground(new java.awt.Color(41, 65, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrCompleta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jrIncompleta)
                                        .addGap(49, 49, 49)
                                        .addComponent(jrCurso)
                                        .addGap(44, 44, 44)
                                        .addComponent(jrTodos)))))
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrTodos)
                    .addComponent(jrCurso)
                    .addComponent(jrIncompleta)
                    .addComponent(jrCompleta))
                .addGap(4, 4, 4)
                .addComponent(jlDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbFicha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCompletaActionPerformed
        borrarFilas();
        String ingreso = jtFiltro.getText();
        int check = 1;
        prueba(check, ingreso);
    }//GEN-LAST:event_jrCompletaActionPerformed

    private void jrIncompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrIncompletaActionPerformed

        borrarFilas();
        String ingreso = jtFiltro.getText();
        int check = 2;
        prueba(check, ingreso);
    }//GEN-LAST:event_jrIncompletaActionPerformed

    private void jrCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCursoActionPerformed
        borrarFilas();
        String ingreso = jtFiltro.getText();
        int check = 3;
        prueba(check, ingreso);
    }//GEN-LAST:event_jrCursoActionPerformed

    private void jrTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTodosActionPerformed
        borrarFilas();
        String ingreso = jtFiltro.getText();
        int check = 4;
        prueba(check, ingreso);
    }//GEN-LAST:event_jrTodosActionPerformed

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

    private void jbFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFichaActionPerformed
        if (jtListado.getSelectedRow() >= 0) {
            PacienteData pdata = new PacienteData();
            Paciente pac = pdata.buscarPacienteDocumento((int) jtListado.getValueAt(jtListado.getSelectedRow(), 5));
            FichaPaciente2 fpVista = new FichaPaciente2(pac.getDni());
            EscritorioColor2.escritorio.add(fpVista);
            fpVista.toFront();
            fpVista.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbFichaActionPerformed

    private void jtFiltroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFiltroKeyReleased
        borrarFilas();
        String ingreso = jtFiltro.getText();
        int check;
        if (jrCompleta.isSelected()) {
            check = 1;
        } else if (jrIncompleta.isSelected()) {
            check = 2;
        } else if (jrCurso.isSelected()) {
            check = 3;
        } else {
            check = 4;
        }
        prueba(check, ingreso);
    }//GEN-LAST:event_jtFiltroKeyReleased

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            mouseX = evt.getX();
            mouseY = evt.getY();
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(getLocation().x + evt.getX() - mouseX, getLocation().y + evt.getY() - mouseY);
    }//GEN-LAST:event_formMouseDragged

    private void jtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFiltroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private vistas02rsbuttom.RSButtonMetro jbCerrar1;
    private vistas02rsbuttom.RSButtonMetro jbFicha;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JRadioButton jrCompleta;
    private javax.swing.JRadioButton jrCurso;
    private javax.swing.JRadioButton jrIncompleta;
    private javax.swing.JRadioButton jrTodos;
    private javax.swing.JTextField jtFiltro;
    private javax.swing.JTable jtListado;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera() {
        modelo.addColumn("PACIENTE");
        modelo.addColumn("PESO INICIAL");
        modelo.addColumn("PESO FINAL");
        modelo.addColumn("FECHA INICIAL");
        modelo.addColumn("FECHA FINAL");
        modelo.addColumn("DNI");
        modelo.addColumn("idPaciente");
        modelo.addColumn("idDieta");
        jtListado.setModel(modelo);
        jtListado.getColumnModel().getColumn(5).setMinWidth(0);
        jtListado.getColumnModel().getColumn(5).setMaxWidth(0);
        jtListado.getColumnModel().getColumn(6).setMinWidth(0);
        jtListado.getColumnModel().getColumn(6).setMaxWidth(0);
        jtListado.getColumnModel().getColumn(7).setMinWidth(0);
        jtListado.getColumnModel().getColumn(7).setMaxWidth(0);
    }

    private void borrarFilas() {
        int f = jtListado.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    private void actualizarTabla() {
        borrarFilas();
        List<Dieta> dietas = new ArrayList<>();
        agregarDietasATabla(dietas);
        Utileria.ajustarTabla(jtListado);
    }

    private void filtrarTabla() {
        String filtroTexto = jtFiltro.getText().trim().toLowerCase();
        List<Dieta> dietasFiltradas = new ArrayList<>();
        if (jrCompleta.isSelected()) {
            dietasFiltradas.addAll(obtenerDietasCompletas());
        } else if (jrIncompleta.isSelected()) {
            dietasFiltradas.addAll(obtenerDietasIncompletas());
        } else if (jrCurso.isSelected()) {
            dietasFiltradas.addAll(obtenerDietasEnCurso());
        } else if (jrTodos.isSelected()) {
            dietasFiltradas.addAll(obtenerTodasLasDietas());
        }
        List<Dieta> dietasFiltradasPorTexto = new ArrayList<>();
        for (Dieta dieta : dietasFiltradas) {
            Paciente paciente = dieta.getPaciente();
            if (paciente.getApellido().toLowerCase().startsWith(filtroTexto)) {
                dietasFiltradasPorTexto.add(dieta);
            }
        }
        borrarFilas();
        agregarDietasATabla(dietasFiltradasPorTexto);
    }

    private void filtrarYMostrarDietas(List<Dieta> dietasFiltradas) {
        borrarFilas();
        agregarDietasATabla(dietasFiltradas);
    }

    /* DIETA COMPLETA: 
    paciente llego al peso final en la fecha establecida como fecha final. Y, a la fecha actual, el paciente tiene un peso menor o igual al peso final
        pesoActual = pesoFinal && fechaFinal >= fechaActual
     */
    private List<Dieta> obtenerDietasCompletas() {
        List<Dieta> dietasCompletas = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        DietaData vdata = new DietaData();
        List<Dieta> dietas = vdata.listaDietasAll();
        for (Dieta dieta : dietas) {
            if (dieta.getPaciente().getPesoActual() == dieta.getPesoObjetivo()
                    && fechaActual.isBefore(dieta.getFechaFinal())) {
                dietasCompletas.add(dieta);
            }
        }
        return dietasCompletas;
    }

    /* DIETA INCOMPLETA: 
    Paciente tiene un peso actual mayor al peso final y la fecha actual es igual o mayor a la fecha final
    pesoActual > pesoFinal ||  pesoActual < pesoFinal && fechaActual >= fechaFinal
     */
    private List<Dieta> obtenerDietasIncompletas() {
        List<Dieta> dietasIncompletas = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        DietaData vdata = new DietaData();
        List<Dieta> dietas = vdata.listaDietasAll();
        for (Dieta dieta : dietas) {
            if (dieta.getPaciente().getPesoActual() > dieta.getPesoObjetivo() || dieta.getPaciente().getPesoActual() < dieta.getPesoObjetivo()
                    && (fechaActual.isEqual(dieta.getFechaFinal()) || fechaActual.isAfter(dieta.getFechaFinal()))) {
                dietasIncompletas.add(dieta);
            }
        }
        return dietasIncompletas;
    }

    /* DIETA CURSO: 
    Paciente tiene una dieta en curso. Y, la fecha actual es menor a la fecha final
    fechaActual < fechaFinal
     */
    private List<Dieta> obtenerDietasEnCurso() {
        List<Dieta> dietasEnCurso = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        DietaData vdata = new DietaData();
        List<Dieta> dietas = vdata.listaDietasAll();
        for (Dieta dieta : dietas) {
            if (fechaActual.isBefore(dieta.getFechaFinal()) && dieta.getPesoObjetivo() != dieta.getPaciente().getPesoActual()) {
                dietasEnCurso.add(dieta);
            }
        }
        return dietasEnCurso;
    }

    /* DIETA TODAS: 
     */
    private List<Dieta> obtenerTodasLasDietas() {
        DietaData vdata = new DietaData();
        return vdata.listaDietasAll();
    }

    private void agregarDietasATabla(List<Dieta> dietas) {
        for (Dieta dieta : dietas) {
            Paciente paciente = dieta.getPaciente();
            modelo.addRow(new Object[]{
                paciente.getNombre() + " " + paciente.getApellido(),
                dieta.getPesoInicial(),
                dieta.getPesoObjetivo(),
                dieta.getFechaInicial(),
                dieta.getFechaFinal(),});
        }
        jtListado.setModel(modelo);
    }

    private void prueba(int check, String ingreso) {
        DietaData dd = new DietaData();
        ArrayList<Dieta> dietas = new ArrayList<>(dd.dietasFiltrar(check, ingreso));
        for (Dieta re : dietas) {
            modelo.addRow(new Object[]{re.getPaciente().getApellido() + " " + re.getPaciente().getNombre(),
                re.getPesoInicial(),
                re.getPesoObjetivo(),
                re.getFechaInicial(),
                re.getFechaFinal(),
                re.getPaciente().getDni(),
                re.getPaciente().getIdPaciente(),
                re.getIdDieta()});
        }
        Utileria.ajustarTabla(jtListado);
    }
}   //LLAVE FINAL

