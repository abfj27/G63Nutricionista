package vistas2;

import controlDatos.DietaComidaData;
import entidades.DietaComida;
import entidades.Horario;
import entidades.Porcion;
import javax.swing.JOptionPane;
import stuff.Utileria;

public class ModificarDietaComida extends javax.swing.JInternalFrame {

    private int aux;
    private DietaComida dcV;
    private int idDietaV;
    private int idComidaV;

    public ModificarDietaComida() {
        initComponents();
        cargarCombo();
    }

    public ModificarDietaComida(DietaComida dc) {
        initComponents();
        cargarCombo();
        aux = 1;
        dcV = dc;
    }

    public ModificarDietaComida(int idDieta, int idComida) {
        initComponents();
        cargarCombo();
        aux = 2;
        idDietaV = idDieta;
        idComidaV = idComida;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcHorario = new javax.swing.JComboBox<>();
        jcPorcion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jbAceptar = new javax.swing.JButton();
        jbCerrar = new javax.swing.JButton();

        jLabel1.setText("Horario:");

        jLabel2.setText("Porcion:");

        jbAceptar.setText("Aceptar");
        jbAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarActionPerformed(evt);
            }
        });

        jbCerrar.setText("Cancelar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jcPorcion, 0, 150, Short.MAX_VALUE)
                            .addComponent(jcHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(jbCerrar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcHorario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcPorcion)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAceptar)
                    .addComponent(jbCerrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbCerrarActionPerformed

    private void jbAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarActionPerformed
        DietaComidaData dcdata = new DietaComidaData();
        if (aux == 1) {
            dcV.setHorario((Horario) jcHorario.getSelectedItem());
            dcV.setPorcion((Porcion) jcPorcion.getSelectedItem());
            dcdata.cargarDietaComida(dcV);
            this.dispose();
        } else if (aux == 2) {
            DietaComida dc = dcdata.buscarDC(idDietaV, idComidaV);
            dc.setHorario((Horario) jcHorario.getSelectedItem());
            dc.setPorcion((Porcion) jcPorcion.getSelectedItem());
            dcdata.modificarDietaComida(dc);
            this.dispose();
        }
    }//GEN-LAST:event_jbAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbAceptar;
    private javax.swing.JButton jbCerrar;
    private javax.swing.JComboBox<Horario> jcHorario;
    private javax.swing.JComboBox<Porcion> jcPorcion;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
//        jcHorario.removeAllItems();
        for (Horario aux : Horario.values()) {
            jcHorario.addItem(aux);
        }
//        jcPorcion.removeAllItems();
        for (Porcion aux : Porcion.values()) {
            jcPorcion.addItem(aux);
        }
    }

}
