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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class tbl_sregistro_mov extends javax.swing.JFrame {
    private DefaultComboBoxModel error;
    
    public tbl_sregistro_mov() {
        error = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        llenacode();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCartax3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jrbproductivo = new javax.swing.JRadioButton();
        jrbcancelacion = new javax.swing.JRadioButton();
        jrbretiro = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jcbcategoria = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jcbmovimiento = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcbcodigo = new javax.swing.JComboBox<>();
        tbnCrear1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro Movimientos");

        jButton1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbnCrear.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/rueda-dentada.png"))); // NOI18N
        tbnCrear.setText("Procesar");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de carta porte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Carta porte:");

        txtCartax3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtCartax3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Tipo de  movimiento:");

        buttonGroup1.add(jrbproductivo);
        jrbproductivo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbproductivo.setText("Productivo");

        buttonGroup1.add(jrbcancelacion);
        jrbcancelacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbcancelacion.setText("Cancelación");

        buttonGroup1.add(jrbretiro);
        jrbretiro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jrbretiro.setText("Retiro");
        jrbretiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbretiroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Categoria:");

        jcbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "IA", "IE", "IR" }));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Movimiento:");

        jcbmovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "X3", "AF", "X1", "AP" }));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Código:");

        jcbcodigo.setModel(error);

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
                        .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbproductivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbcancelacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbretiro))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbmovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jcbmovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jcbcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jrbproductivo)
                    .addComponent(jrbcancelacion)
                    .addComponent(jrbretiro))
                .addGap(13, 13, 13))
        );

        tbnCrear1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel23.setText("Registrar Movimientos");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel27.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtUserf1.setBorder(null);

        jButton2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/flecha.png"))); // NOI18N
        jButton2.setText("Liberar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        TBL_STARS_GRAL_Edek mg=new TBL_STARS_GRAL_Edek();
//        mg.lblUserVF.setText(txtUserf1.getText());
//        mg.setVisible(true);
//        this.setVisible(false);
        exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        FechaSit();
        if ( !txtCartax3.getText().equals("") && !jcbmovimiento.getSelectedItem().toString().equals("todos") && (( !jrbproductivo.isSelected() && !jrbcancelacion.isSelected() && !jrbretiro.isSelected() ) )){
            try {
                validarMovimiento();
            } catch (SQLException | ParseException ex) {
                Logger.getLogger(tbl_sregistro_mov.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!txtCartax3.getText().equals("")){
            if(jcbmovimiento.getSelectedItem().toString().equals("Todos") && ( !jrbproductivo.isSelected() && !jrbcancelacion.isSelected() && !jrbretiro.isSelected() ) ){
                JOptionPane.showMessageDialog(null, "Indique el proceso a realizar");
                return;
            }else if(jcbmovimiento.getSelectedItem().toString().equals("Todos") && ( jrbproductivo.isSelected() || jrbcancelacion.isSelected() || jrbretiro.isSelected() ) ){
                System.out.println("stars"); 
                    if((!jrbcancelacion.isSelected()) && (!jrbproductivo.isSelected()) && (!jrbretiro.isSelected()) ){
                        JOptionPane.showMessageDialog(null, "Indique el tipo de movimiento de stars");
                        return;
                    }else{
                        if((!jrbcancelacion.isSelected()) && (!jrbretiro.isSelected())  && (jrbproductivo.isSelected()) ){
                            try {
                                p1();
                            } catch (ParseException ex) {
                                Logger.getLogger(tbl_sregistro_mov.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else if((jrbcancelacion.isSelected()) && (!jrbretiro.isSelected())  && (!jrbproductivo.isSelected()) ){
                            try {
                                p2();
                            } catch (ParseException ex) {
                                Logger.getLogger(tbl_sregistro_mov.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }else if((!jrbcancelacion.isSelected()) && (jrbretiro.isSelected())  && (!jrbproductivo.isSelected()) ){
                            try {
                                p3();
                            } catch (ParseException ex) {
                                Logger.getLogger(tbl_sregistro_mov.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }  
            }else if(!jcbmovimiento.getSelectedItem().toString().equals("Todos") && ( !jrbproductivo.isSelected() && !jrbcancelacion.isSelected() && !jrbretiro.isSelected() ) ){
                try {
                    evaluarcategorias();
                } catch (SQLException ex) {
                    Logger.getLogger(tbl_sregistro_mov.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Indique el proceso a realizar");
                return;
            }
                                 
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);
        }   
    }//GEN-LAST:event_tbnCrearActionPerformed
       
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        buttonGroup1.clearSelection();
        txtCartax3.setText("");
        jcbmovimiento.setSelectedItem("Todos");
        jcbcodigo.setSelectedItem("Todos");
        jcbcategoria.setSelectedItem("Todos");
    }//GEN-LAST:event_tbnCrear1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){ 
                    liberar();
                }else {
                   JOptionPane.showMessageDialog(null,"No existe registro","Informativo",JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } catch (ParseException ex) {
            Logger.getLogger(tbl_sregistro_mov.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jrbretiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbretiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbretiroActionPerformed
     
    String fchx1;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchx1=datefecha1.format(date);  
    }

    public void validarMovimiento() throws SQLException, ParseException{
        switch (jcbmovimiento.getSelectedItem().toString()) {
            case "X3":
                movx3();
                break;
            case "AF":
                movAF();
                break;
            case "X1":
                movx1();
                break;
            case "AP":
                Connection miConexion =(Connection)ConexionEDI.GetConnection();
                try {
                   Statement statement =(Statement)miConexion.createStatement();
                    ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCartax3.getText()+"' and (Archivox3 is null or Archivox3 !='CREADO')");
                        if(rs1.next() == true){
                            apventana(); 
                        }else {
                            apretiro();
                        }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }                     
                break;
            default:
                break;
        }
    }
    
    /*Metodo de revisar la cartaporte en el movimiento x3*/
    public void p1() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){       
                    Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                    try {
                       Statement statement1 =(Statement)miConexion1.createStatement();
                        ResultSet rs11 = statement1.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCartax3.getText()+"' and unidad is not null");
                            if(rs11.next() == true){
                                productivo();
                                //movx3();                                                  
                            }else {
                                JOptionPane.showMessageDialog(null, "La carta porte no se puede procesar. Faltan datos.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                            }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                    } 
                }else {
                    JOptionPane.showMessageDialog(null, "La carta porte no existe","Informativo",JOptionPane.INFORMATION_MESSAGE);
                    //System.exit(0); 
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    
    public void productivo() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where  (Archivox3 is null or Archivox3 !='creado') and (AP50 is null or AP50 !='ap-aplicado') and cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){ 
                    movx3(); 
                    movAF();
                    movx1();
                    JOptionPane.showMessageDialog(null,"Proceso terminado.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                }else {
                   JOptionPane.showMessageDialog(null,"El movimiento no se puede procesar.","Informativo",JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String a,b,c,d,e,f,h,i,j;
    public void movx3() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where (Archivox3 is null or Archivox3 !='creado') and cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){                    
                        a=rs1.getString("ter_carta").trim();
                        b=rs1.getString("bitacora").trim();
                        c=rs1.getString("rem1").trim();
                        d=rs1.getString("VALOR_CLI_RUBRO1").trim();
                        d=d.replaceAll("CPO|cpo","");
                        e=rs1.getString("folio_carta").trim();
                        f=rs1.getString("unidad").trim();
                        h=rs1.getString("id_x3");
                        i=rs1.getString("fecha_carga").substring(0,10);
                        j=rs1.getString("fecha_carga").substring(11,16);  
                        convenio();                                           
                }else {
                    System.out.println("Movimiento ya registrado");
                    //movAF();
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String recorrido,txtOrigen2,txtDestino2,txtCDrem,txtcddestino,txtTcarga2,txtPeso2,txtRemitente,txtdesinatario,txtTransporte,carga;
    public void convenio() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_Reg_CPO where CPO ='"+d.trim()+"' and estado ='ACTIVO'");
                if(rs1.next() == true){
                    txtOrigen2=rs1.getString("cod_origen").trim();
                    txtDestino2=rs1.getString("cod_destino").trim();
                    txtTcarga2=rs1.getString("tipocarga").trim();
                    txtPeso2=rs1.getString("peso").trim();
                    txtRemitente=rs1.getString("nom_origen").trim();
                    txtCDrem=rs1.getString("cd_origen").trim();
                    txtdesinatario=rs1.getString("nom_destino").trim();
                    txtcddestino=rs1.getString("cd_destino").trim();
                    recorrido=rs1.getString("hrstransito").trim();
                    txtTransporte=rs1.getString("modo");
                    String code1="MATERIAL";
                        String code2=txtTcarga2;
                        boolean resultado=code2.contains(code1);
                        if(resultado){
                            carga="2";
                        }else{
                            carga="1";
                        }                  
                RegistroX3();                
                }else {
                    JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void RegistroX3() throws SQLException, ParseException{        
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set FechaX3=?,hstransito='"+recorrido+"',usuario='"+txtUserf1.getText().toUpperCase()+"',cd_Origen='"+txtCDrem.toUpperCase().trim()+"',Remitente='"+txtRemitente.toUpperCase().trim()+"',cd_Destino='"+txtcddestino.toUpperCase().trim()+"',Destinatario='"+txtdesinatario.toUpperCase().trim()+"',fecha='"+i+"',equipo='"+txtTransporte.trim().toUpperCase()+"', Creado='MANUAL',unidadx3='"+f+"',remolquex3='"+c+"',VALOR_CLI_RUBRO1='"+d+"',origen_nom='"+txtOrigen2+"',destinatario_nom='"+txtDestino2+"',fchx3='"+i+"',"
                    + "Hrx3='"+j+"',Carga='"+txtTcarga2.toUpperCase()+"',Peso='"+txtPeso2+"',ReasonCodex3='NS',Archivox3='CREADO',stinterno='1', error='',categoria='IA' where cartaportex3='"+txtCartax3.getText()+"'");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.executeUpdate();
                    panelx3(); 
                    movAF();
                    JOptionPane.showMessageDialog(null,"Movimiento registrado!","Informativo",JOptionPane.INFORMATION_MESSAGE);   
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            } 
    }    
    
    public void panelx3() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = i+" "+j+":00.000";
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set fecha_real_carga=?,unidad='"+f+"',rem1='"+c+"',mx3='1' where cartaporte='"+txtCartax3.getText()+"'");
                java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                stp.setTimestamp(1,timestamp);
                stp.executeUpdate();   
                ValiPrevioAF();
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
        String numCadena =h;
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
    
    /*Metodo de revisar la cartaporte en el movimiento AF*/
    String b1, b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25;
    public void movAF() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1_sp where (ArchivoAF is null or ArchivoAF !='creado') AND (Archivox3='CREADO') AND (Categoria is not null or Categoria !='ir') AND CartaporteAF='"+txtCartax3.getText()+"'");  
                if(rs1.next() == true){
                    System.out.println("puede registrar af");  
                    b1=rs1.getString("ter_carta");
                    b2=(rs1.getString("status_orden"));
                    b3=(rs1.getString("equipo"));
                    b4=rs1.getString("remolquex3");
                    b5=rs1.getString("VALOR_CLI_RUBRO1");
                    b6=rs1.getString("folio_carta");
                    b7=rs1.getString("unidadx3").trim();
                    b8=rs1.getString("carga");
                    b9=rs1.getString("fchx3").trim();
                    b10=rs1.getString("Hrx3").trim();
                    b11=rs1.getString("origen_nom");
                    b12=rs1.getString("destinatario_nom");
                    b13=rs1.getString("peso");
                    b16=rs1.getString("fecha_entrega").substring(0,10);
                    b17=rs1.getString("fecha_entrega").substring(11,16);
                    b18=rs1.getString("remitente").trim();
                    b19=rs1.getString("cd_origen").trim();
                    b20=rs1.getString("destinatario").trim();
                    b21=rs1.getString("cd_destino").trim();
                    b22=rs1.getString("zhx3").trim();
                    b23=rs1.getString("idAF");
                    b24=rs1.getString("fchAF");
                    b25=rs1.getString("hrAF");   
                    RegistroAF();
                }else {
                    System.out.println("movimiento af ya registrado");
                    //movx1();
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void RegistroAF() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set FechaAF=?,ErrorAF='',CategoriaAF='IA',Usuario='"+txtUserf1.getText().toUpperCase()+"',Fecha='"+fchx1.substring(0,10)+"',ter_cartaAF='"+b1+"',fchaf='"+b16+"',hraf='"+b17+"', hrsDescg='"+b17+"', fchDescg='"+b16+"', hrProg='"+b17+"', fchProg='"+b16+"',statusorden='"+b2+"', remolqueAF='"+b4+"', unidadAF='"+b7+"', destinoAF='"+b12+"', origenAF='"+b18+"', ReasonCodeAF='NS', FolioAF='"+b16+"', bol='MULTIPLE',ArchivoAF='CREADO',stinterno='1',CreadoAF='MANUAL',zhAF ='"+b22+"'"
                    + "where CartaporteAF='"+txtCartax3.getText()+"' ");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.executeUpdate();
                    panelAF();                   
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }    
    }
    
    public void panelAF() throws SQLException, ParseException{
        System.out.println( fchx1);
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set fecha_real_salida=?,unidad='"+b7+"',rem1='"+b4+"',maf='1' where cartaporte='"+txtCartax3.getText()+"'");
                java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                stp.setTimestamp(1,timestamp);
                stp.executeUpdate(); 
                ValiPreviox1();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
        
    public void ValiPreviox1() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where Cartaportex1='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){
                    System.out.println("el registro previo af existe");
                    //movx1();
                }else {
                  Previox1();  
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Previox1() throws SQLException, ParseException{
        String numCadena =b23;
        int numEntero = Integer.parseInt(numCadena);
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    Statement st=(Statement)miConexion.createStatement();
                    st.execute("insert into TBL_REG_X1_1 (Cartaportex1,idAF) values('"+txtCartax3.getText()+"','"+numEntero+"')");
                    movx1();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }    
    }
    
    /*Metodo de revisar la cartaporte en el movimiento x1*/
    String cc,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14, c15,c16,c17,c18,c19,c20;  
    public void movx1() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from  VTBL_REG_X1_STATUS_1 where (Archivox1 is null or Archivox1 !='creado') AND (ArchivoAF='CREADO') and Cartaportex1='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){
                    System.out.println("REGISTRAR X1+1");
                    cc=rs1.getString("ter_carta");
                    c1=rs1.getString("status_orden");
                    c2=rs1.getString("remolqueaf");
                    c3=rs1.getString("VALOR_CLI_RUBRO1");
                    c4=rs1.getString("folio_carta");
                    c5=rs1.getString("unidadaf").trim();
                    c6=rs1.getString("carga");
                    c7=rs1.getString("origen_nom");
                    c8=rs1.getString("destinatario_nom");
                    c9=rs1.getString("peso");
                    c10=rs1.getString("BOL");
                    c11=rs1.getString("EQUIPO");
                    c12=rs1.getString("fchaf").trim();
                    c13=rs1.getString("hraf").trim();                    
                    c14=rs1.getString("Remitente");
                    c15=rs1.getString("cd_Origen");
                    c16=rs1.getString("Destinatario");
                    c17=rs1.getString("cd_destino");                    
                    c18=rs1.getString("fchDescg");
                    c19=rs1.getString("hrsDescg");
                    c20=rs1.getString("zhx3").trim();  
                    Registrox1();
                }else {
                    //Registrox1();
                    //JOptionPane.showMessageDialog(null, "Proceso terminado ","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void Registrox1() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X1_1 set Fechax1=?,Errorx1='',Categoriax1='IA',usuario='"+txtUserf1.getText().toUpperCase()+"',hrx1='"+c19+"',StatusOB='"+c1+"', Remolquex1='"+c2+"', Unidadx1='"+c5+"', ReasonCodex1='NS', fchx1='"+c18+"',FolioX1='"+c4+"', ter_cartaX1='"+cc+"', Factura='MULTIPLE',Archivox1='CREADO',stinterno='1',Creacionx1='MANUAL',zhx1='"+c20+"'"
                    + "where CartaporteX1='"+txtCartax3.getText()+"' ");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.executeUpdate();
                    panelx1();                   
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }        //Regresa a la ventana principal de x1   
    } 
    
    public void panelx1() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set fecha_real_destino=?,unidad='"+c5+"',rem1='"+c2+"',mX1='1' where cartaporte='"+txtCartax3.getText()+"'");
                java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                stp.setTimestamp(1,timestamp);
                stp.executeUpdate();                  
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }  
    
    
    /*Metodo de revisar la cartaporte en el movimiento AP CANCELACION DE VENTANA*/
    public void p2() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){       
                    Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                    try {
                       Statement statement1 =(Statement)miConexion1.createStatement();
                        ResultSet rs11 = statement1.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCartax3.getText()+"' and unidad is not null");
                            if(rs11.next() == true){
                                apventana();                                  
                            }else {
                                JOptionPane.showMessageDialog(null, "La carta porte no se puede procesar. Faltan datos.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                            }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                    } 
                }else {
                    JOptionPane.showMessageDialog(null, "La carta porte no existe","Informativo",JOptionPane.INFORMATION_MESSAGE);
                    //System.exit(0); 
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String apv,apv1,apv2,apv3,apv4,apv5,apv6,apv7,apv8;  
    public void apventana() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCartax3.getText()+"' and (Archivox3 is null or Archivox3 !='CREADO')");
                if(rs1.next() == true){
                    apv=rs1.getString("ter_carta").trim();
                    apv1=rs1.getString("rem1").trim();
                    apv2=rs1.getString("VALOR_CLI_RUBRO1").trim();
                    apv3=rs1.getString("folio_carta").trim();
                    apv4=rs1.getString("folio_carta").trim();
                    apv5=rs1.getString("unidad").trim();
                    apv6=rs1.getString("fecha_carga").substring(0,10).trim();
                    apv7=rs1.getString("fecha_carga").substring(11,16).trim();
                    apv8=rs1.getString("zhx3").trim();                    
                    RegistroAPv();  
                    JOptionPane.showMessageDialog(null, "Proceso terminado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null,"La cancelación de ventana no se puede procesar.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void RegistroAPv() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
            
        SimpleDateFormat formatoDelTexto1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha1 = apv6.trim()+" 00:00:00.00";
            Date fechaK = null;
            try {
                fechaK = formatoDelTexto1.parse(strFecha1);
            } catch (ParseException ex) {
            }    

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set fchap=?,fcha_ap=?,hrap='"+apv7+"',reasoncodeap='"+"AY"+"',zhap='"+apv8+"',msj1='CANCELACION DE VENTANA',AP50='AP-APLICADO',userAP='"+txtUserf1.getText().toUpperCase()+"',stinternoAP='1',ErrorAP='',CategoriaAP='IA',Unidadap='"+apv5.toUpperCase()+"',Remolqueap='"+apv1.toUpperCase()+"' where cartaportex3='"+txtCartax3.getText()+"' ");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechaK.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.setTimestamp(2,timestamp1);
                    stp.executeUpdate();                    
                    ValiPrevioAFapv();                   
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }       
    }
        
    public void ValiPrevioAFapv() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set ArchivoAF='AP-50' where cartaporteAF='"+txtCartax3.getText()+"' ");
                    stp.executeUpdate();
                    panelapv();
                }else {
                    panelapv();
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void panelapv() throws SQLException, ParseException{     
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set unidad='"+apv5+"',rem1='"+apv1+"',cap='1' where cartaporte='"+txtCartax3.getText()+"'");
                stp.executeUpdate(); 
                //JOptionPane.showMessageDialog(null, "Proceso terminado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
        
    /*Metodo de revisar la cartaporte en el movimiento RETIRO DE UNIDAD*/
    public void p3() throws ParseException{
        System.out.println("retiro");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){       
                    Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                    try {
                       Statement statement1 =(Statement)miConexion1.createStatement();
                        ResultSet rs11 = statement1.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCartax3.getText()+"' and unidad is not null");
                            if(rs11.next() == true){
                                System.out.println("2");
                                validaaf();                                                 
                            }else {
                                JOptionPane.showMessageDialog(null, "La carta porte no se puede procesar. Faltan datos.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                            }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                    } 
                }else {
                    JOptionPane.showMessageDialog(null, "La carta porte no existe","Informativo",JOptionPane.INFORMATION_MESSAGE);
                    //System.exit(0); 
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    
    public void validaaf() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where (ArchivoAF is null or ArchivoAF ='CANCELADO' )   and cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){  
                    System.out.println("3");
                    apretiro(); 
                }else {
                    JOptionPane.showMessageDialog(null,"El movimiento no se puede procesar","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String ar1,br1,cr1,dr1,er1,fr1,hr1,ir1,jr1;
    public void apretiro() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where (Archivox3 is null or Archivox3 !='creado') and cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){                    
                        ar1=rs1.getString("ter_carta").trim();
                        br1=rs1.getString("bitacora").trim();
                        cr1=rs1.getString("rem1").trim();
                        dr1=rs1.getString("VALOR_CLI_RUBRO1").trim();
                        dr1=dr1.replaceAll("CPO|cpo","");
                        er1=rs1.getString("folio_carta").trim();
                        fr1=rs1.getString("unidad").trim();
                        hr1=rs1.getString("id_x3");
                        ir1=rs1.getString("fecha_carga").substring(0,10);
                        jr1=rs1.getString("fecha_carga").substring(11,16);  
                        convenioregistro();                                           
                }else {
                    movapretiro();
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    String txtOrigen22,txtDestino22,txtTcarga22,txtPeso22,txtRemitente2,txtCDrem2,txtdesinatario2,txtcddestino2,recorrido2,txtTransporte2,carga2;
    public void convenioregistro() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_Reg_CPO where CPO ='"+dr1.trim()+"' and estado ='ACTIVO'");
                if(rs1.next() == true){
                    txtOrigen22=rs1.getString("cod_origen").trim();
                    txtDestino22=rs1.getString("cod_destino").trim();
                    txtTcarga22=rs1.getString("tipocarga").trim();
                    txtPeso22=rs1.getString("peso").trim();
                    txtRemitente2=rs1.getString("nom_origen").trim();
                    txtCDrem2=rs1.getString("cd_origen").trim();
                    txtdesinatario2=rs1.getString("nom_destino").trim();
                    txtcddestino2=rs1.getString("cd_destino").trim();
                    recorrido2=rs1.getString("hrstransito").trim();
                    txtTransporte2=rs1.getString("modo");
                    String code1="MATERIAL";
                        String code2=txtTcarga22;
                        boolean resultado=code2.contains(code1);
                        if(resultado){
                            carga2="2";
                        }else{
                            carga2="1";
                        }                  
                RegistroX3ap();                
                }else {
                    JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void RegistroX3ap() throws SQLException, ParseException{        
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set FechaX3=?,hstransito='"+recorrido2+"',usuario='"+txtUserf1.getText().toUpperCase()+"',cd_Origen='"+txtCDrem2.toUpperCase().trim()+"',Remitente='"+txtRemitente2.toUpperCase().trim()+"',cd_Destino='"+txtcddestino2.toUpperCase().trim()+"',Destinatario='"+txtdesinatario2.toUpperCase().trim()+"',fecha='"+ir1+"',equipo='"+txtTransporte2.trim().toUpperCase()+"', Creado='MANUAL',unidadx3='"+fr1+"',remolquex3='"+cr1+"',VALOR_CLI_RUBRO1='"+dr1+"',origen_nom='"+txtOrigen22+"',destinatario_nom='"+txtDestino22+"',fchx3='"+ir1+"',"
                    + "Hrx3='"+jr1+"',Carga='"+txtTcarga22.toUpperCase()+"',Peso='"+txtPeso22+"',ReasonCodex3='NS',Archivox3='CREADO',stinterno='1', error='',categoria='IA' where cartaportex3='"+txtCartax3.getText()+"'");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.executeUpdate();
                    panelx31(); 
                    JOptionPane.showMessageDialog(null,"Movimiento registrado!","Informativo",JOptionPane.INFORMATION_MESSAGE);   
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            } 
    } 
    
    public void panelx31() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = ir1+" "+jr1+":00.000";
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set fecha_real_carga=?,unidad='"+fr1+"',rem1='"+cr1+"',mx3='1' where cartaporte='"+txtCartax3.getText()+"'");
                java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                stp.setTimestamp(1,timestamp);
                stp.executeUpdate();   
                ValiPrevioAF1();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    public void ValiPrevioAF1() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){
                   movapretiro() ;
                }else {
                  PrevioAF1();  
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void PrevioAF1() throws SQLException, ParseException{
        String numCadena =hr1;
        int numEntero = Integer.parseInt(numCadena);
        System.out.println("Pre-registro de AF");
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    Statement st=(Statement)miConexion.createStatement();
                    st.execute("insert into TBL_REG_AF_1(CartaporteAF,id_x3) values('"+txtCartax3.getText()+"','"+numEntero+"')");
                    movapretiro() ;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }    
    } 
    
    String cr1a,fr1a,ir1a,jr1a,krla;  
    public void movapretiro() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Archivox3 ='creado' and cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){                    
                        cr1a=rs1.getString("remolquex3").trim();
                        fr1a=rs1.getString("unidadx3").trim();
                        ir1a=rs1.getString("fecha_carga").substring(0,10);
                        jr1a=rs1.getString("fecha_carga").substring(11,16); 
                        krla=rs1.getString("zhx3").trim();
                        RegistroAPretiro();                        
                }else {
                    JOptionPane.showMessageDialog(null, "Proceso terminado ","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }    
    }
    
    public void RegistroAPretiro() throws SQLException, ParseException{
        System.out.println("RegistroAP()");
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchx1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        SimpleDateFormat formatoDelTexto1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha1 = ir1a.trim()+" 00:00:00.00";
            Date fechaK = null;
            try {
                fechaK = formatoDelTexto1.parse(strFecha1);
            } catch (ParseException ex) {
            }     

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set fchap=?,fcha_ap=?,hrap='"+jr1a+"',reasoncodeap='"+"AM"+"',zhap='"+krla+"',msj1='RETIRO',AP50='AP-APLICADO',ErrorAP='',CategoriaAP='IA',userAP='"+txtUserf1.getText().toUpperCase()+"',VALOR_CLI_RUBRO6='RETIRO DE UNIDAD',stinternoAP='1',Unidadap='"+fr1a.toUpperCase()+"',Remolqueap='"+cr1a.toUpperCase()+"' where cartaportex3='"+txtCartax3.getText()+"' ");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechaK.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.setTimestamp(2,timestamp1);
                    stp.executeUpdate();
                    ValiPrevioAFaps();
                    JOptionPane.showMessageDialog(null,"Movimiento registrado!","Informativo",JOptionPane.INFORMATION_MESSAGE);                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }            
    }
    
    public void ValiPrevioAFaps() throws ParseException{
        System.out.println("ValiPrevioAF()");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set ArchivoAF='AP-50' where cartaporteAF='"+txtCartax3.getText()+"' ");
                    stp.executeUpdate();
                    panelx11();
                }else {
                    panelx11();
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void panelx11() throws SQLException, ParseException{     
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set cap='1' where cartaporte='"+txtCartax3.getText()+"'");
                stp.executeUpdate();        
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void liberar() throws SQLException, ParseException{        
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set destinatario_nom=null,origen_nom=null,Archivox3=null,ReasonCodex3=null,fchx3=null,Hrx3=null,Peso=null,Carga=null,Creado=null,Usuario=null,Fecha=null,Unidadx3=null,Remolquex3=null,Equipo=null,FechaX3=null,cd_Origen=null,cd_Destino=null,Remitente=null,Destinatario=null,Error=null,Categoria=null,Rutax3=null,hstransito=null,ap50=null where cartaportex3='"+txtCartax3.getText()+"'");
                    stp.executeUpdate();
                    liberar1();
                    JOptionPane.showMessageDialog(null,"Registro actualizado","Informativo",JOptionPane.INFORMATION_MESSAGE);   
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo 1.","Error",JOptionPane.ERROR_MESSAGE);
                }
            } 
    }  
    
    public void liberar1() throws SQLException, ParseException{        
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp1=miConexion.prepareStatement("update TBL_REG_AF_1 set FolioAF=null,BOL=null,ReasonCodeAF=null,zhAF=null,fchDescg=null,hrsDescg=null,fchProg=null,hrProg=null,fchAF=null,hrAF=null,StatusOrden=null,Usuario=null,Fecha=null,ArchivoAF=null,CreadoAF=null,origenAF=null,destinoAF=null,ter_cartaAF=null,FechaAF=null,ErrorAF=null,CategoriaAF=null,RutaAF=null where CartaporteAF='"+txtCartax3.getText()+"'");
                    stp1.executeUpdate();
                    liberar2();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo 2.","Error",JOptionPane.ERROR_MESSAGE);
                }
            } 
    }  
    
    public void liberar2() throws SQLException, ParseException{        
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp2=miConexion.prepareStatement("update TBL_REG_X1_1 set ter_cartax1=null,Foliox1=null,Factura=null,ReasonCodex1=null,zhx1=null,Unidadx1=null,Remolquex1=null,fch_x1=null,hrx1=null,StatusOB=null,Usuario=null,fchx1=null,Creacionx1=null,Archivox1=null,Fechax1=null,Errorx1=null,Categoriax1=null,Rutax1=null where Cartaportex1='"+txtCartax3.getText()+"'");
                    stp2.executeUpdate();
                    liberar3();  
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo 3.","Error",JOptionPane.ERROR_MESSAGE);
                }
            } 
    }  
    
    public void liberar3() throws SQLException, ParseException{        
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp3=miConexion.prepareStatement("update tbl_asig_gst set fecha_real_carga=null,fecha_real_salida=null,fecha_real_destino=null,mx3=null,maf=null,mx1=null,mag=null,cap=null,cx3=null,caf=null,cx1=null,cag=null,sap=null,ctap=null,ex3=null,rx3=null,eaf=null,raf=null,ex1=null,rx1=null,eap=null,rap=null,eag=null,rag=null,fchJit=null,fchETA=null where cartaporte='"+txtCartax3.getText()+"'");
                    stp3.executeUpdate();  
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo .","Error",JOptionPane.ERROR_MESSAGE);
                }
            } 
    }     
    
    public void llenacode(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_CODERROR where transaccion='214'");
            error.addElement("Todos");
                while(rs1.next()){
                    error.addElement(rs1.getString("code_error")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String queryaf,queryx3,queryx1,queryap;    
    public void evaluarcategorias() throws SQLException{
        System.out.println("evaluar categorias " +jcbmovimiento.getSelectedItem()+"**"+jcbcodigo.getSelectedItem()+"**"+jcbcategoria.getSelectedItem());
        switch (jcbmovimiento.getSelectedItem().toString()) {
            case "X3":
                if(jcbcategoria.getSelectedItem().toString().equals("Todos")){
                    JOptionPane.showMessageDialog(null,"Indique una categoria.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    switch (jcbcategoria.getSelectedItem().toString()) {
                        case "IA":
                            queryx3="update TBL_REG_X3_1 SET Error='',Categoria='"+jcbcategoria.getSelectedItem().toString()+"' where cartaporteX3='"+txtCartax3.getText()+"'";
                            ux3();
                            break;
                        case "IE":
                            if(!jcbcodigo.getSelectedItem().toString().equals("Todos")){
                                queryx3="update TBL_REG_X3_1 SET Error='"+jcbcodigo.getSelectedItem().toString()+"',Categoria='"+jcbcategoria.getSelectedItem().toString()+"' where cartaporteX3='"+txtCartax3.getText()+"'";
                                ux3();
                            }else{
                               JOptionPane.showMessageDialog(null,"Indique un codigo de evento.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                            }
                            break;
                        case "IR":
                            if(!jcbcodigo.getSelectedItem().toString().equals("Todos")){
                                queryx3="update TBL_REG_X3_1 SET Error='"+jcbcodigo.getSelectedItem().toString()+"',Categoria='"+jcbcategoria.getSelectedItem().toString()+"' where cartaporteX3='"+txtCartax3.getText()+"'";
                                ux3();
                            }else{
                               JOptionPane.showMessageDialog(null,"Indique un codigo de evento.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                            }
                            break;
                        default:
                            break;
                    }
                }       
                break;
            case "AF":
                if(jcbcategoria.getSelectedItem().toString().equals("Todos")){
                    JOptionPane.showMessageDialog(null,"Indique una categoria.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    switch (jcbcategoria.getSelectedItem().toString()) {
                        case "IA":
                            queryaf="update TBL_REG_AF_1 SET ErrorAF='',CategoriaAF='"+jcbcategoria.getSelectedItem().toString()+"' where cartaporteAF='"+txtCartax3.getText()+"'";
                            uaf();
                            break;
                        case "IE":
                            if(!jcbcodigo.getSelectedItem().toString().equals("Todos")){
                                queryaf="update TBL_REG_AF_1 SET ErrorAF='"+jcbcodigo.getSelectedItem().toString()+"',CategoriaAF='"+jcbcategoria.getSelectedItem().toString()+"' where cartaporteAF='"+txtCartax3.getText()+"'";
                                uaf();
                            }else{
                               JOptionPane.showMessageDialog(null,"Indique un codigo de evento.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                            }
                            break;
                        case "IR":
                            if(!jcbcodigo.getSelectedItem().toString().equals("Todos")){
                                queryaf="update TBL_REG_AF_1 SET ErrorAF='"+jcbcodigo.getSelectedItem().toString()+"',CategoriaAF='"+jcbcategoria.getSelectedItem().toString()+"' where cartaporteAF='"+txtCartax3.getText()+"'";
                                uaf();
                            }else{
                               JOptionPane.showMessageDialog(null,"Indique un codigo de evento.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                            }
                            break;
                        default:
                            break;
                    }
                } 
                break;
            case "X1":
                if(jcbcategoria.getSelectedItem().toString().equals("Todos")){
                    JOptionPane.showMessageDialog(null,"Indique una categoria.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    switch (jcbcategoria.getSelectedItem().toString()) {
                        case "IA":
                            queryx1="update TBL_REG_X1_1 SET Errorx1='',Categoriax1='"+jcbcategoria .getSelectedItem().toString()+"' where cartaportex1='"+txtCartax3.getText()+"'";
                            ux1();
                            break;
                        case "IE":
                            if(!jcbcodigo.getSelectedItem().toString().equals("Todos")){
                                queryx1="update TBL_REG_X1_1 SET Errorx1='"+jcbcodigo.getSelectedItem().toString()+"',Categoriax1='"+jcbcategoria .getSelectedItem().toString()+"' where cartaportex1='"+txtCartax3.getText()+"'";
                                ux1();
                            }else{
                               JOptionPane.showMessageDialog(null,"Indique un codigo de evento.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                            }
                            break;
                        case "IR":
                            if(!jcbcodigo.getSelectedItem().toString().equals("Todos")){
                                queryx1="update TBL_REG_X1_1 SET Errorx1='"+jcbcodigo.getSelectedItem().toString()+"',Categoriax1='"+jcbcategoria .getSelectedItem().toString()+"' where cartaportex1='"+txtCartax3.getText()+"'";
                                ux1();
                            }else{
                               JOptionPane.showMessageDialog(null,"Indique un codigo de evento.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                            }
                            break;
                        default:
                            break;
                    }
                }                 
                break;           
            case "AP":
                if(jcbcategoria.getSelectedItem().toString().equals("Todos")){
                    JOptionPane.showMessageDialog(null,"Indique una categoria.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    switch (jcbcategoria.getSelectedItem().toString()) {
                        case "IA":
                            queryap="update TBL_REG_X3_1 SET ErrorAP='',CategoriaAP='"+jcbcategoria.getSelectedItem().toString()+"' where cartaportex3='"+txtCartax3.getText()+"'";
                            uap();
                            break;
                        case "IE":
                            if(!jcbcodigo.getSelectedItem().toString().equals("Todos")){
                               queryap="update TBL_REG_X3_1 SET ErrorAP='"+jcbcodigo.getSelectedItem().toString()+"',CategoriaAP='"+jcbcategoria.getSelectedItem().toString()+"' where cartaportex3='"+txtCartax3.getText()+"'";
                               uap();
                            }else{
                               JOptionPane.showMessageDialog(null,"Indique un codigo de evento.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                            }
                            break;
                        case "IR":
                            if(!jcbcodigo.getSelectedItem().toString().equals("Todos")){
                                queryap="update TBL_REG_X3_1 SET ErrorAP='"+jcbcodigo.getSelectedItem().toString()+"',CategoriaAP='"+jcbcategoria.getSelectedItem().toString()+"' where cartaportex3='"+txtCartax3.getText()+"'";
                                uap();
                            }else{
                               JOptionPane.showMessageDialog(null,"Indique un codigo de evento.","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                            }
                            break;
                        default:
                            break;
                    }
                }                 
                break;
            default:
                break;
        }        
    }
    
    public void ux3() throws SQLException{
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp2=miConexion.prepareStatement(queryx3);
                    stp2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro actualizado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
        }
    }
    
    public void uaf() throws SQLException{
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp2=miConexion.prepareStatement(queryaf);
                    stp2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro actualizado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
        }
    }
    
    public void ux1() throws SQLException{
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp2=miConexion.prepareStatement(queryx1);
                    stp2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro actualizado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
        } 
    }
    
    public void uap() throws SQLException{
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp2=miConexion.prepareStatement(queryap);
                    stp2.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Registro actualizado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jcbcategoria;
    private javax.swing.JComboBox<String> jcbcodigo;
    private javax.swing.JComboBox<String> jcbmovimiento;
    private javax.swing.JRadioButton jrbcancelacion;
    private javax.swing.JRadioButton jrbproductivo;
    private javax.swing.JRadioButton jrbretiro;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtCartax3;
    public javax.swing.JTextField txtUserf1;
    // End of variables declaration//GEN-END:variables
}