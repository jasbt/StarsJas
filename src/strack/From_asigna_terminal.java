package strack;

import Clases.ConexionEDI;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class From_asigna_terminal extends javax.swing.JFrame {
    private DefaultComboBoxModel modeluser;
    
    public From_asigna_terminal() {
        modeluser = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        listauser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtTerminal = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jcbusuario = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtprefijo = new javax.swing.JTextField();
        tbnCrear1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();
        txtEncabezado = new javax.swing.JTextField();

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

        txtTerminal.setEditable(false);
        txtTerminal.setBorder(null);

        jLabel29.setText("Usuario:");

        jcbusuario.setModel(modeluser
        );

        jLabel30.setText("Prefijo:");

        txtprefijo.setEditable(false);
        txtprefijo.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(txtprefijo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbusuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtprefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jcbusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        txtEncabezado.setEditable(false);
        txtEncabezado.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtEncabezado.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtUserf1))
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(tbnCrear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tbnCrear1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1)
                    .addComponent(tbnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
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
        if(jcbusuario.getSelectedItem().toString().equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Indique un usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            try {
                guardar();
            } catch (SQLException ex) {
                Logger.getLogger(From_asigna_terminal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }//GEN-LAST:event_tbnCrearActionPerformed
     
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        ClearForm();
    }//GEN-LAST:event_tbnCrear1ActionPerformed
     
    public void ClearForm(){
        txtTerminal.setText("");
    }
        
    String fchx3;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchx3=datefecha1.format(date);          
    }
    
    public void listauser(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_usuarios where estado='activo'");
            modeluser.addElement("Seleccione");
                while(rs1.next()){
                    modeluser.addElement(rs1.getString("nombreu").toUpperCase());                    
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public void guardar() throws SQLException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from tbl_terminal_asignacion where prefijo='"+txtprefijo.getText()+"' and usuario='"+jcbusuario.getSelectedItem().toString().toUpperCase()+"'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(this, "El usuario ya cuenta con la terminal","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);    
                }else {
                    statement.execute("insert into tbl_terminal_asignacion (usuario,prefijo,estatus) values('"+jcbusuario.getSelectedItem().toString().toUpperCase()+"','"+txtprefijo.getText()+"','0')"); 
                    JOptionPane.showMessageDialog(this, "Registro correcto","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                    ActionEvent evt = null;
                    exitForm(evt);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> jcbusuario;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtEncabezado;
    public javax.swing.JTextField txtTerminal;
    public javax.swing.JTextField txtUserf1;
    public javax.swing.JTextField txtprefijo;
    // End of variables declaration//GEN-END:variables
}