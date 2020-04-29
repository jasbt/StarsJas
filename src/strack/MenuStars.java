package strack;

import Clases.ConexionEDI;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MenuStars extends javax.swing.JFrame {

    public MenuStars() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblzh = new javax.swing.JLabel();
        btnVentana1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnVentana2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Marco de trabajo");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Movimientos de Stars");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marco de Trabajo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        btnVentana1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        btnVentana1.setText("Movimientos cancelados");
        btnVentana1.setToolTipText("Mov. Stars Cancelados");
        btnVentana1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentana1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cono.png"))); // NOI18N
        jButton2.setText("Panel general de stars");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnVentana2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/negocios.png"))); // NOI18N
        btnVentana2.setText("Recepción de Doctos");
        btnVentana2.setToolTipText("Recepción de Doctos");
        btnVentana2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentana2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/FIN1.png"))); // NOI18N
        jButton3.setText("Revision");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/rueda-dentada.png"))); // NOI18N
        jButton4.setText("edek");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tres.png"))); // NOI18N
        jButton5.setText("Construccion");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lblzh)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVentana1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVentana2)
                .addGap(0, 77, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVentana1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVentana2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblzh))
        );

        jScrollPane1.setToolTipText("bmb,mn,mnm,n,mnm,n,mn,mn");

        jTextPane1.setEditable(false);
        jTextPane1.setText("Reporte de eventos, codificados electronicamente; que permite identificar y evaluar los sucesos que ocurren en viaje. Empleando el uso de transacciones diseñadas para el transportista (214), STARS (Shipping Tracking Analysis and Reporting System)");
        jTextPane1.setToolTipText("Definición.");
        jScrollPane1.setViewportView(jTextPane1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setToolTipText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    private void btnVentana1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentana1ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' and stpa='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    CancelStars_edek canven=new CancelStars_edek();
                    canven.lblUserVF.setText(txtUserf1.getText());
                    canven.setVisible(true);                                        
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensaje infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btnVentana1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND Stars='1'");
                if(rs1.next() == true){
                        //TBL_STARS_GRAL_Edek canven=new TBL_STARS_GRAL_Edek();
                        this.setVisible(true);
                        TBL_STARS_GRAL_Actual canven=new TBL_STARS_GRAL_Actual();
                        canven.lblUserVF.setText(txtUserf1.getText());
                        canven.setVisible(true);                                                  
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensaje infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void btnVentana2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentana2ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND rdoctos='1'");
                if(rs1.next() == true){
                    this.setVisible(true);
                    tbl_Reg_Doctos_edek doc=new tbl_Reg_Doctos_edek();
                    doc.lblUserVF.setText(txtUserf1.getText());
                    doc.setVisible(true);                                           
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensaje infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }         
    }//GEN-LAST:event_btnVentana2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(true);
        Reportes_stars_edek canven=new Reportes_stars_edek();
        canven.lblUserVF.setText(txtUserf1.getText());
        canven.setVisible(true);          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where usuario='"+txtUserf1.getText()+"' ");
                if(rs1.next() == true){
                    if(rs1.getString("usuario").equals("YAZMIN")){
                        this.setVisible(true);
                        TBL_STARS_GRAL_Edek canven=new TBL_STARS_GRAL_Edek();
                        canven.lblUserVF.setText(txtUserf1.getText());
                        canven.setVisible(true);                         
                    }else{
                        JOptionPane.showMessageDialog(null,"Acceso denegado", "Advertencia",JOptionPane.WARNING_MESSAGE);
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Acceso denegado", "Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }         
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JOptionPane.showMessageDialog(null,"Modulo de pruebas","Mensaje infomativo",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton5ActionPerformed
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVentana1;
    private javax.swing.JButton btnVentana2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblzh;
    public javax.swing.JTextField txtUserf1;
    // End of variables declaration//GEN-END:variables
}