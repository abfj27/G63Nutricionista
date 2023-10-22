package vistaspaciente;

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

public class ListadoPacienteConDieta extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListadoPacienteConDieta() {
        initComponents();
        armarCabecera();
        actualizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jtFiltro = new javax.swing.JTextField();
        jcSeleccion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jrCompleta = new javax.swing.JRadioButton();
        jrIncompleta = new javax.swing.JRadioButton();
        jrTodos = new javax.swing.JRadioButton();
        jrCurso = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListado = new javax.swing.JTable();
        jbFicha = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Listado de Pacientes con Dietas");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Ingrese que buscar:");

        jtFiltro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jcSeleccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jcSeleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Seleccione el filtro a usar:");

        buttonGroup1.add(jrCompleta);
        jrCompleta.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrCompleta.setText("Completa");

        buttonGroup1.add(jrIncompleta);
        jrIncompleta.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrIncompleta.setText("Incompleta");

        buttonGroup1.add(jrTodos);
        jrTodos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrTodos.setText("Todos");

        buttonGroup1.add(jrCurso);
        jrCurso.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jrCurso.setText("En curso");

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
        jScrollPane1.setViewportView(jtListado);

        jbFicha.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbFicha.setText("VER FICHA");
        jbFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFichaActionPerformed(evt);
            }
        });

        jbCerrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbCerrar.setText("CERRAR");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("PACIENTES CON DIETAS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jcSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jbFicha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jbModificar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbCerrar))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jrCompleta)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrIncompleta)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrCurso)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrTodos)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jrIncompleta)
                    .addComponent(jrCompleta)
                    .addComponent(jrCurso)
                    .addComponent(jrTodos))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbFicha)
                    .addComponent(jbModificar)
                    .addComponent(jbCerrar))
                .addGap(25, 25, 25))
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

    private void jbFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFichaActionPerformed
        if (jtListado.getSelectedRow() >= 0) {
            PacienteData pdata = new PacienteData();
            Paciente pac = pdata.buscarPacienteDocumento((int) jtListado.getValueAt(jtListado.getSelectedRow(), 5));
            System.out.println(pac);
            FichaPaciente fpVista = new FichaPaciente(pac.getDni());
            Escritorio0.escritorio.add(fpVista);
            fpVista.toFront();
            fpVista.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }    }//GEN-LAST:event_jbFichaActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jtListado.getSelectedRow() >= 0) {
            PacienteData pdata = new PacienteData();
            Paciente pac = pdata.buscarPacienteDocumento((int) jtListado.getValueAt(jtListado.getSelectedRow(), 5));
            System.out.println(pac);
            ModificarPaciente mpVista = new ModificarPaciente(pac.getDni());
            Escritorio0.escritorio.add(mpVista);
            mpVista.toFront();
            mpVista.setVisible(true);
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbFicha;
    private javax.swing.JButton jbModificar;
    private javax.swing.JComboBox<String> jcSeleccion;
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
//        jtListado.getColumnModel().getColumn(5).setMinWidth(0);
//        jtListado.getColumnModel().getColumn(5).setMaxWidth(0);
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
        DietaData vdata = new DietaData();
        List<Dieta> dietas = vdata.listaDietasAll();
        for (Dieta dieta : dietas) {
            Paciente paciente = dieta.getPaciente();
            modelo.addRow(new Object[]{
                paciente.getNombre() + " " + paciente.getApellido(),
                dieta.getPesoInicial(),
                dieta.getPesoObjetivo(),
                dieta.getFechaFinal(),
                dieta.getFechaFinal(),
                paciente.getDni()});
        }
        jtListado.setModel(modelo);
    }

    private void filtrarTabla() {
        String filtroSeleccion = jcSeleccion.getSelectedItem().toString();
        String filtroTexto = jtFiltro.getText().trim().toLowerCase();
        if (jrCompleta.isSelected()) {
            filtrarDietasCompletas(filtroSeleccion, filtroTexto);
        } else if (jrIncompleta.isSelected()) {
            filtrarDietasIncompletas(filtroSeleccion, filtroTexto);
        } else if (jrCurso.isSelected()) {
            filtrarDietasEnCurso(filtroSeleccion, filtroTexto);
        } else if (jrTodos.isSelected()) {
            actualizarTabla();
        }
    }

    /* DIETA COMPLETA: 
    paciente llego al peso final en la fecha establecida como fecha final. Y, a la fecha actual, el paciente tiene un peso menor o igual al peso final
        pesoActual <= pesoFinal && fechaActual <= fechaFinal
     */
    private void filtrarDietasCompletas(String filtroSeleccion, String filtroTexto) {
        borrarFilas();
        List<Dieta> dietasCompletas = obtenerDietasCompletas();
        agregarDietasATabla(dietasCompletas);
    }

    private List<Dieta> obtenerDietasCompletas() {
        List<Dieta> dietasCompletas = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        DietaData vdata = new DietaData();
        List<Dieta> dietas = vdata.listaDietasAll();
        for (Dieta dieta : dietas) {
            if (dieta.getPaciente().getPesoActual() <= dieta.getPesoObjetivo()
                    && fechaActual.isAfter(dieta.getFechaFinal())) {
                dietasCompletas.add(dieta);
            }
        }
        return dietasCompletas;
    }

    /* DIETA INCOMPLETA: 
    Paciente tiene un peso actual mayor al peso final y la fecha actual es igual o mayor a la fecha final
    pesoActual > pesoFinal && fechaActual >= fechaFinal
     */
    private void filtrarDietasIncompletas(String filtroSeleccion, String filtroTexto) {
        borrarFilas();
        List<Dieta> dietasIncompletas = obtenerDietasIncompletas();
        agregarDietasATabla(dietasIncompletas);
    }

    private List<Dieta> obtenerDietasIncompletas() {
        List<Dieta> dietasIncompletas = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        DietaData vdata = new DietaData();
        List<Dieta> dietas = vdata.listaDietasAll();
        for (Dieta dieta : dietas) {
            if (dieta.getPaciente().getPesoActual() > dieta.getPesoObjetivo()
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
    private void filtrarDietasEnCurso(String filtroSeleccion, String filtroTexto) {
        borrarFilas();
        List<Dieta> dietasEnCurso = obtenerDietasEnCurso();
        agregarDietasATabla(dietasEnCurso);
    }

    private List<Dieta> obtenerDietasEnCurso() {
        List<Dieta> dietasEnCurso = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        DietaData vdata = new DietaData();
        List<Dieta> dietas = vdata.listaDietasAll();
        for (Dieta dieta : dietas) {
            if (fechaActual.isBefore(dieta.getFechaFinal())) {
                dietasEnCurso.add(dieta);
            }
        }

        return dietasEnCurso;
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

}   //LLAVE FINAL

