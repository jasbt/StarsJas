package strack;

import Clases.ConexionEDI;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Loguer extends javax.swing.JFrame {

    public Loguer() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        jLabel4.setText("Supertrack S.A de C.V");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesión");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("STRACK_EDI");

        jLabel2.setText("Usuario:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Contraseña:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sesion.png"))); // NOI18N
        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Supertrack S.A de C.V");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1)))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(txt1))
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtUsuario.setText("");
        txt1.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    
    String nomUsuario;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String usuario = txtUsuario.getText();
        String password=txt1.getText();      
        if((password.isEmpty() && usuario.isEmpty())){
            JOptionPane.showMessageDialog(null,"Ingrese su nombre de usuario y contraseña");
        }else{
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("SELECT NombreU,Contrasenia,NomCompleto FROM tbl_Usuarios Where NombreU='"+usuario+"'and Contrasenia='"+password+"' and estado='ACTIVO'");
                if(rs1.next() == true){
                    nomUsuario=rs1.getString("NomCompleto");
                    MenuGeneral pl = new  MenuGeneral();
                    pl.lblUser.setText(txtUsuario.getText());
                    pl.setVisible(true);
                    this.setVisible(false);                                        
                }else {
                    JOptionPane.showMessageDialog(null,"Verifique los datos ingresados","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error, intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
            }
        }//fin de else
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        String usuario = txtUsuario.getText();
        String password=txt1.getText();      
        if((password.isEmpty() && usuario.isEmpty()))        {
            JOptionPane.showMessageDialog(null,"Ingrese los campo solicitados","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        } else {
           Connection miConexion =(Connection)ConexionEDI.GetConnection();
            try {
                Statement statement =(Statement)miConexion.createStatement();
                ResultSet rs1 = statement.executeQuery("SELECT NombreU,Contrasenia,NomCompleto FROM tbl_Usuarios Where NombreU='"+usuario+"'and Contrasenia='"+password+"' and estado='ACTIVO'");                
                if(rs1.next() == true){
                    nomUsuario=rs1.getString("NomCompleto");
                    MenuGeneral pl = new  MenuGeneral();
                    pl.lblUser.setText(txtUsuario.getText());
                    pl.setVisible(true);
                    this.setVisible(false);                                        
                }else {
                    JOptionPane.showMessageDialog(null,"Verifique los datos ingresados","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error, intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_txt1ActionPerformed
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField txt1;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}