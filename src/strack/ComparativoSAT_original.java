package strack;

import Clases.ConexionEDI;
import java.io.File;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.Exportar810;
import Clases.Prueba;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.TableModel;

public class ComparativoSAT_original extends javax.swing.JFrame {
    
    DefaultTableModel View = new DefaultTableModel();
    String f1 = "";
    String f2 = "";
    ArrayList row = new ArrayList();
    double[] MT = new double[100];
    String[] nombre = new String[100];
    String[] folio = new String[100];
    String[] uuid = new String[100];
    double total[] = new double[100];
    String[] ncb = new String[100];
    String[] banco = new String[100];
    String[] mtod = new String[100];
    String[] FE = new String[100];
    String[] NE = new String[100];
    String correo = "";
    String output = "";
           
    private DefaultComboBoxModel modelprov;
    
    public ComparativoSAT_original() {
        
        modelprov = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        listaprov();
        
        View.addColumn("Referencia cxp");
        View.addColumn("Poliza de cxp");
        View.addColumn("Proveedor");
        View.addColumn("Periodo de cxp");
        View.addColumn("Fecha de cxp");
        View.addColumn("PERIODO DE EG");
        View.addColumn("FECHA DE EG");
        View.addColumn("EGRESO");
        View.addColumn("EDO EG");
        View.addColumn("MONTO DE EG");
        View.addColumn("CORREO");
        View.addColumn("SERIE");
        View.addColumn("FOLIO");
        View.addColumn("uuid");
        View.addColumn("total");
        View.addColumn("Metodo De Pago");
        View.addColumn("numero_cuentabancariaben");
        View.addColumn("Descrip Banco");
        View.addColumn("Fecha Emisión");
        View.addColumn("Emitido");
        View.addColumn("Usuario");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcomplementos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbproveedor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtinicio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtpoliza = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbestatus = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Complementos de pago");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Complementos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane1.setAutoscrolls(true);

        tblcomplementos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Referencia cxp", "Poliza de cxp", "Proveedor", "Periodo de cxp", "Fecha de cxp", "Perido de EG", "Fecha de EG", "Egreso", "Estatus de EG", "Monto EG", "Correo", "Serie", "Folio", "UUID", "Total", "Metodo de pago", "No. de cuenta ", "Descripcion de banco", "Fecha de emision", "Estatus de solicitud", "Usuario de emision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblcomplementos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblcomplementos.getTableHeader().setReorderingAllowed(false);
        tblcomplementos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcomplementosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblcomplementos);
        if (tblcomplementos.getColumnModel().getColumnCount() > 0) {
            tblcomplementos.getColumnModel().getColumn(0).setMinWidth(40);
            tblcomplementos.getColumnModel().getColumn(0).setPreferredWidth(45);
            tblcomplementos.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jLabel2.setText("Proveedor:");

        cbproveedor.setModel(modelprov);

        jLabel6.setText("Fecha inicial:");

        txtinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtinicioMouseClicked(evt);
            }
        });

        jLabel7.setText("Fecha final:");

        txtfin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfinMouseClicked(evt);
            }
        });

        jLabel8.setText("Poliza:");

        txtpoliza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpolizaActionPerformed(evt);
            }
        });

        jLabel9.setText("Estatus:");

        cbestatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Enviado", "No emitido" }));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busqueda.png"))); // NOI18N
        jButton6.setToolTipText("Consulta por Status/ Fechas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton5.setToolTipText("Exportar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
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

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Narrow", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logo-gmail.png"))); // NOI18N
        jButton8.setToolTipText("Enviar correo");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ok.png"))); // NOI18N
        jButton9.setToolTipText("Vista previa");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtpoliza, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtfin, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(cbproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton6))
                            .addComponent(jButton5)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtpoliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(cbestatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
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
        jLabel4.setText("Solicitud de complementos de pago");

        txtusuario.setEditable(false);
        txtusuario.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (tblcomplementos.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(tblcomplementos);
                nom.add("Hoja1");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    Exportar810 e = new Exportar810(new File(file), tb, nom);
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
        Clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblcomplementosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcomplementosMouseClicked
        //selecicionar registro
    }//GEN-LAST:event_tblcomplementosMouseClicked
    
    String q;    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        LimpiarJtbl();
        if (cbproveedor.getSelectedItem().toString().equals("Seleccione") && txtinicio.getText().equals("") && txtfin.getText().equals("") && txtpoliza.getText().equals("") && cbestatus.getSelectedItem().toString().equals("Seleccione") ){
           //q="select * from vERP_APLICACION_CORREO where FCH_CXP between DATEADD(day,-30,GETDATE()) and GETDATE() order by FCH_CXP asc";
            q="select * from vERP_APLICACION_CORREO where FCH_CXP between DATEADD(day,-120,GETDATE()) and GETDATE() order by FCH_CXP asc";
            Consulta(f1, f2, correo, correo, correo);
        }else if ((!cbproveedor.getSelectedItem().toString().equals("Seleccione")) && txtinicio.getText().equals("") && txtfin.getText().equals("") && txtpoliza.getText().equals("") && cbestatus.getSelectedItem().toString().equals("Seleccione") ){
            System.out.println("solo proveedor");
            q="select * from vERP_APLICACION_CORREO where CLIENTE_NOMBRE='"+cbproveedor.getSelectedItem().toString()+"' order by FCH_CXP asc";
            Consulta(f1, f2, correo, correo, correo);
        }else if (cbproveedor.getSelectedItem().toString().equals("Seleccione") && (!txtinicio.getText().equals("") && !txtfin.getText().equals("")) && txtpoliza.getText().equals("") && cbestatus.getSelectedItem().toString().equals("Seleccione") ){
            System.out.println("fechas de poliza");            
            q="select  * from vERP_APLICACION_CORREO where FCH_CXP between convert(datetime,'"+txtinicio.getText()+" 00:00:00.000') and convert(datetime,'"+txtfin.getText()+" 00:00:00.000') order by FCH_CXP asc";
            Consulta(f1, f2, correo, correo, correo);
        }else if (cbproveedor.getSelectedItem().toString().equals("Seleccione") && txtinicio.getText().equals("") && txtfin.getText().equals("") && (!txtpoliza.getText().equals("")) && cbestatus.getSelectedItem().toString().equals("Seleccione") ){
            System.out.println("solo poliza");                    
            q="select top 5 * from vERP_APLICACION_CORREO where POLIZA='"+txtpoliza.getText()+"' order by FCH_CXP asc";
            Consulta(f1, f2, correo, correo, correo);
        }else if (cbproveedor.getSelectedItem().toString().equals("Seleccione") && txtinicio.getText().equals("") && txtfin.getText().equals("") && txtpoliza.getText().equals("") && (!cbestatus.getSelectedItem().toString().equals("Seleccione")) ){
            System.out.println("solo estatus");  
            if (cbestatus.getSelectedItem().toString().equals("Enviado")){
                q="select * from vERP_APLICACION_CORREO where emitido='"+cbestatus.getSelectedItem().toString()+"' and FCH_CXP between DATEADD(day,-30,GETDATE()) and GETDATE() order by FCH_CXP asc";
                //q="select  * from vERP_APLICACION_CORREO where emitido='"+cbestatus.getSelectedItem().toString()+"' order by FCH_CXP asc";
                Consulta(f1, f2, correo, correo, correo);
            }else{
                q="select  * from vERP_APLICACION_CORREO where emitido is null and emitido='"+cbestatus.getSelectedItem().toString()+"' order by FCH_CXP asc";
                Consulta(f1, f2, correo, correo, correo);
            }            
        }else if ((!cbproveedor.getSelectedItem().toString().equals("Seleccione")) && (!txtinicio.getText().equals("") && !txtfin.getText().equals("")) && txtpoliza.getText().equals("") && cbestatus.getSelectedItem().toString().equals("Seleccione") ){
            System.out.println("solo proveedor y fechas ***");
            q="select  * from vERP_APLICACION_CORREO where CLIENTE_NOMBRE='"+cbproveedor.getSelectedItem().toString()+"' and FCH_CXP between convert(datetime,'"+txtinicio.getText()+" 00:00:00.000') and convert(datetime,'"+txtfin.getText()+" 00:00:00.000') order by FCH_CXP asc";
            Consulta(f1, f2, correo, correo, correo);
        }else if ((!cbproveedor.getSelectedItem().toString().equals("Seleccione")) && (!txtinicio.getText().equals("") && !txtfin.getText().equals("") && !txtpoliza.getText().equals("")) && cbestatus.getSelectedItem().toString().equals("Seleccione") ){
            System.out.println("solo proveedor y fechas y poliza ***");
            q="select  * from vERP_APLICACION_CORREO where CLIENTE_NOMBRE='"+cbproveedor.getSelectedItem().toString()+"' and FCH_CXP between convert(datetime,'"+txtinicio.getText()+" 00:00:00.000') and convert(datetime,'"+txtfin.getText()+" 00:00:00.000') and POLIZA='"+txtpoliza.getText()+"' order by FCH_CXP asc";
            Consulta(f1, f2, correo, correo, correo);            
        }else if ((!cbproveedor.getSelectedItem().toString().equals("Seleccione")) && txtinicio.getText().equals("") && txtfin.getText().equals("") && (!txtpoliza.getText().equals("")) && cbestatus.getSelectedItem().toString().equals("Seleccione") ){
            System.out.println("solo proveedor y poliza ***");
            q="select  * from vERP_APLICACION_CORREO where CLIENTE_NOMBRE='"+cbproveedor.getSelectedItem().toString()+"' and POLIZA='"+txtpoliza.getText()+"' order by FCH_CXP asc";          
            Consulta(f1, f2, correo, correo, correo);
        }else if (cbproveedor.getSelectedItem().toString().equals("Seleccione") && (!txtinicio.getText().equals("") && !txtfin.getText().equals("") && !txtpoliza.getText().equals("")) && cbestatus.getSelectedItem().toString().equals("Seleccione") ){
            System.out.println("solo fcehas y poliza**");            
            q="select  * from vERP_APLICACION_CORREO where FCH_CXP between convert(datetime,'"+txtinicio.getText()+" 00:00:00.000') and convert(datetime,'"+txtfin.getText()+" 00:00:00.000') and POLIZA='"+txtpoliza.getText()+"' order by FCH_CXP asc";
            Consulta(f1, f2, correo, correo, correo);
        }else if ((!cbproveedor.getSelectedItem().toString().equals("Seleccione")) && txtinicio.getText().equals("") && txtfin.getText().equals("") && !txtpoliza.getText().equals("") && (!cbestatus.getSelectedItem().toString().equals("Seleccione")) ){
            System.out.println("proveedor y estatus");            
            if (cbestatus.getSelectedItem().toString().equals("Enviado")){
                q="select  * from vERP_APLICACION_CORREO where CLIENTE_NOMBRE='"+cbproveedor.getSelectedItem().toString()+"' and emitido='"+cbestatus.getSelectedItem().toString()+"' order by FCH_CXP asc";           
                Consulta(f1, f2, correo, correo, correo);
            }else{
                q="select  * from vERP_APLICACION_CORREO where CLIENTE_NOMBRE='"+cbproveedor.getSelectedItem().toString()+"' and emitido is null order by FCH_CXP asc";           
                Consulta(f1, f2, correo, correo, correo);
            }               
        }else if (cbproveedor.getSelectedItem().toString().equals("Seleccione") && (!txtinicio.getText().equals("") && !txtfin.getText().equals("")) && txtpoliza.getText().equals("") && (!cbestatus.getSelectedItem().toString().equals("Seleccione")) ){
            System.out.println("fechas y estatus");
            if (cbestatus.getSelectedItem().toString().equals("Enviado")){
                q="select  * from vERP_APLICACION_CORREO where FCH_CXP between convert(datetime,'"+txtinicio.getText()+" 00:00:00.000') and convert(datetime,'"+txtfin.getText()+" 00:00:00.000') and emitido='"+cbestatus.getSelectedItem().toString()+"' order by FCH_CXP asc";
                Consulta(f1, f2, correo, correo, correo);
            }else{
                q="select  * from vERP_APLICACION_CORREO where FCH_CXP between convert(datetime,'"+txtinicio.getText()+" 00:00:00.000') and convert(datetime,'"+txtfin.getText()+" 00:00:00.000') and emitido is null order by FCH_CXP asc";
                Consulta(f1, f2, correo, correo, correo);
            }            
        }else if ((!cbproveedor.getSelectedItem().toString().equals("Seleccione")) && (!txtinicio.getText().equals("") && !txtfin.getText().equals("")) && txtpoliza.getText().equals("") && (!cbestatus.getSelectedItem().toString().equals("Seleccione")) ){
            System.out.println("fechas y estatus y proveedor***");
            if (cbestatus.getSelectedItem().toString().equals("Enviado")){
                q="select  * from vERP_APLICACION_CORREO where cliente_nombre='"+cbproveedor.getSelectedItem().toString()+"' and FCH_CXP between convert(datetime,'"+txtinicio.getText()+" 00:00:00.000') and convert(datetime,'"+txtfin.getText()+" 00:00:00.000') and emitido='"+cbestatus.getSelectedItem().toString()+"' order by FCH_CXP asc";
                Consulta(f1, f2, correo, correo, correo);
            }else{
                q="select  * from vERP_APLICACION_CORREO where cliente_nombre='"+cbproveedor.getSelectedItem().toString()+"' and FCH_CXP between convert(datetime,'"+txtinicio.getText()+" 00:00:00.000') and convert(datetime,'"+txtfin.getText()+" 00:00:00.000') and emitido is null order by FCH_CXP asc";
                Consulta(f1, f2, correo, correo, correo);
            }            
        }  else{
            JOptionPane.showMessageDialog(null,"La combinacion de datos no se puede procesar","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (correo.equals("Vacio")) {
            JOptionPane.showMessageDialog(null, "No existe correo no se pueden enviar los datos","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        } else  if(!correo.equals("Vacio")&& !row.isEmpty()){
            parametros(row, nombre, MT, folio, uuid, total, ncb, banco, m, t, mtod, output, NE);
        }else{
          JOptionPane.showMessageDialog(null, "Selccione algun valor y presione vista previa","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int FilaSeleccionada;
        try {
            FilaSeleccionada = tblcomplementos.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model=(DefaultTableModel)tblcomplementos.getModel();
                String f10 =(String)model.getValueAt(FilaSeleccionada,10);//correo
                String f11 =(String)model.getValueAt(FilaSeleccionada,13);//uuid
                System.out.println("correo "+f10+" uuid "+f11);
                if( f10==null || f10.equals("") 
                        || f11==null || f11.equals("")
                        ){
                    JOptionPane.showMessageDialog(null,"Se presentan datos vacios","Mensajde de informativo",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    try {
                        //String Fecha = f1;
                        //String Fecha2 = f2;
                        //String Value = (String) cbproveedor.getSelectedItem();
                        table();
                    } catch (ParseException ex) {
                        Logger.getLogger(ComparativoSAT_original.class.getName()).log(Level.SEVERE, null, ex);
                    }                      
                }
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null,"Falla en la conexión","Mensajde de error",JOptionPane.ERROR_MESSAGE);
        }      
    }//GEN-LAST:event_jButton9ActionPerformed

    private void txtpolizaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpolizaActionPerformed
        LimpiarJtbl();
        q="select * from vERP_APLICACION_CORREO where POLIZA like '%"+txtpoliza.getText()+"%' order by FCH_CXP asc";
        Consulta(f1, f2, correo, correo, correo);
    }//GEN-LAST:event_txtpolizaActionPerformed

    private void txtinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtinicioMouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtinicio.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtinicioMouseClicked

    private void txtfinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfinMouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtfin.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtfinMouseClicked
     
    public void Consulta(String Fecha, String Fecha2, String nombre, String poliza, String enviado){
        LimpiarJtbl();
        f1 = Fecha;
        f2 = Fecha2;

        String[] Reg = new String[21];
        try {
            Connection reg = ConexionEDI.GetConnection();
            Statement s = reg.createStatement();
            ResultSet r = null;     
            r = s.executeQuery(q);           
            while (r.next()) {
                String correo="";
                String spacios="";
                String ncb="";
                String ncb2="";
                String banco2="";
                Reg[0] = r.getString("num_ref");
                Reg[1] = r.getString("CXP_CLAVE");
                 if (r.getString("CLIENTE_NOMBRE") == null || r.getString("CLIENTE_NOMBRE").equals("")) {
                    Reg[2] = "Vacio";
                } else {
                    Reg[2] = r.getString("CLIENTE_NOMBRE");
                }               
                Reg[3] = r.getString("periodo_cxp");
                Reg[4] = r.getString("FCH_CXP");
                Reg[5] = r.getString("periodoEG");
                Reg[6] = r.getString("fechaEG");
                Reg[7] = r.getString("POLIZA");
                Reg[8] = r.getString("STATUS");
                Reg[9] = r.getString("MONTO_LOCAL");
                correo = r.getString("email");
                spacios=correo;
                if (spacios == null || spacios.equals("")) {
                    Reg[10] = "Vacio";
                } else {
                    Reg[10] = r.getString("email").trim();
                }
                Reg[11] = r.getString("SERIE");
                if (r.getString("FOLIO")==(null)||r.getString("FOLIO").trim().equals("")) {
                    Reg[12] = "Vacio";
                } else {
                    Reg[12] = r.getString("FOLIO").trim();
                }
                Reg[13] = r.getString("uuid");
                Reg[14] = r.getString("total");
                Reg[15] = r.getString("metodoDePago");
                ncb=r.getString("numero_cuentabancariaben");
                ncb2=ncb;
                if (r.getString("numero_cuentabancariaben")==(null)||ncb2.equals("")) {
                    Reg[16] = "Vacio";
                } else {
                    Reg[16] = r.getString("numero_cuentabancariaben").trim();
                }
               
                  if (r.getString("bancodescripben")==null||r.getString("bancodescripben").trim().equals("")) {
                    Reg[17] = "Vacio";
                } else {
                     Reg[17] = r.getString("bancodescripben").trim();
                }                
                //Reg[18] = r.getString("FCH_EMISION");
                if (r.getString("FCH_EMISION") == null) {
                    Reg[18] = "";
                } else {
                    Reg[18] = r.getString("FCH_EMISION").trim();
                }
                
                
                if (r.getString("EMITIDO") == null) {
                    Reg[19] = "NO ENVIADO";
                } else {
                    Reg[19] = r.getString("EMITIDO").trim();
                }
                if (r.getString("usuario") == null) {
                    Reg[20] = "";
                } else {
                    Reg[20] = r.getString("usuario").trim();
                }
                View.addRow(Reg);                  
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        tblcomplementos.setModel(View);
    }
    
    public void LimpiarJtbl(){
        DefaultTableModel model=(DefaultTableModel) tblcomplementos.getModel();
    	for (int i=0; i<tblcomplementos.getRowCount(); i++){
            model.removeRow(i);
            i-=1;
    	}
    }
        
    public void Clear(){
        txtinicio.setText("");
        txtfin.setText("");
        txtpoliza.setText("");
        cbproveedor.setSelectedItem("Seleccione");
        LimpiarJtbl();     
        jTextArea1.setText("");
        cbestatus.setSelectedItem("Seleccione");
    }
     
    public void listaprov(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("SELECT distinct CLIENTE_NOMBRE FROM vERP_APLICACION_CORREO order by CLIENTE_NOMBRE asc");
            modelprov.addElement("Seleccione");
            while(rs1.next()){
                modelprov.addElement(rs1.getString("CLIENTE_NOMBRE")); 
            }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }    
    
    
    double t = 0;
    double m = 0;
    void table() throws ParseException {
        t = 0;
        m = 0;
        row.add(tblcomplementos.getSelectedRow());
        Set<String> hs = new HashSet<>();
        hs.addAll(row);
        row.clear();
        row.addAll(hs);
        String[] n = new String[100];
        for (int i = 0; i < row.size(); i++) {
            row.get(i);
        }

        TableModel model = tblcomplementos.getModel();
        String f = "";
        for (int i = 0; i < row.size(); i++) {
            nombre[i] = model.getValueAt((int) row.get(i), 2).toString();
            MT[i] = Double.valueOf(model.getValueAt((int) row.get(i), 9).toString());
            folio[i] = model.getValueAt((int) row.get(i), 12).toString();
            uuid[i] = model.getValueAt((int) row.get(i), 13).toString();
            System.out.println("strack.ComparativoSAT_original.table() "+uuid[i]);
            total[i] = Double.valueOf(model.getValueAt((int) row.get(i), 14).toString());
            ncb[i] = model.getValueAt((int) row.get(i), 16).toString();
            banco[i] = model.getValueAt((int) row.get(i), 17).toString();
            mtod[i] = model.getValueAt((int) row.get(i), 15).toString();
            FE[i] = model.getValueAt((int) row.get(i), 6).toString();
            NE[i] = model.getValueAt((int) row.get(i), 19).toString();
            correo= model.getValueAt((int) row.get(i), 10).toString();
            f = FE[0];
        }
        DateFormat parser = new SimpleDateFormat("yyyy-MM-dd");
        Date date = parser.parse(f);

        DateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
        output = formatter.format(date);
        String enca = "Nombre: " + nombre[0] + "   NCB: " + ncb[0] + "    Banco:   " + banco[0] + "\n"
                + " Fecha de Pago:" + output + "\n";
        String tabal = "Folio  \t                                       UUID            \t                                                                                        Total                       Monto Aplicado           Metodo de Pago\n";
        String conte = "";

        for (int i = 0; i < row.size(); i++) {
            if (nombre[0].equals(nombre[i])) {
                conte = conte + (folio[i] + "           \t                  " + uuid[i] + "           \t             \t       \t   " + total[i] + "                    " + MT[i] + "                                      " + mtod[i] + "'\n");
                m = MT[i] + m;
                t = total[i] + t;
            }
        }
        String Total = "                                                                                    \t\t                                                 MONTO PLAZO TOTAL: " + t + "           TOTAL:" + m;
        jTextArea1.setText(enca + tabal + conte + Total);
    }
    
    public void parametros(ArrayList row, String[] Nombre, double[] MT, String[] folio, String[] uuid, double[] total, String[] ncb, String[] banco, double m, double t, String[] mtdo, String out, String[] NE) {
        ArrayList lista = row;
        String[] nombre = Nombre;
        double[] mt = MT;
        String[] Uuid = uuid;
        double[] Total = total;
        String[] ncB = ncb;
        String[] banc = banco;
        
        String[] mtod2 = mtdo;
        String Outs = out;
        String[] ne = NE;
        String user= txtusuario.getText();
        Prueba c = new Prueba();

        c.Prueba(row, nombre, mt, folio, Uuid, Total, ncB, banco, m, t, mtod2, Outs, ne,user);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbestatus;
    private javax.swing.JComboBox<String> cbproveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tblcomplementos;
    private javax.swing.JTextField txtfin;
    private javax.swing.JTextField txtinicio;
    private javax.swing.JTextField txtpoliza;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}