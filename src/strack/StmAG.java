package strack;

import Clases.ConexionEDI;
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
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class StmAG extends javax.swing.JFrame {
    private DefaultComboBoxModel modelagevent;
    private DefaultComboBoxModel modelagedo;
    public StmAG() {
        modelagevent = new DefaultComboBoxModel(new String [] {});
        modelagedo = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        llenaemevento();
        llenaemedo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTcarga = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtRemitente = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCartax3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTracto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRem1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCPO1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtBol = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtZh = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtCiudad = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFchAG = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txthrAG = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
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
        tbnCrear.setText("Crear");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Origen y Destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel14.setText("Carga:");

        txtTcarga.setEditable(false);
        txtTcarga.setBorder(null);

        jLabel20.setText("Peso:");

        txtPeso.setEditable(false);
        txtPeso.setBorder(null);

        jLabel28.setText("Remitente:");

        txtRemitente.setEditable(false);
        txtRemitente.setBorder(null);

        jLabel29.setText("Destinatario:");

        txtDestinatario.setEditable(false);
        txtDestinatario.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTcarga, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDestinatario)
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTcarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Orden de Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setText("Cartaporte:");

        txtCartax3.setEditable(false);
        txtCartax3.setBorder(null);

        jLabel9.setText("Unidad:");

        jLabel10.setText("Remolque:");

        txtRem1.setEditable(false);
        txtRem1.setBorder(null);

        jLabel8.setText("CPO:");

        txtCPO1.setEditable(false);
        txtCPO1.setBorder(null);

        jLabel17.setText("No. BOL:");

        txtBol.setEditable(false);
        txtBol.setBorder(null);
        txtBol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTracto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(txtRem1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPO1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBol, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTracto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtBol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtCPO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evento de actualización", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(349, 151));

        jLabel19.setText("Zona Hrs:");

        txtZh.setEditable(false);
        txtZh.setBorder(null);

        jLabel31.setText("Ciudad:");

        jLabel33.setText("Estado:");

        jLabel15.setText("Evento:");

        jLabel16.setText("Fecha:");

        jLabel18.setText("Hora:");

        jComboBox1.setModel(modelagevent);

        jComboBox2.setModel(modelagedo);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFchAG, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txthrAG, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtZh, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtFchAG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txthrAG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtZh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Transacción 214 (Actualización de ETA)");

        jLabel32.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }                                        
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    String idAF, txtTerminal, txtFCarta;
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        FechaSit();
        String opcion1 = jComboBox1.getSelectedItem().toString();
        String opcion2 = jComboBox2.getSelectedItem().toString();
        if(txtCPO1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Actualice los datos.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtTracto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de unidad.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(opcion1.equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Seleccione un evento.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFchAG.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de fecha","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txthrAG.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de hora","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtCiudad.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo ciudad","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(opcion2.equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Seleccione un estado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            try {
                unidad();
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(StmAG.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }//GEN-LAST:event_tbnCrearActionPerformed
    
   
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        clearForm();
    }//GEN-LAST:event_tbnCrear1ActionPerformed

    private void txtBolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBolActionPerformed
    
    String edo,edo1;       
    public void unidad() throws SQLException, ParseException{
        String expresion ="([a-zA-Z0-9_]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtTracto.getText());
            mach.find();
        if(mach.matches()){            
            formatofecha();
        }else{
            JOptionPane.showMessageDialog(null,"El campo unidad no acepta caracteres especiales","Informativo",JOptionPane.INFORMATION_MESSAGE);   
        }
    }
    
    String fmt;
    public void formatofecha() throws SQLException, ParseException{
        fmt="0000-00-00"; 
        if(fmt.length() == txtFchAG.getText().length()){            
            StringTokenizer tokens = new StringTokenizer (txtFchAG.getText(),"-");
            if(tokens.countTokens() ==3){
            String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtFchAG.getText());
            mach.find();
            amd();        
            }else{
               JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else {
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }     
    }
    
    public void amd() throws SQLException, ParseException{
        String anioa=fchag.substring(0,4);
        int num1 = Integer.parseInt(anioa);
        String mesa=fchag.substring(5,7);
        int num2 = Integer.parseInt(mesa);
        String diaa=fchag.substring(8,10);
        int num3 = Integer.parseInt(diaa);
        
        String anio=txtFchAG.getText().substring(0,4);
        int num4 = Integer.parseInt(anio);
        String mes=txtFchAG.getText().substring(5,7);
        int num5 = Integer.parseInt(mes);
        String dia=txtFchAG.getText().substring(8,10);
        int num6 = Integer.parseInt(dia);
        
        if(num6 > 0 && num4 <= num1 && num5 <= 12 && num6 <= 31 ){
            formatoETA();
        }else{
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    public void formatoETA() throws SQLException, ParseException{
        String fh1=txthrAG.getText();  
        String hv="00:00";
        if(hv.length() == txthrAG.getText().length()){
            StringTokenizer tokens = new StringTokenizer (txthrAG.getText(),":");
                if(tokens.countTokens() ==2){
                String expresion ="([0-9:0-9]+)";
                Pattern exp =Pattern.compile(expresion);
                Matcher mach = exp.matcher(txthrAG.getText());
                mach.find();
                        String hr,mm;
                        hr=txthrAG.getText().substring(0,2);
                        mm=txthrAG.getText().substring(3,5);
                        int hm1,hm2;
                        hm1= Integer.parseInt(hr);
                        hm2= Integer.parseInt(mm);
                        if(hm1>=0 && hm1<24 && hm2>=0 && hm2<60){
                            validacionAG();
                            //RegistroAG();
                        }else{
                            JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                        }              
                }else{
                    JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else{
           JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }

    /*Metodo para stars automatico*/
    public void queryprocess(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from tb_edi where reference_number='"+txtCartax3.getText()+"' and transaction_type='AG' and ETA_DATE  between DATEADD(HH,-8,GETDATE())  and  DATEADD(hh,+8, GETDATE()) ORDER BY code desc");  
                if(rs1.next() == true){
                    txtFchAG.setText(rs1.getString("eta_date").substring(0,10));
                    txthrAG.setText(rs1.getString("eta_date").substring(11,16));
                    String cdedo=rs1.getString("pickup_city");
                    if(cdedo==null||"null".equals(cdedo)||cdedo.equals("null")){
                        txtCiudad.setText("");
                    }else{
                        txtCiudad.setText(rs1.getString("pickup_city"));
                    }
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
           
    public void clearForm(){
        txtFchAG.setText("");
        txthrAG.setText("");
        jComboBox1.setSelectedItem("Seleccione");
        jComboBox2.setSelectedItem("Seleccione");
        txtCiudad.setText("");
    }    
    
    String fchag;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchag=datefecha1.format(date); 
    }
    
    
//select CartaporteAF,fchDescg,hrsDescg from TBL_REG_AF_1 where CartaporteAF='TOL174454'
//VALIDAR EN FORMULARIO DE AG CREADO DE X1
    public void validacionAG() throws SQLException, ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("SELECT * FROM TBL_REG_X1_1 where Archivox1='creado' and Cartaportex1='"+txtCartax3.getText()+"'"); 
                if(rs1.next() == true){
                    ActionEvent evt = null;
                    exitForm(evt); 
                }else{
                   RegistroAG(); 
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }    
    }   
    
    String cartaAG;
    public void RegistroAG() throws SQLException, ParseException{
        String numCadena =idAF;
        int numEntero = Integer.parseInt(numCadena);
        cartaAG=txtTerminal+txtFCarta;
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    Statement st=(Statement)miConexion.createStatement();
                    st.execute("insert into TBL_REG_HIST_AG (CartaporteAG,folioAG,ter_cartaAG,ReasonCodeAG,UnidadAG,RemolqueAG,fechaAG,horaAG,zhAG,ciudadAG,Estado,pais,usuario,ArchivoAG,stinterno,idAF) "
                    + "values('"+txtCartax3.getText().trim()+"','"+txtFCarta+"','"+txtTerminal+"','"+jComboBox1.getSelectedItem().toString().toUpperCase()+"','"+txtTracto.getText().toUpperCase().trim()+"','"+txtRem1.getText().trim()+"','"+txtFchAG.getText().trim()+"','"+txthrAG.getText().trim()+"','"+txtZh.getText()+"','"+txtCiudad.getText().toUpperCase().trim()+"','"+jComboBox2.getSelectedItem().toString().toUpperCase()+"','MX','"+txtUserf1.getText().toUpperCase()+"','"+"REGISTRADO"+"','"+"0"+"','"+numEntero+"')");
                    AGactual();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
        } 
        ActionEvent evt = null;
        exitForm(evt);     
    }
    
    public void AGactual() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchag;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_HIST_AG set FchAG=? where cartaporteAG='"+txtCartax3.getText()+"' ");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.executeUpdate();                     
                    AG_Factual();
                    JOptionPane.showMessageDialog(null,"Movimiento registrado!","Informativo",JOptionPane.INFORMATION_MESSAGE);                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }             
    }
    
    public void AG_Factual() throws ParseException{
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set AGETA='"+"AG-ETA"+"',fchDescg='"+txtFchAG.getText()+"',hrsDescg='"+txthrAG.getText()+"' where CartaporteAF='"+txtCartax3.getText()+"'");
//            PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set AGETA='"+"AG-ETA"+"',fchAG='"+txtFchAG.getText()+"',hrAG='"+txthrAG.getText()+"' where CartaporteAF='"+txtCartax3.getText()+"'");
            stp.executeUpdate();
            panelx1();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }            
    }
    
    public void panelx1() throws SQLException, ParseException{
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set mag='1',unidad='"+txtTracto.getText()+"',rem1='"+txtRem1.getText()+"' where cartaporte='"+txtCartax3.getText()+"'");
                stp.executeUpdate();                    
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void llenaemevento(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_CTA_REASON_CODE where edo='0'");
            modelagevent.addElement("Seleccione");
                while(rs1.next()){
                    modelagevent.addElement(rs1.getString("codigo")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void llenaemedo(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_EDO");
            modelagedo.addElement("Seleccione");
                while(rs1.next()){
                    modelagedo.addElement(rs1.getString("prefijo")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtBol;
    public javax.swing.JTextField txtCPO1;
    public javax.swing.JTextField txtCartax3;
    public javax.swing.JTextField txtCiudad;
    public javax.swing.JTextField txtDestinatario;
    public javax.swing.JTextField txtFchAG;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtRem1;
    public javax.swing.JTextField txtRemitente;
    public javax.swing.JTextField txtTcarga;
    public javax.swing.JTextField txtTracto;
    public javax.swing.JTextField txtUserf1;
    public javax.swing.JTextField txtZh;
    public javax.swing.JTextField txthrAG;
    // End of variables declaration//GEN-END:variables
}