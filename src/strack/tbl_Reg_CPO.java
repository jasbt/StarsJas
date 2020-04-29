package strack;

import Clases.ConexionEDI;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import Clases.ExportarStars;
import Clases.FormatoTBLCPO;
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

public class tbl_Reg_CPO extends javax.swing.JFrame {

    DefaultTableModel model;
    public tbl_Reg_CPO() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablecp = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        txtCPO = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCPO1 = new javax.swing.JTextField();
        txtCPO2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Catalogo de CPO'S");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de CPO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("CPO");

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

        JTablecp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. ", "CPO", "Equipo ", "Carga ", "Peso", "Estado ", "Nom. Origen ", "Código Origen ", "Dir.Origen", "Edo.Origen", "Cd.Origen", "CP.Origen ", "Nom.Destino", "Código Destino", "Dir.Destino", "Edo.Destino", "Cd.Destino", "CP.Destino", "Nom.Centro Costo", "Código Centro Costo", "Dir.Centro Costo", "Edo.Centro Costo", "Cd.Centro Costo", "CP.Centro Costo", "Tipo", "Terminal", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
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
            JTablecp.getColumnModel().getColumn(2).setMinWidth(50);
            JTablecp.getColumnModel().getColumn(2).setPreferredWidth(50);
            JTablecp.getColumnModel().getColumn(2).setMaxWidth(50);
            JTablecp.getColumnModel().getColumn(3).setMinWidth(80);
            JTablecp.getColumnModel().getColumn(3).setPreferredWidth(80);
            JTablecp.getColumnModel().getColumn(3).setMaxWidth(80);
            JTablecp.getColumnModel().getColumn(4).setMinWidth(60);
            JTablecp.getColumnModel().getColumn(4).setPreferredWidth(60);
            JTablecp.getColumnModel().getColumn(4).setMaxWidth(60);
            JTablecp.getColumnModel().getColumn(5).setMinWidth(60);
            JTablecp.getColumnModel().getColumn(5).setPreferredWidth(60);
            JTablecp.getColumnModel().getColumn(5).setMaxWidth(60);
            JTablecp.getColumnModel().getColumn(6).setMinWidth(160);
            JTablecp.getColumnModel().getColumn(6).setPreferredWidth(180);
            JTablecp.getColumnModel().getColumn(6).setMaxWidth(220);
            JTablecp.getColumnModel().getColumn(7).setMinWidth(80);
            JTablecp.getColumnModel().getColumn(7).setPreferredWidth(80);
            JTablecp.getColumnModel().getColumn(7).setMaxWidth(80);
            JTablecp.getColumnModel().getColumn(8).setMinWidth(160);
            JTablecp.getColumnModel().getColumn(8).setPreferredWidth(180);
            JTablecp.getColumnModel().getColumn(8).setMaxWidth(220);
            JTablecp.getColumnModel().getColumn(9).setMinWidth(120);
            JTablecp.getColumnModel().getColumn(9).setPreferredWidth(150);
            JTablecp.getColumnModel().getColumn(9).setMaxWidth(180);
            JTablecp.getColumnModel().getColumn(10).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(10).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(10).setMaxWidth(70);
            JTablecp.getColumnModel().getColumn(11).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(11).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(11).setMaxWidth(70);
            JTablecp.getColumnModel().getColumn(12).setMinWidth(160);
            JTablecp.getColumnModel().getColumn(12).setPreferredWidth(180);
            JTablecp.getColumnModel().getColumn(12).setMaxWidth(220);
            JTablecp.getColumnModel().getColumn(13).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(13).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(13).setMaxWidth(70);
            JTablecp.getColumnModel().getColumn(14).setMinWidth(160);
            JTablecp.getColumnModel().getColumn(14).setPreferredWidth(180);
            JTablecp.getColumnModel().getColumn(14).setMaxWidth(220);
            JTablecp.getColumnModel().getColumn(15).setMinWidth(120);
            JTablecp.getColumnModel().getColumn(15).setPreferredWidth(150);
            JTablecp.getColumnModel().getColumn(15).setMaxWidth(180);
            JTablecp.getColumnModel().getColumn(16).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(16).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(16).setMaxWidth(70);
            JTablecp.getColumnModel().getColumn(17).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(17).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(17).setMaxWidth(70);
            JTablecp.getColumnModel().getColumn(18).setMinWidth(160);
            JTablecp.getColumnModel().getColumn(18).setPreferredWidth(180);
            JTablecp.getColumnModel().getColumn(18).setMaxWidth(220);
            JTablecp.getColumnModel().getColumn(19).setMinWidth(80);
            JTablecp.getColumnModel().getColumn(19).setPreferredWidth(80);
            JTablecp.getColumnModel().getColumn(19).setMaxWidth(80);
            JTablecp.getColumnModel().getColumn(20).setMinWidth(160);
            JTablecp.getColumnModel().getColumn(20).setPreferredWidth(180);
            JTablecp.getColumnModel().getColumn(20).setMaxWidth(220);
            JTablecp.getColumnModel().getColumn(21).setMinWidth(120);
            JTablecp.getColumnModel().getColumn(21).setPreferredWidth(150);
            JTablecp.getColumnModel().getColumn(21).setMaxWidth(180);
            JTablecp.getColumnModel().getColumn(22).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(22).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(22).setMaxWidth(70);
            JTablecp.getColumnModel().getColumn(23).setMinWidth(70);
            JTablecp.getColumnModel().getColumn(23).setPreferredWidth(70);
            JTablecp.getColumnModel().getColumn(23).setMaxWidth(70);
            JTablecp.getColumnModel().getColumn(26).setMinWidth(80);
            JTablecp.getColumnModel().getColumn(26).setPreferredWidth(80);
            JTablecp.getColumnModel().getColumn(26).setMaxWidth(100);
        }

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        jButton7.setToolTipText("Nueva CPO");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton6.setToolTipText("Editar CPO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton11.setToolTipText("Cancelar CPO");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        txtCPO.setEditable(false);
        txtCPO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPOActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Folio:");

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Status:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Activo", "Cancelado", "Todos" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sello.png"))); // NOI18N
        jButton8.setText("Reg.CPO");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
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
                        .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCPO1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPO2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addGap(0, 355, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton7)
                    .addComponent(jButton6)
                    .addComponent(jButton11)
                    .addComponent(jButton2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCPO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txtCPO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton3))
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
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
        if (JTablecp.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(JTablecp);
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
        txtCPO.setText("");
        txtCPO1.setText("");
        txtCPO2.setText("");
        clearTable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            exitForm(evt);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }

    private void JTablecpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTablecpMouseClicked
        try {
            SelecionaCPO();
        } catch (IOException ex) {
            Logger.getLogger(tbl_Reg_CPO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTablecpMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        CtalogoR();        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!txtCPO.getText().equals("")){
            if(!edocpo.equals("CANCELADO")){
                CtalogoE();
            }else{
                JOptionPane.showMessageDialog(null, "No se puede editar una CPO cancelada","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una CPO a editar","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(!txtCPO.getText().equals("")){
            CtalogoC();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione la CPO a cancelar", "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtCPO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPO2ActionPerformed
    
    String c;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if((!txtCPO1.getText().equals("")) && (!txtCPO2.getText().equals(""))){
            c="SELECT * FROM tbl_Reg_CPO where cpo between "+ txtCPO1.getText() +" and "+ txtCPO2.getText()+" order by id"; 
            QueryCPO();
        }else if(!txtCPO1.getText().equals("")){
            c="SELECT * FROM tbl_Reg_CPO where cpo='"+txtCPO1.getText()+"'";
            QueryCPO();
        }else{
            c="SELECT * FROM tbl_Reg_CPO";
            QueryCPO();
        } 
    }//GEN-LAST:event_jButton2ActionPerformed
    
    String stAct,stVac;
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(evt.getSource() == jComboBox1){
            stVac =(String)jComboBox1.getSelectedItem();
        }if(stVac == "Activo"){
            c="SELECT * FROM tbl_Reg_CPO where estado='"+"ACTIVO"+"'";
            QueryCPO();
        }else if(stVac == "Cancelado"){
            c="SELECT * FROM tbl_Reg_CPO where estado='"+"CANCELADO"+"'";
            QueryCPO();
        }else if(stVac == "Todos"){
            c="SELECT * FROM tbl_Reg_CPO";
            QueryCPO();
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtCPO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPO1ActionPerformed
        c="SELECT * FROM tbl_Reg_CPO where cpo='"+txtCPO1.getText()+"'";
        QueryCPO();
    }//GEN-LAST:event_txtCPO1ActionPerformed

    private void txtCPOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPOActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(!txtCPO.getText().equals("")){
            registroCPO();            
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una CPO a copiar ","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }        
    }//GEN-LAST:event_jButton8ActionPerformed
    
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
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void CancelarCPO(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from tbl_Reg_CPO where CPO='"+txtCPO.getText()+"' and estado='ACTIVO'");
                if(rs1.next() == true){                    
                    int i =JOptionPane.showConfirmDialog(this, "Corfirma cancelación de la ruta :"+"\n"+" '"+txtCPO.getText()+"'  ? ",
                    "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(i == 0){
                        statement.execute("update tbl_Reg_CPO set estado='"+"CANCELADO"+"' where cpo='"+txtCPO.getText().toUpperCase()+"' ");
                        JOptionPane.showMessageDialog(null, "La CPO se ha cancelado", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
                    }else if(i == 1){
                       JOptionPane.showMessageDialog(null, "El proceso de cobranza cancelado ","Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);   
                    }                          
                }else {
                    JOptionPane.showMessageDialog(null, "La CPO ya se encuentra Cancelada", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);  
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void QueryCPO(){
        clearTable();        
        DefaultTableModel model = (DefaultTableModel) JTablecp.getModel();
        JTablecp.setModel(model);
        String query=c;
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        String [] data = new String[27];
        try {
            Statement st=(Statement)miConexion.createStatement();
            ResultSet resp= st.executeQuery(query);
            while (resp.next()) {
                data[0]=resp.getString("id");
                data[1]=resp.getString("cpo");
                data[2]=resp.getString("equipo");
                data[3]=resp.getString("tipocarga");
                data[4]=resp.getString("peso");
                data[5]=resp.getString("estado");
                data[6]=resp.getString("nom_origen");
                data[7]=resp.getString("cod_origen");
                data[8]=resp.getString("dir_origen");
                data[9]=resp.getString("cd_origen");
                data[10]=resp.getString("ccd_origen");
                data[11]=resp.getString("cp_origen");
                data[12]=resp.getString("nom_destino");
                data[13]=resp.getString("cod_destino");
                data[14]=resp.getString("dir_destino");
                data[15]=resp.getString("cd_destino");
                data[16]=resp.getString("ccd_destino");
                data[17]=resp.getString("cp_destino");
                data[18]=resp.getString("nom_ccosto");
                data[19]=resp.getString("cod_ccosto");
                data[20]=resp.getString("dir_ccosto");
                data[21]=resp.getString("cd_ccosto");
                data[22]=resp.getString("ccd_ccosto");
                data[23]=resp.getString("cp_ccosto");
                data[24]=resp.getString("tipo");
                data[25]=resp.getString("terminal");
                data[26]=resp.getString("usuario");
                model.addRow(data);
            }JTablecp.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(tbl_Reg_CPO.class.getName()).log(Level.SEVERE, null, ex);
        }try {
            miConexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(tbl_Reg_CPO.class.getName()).log(Level.SEVERE, null, ex);
        }        
    FormatoTBLCPO tf1= new FormatoTBLCPO(0);
    JTablecp.setDefaultRenderer (Object.class, tf1);
    }

    String edocpo;
    public void SelecionaCPO() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = JTablecp.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "Seleccione un registro","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model=(DefaultTableModel)JTablecp.getModel();
                String regCPO =(String)model.getValueAt(FilaSeleccionada,1);
                edocpo =(String)model.getValueAt(FilaSeleccionada,5);
                txtCPO.setText(regCPO);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }
   
    public void CtalogoR(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND ctar='1'");
                if(rs1.next() == true){
                    RegCPO rcpo=new RegCPO();
                    rcpo.txtUserf1.setText(lblUserVF.getText());
                    rcpo.lblencabezado.setText("Registro de CPO");
                    rcpo.setVisible(true);                     
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void CtalogoE(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND ctae='1'");
                if(rs1.next() == true){
                        RegCPO cpoEdt=new RegCPO ();
                        cpoEdt.txtRegCPO.setEditable(false);
                        cpoEdt.txtRegCPO.setText(txtCPO.getText());
                        cpoEdt.lblencabezado.setText("Editar CPO");
                        cpoEdt.txtUserf1.setText(lblUserVF.getText());                        
                                Connection miConexioncpo =(Connection)ConexionEDI.GetConnection();
                                try {
                                   Statement statementcpo =(Statement)miConexioncpo.createStatement();
                                   ResultSet rscpo = statementcpo.executeQuery("select * from TBL_Reg_CPO where CPO='"+txtCPO.getText()+"' and estado='activo'");
                                        if(rscpo.next() == true){
                                            cpoEdt.txtEquipo.setText(rscpo.getString("equipo"));
                                            cpoEdt.txtCarga.setText(rscpo.getString("tipocarga"));
                                            cpoEdt.txtPeso.setText(rscpo.getString("peso"));
                                            cpoEdt.txtModo.setText(rscpo.getString("modo"));
                                            cpoEdt.txttipo.setText(rscpo.getString("tipo"));
                                            cpoEdt.cbterminal.setSelectedItem(rscpo.getString("terminal"));
                                            cpoEdt.txtviaje.setText(rscpo.getString("smp"));
                                            cpoEdt.txtnomOrigen.setText(rscpo.getString("nom_origen"));
                                            cpoEdt.txtcodigoOrigen.setText(rscpo.getString("cod_origen"));
                                            cpoEdt.txtdirOrigen.setText(rscpo.getString("dir_origen"));
                                            cpoEdt.txtedoOrigen.setText(rscpo.getString("cd_origen"));
                                            cpoEdt.txtcodOrigen.setText(rscpo.getString("ccd_origen"));
                                            cpoEdt.txtcpOrigen.setText(rscpo.getString("cp_origen"));
                                            cpoEdt.txtnomDestino.setText(rscpo.getString("nom_destino"));
                                            cpoEdt.txtcodigoDestino.setText(rscpo.getString("cod_destino"));
                                            cpoEdt.txtdirDestino.setText(rscpo.getString("dir_destino"));
                                            cpoEdt.txtedoDestino.setText(rscpo.getString("cd_destino"));
                                            cpoEdt.txtcodDestino.setText(rscpo.getString("ccd_destino"));
                                            cpoEdt.txtcpDestino.setText(rscpo.getString("cp_destino"));
                                            cpoEdt.txtnomCosto.setText(rscpo.getString("nom_ccosto"));
                                            cpoEdt.txtcodigoCosto.setText(rscpo.getString("cod_ccosto"));
                                            cpoEdt.txtdirCosto.setText(rscpo.getString("dir_ccosto"));
                                            cpoEdt.txtedoCosto.setText(rscpo.getString("cd_ccosto"));
                                            cpoEdt.txtcodCosto.setText(rscpo.getString("ccd_ccosto"));
                                            cpoEdt.txtcpCosto.setText(rscpo.getString("cp_ccosto"));
                                        }else {
                                            System.out.println("No hay registro");
                                        }
                                } catch (SQLException ex) {
                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error","Mensaje de error",JOptionPane.ERROR_MESSAGE);
                                }                      
                        cpoEdt.setVisible(true);                    
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String txtEquipo,txtCarga,txtPeso,txtModo,txttipo,txtEstado,txtviaje,                   
        txtnomOrigen,txtcodigoOrigen,txtdirOrigen,txtedoOrigen,txtcodOrigen,txtcpOrigen,                  
        txtnomDestino,txtcodigoDestino,txtdirDestino,txtedoDestino,txtcodDestino,txtcpDestino,
        txtnomCosto,txtcodigoCosto,txtdirCosto,txtedoCosto,txtcodCosto,txtcpCosto,txtterminal;
    public void registroCPO(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_Reg_CPO where CPO='"+txtCPO.getText()+"'");
                if(rs1.next() == true){
                    System.out.println("existe registro");
                    txtEquipo=rs1.getString("equipo");
                    txtCarga=rs1.getString("tipocarga");
                    txtPeso=rs1.getString("peso");
                    txtModo=rs1.getString("modo");
                    txttipo=rs1.getString("tipo");
                    txtEstado=rs1.getString("estado");
                    txtviaje=rs1.getString("smp");                    
                    txtnomOrigen=rs1.getString("nom_origen");
                    txtcodigoOrigen=rs1.getString("cod_origen");
                    txtdirOrigen=rs1.getString("dir_origen");
                    txtedoOrigen=rs1.getString("cd_origen");
                    txtcodOrigen=rs1.getString("ccd_origen");
                    txtcpOrigen=rs1.getString("cp_origen");                    
                    txtnomDestino=rs1.getString("nom_destino");
                    txtcodigoDestino=rs1.getString("cod_destino");
                    txtdirDestino=rs1.getString("dir_destino");
                    txtedoDestino=rs1.getString("cd_destino");
                    txtcodDestino=rs1.getString("ccd_destino");
                    txtcpDestino=rs1.getString("cp_destino");                    
                    txtnomCosto=rs1.getString("nom_ccosto");
                    txtcodigoCosto=rs1.getString("cod_ccosto");
                    txtdirCosto=rs1.getString("dir_ccosto");
                    txtedoCosto=rs1.getString("cd_ccosto");
                    txtcodCosto=rs1.getString("ccd_ccosto");
                    txtcpCosto=rs1.getString("cp_ccosto"); 
                    txtterminal=rs1.getString("terminal");
                    CPOcopy();
                }else {
                    System.out.println("No hay registro");
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String mss;
    public void CPOcopy(){
        mss = JOptionPane.showInputDialog( "Ingrese la nueva cpo" );                    
        if("null".equals(mss) || mss == null|| mss.equals("null")){                                           
            JOptionPane.showMessageDialog(null,"No ha realizado la copia de la CPO","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);                    
        }else {
            GuardarCPO(); 
        }
    }    
    
    public void GuardarCPO(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_Reg_CPO where CPO='"+mss.toUpperCase()+"'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null,"La CPO ya se encuentra registrada","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE); 
                }else {
                    statement.execute("insert into TBL_Reg_CPO (CPO,equipo,tipocarga,peso,nom_origen,cod_origen,dir_origen,cd_origen,ccd_origen,cp_origen,nom_destino,cod_destino,"
                    + "dir_destino,cd_destino,ccd_destino,cp_destino,nom_ccosto,cod_ccosto,dir_ccosto,cd_ccosto,ccd_ccosto,cp_ccosto,estado,modo,usuario,tipo,smp,terminal) "
                    +"values('"+mss.toUpperCase()+"','"+txtEquipo.toUpperCase()+"','"+txtCarga.toUpperCase()+"','"+txtPeso.toUpperCase()+"','"+txtnomOrigen.toUpperCase()+"','"+txtcodigoOrigen.toUpperCase()
                    +"','"+txtdirOrigen.toUpperCase()+"','"+txtedoOrigen.toUpperCase()+"','"+txtcodOrigen.toUpperCase()+"','"+txtcpOrigen.toUpperCase()+"','"+txtnomDestino.toUpperCase()+"','"
                    +txtcodigoDestino.toUpperCase()+"','"+txtdirDestino.toUpperCase()+"','"+txtedoDestino.toUpperCase()+"','"+txtcodDestino.toUpperCase()+"','"+txtcpDestino.toUpperCase()+"','"
                    +txtnomCosto.toUpperCase()+"','"+txtcodigoCosto.toUpperCase()+"','"+txtdirCosto.toUpperCase()+"','"+txtedoCosto.toUpperCase()+"','"+txtcodCosto.toUpperCase()+"','"+txtcpCosto.toUpperCase()
                    +"','"+txtEstado.toUpperCase()+"','"+txtModo.toUpperCase().trim()+"','"+lblUserVF.getText().toUpperCase()+"','"+txttipo+"','"+txtviaje.trim().toUpperCase()+"','"+txtterminal.toUpperCase()+"')");
                    JOptionPane.showMessageDialog(null,"Registro guardado","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error para registar la nueva cpo","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }    
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablecp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblUserVF;
    public javax.swing.JTextField txtCPO;
    private javax.swing.JTextField txtCPO1;
    private javax.swing.JTextField txtCPO2;
    // End of variables declaration//GEN-END:variables
}