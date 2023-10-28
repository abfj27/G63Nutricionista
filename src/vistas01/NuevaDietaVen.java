package vistas01;

import controlDatos.DietaData;
import controlDatos.PacienteData;
import entidades.Dieta;
import entidades.Paciente;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import stuff.Utileria;
import vistas01.AdministrativoPacientes;
import vistas01.Escritorio0;

public class NuevaDietaVen extends javax.swing.JInternalFrame {

    private InternalFrameListener internalFrameListener;
    private static int dni;
    private Dieta dietaV;

    public NuevaDietaVen(Dieta dieta) {
        detectorCerradoVentada();
        initComponents();
        this.dietaV = dieta;
        prepararVentana(dieta);

    }

    public NuevaDietaVen(int dni) {
        detectorCerradoVentada();
        initComponents();
        jtDocumento.setText(String.valueOf(dni));
        jtDocumento.setEditable(false);
        jbBuscar.setEnabled(false);
        Dieta dieta = new Dieta();
        this.dietaV = dieta;
        prepararVentana(dieta);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtNombre = new javax.swing.JTextField();
        jradialModificable = new javax.swing.JRadioButton();
        jtDocumento = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtPInicial = new javax.swing.JTextField();
        jtPFinal = new javax.swing.JTextField();
        jdFInicial = new com.toedter.calendar.JDateChooser();
        jdFFinal = new com.toedter.calendar.JDateChooser();
        jbGuardar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();

        jLabel1.setText("Nombre Dieta:");

        jLabel2.setText("Cargar Paciente");

        jLabel3.setText("Documento:");

        jLabel4.setText("Peso Inicial:");

        jLabel5.setText("Fecha Inicial:");

        jLabel6.setText("Peso Final:");

        jLabel7.setText("Fecha Final:");

        jradialModificable.setText("Modificar Paciente");
        jradialModificable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradialModificableActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbCerrar.setText("Cerrar");
        jbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6)
                            .addComponent(jbGuardar))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtPInicial)
                                    .addComponent(jtPFinal, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdFFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdFInicial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbCerrar, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(jradialModificable))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator1))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtNombre)
                        .addComponent(jradialModificable))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtDocumento)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtPInicial)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jdFFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtPFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrar)
                    .addComponent(jbGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if (dietaV.getIdDieta() <= 0) {
            nuevaDieta();
        } else {
            modificarDieta();
            this.dispose();
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
//        PacienteData pdata = new PacienteData();
//        try {
//            pdata.buscarPacienteDocumento(Integer.parseInt(jtDocumento.getText()));
//            // usar un atributo Paciente en la vista y asignar lo que devuelve el metodo al atributo?
//        } catch (NullPointerException ex) {
//            Utileria.mensaje("Debe ingresar un numero de documento para buscar");
//        } catch (NumberFormatException ex) {
//            Utileria.mensaje("El campo de documento solo puede contener numeros");
//        } catch (Exception ex) {
//            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
//        }
        AdministrativoPacientes ap = new AdministrativoPacientes(1);
        ap.addInternalFrameListener(internalFrameListener);
        Escritorio0.escritorio.add(ap);
        ap.setVisible(true);
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jradialModificableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jradialModificableActionPerformed
        if (jradialModificable.isSelected()) {
            jtDocumento.setEditable(false);
            jbBuscar.setEnabled(false);
        } else {
            jtDocumento.setEditable(true);
            jbBuscar.setEnabled(true);
        }
    }//GEN-LAST:event_jradialModificableActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JButton jbGuardar;
    private com.toedter.calendar.JDateChooser jdFFinal;
    private com.toedter.calendar.JDateChooser jdFInicial;
    private javax.swing.JRadioButton jradialModificable;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPFinal;
    private javax.swing.JTextField jtPInicial;
    // End of variables declaration//GEN-END:variables

    private void nuevaDieta() {
        Dieta dieta = new Dieta();
        DietaData ddata = new DietaData();
        PacienteData pdata = new PacienteData();
        try {
            dieta.setNombre(jtNombre.getText());

            dieta.setPaciente(pdata.buscarPacienteDocumento(Integer.parseInt(jtDocumento.getText())));

            dieta.setPesoInicial(Double.parseDouble(jtPInicial.getText()));
            dieta.setPesoObjetivo(Double.parseDouble(jtPFinal.getText()));
            dieta.setFechaInicial(Utileria.convertirLocalDate(jdFInicial.getDate()));
            dieta.setFechaFinal(Utileria.convertirLocalDate(jdFFinal.getDate()));
            dieta.setEstado(2);
            ddata.cargarDieta(dieta);
        } catch (NullPointerException ex) {
            Utileria.mensaje("Debe completar todos los campos");
        } catch (NumberFormatException ex) {
            Utileria.mensaje("  Los campos de peso" + "\n" + "solo pueden contener numeros");
        } catch (Exception ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void modificarDieta() {
        Dieta dieta = new Dieta();
        DietaData ddata = new DietaData();
        PacienteData pdata = new PacienteData();
        try {
            dieta.setNombre(jtNombre.getText());

            dieta.setPaciente(pdata.buscarPacienteDocumento(Integer.parseInt(jtDocumento.getText())));

            dieta.setPesoInicial(Double.parseDouble(jtPInicial.getText()));
            dieta.setPesoObjetivo(Double.parseDouble(jtPFinal.getText()));
            dieta.setFechaInicial(Utileria.convertirLocalDate(jdFInicial.getDate()));
            dieta.setFechaFinal(Utileria.convertirLocalDate(jdFFinal.getDate()));
            dieta.setIdDieta(dietaV.getIdDieta());
            dieta.setEstado(dietaV.getEstado());
            ddata.modificarDieta(dieta);
            limpiarCeldas();
        } catch (NullPointerException ex) {
            Utileria.mensaje("Debe completar todos los campos");
        } catch (NumberFormatException ex) {
            Utileria.mensaje("  Los campos de peso" + "\n" + "solo pueden contener numeros");
        } catch (Exception ex) {
            Logger.getLogger(DietaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void limpiarCeldas() {
        jtNombre.setText("");
        jradialModificable.setSelected(false);
        jtDocumento.setText("");
        jtPInicial.setText("");
        jtPFinal.setText("");
        jdFInicial.setDate(null);
        jdFFinal.setDate(null);
    }

    private void prepararVentana(Dieta p) {
        if (p.getIdDieta() <= 0) {
//            System.out.println("op1");
        } else {
            jradialModificable.setSelected(true);
            jtDocumento.setEditable(false);
            jbBuscar.setEnabled(false);
            jtNombre.setText(p.getNombre());
            jtDocumento.setText("" + p.getPaciente().getDni());
            jtPInicial.setText("" + p.getPesoInicial());
            jtPFinal.setText("" + p.getPesoObjetivo());
            jdFInicial.setDate(Utileria.convertirDate(p.getFechaInicial()));
            jdFFinal.setDate(Utileria.convertirDate(p.getFechaFinal()));
        }
    }

    public static void recibir(int num) {
        dni = num;
    }

    private void detectorCerradoVentada() {
        internalFrameListener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                // This code will be executed when the second JInternalFrame is closed
                int dni2 = dni;
                jtDocumento.setText(String.valueOf(dni2));
            }
        };
    }
    //
} // LLAVE FINAL
