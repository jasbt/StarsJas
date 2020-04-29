package strack;

import Clases.ConexionEDI;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import Clases.ExportarStars;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TBLl_CODE_ERROR extends javax.swing.JFrame {

    DefaultTableModel model;
    public TBLl_CODE_ERROR() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableErrores = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        txtcodigo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catalogo de Errores 214 y 210");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Errores 214 y 210", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Código:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton4.setToolTipText("Exportar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        jButton5.setToolTipText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton3.setToolTipText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl1.setForeground(new java.awt.Color(153, 0, 0));

        JTableErrores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. ", "Código de error", "Status ", "Descripcion", "Transacción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableErrores.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTableErrores.getTableHeader().setReorderingAllowed(false);
        JTableErrores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableErroresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableErrores);
        if (JTableErrores.getColumnModel().getColumnCount() > 0) {
            JTableErrores.getColumnModel().getColumn(0).setResizable(false);
            JTableErrores.getColumnModel().getColumn(1).setMinWidth(120);
            JTableErrores.getColumnModel().getColumn(1).setPreferredWidth(120);
            JTableErrores.getColumnModel().getColumn(1).setMaxWidth(120);
            JTableErrores.getColumnModel().getColumn(2).setMinWidth(50);
            JTableErrores.getColumnModel().getColumn(2).setPreferredWidth(50);
            JTableErrores.getColumnModel().getColumn(2).setMaxWidth(50);
            JTableErrores.getColumnModel().getColumn(3).setMinWidth(350);
            JTableErrores.getColumnModel().getColumn(3).setPreferredWidth(350);
            JTableErrores.getColumnModel().getColumn(3).setMaxWidth(500);
            JTableErrores.getColumnModel().getColumn(4).setMinWidth(120);
            JTableErrores.getColumnModel().getColumn(4).setPreferredWidth(120);
            JTableErrores.getColumnModel().getColumn(4).setMaxWidth(120);
        }

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        jButton7.setToolTipText("Agregar registro");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton6.setToolTipText("Editar registro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton11.setToolTipText("Eliminar registro");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton2.setToolTipText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(447, 447, 447)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
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
                                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7)
                            .addComponent(jButton6)
                            .addComponent(jButton11)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4)
                                .addComponent(jButton5)
                                .addComponent(jButton3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Catalogo de Errores");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addComponent(lblUserVF))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(1079, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (JTableErrores.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(JTableErrores);
                nom.add("Hoja1");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    ExportarStars e = new ExportarStars(new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados exitosamente", "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + e.getMessage(), "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos ha exportar","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        txtcodigo.setText("");
       clearTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    private void JTableErroresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableErroresMouseClicked
        try {
            SelecionaCPO();
        } catch (IOException ex) {
            Logger.getLogger(TBLl_CODE_ERROR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableErroresMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CtalogoR();        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!txtcodigo.getText().equals("")){
            CtalogoE();                
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una código a editar","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        JOptionPane.showMessageDialog(null, "Opción no disponible", "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton11ActionPerformed
    
    String q;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        clearTable();
        if ((!txtcodigo.getText().equals(""))){
            q="SELECT * FROM TBL_CODERROR where code_error='"+txtcodigo.getText()+"'";
            qCodeError();
        }else if (txtcodigo.getText().equals("")){
            q="SELECT * FROM TBL_CODERROR";
            qCodeError();
        }  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        q="SELECT * FROM TBL_CODERROR where code_error='"+txtcodigo.getText()+"'";
        qCodeError();
    }//GEN-LAST:event_txtcodigoActionPerformed
    
    String stAct,stVac;    
    public void clearTable(){
        DefaultTableModel model=(DefaultTableModel) JTableErrores.getModel();
    	for (int i=0; i<JTableErrores.getRowCount(); i++){
    		model.removeRow(i);
    		i-=1;
    	}
    }
       
    public void qCodeError(){
        clearTable();
        DefaultTableModel model = (DefaultTableModel) JTableErrores.getModel();
        JTableErrores.setModel(model);
        String query=q;
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        String [] data = new String[5];
        try {
            Statement st=(Statement)miConexion.createStatement();
            ResultSet resp= st.executeQuery(query);
            while (resp.next()) {
                data[0]=resp.getString("id_code");
                data[1]=resp.getString("code_error");
                data[2]=resp.getString("estado");
                data[3]=resp.getString("descripcion");
                data[4]=resp.getString("transaccion");
                model.addRow(data);
            }JTableErrores.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(TBLl_CODE_ERROR.class.getName()).log(Level.SEVERE, null, ex);
        }try {
            miConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(TBLl_CODE_ERROR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    String edocpo;
    public void SelecionaCPO() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = JTableErrores.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null,"Selecciones una fila","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model=(DefaultTableModel)JTableErrores.getModel();
                edocpo =(String)model.getValueAt(FilaSeleccionada,1);
                txtcodigo.setText(edocpo);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error, intente nuevamente","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
   
    public void CtalogoR(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND ctar='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    RegistarError rcpo=new RegistarError();
                    rcpo.txtUserf1.setText(lblUserVF.getText());
                    rcpo.lblEncabezado.setText("Nuevo código de error"); 
                    rcpo.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado "+ex.getMessage(),"Mebsaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void CtalogoE(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND ctae='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    RegistarError Edt = new RegistarError();
                    Edt.lblEncabezado.setText("Editar código de error");
                    Edt.txtCodigo.setEditable(false);
                    Edt.txtCodigo.setText(txtcodigo.getText());
                    Connection mieditar =(Connection)ConexionEDI.GetConnection();
                    try {
                    Statement steditar =(Statement)mieditar.createStatement();
                    ResultSet editar = steditar.executeQuery("select * from TBL_CODERROR where code_error='"+txtcodigo.getText()+"'");
                        if(editar.next() == true){
                            Edt.txtDescripcion.setText(editar.getString("descripcion"));
                            Edt.txtStatus.setText(editar.getString("estado"));
                            Edt.txtTransaccion.setText(editar.getString("transaccion"));
                        }else {
                            System.out.println("No hay registro");
                         }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
                    }
                    Edt.txtUserf1.setText(lblUserVF.getText());
                    Edt.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"A ocurrido un error inesperado "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableErrores;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    public javax.swing.JLabel lblUserVF;
    public javax.swing.JTextField txtcodigo;
    // End of variables declaration//GEN-END:variables
}