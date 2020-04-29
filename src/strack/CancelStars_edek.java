package strack;

import java.io.File;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.ConexionEDI;
import Clases.Exportar810;
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CancelStars_edek extends javax.swing.JFrame {

    DefaultTableModel tm=new DefaultTableModel();
    private void PropiedadesTabla(){
        JTblCancel.setDefaultRenderer(Object.class, new ImgTable());
        String titulos []={"No.","Carta porte", "Fecha", "Movimiento", "CPO", "Nombre de origen", "Ciudad de origen", "Ciudad de destino", "Observaciones", "Evidencia", "Código de error", "Categoria", "Usuario"};
        tm=new DefaultTableModel(null,titulos);
        JTblCancel.setModel(tm);
    }
    
    public CancelStars_edek() {
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTblCancel = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        txtFolio2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTer = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtMov = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtfch1 = new javax.swing.JTextField();
        txtfch2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mov. Cancelados de Stars.edek");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mov. de Stars Cancelados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jScrollPane1.setAutoscrolls(true);

        JTblCancel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Cartaporte", "Fecha", "Mov.", "CPO", "Nom. Origen", "Cd. Origen", "Cd. Destino", "Observaciones", "Bol", "Error", "Categoria", "Usuarios"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTblCancel.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTblCancel.getTableHeader().setReorderingAllowed(false);
        JTblCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTblCancelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTblCancel);
        if (JTblCancel.getColumnModel().getColumnCount() > 0) {
            JTblCancel.getColumnModel().getColumn(0).setMinWidth(40);
            JTblCancel.getColumnModel().getColumn(0).setPreferredWidth(45);
            JTblCancel.getColumnModel().getColumn(0).setMaxWidth(80);
            JTblCancel.getColumnModel().getColumn(1).setMinWidth(120);
            JTblCancel.getColumnModel().getColumn(1).setPreferredWidth(100);
            JTblCancel.getColumnModel().getColumn(1).setMaxWidth(160);
            JTblCancel.getColumnModel().getColumn(2).setMinWidth(80);
            JTblCancel.getColumnModel().getColumn(2).setPreferredWidth(80);
            JTblCancel.getColumnModel().getColumn(2).setMaxWidth(100);
            JTblCancel.getColumnModel().getColumn(3).setMinWidth(50);
            JTblCancel.getColumnModel().getColumn(3).setPreferredWidth(50);
            JTblCancel.getColumnModel().getColumn(3).setMaxWidth(50);
            JTblCancel.getColumnModel().getColumn(4).setMinWidth(60);
            JTblCancel.getColumnModel().getColumn(4).setPreferredWidth(80);
            JTblCancel.getColumnModel().getColumn(4).setMaxWidth(100);
            JTblCancel.getColumnModel().getColumn(5).setMinWidth(100);
            JTblCancel.getColumnModel().getColumn(5).setPreferredWidth(120);
            JTblCancel.getColumnModel().getColumn(5).setMaxWidth(180);
            JTblCancel.getColumnModel().getColumn(6).setMinWidth(100);
            JTblCancel.getColumnModel().getColumn(6).setPreferredWidth(120);
            JTblCancel.getColumnModel().getColumn(6).setMaxWidth(150);
            JTblCancel.getColumnModel().getColumn(7).setMinWidth(100);
            JTblCancel.getColumnModel().getColumn(7).setPreferredWidth(120);
            JTblCancel.getColumnModel().getColumn(7).setMaxWidth(150);
            JTblCancel.getColumnModel().getColumn(8).setMinWidth(100);
            JTblCancel.getColumnModel().getColumn(8).setPreferredWidth(120);
            JTblCancel.getColumnModel().getColumn(8).setMaxWidth(160);
            JTblCancel.getColumnModel().getColumn(9).setMinWidth(100);
            JTblCancel.getColumnModel().getColumn(9).setPreferredWidth(100);
            JTblCancel.getColumnModel().getColumn(9).setMaxWidth(120);
            JTblCancel.getColumnModel().getColumn(10).setMinWidth(55);
            JTblCancel.getColumnModel().getColumn(10).setPreferredWidth(65);
            JTblCancel.getColumnModel().getColumn(10).setMaxWidth(80);
            JTblCancel.getColumnModel().getColumn(12).setMinWidth(100);
            JTblCancel.getColumnModel().getColumn(12).setPreferredWidth(100);
            JTblCancel.getColumnModel().getColumn(12).setMaxWidth(120);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Folio:");

        txtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Terminal:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTer, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel4)
                .addComponent(txtTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Mov.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMov, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(txtMov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fechas:");

        txtfch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfch1MouseClicked(evt);
            }
        });

        txtfch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtfch2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfch1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfch2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtfch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtfch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3)
        );

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busqueda.png"))); // NOI18N
        jButton6.setToolTipText("Consulta por Status/ Fechas");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton5.setToolTipText("Exportar");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
        jButton4.setToolTipText("Limpiar");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton7.setToolTipText("Salir");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        lblError.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblError.setForeground(new java.awt.Color(204, 0, 0));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel6.setText("Descripción:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cok.png"))); // NOI18N
        jButton2.setToolTipText("Correcto");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w2.png"))); // NOI18N
        jButton3.setToolTipText("Advertencia");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w3.png"))); // NOI18N
        jButton8.setToolTipText("Espera acuse");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w1.png"))); // NOI18N
        jButton9.setToolTipText("Error Fatal");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Mov. de Stars Cancelados");

        jLabel10.setText("Usuario:");

        lblUserVF.setText("Usuario");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setToolTipText("Salir");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUserVF, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addContainerGap(838, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserVF)
                    .addComponent(jLabel10))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (JTblCancel.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(JTblCancel);
                nom.add("Hoja1");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    Exportar810 e = new Exportar810(new File(file), tb, nom);
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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Clear(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JTblCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTblCancelMouseClicked
        try {
            SelecionaRegistro();
        } catch (IOException ex) {
            Logger.getLogger(CancelStars_edek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTblCancelMouseClicked
        
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        LimpiarJtbl();
        try {
            Consulta();
        } catch (ParseException ex) {
            Logger.getLogger(CancelStars_edek.class.getName()).log(Level.SEVERE, null, ex);
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
        
    private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
        query="SELECT * FROM vtbl_can_mov_ter where folio='"+txtFolio.getText()+"' and st='"+lblUserVF.getText()+"' order by idst";            
        consultasql();
    }//GEN-LAST:event_txtFolioActionPerformed

    private void txtfch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfch1MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtfch1.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtfch1MouseClicked

    private void txtfch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfch2MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtfch2.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtfch2MouseClicked
    
    String fc1,nomArch,dt1,local,sub1,sub,sub3,sub4,dtError,cad1,hora,fecha,codigo,fch1,query;      
    public void Consulta() throws ParseException{
        if(!txtFolio.getText().equals("" )&&(txtFolio2.getText().equals("") && txtfch1.getText().equals("") && txtfch2.getText().equals("") && txtTer.getText().equals("") && txtMov.getText().equals(""))){
            query="SELECT * FROM vtbl_can_mov_ter where folio='"+txtFolio.getText()+"' and st='"+lblUserVF.getText()+"'  order by idst";            
            consultasql();
        }else if((!txtFolio.getText().equals("" )) && (!txtFolio2.getText().equals(""))&&(txtfch1.getText().equals("") && txtfch2.getText().equals("") && txtTer.getText().equals("") && txtMov.getText().equals(""))){
            query="SELECT * FROM vtbl_can_mov_ter where folio between '"+txtFolio.getText()+"' and '"+txtFolio2.getText()+"' and st='"+lblUserVF.getText()+"' order by idst";
            consultasql();
        }else if( !txtTer.getText().equals("") && ( txtFolio.getText().equals("" )&& txtFolio2.getText().equals("") && txtMov.getText().equals("") && txtfch1.getText().equals("") && txtfch2.getText().equals("")) ){
            query="SELECT * FROM vtbl_can_mov_ter where ter='"+txtTer.getText()+"' order by idst";
            consultasql();
        }else if( !txtTer.getText().equals("") && ( txtFolio.getText().equals("" )&& txtFolio2.getText().equals("") && txtMov.getText().equals("") && (!txtfch1.getText().equals("")) && (!txtfch2.getText().equals("")) ) ){
            query="SELECT * FROM vtbl_can_mov_ter where ter='"+txtTer.getText()+"' and fecha between convert(datetime,'"+txtfch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtfch2.getText()+" 23:59:00.000') and st='"+lblUserVF.getText()+"'  order by idst";
            consultasql();
        }else if(txtFolio2.getText().equals("") && txtMov.getText().equals("") && txtfch1.getText().equals("") && txtfch2.getText().equals("") && (!txtTer.getText().equals("")) && (!txtFolio.getText().equals(""))){
            query="SELECT * FROM vtbl_can_mov_ter where folio='"+txtTer.getText()+"' and ter='"+txtTer.getText()+"' and st='"+lblUserVF.getText()+"' ";
            consultasql();
        }else if(txtTer.getText().equals("" )&& txtFolio2.getText().equals("") && (!txtMov.getText().equals("")) && txtfch1.getText().equals("") && txtfch2.getText().equals("") && txtFolio.getText().equals("")){
            query="SELECT * FROM vtbl_can_mov_ter where mov='Mov."+txtMov.getText()+"' and st='"+lblUserVF.getText()+"'  order by idst";
            consultasql();
        }else if(txtTer.getText().equals("" )&& txtFolio2.getText().equals("") && (!txtMov.getText().equals("")) &&(!txtfch1.getText().equals("")) &&(!txtfch2.getText().equals("")) && txtFolio.getText().equals("")){
            query="SELECT * FROM vtbl_can_mov_ter where fecha between convert(datetime,'"+txtfch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtfch2.getText()+" 23:59:00.000') and mov='Mov."+txtMov.getText()+"' and st='"+lblUserVF.getText()+"' ";
            consultasql();
        }else if(txtTer.getText().equals("" )&& txtFolio2.getText().equals("") && txtMov.getText().equals("") &&(!txtfch1.getText().equals("")) &&(!txtfch2.getText().equals("")) && txtFolio.getText().equals("")){
            query="SELECT * FROM vtbl_can_mov_ter where fecha between convert(datetime,'"+txtfch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtfch2.getText()+" 23:59:00.000') and st='"+lblUserVF.getText()+"' ";
             consultasql();  
        }else if(txtTer.getText().equals("" )&& txtFolio2.getText().equals("") && txtMov.getText().equals("") && txtfch1.getText().equals("") && txtfch2.getText().equals("") && txtFolio.getText().equals("")){
            query="SELECT * FROM vtbl_can_mov_ter where st='"+lblUserVF.getText()+"' order by idst";
            consultasql();
        }
    }
    
    JLabel e;
    public void consultasql(){
        String cat="";
        String ca="";
        JTblCancel.setDefaultRenderer(Object.class, new ImgTable());
        String [] Reg=new String[21];      
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(query);
                while (rs1.next()) {
                    Reg[0]=rs1.getString("idst"); 
                    Reg[1]=rs1.getString("cartaporte");
                    Reg[2]=rs1.getString("fecha");
                    Reg[3]=rs1.getString("mov");
                    Reg[4]=rs1.getString("CPO");
                    Reg[5]=rs1.getString("nom_origen");
                    Reg[6]=rs1.getString("cd_origen");
                    Reg[7]=rs1.getString("cd_destino");
                    Reg[8]=rs1.getString("observacion");
                    Reg[9]=rs1.getString("evidencia");
                    Reg[10]=rs1.getString("Error");
                    Reg[12]=rs1.getString("usuario");
                    cat=rs1.getString("categoria");
                    ca=cat;                    
                    if(ca == null || ca.equals("")){
                        e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
                    }else{
                        if (null == ca){
                            e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));
                        }else switch (ca) {
                            case "IA":
                                e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));
                                break;
                            case "IE":
                                e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w2.png"));
                                break;
                            case "IR":
                                e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));
                                break;
                            case "":
                            default:
                                break;
                        }                      
                    }
                    tm.addRow(new Object[]{Reg[0],Reg[1],Reg[2],Reg[3],Reg[4],Reg[5],Reg[6],Reg[7],Reg[8],Reg[9],Reg[10],e,Reg[12]});                   

                }//while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } JTblCancel.setModel(tm);
        
    }
    
    public void LimpiarJtbl(){
        DefaultTableModel model=(DefaultTableModel) JTblCancel.getModel();
    	for (int i=0; i<JTblCancel.getRowCount(); i++){
            model.removeRow(i);
            i-=1;
    	}
    }
        
    public void Clear(){
        txtFolio.setText("");
        txtFolio2.setText("");
        LimpiarJtbl();  
        txtfch1.setText("");
        txtfch2.setText("");
        txtMov.setText("");
        txtTer.setText("");
        lblError.setText("");
    }
    
    String error;
    public void SelecionaRegistro() throws IOException{
        lblError.setText("");
        int FilaSeleccionada;
        try {
            FilaSeleccionada = JTblCancel.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null,"No se ha seleccionado registro.","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model=(DefaultTableModel)JTblCancel.getModel();
                error =(String)model.getValueAt(FilaSeleccionada,10);
                Categoria();
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Categoria(){
        if(error==null){
            System.out.println("no hay error");
        }else{
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            try {
               Statement statement =(Statement)miConexion.createStatement();
                ResultSet rs1 = statement.executeQuery("select * from TBL_CODERROR where code_error='"+error+"' ");
                if(rs1.next() == true){
                    lblError.setText(rs1.getString("descripcion"));
                }else {
                    System.out.println("no aplica error registrado");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
            }
        }         
    } 
      
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTblCancel;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblError;
    public javax.swing.JLabel lblUserVF;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtFolio2;
    private javax.swing.JTextField txtMov;
    private javax.swing.JTextField txtTer;
    private javax.swing.JTextField txtfch1;
    private javax.swing.JTextField txtfch2;
    // End of variables declaration//GEN-END:variables
}