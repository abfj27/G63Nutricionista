package vistas01;

import entidades.Comida;
import entidades.Dieta;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import vistasadministracion.*;
import vistascomida.*;
import vistaspaciente.*;

/* Color:
[59,107,65]
[193,234,198]
[130,186,137]
[227,238,228]
*/

public class EscritorioColor extends javax.swing.JFrame {

    public EscritorioColor() {
        initComponents();
        this.setTitle("NutriVida Suite");
        this.setLocationRelativeTo(null);
        Dimension desktopSize = escritorio.getSize();
        ImageIcon icono = new ImageIcon(getClass().getResource("/Imagenes/Fondo.png"));
        JLabel fondo = new JLabel(icono);
        fondo.setBounds(0, 0, icono.getIconWidth(), icono.getIconHeight());
        escritorio.add(fondo, JLayeredPane.FRAME_CONTENT_LAYER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        rSButtonMetro1 = new rsbuttom.RSButtonMetro();
        jLabel2 = new javax.swing.JLabel();
        rSButtonMetro4 = new rsbuttom.RSButtonMetro();
        jLabel3 = new javax.swing.JLabel();
        rSButtonMetro5 = new rsbuttom.RSButtonMetro();
        rSButtonMetro6 = new rsbuttom.RSButtonMetro();
        rSButtonMetro7 = new rsbuttom.RSButtonMetro();
        jLabel4 = new javax.swing.JLabel();
        rSButtonMetro8 = new rsbuttom.RSButtonMetro();
        rSButtonMetro9 = new rsbuttom.RSButtonMetro();
        rSButtonMetro10 = new rsbuttom.RSButtonMetro();
        rSButtonMetro11 = new rsbuttom.RSButtonMetro();
        rSButtonMetro12 = new rsbuttom.RSButtonMetro();
        jSeparator1 = new javax.swing.JSeparator();
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 238, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 1026));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 107, 65));
        jLabel1.setText("COMIDA");

        rSButtonMetro2.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        rSButtonMetro2.setText("Cargar");
        rSButtonMetro2.setColorBorde(null);
        rSButtonMetro2.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro2.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro2.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro2.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro2.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro2.setColorTextPressed(new java.awt.Color(227, 238, 228));

        rSButtonMetro1.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro1.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ficha.png"))); // NOI18N
        rSButtonMetro1.setText("Ficha    ");
        rSButtonMetro1.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro1.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro1.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro1.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro1.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro1.setColorTextPressed(new java.awt.Color(227, 238, 228));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(59, 107, 65));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("PACIENTES");

        rSButtonMetro4.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro4.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandeja comida.png"))); // NOI18N
        rSButtonMetro4.setText("Comidas ");
        rSButtonMetro4.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro4.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro4.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro4.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro4.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro4.setColorTextPressed(new java.awt.Color(227, 238, 228));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(59, 107, 65));
        jLabel3.setText("LISTAS");

        rSButtonMetro5.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro5.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        rSButtonMetro5.setText("Paciente");
        rSButtonMetro5.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro5.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro5.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro5.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro5.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro5.setColorTextPressed(new java.awt.Color(227, 238, 228));

        rSButtonMetro6.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro6.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pacientes con dieta.png"))); // NOI18N
        rSButtonMetro6.setText("P/Dietas");
        rSButtonMetro6.setAlignmentX(0.5F);
        rSButtonMetro6.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro6.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro6.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro6.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro6.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro6.setColorTextPressed(new java.awt.Color(227, 238, 228));

        rSButtonMetro7.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro7.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta.png"))); // NOI18N
        rSButtonMetro7.setText("Dietas     ");
        rSButtonMetro7.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro7.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro7.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro7.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro7.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro7.setColorTextPressed(new java.awt.Color(227, 238, 228));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(59, 107, 65));
        jLabel4.setText("ADMIN");

        rSButtonMetro8.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro8.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        rSButtonMetro8.setText("Pacientes");
        rSButtonMetro8.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro8.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro8.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro8.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro8.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro8.setColorTextPressed(new java.awt.Color(227, 238, 228));

        rSButtonMetro9.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro9.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/dieta.png"))); // NOI18N
        rSButtonMetro9.setText("Dietas    ");
        rSButtonMetro9.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro9.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro9.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro9.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro9.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro9.setColorTextPressed(new java.awt.Color(227, 238, 228));

        rSButtonMetro10.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro10.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandeja comida.png"))); // NOI18N
        rSButtonMetro10.setText("Comidas");
        rSButtonMetro10.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro10.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro10.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro10.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro10.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro10.setColorTextPressed(new java.awt.Color(227, 238, 228));

        rSButtonMetro11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        rSButtonMetro11.setText(" Cargar");
        rSButtonMetro11.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(59, 107, 65), 1, true));
        rSButtonMetro11.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro11.setColorNormal(new java.awt.Color(227, 238, 228));
        rSButtonMetro11.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro11.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro11.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro11.setColorTextPressed(new java.awt.Color(227, 238, 228));

        rSButtonMetro12.setBackground(new java.awt.Color(130, 186, 137));
        rSButtonMetro12.setForeground(new java.awt.Color(51, 51, 51));
        rSButtonMetro12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        rSButtonMetro12.setText("SALIR");
        rSButtonMetro12.setColorHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro12.setColorNormal(new java.awt.Color(130, 186, 137));
        rSButtonMetro12.setColorPressed(new java.awt.Color(227, 238, 228));
        rSButtonMetro12.setColorTextHover(new java.awt.Color(227, 238, 228));
        rSButtonMetro12.setColorTextNormal(new java.awt.Color(51, 51, 51));
        rSButtonMetro12.setColorTextPressed(new java.awt.Color(59, 107, 65));

        jSeparator1.setBackground(new java.awt.Color(95, 127, 122));
        jSeparator1.setForeground(new java.awt.Color(95, 127, 122));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonMetro6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonMetro7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonMetro8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonMetro12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonMetro10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rSButtonMetro9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rSButtonMetro11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rSButtonMetro5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(rSButtonMetro12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(EscritorioColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscritorioColor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscritorioColor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro10;
    private rsbuttom.RSButtonMetro rSButtonMetro11;
    private rsbuttom.RSButtonMetro rSButtonMetro12;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    private rsbuttom.RSButtonMetro rSButtonMetro4;
    private rsbuttom.RSButtonMetro rSButtonMetro5;
    private rsbuttom.RSButtonMetro rSButtonMetro6;
    private rsbuttom.RSButtonMetro rSButtonMetro7;
    private rsbuttom.RSButtonMetro rSButtonMetro8;
    private rsbuttom.RSButtonMetro rSButtonMetro9;
    // End of variables declaration//GEN-END:variables
}
