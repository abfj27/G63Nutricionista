package vistas02;

import controlDatos.DietaData;
import controlDatos.PacienteData;
import entidades.Dieta;
import java.time.DateTimeException;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import stuff.Utileria;
import vistas02.EscritorioColor2;
import vistas01.AdministrativoPacientes;

public class NuevaDietaVen2 extends javax.swing.JInternalFrame {

    private InternalFrameListener internalFrameListener;
    private static int dni;
    private Dieta dietaV;
    private int mouseX, mouseY;

    public NuevaDietaVen2(Dieta dieta) {
        detectorCerradoVentada();
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.dietaV = dieta;
        prepararVentana(dieta);

    }

    public NuevaDietaVen2(int dni) {
        detectorCerradoVentada();
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
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
        jtNombre = new javax.swing.JTextField();
        jradialModificable = new javax.swing.JRadioButton();
        jtDocumento = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtPInicial = new javax.swing.JTextField();
        jtPFinal = new javax.swing.JTextField();
        jdFInicial = new com.toedter.calendar.JDateChooser();
        jdFFinal = new com.toedter.calendar.JDateChooser();
        jbCerrar1 = new vistas02rsbuttom.RSButtonMetro();
        jrCargar = new vistas02rsbuttom.RSButtonMetro();
        jLabel8 = new javax.swing.JLabel();
        js2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Dieta", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setMinimumSize(new java.awt.Dimension(553, 442));
        setPreferredSize(new java.awt.Dimension(553, 442));
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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 65, 43));
        jLabel1.setText("Nombre Dieta:");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 65, 43));
        jLabel2.setText("Paciente");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Documento:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 65, 43));
        jLabel4.setText("Peso Inicial:");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 65, 43));
        jLabel5.setText("Fecha Inicial:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 65, 43));
        jLabel6.setText("Peso Final:");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 65, 43));
        jLabel7.setText("Fecha Final:");

        jtNombre.setBackground(new java.awt.Color(246, 246, 246));
        jtNombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(59, 107, 65));
        jtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtNombre.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtNombre.setSelectionColor(new java.awt.Color(130, 186, 137));

        jradialModificable.setBackground(new java.awt.Color(235, 235, 231));
        jradialModificable.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jradialModificable.setForeground(new java.awt.Color(41, 65, 43));
        jradialModificable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jradialModificable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jradialModificableActionPerformed(evt);
            }
        });

        jtDocumento.setBackground(new java.awt.Color(246, 246, 246));
        jtDocumento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtDocumento.setForeground(new java.awt.Color(59, 107, 65));
        jtDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtDocumento.setPreferredSize(new java.awt.Dimension(14, 30));
        jtDocumento.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtDocumento.setSelectionColor(new java.awt.Color(130, 186, 137));

        jbBuscar.setBackground(new java.awt.Color(235, 235, 231));
        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jbBuscar.setBorder(null);
        jbBuscar.setBorderPainted(false);
        jbBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jbBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar3.png"))); // NOI18N
        jbBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtPInicial.setBackground(new java.awt.Color(246, 246, 246));
        jtPInicial.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtPInicial.setForeground(new java.awt.Color(59, 107, 65));
        jtPInicial.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtPInicial.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtPInicial.setSelectionColor(new java.awt.Color(130, 186, 137));

        jtPFinal.setBackground(new java.awt.Color(246, 246, 246));
        jtPFinal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtPFinal.setForeground(new java.awt.Color(59, 107, 65));
        jtPFinal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtPFinal.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtPFinal.setSelectionColor(new java.awt.Color(130, 186, 137));

        jdFInicial.setBackground(new java.awt.Color(246, 246, 246));
        jdFInicial.setForeground(new java.awt.Color(59, 107, 65));
        jdFInicial.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jdFFinal.setBackground(new java.awt.Color(246, 246, 246));
        jdFFinal.setForeground(new java.awt.Color(59, 107, 65));
        jdFFinal.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jbCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jbCerrar1.setText("CERRAR");
        jbCerrar1.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbCerrar1.setFocusPainted(false);
        jbCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar1ActionPerformed(evt);
            }
        });

        jrCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar verde.png"))); // NOI18N
        jrCargar.setText("CARGAR");
        jrCargar.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jrCargar.setFocusPainted(false);
        jrCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCargarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(41, 65, 43));
        jLabel8.setText("Modificar:");

        js2.setBackground(new java.awt.Color(217, 219, 196));
        js2.setForeground(new java.awt.Color(217, 219, 196));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdFFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jdFInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jradialModificable)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jtPInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtPFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(js2))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(js2, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jradialModificable)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdFInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdFFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        AdministrativoPacientes2 ap = new AdministrativoPacientes2(1);
        ap.addInternalFrameListener(internalFrameListener);
        EscritorioColor2.escritorio.add(ap);
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

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

    private void jrCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCargarActionPerformed
        if (dietaV.getIdDieta() <= 0) {
            nuevaDieta();
            System.out.println("new 1");
        } else {
            modificarDieta();
            System.out.println("mod 2");
            this.dispose();
        }
    }//GEN-LAST:event_jrCargarActionPerformed

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jbBuscar;
    private vistas02rsbuttom.RSButtonMetro jbCerrar1;
    private com.toedter.calendar.JDateChooser jdFFinal;
    private com.toedter.calendar.JDateChooser jdFInicial;
    private vistas02rsbuttom.RSButtonMetro jrCargar;
    private javax.swing.JRadioButton jradialModificable;
    private javax.swing.JSeparator js2;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPFinal;
    private javax.swing.JTextField jtPInicial;
    // End of variables declaration//GEN-END:variables

    private void nuevaDieta() {
        Dieta dieta = new Dieta();
        DietaData ddata = new DietaData();
        PacienteData pdata = new PacienteData();
        if (jtNombre.getText().equals("")) {
            Utileria.mensaje("Debe completar todos los campos");
        } else {
            try {
                dieta.setNombre(jtNombre.getText());
                dieta.setPaciente(pdata.buscarPacienteDocumento(Integer.parseInt(jtDocumento.getText())));
                if (dieta.getPaciente().equals("")) {
                    System.out.println("666");
                    return;
                }
                dieta.setPesoInicial(Double.parseDouble(jtPInicial.getText()));
                dieta.setPesoObjetivo(Double.parseDouble(jtPFinal.getText()));
                if (jdFInicial.getDate() instanceof Date && jdFFinal.getDate() instanceof Date) {
                    // hay que verificar con el año
                    dieta.setFechaInicial(Utileria.convertirLocalDate(jdFInicial.getDate()));
                    dieta.setFechaFinal(Utileria.convertirLocalDate(jdFFinal.getDate()));
                } else {
                    return;
                }
                dieta.setEstado(2);
                ddata.cargarDieta(dieta);
//            } catch (NullPointerException ex) {
//                Utileria.mensaje("Debe completar todos los campos");
            } catch (NumberFormatException ex) {
                if (ex.getLocalizedMessage().intern().equals("For input string: " + '"' + jtDocumento.getText() + '"')) {
                    Utileria.mensaje("Debe buscar un paciente antes de poder crear una dieta");
                } else if (ex.getLocalizedMessage().intern().equals("For input string: " + '"' + jtPInicial.getText() + '"')) {
                    Utileria.mensaje("Peso inicial no valido");
                } else if (ex.getLocalizedMessage().equals("For input string: " + '"' + jtPFinal.getText() + '"')) {
                    Utileria.mensaje("Peso final no valido");
                } else {
                    Utileria.mensaje("Falta completar campos");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
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
                PacienteData pdata = new PacienteData();
                int dni2 = dni;
                if (dni2 != 0) {
                    jtDocumento.setText(String.valueOf(dni2));
                    jtPInicial.setText(pdata.buscarPacienteDocumento(dni2).getPesoActual() + "");
                }
            }
        };
    }
    //
} // LLAVE FINAL
