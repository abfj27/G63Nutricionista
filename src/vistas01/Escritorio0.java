package vistas01;

import entidades.Comida;
import entidades.Dieta;
import javax.swing.JOptionPane;
import vistasadministracion.*;
import vistascomida.*;
import vistasdieta.*;
import vistaspaciente.*;

public class Escritorio0 extends javax.swing.JFrame {

    public Escritorio0() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmNuevaDieta = new javax.swing.JMenuItem();
        jmListaDietas = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmNuevoPaciente = new javax.swing.JMenuItem();
        jmListaPacientes = new javax.swing.JMenuItem();
        jmPacientesDieta = new javax.swing.JMenuItem();
        jmFichaPaciente = new javax.swing.JMenuItem();
        jmModificarPaciente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmNuevaComida = new javax.swing.JMenuItem();
        jmListaComidas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmAdmComidas = new javax.swing.JMenuItem();
        jmAdmPacientes = new javax.swing.JMenuItem();
        jmAdmDietas = new javax.swing.JMenuItem();
        jmbSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 843, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 706, Short.MAX_VALUE)
        );

        jMenu1.setText("Gestion Dieta");

        jmNuevaDieta.setText("Nueva Dieta");
        jmNuevaDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNuevaDietaActionPerformed(evt);
            }
        });
        jMenu1.add(jmNuevaDieta);

        jmListaDietas.setText("Lista Dietas");
        jmListaDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaDietasActionPerformed(evt);
            }
        });
        jMenu1.add(jmListaDietas);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestion Paciente");

        jmNuevoPaciente.setText("Nuevo Paciente");
        jmNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNuevoPacienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmNuevoPaciente);

        jmListaPacientes.setText("Lista Pacientes");
        jmListaPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaPacientesActionPerformed(evt);
            }
        });
        jMenu2.add(jmListaPacientes);

        jmPacientesDieta.setText("Pacientes con Dieta");
        jmPacientesDieta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPacientesDietaActionPerformed(evt);
            }
        });
        jMenu2.add(jmPacientesDieta);

        jmFichaPaciente.setText("Ficha Paciente");
        jmFichaPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFichaPacienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmFichaPaciente);

        jmModificarPaciente.setText("Modificar Paciente");
        jmModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmModificarPacienteActionPerformed(evt);
            }
        });
        jMenu2.add(jmModificarPaciente);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Gestion Comida");

        jmNuevaComida.setText("Nueva Comida");
        jmNuevaComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNuevaComidaActionPerformed(evt);
            }
        });
        jMenu3.add(jmNuevaComida);

        jmListaComidas.setText("Lista Comidas");
        jmListaComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaComidasActionPerformed(evt);
            }
        });
        jMenu3.add(jmListaComidas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Administracion");

        jmAdmComidas.setText("Adm Comidas");
        jmAdmComidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdmComidasActionPerformed(evt);
            }
        });
        jMenu4.add(jmAdmComidas);

        jmAdmPacientes.setText("Adm Pacientes");
        jmAdmPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdmPacientesActionPerformed(evt);
            }
        });
        jMenu4.add(jmAdmPacientes);

        jmAdmDietas.setText("Adm Dietas");
        jmAdmDietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdmDietasActionPerformed(evt);
            }
        });
        jMenu4.add(jmAdmDietas);

        jMenuBar1.add(jMenu4);

        jmbSalir.setText("Salir");
        jmbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmbSalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmbSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmNuevaDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNuevaDietaActionPerformed
        Dieta dieta = new Dieta();
        dieta.setIdDieta(0);
        NuevaDietaVen ven = new NuevaDietaVen(dieta);
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmNuevaDietaActionPerformed

    private void jmListaDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaDietasActionPerformed
        ListaDietaVen ven = new ListaDietaVen();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmListaDietasActionPerformed

    private void jmNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNuevoPacienteActionPerformed
        NuevoPaciente ven = new NuevoPaciente();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmNuevoPacienteActionPerformed

    private void jmPacientesDietaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPacientesDietaActionPerformed
        ListadoPacienteConDieta ven = new ListadoPacienteConDieta();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmPacientesDietaActionPerformed

    private void jmFichaPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFichaPacienteActionPerformed
        FichaPaciente ven = new FichaPaciente();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmFichaPacienteActionPerformed

    private void jmModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmModificarPacienteActionPerformed
        ModificarPaciente ven = new ModificarPaciente();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmModificarPacienteActionPerformed

    private void jmNuevaComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNuevaComidaActionPerformed
        Comida com = null;
        crear_modificar_comida ven = new crear_modificar_comida(com);
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmNuevaComidaActionPerformed

    private void jmListaComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaComidasActionPerformed
        ListaComidas ven = new ListaComidas();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmListaComidasActionPerformed

    private void jmAdmComidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdmComidasActionPerformed
        AdministrativoListaComidas ven = new AdministrativoListaComidas();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmAdmComidasActionPerformed

    private void jmAdmPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdmPacientesActionPerformed
        AdministrativoPacientes ven = new AdministrativoPacientes(0);
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmAdmPacientesActionPerformed

    private void jmAdmDietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdmDietasActionPerformed
        AdministrativoDieta ven = new AdministrativoDieta();
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);
    }//GEN-LAST:event_jmAdmDietasActionPerformed

    private void jmbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmbSalirActionPerformed
        int option = JOptionPane.showConfirmDialog(
                this,
                "¿Estás seguro de que quieres cerrar la aplicación?",
                "Confirmación de cierre",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jmbSalirActionPerformed

    private void jmListaPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaPacientesActionPerformed
        AdministrativoPacientes ven = new AdministrativoPacientes(1);
        escritorio.removeAll();
        escritorio.repaint();
        ven.setVisible(true);
        escritorio.add(ven);
        escritorio.moveToFront(ven);    }//GEN-LAST:event_jmListaPacientesActionPerformed

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
            java.util.logging.Logger.getLogger(Escritorio0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Escritorio0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Escritorio0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Escritorio0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Escritorio0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jmAdmComidas;
    private javax.swing.JMenuItem jmAdmDietas;
    private javax.swing.JMenuItem jmAdmPacientes;
    private javax.swing.JMenuItem jmFichaPaciente;
    private javax.swing.JMenuItem jmListaComidas;
    private javax.swing.JMenuItem jmListaDietas;
    private javax.swing.JMenuItem jmListaPacientes;
    private javax.swing.JMenuItem jmModificarPaciente;
    private javax.swing.JMenuItem jmNuevaComida;
    private javax.swing.JMenuItem jmNuevaDieta;
    private javax.swing.JMenuItem jmNuevoPaciente;
    private javax.swing.JMenuItem jmPacientesDieta;
    private javax.swing.JMenu jmbSalir;
    // End of variables declaration//GEN-END:variables
}
