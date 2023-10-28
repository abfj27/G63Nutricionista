package vistas02;

import entidades.Dieta;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import stuff.Utileria;

/* Color:
verde oscuro: [59,107,65]
verde fondo imagen:  [227,238,228]
verde claro seleccion: [130,186,137]
amarillo  claro fondo : [235,235,231]
 */
public class EscritorioColor2 extends javax.swing.JFrame {

    int mouseX, mouseY;
    private JLabel fondo;
    private InternalFrameListener internalFrameListener;

    public EscritorioColor2() {
        detectorCerradoVentada();
        initComponents();
        this.setTitle("NutriVida Suite");
        this.setLocationRelativeTo(this);
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
        fondo = new JLabel(icono);
        fondo.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
        escritorio.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jtNuevoPaciente = new vistas02rsbuttom.RSButtonMetro();
        jrFichaPaciente = new vistas02rsbuttom.RSButtonMetro();
        jlHome = new javax.swing.JLabel();
        jrListaComidas = new vistas02rsbuttom.RSButtonMetro();
        jlListas = new javax.swing.JLabel();
        jrAdminPaciente = new vistas02rsbuttom.RSButtonMetro();
        jrListaPacientesDieta = new vistas02rsbuttom.RSButtonMetro();
        jrListaDietas = new vistas02rsbuttom.RSButtonMetro();
        jlAdmin = new javax.swing.JLabel();
        jrListaPacientes = new vistas02rsbuttom.RSButtonMetro();
        jrAdminDietas = new vistas02rsbuttom.RSButtonMetro();
        jrAdminComidas = new vistas02rsbuttom.RSButtonMetro();
        jrNuevaDieta = new vistas02rsbuttom.RSButtonMetro();
        jrSalir = new vistas02rsbuttom.RSButtonMetro();
        js3 = new javax.swing.JSeparator();
        js1 = new javax.swing.JSeparator();
        js2 = new javax.swing.JSeparator();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 238, 238));
        setUndecorated(true);
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

        jPanel1.setBackground(new java.awt.Color(227, 238, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(155, 623));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jtNuevoPaciente.setForeground(new java.awt.Color(41, 65, 43));
        jtNuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        jtNuevoPaciente.setText("Nuevo Paciente");
        jtNuevoPaciente.setColorBorde(null);
        jtNuevoPaciente.setColorPressed(new java.awt.Color(41, 65, 43));
        jtNuevoPaciente.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jtNuevoPaciente.setFocusPainted(false);
        jtNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNuevoPacienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jtNuevoPaciente, gridBagConstraints);

        jrFichaPaciente.setForeground(new java.awt.Color(41, 65, 43));
        jrFichaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha.png"))); // NOI18N
        jrFichaPaciente.setText("Ver Ficha Pac.   ");
        jrFichaPaciente.setColorPressed(new java.awt.Color(41, 65, 43));
        jrFichaPaciente.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrFichaPaciente.setFocusPainted(false);
        jrFichaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFichaPacienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jrFichaPaciente, gridBagConstraints);

        jlHome.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlHome.setForeground(new java.awt.Color(59, 107, 65));
        jlHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlHome.setText("HOME");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 82;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jlHome, gridBagConstraints);

        jrListaComidas.setForeground(new java.awt.Color(41, 65, 43));
        jrListaComidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandeja comida.png"))); // NOI18N
        jrListaComidas.setText("Comidas           ");
        jrListaComidas.setColorPressed(new java.awt.Color(41, 65, 43));
        jrListaComidas.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrListaComidas.setFocusPainted(false);
        jrListaComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrListaComidasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jrListaComidas, gridBagConstraints);

        jlListas.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlListas.setForeground(new java.awt.Color(59, 107, 65));
        jlListas.setText("LISTAS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 15;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jlListas, gridBagConstraints);

        jrAdminPaciente.setForeground(new java.awt.Color(41, 65, 43));
        jrAdminPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/111Recurso 7-8.png"))); // NOI18N
        jrAdminPaciente.setText("Paciente             ");
        jrAdminPaciente.setColorPressed(new java.awt.Color(41, 65, 43));
        jrAdminPaciente.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrAdminPaciente.setFocusPainted(false);
        jrAdminPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAdminPacienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 0, 0, 5);
        jPanel1.add(jrAdminPaciente, gridBagConstraints);

        jrListaPacientesDieta.setForeground(new java.awt.Color(41, 65, 43));
        jrListaPacientesDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pacientes con dieta.png"))); // NOI18N
        jrListaPacientesDieta.setText("Pac. c/ Dietas ");
        jrListaPacientesDieta.setAlignmentX(0.5F);
        jrListaPacientesDieta.setColorPressed(new java.awt.Color(41, 65, 43));
        jrListaPacientesDieta.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrListaPacientesDieta.setFocusPainted(false);
        jrListaPacientesDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrListaPacientesDietaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jrListaPacientesDieta, gridBagConstraints);

        jrListaDietas.setForeground(new java.awt.Color(41, 65, 43));
        jrListaDietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta.png"))); // NOI18N
        jrListaDietas.setText("Dietas                ");
        jrListaDietas.setColorPressed(new java.awt.Color(41, 65, 43));
        jrListaDietas.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrListaDietas.setFocusPainted(false);
        jrListaDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrListaDietasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jrListaDietas, gridBagConstraints);

        jlAdmin.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jlAdmin.setForeground(new java.awt.Color(59, 107, 65));
        jlAdmin.setText("ADMIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jlAdmin, gridBagConstraints);

        jrListaPacientes.setForeground(new java.awt.Color(41, 65, 43));
        jrListaPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        jrListaPacientes.setText("Pacientes          ");
        jrListaPacientes.setColorPressed(new java.awt.Color(41, 65, 43));
        jrListaPacientes.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrListaPacientes.setFocusPainted(false);
        jrListaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrListaPacientesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jrListaPacientes, gridBagConstraints);

        jrAdminDietas.setForeground(new java.awt.Color(41, 65, 43));
        jrAdminDietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/111Recurso 9-8.png"))); // NOI18N
        jrAdminDietas.setText("Dietas                 ");
        jrAdminDietas.setColorPressed(new java.awt.Color(41, 65, 43));
        jrAdminDietas.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrAdminDietas.setFocusPainted(false);
        jrAdminDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAdminDietasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jrAdminDietas, gridBagConstraints);

        jrAdminComidas.setForeground(new java.awt.Color(41, 65, 43));
        jrAdminComidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/111Recurso 8-8.png"))); // NOI18N
        jrAdminComidas.setText("Comidas            ");
        jrAdminComidas.setColorPressed(new java.awt.Color(41, 65, 43));
        jrAdminComidas.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrAdminComidas.setFocusPainted(false);
        jrAdminComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAdminComidasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jrAdminComidas, gridBagConstraints);

        jrNuevaDieta.setForeground(new java.awt.Color(41, 65, 43));
        jrNuevaDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        jrNuevaDieta.setText("Nueva Dieta     ");
        jrNuevaDieta.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(59, 107, 65), 1, true));
        jrNuevaDieta.setColorPressed(new java.awt.Color(41, 65, 43));
        jrNuevaDieta.setColorTextNormal(new java.awt.Color(41, 65, 43));
        jrNuevaDieta.setFocusPainted(false);
        jrNuevaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNuevaDietaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 5);
        jPanel1.add(jrNuevaDieta, gridBagConstraints);

        jrSalir.setBackground(new java.awt.Color(130, 186, 137));
        jrSalir.setForeground(new java.awt.Color(51, 51, 51));
        jrSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        jrSalir.setText("SALIR");
        jrSalir.setColorHover(new java.awt.Color(59, 107, 65));
        jrSalir.setColorNormal(new java.awt.Color(130, 186, 137));
        jrSalir.setColorPressed(new java.awt.Color(227, 238, 228));
        jrSalir.setColorTextHover(new java.awt.Color(227, 238, 228));
        jrSalir.setColorTextNormal(new java.awt.Color(51, 51, 51));
        jrSalir.setColorTextPressed(new java.awt.Color(59, 107, 65));
        jrSalir.setFocusPainted(false);
        jrSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrSalirMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 8, 5);
        jPanel1.add(jrSalir, gridBagConstraints);

        js3.setBackground(new java.awt.Color(217, 219, 196));
        js3.setForeground(new java.awt.Color(217, 219, 196));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(js3, gridBagConstraints);

        js1.setBackground(new java.awt.Color(217, 219, 196));
        js1.setForeground(new java.awt.Color(217, 219, 196));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(js1, gridBagConstraints);

        js2.setBackground(new java.awt.Color(217, 219, 196));
        js2.setForeground(new java.awt.Color(217, 219, 196));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(js2, gridBagConstraints);

        escritorio.setBackground(new java.awt.Color(238, 238, 238));
        escritorio.setForeground(new java.awt.Color(238, 238, 238));
        escritorio.setMinimumSize(new java.awt.Dimension(750, 625));
        escritorio.setPreferredSize(new java.awt.Dimension(750, 650));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNuevoPacienteActionPerformed
        NuevoPaciente2 ven = new NuevoPaciente2();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jtNuevoPacienteActionPerformed

    private void jrFichaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFichaPacienteActionPerformed
        FichaPaciente2 ven = new FichaPaciente2();
         ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrFichaPacienteActionPerformed

    private void jrNuevaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNuevaDietaActionPerformed
        Dieta dieta = new Dieta();
        dieta.setIdDieta(0);
        NuevaDietaVen2 ven = new NuevaDietaVen2(dieta);
         ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrNuevaDietaActionPerformed

    private void jrListaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrListaPacientesActionPerformed
        AdministrativoPacientes2 ven = new AdministrativoPacientes2(2);
       ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrListaPacientesActionPerformed

    private void jrListaDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrListaDietasActionPerformed
        ListaDietaVen2 ven = new ListaDietaVen2();
         ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrListaDietasActionPerformed

    private void jrListaComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrListaComidasActionPerformed
        ListaComidas2 ven = new ListaComidas2();
         ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrListaComidasActionPerformed

    private void jrListaPacientesDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrListaPacientesDietaActionPerformed
        ListadoPacienteConDieta2 ven = new ListadoPacienteConDieta2();
       ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrListaPacientesDietaActionPerformed

    private void jrAdminPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAdminPacienteActionPerformed
        AdministrativoPacientes2 ven = new AdministrativoPacientes2(0);
       ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrAdminPacienteActionPerformed

    private void jrAdminComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAdminComidasActionPerformed
        AdministrativoListaComidas2 ven = new AdministrativoListaComidas2();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrAdminComidasActionPerformed

    private void jrAdminDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAdminDietasActionPerformed
        AdministrativoDieta2 ven = new AdministrativoDieta2();
       ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo2.png"));
        ven.addInternalFrameListener(internalFrameListener);
        Utileria.fondo(escritorio, ven, icono);
    }//GEN-LAST:event_jrAdminDietasActionPerformed

    private void jrSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrSalirMouseClicked
        int option = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres cerrar la aplicación?",
                "Confirmación de cierre",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jrSalirMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            mouseX = evt.getX();
            mouseY = evt.getY();
        }
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
          this.setLocation(getLocation().x + evt.getX() - mouseX, getLocation().y + evt.getY() - mouseY);
    }//GEN-LAST:event_formMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritorioColor2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAdmin;
    private javax.swing.JLabel jlHome;
    private javax.swing.JLabel jlListas;
    private vistas02rsbuttom.RSButtonMetro jrAdminComidas;
    private vistas02rsbuttom.RSButtonMetro jrAdminDietas;
    private vistas02rsbuttom.RSButtonMetro jrAdminPaciente;
    private vistas02rsbuttom.RSButtonMetro jrFichaPaciente;
    private vistas02rsbuttom.RSButtonMetro jrListaComidas;
    private vistas02rsbuttom.RSButtonMetro jrListaDietas;
    private vistas02rsbuttom.RSButtonMetro jrListaPacientes;
    private vistas02rsbuttom.RSButtonMetro jrListaPacientesDieta;
    private vistas02rsbuttom.RSButtonMetro jrNuevaDieta;
    private vistas02rsbuttom.RSButtonMetro jrSalir;
    private javax.swing.JSeparator js1;
    private javax.swing.JSeparator js2;
    private javax.swing.JSeparator js3;
    private vistas02rsbuttom.RSButtonMetro jtNuevoPaciente;
    // End of variables declaration//GEN-END:variables

    private void ajustarTamanioFondo() {
        Dimension desktopSize = escritorio.getSize();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
        Image imagen = icono.getImage().getScaledInstance(desktopSize.width, desktopSize.height, Image.SCALE_SMOOTH);
        icono.setImage(imagen);
        fondo.setIcon(icono);
    }

    private void detectorCerradoVentada() {
        internalFrameListener = new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                escritorio.removeAll();
                escritorio.repaint();
                ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
                fondo = new JLabel(icono);
                fondo.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
                escritorio.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
            }
        };
    }

} // llave final
