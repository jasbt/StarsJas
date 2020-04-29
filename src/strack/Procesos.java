package strack;

import Clases.ConexionEDI;
//import Clases.ConexionERP;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Procesos extends javax.swing.JFrame {

    public Procesos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFch1 = new javax.swing.JTextField();
        txtFch2 = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTAProceso = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        zhUS = new javax.swing.JComboBox<>();
        lblzh = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Procesos");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Procesos");

        jbtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/rueda-dentada.png"))); // NOI18N
        jbtn1.setToolTipText("Actualizar db.");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Fechas:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel26.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        jTAProceso.setColumns(20);
        jTAProceso.setRows(5);
        jScrollPane2.setViewportView(jTAProceso);

        jLabel3.setText("Zona horaria:");

        zhUS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "CD", "CT" }));
        zhUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zhUSActionPerformed(evt);
            }
        });

        lblzh.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/facturacion.png"))); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtFch1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFch2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(zhUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblzh, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(zhUS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(lblzh, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtFch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        if(!(lblzh.getText().equals(""))){
            QRegistro(); //carga ordenes de servicio                             
            fctOrden();//actualiza y registra facturas de tipo orden
            fctEspecial();//actualiza y registra facturas de tipo especial
            Estado810();
            ConsultaERP_Fact();
            Stars();            
            StarsTonu();             
            //ACTAULIZA STARS CANCELADO
            /*StarsTonuC();
            StarsC();*/
        //    rutabit();
        //    Cancel2();  
            JOptionPane.showMessageDialog(null, "Fin del Proceso");
        }else{
            JOptionPane.showMessageDialog(null,"No ha determinado la zona horaria");
            lblzh.setText("");
        }          
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuGeneral mg=new MenuGeneral();
        mg.lblUser.setText(txtUserf1.getText());
        mg.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
        
    String sizh,zhg,sizh1;
    private void zhUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zhUSActionPerformed
        if(evt.getSource() == zhUS){
            sizh1 =(String)zhUS.getSelectedItem();
        }if(null != sizh1)switch (sizh1) {
            case "CT":
            sizh="CT";
            zhg="Hora central";
            lblzh.setText("Hora central");
            break;
            case "CD":
            sizh="CD";
            zhg="Hora de verano central";
            lblzh.setText("Hora de verano central");
            break;
            case "Seleccione":
            lblzh.setText("");
            break;
        }
    }//GEN-LAST:event_zhUSActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null, "Opcion no disponible");
        /*Edix3();
        Edix1();*/
    }//GEN-LAST:event_jButton2ActionPerformed
       
    String ter_carta,ordenser_folio,terminal_clave,fecha_orden,fecha_carga,fecha_entrega,
            cartaporte,bitacora,unidad,rem1,terminal_carta,folio_carta,referencia2,tipo_movimiento_descrip,
            VALOR_CLI_RUBRO1,status_orden,carga,talonOS,ter_talonOS,folio_talonOS,fch_talonOS,OperadorOS,cartaporteOS,clave_bitacora ;
    public void QRegistro(){
        System.out.println("Consulta Despacho");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        //Connection miConexion1 =(Connection)ConexionERP.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select clave_bitacora,terminal_carta,folio_carta,ordenser_folio,terminal_clave,fecha_orden,fecha_carga,fecha_entrega,cotizacion_clave,"
                + "cartaporte,bitacora,unidad,rem1,terminal_carta,folio_carta,referencia2,VALOR_CLI_RUBRO1,tipo_movimiento_descrip,status_orden,talon,fch_talon,terminal_talon,talon_folio,"
                + "operador_nombre from vordenser where cliente_clave='1350' and tipo_movimiento_descrip='foraneo' and status_orden !='0' and VALOR_CLI_RUBRO1 !='0'  and VALOR_CLI_RUBRO1 "
                + "!='COSTO POR KM' and VALOR_CLI_RUBRO1 !='COSTO POR KILOMETRO' and fecha_orden BETWEEN convert(datetime,'"+txtFch1.getText().replace("-","")+" 00:00:00') and convert(datetime,'"+txtFch2.getText().replace("-","")+" 23:59:59')");
            /*PreparedStatement stmt=miConexion1.prepareStatement("select clave_bitacora,terminal_carta,folio_carta,ordenser_folio,terminal_clave,fecha_orden,fecha_carga,fecha_entrega,cotizacion_clave,"
                + "cartaporte,bitacora,unidad,rem1,terminal_carta,folio_carta,referencia2,VALOR_CLI_RUBRO1,tipo_movimiento_descrip,status_orden,talon,fch_talon,terminal_talon,talon_folio,"
                + "operador_nombre from vordenser where cliente_clave='1350' and tipo_movimiento_descrip='foraneo' and status_orden !='0' and VALOR_CLI_RUBRO1 !='0'  and VALOR_CLI_RUBRO1 "
                + "!='COSTO POR KM' and VALOR_CLI_RUBRO1 !='COSTO POR KILOMETRO' and fecha_orden BETWEEN convert(datetime,'20180601 00:00:00') and convert(datetime,'20180606 23:59:59')");            
            */ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                String carta=rs.getString("cartaporte");
                if(carta !=null){
                    cartaporteOS=rs.getString("terminal_carta").trim()+rs.getString("cartaporte").trim();
                    System.out.println(carta+"  CARTAPORTE "+cartaporteOS);
                    ordenser_folio=rs.getString("ordenser_folio").trim();
                    terminal_clave=rs.getString("terminal_clave").trim();
                    fecha_orden=rs.getString("fecha_orden").trim();
                    fecha_carga=rs.getString("fecha_carga").trim();
                    fecha_entrega=rs.getString("fecha_entrega").trim();
                    cartaporte=rs.getString("cartaporte").trim();
                    bitacora=rs.getString("bitacora").trim();
                    unidad=rs.getString("unidad");
                    rem1=rs.getString("rem1");
                    terminal_carta=rs.getString("terminal_carta").trim();
                    folio_carta=rs.getString("folio_carta").trim();
                    tipo_movimiento_descrip=rs.getString("tipo_movimiento_descrip").trim();
                    VALOR_CLI_RUBRO1=rs.getString("VALOR_CLI_RUBRO1").trim();
                    VALOR_CLI_RUBRO1=VALOR_CLI_RUBRO1.replaceAll("CPO |CPO","");
                    status_orden=rs.getString("status_orden").trim();
                    ter_carta=rs.getString("terminal_carta").trim();
                    
                    talonOS=rs.getString("talon");
                    ter_talonOS=rs.getString("terminal_talon");
                    folio_talonOS=rs.getString("talon_folio");
                    fch_talonOS=rs.getString("fch_talon");
                    OperadorOS=rs.getString("operador_nombre");
                    clave_bitacora= rs.getString("clave_bitacora");
                    jTAProceso.append(""+cartaporteOS +" "+fecha_orden+"\r\n");
                    if(OperadorOS == null){
                        OperadorOS="";
                    }else{
                        OperadorOS=OperadorOS;
                    }                    
                    System.out.println("Metodos.Procesos.QRegistro(Nombre de operador) "+OperadorOS);
                    VRegistro();
                 }else{
                    System.out.println("No hay cartaporte "+rs.getString("bitacora"));
                }                     
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
        
    public void VRegistro(){
        System.out.println("VRegistro() "+cartaporteOS);
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where cartaportex3='"+cartaporteOS+"'");
                if(rs1.next() == true){
                    System.out.println("EXISTE REGISTRO tbl_wbs-Archivo"+ cartaporteOS);
                    jTAProceso.append("Cartaporte registrada "+cartaporteOS +" "+fecha_orden+"\r\n");
                    VRegistro_creado();
                }else {
                    System.out.println("Registrar cartaporte "+cartaporteOS);
                    jTAProceso.append("Registrar cartaporte "+cartaporteOS +" "+fecha_orden+"\r\n");
                    RegistrOrden(); 
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro VRegistro() "+ex.getMessage());
        } 
    }
    
    public void VRegistro_creado(){
        System.out.println("VRegistro() "+cartaporteOS);
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where cartaportex3='"+cartaporteOS+"' and archivox3='CREADO'");
                if(rs1.next() == true){
                    jTAProceso.append("Cartaporte con mov. registrados "+cartaporteOS +" "+fecha_orden+"\r\n");
                    actualizaSTOF();
                    System.out.println("EL REGISTRO YA ESTA CREADO (no actualiza) "+ cartaporteOS);   
                }else {
                    jTAProceso.append("Actualiza Cartaporte  "+cartaporteOS +" "+fecha_orden+"\r\n");
                    System.out.println("actaliza registro (no creado) "+cartaporteOS);
                    actualizaSTO();
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro VRegistro() "+ex.getMessage());
        } 
    }
    
    public void RegistrOrden() throws SQLException{
        System.out.println("regitsra orden de servicio");
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    Statement st=(Statement)miConexion.createStatement();
                    st.execute("insert into TBL_REG_X3_1(ordenser_folio,fecha_orden,cartaportex3,bitacora,"
                    + "VALOR_CLI_RUBRO1,fecha_carga,fecha_entrega,status_orden,unidad,rem1,folio_carta,tipo_movimiento_descrip,ter_carta,zhx3,Operador,clave_bitacora)"
                    + "values('"+ordenser_folio+"','"+fecha_orden+"','"+cartaporteOS+"','"+bitacora+"','"
                    +VALOR_CLI_RUBRO1+"','"+fecha_carga+"','"+fecha_entrega+"','"+status_orden+"','"
                    +unidad+"','"+rem1+"','"+folio_carta+"','"+tipo_movimiento_descrip+"','"+ter_carta+"','"+zhg+"','"+OperadorOS+"','"+clave_bitacora+"')");
                    System.out.println("Registro de Orden cartaporte "+cartaporteOS +" "+fecha_orden+"\r\n");
                } catch (SQLException ex) {
                    System.out.println("Error en Registro de Orden "+ex.getMessage());
                    JOptionPane.showMessageDialog(null,"Error al Guadar Registro de Orden "+ex.getMessage());
                }
            }  
    } 
    
    public void actualizaSTO() throws SQLException{
        System.out.println("actualiza orden sin movimiento registrado");
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                Statement st=(Statement)miConexion.createStatement();
                st.execute("update TBL_REG_X3_1 set clave_bitacora='"+clave_bitacora+"',unidad='"+unidad+"',rem1='"+rem1+"',talon='"+talonOS+"',talon_ter='"+ter_talonOS+"',talon_folio='"+folio_talonOS+"',fecha_talon='"+fch_talonOS+"',Operador='"+OperadorOS+"',VALOR_CLI_RUBRO1='"+VALOR_CLI_RUBRO1.trim()+"',status_orden='"+status_orden+"' where cartaportex3='"+cartaporteOS+"' and archivox3 is null");
                System.out.println("ACTAULIZA STATUS DE ORDEN *FACTURA "+ cartaporteOS+"... "+VALOR_CLI_RUBRO1+".."+talonOS+"\r\n");
                jTAProceso.append("Actualiza Datos de orden y facturacion-unidad+remolque sin registro de mov. "+cartaporteOS +" "+fecha_orden+"\r\n");
            } catch (SQLException ex) {
                 System.out.println("Error actualizaSTO "+ex.getMessage());
            }
        }    
    }
    
    public void actualizaSTOF() throws SQLException{
        System.out.println("actualiza orden con movimiento creado");
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                Statement st=(Statement)miConexion.createStatement();
                st.execute("update TBL_REG_X3_1 set clave_bitacora='"+clave_bitacora+"',talon='"+talonOS+"',talon_ter='"+ter_talonOS+"',talon_folio='"+folio_talonOS+"',fecha_talon='"+fch_talonOS+"',Operador='"+OperadorOS+"' where cartaportex3='"+cartaporteOS+"' and archivox3='CREADO'");
                System.out.println("ACTAULIZA FACTURA "+ cartaporteOS+"... "+VALOR_CLI_RUBRO1+" factura***"+talonOS);
                System.out.println("actauliza orden de servicio en x3 Cartaporte con mov. registrados -Actualiza Datos de Facturación "+cartaporteOS +" "+fecha_orden+"\r\n");
            } catch (SQLException ex) {
                 System.out.println("Error actualizaSTO "+ex.getMessage());
            }
        }    
    }
    
    String tc1,tc2;
    public void Cancel2(){
        System.out.println("status de carta en stars");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("SELECT * FROM TBL_REG_X3_1 where fecha_orden between '"+txtFch1.getText()+" 00:00:00.0' and '"+txtFch2.getText()+" 23:59:58.0'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                tc1=rs.getString("ter_carta");
                tc2=rs.getString("folio_carta");
                System.out.println("Cartaporte a revisar "+tc1+tc2);
                cpoCancel2() ;                
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
    
    public void cpoCancel2() {        
        System.out.println("Consulta Despacho-registro-carta");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        //Connection miConexion1 =(Connection)ConexionERP.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select * from vordenser where terminal_carta='"+tc1+"' and folio_carta='"+tc2+"' and fecha_orden BETWEEN convert(datetime,'"+txtFch1.getText()+"') and convert(datetime,'"+txtFch2.getText()+"')");
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){             
                System.out.println("Existe carta en ERP " +tc1+tc2);
             }else{
                System.out.println("No Existe carta en ERP  " +tc1+tc2);
                status_orden="2";  
                acSOS(); 
                acSOSliq();
            } //fin de else
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
        
    public void acSOS() throws SQLException{
        System.out.println("No Existe carta en ERP  " +tc1+tc2);
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                Statement st=(Statement)miConexion.createStatement();
                st.execute("update TBL_REG_X3_1 set status_orden='"+"2"+"' where cartaportex3='"+tc1+tc2+"' and Archivox3 is null");
                System.out.println("actualiza STATUS os " +tc1+tc2+"..."+status_orden );
                jTAProceso.append("Actualiza status de  cartaporte " +tc1+tc2+"..."+status_orden+"\r\n");
            } catch (SQLException ex) {
                    System.out.println("Error actualizaSTO "+ex.getMessage());
            }
        }    
    }
    
    //cancelado de cartaporte en recepcion
    public void acSOSliq() throws SQLException{
        System.out.println("No Existe carta en ERP  " +tc1+tc2);
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                Statement st=(Statement)miConexion.createStatement();
                st.execute("update TBL_REG_X3_1 set ruta_bitacora='"+"CANCELADO"+"' where cartaportex3='"+tc1+tc2+"'");
                System.out.println("actualiza STATUS os para liq." +tc1+tc2+"..."+status_orden );
            } catch (SQLException ex) {
                    System.out.println("Error actualizaSTOliq "+ex.getMessage());
            }
        }    
    }
    
    String carta,ter,foliost,archst,catx1;
    public void StarsTonu(){
        System.out.println("810 con stars de tonu");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
           PreparedStatement stmt=miConexion1.prepareStatement("SELECT * FROM TBL_REG_X3_1 where AP50='AP-APLICADO' and Categoria !='IR' OR ErrorAP='710' and fecha_orden between '" +txtFch1.getText()+" 00:00:00.0' and '"+txtFch2.getText()+" 00:00:00.0'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                carta=rs.getString("cartaportex3");  
                ter=rs.getString("talon_ter"); 
                foliost=rs.getString("talon_folio"); 
                archst=rs.getString("AP50"); 
                catx1=rs.getString("CategoriaAP");
                bol="TONU";
                if ("AP-APLICADO".equals(archst)){
                    archst="APLICADO";
                }else{
                    archst="";
                    catx1="";
                    carta="";
                }
                System.out.println("Cartaporte "+carta+" "+ter+" "+foliost+" "+archst+" "+catx1);   
                actualist810();    
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }    
        
    //PROCESO DE STARS  CON 810
    String bol;
    public void Stars(){
        System.out.println("810 con stars ");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
           PreparedStatement stmt=miConexion1.prepareStatement("SELECT * FROM VTBL_REG_X1_STATUS_1 where Archivox1='CREADO' AND Categoriax1 !='IR' OR errorx1 ='710' and fecha_orden between '" +txtFch1.getText()+" 00:00:00.0' and '"+txtFch2.getText()+" 00:00:00.0'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                carta=rs.getString("CartaporteX1");  
                ter=rs.getString("talon_ter"); 
                foliost=rs.getString("talon_folio"); 
                archst=rs.getString("archivox1"); 
                catx1=rs.getString("categoriax1");
                bol=rs.getString("bol");
                idx1=rs.getString("idX1");
                if ("CREADO".equals(archst)){
                    archst="APLICADO";
                }else{
                    archst="";
                    catx1="";
                    carta="";
                }
                
                if ("null".equals(catx1) || catx1== null){
                    catx1="";
                }else{
                    catx1=catx1;
                }
                System.out.println("Cartaporte "+carta+" "+ter+" "+foliost+" "+archst+" "+catx1);   
                actualist810();    
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
    
    public void actualist810() throws SQLException{
        String id=idx1;
        Integer idr=Integer.parseInt(id);
        System.out.println(archst+" STATUS DE STARS EN X1");
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                    Statement st=(Statement)miConexion.createStatement();
                //st.execute("update TBL_ACUSE810 set cartaporte='"+carta+"',statustar='"+archst+"',categoriast='"+catx1+"',bol810='"+bol+"',idX1='"+idr+"'  where serie='"+ter+"'and folio='"+foliost+"'");
                    st.execute("update TBL_ACUSE810 set cartaporte='"+carta+"',statustar='"+archst+"',categoriast='"+catx1+"',bol810='"+bol+"'  where serie='"+ter+"'and folio='"+foliost+"'");
                    System.out.println("ACTAULIZA STATUS DE FACTURAS CON STARS ");
            } catch (SQLException ex) {
                    System.out.println("Error actualizaSTO "+ex.getMessage());
            }
        }    
    }
        
    public void StarsC(){
        System.out.println("810 con stars ");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
           PreparedStatement stmt=miConexion1.prepareStatement("SELECT * FROM VTBL_REG_X1_STATUS_1 where Archivox1='CANCELADO' AND  fecha_orden between '" +txtFch1.getText()+" 00:00:00.0' and '"+txtFch2.getText()+" 00:00:00.0'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                carta=rs.getString("CartaporteX1");  
                ter=rs.getString("talon_ter"); 
                foliost=rs.getString("talon_folio"); 
                archst=rs.getString("archivox1"); 
                catx1="";
                if ("CANCELADO".equals(archst)){
                    archst="CANCELADO";
                }else{
                    archst="";
                    catx1="";
                    carta="";
                }
                System.out.println("Cartaporte "+carta+" "+ter+" "+foliost+" "+archst+" "+catx1);   
                actualist810();    
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }

    public void StarsTonuC(){
        System.out.println("810 con stars de tonu");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
           PreparedStatement stmt=miConexion1.prepareStatement("SELECT * FROM TBL_REG_X3_1 where AP50='AP-CANCELADO' AND fecha_orden between '" +txtFch1.getText()+" 00:00:00.0' and '"+txtFch2.getText()+" 00:00:00.0'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                carta=rs.getString("cartaportex3");  
                ter=rs.getString("talon_ter"); 
                foliost=rs.getString("talon_folio"); 
                archst=rs.getString("AP50"); 
                catx1="";
                if ("AP-APLICADO".equals(archst)){
                    archst="APLICADO";
                }else{
                    archst="";
                    catx1="";
                    carta="";
                }
                System.out.println("Cartaporte "+carta+" "+ter+" "+foliost+" "+archst+" "+catx1);   
                actualist810();    
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }    
        
 
    //PROCESOS DE facturacion 210
    //anexar condicicion de terminal tol para cargar facturas
    String factura,talonclave,tercob,nomentrega,fchtalon,fchcrea,cliente,valiva,statstal,valriva,vucctcf,importe,subtotal,total,
            talonprefijo,talonfolio,modenaclave,claveiva,montoflete,claveriva,poriva,caja,tipotalon,servicio,destinodecrip,campo1,
            campo2,campo4,formacobropago,terCarta,folioCarta,campo3; 
    public void fctOrden(){
       System.out.println("consulta para facturas con ordenes ");
       Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        //Connection miConexion1 =(Connection)ConexionERP.GetConnection();
        try {
            PreparedStatement stmt=miConexion1.prepareStatement("select vordenser.terminal_carta,vordenser.folio_carta,TALON.FCH_CREA,TALON.MONTO_FLETE,TALON.VAL_IVA,TALON.VAL_RIVA,TALON.VAL_TOTAL,TALON.TALON_PREFIJO,TALON.TALON_FOLIO,TALON.CAJA,TALON.servicio_descripcion,TALON.campo_ref1,TALON.campo_ref2,TALON.campo_ref4,TALON.campo_ref3,TALON.STATUS_TAL,TALON.tipo_talon, talon.FORMA_COBRO_CLAVE,talon.terminal_cobranza,TALON.TALON_PREFIJO from vordenser inner join TALON on talon.TALON_FOLIO = vordenser.talon_folio where cliente_clave='1350' and TALON.campo_ref1 !='costo por kilometro' and TALON.campo_ref1 !='costo por km' and TALON.campo_ref1 !='COSTO POR  KM' and TALON.campo_ref1 !='REFT000018' and TALON.campo_ref1 !='REFT000016' and TALON.TALON_PREFIJO='tol' and talon.FCH_CREA between convert(datetime,'"+txtFch1.getText()+" "+"00:00:00"+"') and  convert(datetime,'"+txtFch2.getText()+" "+"23:00:00"+"') and TALON.TALON_PREFIJO='TOL'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){ 
                System.out.println("Guardar Factura "+rs.getString("TALON_PREFIJO")+rs.getString("TALON_FOLIO"));  
                montoflete=rs.getString("MONTO_FLETE").trim();
                valiva=rs.getString("VAL_IVA").trim();              
                valriva=rs.getString("val_RIVA").trim();
                total=rs.getString("VAL_TOTAL").trim();
                statstal=rs.getString("STATUS_TAL").trim();
                caja=rs.getString("CAJA");
                tipotalon=rs.getString("tipo_talon").trim();
                servicio=rs.getString("servicio_descripcion").trim();
                campo1=rs.getString("campo_ref1").replaceAll("CPO|CPO ", " ").trim();
                campo2=rs.getString("campo_ref2").trim();
                campo4=rs.getString("campo_ref4").trim();
                formacobropago=rs.getString("FORMA_COBRO_CLAVE").trim();
                tercob=rs.getString("TERMINAL_COBRANZA").trim();
                fchcrea=rs.getString("FCH_CREA").trim();
                talonprefijo=rs.getString("TALON_PREFIJO").trim();
                talonfolio=rs.getString("TALON_FOLIO").trim();
                terCarta=rs.getString("terminal_carta"); 
                folioCarta=rs.getString("folio_carta");
                System.out.println(folioCarta);
                cartaporte=terCarta+folioCarta;
                factura=talonprefijo+talonfolio.trim();
                campo3=rs.getString("campo_ref3");
                System.out.println("Factura de Orden JAS"+ factura+" "+statstal+" "+fchcrea+"\r\n");
                VRegistro210_Orden();
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error fact"+ex.getMessage());
             System.out.println("Error Facturación "+ex.getMessage());
        }
   }
    
    public void fctEspecial(){
        System.out.println("consulta para facturas especiales ");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        //Connection miConexion1 =(Connection)ConexionERP.GetConnection();
        try {
            PreparedStatement stmt=miConexion1.prepareStatement("select TALON_CLAVE,TERMINAL_COBRANZA,NOMBRE_ENTREGA,FCH_TALON,FCH_CREA,CLIENTE_CLAVE_COB,LOCALIDAD_CARGA,CLIENTE_CLAVE_CARGA,DOMICILIO_DESTINATARIO,"
            + "LOCALIDAD_ENTREGA,RFC_ENTREGA,VAL_IVA,STATUS_TAL,val_RIVA,MONTO_FLETE,VU_CCT_CF,VAL_IMPORTE,VAL_SUBTOTAL,VAL_TOTAL,TALON_PREFIJO,TALON_FOLIO,OPERADOR_CLAVE,MONEDA_CLAVE,CONCEPTO_CLAVE_IVA,"
            + "CONCEPTO_CLAVE_RIVA,POR_IVA,TRACTOR,CAJA,tipo_talon,servicio_descripcion,DESTINO_DESCRIP,campo_ref1,campo_ref2,campo_ref4,campo_ref3,ORIGEN_RFC,ORIGEN_NOM,ORIGEN_DOM,UUID,FORMA_COBRO_CLAVE  "
            + "from TALON where CLIENTE_CLAVE_COB='1350' and TALON_PREFIJO='tol' and TALON.campo_ref1 !='costo por km' and TALON.campo_ref1 !='COSTO POR  KM' and TALON.campo_ref1 !='costo por kilometro' and TALON.campo_ref1 !='REFT000018' and TALON.campo_ref1 !='REFT000016' and TALON.TALON_PREFIJO='tol' and FCH_CREA between convert(datetime,'"+txtFch1.getText().replaceAll("-", "")+" "+"00:00:00"+"') and  convert(datetime,'"+txtFch2.getText().replaceAll("-", "")+" "+"23:00:00"+"') and TALON.TALON_PREFIJO='TOL'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){ 
                System.out.println("Guardar Factura "+rs.getString("TALON_PREFIJO")+rs.getString("TALON_FOLIO"));  
                montoflete=rs.getString("MONTO_FLETE").trim();
                valiva=rs.getString("VAL_IVA").trim();
                valriva=rs.getString("val_RIVA").trim();
                total=rs.getString("VAL_TOTAL").trim();
                statstal=rs.getString("STATUS_TAL").trim();
                caja=rs.getString("CAJA");
                tipotalon=rs.getString("tipo_talon").trim();
                servicio=rs.getString("servicio_descripcion").trim();
                campo1=rs.getString("campo_ref1").replaceAll("CPO|CPO ", " ").trim();
                campo2=rs.getString("campo_ref2").trim();
                campo4=rs.getString("campo_ref4").trim();
                campo3=rs.getString("campo_ref3");
                formacobropago=rs.getString("FORMA_COBRO_CLAVE").trim();
                tercob=rs.getString("TERMINAL_COBRANZA").trim();
                fchcrea=rs.getString("FCH_CREA").trim();
                talonprefijo=rs.getString("TALON_PREFIJO").trim();
                talonfolio=rs.getString("TALON_FOLIO").trim();
                System.out.println(folioCarta);
                cartaporte=terCarta+folioCarta;
                factura=talonprefijo+talonfolio.trim();
                System.out.println("Factura Especial JAS"+ factura+" "+statstal+" "+fchcrea+"\r\n");
                VRegistro210_Orden();
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error fact"+ex.getMessage());
             System.out.println("Error Facturación "+ex.getMessage());
        }
    } 
    
    public void VRegistro210_Orden(){
        System.out.println("VRegistro210_Orden() "+tipotalon);
        String mt=montoflete;
        double n1=Double.parseDouble(mt);
        
        String viva=valiva;
        double n2=Double.parseDouble(viva);
        
        String vriva=valriva;
        double n3=Double.parseDouble(vriva);
        
        String vtotal=total;
        double n4=Double.parseDouble(vtotal);
        System.out.println("double "+montoflete+".."+n1+"..");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_FACTURA210 where factura='"+factura+"'");
                if(rs1.next() == true){
                    statement.execute("update TBL_FACTURA210 set campo_ref1='"+campo1+"',tipo_talon='"+tipotalon+"',STATUS_TAL='"+statstal+"',campo_ref3='"+campo3+"' where factura='"+factura+"'");
                    jTAProceso.append("Factura Actualiza "+ factura+" "+statstal+" "+fchcrea+"\r\n");
                    System.out.println("ACTUALIZAR ESTATUS DE FACTURA tipo_talon "+tipotalon+" status"+statstal+" factura"+factura);
                }else {
                    statement.execute("insert into TBL_FACTURA210(factura,terminal_carta,folio_carta,FCH_CREA,MONTO_FLETE,VAL_IVA,VAL_RIVA,VAL_TOTAL,TALON_PREFIJO,TALON_FOLIO,CAJA,servicio_descripcion,campo_ref1,campo_ref2,campo_ref4,FORMA_COBRO_CLAVE,terminal_cobranza,STATUS_TAL,tipo_talon,campo_ref3) "
                    +"values('"+factura+"','"+terCarta+"','"+folioCarta+"','"+fchcrea+"','"+n1+"','"+n2+"','"+n3+"','"+n4+"','"+talonprefijo+"','"+talonfolio+"','"+caja+"','"+servicio+"','"+campo1+"','"+campo2+"','"+campo4+"','"+formacobropago+"','"+tercob+"','"+statstal+"','"+tipotalon+"','"+campo3+"')");
                    jTAProceso.append("Registra Factura "+ factura+" "+statstal+" "+fchcrea+"\r\n");
                    System.out.println("Registrar FACTURA" + factura);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro ordenfactura *1* "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error *1* "+ex.getMessage());
        } 
    }
    
    //STATUS DE FACTURA 810-NOTAS
    public void Estado810(){     
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        //Connection miConexion1 =(Connection)ConexionERP.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select tipo_talon ,TALON_CLAVE,FCH_TALON,FCH_CREA,CLIENTE_CLAVE_COB,STATUS_TAL,TALON_PREFIJO,TALON_FOLIO from TALON where CLIENTE_CLAVE_COB='1350' and FCH_CREA between convert(datetime,'"+txtFch1.getText().replaceAll("-", "")+" "+"00:00:00"+"') and  convert(datetime,'"+txtFch2.getText().replaceAll("-", "")+" "+"23:00:00"+"')");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){                   
                statstal=rs.getString("STATUS_TAL").trim();
                talonprefijo=rs.getString("TALON_PREFIJO").trim();
                talonfolio=rs.getString("TALON_FOLIO").trim();
                tipotalon=rs.getString("tipo_talon").trim();
                factura=talonprefijo+talonfolio;
                System.out.println("Metodos.Procesos.Estado810()" + statstal+"..."+talonprefijo+"..."+talonfolio+"..."+tipotalon);
                Vstatus810();
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error nota"+ex.getMessage());
             System.out.println("Error Nota "+ex.getMessage());
        }      
    }
    
    public void Vstatus810() throws SQLException{
        try (Connection miConexion1 = (Connection)ConexionEDI.GetConnection()) {
            try {
                Statement st=(Statement)miConexion1.createStatement();
                st.execute("update TBL_ACUSE810 set Statustal='"+statstal+"' where serie='"+talonprefijo+"' and folio='"+talonfolio+"'");                
                System.out.println("actualiza 810-status de talon "+factura);
            } catch (SQLException ex) {
                System.out.println("Error 810-status de talon "+ex.getMessage());
            }
        }      
    }
    
    //notas de credito
    String nota,nota1,nota2;
    public void ConsultaERP_Fact(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        //Connection miConexion1 =(Connection)ConexionERP.GetConnection();
        try {
            PreparedStatement stmt=miConexion1.prepareStatement("select TALON_CLAVE,TERMINAL_COBRANZA,NOMBRE_ENTREGA,FCH_TALON,FCH_CREA,CLIENTE_CLAVE_COB,LOCALIDAD_CARGA,CLIENTE_CLAVE_CARGA,DOMICILIO_DESTINATARIO,LOCALIDAD_ENTREGA,RFC_ENTREGA,VAL_IVA,STATUS_TAL,val_RIVA,MONTO_FLETE,VU_CCT_CF,VAL_IMPORTE,VAL_SUBTOTAL,VAL_TOTAL,TALON_PREFIJO,TALON_FOLIO,OPERADOR_CLAVE,MONEDA_CLAVE,CONCEPTO_CLAVE_IVA,CONCEPTO_CLAVE_RIVA,POR_IVA,TRACTOR,CAJA,tipo_talon,servicio_descripcion,DESTINO_DESCRIP,campo_ref1,campo_ref2,campo_ref4,ORIGEN_RFC,ORIGEN_NOM,ORIGEN_DOM,UUID,FORMA_COBRO_CLAVE,BASE_NOTA_CREDITO from TALON where CLIENTE_CLAVE_COB='1350' and FCH_CREA between convert(datetime,'"+txtFch1.getText().replaceAll("-", "")+" "+"00:00:00"+"') and  convert(datetime,'"+txtFch2.getText().replaceAll("-", "")+" "+"23:00:00"+"')");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){   
               statstal=rs.getString("STATUS_TAL").trim();
                talonprefijo=rs.getString("TALON_PREFIJO").trim();
                talonfolio=rs.getString("TALON_FOLIO").trim();
                tipotalon=rs.getString("tipo_talon").trim();
                factura=talonprefijo+talonfolio;
                nota=rs.getString("BASE_NOTA_CREDITO");
                System.out.println("valor de nota de credito "+nota);
                if(nota==null){
                    nota1="";
                    nota2="";                    
                    System.out.println("folio "+nota2+"tipo"+nota1);
                }else{
                    nota1="2";
                    nota2=nota;
                    System.out.println("else "+nota2+" tipo "+nota1);
                }
                VNota();
                VNotaF();
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error nota"+ex.getMessage());
             System.out.println("Error Nota "+ex.getMessage());
        }
    } 
    
    public void VNota(){
        System.out.println("VNota1()-810 "+tipotalon+"..."+factura+"----"+talonprefijo+"-"+talonfolio);        
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion1.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_ACUSE810 where serie='"+talonprefijo+"' and folio='"+talonfolio+"'");
                if(rs1.next() == true){
                    statement.execute("update TBL_ACUSE810 set Statustal='"+statstal+"',nota='"+nota1+"',folio_nota='"+nota2+"' where serie='"+talonprefijo+"' and folio='"+talonfolio+"'");
                    System.out.println("Factura Actualiza status de talon en 810 *NOTA* "+ factura+" "+statstal+" "+fchcrea+"\r\n");
                    //VNotaF();
                }else {                    
                    System.out.println("No hay nota para aplicar 810" );
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro ordenfactura *1* "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error *1* "+ex.getMessage());
        }         
    }
    
    public void VNotaF(){
        System.out.println("VNotaF()-210 "+tipotalon+"..."+factura+"----"+talonprefijo+"-"+talonfolio); 
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion1.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_FACTURA210 where factura='"+talonprefijo+talonfolio+"'");
                if(rs1.next() == true){
                    statement.execute("update TBL_FACTURA210 set nota='"+nota1+"',folio_nota='"+nota2+"' where factura='"+talonprefijo+talonfolio+"'");
                    System.out.println("ACTUALIZAR nota en 210 "+tipotalon+" factura"+talonprefijo+talonfolio);
                }else {
                    System.out.println("NO HAY NOTA DE CREDITO 210 " + factura);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro ordenfactura *1* "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error *1* "+ex.getMessage());
        }         
    }
    
    //cargda datos en tablas de af y x1 por error de desconexion db en transacciones
    String edix3,idx3;
    public void Edix3(){
       System.out.println("Metodos.Procesos.updateEDIX3()");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try {
            PreparedStatement stmt=miConexion1.prepareStatement("select * from TBL_REG_X3_1 where Archivox3='creado'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                edix3=rs.getString("cartaportex3");
                idx3=rs.getString("id_x3");
                updateAF();
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error edix3 "+ex.getMessage());
             System.out.println("Error edix3 "+ex.getMessage());
        }
    }
    
    public void updateAF(){
       System.out.println("Metodos.Procesos.updateEDIX3() "+edix3);
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+edix3+"'");
                if(rs1.next() == true){
                    System.out.println("CARTAPORTE REGISTRADA "+edix3);
                }else {
                    statement.execute("insert into TBL_REG_AF_1(CartaporteAF,id_x3) "
                    +"values('"+edix3+"','"+idx3+"')");
                    System.out.println("Registrar en AF "+edix3);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro en AF "+ex.getMessage());
        }
    }
    
    String edix1,idx1;
    public void Edix1(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try {
            PreparedStatement stmt=miConexion1.prepareStatement("select * from TBL_REG_AF_1 where ArchivoAF='creado'");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                edix1=rs.getString("cartaporteAF");
                idx1=rs.getString("idAF");
                updatex1();
             } //fin de while
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error ediAF "+ex.getMessage());
             System.out.println("Error ediAF "+ex.getMessage());
        }
    }
    
    public void updatex1(){
       System.out.println("Metodos.Procesos.updateEDIX3() "+edix1);
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where Cartaportex1='"+edix1+"'");
                if(rs1.next() == true){
                    System.out.println("CARTAPORTE REGISTRADA "+edix1);
                }else {
                    statement.execute("insert into TBL_REG_X1_1(Cartaportex1,idAF) "
                    +"values('"+edix1+"','"+idx1+"')");
                    System.out.println("Registrar en x1 "+edix1);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro en x1 "+ex.getMessage());
        }
    }
    
    //actualizacion de ruta
    String rutabit,cvb;
    public void rutabit(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select clave_bitacora,cartaportex3 from TBL_REG_X3_1 where fecha_orden BETWEEN  convert(datetime,'"+txtFch1.getText()+" "+"00:00:00"+"') and convert(datetime,'"+txtFch2.getText()+" "+"23:58:00"+"')");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                cvb=rs.getString("clave_bitacora");  
                if(cvb!=null){ 
                   System.out.println("clave de bitacora "+cvb+"***"+rs.getString("cartaportex3"));
                    rutabit1();
                }else{
                   System.out.println("No hay clave de bitacora "+rs.getString("cartaportex3") );
                }                     
             } //fin de while
        } catch (SQLException ex) {
            System.out.println("error en ruta de x3 "+ ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
    
    public void rutabit1(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        //Connection miConexion1 =(Connection)ConexionERP.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select RUTAS,clave_bitacora from bitacora_recorridos where clave_bitacora='"+cvb+"'");
            ResultSet rs=stmt.executeQuery();
            if(rs.next()){
                rutabit= rs.getString("rutas");
                System.out.println("ruta de bitacora "+rutabit+"***"+cvb);
                rutabitACT();             
             }else{
                System.out.println("no existe clave de bitacora");
            }
        } catch (SQLException ex) {
            System.out.println("error en ruta para registo "+ ex.getMessage());
        }
    }
    
    public void rutabitACT(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            statement.execute("update TBL_REG_X3_1 set ruta_bitacora='"+rutabit+"' where clave_bitacora='"+cvb+"'"); 
            System.out.println("ACTUALIZA REGISTRO DE RUTA EN X3 "+rutabit+"***"+cvb);
        } catch (SQLException ex) {
            System.out.println("Error SQL RUTA DE BIT "+ex.getMessage());
        }                  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTAProceso;
    private javax.swing.JButton jbtn1;
    private javax.swing.JLabel lblzh;
    private javax.swing.JTextField txtFch1;
    private javax.swing.JTextField txtFch2;
    public javax.swing.JTextField txtUserf1;
    private javax.swing.JComboBox<String> zhUS;
    // End of variables declaration//GEN-END:variables
}