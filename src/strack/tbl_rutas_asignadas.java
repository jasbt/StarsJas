package strack;

import Clases.ConexionEDI;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import Clases.ExportarStars;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

public class tbl_rutas_asignadas extends javax.swing.JFrame {

    DefaultTableModel tra=new DefaultTableModel();
    
    private void PropiedadesTabla(){ 
        tblterminal.setDefaultRenderer(Object.class, new ImgTable());
        String titulos []={"Ruta","Usuario","Estado"};
        tra=new DefaultTableModel(null,titulos);         
        tblterminal.setModel(tra);        
    } 
        
    public tbl_rutas_asignadas() {
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTabla();
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
        tblterminal = new javax.swing.JTable();
        txtruta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sesion de rutas");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de asignación de rutas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Ruta:");

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

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cok.png"))); // NOI18N
        jButton3.setToolTipText("Activar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl1.setForeground(new java.awt.Color(153, 0, 0));

        tblterminal.setModel(tra);
        tblterminal.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblterminal.getTableHeader().setReorderingAllowed(false);
        tblterminal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblterminalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblterminal);

        txtruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrutaActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton2.setToolTipText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton8.setToolTipText("Salir");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Usuario:");

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/stal.png"))); // NOI18N
        jButton6.setToolTipText("Baja");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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
                        .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(346, 346, 346)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
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
                                .addComponent(txtruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton4)
                                .addComponent(jButton5)
                                .addComponent(jButton3)
                                .addComponent(jButton8)
                                .addComponent(jButton6))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Rutas asignadas a usuarios");

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
                .addContainerGap(1063, Short.MAX_VALUE))
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
        if (tblterminal.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(tblterminal);
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
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       txtruta.setText("");
       txtusuario.setText("");
       clearTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(!txtruta.getText().equals("")){
            activar();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una terminal y usuario ","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    private void tblterminalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblterminalMouseClicked
        try {
            SelecionaCPO();
        } catch (IOException ex) {
            Logger.getLogger(tbl_rutas_asignadas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblterminalMouseClicked
    
    String a;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if ((!txtruta.getText().equals(""))){
            a="SELECT * FROM tbl_asig_ruta where ruta like '%"+txtruta.getText().toUpperCase()+"%' order by ruta asc";
            QueryCPO();           
        }else if (txtruta.getText().equals("")){
            a="SELECT * FROM tbl_asig_ruta order by ruta asc";
            QueryCPO();          
        }      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtrutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrutaActionPerformed
        a="SELECT * FROM tbl_asig_ruta where ruta like '%"+txtruta.getText().toUpperCase()+"%' order by ruta asc";
        QueryCPO();   
    }//GEN-LAST:event_txtrutaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        a="SELECT * FROM tbl_asig_ruta where usuario like '%"+txtusuario.getText().toUpperCase()+"%' order by ruta asc";
        QueryCPO();   
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!txtruta.getText().equals("")){
            baja();                
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una terminal y usuario ","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public void clearTable(){
        DefaultTableModel model=(DefaultTableModel) tblterminal.getModel();
    	for (int i=0; i<tblterminal.getRowCount(); i++){
    		model.removeRow(i);
    		i-=1;
    	}
    }
    
    JLabel in;
    public void QueryCPO(){
        clearTable();
        String ed="";
        String edo="";
        
        tblterminal.setDefaultRenderer(Object.class, new ImgTable());
        String query=a;
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        String [] data = new String[3];
        try {
            Statement st=(Statement)miConexion.createStatement();
            ResultSet resp= st.executeQuery(query);
            while (resp.next()) {
                data[0]=resp.getString("ruta");
                data[1]=resp.getString("usuario");
                data[2]=resp.getString("estado");
                ed=resp.getString("estado");
                edo=ed;
                if(edo.equals("0")){
                    in=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));
                }if(edo.equals("1")){
                    in=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));
                }
                tra.addRow(new Object[]{data[0],data[1],in});
            }
        } catch (SQLException ex) {
            Logger.getLogger(tbl_rutas_asignadas.class.getName()).log(Level.SEVERE, null, ex);
        }try {
            miConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(tbl_rutas_asignadas.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }

    String edocpo;
    public void SelecionaCPO() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = tblterminal.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model=(DefaultTableModel)tblterminal.getModel();
                txtruta.setText((String) model.getValueAt(FilaSeleccionada,0));
                txtusuario.setText((String) model.getValueAt(FilaSeleccionada,1));
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public void activar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND ctaTer='1'");
                if(rs1.next() == true){
                    int i =JOptionPane.showConfirmDialog(this, "Confirma la activacion del usuario en la ruta? ",
                    "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(i == 0){
                        try (Connection miConexion2 = (Connection)ConexionEDI.GetConnection()) {
                        try {        
                            PreparedStatement stp2=miConexion2.prepareStatement("update tbl_asig_ruta set estado='0' where ruta='"+txtruta.getText()+"' and usuario='"+txtusuario.getText().toUpperCase()+"'");
                            stp2.executeUpdate();   
                            JOptionPane.showMessageDialog(null,"Actualización correcta de activo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        }
                    }else if(i == 1){
                        JOptionPane.showMessageDialog(null,"Accion no realizada por cancelacion de usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }     
    }
    
    public void baja(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND ctaTer='1'");
                if(rs1.next() == true){
                    int i =JOptionPane.showConfirmDialog(this, "Confirma la baja del usuario en la ruta? ",
                    "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(i == 0){
                        try (Connection miConexion2 = (Connection)ConexionEDI.GetConnection()) {
                        try {        
                            PreparedStatement stp2=miConexion2.prepareStatement("update tbl_asig_ruta set estado='1' where ruta='"+txtruta.getText()+"' and usuario='"+txtusuario.getText().toUpperCase()+"'");
                            stp2.executeUpdate();   
                            JOptionPane.showMessageDialog(null,"Actualización correcta de activo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }
                        }
                    }else if(i == 1){
                        JOptionPane.showMessageDialog(null,"Accion no realizada por cancelacion de usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensajde de error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    public javax.swing.JLabel lblUserVF;
    private javax.swing.JTable tblterminal;
    public javax.swing.JTextField txtruta;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}