package strack;

import Clases.ConexionEDI;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StmCPO extends javax.swing.JFrame {
    public StmCPO() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtcarga = new javax.swing.JTextField();
        txtcpo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtorigen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtrecorrido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txttiempo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtantes = new javax.swing.JTextField();
        txtdespues = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcbactivar = new javax.swing.JCheckBox();
        tbnCrear1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        tbnCrear.setText("Guardar");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de la ruta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setText("CPO:");

        jLabel9.setText("Tipo de carga:");

        jLabel3.setText("Origen:");

        jLabel4.setText("Destino:");

        jLabel5.setText("Recorrido:");

        jLabel10.setText("Tiempo de carga:");

        jLabel6.setText("Limite antes");

        jLabel11.setText("Limite despues");

        jcbactivar.setText("Activar ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcarga, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbactivar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtorigen, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdestino))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtantes, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdespues))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtrecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(txtcarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbactivar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtorigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(txttiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrecorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11)
                    .addComponent(txtdespues, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Control de Rutas");

        jLabel32.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbnCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbnCrear1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }                                        
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        validar();
    }//GEN-LAST:event_tbnCrearActionPerformed
       
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        clearForm();
    }//GEN-LAST:event_tbnCrear1ActionPerformed
          
    public void clearForm(){
        txttiempo.setText("");
        txtantes.setText("");
        txtdespues.setText("");
        txtrecorrido.setText("");
    }    
    
    int a;
    public void validar(){
        if(txtrecorrido.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Indique el tiempo de reccorrido.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txttiempo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Indique el tiempo asignado para cargar","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtantes.equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Indique el tiempo antes de alerta de entrega","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtdespues.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Indique el tiempo despues de alerta de entrega","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            System.out.println("GUARDAR");
            if(jcbactivar.isSelected()==true){
                a=1;
            }
            else{
                a=0;
            }
            
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            try {
               Statement statement =(Statement)miConexion.createStatement();
               ResultSet rs1 = statement.executeQuery("select * from tbl_Reg_CPO where CPO='"+txtcpo.getText()+"' and estado='ACTIVO'");
                    if(rs1.next() == true){
                        statement.execute("update tbl_Reg_CPO set lim_antes='"+txtantes.getText()+"',lim_desp='"+txtdespues.getText()+"',hrstransito='"+txtrecorrido.getText()+"',HrsTrans='"+txttiempo.getText()+"',alerta='"+a+"' where cpo='"+txtcpo.getText().toUpperCase()+"' ");
                        JOptionPane.showMessageDialog(null, "La ruta se ha actualizado", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);     
                                ActionEvent evt = null;
                                exitForm(evt); 
                    }else {
                        JOptionPane.showMessageDialog(null, "Ruta no actualizada", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                    }
            } catch (HeadlessException | SQLException ex) {
                System.out.println("Error SQL Registro "+ex.getMessage());
                JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
            }                         
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JCheckBox jcbactivar;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtUserf1;
    public javax.swing.JTextField txtantes;
    public javax.swing.JTextField txtcarga;
    public javax.swing.JTextField txtcpo;
    public javax.swing.JTextField txtdespues;
    public javax.swing.JTextField txtdestino;
    public javax.swing.JTextField txtorigen;
    public javax.swing.JTextField txtrecorrido;
    public javax.swing.JTextField txttiempo;
    // End of variables declaration//GEN-END:variables
}