package strack;

import Clases.ConexionEDI;
import java.awt.event.ActionEvent;
import java.io.IOException;
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

public class Stmx3 extends javax.swing.JFrame {
    private DefaultComboBoxModel modelx3;
    public Stmx3() {
        modelx3 = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        llenaemx3();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCartax3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCPO = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTracto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRem1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFchCarga = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtHrCarga = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtZh = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtTcarga2 = new javax.swing.JTextField();
        txtPeso2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtRemitente = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtdesinatario = new javax.swing.JTextField();
        tbnCrear1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Arribo a cargar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Orden de Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setText("Cartaporte:");

        txtCartax3.setEditable(false);
        txtCartax3.setBorder(null);

        jLabel8.setText("CPO:");

        txtCPO.setEditable(false);
        txtCPO.setBorder(null);

        jLabel22.setText("Transporte:");

        txtTransporte.setEditable(false);
        txtTransporte.setBorder(null);

        jLabel9.setText("Unidad:");

        jLabel10.setText("Remolque:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(22, 22, 22)
                        .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel22)
                        .addGap(12, 12, 12)
                        .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTracto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRem1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTracto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evento de arribo a destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        jLabel15.setText("Evento:");

        jLabel16.setText("Fecha:");

        jLabel18.setText("Hora:");

        jLabel19.setText("Zona Hrs:");

        txtZh.setEditable(false);
        txtZh.setBorder(null);

        jComboBox1.setModel(modelx3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtZh))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFchCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHrCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
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
                    .addComponent(txtFchCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtHrCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtZh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Origen y Destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(302, 193));

        jLabel24.setText("Carga:");

        jLabel27.setText("Peso:");

        txtTcarga2.setEditable(false);
        txtTcarga2.setBorder(null);

        txtPeso2.setEditable(false);
        txtPeso2.setBorder(null);

        jLabel28.setText("Remitente:");

        txtRemitente.setEditable(false);
        txtRemitente.setBorder(null);

        jLabel30.setText("Destinatario:");

