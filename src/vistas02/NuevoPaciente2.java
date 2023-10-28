package vistas02;

import controlDatos.PacienteData;
import entidades.Paciente;
import javax.swing.JOptionPane;
import stuff.Utileria;

/**
 * @author Nicolas Kaminski
 */
public class NuevoPaciente2 extends javax.swing.JInternalFrame {

    private int mouseX, mouseY;

    public NuevoPaciente2() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtDocumento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtDireccion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtMail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtPeso = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtAltura = new javax.swing.JTextField();
        jrMasculino = new javax.swing.JRadioButton();
        jrFemenino = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jrCerrar = new vistas02rsbuttom.RSButtonMetro();
        jrCargar = new vistas02rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Paciente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setForeground(new java.awt.Color(130, 186, 137));
        setToolTipText(""); // NOI18N
        setFocusable(false);
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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 65, 43));
        jLabel1.setText("Nombre");

        jtNombre.setBackground(new java.awt.Color(246, 246, 246));
        jtNombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(59, 107, 65));
        jtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtNombre.setCaretColor(new java.awt.Color(59, 107, 65));
        jtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtNombre.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtNombre.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 65, 43));
        jLabel2.setText("Apellido");

        jtApellido.setBackground(new java.awt.Color(246, 246, 246));
        jtApellido.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtApellido.setForeground(new java.awt.Color(59, 107, 65));
        jtApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtApellido.setCaretColor(new java.awt.Color(59, 107, 65));
        jtApellido.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtApellido.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Documento");

        jtDocumento.setBackground(new java.awt.Color(246, 246, 246));
        jtDocumento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtDocumento.setForeground(new java.awt.Color(59, 107, 65));
        jtDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtDocumento.setCaretColor(new java.awt.Color(59, 107, 65));
        jtDocumento.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtDocumento.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 65, 43));
        jLabel4.setText("Edad");

        jtEdad.setBackground(new java.awt.Color(246, 246, 246));
        jtEdad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtEdad.setForeground(new java.awt.Color(59, 107, 65));
        jtEdad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtEdad.setCaretColor(new java.awt.Color(59, 107, 65));
        jtEdad.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtEdad.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 65, 43));
        jLabel5.setText("Teléfono");

        jtTelefono.setBackground(new java.awt.Color(246, 246, 246));
        jtTelefono.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtTelefono.setForeground(new java.awt.Color(59, 107, 65));
        jtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtTelefono.setCaretColor(new java.awt.Color(59, 107, 65));
        jtTelefono.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtTelefono.setSelectionColor(new java.awt.Color(130, 186, 137));
        jtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefonoKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 65, 43));
        jLabel6.setText("Dirección");

        jtDireccion.setBackground(new java.awt.Color(246, 246, 246));
        jtDireccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtDireccion.setForeground(new java.awt.Color(59, 107, 65));
        jtDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtDireccion.setCaretColor(new java.awt.Color(59, 107, 65));
        jtDireccion.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtDireccion.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 65, 43));
        jLabel7.setText("e-Mail");

        jtMail.setBackground(new java.awt.Color(246, 246, 246));
        jtMail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtMail.setForeground(new java.awt.Color(59, 107, 65));
        jtMail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtMail.setCaretColor(new java.awt.Color(59, 107, 65));
        jtMail.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtMail.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(41, 65, 43));
        jLabel8.setText("Peso");

        jtPeso.setBackground(new java.awt.Color(246, 246, 246));
        jtPeso.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtPeso.setForeground(new java.awt.Color(59, 107, 65));
        jtPeso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtPeso.setCaretColor(new java.awt.Color(59, 107, 65));
        jtPeso.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtPeso.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 65, 43));
        jLabel9.setText("Altura");

        jtAltura.setBackground(new java.awt.Color(246, 246, 246));
        jtAltura.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtAltura.setForeground(new java.awt.Color(59, 107, 65));
        jtAltura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtAltura.setCaretColor(new java.awt.Color(59, 107, 65));
        jtAltura.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtAltura.setSelectionColor(new java.awt.Color(130, 186, 137));

        jrMasculino.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jrMasculino);
        jrMasculino.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jrMasculino.setForeground(new java.awt.Color(41, 65, 43));
        jrMasculino.setText("Masculino");

        jrFemenino.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jrFemenino);
        jrFemenino.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jrFemenino.setForeground(new java.awt.Color(41, 65, 43));
        jrFemenino.setText("Femenino");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(41, 65, 43));
        jLabel10.setText("Genero");

        jrCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jrCerrar.setText("CERRAR");
        jrCerrar.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jrCerrar.setFocusPainted(false);
        jrCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCerrarActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jrMasculino)
                                    .addGap(44, 44, 44)
                                    .addComponent(jrFemenino))
                                .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrMasculino)
                    .addComponent(jrFemenino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jrCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefonoKeyTyped
//        char c = evt.getKeyChar();
//        if (!Character.isDigit(c)) {
//            if (evt.getKeyChar() == 32) {
//                evt.consume();
//            }
//            if (evt.getKeyChar() >= 33 && evt.getKeyChar() <= 126) {
//                evt.consume();
//                Utileria.mensaje("Solo se permite numeros enteros");
//            }
//        }
    }//GEN-LAST:event_jtTelefonoKeyTyped

    private void jrCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCerrarActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jrCerrarActionPerformed

    private void jrCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCargarActionPerformed
        if (jtNombre.getText().equals("") || jtApellido.getText().equals("") || jtDocumento.getText().equals("") || jtEdad.getText().equals("")) {
            Utileria.mensaje("Debe llenar todos los campos");
        } else if ((!jrFemenino.isSelected() && !jrMasculino.isSelected())) {
            Utileria.mensaje("Debe seleccionar el genero");
        } else {
            PacienteData pdata = new PacienteData();
            Paciente pac = new Paciente();
            int aux = 0;
            if (jtTelefono.getText().length() >= 6) {
                for (int i = 0; i < jtTelefono.getText().length(); i++) {
//                    System.out.println(jtTelefono.getText().charAt(i));
                    if (jtTelefono.getText().charAt(i) < 48 || jtTelefono.getText().charAt(i) > 57) {
                        Utileria.mensaje("Solo puede ingresar numeros en telefono");
                        aux = 0;
                        break;
                    } else {
                        aux = 1;
                    }
                }
            } else {
                Utileria.mensaje("Numero de telefono no valido");
                return;
            }
            if (aux == 1) {
                try {
                    pac.setNombre(jtNombre.getText());
                    pac.setApellido(jtApellido.getText());
                    pac.setDni(Integer.parseInt(jtDocumento.getText()));
                    pac.setGenero(sexo());
                    pac.setEdad(Integer.parseInt(jtEdad.getText()));
                    pac.setTelefono(jtTelefono.getText());
                    pac.setDomicilio(jtDireccion.getText());
                    pac.setEmail(jtMail.getText());
//                if (!jtAltura.getText().isEmpty()) {
                    pac.setAltura(Double.parseDouble(jtAltura.getText()));
//                } else {
//                    pac.setAltura(0);
//                }
//                if (!jtPeso.getText().isEmpty()) {
                    pac.setPesoActual(Double.parseDouble(jtPeso.getText()));
//                } else {
//                    pac.setPesoActual(0);
//                }
                    pac.setEstado(2);
                    pdata.cargarPaciente(pac);
                    limpiarCeldas();
                } catch (NumberFormatException e) {
//                    System.out.println("prueba1: " + e.getLocalizedMessage().trim());
                    if (e.getLocalizedMessage().intern().equals("For input string: " + '"' + jtDocumento.getText() + '"')) {
                        Utileria.mensaje("Solo puede ingresar numeros en documento");
                    } else if (e.getLocalizedMessage().intern().equals("For input string: " + '"' + jtEdad.getText() + '"')) {
                        Utileria.mensaje("Solo puede ingresar numeros en edad");
                    } else if (e.getLocalizedMessage().intern().equals("For input string: " + '"' + jtPeso.getText() + '"')) {
                        Utileria.mensaje("Solo puede ingresar numeros en peso");
                    } else if (e.getLocalizedMessage().intern().equals("For input string: " + '"' + jtAltura.getText() + '"')) {
                        Utileria.mensaje("Solo puede ingresar numeros enteros o double (es punto y no coma) en altura");
                    }
                } catch (NullPointerException e) {
                    Utileria.mensaje("Llene todos los campos");
                }
            }
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private vistas02rsbuttom.RSButtonMetro jrCargar;
    private vistas02rsbuttom.RSButtonMetro jrCerrar;
    private javax.swing.JRadioButton jrFemenino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDireccion;
    private javax.swing.JTextField jtDocumento;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtMail;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPeso;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables

    private String sexo() {
        String gen = "";
        if (jrFemenino.isSelected()) {
            gen = "F";
        } else if (jrMasculino.isSelected()) {
            gen = "M";
        }
        return gen;
    }

    private void limpiarCeldas() {
        jtDocumento.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        buttonGroup1.clearSelection();
        jtEdad.setText("");
        jtTelefono.setText("");
        jtDireccion.setText("");
        jtMail.setText("");
        jtPeso.setText("");
        jtAltura.setText("");
    }

}// Llave FINAL
