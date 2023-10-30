package vistas02;

import controlDatos.PacienteData;
import entidades.Paciente;
import javax.swing.JOptionPane;
import stuff.Utileria;

/**
 *
 * @author Nicolas Kaminski
 */
public class ModificarPaciente2 extends javax.swing.JInternalFrame {

    private int num;
    private int mouseX, mouseY;

    public ModificarPaciente2() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public ModificarPaciente2(int documento) {
        initComponents();
        cargarDatos(documento);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public ModificarPaciente2(int documento, int num) {
        this.num = num;
        initComponents();
        cargarDatos(documento);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtDocumento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtAltura = new javax.swing.JTextField();
        jtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtTelefono = new javax.swing.JTextField();
        jrMasculino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jrFemenino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jtDireccion = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtMail = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtBuscarDocumento = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jrCargar = new vistas02rsbuttom.RSButtonMetro();
        jrCerrar = new vistas02rsbuttom.RSButtonMetro();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtPeso = new javax.swing.JTextField();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Datos Paciente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
        setForeground(new java.awt.Color(130, 186, 137));
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

        jtDocumento.setBackground(new java.awt.Color(246, 246, 246));
        jtDocumento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtDocumento.setForeground(new java.awt.Color(59, 107, 65));
        jtDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtDocumento.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtDocumento.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(41, 65, 43));
        jLabel9.setText("Altura:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 65, 43));
        jLabel4.setText("Edad:");

        jtAltura.setBackground(new java.awt.Color(246, 246, 246));
        jtAltura.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtAltura.setForeground(new java.awt.Color(59, 107, 65));
        jtAltura.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtAltura.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtAltura.setSelectionColor(new java.awt.Color(130, 186, 137));

        jtEdad.setBackground(new java.awt.Color(246, 246, 246));
        jtEdad.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtEdad.setForeground(new java.awt.Color(59, 107, 65));
        jtEdad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtEdad.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtEdad.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(41, 65, 43));
        jLabel5.setText("Teléfono:");

        jtTelefono.setBackground(new java.awt.Color(246, 246, 246));
        jtTelefono.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtTelefono.setForeground(new java.awt.Color(59, 107, 65));
        jtTelefono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtTelefono.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtTelefono.setSelectionColor(new java.awt.Color(130, 186, 137));

        jrMasculino.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jrMasculino);
        jrMasculino.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jrMasculino.setForeground(new java.awt.Color(41, 65, 43));
        jrMasculino.setText("Masculino");
        jrMasculino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(41, 65, 43));
        jLabel6.setText("Dirección:");

        jrFemenino.setBackground(new java.awt.Color(235, 235, 231));
        buttonGroup1.add(jrFemenino);
        jrFemenino.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jrFemenino.setForeground(new java.awt.Color(41, 65, 43));
        jrFemenino.setText("Femenino");
        jrFemenino.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(41, 65, 43));
        jLabel1.setText("Nombre:");

        jtDireccion.setBackground(new java.awt.Color(246, 246, 246));
        jtDireccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtDireccion.setForeground(new java.awt.Color(59, 107, 65));
        jtDireccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtDireccion.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtDireccion.setSelectionColor(new java.awt.Color(130, 186, 137));

        jtNombre.setBackground(new java.awt.Color(246, 246, 246));
        jtNombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtNombre.setForeground(new java.awt.Color(59, 107, 65));
        jtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtNombre.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtNombre.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(41, 65, 43));
        jLabel10.setText("Genero:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(41, 65, 43));
        jLabel7.setText("e-Mail:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 65, 43));
        jLabel2.setText("Apellido:");

        jtMail.setBackground(new java.awt.Color(246, 246, 246));
        jtMail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtMail.setForeground(new java.awt.Color(59, 107, 65));
        jtMail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtMail.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtMail.setSelectionColor(new java.awt.Color(130, 186, 137));

        jtApellido.setBackground(new java.awt.Color(246, 246, 246));
        jtApellido.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtApellido.setForeground(new java.awt.Color(59, 107, 65));
        jtApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtApellido.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtApellido.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Documento:");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(41, 65, 43));
        jLabel8.setText("Documento:");

        jtBuscarDocumento.setBackground(new java.awt.Color(246, 246, 246));
        jtBuscarDocumento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtBuscarDocumento.setForeground(new java.awt.Color(59, 107, 65));
        jtBuscarDocumento.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtBuscarDocumento.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtBuscarDocumento.setSelectionColor(new java.awt.Color(130, 186, 137));

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

        jrCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar verde.png"))); // NOI18N
        jrCargar.setText("CARGAR");
        jrCargar.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jrCargar.setFocusPainted(false);
        jrCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCargarActionPerformed(evt);
            }
        });

        jrCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jrCerrar.setText("CERRAR");
        jrCerrar.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jrCerrar.setFocusPainted(false);
        jrCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCerrarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(41, 65, 43));
        jLabel12.setText("DATOS DEL PACIENTE");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(41, 65, 43));
        jLabel11.setText("Peso:");

        jtPeso.setBackground(new java.awt.Color(246, 246, 246));
        jtPeso.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jtPeso.setForeground(new java.awt.Color(59, 107, 65));
        jtPeso.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jtPeso.setCaretColor(new java.awt.Color(59, 107, 65));
        jtPeso.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jtPeso.setSelectionColor(new java.awt.Color(130, 186, 137));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jbBuscar))
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jrCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190)
                                .addComponent(jrCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jrMasculino)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrFemenino))
                                        .addComponent(jtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jtMail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(19, 50, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jrFemenino)
                    .addComponent(jrMasculino)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrCargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel11)
                            .addComponent(jtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jLabel9.getAccessibleContext().setAccessibleName("");
        jLabel4.getAccessibleContext().setAccessibleName("");
        jLabel5.getAccessibleContext().setAccessibleName("");
        jLabel6.getAccessibleContext().setAccessibleName("");
        jLabel1.getAccessibleContext().setAccessibleName("");
        jLabel10.getAccessibleContext().setAccessibleName("");
        jLabel7.getAccessibleContext().setAccessibleName("");
        jLabel2.getAccessibleContext().setAccessibleName("");
        jLabel3.getAccessibleContext().setAccessibleName("");
        jLabel8.getAccessibleContext().setAccessibleName("");

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
                jtNombre.setText(pac.getNombre());
                jtApellido.setText(pac.getApellido());
                jtDocumento.setText(String.valueOf(pac.getDni()));
                if ("F".equals(pac.getGenero())) {
                    jrFemenino.setSelected(true);
                } else if ("M".equals(pac.getGenero())) {
                    jrMasculino.setSelected(true);
                }
                jtEdad.setText(String.valueOf(pac.getEdad()));
                jtTelefono.setText(pac.getTelefono());
                jtDireccion.setText(pac.getDomicilio());
                jtMail.setText(pac.getEmail());
                jtAltura.setText(String.valueOf(pac.getAltura()));
                jtPeso.setText(String.valueOf(pac.getPesoActual()));
            } catch (NumberFormatException e) {
                Utileria.mensaje("Solo puede ingresar numeros en documento");
            } catch (NullPointerException e) {
                int docu = Integer.parseInt(jtBuscarDocumento.getText());
                limpiarCeldas();
                jtBuscarDocumento.setText(docu + "");
            }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jrCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCargarActionPerformed
        if (jtNombre.getText().equals("") || jtApellido.getText().equals("") || jtDocumento.getText().equals("") || jtEdad.getText().equals("")) {
            Utileria.mensaje("Debe llenar todos los campos obligatorios");
        } else if ((!jrFemenino.isSelected() && !jrMasculino.isSelected())) {
            Utileria.mensaje("Debe seleccionar el genero");
        } else {
            PacienteData pdata = new PacienteData();
            Paciente pac = pdata.buscarPacienteDocumento(Integer.valueOf(jtBuscarDocumento.getText()));
            int aux = 0;
            if (jtTelefono.getText().length() >= 6) {
                for (int i = 0; i < jtTelefono.getText().length(); i++) {
                    if (jtTelefono.getText().charAt(i) < 48 || jtTelefono.getText().charAt(i) > 57) {
                        Utileria.mensaje("Solo puede ingresar numeros en telefono");
                        aux = 0;
                        break;
                    } else {
                        aux = 1;
                    }
                }
            } else {
                if (!jtTelefono.getText().equals("")) {
                    Utileria.mensaje("Numero de telefono no valido");
                    return;
                } else {
                    aux = 1;
                }
            }
            if (aux == 1) {
                try {
                    pac.setNombre(jtNombre.getText());
                    pac.setApellido(jtApellido.getText());
                    pac.setDni(Math.abs(Integer.parseInt(jtDocumento.getText())));
                    pac.setGenero(sexo());
                    pac.setEdad(Math.abs(Integer.parseInt(jtEdad.getText())));
                    pac.setTelefono(jtTelefono.getText());
                    pac.setDomicilio(jtDireccion.getText());
                    pac.setEmail(jtMail.getText());
                    pac.setAltura(Math.abs(Double.parseDouble(jtAltura.getText())));
                    pac.setPesoActual(Math.abs(Double.parseDouble(jtPeso.getText())));
                    pdata.modificarPaciente(pac);
                    if (this.num == 1) {
                        this.dispose();
                    }
                    limpiarCeldas();
                } catch (NumberFormatException e) {
                    if (e.getLocalizedMessage().intern().equals("For input string: " + '"' + jtDocumento.getText() + '"')) {
                        Utileria.mensaje("Solo puede ingresar numeros en documento");
                    } else if (e.getLocalizedMessage().intern().equals("For input string: " + '"' + jtEdad.getText() + '"')) {
                        Utileria.mensaje("Solo puede ingresar numeros en edad");
                    } else if (e.getLocalizedMessage().intern().equals("For input string: " + '"' + jtPeso.getText() + '"')) {
                        Utileria.mensaje("Solo puede ingresar numeros en peso");
                    } else if (e.getLocalizedMessage().intern().equals("For input string: " + '"' + jtAltura.getText() + '"')) {
                        Utileria.mensaje("Solo puede ingresar numeros en altura");
                    } else {
                        Utileria.mensaje("Llene todos los campos obligatorios");
                    }
                } catch (NullPointerException e) {
                    Utileria.mensaje("Llene todos los campos obligatorios");
                } catch (Exception e) {
                    Utileria.mensaje(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jrCargarActionPerformed

    private void jrCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCerrarActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jrCerrarActionPerformed

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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jbBuscar;
    private vistas02rsbuttom.RSButtonMetro jrCargar;
    private vistas02rsbuttom.RSButtonMetro jrCerrar;
    private javax.swing.JRadioButton jrFemenino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JTextField jtAltura;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtBuscarDocumento;
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
        jtAltura.setText("");
        jtPeso.setText("");
        jtBuscarDocumento.setText("");
    }

    private void cargarDatos(int documento) {
        PacienteData pdata = new PacienteData();
        try {
            Paciente pac = pdata.buscarPacienteDocumento(documento);
            if (pac != null) {
                jtBuscarDocumento.setText(String.valueOf(pac.getDni()));
                jtNombre.setText(pac.getNombre());
                jtApellido.setText(pac.getApellido());
                jtDocumento.setText(String.valueOf(pac.getDni()));
                if ("F".equals(pac.getGenero())) {
                    jrFemenino.setSelected(true);
                } else if ("M".equals(pac.getGenero())) {
                    jrMasculino.setSelected(true);
                }
                jtEdad.setText(String.valueOf(pac.getEdad()));
                jtTelefono.setText(pac.getTelefono());
                jtDireccion.setText(pac.getDomicilio());
                jtMail.setText(pac.getEmail());
                jtAltura.setText(String.valueOf(pac.getAltura()));
                jtPeso.setText(String.valueOf(pac.getPesoActual()));
            } else {
                Utileria.mensaje("No se encontró el paciente con el DNI proporcionado");
            }
        } catch (NumberFormatException e) {
            Utileria.mensaje("Solo puede ingresar números en documento");
        } catch (NullPointerException e) {
            Utileria.mensaje("Error al cargar los datos del paciente");
        }
    }

}// Llave FINAL
