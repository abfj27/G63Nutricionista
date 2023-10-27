package vistasdieta;

import controlDatos.ComidaData;
import controlDatos.DietaComidaData;
import controlDatos.PacienteData;
import entidades.Comida;
import entidades.Dieta;
import entidades.DietaComida;
import entidades.Paciente;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stuff.Utileria;

public class DetallesDieta2 extends javax.swing.JInternalFrame {

    private Dieta dietaV;
    private int mouseX, mouseY;

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public DetallesDieta2(Dieta dieta) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
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
        jLabel3 = new javax.swing.JLabel();
        jlDocumento = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tableComidas = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        js1 = new javax.swing.JSeparator();
        js2 = new javax.swing.JSeparator();
        jbCerrar1 = new rsbuttom.RSButtonMetro();
        jbDetalle = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de Dieta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(600, 550));
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
        jLabel1.setText("Nombre Dieta:");

        jlNombreDieta.setFont(new java.awt.Font("Verdana", 2, 16)); // NOI18N
        jlNombreDieta.setForeground(new java.awt.Color(41, 65, 43));
        jlNombreDieta.setText("Nombre Dieta");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Documento:");

        jlDocumento.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlDocumento.setForeground(new java.awt.Color(41, 65, 43));
        jlDocumento.setText("Documento Paciente");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 65, 43));
        jLabel4.setText("Nombre:");

        jlApellido.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlApellido.setForeground(new java.awt.Color(41, 65, 43));
        jlApellido.setText("Apellido Paciente");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 65, 43));
        jLabel5.setText("Peso Actual:");

        jlPesoActual.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlPesoActual.setForeground(new java.awt.Color(41, 65, 43));
        jlPesoActual.setText("xx.x");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 65, 43));
        jLabel6.setText("Peso Inicial:");

        jlPesoInicial.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlPesoInicial.setForeground(new java.awt.Color(41, 65, 43));
        jlPesoInicial.setText("xx.x");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 65, 43));
        jLabel7.setText("Peso Objetivo:");

        jlPesoObje.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlPesoObje.setForeground(new java.awt.Color(41, 65, 43));
        jlPesoObje.setText("xx.x");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(41, 65, 43));
        jLabel14.setText("Fecha Inicio:");

        jlFechaInicial.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlFechaInicial.setForeground(new java.awt.Color(41, 65, 43));
        jlFechaInicial.setText("xx/xx/xx");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(41, 65, 43));
        jLabel15.setText("Fecha Final:");

        jlFechaFinal.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlFechaFinal.setForeground(new java.awt.Color(41, 65, 43));
        jlFechaFinal.setText("xx/xx/xx");

        tableComidas.setBackground(new java.awt.Color(227, 238, 228));
        tableComidas.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tableComidas.setForeground(new java.awt.Color(41, 65, 43));
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
        tableComidas.setGridColor(new java.awt.Color(59, 107, 65));
        tableComidas.setSelectionBackground(new java.awt.Color(59, 107, 65));
        tableComidas.setSelectionForeground(new java.awt.Color(130, 186, 137));
        jScrollPane1.setViewportView(tableComidas);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(41, 65, 43));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("COMIDAS EN LA DIETA");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        js1.setBackground(new java.awt.Color(217, 219, 196));
        js1.setForeground(new java.awt.Color(217, 219, 196));

        js2.setBackground(new java.awt.Color(217, 219, 196));
        js2.setForeground(new java.awt.Color(217, 219, 196));

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(js2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jlNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlPesoObje, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jbDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombreDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(js2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jlFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlPesoObje, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private rsbuttom.RSButtonMetro jbCerrar1;
    private rsbuttom.RSButtonMetro jbDetalle;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDocumento;
    private javax.swing.JLabel jlFechaFinal;
    private javax.swing.JLabel jlFechaInicial;
    private javax.swing.JLabel jlNombreDieta;
    private javax.swing.JLabel jlPesoActual;
    private javax.swing.JLabel jlPesoInicial;
    private javax.swing.JLabel jlPesoObje;
    private javax.swing.JSeparator js1;
    private javax.swing.JSeparator js2;
    private javax.swing.JTable tableComidas;
    // End of variables declaration//GEN-END:variables

    private void cargaLabels(Dieta dieta, Paciente paciente) {
        jlNombreDieta.setText(dieta.getNombre());
        jlDocumento.setText(paciente.getDni() + "");
        jlApellido.setText(paciente.getApellido() + ", " + paciente.getNombre());
//        jlNombre.setText(paciente.getNombre());
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
