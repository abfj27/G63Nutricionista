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
import vistas01.EscritorioColor2;
import vistasdieta.DetallesDieta2;
import vistasdieta.NuevaDietaVen;

/**
 *
 * @author Alesio
 */
public class FichaPaciente2 extends javax.swing.JInternalFrame {

    private int mouseX, mouseY;

    public FichaPaciente2() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public FichaPaciente2(int dni) {
        initComponents();
        cargarDatos(dni);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBuscarDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jlNombre = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
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
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jDateVisita = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        jtPeso = new javax.swing.JTextField();
        js1 = new javax.swing.JSeparator();
        jbDieta = new rsbuttom.RSButtonMetro();
        jbCerrar1 = new rsbuttom.RSButtonMetro();
        jbGuardar = new rsbuttom.RSButtonMetro();
        jbHistorial = new rsbuttom.RSButtonMetro();
        jbModificar = new rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FIcha Paciente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setForeground(new java.awt.Color(130, 186, 137));
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

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 65, 43));
        jLabel1.setText("DATOS DEL PACIENTE");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 65, 43));
        jLabel2.setText("Documento:");

        jtBuscarDocumento.setBackground(new java.awt.Color(246, 246, 246));
        jtBuscarDocumento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtBuscarDocumento.setForeground(new java.awt.Color(59, 107, 65));
        jtBuscarDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtBuscarDocumento.setCaretColor(new java.awt.Color(59, 107, 65));
        jtBuscarDocumento.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtBuscarDocumento.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Nombre:");

        jbBuscar.setBackground(new java.awt.Color(235, 235, 231));
        jbBuscar.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
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

        jlNombre.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(41, 65, 43));
        jlNombre.setText("Nombre Paciente");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 65, 43));
        jLabel7.setText("Genero:");

        jlGenero.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlGenero.setForeground(new java.awt.Color(41, 65, 43));
        jlGenero.setText("M/F");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(41, 65, 43));
        jLabel10.setText("Teléfono:");

        jlTelefono.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlTelefono.setForeground(new java.awt.Color(41, 65, 43));
        jlTelefono.setText("Teléfono Paciente");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(41, 65, 43));
        jLabel12.setText("Dirección:");

        jlDireccion.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlDireccion.setForeground(new java.awt.Color(41, 65, 43));
        jlDireccion.setText("Dirección Paciente");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(41, 65, 43));
        jLabel14.setText("e-Mail:");

        jlMail.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlMail.setForeground(new java.awt.Color(41, 65, 43));
        jlMail.setText("e-mail Paciente");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(41, 65, 43));
        jLabel16.setText("Altura:");

        jlAltura.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlAltura.setForeground(new java.awt.Color(41, 65, 43));
        jlAltura.setText("00.0");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(41, 65, 43));
        jLabel18.setText("Peso:");

        jlPeso.setFont(new java.awt.Font("Verdana", 2, 14)); // NOI18N
        jlPeso.setForeground(new java.awt.Color(41, 65, 43));
        jlPeso.setText("00.0");

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(41, 65, 43));
        jLabel20.setText("REGISTRO DE VISITA");

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(41, 65, 43));
        jLabel21.setText("Fecha:");

        jDateVisita.setBackground(new java.awt.Color(246, 246, 246));
        jDateVisita.setForeground(new java.awt.Color(59, 107, 65));
        jDateVisita.setDateFormatString("yyyy-MMM-dd");
        jDateVisita.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(41, 65, 43));
        jLabel22.setText("Peso:");

        jtPeso.setBackground(new java.awt.Color(246, 246, 246));
        jtPeso.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtPeso.setForeground(new java.awt.Color(59, 107, 65));
        jtPeso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtPeso.setCaretColor(new java.awt.Color(59, 107, 65));
        jtPeso.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtPeso.setSelectionColor(new java.awt.Color(130, 186, 137));

        js1.setBackground(new java.awt.Color(217, 219, 196));
        js1.setForeground(new java.awt.Color(217, 219, 196));

        jbDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ver dieta 2.png"))); // NOI18N
        jbDieta.setText("VER DIETA");
        jbDieta.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbDieta.setFocusPainted(false);
        jbDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDietaActionPerformed(evt);
            }
        });

        jbCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jbCerrar1.setText("CERRAR");
        jbCerrar1.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbCerrar1.setFocusPainted(false);
        jbCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCerrar1ActionPerformed(evt);
            }
        });

        jbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar verde.png"))); // NOI18N
        jbGuardar.setText("GUARDAR");
        jbGuardar.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbHistorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial.png"))); // NOI18N
        jbHistorial.setText("HISTORIAL");
        jbHistorial.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHistorialActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jbModificar.setText("MODIFICAR");
        jbModificar.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel20)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jDateVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMail, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlGenero)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jlAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jbDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbBuscar)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtBuscarDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        if (jtBuscarDocumento.getText().equals("")) {
            Utileria.mensaje("Debe ingresar un DNI para realizar la busqueda");
        } else {
            PacienteData pdata = new PacienteData();
            Paciente pac = new Paciente();
            try {
                int dni = Integer.parseInt(jtBuscarDocumento.getText());
                pac = pdata.buscarPacienteDocumento(dni);
                jlNombre.setText(pac.getApellido() + ", " + pac.getNombre());
//                jlApellido.setText(pac.getApellido());
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

    private void jbDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDietaActionPerformed
        if (!jtBuscarDocumento.getText().isEmpty()) {
            int documento = Integer.parseInt(jtBuscarDocumento.getText());
            PacienteData pdata = new PacienteData();
            DietaData dd = new DietaData();
            Paciente pac = pdata.buscarPacienteDocumento(documento);
            if (pac != null) {
                Dieta dieta = dd.BuscarXDniYFechaFinal(pac.getDni());
                if (dieta != null && dieta.getFechaFinal().compareTo(LocalDate.now()) >= 0) {
                    DetallesDieta2 ddVista = new DetallesDieta2(dieta);
                    EscritorioColor2.escritorio.add(ddVista);
                    ddVista.toFront();
                    ddVista.setVisible(true);
                } else {
                    Object[] op = {"Aceptar", "Cancelar"};
                    int i = JOptionPane.showOptionDialog(this, "Desea Crear dieta?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
                    if (i == JOptionPane.YES_OPTION) {
                        NuevaDietaVen ndvVista = new NuevaDietaVen(pac.getDni());
                        EscritorioColor2.escritorio.add(ndvVista);
                        ndvVista.toFront();
                        ndvVista.setVisible(true);
                    }
                }
            }
        } else {
            Utileria.mensaje("Debe buscar un paciente primero");
        }
    }//GEN-LAST:event_jbDietaActionPerformed

    private void jbCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrar1ActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jbCerrar1ActionPerformed

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

    private void jbHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHistorialActionPerformed
        if (!jtBuscarDocumento.getText().isEmpty()) {
            int documento = Integer.parseInt(jtBuscarDocumento.getText());
            HistorialDeVisitas2 hVista = new HistorialDeVisitas2(documento);
            EscritorioColor2.escritorio.add(hVista);
            hVista.toFront();
            hVista.setVisible(true);
        } else {
            Utileria.mensaje("Debe buscar un paciente primero");
        }
    }//GEN-LAST:event_jbHistorialActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (!jtBuscarDocumento.getText().isEmpty()) {
            int documento = Integer.parseInt(jtBuscarDocumento.getText());
            ModificarPaciente2 mpVista = new ModificarPaciente2(documento);
            EscritorioColor2.escritorio.add(mpVista);
            mpVista.toFront();
            mpVista.setVisible(true);
        } else {
            Utileria.mensaje("Debe buscar un paciente primero");
        }
    }//GEN-LAST:event_jbModificarActionPerformed

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private rsbuttom.RSButtonMetro jbCerrar1;
    private rsbuttom.RSButtonMetro jbDieta;
    private rsbuttom.RSButtonMetro jbGuardar;
    private rsbuttom.RSButtonMetro jbHistorial;
    private rsbuttom.RSButtonMetro jbModificar;
    private javax.swing.JLabel jlAltura;
    private javax.swing.JLabel jlDireccion;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlMail;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPeso;
    private javax.swing.JLabel jlTelefono;
    private javax.swing.JSeparator js1;
    private javax.swing.JTextField jtBuscarDocumento;
    private javax.swing.JTextField jtPeso;
    // End of variables declaration//GEN-END:variables

    private void limpiarCeldas() {
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
