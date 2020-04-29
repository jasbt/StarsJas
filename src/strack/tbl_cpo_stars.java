package strack;

import Clases.ConexionEDI;
import javax.swing.table.DefaultTableModel;
import Clases.FormatoTBLCPO;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class tbl_cpo_stars extends javax.swing.JFrame {

    DefaultTableModel model;
    public tbl_cpo_stars() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablecp = new javax.swing.JTable();
        txtCPO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCPO1 = new javax.swing.JTextField();
        txtCPO2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catalogo de CPO'S");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de CPO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("CPO");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        jButton5.setToolTipText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl1.setForeground(new java.awt.Color(153, 0, 0));

        JTablecp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. ", "CPO", "Terminal", "Equipo ", "Carga ", "Peso", "Estado ", "Nom. Origen ", "Código Origen ", "Nom.Destino", "Código Destino", "Stars", "Recorrido", "Tiempo carga", "Alerta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTablecp.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTablecp.getTableHeader().setReorderingAllowed(false);
        JTablecp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTablecpMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTablecp);
        if (JTablecp.getColumnModel().getColumnCount() > 0) {
            JTablecp.getColumnModel().getColumn(0).setResizable(false);
            JTablecp.getColumnModel().getColumn(1).setMinWidth(80);
            JTablecp.getColumnModel().getColumn(1).setPreferredWidth(80);
            JTablecp.getColumnModel().getColumn(1).setMaxWidth(80);
            JTablecp.getColumnModel().getColumn(3).setMinWidth(50);
            JTablecp.getColumnModel().getColumn(3).setPreferredWidth(50);
            JTablecp.getColumnModel().getColumn(3).setMaxWidth(50);
            JTablecp.getColumnModel().getColumn(4).setMinWidth(80);
            JTablecp.getColumnModel().getColumn(4).setPreferredWidth(80);
            JTablecp.getColumnModel().getColumn(4).setMaxWidth(80);
            JTablecp.getColumnModel().getColumn(5).setMinWidth(60);
            JTablecp.getColumnModel().getColumn(5).setPreferredWidth(60);
            JTablecp.getColumnModel().getColumn(5).setMaxWidth(60);
            JTablecp.getColumnModel().getColumn(6).setMinWidth(60);
            JTablecp.getColumnModel().getColumn(6).setPreferredWidth(60);
            JTablecp.getColumnModel().getColumn(6).setMaxWidth(60);
            JTablecp.getColumnModel().getColumn(7).setMinWidth(160);
            JTablecp.getColumnModel().getColumn(7).setPreferredWidth(180);
            JTablecp.getColumnModel().getColumn(7).setMaxWidth(220);
            JTablecp.getColumnModel().getColumn(8).setMinWidth(80);
            JTablecp.getColumnModel().getColumn(8).setPreferredWidth(80);
            JTablecp.getColumnModel().getColumn(8).setMaxWidth(80);
            JTablecp.getColumnModel().getColumn(9).setMinWidth(160);
            JTablecp.getColumnModel().getColumn(9).setPreferredWidth(180);
            JTablecp.getColumnModel().getColumn(9).setMaxWidth(220);
            JTablecp.getColumnModel().getColumn(10).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(10).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(10).setMaxWidth(70);
            JTablecp.getColumnModel().getColumn(11).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(11).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(11).setMaxWidth(70);
        }

        txtCPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPOActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Origen:");

        txtCPO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPO1ActionPerformed(evt);
            }
        });

        txtCPO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPO2ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton2.setToolTipText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ok.png"))); // NOI18N
        jButton9.setText("Activar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Destino:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cc.png"))); // NOI18N
        jButton4.setText("Desactivar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cok.png"))); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.setToolTipText("Tiempos estimados.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sesion.png"))); // NOI18N
        jButton6.setText("Asignar ruta");
        jButton6.setToolTipText("Tiempos estimados.");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/stal.png"))); // NOI18N
        jButton7.setText("Quitar ruta");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPO1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPO2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(txtCPO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCPO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton5)
                                .addComponent(jButton2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton9)
                                    .addComponent(jButton4)
                                    .addComponent(jButton3)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Catalogo de CPO");

        jLabel10.setText("Usuario:");

        lblUserVF.setText("Usuario");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setToolTipText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1198, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(lblUserVF))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblUserVF))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clear();
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void JTablecpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablecpMouseClicked
        try {
            SelecionaCPO();
        } catch (IOException ex) {
            Logger.getLogger(tbl_cpo_stars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTablecpMouseClicked

    private void txtCPO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPO2ActionPerformed
        q="SELECT * FROM vtbl_cpo_stars where nom_destino like'%"+txtCPO2.getText()+"%'";
        QueryCPO();
    }//GEN-LAST:event_txtCPO2ActionPerformed

    String q;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearTable();        
        if((!txtCPO1.getText().equals("")) && (!txtCPO2.getText().equals("")) && (txtCPO.getText().equals("")) ){
            q="SELECT * FROM vtbl_cpo_stars where nom_origen like'%"+txtCPO1.getText()+"%' and nom_destino like'%"+txtCPO2.getText()+"%' order by id"; 
            QueryCPO();
        }else if(!txtCPO1.getText().equals("") && (txtCPO.getText().equals("")) && (txtCPO2.getText().equals(""))){
            q="SELECT * FROM vtbl_cpo_stars where nom_origen like'%"+txtCPO1.getText()+"%'";
            QueryCPO();
        }else if(!txtCPO2.getText().equals("") && (txtCPO.getText().equals("")) && (txtCPO1.getText().equals("")) ){
            q="SELECT * FROM vtbl_cpo_stars where nom_destino like'%"+txtCPO2.getText()+"%'";
            QueryCPO();
        }else if(!txtCPO.getText().equals("") && (txtCPO1.getText().equals("")) && (txtCPO2.getText().equals(""))){
            q="SELECT * FROM vtbl_cpo_stars where cpo='"+txtCPO.getText()+"'";
            QueryCPO();
        }else{
            q="SELECT * FROM vtbl_cpo_stars";   
            QueryCPO();
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    String stAct,stVac;
    private void txtCPO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPO1ActionPerformed
        clearTable();
        q="SELECT * FROM vtbl_cpo_stars where nom_origen like '%"+txtCPO1.getText()+"%'";  
        QueryCPO();
    }//GEN-LAST:event_txtCPO1ActionPerformed

    private void txtCPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPOActionPerformed
        clearTable();
        q="SELECT * FROM vtbl_cpo_stars where cpo='"+txtCPO.getText()+"'";
        QueryCPO();
    }//GEN-LAST:event_txtCPOActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!txtCPO.getText().equals("")){
            upstarscpoActivo();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta ","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(!txtCPO.getText().equals("")){
            upstarscpoInactivo();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta ","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!txtCPO.getText().equals("")){
            upTiempo();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta ","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!txtCPO.getText().equals("")){
            From_asigna_ruta ter=new  From_asigna_ruta();
            ter.txtUserf1.setText(lblUserVF.getText());
            ter.txtEncabezado.setText("Asignación de ruta"); 
            ter.txtTerminal.setText(tercpo);
            ter.txtruta.setText(txtCPO.getText().toUpperCase());
            ter.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una ruta ","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            tbl_rutas_asignadas ter=new tbl_rutas_asignadas();
            ter.lblUserVF.setText(lblUserVF.getText());
            ter.txtruta.setText(txtCPO.getText().toUpperCase());
            ter.setVisible(true);       
    }//GEN-LAST:event_jButton7ActionPerformed
    
    public void clearTable(){
        DefaultTableModel model=(DefaultTableModel) JTablecp.getModel();
    	for (int i=0; i<JTablecp.getRowCount(); i++){
            model.removeRow(i);
            i-=1;
    	}
    }
    
    public void CtalogoC(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND ctaC='1'");
                if(rs1.next() == true){
                    CancelarCPO();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falla en la conexión","Mensajde de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void CancelarCPO(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from tbl_Reg_CPO where CPO='"+txtCPO.getText()+"' and estado='ACTIVO'");
                if(rs1.next() == true){
                    statement.execute("update tbl_Reg_CPO set estado='"+"CANCELADO"+"' where cpo='"+txtCPO.getText().toUpperCase()+"' ");
                    JOptionPane.showMessageDialog(null, "La CPO se ha cancelado", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);       
                }else {
                    JOptionPane.showMessageDialog(null, "La CPO ya se encuentra Cancelada", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falla en la conexión","Mensajde de error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void QueryCPO(){
        DefaultTableModel model = (DefaultTableModel) JTablecp.getModel();
        JTablecp.setModel(model);
        String query=q;
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
         String [] data = new String[25];
        try {
            Statement st=(Statement)miConexion.createStatement();
            ResultSet resp= st.executeQuery(query);
            while (resp.next()) {
                data[0]=resp.getString("id");
                data[1]=resp.getString("cpo");
                data[2]=resp.getString("terminal");
                data[3]=resp.getString("equipo");
                data[4]=resp.getString("tipocarga");
                data[5]=resp.getString("peso");
                data[6]=resp.getString("estado");
                data[7]=resp.getString("nom_origen");
                data[8]=resp.getString("cod_origen");
                data[9]=resp.getString("nom_destino");
                data[10]=resp.getString("cod_destino");
                data[11]=resp.getString("stars");
                data[12]=resp.getString("hrstransito");
                data[13]=resp.getString("HrsTrans");
                data[14]=resp.getString("alerta");
                model.addRow(data);
            }JTablecp.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(tbl_cpo_stars.class.getName()).log(Level.SEVERE, null, ex);
        }try {
            miConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(tbl_cpo_stars.class.getName()).log(Level.SEVERE, null, ex);
        }        
    FormatoTBLCPO tf1= new FormatoTBLCPO(0);
    JTablecp.setDefaultRenderer (Object.class, tf1);
    }

    String edocpo,tercpo;
    public void SelecionaCPO() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = JTablecp.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
            }else{
                DefaultTableModel model=(DefaultTableModel)JTablecp.getModel();
                String regCPO =(String)model.getValueAt(FilaSeleccionada,1);
                edocpo =(String)model.getValueAt(FilaSeleccionada,6);
                tercpo =(String)model.getValueAt(FilaSeleccionada,2);
                txtCPO.setText(regCPO);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null,"Falla en la conexión","Mensajde de error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void clear(){
       txtCPO.setText("");
       txtCPO1.setText("");
       txtCPO2.setText("");
       clearTable();
    } 
        
    public void upstarscpoActivo(){
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from tbl_Reg_CPO where CPO='"+txtCPO.getText()+"' and estado='ACTIVO'");
                if(rs1.next() == true){
                    statement.execute("update tbl_Reg_CPO set stars='0' where cpo='"+txtCPO.getText().toUpperCase()+"' ");
                    JOptionPane.showMessageDialog(null, "Ruta activada para Stars "+txtCPO.getText().toUpperCase(), "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);       
                }else {
                    JOptionPane.showMessageDialog(null, "Ruta cancelada", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la ruta para stars "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }   
    }    
    
    public void upstarscpoInactivo(){
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from tbl_Reg_CPO where CPO='"+txtCPO.getText()+"'");
                if(rs1.next() == true){
                    statement.execute("update tbl_Reg_CPO set stars=null where cpo='"+txtCPO.getText().toUpperCase()+"' ");
                    JOptionPane.showMessageDialog(null, "Ruta inactiva para Stars "+txtCPO.getText().toUpperCase(), "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);       
                }else {
                    JOptionPane.showMessageDialog(null, "Ruta cancelada", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la ruta para stars "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }   
    } 
    
    public void upTiempo(){      
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from tbl_Reg_CPO where CPO='"+txtCPO.getText()+"' and estado='ACTIVO'");
                if(rs1.next() == true){
                    int i =JOptionPane.showConfirmDialog(this, "¿Modificar los valores de la ruta? ", "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(i == 0){
                        StmCPO scpo=new StmCPO();
                        scpo.txtcpo.setText(rs1.getString("cpo"));
                        scpo.txtcarga.setText(rs1.getString("tipocarga"));
                        scpo.txtorigen.setText(rs1.getString("nom_origen"));
                        scpo.txtdestino.setText(rs1.getString("nom_destino"));
                        scpo.txtrecorrido.setText(rs1.getString("hrstransito"));
                        scpo.txttiempo.setText(rs1.getString("hrstrans"));
                        scpo.txtantes.setText(rs1.getString("lim_antes"));
                        scpo.txtdespues.setText(rs1.getString("lim_desp"));
                        String a=rs1.getString("alerta");   
                        if( a .equals("1")){
                           scpo.jcbactivar.setSelected(true); 
                        }else{
                           scpo.jcbactivar.setSelected(false);
                        }
                        scpo.txtUserf1.setText(lblUserVF.getText());
                        scpo.setVisible(true); 
                    }else if(i == 1){
                        JOptionPane.showMessageDialog(null,"La actualización de valores no se ha realizado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                    }                        
                }else {
                    JOptionPane.showMessageDialog(null, "Ruta cancelada", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la ruta para stars "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablecp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    public javax.swing.JLabel lblUserVF;
    public javax.swing.JTextField txtCPO;
    private javax.swing.JTextField txtCPO1;
    private javax.swing.JTextField txtCPO2;
    // End of variables declaration//GEN-END:variables
}