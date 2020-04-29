package strack;
// la complicidad de tus labios.
import java.io.File;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.ConexionEDI;
import Clases.ExportarStars;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;

public class PanelConfiguracion extends javax.swing.JFrame {
    private DefaultComboBoxModel modelmodulo;
    private DefaultComboBoxModel modelsubmodulo;
    DefaultTableModel model;
    
    public PanelConfiguracion() {
        modelmodulo = new DefaultComboBoxModel(new String [] {});
        modelsubmodulo = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        modulo();
        submodulo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblConfiguracion = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jcbModulo = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jcbsubmodulo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        jrbactivo = new javax.swing.JRadioButton();
        jrbinactivo = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel14.setText("jLabel14");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Panel de configuración del sistema");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración de apartados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Modulo:");

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

        jtblConfiguracion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modulo", "Apartado", "Clave ", "Nombre clave", "Descripción ", "Fecha", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblConfiguracion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtblConfiguracion.getTableHeader().setReorderingAllowed(false);
        jtblConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblConfiguracionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblConfiguracion);
        if (jtblConfiguracion.getColumnModel().getColumnCount() > 0) {
            jtblConfiguracion.getColumnModel().getColumn(0).setResizable(false);
            jtblConfiguracion.getColumnModel().getColumn(1).setMinWidth(100);
            jtblConfiguracion.getColumnModel().getColumn(1).setPreferredWidth(120);
            jtblConfiguracion.getColumnModel().getColumn(1).setMaxWidth(150);
            jtblConfiguracion.getColumnModel().getColumn(2).setMinWidth(100);
            jtblConfiguracion.getColumnModel().getColumn(2).setPreferredWidth(100);
            jtblConfiguracion.getColumnModel().getColumn(2).setMaxWidth(120);
            jtblConfiguracion.getColumnModel().getColumn(3).setMinWidth(100);
            jtblConfiguracion.getColumnModel().getColumn(3).setPreferredWidth(120);
            jtblConfiguracion.getColumnModel().getColumn(3).setMaxWidth(150);
            jtblConfiguracion.getColumnModel().getColumn(4).setMinWidth(120);
            jtblConfiguracion.getColumnModel().getColumn(4).setPreferredWidth(150);
            jtblConfiguracion.getColumnModel().getColumn(4).setMaxWidth(500);
            jtblConfiguracion.getColumnModel().getColumn(5).setMinWidth(100);
            jtblConfiguracion.getColumnModel().getColumn(5).setPreferredWidth(100);
            jtblConfiguracion.getColumnModel().getColumn(5).setMaxWidth(120);
            jtblConfiguracion.getColumnModel().getColumn(6).setMinWidth(60);
            jtblConfiguracion.getColumnModel().getColumn(6).setPreferredWidth(60);
            jtblConfiguracion.getColumnModel().getColumn(6).setMaxWidth(60);
        }

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/jbt.png"))); // NOI18N
        jButton6.setToolTipText("Configuración de elemento");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jcbModulo.setModel(modelmodulo);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Sub modulo:");

        jcbsubmodulo.setModel(modelsubmodulo);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Estado:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Clave:");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbactivo);
        jrbactivo.setText("Activo");

        buttonGroup1.add(jrbinactivo);
        jrbinactivo.setText("Inactivo");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton7.setToolTipText("Consultar datos");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1227, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbsubmodulo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbactivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrbinactivo)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jcbModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jcbsubmodulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jrbactivo)
                            .addComponent(jrbinactivo))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton3)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Panel de configuración");

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
                .addGap(29, 29, 29)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addComponent(lblUserVF, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblUserVF))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jtblConfiguracion.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(jtblConfiguracion);
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
        limpiartbl();
        txtClave.setText("");
        jcbModulo.setSelectedItem("Seleccione");
        jcbsubmodulo.setSelectedItem("Seleccione");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jtblConfiguracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblConfiguracionMouseClicked
        try {
            SelecionaRegistro() ;
        } catch (IOException ex) {
            Logger.getLogger(PanelConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jtblConfiguracionMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (txtClave.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Indique el parametro a visualizar","Informativo",JOptionPane.INFORMATION_MESSAGE);
        }else{
            From_Configuracion fc = new From_Configuracion();
            Connection miConexionx3 =(Connection)ConexionEDI.GetConnection();
            try {
            Statement statementx3 =(Statement)miConexionx3.createStatement();
            ResultSet rx3 = statementx3.executeQuery("select * from v_configuracion where Clave='"+txtClave.getText()+"'");
            if(rx3.next() == true){  
                fc.txtclave.setText(txtClave.getText());
                fc.txtApartado.setText(rx3.getString("apartado").trim());
                fc.txtDescripcion.setText(rx3.getString("descripcion").trim());
                fc.txtparametro1.setText(rx3.getString("parametro_1"));
                fc.txtparametro2.setText(rx3.getString("parametro_2"));
                fc.txtparametro3.setText(rx3.getString("valores"));
                if(rx3.getString("edo").equals("1")){
                    fc.jcbestado.setSelected(true);
                }else{
                    fc.jcbestado.setSelected(false);
                }                
                fc.txtUserf1.setText(lblUserVF.getText());
                fc.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Los datos no se han cargado correctamente","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Error en la conexión, intente nuevamente. ","Error",JOptionPane.ERROR_MESSAGE);
            }              
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    
    String query;
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(txtClave.getText().equals("") && !jrbactivo.isSelected()&& !jrbinactivo.isSelected() && jcbModulo.getSelectedItem().toString().equals("Seleccione") && jcbsubmodulo.getSelectedItem().toString().equals("Seleccione")){
            query="select * from v_configuracion order by fecha";
            consulta();
        }else if(txtClave.getText().equals("") && !jrbactivo.isSelected() && !jrbinactivo.isSelected() && (!jcbModulo.getSelectedItem().toString().equals("Seleccione")) && jcbsubmodulo.getSelectedItem().toString().equals("Seleccione")){
            query="select * from v_configuracion where modulo='"+jcbModulo.getSelectedItem().toString()+"' order by fecha asc";
            consulta();
        }else if(txtClave.getText().equals("") && (!jrbactivo.isSelected() && !jrbinactivo.isSelected()) && jcbModulo.getSelectedItem().toString().equals("Seleccione") && (!jcbsubmodulo.getSelectedItem().toString().equals("Seleccione"))){
            query="select * from v_configuracion where apartado='"+jcbsubmodulo.getSelectedItem().toString()+"' order by fecha asc";
            consulta();
        }else if((!txtClave.getText().equals("")) && (!jrbactivo.isSelected() && !jrbinactivo.isSelected()) && (jcbModulo.getSelectedItem().toString().equals("Seleccione") && jcbsubmodulo.getSelectedItem().toString().equals("Seleccione"))){
            query="select * from v_configuracion where clave='"+txtClave.getText()+"' order by fecha asc";
            consulta();
        }else if(txtClave.getText().equals("") && (jrbactivo.isSelected() && !jrbinactivo.isSelected()) && jcbModulo.getSelectedItem().toString().equals("Seleccione") && jcbsubmodulo.getSelectedItem().toString().equals("Seleccione")){
            query="select * from v_configuracion where edo='1' order by fecha asc";
            consulta();
        }else if(txtClave.getText().equals("") && (!jrbactivo.isSelected()) && (jrbinactivo.isSelected()) && jcbModulo.getSelectedItem().toString().equals("Seleccione") && jcbsubmodulo.getSelectedItem().toString().equals("Seleccione")){
            query="select * from v_configuracion where edo='0' order by fecha asc";
            consulta();
        }       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        limpiartbl();
        DefaultTableModel model = (DefaultTableModel) jtblConfiguracion.getModel();
        jtblConfiguracion.setModel(model);
        String query="select * from v_configuracion where clave='"+txtClave.getText()+"'"; 
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        String [] data = new String[25];
        try {
            Statement st=(Statement)miConexion.createStatement();
            ResultSet resp= st.executeQuery(query);
            while (resp.next()) {
                data[0]=resp.getString("modulo");
                data[1]=resp.getString("apartado");
                data[2]=resp.getString("clave");
                data[3]=resp.getString("nom_clave");
                data[4]=resp.getString("descripcion");
                data[5]=resp.getString("fecha");
                data[6]=resp.getString("edo");
                model.addRow(data);
            }jtblConfiguracion.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(PanelConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }try {
            miConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(PanelConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtClaveActionPerformed
     
    public void limpiartbl(){
        DefaultTableModel model=(DefaultTableModel) jtblConfiguracion.getModel();
    	for (int i=0; i<jtblConfiguracion.getRowCount(); i++){
            model.removeRow(i);
            i-=1;
    	}
    }

    public void SelecionaRegistro() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = jtblConfiguracion.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
            }else{
                DefaultTableModel model=(DefaultTableModel)jtblConfiguracion.getModel();
                String id =(String)model.getValueAt(FilaSeleccionada,2);
                txtClave.setText(id);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }
    
    public void modulo(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select distinct modulo from v_configuracion");
            modelmodulo.addElement("Seleccione");
                while(rs1.next()){
                    modelmodulo.addElement(rs1.getString("modulo")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public void submodulo(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select distinct apartado from v_configuracion");
            modelsubmodulo.addElement("Seleccione");
                while(rs1.next()){
                    modelsubmodulo.addElement(rs1.getString("apartado")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public void consulta(){
        limpiartbl();
        DefaultTableModel model = (DefaultTableModel) jtblConfiguracion.getModel();
        jtblConfiguracion.setModel(model);
        String q=query;
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        String [] data = new String[25];
        try {
            Statement st=(Statement)miConexion.createStatement();
            ResultSet resp= st.executeQuery(q);
            while (resp.next()) {
                data[0]=resp.getString("modulo");
                data[1]=resp.getString("apartado");
                data[2]=resp.getString("clave");
                data[3]=resp.getString("nom_clave");
                data[4]=resp.getString("descripcion");
                data[5]=resp.getString("fecha");
                data[6]=resp.getString("edo");
                model.addRow(data);
            }jtblConfiguracion.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(PanelConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }try {
            miConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(PanelConfiguracion.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
         
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JComboBox<String> jcbModulo;
    private javax.swing.JComboBox<String> jcbsubmodulo;
    private javax.swing.JRadioButton jrbactivo;
    private javax.swing.JRadioButton jrbinactivo;
    private javax.swing.JTable jtblConfiguracion;
    public javax.swing.JLabel lblUserVF;
    private javax.swing.JTextField txtClave;
    // End of variables declaration//GEN-END:variables
}