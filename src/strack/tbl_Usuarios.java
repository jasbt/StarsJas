package strack;

import Clases.ConexionEDI;
import Clases.ExportarStars;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import javax.swing.table.DefaultTableModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class tbl_Usuarios extends javax.swing.JFrame {

    DefaultTableModel model;
    public tbl_Usuarios() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableUser = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txtbuser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jrbactivo = new javax.swing.JRadioButton();
        jrbinactivo = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Control de Usuarios");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Usuarios", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton5.setToolTipText("Exportar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        JTableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Usuario", "Nombre Completo", "Rol", "Estado", "Fecha Alta", "Usuario", "Fecha Modificación", "Modifica"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableUser.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTableUser.getTableHeader().setReorderingAllowed(false);
        JTableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableUser);
        if (JTableUser.getColumnModel().getColumnCount() > 0) {
            JTableUser.getColumnModel().getColumn(0).setMinWidth(40);
            JTableUser.getColumnModel().getColumn(0).setPreferredWidth(45);
            JTableUser.getColumnModel().getColumn(0).setMaxWidth(80);
            JTableUser.getColumnModel().getColumn(1).setMinWidth(100);
            JTableUser.getColumnModel().getColumn(1).setPreferredWidth(120);
            JTableUser.getColumnModel().getColumn(1).setMaxWidth(150);
            JTableUser.getColumnModel().getColumn(2).setMinWidth(120);
            JTableUser.getColumnModel().getColumn(2).setPreferredWidth(150);
            JTableUser.getColumnModel().getColumn(2).setMaxWidth(180);
            JTableUser.getColumnModel().getColumn(3).setMinWidth(100);
            JTableUser.getColumnModel().getColumn(3).setPreferredWidth(120);
            JTableUser.getColumnModel().getColumn(3).setMaxWidth(150);
            JTableUser.getColumnModel().getColumn(4).setMinWidth(60);
            JTableUser.getColumnModel().getColumn(4).setPreferredWidth(80);
            JTableUser.getColumnModel().getColumn(4).setMaxWidth(120);
            JTableUser.getColumnModel().getColumn(5).setMinWidth(120);
            JTableUser.getColumnModel().getColumn(5).setPreferredWidth(120);
            JTableUser.getColumnModel().getColumn(5).setMaxWidth(120);
            JTableUser.getColumnModel().getColumn(6).setMinWidth(100);
            JTableUser.getColumnModel().getColumn(6).setPreferredWidth(120);
            JTableUser.getColumnModel().getColumn(6).setMaxWidth(150);
            JTableUser.getColumnModel().getColumn(7).setMinWidth(120);
            JTableUser.getColumnModel().getColumn(7).setPreferredWidth(120);
            JTableUser.getColumnModel().getColumn(7).setMaxWidth(120);
            JTableUser.getColumnModel().getColumn(8).setMinWidth(100);
            JTableUser.getColumnModel().getColumn(8).setPreferredWidth(120);
            JTableUser.getColumnModel().getColumn(8).setMaxWidth(150);
        }

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busqueda.png"))); // NOI18N
        jButton6.setToolTipText("Consulta usuario(s)");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        jButton4.setToolTipText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton7.setToolTipText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Usuario:");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        jButton8.setToolTipText("Nuevo usuario");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton2.setToolTipText("Cancelar usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sesion.png"))); // NOI18N
        jButton3.setToolTipText("Activar usuario");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton9.setToolTipText("Editar usuario");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        txtbuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre completo:");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Estado:");

        buttonGroup1.add(jrbactivo);
        jrbactivo.setText("Activo");

        buttonGroup1.add(jrbinactivo);
        jrbinactivo.setText("Inactivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuser, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbactivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbinactivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jrbactivo)
                            .addComponent(jrbinactivo))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtbuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton8)
                        .addComponent(jButton6)
                        .addComponent(jButton9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4)
                            .addComponent(jButton7))
                        .addComponent(jButton2)
                        .addComponent(jButton3)
                        .addComponent(jButton5)))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setText("Usuario:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setToolTipText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Control de Usuarios");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(852, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (JTableUser.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(JTableUser);
                nom.add("Hoja1");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    ExportarStars e = new ExportarStars(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados exitosamente", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos ha exportar","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearForm();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JTableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableUserMouseClicked
        seleccionar();
    }//GEN-LAST:event_JTableUserMouseClicked
    
    String q;
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cleartbl();
        if ( txtbuser.getText().equals("") && txtnombre.getText().equals("") &&  !jrbactivo.isSelected() && !jrbinactivo.isSelected() ){
            q="SELECT * FROM TBL_Usuarios order by fchALTA asc";
            Consulta();
        }else if ( (! txtbuser.getText().equals("")) && txtnombre.getText().equals("") &&  !jrbactivo.isSelected() && !jrbinactivo.isSelected() ){
            q="SELECT * FROM TBL_Usuarios where NombreU like '%"+txtbuser.getText()+"%' order by fchALTA asc";
            Consulta();
        }else if ( txtbuser.getText().equals("") && (!txtnombre.getText().equals("")) &&  !jrbactivo.isSelected() && !jrbinactivo.isSelected() ){
            q="SELECT * FROM TBL_Usuarios where NomCompleto like '%"+txtnombre.getText()+"%' order by fchALTA asc";
            Consulta();
        }else if ( txtbuser.getText().equals("") && txtnombre.getText().equals("") &&  jrbactivo.isSelected() && !jrbinactivo.isSelected() ){
            q="SELECT * FROM TBL_Usuarios where Estado = 'ACTIVO' order by fchALTA asc";
            Consulta();
        }else if ( txtbuser.getText().equals("") && txtnombre.getText().equals("") &&  !jrbactivo.isSelected() && jrbinactivo.isSelected() ){
            q="SELECT * FROM TBL_Usuarios where Estado = 'CANCELADO' order by fchALTA asc";
            Consulta();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        consultarUsuerR();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!txtbuser.getText().equals("")){
            FechaSit();
            consultarUsuerC();            
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione el usuario a cancelar", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!txtbuser.getText().equals("")){
            FechaSit();
            consultarUsuerA();            
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione el usuario a cancelar", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!txtbuser.getText().equals("")){
            if((edo.equals("ACTIVO"))){
                consultarUsuerE();               
            }else{
                JOptionPane.showMessageDialog(null, " El usuario no se encuntra activo", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            }        
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un usuario", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtbuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuserActionPerformed
        cleartbl();
        System.out.println("Buscar usuario");
        DefaultTableModel model = (DefaultTableModel) JTableUser.getModel();
            JTableUser.setModel(model);
            String query="SELECT * FROM TBL_Usuarios  where NombreU='"+txtbuser.getText()+"' order by ID";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("id");
                    data[1]=resp.getString("NombreU");
                    data[2]=resp.getString("NomCompleto");
                    data[3]=resp.getString("Rol");
                    data[4]=resp.getString("Estado");
                    data[5]=resp.getString("fchALTA").substring(0,11);                                         
                    data[6]=resp.getString("Usuario");  
                    data[7]=resp.getString("fchBaja");//.substring(0,10);
                    data[8]=resp.getString("Modifico");
                    model.addRow(data);
                }JTableUser.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(tbl_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(tbl_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }  
    }//GEN-LAST:event_txtbuserActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed
       
    public void Consulta(){
        cleartbl();        
        DefaultTableModel model = (DefaultTableModel) JTableUser.getModel();
        JTableUser.setModel(model);
        String query=q;
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        String [] data = new String[20];
        try {
            Statement st=(Statement)miConexion.createStatement();
            ResultSet resp= st.executeQuery(query);
            while (resp.next()) {
                data[0]=resp.getString("id");
                data[1]=resp.getString("NombreU");
                data[2]=resp.getString("NomCompleto");
                data[3]=resp.getString("Rol");
                data[4]=resp.getString("Estado");
                data[5]=resp.getString("fchALTA").substring(0,11);                                         
                data[6]=resp.getString("Usuario");  
                data[7]=resp.getString("fchBaja");//.substring(0,10);
                data[8]=resp.getString("Modifico");
                    model.addRow(data);
            }JTableUser.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(tbl_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }try {
             miConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(tbl_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }   
    
    public void cleartbl(){
    DefaultTableModel model=(DefaultTableModel) JTableUser.getModel();
    	for (int i=0; i<JTableUser.getRowCount(); i++){
    		model.removeRow(i);
    		i-=1;
    	}
    }
    
    public void clearForm(){
        txtbuser.setText("");
        txtnombre.setText("");
        buttonGroup1.clearSelection();
        cleartbl();
    }
    
    String fcreacion;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        fcreacion=datefecha.format(date);
    }
    
    public void Cancela(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where nombreu='"+txtbuser.getText()+"' and estado='ACTIVO'");
                if(rs1.next() == true){
                    upCancela();                          
                }else {
                    JOptionPane.showMessageDialog(null, "El usuario ya se encuentra Cancelado", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }  
    }
    
    public void upCancela() throws SQLException{
        System.out.println("** "+fcreacion);
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFecha = fcreacion;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        PreparedStatement stp=miConexion.prepareStatement("update TBL_Usuarios  set fchBaja=?,modifico='"+txtUserf1.getText().toUpperCase()+"',estado='CANCELADO' where nombreu='"+txtbuser.getText()+"'");
        stp.setDate(1, new java.sql.Date(fechaj.getTime()));
        stp.executeUpdate();
        JOptionPane.showMessageDialog(null, "El usuario se ha Cancelado", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
    }
    
    String edo;
    public void seleccionar(){
        int FilaSeleccionada;
        try {
            FilaSeleccionada = JTableUser.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
            }else{
                DefaultTableModel model=(DefaultTableModel)JTableUser.getModel();
                String id =(String)model.getValueAt(FilaSeleccionada,1);
                edo =(String)model.getValueAt(FilaSeleccionada,4);
                txtbuser.setText(id);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }    
    
    public void activar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where nombreu='"+txtbuser.getText()+"' and estado='CANCELADO'");
                if(rs1.next() == true){
                    upactivar();                          
                }else {
                    JOptionPane.showMessageDialog(null, "El usuario ya se encuentra Activo", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }  
    }
    
    public void upactivar() throws SQLException{
        System.out.println("** "+fcreacion);
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFecha = fcreacion;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        PreparedStatement stp=miConexion.prepareStatement("update TBL_Usuarios  set fchBaja=?,modifico='"+txtUserf1.getText().toUpperCase()+"',estado='ACTIVO' where nombreu='"+txtbuser.getText()+"'");
        stp.setDate(1, new java.sql.Date(fechaj.getTime()));
        stp.executeUpdate();
        JOptionPane.showMessageDialog(null, "El usuario se ha activado", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
    }
    
    public void consultarUsuerR(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND UR='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    STRusuario cuser=new STRusuario();
                    cuser.txtUserf1.setText(txtUserf1.getText());
                    cuser.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void consultarUsuerE(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND UE='1'");
                if(rs1.next() == true){
                this.setVisible(true); 
                STEusuario cuser=new STEusuario();
                Connection mieditar =(Connection)ConexionEDI.GetConnection();
                try {
                   Statement statementedi =(Statement)mieditar.createStatement();
                    ResultSet editar = statementedi.executeQuery("select * from TBL_Usuarios where NombreU='"+txtbuser.getText()+"' and Estado='activo'");
                        if(editar.next() == true){
                            cuser.txtNuser.setText(editar.getString("nombreu").trim());
                            cuser.txtCodigo.setText(editar.getString("contrasenia").trim());
                            cuser.txtNombre.setText(editar.getString("nomcompleto").trim());
                            cuser.txtRol.setText(editar.getString("rol").trim());            
                            if(editar.getString("stars").trim().equals("1")){
                                cuser.jst1.setSelected(true);
                            }else {}
                            if(editar.getString("stx3").trim().equals("1")){
                                cuser.jst2.setSelected(true);
                            }else{}
                            if(editar.getString("stAF").trim().equals("1")){
                                cuser.jst3.setSelected(true);
                            }else{}
                            if(editar.getString("stx1").trim().equals("1")){
                                cuser.jst4.setSelected(true);
                            }else{}
                            if(editar.getString("stAPS").trim().equals("1")){
                                cuser.jst5.setSelected(true);
                            }else{}
                            if(editar.getString("stAG").trim().equals("1")){
                                cuser.jst6.setSelected(true);
                            }else{}
                            if(editar.getString("stAPV").trim().equals("1")){
                                cuser.jst7.setSelected(true);
                            }else{}
                            if(editar.getString("stPa").trim().equals("1")){
                                cuser.jst8.setSelected(true);
                            }else{}
                            if(editar.getString("stPn").trim().equals("1")){
                                cuser.jst9.setSelected(true);
                            }else{}
                            if(editar.getString("starsr").trim().equals("1")){
                                cuser.jst10.setSelected(true);
                            }else{}
                            if(editar.getString("starse").trim().equals("1")){
                                cuser.jst11.setSelected(true);
                            }else{}
                            if(editar.getString("starsc").trim().equals("1")){
                                cuser.jst12.setSelected(true);
                            }else{}
                            if(editar.getString("starsb").trim().equals("1")){
                                cuser.jst13.setSelected(true);
                            }else{}
                            if(editar.getString("starsex").trim().equals("1")){
                                cuser.jst14.setSelected(true);
                            }else{}
                            if(editar.getString("RDoctos").trim().equals("1")){
                                cuser.jst15.setSelected(true);
                            }else{}
                            if(editar.getString("rdr").trim().equals("1")){
                                cuser.jst16.setSelected(true);
                            }else{}
                            if(editar.getString("rde").trim().equals("1")){
                                cuser.jst17.setSelected(true);
                            }else{}
                            if(editar.getString("rdc").trim().equals("1")){
                                cuser.jst18.setSelected(true);
                            }else{}
                            if(editar.getString("rdb").trim().equals("1")){
                                cuser.jst19.setSelected(true);
                            }else{}
                            if(editar.getString("rdex").trim().equals("1")){
                                cuser.jst20.setSelected(true);
                            }else{}
                            if(editar.getString("Admin").trim().equals("1")){
                                cuser.jst21.setSelected(true);
                            }else{}
                            if(editar.getString("usuarios").trim().equals("1")){
                                cuser.jst22.setSelected(true);
                            }else{}
                            if(editar.getString("ur").trim().equals("1")){
                                cuser.jst23.setSelected(true);
                            }else{}
                            if(editar.getString("ue").trim().equals("1")){
                                cuser.jst24.setSelected(true);
                            }else{}
                            if(editar.getString("uc").trim().equals("1")){
                                cuser.jst25.setSelected(true);
                            }else{}
                            if(editar.getString("ua").trim().equals("1")){
                                cuser.jst26.setSelected(true);
                            }else{}
                            if(editar.getString("ub").trim().equals("1")){
                                cuser.jst27.setSelected(true);
                            }else{}
                            if(editar.getString("uex").trim().equals("1")){
                                cuser.jst28.setSelected(true);
                            }else{}
                            if(editar.getString("Edi810").trim().equals("1")){
                                cuser.jst29.setSelected(true);
                            }else{}
                            if(editar.getString("edi810des").trim().equals("1")){
                                cuser.jst30.setSelected(true);
                            }else{}
                            if(editar.getString("Edi210").trim().equals("1")){
                                cuser.jst31.setSelected(true);
                            }else{}
                            if(editar.getString("edi210r").trim().equals("1")){
                                cuser.jst32.setSelected(true);
                            }else{}
                            if(editar.getString("edi210e").trim().equals("1")){
                                cuser.jst33.setSelected(true);
                            }else{}
                            if(editar.getString("edi210c").trim().equals("1")){
                                cuser.jst34.setSelected(true);
                            }else{}
                            if(editar.getString("edi210b").trim().equals("1")){
                                cuser.jst35.setSelected(true);
                            }else{}
                            if(editar.getString("edi210ex").trim().equals("1")){
                                cuser.jst36.setSelected(true);
                            }else{}
                            if(editar.getString("edi210RCrea").trim().equals("1")){
                                cuser.jst37.setSelected(true);
                            }else{}
                            if(editar.getString("CtaCPO").trim().equals("1")){
                                cuser.jst38.setSelected(true);
                            }else{}
                            if(editar.getString("CtaEDI").trim().equals("1")){
                                cuser.jst39.setSelected(true);
                            }else{}
                            if(editar.getString("ctar").trim().equals("1")){
                                cuser.jst40.setSelected(true);
                            }else{}
                            if(editar.getString("ctae").trim().equals("1")){
                                cuser.jst41.setSelected(true);
                            }else{}
                            if(editar.getString("ctac").trim().equals("1")){
                                cuser.jst42.setSelected(true);
                            }else{}
                            if(editar.getString("ctab").trim().equals("1")){
                                cuser.jst43.setSelected(true);
                            }else{}
                            if(editar.getString("ctaex").trim().equals("1")){
                                cuser.jst44.setSelected(true);
                            }else{}
                            if(editar.getString("CtlAceso").trim().equals("1")){
                                cuser.jst45.setSelected(true);
                            }else{}
                            if(editar.getString("ctlav").trim().equals("1")){
                                cuser.jst46.setSelected(true);
                            }else{}
                            if(editar.getString("ctlae").trim().equals("1")){
                                cuser.jst47.setSelected(true);
                            }else{}
                            if(editar.getString("ctluser").trim().equals("1")){
                                cuser.jst48.setSelected(true);
                            }else{}
                            if(editar.getString("ctlusee").trim().equals("1")){
                                cuser.jst49.setSelected(true);
                            }else{}
                            if(editar.getString("ctlusec").trim().equals("1")){
                                cuser.jst50.setSelected(true);
                            }else{}
                            if(editar.getString("ctluses").trim().equals("1")){
                                cuser.jst51.setSelected(true);
                            }else{}
                            if(editar.getString("ctluseb").trim().equals("1")){
                                cuser.jst52.setSelected(true);
                            }else{}
                            if(editar.getString("ctluseex").trim().equals("1")){
                                cuser.jst53.setSelected(true);
                            }else{}
                            if(editar.getString("ctlAPL").trim().equals("1")){
                                cuser.jst54.setSelected(true);
                            }else{}
                            if(editar.getString("aplr").trim().equals("1")){
                                cuser.jst55.setSelected(true);
                            }else{}
                            if(editar.getString("aple").trim().equals("1")){
                                cuser.jst56.setSelected(true);
                            }else{}
                            if(editar.getString("aplc").trim().equals("1")){
                                cuser.jst57.setSelected(true);
                            }else{}
                            if(editar.getString("aplb").trim().equals("1")){
                                cuser.jst58.setSelected(true);
                            }else{}
                            if(editar.getString("aplex").trim().equals("1")){
                                cuser.jst59.setSelected(true);
                            }else{}
                            if(editar.getString("ctlexp").trim().equals("1")){
                                cuser.jst60.setSelected(true);
                            }else{}
                            if(editar.getString("expr").trim().equals("1")){
                                cuser.jst61.setSelected(true);
                            }else{}
                            if(editar.getString("expe").trim().equals("1")){
                                cuser.jst62.setSelected(true);
                            }else{}
                            if(editar.getString("expp").trim().equals("1")){
                                cuser.jst63.setSelected(true);
                            }else{}
                            if(editar.getString("expb").trim().equals("1")){
                                cuser.jst64.setSelected(true);
                            }else{}
                            if(editar.getString("expc").trim().equals("1")){
                                cuser.jst65.setSelected(true);
                            }else{}
                            if(editar.getString("expex").trim().equals("1")){
                                cuser.jst66.setSelected(true);
                            }else{}
                            if(editar.getString("expA").trim().equals("1")){
                                cuser.jst67.setSelected(true);
                            }else{}
                            if(editar.getString("expAH").trim().equals("1")){
                                cuser.jst68.setSelected(true);
                            }else{}
                            if(editar.getString("strars210").trim().equals("1")){
                                cuser.jst72.setSelected(true);
                            }else{}
                            if(editar.getString("RINCS").trim().equals("1")){
                                cuser.jst69.setSelected(true);
                            }else{}
                            if(editar.getString("AINC").trim().equals("1")){
                                cuser.jst70.setSelected(true);
                            }else{}
                            if(editar.getString("FINC").trim().equals("1")){
                                cuser.jst71.setSelected(true);
                            }else{}
                            if(editar.getString("CINC").trim().equals("1")){
                                cuser.jst73.setSelected(true);
                            }else{}
                            if(editar.getString("QINC").trim().equals("1")){
                                cuser.jst74.setSelected(true);
                            }else{}
                            if(editar.getString("EXPINC").trim().equals("1")){
                                cuser.jst76.setSelected(true);
                            }else{}
                            if(editar.getString("INVTI").trim().equals("1")){
                                cuser.jst77.setSelected(true);
                            }else{}
                            if(editar.getString("conf").trim().equals("1")){
                                cuser.jstconfiguracion.setSelected(true);
                            }else{}
                            if(editar.getString("ctaTer").trim().equals("1")){
                                cuser.jcbTerminal.setSelected(true);
                            }else{}
                            if(editar.getString("cont").trim().equals("1")){
                                cuser.cbcomplemento.setSelected(true);
                            }else{}
                        }else {
                            System.out.println("No hay registro");
                        }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
                }                                         
                cuser.txtUserf1.setText(txtUserf1.getText());
                cuser.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void consultarUsuerC(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND UC='1'");
                if(rs1.next() == true){
                    Cancela();
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void consultarUsuerA(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+txtUserf1.getText()+"' AND UA='1'");
                if(rs1.next() == true){
                    activar();
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableUser;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrbactivo;
    private javax.swing.JRadioButton jrbinactivo;
    public javax.swing.JTextField txtUserf1;
    private javax.swing.JTextField txtbuser;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}