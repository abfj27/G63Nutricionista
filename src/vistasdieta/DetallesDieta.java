package vistasdieta;

import controlDatos.ComidaData;
import controlDatos.DietaComidaData;
import controlDatos.DietaData;
import controlDatos.PacienteData;
import entidades.Comida;
import entidades.Dieta;
import entidades.DietaComida;
import entidades.Paciente;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;

public class DetallesDieta extends javax.swing.JInternalFrame {

    private Dieta dietaV;

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public DetallesDieta(Dieta dieta) {
        initComponents();
        dietaV = dieta;
        PacienteData pdata = new PacienteData();
        Paciente paciente = new Paciente();
        paciente = pdata.buscarPacienteCodigo(dietaV.getPaciente().getIdPaciente());
        cargaLabels(dietaV, paciente);
        armarCabecera();
        borrarFilas();
        // Comandos para cargar la trabla
        DietaComidaData dcd = new DietaComidaData();
        for (DietaComida dc : dcd.listaComidasEnDieta(dietaV.getIdDieta())) {
            modelo.addRow(new Object[]{
                dc.getComida().getNombre(),
                dc.getComida().getCalorias(),
                dc.getPorcion(),
                dc.getHorario()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jlNombreDieta = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jlPesoActual = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlPesoInicial = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlPesoObje = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlFechaInicial = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jlFechaFinal = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableComidas = new javax.swing.JTable();
        jbCerrar = new javax.swing.JButton();
        jbDetalle = new javax.swing.JButton();

        jLabel1.setText("Nombre Dieta:");

        jlNombreDieta.setText("txtNombreDie");

        jLabel2.setText("Datos Paciente");

        jLabel3.setText("Documento:");

        jlDocumento.setText("txtDocu");

        jLabel4.setText("Nombre:");

        jlApellido.setText("txtApe");

        jlNombre.setText("txtNom");

        jLabel5.setText("Peso Actual:");

        jlPesoActual.setText("txtActual");

        jLabel6.setText("Peso Inicial:");

        jlPesoInicial.setText("txtInicial");

        jLabel7.setText("Peso Objetivo:");

        jlPesoObje.setText("txtObj");

        jLabel14.setText("Fecha Inicio:");

        jlFechaInicial.setText("txtFinicial");

        jLabel15.setText("Fecha Final:");

        jlFechaFinal.setText("txtFfinal");

        jLabel18.setText("Comidas en Dieta");

        tableComidas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableComidas);

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbDetalle.setText("Detalle");
        jbDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetalleActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jlNombreDieta))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jlPesoObje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlPesoInicial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlPesoActual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlDocumento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlApellido)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlNombre)))
                                        .addGap(36, 36, 36)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlFechaFinal)
                                            .addComponent(jlFechaInicial)))
                                    .addComponent(jSeparator1))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbDetalle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jlNombreDieta))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlDocumento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlApellido)
                    .addComponent(jlNombre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlPesoActual)
                    .addComponent(jLabel14)
                    .addComponent(jlFechaInicial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jlPesoInicial)
                    .addComponent(jLabel15)
                    .addComponent(jlFechaFinal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlPesoObje))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrar)
                    .addComponent(jbDetalle))
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

    private void jbDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetalleActionPerformed
        ComidaData cdata = new ComidaData();
        if (tableComidas.getSelectedRow() >= 0) {
            // comandos para traer cosas de la comida seleccionada en la tabla
            String nombre = (String) tableComidas.getValueAt(tableComidas.getSelectedRow(), 0);
            int calorias = (int) tableComidas.getValueAt(tableComidas.getSelectedRow(), 1);
            Comida com = cdata.buscarComida(nombre, calorias);
            Utileria.mensaje(com.getDetalle());
        } else {
            Utileria.mensaje("Debe seleccionar una fila de la tabla");
        }
    }//GEN-LAST:event_jbDetalleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbDetalle;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlFechaFinal;
    private javax.swing.JLabel jlFechaInicial;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNombreDieta;
    private javax.swing.JLabel jlPesoActual;
    private javax.swing.JLabel jlPesoInicial;
    private javax.swing.JLabel jlPesoObje;
    private javax.swing.JTable tableComidas;
    // End of variables declaration//GEN-END:variables

    private void cargaLabels(Dieta dieta, Paciente paciente) {
        jlNombreDieta.setText(dieta.getNombre());
        jlDocumento.setText(paciente.getDni() + "");
        jlApellido.setText(paciente.getApellido());
        jlNombre.setText(paciente.getNombre());
        jlPesoActual.setText(paciente.getPesoActual() + "");
        jlPesoInicial.setText(dieta.getPesoInicial() + "");
        jlPesoObje.setText(dieta.getPesoObjetivo() + "");
        jlFechaInicial.setText(dieta.getFechaInicial().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        jlFechaFinal.setText(dieta.getFechaFinal().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    private void armarCabecera() {
        modelo.addColumn("Comida");
        modelo.addColumn("Calorias");
        modelo.addColumn("Porcion");
        modelo.addColumn("Horario");
        tableComidas.setModel(modelo);
    }

    private void borrarFilas() {
        int f = tableComidas.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
//
}// llave final
