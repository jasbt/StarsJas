package strack;

import Clases.ConexionEDI;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import Clases.ExportarStars;
import Clases.Formatorctbl;
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

public class TBL_cta_rc extends javax.swing.JFrame {

    DefaultTableModel model;
    public TBL_cta_rc() {
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
        txtCPO = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jcbActivo = new javax.swing.JCheckBox();
        jcbCancelado = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catalogo de reason code");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reason code para Stars", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

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
                "No. ", "Código", "Status", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            JTableErrores.getColumnModel().getColumn(2).setMinWidth(100);
            JTableErrores.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTableErrores.getColumnModel().getColumn(2).setMaxWidth(100);
            JTableErrores.getColumnModel().getColumn(3).setMinWidth(350);
            JTableErrores.getColumnModel().getColumn(3).setPreferredWidth(350);
            JTableErrores.getColumnModel().getColumn(3).setMaxWidth(500);
        }

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ok.png"))); // NOI18N
        jButton7.setToolTipText("Activar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jButton6.setToolTipText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txtCPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPOActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton2.setToolTipText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jcbActivo.setText("Activo");

        jcbCancelado.setText("Inactivo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jcbActivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcbCancelado)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbActivo)
                    .addComponent(jcbCancelado)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(409, 409, 409)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel11)
                                .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Catalogo de Reason Code");

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        clear();
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
            Logger.getLogger(TBL_cta_rc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableErroresMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CtalogoR();        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!txtCPO.getText().equals("")){
            cancelar();                
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una código a editar","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    
    String a;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ((!txtCPO.getText().equals(""))&& !jcbActivo.isSelected() && !jcbCancelado.isSelected()){
            a="SELECT * FROM vTBL_CTA_REASON_CODE  where codigo='"+txtCPO.getText()+"'";
            ReasonCode();
        }else if (txtCPO.getText().equals("")&& jcbActivo.isSelected() && (!jcbCancelado.isSelected())){
            a="SELECT * FROM vTBL_CTA_REASON_CODE  where edo='ACTIVO'";
            ReasonCode();
        }else if (txtCPO.getText().equals("")&& (!jcbActivo.isSelected()) && jcbCancelado.isSelected()){
            a="SELECT * FROM vTBL_CTA_REASON_CODE  where edo='INACTIVO'";
            ReasonCode();
        }else if (txtCPO.getText().equals("") && !jcbActivo.isSelected() && !jcbCancelado.isSelected()){
            a="SELECT * FROM vTBL_CTA_REASON_CODE";
            ReasonCode();
        } 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtCPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPOActionPerformed
        a="SELECT * FROM vTBL_CTA_REASON_CODE where codigo='"+txtCPO.getText()+"'";
        ReasonCode();
    }//GEN-LAST:event_txtCPOActionPerformed
    
    String stAct,stVac;    
    public void clearTable(){
        DefaultTableModel model=(DefaultTableModel) JTableErrores.getModel();
    	for (int i=0; i<JTableErrores.getRowCount(); i++){
    		model.removeRow(i);
    		i-=1;
    	}
    }
       
    public void ReasonCode(){
        clearTable();
            DefaultTableModel model = (DefaultTableModel) JTableErrores.getModel();
            JTableErrores.setModel(model);
            String query=a;
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[5];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("idrc");
                    data[1]=resp.getString("codigo");
                    data[2]=resp.getString("edo");
                    data[3]=resp.getString("descripcion");
                    model.addRow(data);
                }JTableErrores.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_cta_rc.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_cta_rc.class.getName()).log(Level.SEVERE, null, ex);
            }
        Formatorctbl ft = new Formatorctbl(0);
        JTableErrores.setDefaultRenderer (Object.class, ft );
    }

    String edocpo;
    public void SelecionaCPO() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = JTableErrores.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "Seleccione una código a editar","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model=(DefaultTableModel)JTableErrores.getModel();
                edocpo =(String)model.getValueAt(FilaSeleccionada,1);
                txtCPO.setText(edocpo);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public void clear(){
       txtCPO.setText("");
       jcbActivo.setSelected(false);
       jcbActivo.setSelected(false);
       clearTable();
    } 

    public void CtalogoR(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND ctar='1'");
                if(rs1.next() == true){
                    activar();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }    
    
    public void activar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_CTA_REASON_CODE where codigo='"+txtCPO.getText()+"' and edo='1'");
                if(rs1.next() == true){
                    statement.execute("update TBL_CTA_REASON_CODE set edo='0' where codigo='"+txtCPO.getText().toUpperCase()+"' ");
                    JOptionPane.showMessageDialog(null, "El reason code se ha activado", "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);       
                }else {
                    JOptionPane.showMessageDialog(null, "El reason code ya se encuentra activo", "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }  
    }    
    
    public void cancelar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_CTA_REASON_CODE where codigo='"+txtCPO.getText()+"' and edo='0'");
                if(rs1.next() == true){
                    statement.execute("update TBL_CTA_REASON_CODE set edo='1' where codigo='"+txtCPO.getText().toUpperCase()+"' ");
                    JOptionPane.showMessageDialog(null, "El reason code se ha cancelado", "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);       
                }else {
                    JOptionPane.showMessageDialog(null, "El reason code ya se encuentra cancelado", "MensajeiInformativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableErrores;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbActivo;
    private javax.swing.JCheckBox jcbCancelado;
    private javax.swing.JLabel lbl1;
    public javax.swing.JLabel lblUserVF;
    public javax.swing.JTextField txtCPO;
    // End of variables declaration//GEN-END:variables
}