        txtdesinatario.setEditable(false);
        txtdesinatario.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTcarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdesinatario))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRemitente)))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtdesinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtTcarga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jLabel5.setText("Transacción 214 (x3 Llegada a Cargar)");

        jLabel17.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1)
                    .addComponent(tbnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //exitForm(evt);
        dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    String idx3, recorrido,txtOrigen2,txtDestino2,txtCDrem,txtcddestino;
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        FechaSit();
        String opcion = jComboBox1.getSelectedItem().toString();
        if(txtCPO.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Actualice los datos.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtTracto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de unidad.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtRem1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de remolque.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(opcion.equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Seleccione un evento.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFchCarga.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de fecha","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtHrCarga.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de hora","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            try {
                unidad();//REVISA MOV. NO CREADO
            } catch (IOException | ParseException ex) {
                Logger.getLogger(Stmx3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }//GEN-LAST:event_tbnCrearActionPerformed
    
    public void errorx3() throws IOException, ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where Cartaportex3='"+txtCartax3.getText()+"'and ArchivoX3='CREADO' and categoria='IR' AND ERROR !='710'");
                if(rs1.next() == true){
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set categoria=NULL ,ArchivoX3='',error=NULL where CartaporteX3='"+txtCartax3.getText()+"' ");
                    stp.executeUpdate();
                }else{ 
                    System.out.println("errorx3()");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
         
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        ClearForm();
    }//GEN-LAST:event_tbnCrear1ActionPerformed
    
    public void unidad() throws IOException, ParseException {
        String expresion ="([a-zA-Z0-9_]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtTracto.getText());
            mach.find();
        if(mach.matches()){            
            remolque();
        }else{
            JOptionPane.showMessageDialog(null,"El campo unidad no acepta caracteres especiales","Informativo",JOptionPane.INFORMATION_MESSAGE);   
        }
    }
    
    public void remolque() throws IOException, ParseException{  
        String expresion ="([0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtRem1.getText());
            mach.find();
        if(mach.matches()){ 
            formatofecha();
        }else{
            JOptionPane.showMessageDialog(null,"El campo remolque debe contener unicamente números","Informativo",JOptionPane.INFORMATION_MESSAGE);   
        }        
    }
    
    String fmt;
    public void formatofecha() throws IOException, ParseException{
        fmt="0000-00-00"; 
        if(fmt.length() == txtFchCarga.getText().length()){            
            StringTokenizer tokens = new StringTokenizer (txtFchCarga.getText(),"-");
            System.out.println(""+tokens.countTokens());
            if(tokens.countTokens() ==3){
            String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtFchCarga.getText());
            mach.find();
            amd();        
            }else{
               JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else {
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }      
    }
    
    public void amd() throws IOException, ParseException{
        String anioa=fchx3.substring(0,4);
        int num1 = Integer.parseInt(anioa);
        String mesa=fchx3.substring(5,7);
        int num2 = Integer.parseInt(mesa);
        String diaa=fchx3.substring(8,10);
        int num3 = Integer.parseInt(diaa);
        
        String anio=txtFchCarga.getText().substring(0,4);
        int num4 = Integer.parseInt(anio);
        String mes=txtFchCarga.getText().substring(5,7);
        int num5 = Integer.parseInt(mes);
        String dia=txtFchCarga.getText().substring(8,10);
        int num6 = Integer.parseInt(dia);
        
        if(num5 > 0 && num6 > 0 && num4 <= num1 && num5 <= 12 && num6 <= 31 ){
            formatohora();
        }else{
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    public void formatohora() throws IOException, ParseException{
        String fh1=txtHrCarga.getText();
        String hv="00:00";
        if(hv.length() == txtHrCarga.getText().length()){
            StringTokenizer tokens = new StringTokenizer (txtHrCarga.getText(),":");
                if(tokens.countTokens() ==2){
                String expresion ="([0-9:0-9]+)";
                Pattern exp =Pattern.compile(expresion);
                Matcher mach = exp.matcher(txtHrCarga.getText());
                mach.find();
                        String hr,mm;
                        hr=txtHrCarga.getText().substring(0,2);
                        mm=txtHrCarga.getText().substring(3,5);
                        System.out.println(hr+"..."+mm);
                        int hm1,hm2;
                        hm1= Integer.parseInt(hr);
                        hm2= Integer.parseInt(mm);
                        if(hm1>=0 && hm1<24 && hm2>=0 && hm2<60){
                            //convenio();
                            CreaRegistra(); 
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
    
    public void CreaRegistra() throws IOException, ParseException{
        int i =JOptionPane.showConfirmDialog(this, "Confirma los datos de arribo a carga"+"\n"+" para la carta porte: '"+txtCartax3.getText()+"' ? ",
                "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(i == 0){
            try {
                RegistroX3();
            } catch (SQLException ex) {
                Logger.getLogger(Stmx3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(i == 1){
            JOptionPane.showMessageDialog(null,"Movimiento no registrado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
   
    public void RegistroX3() throws SQLException, ParseException{        
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx3;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set FechaX3=?,error=null, categoria=null, hstransito='"+recorrido+"',usuario='"+txtUserf1.getText().toUpperCase()+"',cd_Origen='"+txtCDrem.toUpperCase().trim()+"',Remitente='"+txtRemitente.getText().toUpperCase().trim()+"',cd_Destino='"+txtcddestino.toUpperCase().trim()+"',Destinatario='"+txtdesinatario.getText().toUpperCase().trim()+"',fecha='"+fchx3.substring(0,10)+"',equipo='"+txtTransporte.getText().trim().toUpperCase()+"', Creado='MANUAL',unidadx3='"+txtTracto.getText()+"',remolquex3='"+txtRem1.getText()+"',VALOR_CLI_RUBRO1='"+txtCPO.getText()+"',origen_nom='"+txtOrigen2+"',destinatario_nom='"+txtDestino2+"',fchx3='"+txtFchCarga.getText()+"',"
                    + "Hrx3='"+txtHrCarga.getText()+"',Carga='"+txtTcarga2.getText().toUpperCase()+"',Peso='"+txtPeso2.getText()+"',ReasonCodex3='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"',Archivox3='CREADO',stinterno='0',zhx3='"+txtZh.getText()+"', VALOR_CLI_RUBRO6='"+" "+"' where cartaportex3='"+txtCartax3.getText()+"'");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.executeUpdate();
                    panelx1();
                    ValiPrevioAF();
                    JOptionPane.showMessageDialog(null,"Movimiento registrado!","Informativo",JOptionPane.INFORMATION_MESSAGE);   
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }        //Regresa a la ventana principal 
            ActionEvent evt = null;
            exitForm(evt); 
    }
    
    public void panelx1() throws SQLException, ParseException{
        System.out.println( txtFchCarga.getText()+" "+txtHrCarga.getText()+":00.000");
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = txtFchCarga.getText()+" "+txtHrCarga.getText()+":00.000";
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set fecha_real_carga=?,unidad='"+txtTracto.getText()+"',rem1='"+txtRem1.getText()+"',mx3='1' where cartaporte='"+txtCartax3.getText()+"'");
                java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                stp.setTimestamp(1,timestamp);
                stp.executeUpdate();                    
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
       
    public void ValiPrevioAF(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){
                   System.out.println("el registro previo af existe");
                }else {
                  PrevioAF();  
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void PrevioAF() throws SQLException{
        String numCadena =idx3;
        int numEntero = Integer.parseInt(numCadena);
        System.out.println("Pre-registro de AF");
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    Statement st=(Statement)miConexion.createStatement();
                    st.execute("insert into TBL_REG_AF_1(CartaporteAF,id_x3) values('"+txtCartax3.getText()+"','"+numEntero+"')");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }    
    }
   
    public void ClearForm(){
        jComboBox1.setSelectedItem("Seleccione");
        txtFchCarga.setText("");
        txtHrCarga.setText("");
    }
        
    String fchx3;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchx3=datefecha1.format(date);          
    }
    
    public void llenaemx3(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_CTA_REASON_CODE where edo='0'");
            modelx3.addElement("Seleccione");
                while(rs1.next()){
                    modelx3.addElement(rs1.getString("codigo")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtCPO;
    public javax.swing.JTextField txtCartax3;
    public javax.swing.JTextField txtFchCarga;
    public javax.swing.JTextField txtHrCarga;
    public javax.swing.JTextField txtPeso2;
    public javax.swing.JTextField txtRem1;
    public javax.swing.JTextField txtRemitente;
    public javax.swing.JTextField txtTcarga2;
    public javax.swing.JTextField txtTracto;
    public javax.swing.JTextField txtTransporte;
    public javax.swing.JTextField txtUserf1;
    public javax.swing.JTextField txtZh;
    public javax.swing.JTextField txtdesinatario;
    // End of variables declaration//GEN-END:variables
}