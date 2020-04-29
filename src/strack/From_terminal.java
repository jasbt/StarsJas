package strack;

import Clases.ConexionEDI;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class From_terminal extends javax.swing.JFrame {

    public From_terminal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtTerminal = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtPrefijo = new javax.swing.JTextField();
        jcbestado = new javax.swing.JCheckBox();
        tbnCrear1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();
        lblencabezado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("From terminal");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbnCrear.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        tbnCrear.setText("Guardar");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de terminal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(302, 193));

        jLabel28.setText("Terminal:");

        jLabel30.setText("Prefijo:");

        txtPrefijo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jcbestado.setText("Estado");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jcbestado)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbestado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtPrefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbnCrear1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel17.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUserf1))
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tbnCrear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tbnCrear1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1)))
                    .addComponent(lblencabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblencabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1)
                    .addComponent(tbnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
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
        
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        FechaSit();
        if(txtTerminal.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese la terminal","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtPrefijo.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese el prefijo","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            try {
                actualiza();
            } catch (ParseException | SQLException ex) {
                Logger.getLogger(From_terminal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }//GEN-LAST:event_tbnCrearActionPerformed
     
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        txtTerminal.setText("");
        txtPrefijo.setText("");
    }//GEN-LAST:event_tbnCrear1ActionPerformed
    
    public void actualiza() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx3;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from tbl_terminal where prefijo='"+txtPrefijo.getText()+"'");
                if(rs1.next() == true){
                    if (!jcbestado.isSelected()){
                        PreparedStatement stp=miConexion.prepareStatement("update tbl_terminal set fch_registro=?,terminal='"+txtTerminal.getText().toUpperCase()+"',estado='1',usuario='"+txtUserf1.getText().toUpperCase()+"' where prefijo='"+txtPrefijo.getText()+"'");
                        java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                        stp.setTimestamp(1,timestamp);
                        stp.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Actualización correcta","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                        ActionEvent evt = null;
                        exitForm(evt);                        
                    } else if (jcbestado.isSelected()){
                        PreparedStatement stp=miConexion.prepareStatement("update tbl_terminal set fch_registro=?,terminal='"+txtTerminal.getText().toUpperCase()+"',estado='0',usuario='"+txtUserf1.getText().toUpperCase()+"' where prefijo='"+txtPrefijo.getText()+"'");
                        java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                        stp.setTimestamp(1,timestamp);
                        stp.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Actualización correcta","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                        ActionEvent evt = null;
                        exitForm(evt);  
                    }  
                }else {
                    PreparedStatement stp=miConexion.prepareStatement("insert into TBL_TERMINAL (fch_registro,terminal,prefijo,usuario,estado) values "
                    + "(?,'"+txtTerminal.getText().toUpperCase()+"','"+txtPrefijo.getText().toUpperCase()+"','"+txtUserf1.getText().toUpperCase()+"','"+"0"+"')"); 
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Registro correcto","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                    ActionEvent evt = null;
                    exitForm(evt); 
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
        ActionEvent evt = null;
        exitForm(evt);         
    }     
     
    String fchx3;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchx3=datefecha1.format(date);          
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JCheckBox jcbestado;
    public javax.swing.JLabel lblencabezado;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtPrefijo;
    public javax.swing.JTextField txtTerminal;
    public javax.swing.JTextField txtUserf1;
    // End of variables declaration//GEN-END:variables
}