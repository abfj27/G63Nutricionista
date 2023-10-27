package vistas01;

import entidades.Dieta;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import vistasadministracion.AdministrativoDieta;
import vistasadministracion.AdministrativoListaComidas;
import vistasadministracion.AdministrativoPacientes;
import vistascomida.ListaComidas;
import vistasdieta.ListaDietaVen;
import vistasdieta.NuevaDietaVen;
import vistaspaciente.FichaPaciente;
import vistaspaciente.ListadoPacienteConDieta;
import vistaspaciente.NuevoPaciente;

/* Color:
[59,107,65]
[193,234,198]
[130,186,137]
[227,238,228]
 */
public class EscritorioColor3 extends javax.swing.JFrame {

    private JLabel fondo;

    public EscritorioColor3() {
        initComponents();
        this.setTitle("NutriVida Suite");
        this.setLocationRelativeTo(this);

        fondo = new JLabel();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
        JLabel fondo = new JLabel(icono);
        fondo.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
        escritorio.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);

        escritorio.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                Dimension desktopSize = escritorio.getSize();
                fondo.setSize(desktopSize);
            }
        });
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                ajustarTamanioFondo();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jtNuevoPaciente = new rsbuttom.RSButtonMetro();
        jrFichaPaciente = new rsbuttom.RSButtonMetro();
        jlHome = new javax.swing.JLabel();
        jrListaComidas = new rsbuttom.RSButtonMetro();
        jlListas = new javax.swing.JLabel();
        jrAdminPaciente = new rsbuttom.RSButtonMetro();
        jrListaPacientesDieta = new rsbuttom.RSButtonMetro();
        jrListaDietas = new rsbuttom.RSButtonMetro();
        jlAdmin = new javax.swing.JLabel();
        jrListaPacientes = new rsbuttom.RSButtonMetro();
        jrAdminDietas = new rsbuttom.RSButtonMetro();
        jrAdminComidas = new rsbuttom.RSButtonMetro();
        jrNuevaDieta = new rsbuttom.RSButtonMetro();
        jrSalir = new rsbuttom.RSButtonMetro();
        js3 = new javax.swing.JSeparator();
        js1 = new javax.swing.JSeparator();
        js2 = new javax.swing.JSeparator();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 238, 238));

        jPanel1.setBackground(new java.awt.Color(227, 238, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(155, 623));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jtNuevoPaciente.setBackground(new java.awt.Color(227, 238, 228));
        jtNuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        jtNuevoPaciente.setText("Nuevo Paciente");
        jtNuevoPaciente.setColorBorde(null);
        jtNuevoPaciente.setColorHover(new java.awt.Color(130, 186, 137));
        jtNuevoPaciente.setColorNormal(new java.awt.Color(227, 238, 228));
        jtNuevoPaciente.setColorPressed(new java.awt.Color(59, 107, 65));
        jtNuevoPaciente.setColorTextHover(new java.awt.Color(59, 107, 65));
        jtNuevoPaciente.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jtNuevoPaciente.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jrFichaPaciente.setBackground(new java.awt.Color(227, 238, 228));
        jrFichaPaciente.setForeground(new java.awt.Color(59, 107, 65));
        jrFichaPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha.png"))); // NOI18N
        jrFichaPaciente.setText("Ver Ficha Pac.   ");
        jrFichaPaciente.setColorHover(new java.awt.Color(130, 186, 137));
        jrFichaPaciente.setColorNormal(new java.awt.Color(227, 238, 228));
        jrFichaPaciente.setColorPressed(new java.awt.Color(59, 107, 65));
        jrFichaPaciente.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrFichaPaciente.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrFichaPaciente.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jlHome.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
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
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(jlHome, gridBagConstraints);

        jrListaComidas.setBackground(new java.awt.Color(227, 238, 228));
        jrListaComidas.setForeground(new java.awt.Color(59, 107, 65));
        jrListaComidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandeja comida.png"))); // NOI18N
        jrListaComidas.setText("Comidas           ");
        jrListaComidas.setColorHover(new java.awt.Color(130, 186, 137));
        jrListaComidas.setColorNormal(new java.awt.Color(227, 238, 228));
        jrListaComidas.setColorPressed(new java.awt.Color(59, 107, 65));
        jrListaComidas.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrListaComidas.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrListaComidas.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jlListas.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
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

        jrAdminPaciente.setBackground(new java.awt.Color(227, 238, 228));
        jrAdminPaciente.setForeground(new java.awt.Color(59, 107, 65));
        jrAdminPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/111Recurso 7-8.png"))); // NOI18N
        jrAdminPaciente.setText("Paciente             ");
        jrAdminPaciente.setColorHover(new java.awt.Color(130, 186, 137));
        jrAdminPaciente.setColorNormal(new java.awt.Color(227, 238, 228));
        jrAdminPaciente.setColorPressed(new java.awt.Color(59, 107, 65));
        jrAdminPaciente.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrAdminPaciente.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrAdminPaciente.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jrListaPacientesDieta.setBackground(new java.awt.Color(227, 238, 228));
        jrListaPacientesDieta.setForeground(new java.awt.Color(59, 107, 65));
        jrListaPacientesDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pacientes con dieta.png"))); // NOI18N
        jrListaPacientesDieta.setText("Pac. c/ Dietas ");
        jrListaPacientesDieta.setAlignmentX(0.5F);
        jrListaPacientesDieta.setColorHover(new java.awt.Color(130, 186, 137));
        jrListaPacientesDieta.setColorNormal(new java.awt.Color(227, 238, 228));
        jrListaPacientesDieta.setColorPressed(new java.awt.Color(59, 107, 65));
        jrListaPacientesDieta.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrListaPacientesDieta.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrListaPacientesDieta.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jrListaDietas.setBackground(new java.awt.Color(227, 238, 228));
        jrListaDietas.setForeground(new java.awt.Color(59, 107, 65));
        jrListaDietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta.png"))); // NOI18N
        jrListaDietas.setText("Dietas                ");
        jrListaDietas.setColorHover(new java.awt.Color(130, 186, 137));
        jrListaDietas.setColorNormal(new java.awt.Color(227, 238, 228));
        jrListaDietas.setColorPressed(new java.awt.Color(59, 107, 65));
        jrListaDietas.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrListaDietas.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrListaDietas.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jlAdmin.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
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

        jrListaPacientes.setBackground(new java.awt.Color(227, 238, 228));
        jrListaPacientes.setForeground(new java.awt.Color(59, 107, 65));
        jrListaPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        jrListaPacientes.setText("Pacientes          ");
        jrListaPacientes.setColorHover(new java.awt.Color(130, 186, 137));
        jrListaPacientes.setColorNormal(new java.awt.Color(227, 238, 228));
        jrListaPacientes.setColorPressed(new java.awt.Color(59, 107, 65));
        jrListaPacientes.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrListaPacientes.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrListaPacientes.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jrAdminDietas.setBackground(new java.awt.Color(227, 238, 228));
        jrAdminDietas.setForeground(new java.awt.Color(59, 107, 65));
        jrAdminDietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/111Recurso 9-8.png"))); // NOI18N
        jrAdminDietas.setText("Dietas                 ");
        jrAdminDietas.setColorHover(new java.awt.Color(130, 186, 137));
        jrAdminDietas.setColorNormal(new java.awt.Color(227, 238, 228));
        jrAdminDietas.setColorPressed(new java.awt.Color(59, 107, 65));
        jrAdminDietas.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrAdminDietas.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrAdminDietas.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jrAdminComidas.setBackground(new java.awt.Color(227, 238, 228));
        jrAdminComidas.setForeground(new java.awt.Color(59, 107, 65));
        jrAdminComidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/111Recurso 8-8.png"))); // NOI18N
        jrAdminComidas.setText("Comidas            ");
        jrAdminComidas.setColorHover(new java.awt.Color(130, 186, 137));
        jrAdminComidas.setColorNormal(new java.awt.Color(227, 238, 228));
        jrAdminComidas.setColorPressed(new java.awt.Color(59, 107, 65));
        jrAdminComidas.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrAdminComidas.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrAdminComidas.setColorTextPressed(new java.awt.Color(227, 238, 228));
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

        jrNuevaDieta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        jrNuevaDieta.setText("Nueva Dieta      ");
        jrNuevaDieta.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(59, 107, 65), 1, true));
        jrNuevaDieta.setColorHover(new java.awt.Color(130, 186, 137));
        jrNuevaDieta.setColorNormal(new java.awt.Color(227, 238, 228));
        jrNuevaDieta.setColorPressed(new java.awt.Color(59, 107, 65));
        jrNuevaDieta.setColorTextHover(new java.awt.Color(59, 107, 65));
        jrNuevaDieta.setColorTextNormal(new java.awt.Color(59, 107, 65));
        jrNuevaDieta.setColorTextPressed(new java.awt.Color(227, 238, 228));
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
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE_LEADING;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 8, 5);
        jPanel1.add(jrSalir, gridBagConstraints);

        js3.setBackground(new java.awt.Color(95, 127, 122));
        js3.setForeground(new java.awt.Color(95, 127, 122));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(js3, gridBagConstraints);

        js1.setBackground(new java.awt.Color(95, 127, 122));
        js1.setForeground(new java.awt.Color(95, 127, 122));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 69;
        gridBagConstraints.ipady = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(js1, gridBagConstraints);

        js2.setBackground(new java.awt.Color(95, 127, 122));
        js2.setForeground(new java.awt.Color(95, 127, 122));
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
            .addGap(0, 625, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNuevoPacienteActionPerformed
                NuevoPaciente ven = new NuevoPaciente();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jtNuevoPacienteActionPerformed

    private void jrFichaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFichaPacienteActionPerformed
         FichaPaciente ven = new FichaPaciente();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jrFichaPacienteActionPerformed

    private void jrNuevaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNuevaDietaActionPerformed
            Dieta dieta = new Dieta();
        dieta.setIdDieta(0);
        NuevaDietaVen ven = new NuevaDietaVen(dieta);
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jrNuevaDietaActionPerformed

    private void jrListaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrListaPacientesActionPerformed
        AdministrativoPacientes ven = new AdministrativoPacientes(2);
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jrListaPacientesActionPerformed

    private void jrListaDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrListaDietasActionPerformed
       ListaDietaVen ven = new ListaDietaVen();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jrListaDietasActionPerformed

    private void jrListaComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrListaComidasActionPerformed
         ListaComidas ven = new ListaComidas();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jrListaComidasActionPerformed

    private void jrListaPacientesDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrListaPacientesDietaActionPerformed
        ListadoPacienteConDieta ven = new ListadoPacienteConDieta();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jrListaPacientesDietaActionPerformed

    private void jrAdminPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAdminPacienteActionPerformed
       AdministrativoPacientes ven = new AdministrativoPacientes(0);
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jrAdminPacienteActionPerformed

    private void jrAdminComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAdminComidasActionPerformed
        AdministrativoListaComidas ven = new AdministrativoListaComidas();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jrAdminComidasActionPerformed

    private void jrAdminDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAdminDietasActionPerformed
       AdministrativoDieta ven = new AdministrativoDieta();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
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
            java.util.logging.Logger.getLogger(EscritorioColor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritorioColor3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlAdmin;
    private javax.swing.JLabel jlHome;
    private javax.swing.JLabel jlListas;
    private rsbuttom.RSButtonMetro jrAdminComidas;
    private rsbuttom.RSButtonMetro jrAdminDietas;
    private rsbuttom.RSButtonMetro jrAdminPaciente;
    private rsbuttom.RSButtonMetro jrFichaPaciente;
    private rsbuttom.RSButtonMetro jrListaComidas;
    private rsbuttom.RSButtonMetro jrListaDietas;
    private rsbuttom.RSButtonMetro jrListaPacientes;
    private rsbuttom.RSButtonMetro jrListaPacientesDieta;
    private rsbuttom.RSButtonMetro jrNuevaDieta;
    private rsbuttom.RSButtonMetro jrSalir;
    private javax.swing.JSeparator js1;
    private javax.swing.JSeparator js2;
    private javax.swing.JSeparator js3;
    private rsbuttom.RSButtonMetro jtNuevoPaciente;
    // End of variables declaration//GEN-END:variables

    private void ajustarTamanioFondo() {
        Dimension desktopSize = escritorio.getSize();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
        Image imagen = icono.getImage().getScaledInstance(desktopSize.width, desktopSize.height, Image.SCALE_SMOOTH);
        icono.setImage(imagen);
        fondo.setIcon(icono);
    }
     
} // llave final
