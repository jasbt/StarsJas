package strack;

import Clases.ConexionEDI;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class From_Configuracion extends javax.swing.JFrame {
    
    public From_Configuracion() {       
        initComponents();
        setLocationRelativeTo(null);     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtApartado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtparametro1 = new javax.swing.JTextField();
        txtparametro2 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtparametro3 = new javax.swing.JTextField();
        jcbestado = new javax.swing.JCheckBox();
        tbnCrear1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración de parametros");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar1.png"))); // NOI18N
        tbnCrear.setText("Guardar");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de parametrización", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 1, 14), new java.awt.Color(0, 0, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel2.setText("Clave:");

        txtclave.setEditable(false);
        txtclave.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txtclave.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel8.setText("Apartado:");

        txtApartado.setEditable(false);
        txtApartado.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        txtApartado.setBorder(null);

        jLabel12.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel12.setText("Descripción:");

        txtDescripcion.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel13.setText("Parametro a:");

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel14.setText("Parametro b:");

        txtparametro1.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N

        txtparametro2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel15.setText("Parametro c:");

        txtparametro3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N

        jcbestado.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jcbestado.setText("Activar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jcbestado))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion)
                            .addComponent(txtApartado)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtparametro1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtparametro3)
                            .addComponent(txtparametro2))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApartado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtparametro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtparametro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtparametro3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Configuración de parametros.");

        jLabel17.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        FechaSit();
        try {
            actualizar();
        } catch (SQLException ex) {
            Logger.getLogger(From_Configuracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbnCrearActionPerformed

    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        txtparametro1.setText("");
        txtparametro2.setText("");
        txtparametro3.setText("");
        txtDescripcion.setText("");
    }//GEN-LAST:event_tbnCrear1ActionPerformed
    
    String fchap;
    public void FechaSit(){
        Date date = new Date();
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchap=datefecha1.format(date);  
    }
    
    public void actualizar() throws SQLException{
        if (!jcbestado.isSelected()){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchap;
        Date fechaj = null;
        try {
            fechaj = formatoDelTexto.parse(strFecha);
        } catch (ParseException ex) {
        }
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                PreparedStatement stp=miConexion.prepareStatement("update configuracion_modulo set fecha=?,edo='0',parametro_1='"+txtparametro1.getText()+"',parametro_2='"+txtparametro2.getText()+"',valores='"+txtparametro3.getText()+"' where clave='"+txtclave.getText()+"'");
                java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                stp.setTimestamp(1,timestamp);
                stp.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualización se ha completando ", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                ActionEvent evt = null;
                exitForm(evt); 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar. Intente nuevamente ", "Mensaje error", JOptionPane.ERROR_MESSAGE);  
            }
        }             
        }else if (jcbestado.isSelected()){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchap;
        Date fechaj = null;
        try {
            fechaj = formatoDelTexto.parse(strFecha);
        } catch (ParseException ex) {
        }
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                PreparedStatement stp=miConexion.prepareStatement("update configuracion_modulo set fecha=?,edo='1',parametro_1='"+txtparametro1.getText()+"',parametro_2='"+txtparametro2.getText()+"',valores='"+txtparametro3.getText()+"' where clave='"+txtclave.getText()+"'");
                java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                stp.setTimestamp(1,timestamp);
                stp.executeUpdate();
                JOptionPane.showMessageDialog(null, "Actualización se ha completando", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                ActionEvent evt = null;
                exitForm(evt); 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al guardar. Intente nuevamente ", "Mensaje error", JOptionPane.ERROR_MESSAGE);  
            }
        }            
        }              
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JCheckBox jcbestado;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtApartado;
    public javax.swing.JTextField txtDescripcion;
    public javax.swing.JTextField txtUserf1;
    public javax.swing.JTextField txtclave;
    public javax.swing.JTextField txtparametro1;
    public javax.swing.JTextField txtparametro2;
    public javax.swing.JTextField txtparametro3;
    // End of variables declaration//GEN-END:variables
}