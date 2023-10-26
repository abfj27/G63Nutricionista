package vistaspaciente;

import controlDatos.PacienteData;
import controlDatos.VisitaData;
import entidades.Paciente;
import entidades.Visita;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;

public class HistorialDeVisitas extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public HistorialDeVisitas() {
        initComponents();
        armarCabecera();
    }

    public HistorialDeVisitas(int documento) {
        initComponents();
        armarCabecera();
        cargarDatos(documento);
        //System.out.println(jtHistorial.getValueAt(0, 4));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jbCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtHistorial = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATOS DEL PACIENTE");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");

        jlNombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlNombre.setText("Nombre Paciente");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Apellido:");

        jlApellido.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlApellido.setText("Apellido Paciente");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Documento:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlDocumento.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlDocumento.setText("Documento Paciente");

        jbCerrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbCerrar.setText("CERRAR");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jtHistorial.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtHistorial.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtHistorial);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Registro de Visitas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 55, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbCerrar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jlNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jlDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))))
                        .addContainerGap(87, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDocumento)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCerrar)
                .addContainerGap())
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JTable jtHistorial;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int documento) {
        PacienteData pdata = new PacienteData();
        try {
            Paciente pac = pdata.buscarPacienteDocumento(documento);
            if (pac != null) {
                jlNombre.setText(pac.getNombre());
                jlApellido.setText(pac.getApellido());
                jlDocumento.setText(String.valueOf(pac.getDni()));
                cargarHistorial(pac.getIdPaciente());
            } else {
                Utileria.mensaje("No se encontró el paciente con el DNI proporcionado");
            }
        } catch (NullPointerException e) {
           Utileria.mensaje("Error al cargar los datos del paciente");
        }
    }

    private void armarCabecera() {
        modelo.addColumn("FECHA");
        modelo.addColumn("PESO");
        modelo.addColumn("DIETA");
        jtHistorial.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jtHistorial.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

    public void cargarHistorial(int idPaciente) {
        borrarFilas();
        VisitaData vdata = new VisitaData();
        List<Visita> historial = vdata.obtenerHistorial(idPaciente);
        for (Visita visita : historial) {
            if (visita.getDieta().getIdDieta()==0) {
                modelo.addRow(new Object[]{
                    visita.getFecha(),
                    visita.getPeso(),
                    "",
                });
            } else {
                modelo.addRow(new Object[]{
                    visita.getFecha(),
                    visita.getPeso(),
                    visita.getDieta().getNombre(),
                });
            }
        }
        Utileria.ajustarTabla(jtHistorial);
    }

} // Llave final
