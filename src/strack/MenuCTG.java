package strack;

import Clases.ConexionEDI;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MenuCTG extends javax.swing.JFrame {

    public MenuCTG() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblzh = new javax.swing.JLabel();
        btnX3 = new javax.swing.JButton();
        btnAF = new javax.swing.JButton();
        btnAF1 = new javax.swing.JButton();
        btnAF2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menú de Cta.");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Módulo de Catalogos");

        btnX3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/EXP1.png"))); // NOI18N
        btnX3.setText("Cta.Errores");
        btnX3.setToolTipText("Cta. Errores edi");
        btnX3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnX3ActionPerformed(evt);
            }
        });

        btnAF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/negocios.png"))); // NOI18N
        btnAF.setText("Cta.Codigos");
        btnAF.setToolTipText("Cta. Reason code");
        btnAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAFActionPerformed(evt);
            }
        });

        btnAF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/posicion.png"))); // NOI18N
        btnAF1.setText("Terminales");
        btnAF1.setToolTipText("Cta. Terminal");
        btnAF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAF1ActionPerformed(evt);
            }
        });

        btnAF2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/signos-1.png"))); // NOI18N
        btnAF2.setText("Asig. terminal");
        btnAF2.setToolTipText("Cta. Terminal");
        btnAF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAF2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lblzh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnX3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAF1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAF2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                        .addGap(0, 9, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnX3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAF2)
                    .addComponent(btnAF1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblzh))
        );

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
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(5, 5, 5)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAFActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND CtaEDI='1'");
                if(rs1.next() == true){  
                    this.setVisible(true);
                    TBL_cta_rc po1=new TBL_cta_rc ();
                    po1.lblUserVF.setText(txtUserf1.getText());
                    po1.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnAFActionPerformed

    private void btnX3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnX3ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND CtaEDI='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    TBLl_CODE_ERROR cpo1=new TBLl_CODE_ERROR();
                    cpo1.lblUserVF.setText(txtUserf1.getText());
                    cpo1.setVisible(true);                    
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btnX3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          exitForm(evt);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAF1ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND ctaTer='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    tbl_terminales ter=new tbl_terminales();
                    ter.lblUserVF.setText(txtUserf1.getText());
                    ter.setVisible(true);                     
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_btnAF1ActionPerformed

    private void btnAF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAF2ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND ctaTer='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    tbl_terminales_asignadas ter=new tbl_terminales_asignadas();
                    ter.lblUserVF.setText(txtUserf1.getText());
                    ter.setVisible(true);                     
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado "+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAF2ActionPerformed

    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAF;
    private javax.swing.JButton btnAF1;
    private javax.swing.JButton btnAF2;
    private javax.swing.JButton btnX3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblzh;
    public javax.swing.JTextField txtUserf1;
    // End of variables declaration//GEN-END:variables
}