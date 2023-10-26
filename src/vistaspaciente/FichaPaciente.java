package vistaspaciente;

import controlDatos.DietaData;
import controlDatos.PacienteData;
import controlDatos.VisitaData;
import entidades.Dieta;
import entidades.Paciente;
import entidades.Visita;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import stuff.Utileria;
import vistas01.Escritorio0;
import vistasdieta.DetallesDieta;
import vistasdieta.NuevaDietaVen;

/**
 *
 * @author Alesio
 */
public class FichaPaciente extends javax.swing.JInternalFrame {

    public FichaPaciente() {
        initComponents();
    }

    public FichaPaciente(int dni) {
        initComponents();
        cargarDatos(dni);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBuscarDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jlApellido = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlTelefono = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jlDireccion = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jlMail = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlAltura = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jlPeso = new javax.swing.JLabel();
        jbModificar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jDateVisita = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jtPeso = new javax.swing.JTextField();
        jbGuardar = new javax.swing.JButton();
        jbDieta = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();
        jbHistorial = new javax.swing.JButton();

        setTitle("Ficha de Paciente");

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("DATOS DEL PACIENTE");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Documento");

        jtBuscarDocumento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("Apellido:");

        jbBuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbBuscar.setText("BUSCAR");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jlNombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlNombre.setText("Nombre Paciente");

        jlApellido.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlApellido.setText("Apellido Paciente");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setText("Genero:");

        jlGenero.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlGenero.setText("M/F");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        jLabel9.setText("CONTACTO");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setText("Teléfono:");

        jlTelefono.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlTelefono.setText("Teléfono Paciente");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setText("Dirección:");

        jlDireccion.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlDireccion.setText("Dirección Paciente");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setText("e-Mail:");

        jlMail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlMail.setText("e-mail Paciente");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel16.setText("Altura:");

        jlAltura.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlAltura.setText("00.0");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setText("Peso:");

        jlPeso.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jlPeso.setText("00.0");

        jbModificar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel20.setText("REGISTRO DE VISITA");

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel21.setText("Fecha:");

        jDateVisita.setDateFormatString("yyyy-MMM-dd");

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel22.setText("Peso:");

        jtPeso.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jbGuardar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbDieta.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbDieta.setText("VER DIETA");
        jbDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDietaActionPerformed(evt);
            }
        });

        jbCerrar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbCerrar.setText("CERRAR");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        jbHistorial.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jbHistorial.setText("HISTORIAL");
        jbHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(181, 181, 181))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jlDireccion))
                                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(48, 48, 48)
                                        .addComponent(jLabel18)
                                        .addGap(40, 40, 40)
                                        .addComponent(jlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jDateVisita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(35, 35, 35)
                                        .addComponent(jbHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jlMail, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbModificar)))
                                        .addGap(18, 18, 18)
                                        .addComponent(jlGenero)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jbDieta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbCerrar)))
                            .addComponent(jlApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(121, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jtBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(jlNombre)
                    .addComponent(jLabel7)
                    .addComponent(jlGenero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellido)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTelefono)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDireccion)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jlMail)
                    .addComponent(jbModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jlAltura)
                    .addComponent(jLabel18)
                    .addComponent(jlPeso))
                .addGap(26, 26, 26)
                .addComponent(jLabel20)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbHistorial)
                    .addComponent(jDateVisita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbDieta)
                            .addComponent(jbGuardar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jtBuscarDocumento.getText().equals("")) {
            Utileria.mensaje("Debe ingresar un DNI para realizar la busqueda");
        } else {
            PacienteData pdata = new PacienteData();
            Paciente pac = new Paciente();
            try {
                int dni = Integer.parseInt(jtBuscarDocumento.getText());
                pac = pdata.buscarPacienteDocumento(dni);
                jlNombre.setText(pac.getNombre());
                jlApellido.setText(pac.getApellido());
                jlGenero.setText(pac.getGenero());
                jlTelefono.setText(pac.getTelefono());
                jlDireccion.setText(pac.getDomicilio());
                jlMail.setText(pac.getEmail());
                jlAltura.setText(String.valueOf(pac.getAltura()));
                jlPeso.setText(String.valueOf(pac.getPesoActual()));
                LocalDate fechaActual = LocalDate.now();
                jDateVisita.setDate(Date.valueOf(fechaActual.toString()));
            } catch (NumberFormatException e) {
                Utileria.mensaje("Solo puede ingresar numeros en documento");
            } catch (NullPointerException e) {
                int docu = Integer.parseInt(jtBuscarDocumento.getText());
                limpiarCeldas();
                jtBuscarDocumento.setText(docu + "");
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (!jtBuscarDocumento.getText().isEmpty()) {
            int documento = Integer.parseInt(jtBuscarDocumento.getText());
            ModificarPaciente mpVista = new ModificarPaciente(documento);
            Escritorio0.escritorio.add(mpVista);
            mpVista.toFront();
            mpVista.setVisible(true);
        } else {
            Utileria.mensaje("Debe buscar un paciente primero");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHistorialActionPerformed
        if (!jtBuscarDocumento.getText().isEmpty()) {
            int documento = Integer.parseInt(jtBuscarDocumento.getText());
            HistorialDeVisitas hVista = new HistorialDeVisitas(documento);
            Escritorio0.escritorio.add(hVista);
            hVista.toFront();
            hVista.setVisible(true);
        } else {
            Utileria.mensaje("Debe buscar un paciente primero");
        }
    }//GEN-LAST:event_jbHistorialActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        if (!jtBuscarDocumento.getText().isEmpty()) {
            try {
                int documento = Integer.parseInt(jtBuscarDocumento.getText());
                PacienteData pdata = new PacienteData();
                DietaData dd = new DietaData();
                VisitaData vdata = new VisitaData();
                Paciente pac = pdata.buscarPacienteDocumento(documento);

                if (pac != null) {
                    double peso = Double.parseDouble(jlPeso.getText());
                    Visita vic = new Visita(); // FALTA VER COMO AGREGAR LO DE DIETA    <<<<<<<<<<<<<<<<<<<<<<<
                    Dieta dieta = dd.dietaFechaFinalMax(pac.getDni());
                    vic.setDieta(dieta);
                    vic.setPaciente(pac);
                    LocalDate fechaActual = Utileria.convertirLocalDate(jDateVisita.getDate());
                    vic.setFecha(fechaActual);
                    vic.setPeso(peso);
                    vic.setEstado(2);
                    if (dieta != null && (dieta.getFechaFinal().compareTo(LocalDate.now()) >= 0)) {
                        vdata.cargarVisita(vic);
                    } else {
                        vdata.cargarVisita2(vic);
                    }
                    Utileria.mensaje("Visita guardada exitosamente");
                    Utileria.mensaje(String.valueOf(pac.getPesoActual()));
                    pac.setPesoActual(Double.parseDouble(jtPeso.getText()));
                    Utileria.mensaje(String.valueOf(pac.getPesoActual()));
                    pdata.modificarPaciente(pac);
                    limpiarCeldas2();
                } else {
                    Utileria.mensaje("No se encontró el paciente con el documento proporcionado");
                }
            } catch (NumberFormatException e) {
                Utileria.mensaje("Error al obtener el documento del paciente");
            }
        } else {
            Utileria.mensaje("Debe buscar un paciente primero");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDietaActionPerformed
        if (!jtBuscarDocumento.getText().isEmpty()) {
            int documento = Integer.parseInt(jtBuscarDocumento.getText());
            PacienteData pdata = new PacienteData();
            DietaData dd = new DietaData();
            Paciente pac = pdata.buscarPacienteDocumento(documento);
            if (pac != null) {
                Dieta dieta = dd.BuscarXDniYFechaFinal(pac.getDni());
                if (dieta != null && dieta.getFechaFinal().compareTo(LocalDate.now()) >= 0) {
                    DetallesDieta ddVista = new DetallesDieta(dieta);
                    Escritorio0.escritorio.add(ddVista);
                    ddVista.toFront();
                    ddVista.setVisible(true);
                } else {
                    Object[] op = {"Aceptar", "Cancelar"};
                    int i = JOptionPane.showOptionDialog(this, "Desea Crear dieta?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
                    if (i == JOptionPane.YES_OPTION) {
                        NuevaDietaVen ndvVista = new NuevaDietaVen(pac.getDni());
                        Escritorio0.escritorio.add(ndvVista);
                        ndvVista.toFront();
                        ndvVista.setVisible(true);
                    }
                }
            }
        } else {
            Utileria.mensaje("Debe buscar un paciente primero");
        }
    }//GEN-LAST:event_jbDietaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbDieta;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbHistorial;
    private javax.swing.JButton jbModificar;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlApellido;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlMail;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JTextField jtBuscarDocumento;
    private javax.swing.JTextField jtPeso;
    // End of variables declaration//GEN-END:variables

    private void limpiarCeldas() {
        jlApellido.setText("");
        jlNombre.setText("");
        jlGenero.setText("");
        jlTelefono.setText("");
        jlDireccion.setText("");
        jlMail.setText("");
        jlAltura.setText("");
        jlPeso.setText("");
        jtBuscarDocumento.setText("");
    }

    private void limpiarCeldas2() {
        jlApellido.setText("Apellido Paciente");
        jlNombre.setText("Nombre Paciente");
        jlGenero.setText("M/F");
        jlTelefono.setText("Teléfono Paciente");
        jlDireccion.setText("Dirección Paciente");
        jlMail.setText("e-mail Paciente");
        jlAltura.setText("00.0");
        jlPeso.setText("00.0");
        jtBuscarDocumento.setText("");
        jDateVisita.setDate(null);
        jtPeso.setText("");
    }

    private void cargarDatos(int documento) {
        PacienteData pdata = new PacienteData();
        try {
            Paciente pac = pdata.buscarPacienteDocumento(documento);
            jtBuscarDocumento.setText(String.valueOf(pac.getDni()));
            jlNombre.setText(pac.getNombre());
            jlApellido.setText(pac.getApellido());
            jlGenero.setText(pac.getGenero());
            jlTelefono.setText(pac.getTelefono());
            jlDireccion.setText(pac.getDomicilio());
            jlMail.setText(pac.getEmail());
            jlAltura.setText(String.valueOf(pac.getAltura()));
            jlPeso.setText(String.valueOf(pac.getPesoActual()));
            LocalDate fechaActual = LocalDate.now();
            jDateVisita.setDate(Date.valueOf(fechaActual.toString()));
        } catch (NullPointerException e) {
            Utileria.mensaje("Error al cargar los datos del paciente");
        }
    }

} // LLAVE FINAL
