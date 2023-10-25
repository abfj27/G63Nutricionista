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
import vistasdieta.*;
import vistaspaciente.*;

// Color Oscuro: 3B6B41
// Color Medio: C1EAC6
// Color Claro: E3EEE4

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
        escritorio = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(227, 238, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 1026));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 107, 65));
        jLabel1.setText("PACIENTES");

        rSButtonMetro2.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargar.png"))); // NOI18N
        rSButtonMetro2.setText("Nueva");
        rSButtonMetro2.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(59, 107, 65), 1, true));
        rSButtonMetro2.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro2.setColorNormal(new java.awt.Color(193, 234, 198));
        rSButtonMetro2.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro2.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro2.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro2.setColorTextPressed(new java.awt.Color(193, 234, 198));

        rSButtonMetro1.setBackground(new java.awt.Color(227, 238, 228));
        rSButtonMetro1.setForeground(new java.awt.Color(59, 107, 65));
        rSButtonMetro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lista.png"))); // NOI18N
        rSButtonMetro1.setText("Lista    ");
        rSButtonMetro1.setColorHover(new java.awt.Color(130, 186, 137));
        rSButtonMetro1.setColorNormal(new java.awt.Color(193, 234, 198));
        rSButtonMetro1.setColorPressed(new java.awt.Color(59, 107, 65));
        rSButtonMetro1.setColorTextHover(new java.awt.Color(59, 107, 65));
        rSButtonMetro1.setColorTextNormal(new java.awt.Color(59, 107, 65));
        rSButtonMetro1.setColorTextPressed(new java.awt.Color(193, 234, 198));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(59, 107, 65));
        jLabel2.setText(" DIETAS");

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 749, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSButtonMetro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(755, 755, 755))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
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
    private javax.swing.JPanel jPanel1;
    private rsbuttom.RSButtonMetro rSButtonMetro1;
    private rsbuttom.RSButtonMetro rSButtonMetro2;
    // End of variables declaration//GEN-END:variables
}
