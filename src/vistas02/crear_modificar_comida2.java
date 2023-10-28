package vistas02;

import controlDatos.ComidaData;
import entidades.Comida;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import stuff.Utileria;

/**
 *
 * @author Equipo
 */
public class crear_modificar_comida2 extends javax.swing.JInternalFrame {

    private int mouseX, mouseY;
    private ComidaData cd = new ComidaData();
    private int estadoReciv;

    public crear_modificar_comida2(Comida comida) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

        ImageIcon guardarIcon = new ImageIcon(getClass().getResource("/Imagenes/cargar verde.png"));
        ImageIcon modificarIcon = new ImageIcon(getClass().getResource("/Imagenes/editar.png"));

        if (String.valueOf(comida).equals("null")) {
//            jLtitulo.setText("Crear Comida");
            jbModificar.setIcon(guardarIcon);
            jbModificar.setText("GUARDAR");
        } else {
            estadoReciv = comida.getEstado();
            jLid.setText(String.valueOf(comida.getIdComida()));
            jTnombre.setText(comida.getNombre());
            jTdetalle.setText(comida.getDetalle());
            jTcalorias.setText(String.valueOf(comida.getCalorias()));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLid = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTcalorias = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTdetalle = new javax.swing.JTextArea();
        jrCerrar = new vistas02rsbuttom.RSButtonMetro();
        jbModificar = new vistas02rsbuttom.RSButtonMetro();

        setBackground(new java.awt.Color(235, 235, 231));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gestion de Comida", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Verdana", 1, 16), new java.awt.Color(41, 65, 43))); // NOI18N
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
        jLabel1.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(41, 65, 43));
        jLabel3.setText("Nombre:");

        jTnombre.setBackground(new java.awt.Color(246, 246, 246));
        jTnombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTnombre.setForeground(new java.awt.Color(59, 107, 65));
        jTnombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jTnombre.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jTnombre.setSelectionColor(new java.awt.Color(130, 186, 137));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(41, 65, 43));
        jLabel4.setText("Detalle:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(41, 65, 43));
        jLabel2.setText("Calorias:");

        jTcalorias.setBackground(new java.awt.Color(246, 246, 246));
        jTcalorias.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTcalorias.setForeground(new java.awt.Color(59, 107, 65));
        jTcalorias.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jTcalorias.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jTcalorias.setSelectionColor(new java.awt.Color(130, 186, 137));
        jTcalorias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTcaloriasKeyTyped(evt);
            }
        });

        jTdetalle.setBackground(new java.awt.Color(246, 246, 246));
        jTdetalle.setColumns(20);
        jTdetalle.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTdetalle.setForeground(new java.awt.Color(59, 107, 65));
        jTdetalle.setRows(5);
        jTdetalle.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(154, 179, 155), 2, true));
        jTdetalle.setCaretColor(new java.awt.Color(59, 107, 65));
        jTdetalle.setSelectedTextColor(new java.awt.Color(59, 107, 65));
        jTdetalle.setSelectionColor(new java.awt.Color(130, 186, 137));
        jScrollPane2.setViewportView(jTdetalle);

        jrCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar rojo.png"))); // NOI18N
        jrCerrar.setText("CERRAR");
        jrCerrar.setColorBorde(new javax.swing.border.LineBorder(new java.awt.Color(130, 186, 137), 1, true));
        jrCerrar.setFocusPainted(false);
        jrCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrCerrarActionPerformed(evt);
            }
        });

        jbModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        jbModificar.setText("MODIFICAR");
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
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jTcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcaloriasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcaloriasKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            if (evt.getKeyChar() == 32 || evt.getKeyChar() == 127) {
                evt.consume();
            }
            if ((evt.getKeyChar() >= 33 && evt.getKeyChar() <= 126) || (evt.getKeyChar() >= 128 && evt.getKeyChar() <= 255)) {
                evt.consume();
                Utileria.mensaje("Solo se permite numeros enteros");
            }
        }
    }//GEN-LAST:event_jTcaloriasKeyTyped

    private void jrCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrCerrarActionPerformed
        Object[] op = {"Aceptar", "Cancelar"};
        int i = JOptionPane.showOptionDialog(this, "Desea cerrar?", title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, frameIcon, op, "Aceptar");
        if (i == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jrCerrarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        Comida comida = new Comida();
        if (jbModificar.getText() == "MODIFICAR") {
            comida.setIdComida(Integer.valueOf(jLid.getText()));
        }
        if (jTnombre.getText().isEmpty() || jTdetalle.getText().isEmpty() || jTcalorias.getText().isEmpty()) {
            Utileria.mensaje("No se permite campos vacios");
            return;
        }
        comida.setNombre(jTnombre.getText());
        comida.setDetalle(jTdetalle.getText());
        comida.setCalorias(Integer.valueOf(jTcalorias.getText()));
        if (jbModificar.getText() == "MODIFICAR") {
            comida.setEstado(estadoReciv);
        } else {
            comida.setEstado(2);
        }
        if (jbModificar.getText().equals("GUARDAR")) {
            cd.cargarComida(comida);
        } else {
            cd.modificarComida(comida);
        }
        if (jbModificar.getText().equals("MODIFICAR")) {
            dispose();
        }
        limpiarCampos();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLid;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTcalorias;
    private javax.swing.JTextArea jTdetalle;
    private javax.swing.JTextField jTnombre;
    private vistas02rsbuttom.RSButtonMetro jbModificar;
    private vistas02rsbuttom.RSButtonMetro jrCerrar;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        jTnombre.setText("");
        jTdetalle.setText("");
        jTcalorias.setText("");
    }

    public void dispose() {
        for (InternalFrameListener listener : getInternalFrameListeners()) {
            listener.internalFrameClosed(new InternalFrameEvent(this, InternalFrameEvent.INTERNAL_FRAME_CLOSED));
        }
        super.dispose();
    }
}
