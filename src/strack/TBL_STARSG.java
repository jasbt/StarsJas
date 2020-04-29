package strack;

import java.io.File;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.ConexionEDI;
import Clases.ExportarStars;
import Clases.FormatoTabla;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
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

public class TBL_STARSG extends javax.swing.JFrame {

    DefaultTableModel model;
    public TBL_STARSG() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCF1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        txtFolio2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTerminal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        txtRem = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtos1 = new javax.swing.JTextField();
        txtos2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        lbl1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableStar = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel14.setText("jLabel14");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel General de Movimientos (STARS)");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cartaporte a Procesar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Cartaporte:");

        txtCF1.setEditable(false);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Folio:");

        txtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ter:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Unidad:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Rem:");

        txtRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha OS:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Proveedor:");

        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton10.setToolTipText("Buscar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbl1.setForeground(new java.awt.Color(204, 0, 0));

        JTableStar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "transaccion", "Cartaporte", "status_orden ", "fecha_orden ", "statustype", "cpo", "Error ", "Categoria", "nom_origen", "cd_origen ", "cd_destino", "unidad ", "rem1", "ter_carta", "folio_carta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableStar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTableStar.getTableHeader().setReorderingAllowed(false);
        JTableStar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableStarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableStar);
        if (JTableStar.getColumnModel().getColumnCount() > 0) {
            JTableStar.getColumnModel().getColumn(0).setResizable(false);
            JTableStar.getColumnModel().getColumn(1).setMinWidth(100);
            JTableStar.getColumnModel().getColumn(1).setPreferredWidth(120);
            JTableStar.getColumnModel().getColumn(1).setMaxWidth(150);
            JTableStar.getColumnModel().getColumn(2).setMinWidth(100);
            JTableStar.getColumnModel().getColumn(2).setPreferredWidth(100);
            JTableStar.getColumnModel().getColumn(2).setMaxWidth(120);
            JTableStar.getColumnModel().getColumn(3).setMinWidth(80);
            JTableStar.getColumnModel().getColumn(3).setPreferredWidth(80);
            JTableStar.getColumnModel().getColumn(3).setMaxWidth(80);
            JTableStar.getColumnModel().getColumn(4).setMinWidth(50);
            JTableStar.getColumnModel().getColumn(4).setPreferredWidth(80);
            JTableStar.getColumnModel().getColumn(4).setMaxWidth(100);
            JTableStar.getColumnModel().getColumn(5).setMinWidth(100);
            JTableStar.getColumnModel().getColumn(5).setPreferredWidth(100);
            JTableStar.getColumnModel().getColumn(5).setMaxWidth(120);
            JTableStar.getColumnModel().getColumn(6).setMinWidth(60);
            JTableStar.getColumnModel().getColumn(6).setPreferredWidth(60);
            JTableStar.getColumnModel().getColumn(6).setMaxWidth(60);
            JTableStar.getColumnModel().getColumn(7).setMinWidth(70);
            JTableStar.getColumnModel().getColumn(7).setPreferredWidth(70);
            JTableStar.getColumnModel().getColumn(7).setMaxWidth(70);
            JTableStar.getColumnModel().getColumn(8).setMinWidth(100);
            JTableStar.getColumnModel().getColumn(8).setPreferredWidth(100);
            JTableStar.getColumnModel().getColumn(8).setMaxWidth(100);
            JTableStar.getColumnModel().getColumn(9).setMinWidth(80);
            JTableStar.getColumnModel().getColumn(9).setPreferredWidth(80);
            JTableStar.getColumnModel().getColumn(9).setMaxWidth(80);
            JTableStar.getColumnModel().getColumn(10).setMinWidth(150);
            JTableStar.getColumnModel().getColumn(10).setPreferredWidth(150);
            JTableStar.getColumnModel().getColumn(10).setMaxWidth(180);
            JTableStar.getColumnModel().getColumn(11).setMinWidth(100);
            JTableStar.getColumnModel().getColumn(11).setPreferredWidth(100);
            JTableStar.getColumnModel().getColumn(11).setMaxWidth(130);
            JTableStar.getColumnModel().getColumn(12).setMinWidth(100);
            JTableStar.getColumnModel().getColumn(12).setPreferredWidth(100);
            JTableStar.getColumnModel().getColumn(12).setMaxWidth(130);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Detalles:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mov.x3", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        jButton2.setToolTipText("Nuevo Mov.x3");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton11.setToolTipText("Editar Mov.x3");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton9.setToolTipText("Cancela Mov.x3");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mov.AP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jButton8.setText("AP");
        jButton8.setToolTipText("Nuevo Mov.AP");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton12.setToolTipText("Editar Mov.AP");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton7.setToolTipText("Cancela Mov.AP");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mov.AF", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        jButton14.setToolTipText("Nuevo Mov.AF");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton15.setToolTipText("Editar Mov.AF");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton16.setToolTipText("Cancela Mov.AF");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mov.AG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        jButton17.setText("AG");
        jButton17.setToolTipText("Nuevo Mov.AG");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mov.x1", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        jButton18.setToolTipText("Nuevo Mov.x1");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton19.setToolTipText("Editar Mov.x1");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton20.setToolTipText("Cancela Mov.x1");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tres.png"))); // NOI18N
        jButton6.setToolTipText("Generera Mov. Automatico");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/negocios.png"))); // NOI18N
        jButton13.setToolTipText("Mov.AF-RD");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(2, 2, 2)
                                .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtos1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtos2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtProveedor))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCF1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)
                                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 155, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addComponent(jButton3)
                            .addComponent(jButton4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(txtRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(txtos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(1, 1, 1))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Transacción 214 (Stars)");

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
                .addContainerGap(1058, Short.MAX_VALUE))
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
        MenuStars ms=new MenuStars();
        ms.txtUserf1.setText(lblUserVF.getText());
        ms.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserx3R();            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JOptionPane.showMessageDialog(null, "Opcion no disponible");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        System.out.println("Metodos.STX3tbl.jButton8ActionPerformed(mensaje) "+ creado);
        if(!txtCF1.getText().equals("")){ 
            validauserRegistroap();
            //movx3();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte");
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JOptionPane.showMessageDialog(null, "Opción no disponible");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (JTableStar.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(JTableStar);
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
        limpiartblx3();
        txtFolio.setText("");
        txtFolio2.setText("");
        txtUnidad.setText("");
        txtRem.setText("");
        txtTerminal.setText("");
        txtos1.setText("");
        txtos2.setText("");
        txtProveedor.setText("");
        lbl1.setText("");
        txtCF1.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MenuStars ms=new MenuStars();
        ms.txtUserf1.setText(lblUserVF.getText());
        ms.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
        limpiartblx3();
        System.out.println("Buscar Folio");
        DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
        JTableStar.setModel(model);
        String query="SELECT * FROM VTBL_STARS_G where folio_carta='"+txtFolio.getText()+"' and status_orden!='CANCELADO' AND statustype is null order by fecha_orden";
        //String query="SELECT * FROM VTBL_STARS_G where folio_carta='"+txtFolio.getText()+"' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }
        FormatoTabla ft = new FormatoTabla(0);
        JTableStar.setDefaultRenderer (Object.class, ft );
    }//GEN-LAST:event_txtFolioActionPerformed

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        proveedor();
    }//GEN-LAST:event_txtProveedorActionPerformed
    
    String cx1;    
    String ap1;
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        limpiartblx3();
        ConsultaX3();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void JTableStarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableStarMouseClicked
        lbl1.setText("");
        try {
            SelecionaRegistro() ;
        } catch (IOException ex) {
            Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableStarMouseClicked

    private void txtRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemActionPerformed
        //REMOLQUE
    }//GEN-LAST:event_txtRemActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserx3E();            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte ");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserEditarap();            
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte");
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       if(!txtCF1.getText().equals("")){ 
           validauserAFR();            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte");
            System.out.println("Campo vacio");
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(!txtCF1.getText().equals("")){   
            validauserAFE();            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte");
            System.out.println("Campo vacio");
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        JOptionPane.showMessageDialog(null, "Opcion no disponible");
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserAG();            
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione un registro");
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if(!txtCF1.getText().equals("")){    
            validauserx1R();            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte");
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
       if(!txtCF1.getText().equals("")){   
           validauserx1E();
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte");
            System.out.println("Campo vacio");
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        JOptionPane.showMessageDialog(null, "Opcion no disponible");
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JOptionPane.showMessageDialog(null, "Opción no disponible");
        /*FechaSit();
        try {
            movx3a();
            movafa();
            movx1a();
        } catch (IOException ex) {
            Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        JOptionPane.showMessageDialog(null, "Opción no disponible");
        /*limpiartblx3();
        afPanel();*/
    }//GEN-LAST:event_jButton13ActionPerformed
     
    public void limpiartblx3(){
        DefaultTableModel model=(DefaultTableModel) JTableStar.getModel();
    	System.out.println("ingresa metodo limpiar tabla");
    	for (int i=0; i<JTableStar.getRowCount(); i++){
    		model.removeRow(i);
    		i-=1;
    	}
    }
    
    public void ConsultaX3(){
        limpiartblx3();
        if( ((txtRem.getText().equals("")) &&   !txtFolio.getText().equals("")) && (txtFolio2.getText().equals(""))  && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && (txtos1.getText().equals("") && txtos2.getText().equals(""))){
            System.out.println("CONSULTA FOLIO");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where folio_carta='"+txtFolio.getText()+"' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }                 
        }else if(txtRem.getText().equals("")  &&   (!txtFolio.getText().equals("")) && (!txtFolio2.getText().equals("")) && (txtTerminal.getText().equals("") && txtUnidad.getText().equals("")) && (txtos1.getText().equals("") && txtos2.getText().equals(""))){
            System.out.println("CONSULTA RANGO DE FOLIOS");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where folio_carta between '"+txtFolio.getText()+"' AND '"+txtFolio2.getText()+"' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }             
        }else if((txtProveedor.getText().equals("") && txtRem.getText().equals("")  && txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtTerminal.getText().equals("") && txtUnidad.getText().equals(""))  && (!(txtos1.getText().equals("") && txtos2.getText().equals("")))) {
            System.out.println("fecha de orden");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }else if((txtRem.getText().equals("")  && txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtTerminal.getText().equals("") && txtUnidad.getText().equals(""))  && (txtos1.getText().equals("") && txtos2.getText().equals("") && (!txtProveedor.getText().equals("")))) {
            System.out.println("PROVEDDOR");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where nom_origen like'%"+txtProveedor.getText()+"%' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }              
        }else if((txtRem.getText().equals("")  && txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtTerminal.getText().equals("") && txtUnidad.getText().equals(""))  && (!(txtos1.getText().equals("") && txtos2.getText().equals("") && txtProveedor.getText().equals("")))) {
            System.out.println("fecha de orden+PROVEDDOR");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where nom_origen='"+txtProveedor.getText()+"' and fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }else if( (! txtTerminal.getText().equals("") )&&( txtos1.getText().equals("") && txtos2.getText().equals("") ) &&  ( txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtUnidad.getText().equals("") &&  txtRem.getText().equals("") ) ){
            System.out.println("CONSULTA terminal");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where ter_carta='"+txtTerminal.getText()+"' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }                
        }else if( !( txtTerminal.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("") ) &&  ( txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtUnidad.getText().equals("") &&  txtRem.getText().equals("") ) ){
            System.out.println("CONSULTA terminal+fechas de os");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where ter_carta='"+txtTerminal.getText()+"' and fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }            
        }else if( txtRem.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("")  && txtTerminal.getText().equals("") && (txtUnidad.getText().equals("")) &&(! txtos1.getText().equals("")) && (!txtos2.getText().equals(""))){
            System.out.println("CONSULTA FECHAS-OS");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where  fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }                       
        }else if( txtRem.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("")  && txtTerminal.getText().equals("") && (!txtUnidad.getText().equals("")) &&( txtos1.getText().equals("")) && (txtos2.getText().equals(""))){
            System.out.println("UNIDAD");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where unidad='"+txtUnidad.getText()+"' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }                        
        }else if( txtRem.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("")  && txtTerminal.getText().equals("") && (!txtUnidad.getText().equals("")) &&(! txtos1.getText().equals("")) && (!txtos2.getText().equals(""))){
            System.out.println("CONSULTA FECHAS-OS+UNIDAD");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where unidad='"+txtUnidad.getText()+"' and fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }                      
        }else if( (txtRem.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("")) && (! (txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("") ) ) ){
            System.out.println("consulta TERMINAL-unidad-fechas de orden");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where ter_carta='"+txtTerminal.getText()+"' AND unidad='"+txtUnidad.getText()+"' and fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }        
        }else if( (!txtRem.getText().equals("")) && txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") &&( txtos1.getText().equals("")) && (txtos2.getText().equals(""))){
            System.out.println("REMOLQUE");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where rem1='"+txtRem.getText()+"' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }              
        }else if( (!txtRem.getText().equals("")) && txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") &&(! txtos1.getText().equals("")) && (!txtos2.getText().equals(""))){
            System.out.println("FECHAS-OS+REMOLQUE");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where rem1='"+txtRem.getText()+"' and fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }           
        }else if( ( txtUnidad.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("") ) && (! (txtTerminal.getText().equals("") && txtRem.getText().equals("")  && txtos1.getText().equals("") && txtos2.getText().equals(""))) ){
            System.out.println("consulta terminal-remolque-fechas os");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where ter_carta='"+txtTerminal.getText()+"' AND rem1='"+txtRem.getText()+"' and fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }      
        }else if( ( txtFolio.getText().equals("") && txtFolio2.getText().equals("")  ) && (! (txtUnidad.getText().equals("") && txtTerminal.getText().equals("") && txtRem.getText().equals("")  && txtos1.getText().equals("") && txtos2.getText().equals(""))) ){
            System.out.println("CONSULTA terminal-unidad-remolque-fecha os");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where ter_carta='"+txtTerminal.getText()+"' AND unidad='"+txtUnidad.getText()+"' AND rem1='"+txtRem.getText()+"' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }                  
        }else if( txtRem.getText().equals("") && (txtFolio.getText().equals("") && txtFolio2.getText().equals(""))  && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && (txtos1.getText().equals("") && txtos2.getText().equals(""))){
            System.out.println("consulta GENERAL");
            DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="SELECT * FROM VTBL_STARS_G where status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        FormatoTabla ft = new FormatoTabla(0);
        JTableStar.setDefaultRenderer (Object.class, ft );
    }
    
    public void proveedor(){
        limpiartblx3();
        DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
        JTableStar.setModel(model);
        String query="SELECT * FROM VTBL_STARS_G where nom_origen like '%"+txtProveedor.getText()+"%' and status_orden!='CANCELADO' AND categoria is null or categoria ='IR' order by fecha_orden";
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("transaccion");
                    data[1]=resp.getString("referencia");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("statustype");
                    data[5]=resp.getString("cpo");
                    data[6]=resp.getString("ERROR");//
                    data[7]=resp.getString("CATEGORIA");//
                    data[8]=resp.getString("nom_origen");
                    data[9]=resp.getString("cd_origen");
                    data[10]=resp.getString("cd_destino");
                    data[11]=resp.getString("unidad");
                    data[12]=resp.getString("rem1");
                    data[13]=resp.getString("ter_carta");
                    data[14]=resp.getString("folio_carta");
                    //data[15]=resp.getString("folio_carta");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }
        FormatoTabla ft = new FormatoTabla(0);
        JTableStar.setDefaultRenderer (Object.class, ft );
    }
    
    //cancelar AP   
    public void validaCancelar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' AND MOV='MOV.AP'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.AP ya se ha cancelado"); 
                }else {
                    apAcuse1();
                    //validaCancelar();                   
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }
    
    public void apAcuse1(){
        System.out.println("transaccion AP(50)-CANCELAR");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and AP50 ='AP-APLICADO' and categoriaap IS NULL");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.AP no presenta una categoria");
                }else { 
                    apAcuseia();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        } 
    }
    
    public void apAcuseia(){
        System.out.println("transaccion AP(50)-CANCELAR");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and AP50 ='AP-APLICADO' and categoriaap='IA'");  
                if(rs1.next() == true){
                                    
                }else { 
                    apAcuseie();            
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        } 
    }
    
    public void apAcuseie(){
        System.out.println("transaccion AP(50)-CANCELAR");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and AP50 ='AP-APLICADO' and categoriaap='IE'");  
                if(rs1.next() == true){
                    
                }else { 
                    JOptionPane.showMessageDialog(null, "El mov.AP no presenta una categoria");            
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        } 
    }
    
    public void validauserRegistroap(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  staps='1' and Estado='activo'");
                if(rs1.next() == true){
                    movx3();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void movx3(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and Archivox3 ='CREADO'");  
                if(rs1.next() == true){
                    x3Creado();
                    System.out.println("Metodos.tbl_Reg_x3.movx3(1)");
                }else {
                    int i =JOptionPane.showConfirmDialog(this, "Confirma solo una cancelacion de ventana para la carta porte: "+"\n"+" '"+txtCF1.getText()+"' son correctos ? ",
                    "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(i == 0){
                            
                    }else if(i == 1){
                        JOptionPane.showMessageDialog(null, "Revise nuevamente los datos");
                    }
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        } 
    }            
            
    public void x3Creado(){
        System.out.println("transaccion AP(50)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and Archivox3 ='CREADO' and categoria IS NULL");  
                if(rs1.next() == true){
                    System.out.println("Metodos.tbl_Reg_x3.movx3(2)");
                    JOptionPane.showMessageDialog(null, "El mov.x3 no presenta una categoria");
                }else {
                    x3CreadoIR();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        } 
    }
    
    public void x3CreadoIR(){
        System.out.println("transaccion AP(50)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and Archivox3 ='CREADO' and categoria ='IR'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 presenta una categoria IR");
                    System.out.println("Metodos.tbl_Reg_x3.movx3(3)");
                }else {
                    x3CreadoIE();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        } 
    }
    
    public void x3CreadoIE(){
        System.out.println("transaccion AP(50)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and Archivox3 ='CREADO' and categoria ='IE'");  
                if(rs1.next() == true){
                    System.out.println("Metodos.tbl_Reg_x3.movx3(4)--puede aplicar");
                    valAap();                    
                }else {
                    x3CreadoIA();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        } 
    }
    
    public void x3CreadoIA(){
        System.out.println("transaccion AP(50)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and Archivox3 ='CREADO' and categoria ='IA'");  
                if(rs1.next() == true){
                    valAap(); 
                    System.out.println("Metodos.tbl_Reg_x3.movx3(5)--aplicar ap");
                }else {
                    System.out.println("Metodos.tbl_Reg_x3.movx3(5)");
                    JOptionPane.showMessageDialog(null, "El mov.x3 no presenta una categoria");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        } 
    }
    
    public void valAap(){
        System.out.println("transaccion AP(50)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where  cartaportex3='"+txtCF1.getText()+"' and Archivox3 ='CREADO' and AP50 ='AP-APLICADO'");  
                if(rs1.next() == true){
                    System.out.println("Metodos.tbl_Reg_x3.movx3(6)");
                   JOptionPane.showMessageDialog(null, "El mov.AP ya se ha Aplicado");                  
                }else {                   
                   valAF();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        }         
    }
      
    public void valAF(){
        System.out.println("transaccion AP(50)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"' and ArchivoAF ='CREADO' ");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov. presenta un AF activo");                 
                }else {
                    
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x3() Transacción AP(50) (214)"+ex.getMessage());
        }     
    }
    
    
    //VALIDAR MOV. X3   
    public void Cancela(){
        System.out.println("transaccion a cancelar-qx1cancel*1");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where cartaportex3='"+txtCF1.getText()+"' and Archivox3='CREADO'");  
                if(rs1.next() == true){
                    System.out.println("Revisar ya cuenta con un registro de cancelacion");
                    verrorx3();
                    //QCancela();
                }else {
                    JOptionPane.showMessageDialog(null, "El mov.x3 no se ha registrado");                                      
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }
    
    public void verrorx3(){
        System.out.println("transaccion a cancelar-qx1cancel*1");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where cartaportex3='"+txtCF1.getText()+"' and CATEGORIA='IR'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 no se puede cancelar");                     
                }else {
                    System.out.println("Revisar ya cuenta con un registro de cancelacion");
                    verrorx3A();                                     
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }
        
    public void verrorx3A(){
        System.out.println("transaccion a cancelar-qx1cancel*1");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where cartaportex3='"+txtCF1.getText()+"' and CATEGORIA IS NULL");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 no se puede cancelar");                     
                }else {
                    CancelaAF();
                    System.out.println("Revisar ya cuenta con un registro de cancelacion");
                    //QCancela();                                     
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }
    
    public void VQCancela(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.x3'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 ya se ha cancelado."); 
                }else {
                    CancelaAF();
                    System.out.println("puede cancelar mov.x3 -QCancela(1)");                  
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }    
    
    public void CancelaAF(){
        System.out.println("transaccion a cancelar-qx1cancel*2");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"'  and ArchivoAF ='CREADO'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 presenta un mov.AF activo."); 
                }else {
                    System.out.println("Revisar si x3 presenta un AP");
                    CancelaAP();                  
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }
    
    public void CancelaAP(){
        System.out.println("transaccion a cancelar-qx1cancel**3");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_x3_1 where cartaportex3='"+txtCF1.getText()+"' AND AP50='AP-APLICADO'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 presenta un mov.AP activo."); 
                }else { 
                    acusex3();                    
                    System.out.println("El mov se puede cancelar.");  
                    //QCancela();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }
    
    public void acusex3(){
        System.out.println("transaccion a cancelar-qx1cancel---4");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_x3_1 where cartaportex3='"+txtCF1.getText()+"' AND AP50='AP-APLICADO'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 presenta un mov.AP activo."); 
                }else { 
                    
                    System.out.println("El mov se puede cancelar.");  
                    //QCancela();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }
        
    public void QCancela(){
        System.out.println("Metodos.tbl_Reg_x3.QCancela()"+ txtCF1.getText());
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.x3'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 ya se ha cancelado."); 
                }else {
                    VQCancela();
                    System.out.println("puede cancelar mov.x3 -QCancela()");                  
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error RevX1 Transacción Llegada a destino (214)"+ex.getMessage());
        }  
    }
       
    public void validauserx3R(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsr='1' and Estado='activo'");
                if(rs1.next() == true){
                    Validarstatus();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    } 
    
    public void Validarstatus(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"'and status_orden='CANCELADO'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "La cartaporte se encuentra cancelada");
                }else {
                    System.out.println("Cartaporte activa");
                    ValidarNoCreado();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void ValidarNoCreado(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"'and Archivox3='CREADO'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 ya se ha registrado");
                }else {
                    Stmx3 x3=new Stmx3();
                    x3.txtUserf1.setText(lblUserVF.getText());
                    x3.txtCartax3.setText(txtCF1.getText());
                    x3.setVisible(true);
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void Qx3ir(){
        System.out.println("transaccion a cancelar");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement(); 
            ResultSet rs1 = statement.executeQuery("SELECT * FROM TBL_REG_X3_1 WHERE CartaporteX3='"+txtCF1.getText()+"' and Archivox3='Creado' and Categoria='IR' and Error !='710' ");  
                if(rs1.next() == true){
                    Smtx3Editar x3=new Smtx3Editar();
                    x3.txtUserf1.setText(lblUserVF.getText());
                    x3.txtCartax3.setText(txtCF1.getText());
                    x3.setVisible(true);
                }else {
                   JOptionPane.showMessageDialog(null,"El mov.x3 no se puede editar");
                }
        } catch (SQLException ex) {
            System.out.println("Error RevAF() Transacción Salida de Cargar (214)"+ex.getMessage());
        }         
    }
    
    String creado,error,ap2;
    public void SelecionaRegistro() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = JTableStar.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
            }else{
                DefaultTableModel model=(DefaultTableModel)JTableStar.getModel();
                String id =(String)model.getValueAt(FilaSeleccionada,1);
                System.out.println("Cartaporte "+id);
                txtCF1.setText(id);
                creado=(String)model.getValueAt(FilaSeleccionada,4);
                error=(String)model.getValueAt(FilaSeleccionada,6);
                ap2=(String)model.getValueAt(FilaSeleccionada,8);
                Categoria();
                System.out.println(creado);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
        /*lblError.setText("");
        lblCategoriaAP.setText("");*/
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
                        lbl1.setText(rs1.getString("descripcion"));
                    }else {
                        System.out.println("no aplica error registrado");
                    }
            } catch (SQLException ex) {
                System.out.println("Error SQL Registro "+ex.getMessage());
            } 
        }
    }
    
    public void movAP(){
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"' and AP50='AP-APLICADO'");
                if(rs1.next() == true){
                    apAcuse1();
                    //validaCancelar(); permite cancelar 1 sola vez
                }else {
                   JOptionPane.showMessageDialog(null, "El mov.AP no esta aplicado");
                }                                
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void validauserEditarap(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starse='1' and Estado='activo'");
                if(rs1.next() == true){
                    movAPCreado();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void movAPCreado(){
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"' and AP50='AP-APLICADO'");
                if(rs1.next() == true){
                    movAPC();
                }else {
                   JOptionPane.showMessageDialog(null, "El mov.AP no esta aplicado");
                }                                
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void movAPC(){
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where Cartaportex3='"+txtCF1.getText()+"' and AP50='AP-APLICADO' and CategoriaAP='IR' AND ErrorAP !='710'");
                if(rs1.next() == true){
                    
                }else {
                   JOptionPane.showMessageDialog(null, "El mov.AP no se puede editar");
                }                                
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void validauserx3E(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starse='1' and Estado='activo'");
                if(rs1.next() == true){
                   ValidarEditar();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    } 
            
    public void ValidarEditar(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"' and Archivox3='CREADO'");
                if(rs1.next() == true){
                    Qx3ir();
                }else {
                    JOptionPane.showMessageDialog(null, "El mov.x3 no se ha registrado");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void Procesar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where  Archivox3='procesar' and VALOR_CLI_RUBRO1 !='ssr'");
                while(rs1.next()){
                    JOptionPane.showMessageDialog(null, "Procesar cartaporte "+rs1.getString("cartaportex3"));
                }//fin de while
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
    
    //movimiento AF
    public void validauserAFR(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsr='1' and Estado='activo'");
                if(rs1.next() == true){
                    AFnuevo();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    } 
    
    public void AFnuevo(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+txtCF1.getText()+"'and ARCHIVOAF ='creado'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.AF ya se ha registrado");
                }else{ 
                    x3Correcto();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void x3Correcto(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"'and CATEGORIA ='IR'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 presenta una categoria IR");
                }else{ 
                    x3CAN();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void x3CAN(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"'and Archivox3 ='CANCELADO'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.x3 se encuntra cancelado");
                }else{ 
                    ValidarIA();
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void ValidarIA(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_x3_1 where Cartaportex3='"+txtCF1.getText()+"'and Archivox3='CREADO' AND CATEGORIA ='IA'");
                if(rs1.next() == true){
                    ValidarNoCreadoX3();
                }else{ 
                    ValidarIE();
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void ValidarIE(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_x3_1 where Cartaportex3='"+txtCF1.getText()+"'and Archivox3='CREADO' AND CATEGORIA ='IE'");
                if(rs1.next() == true){
                    ValidarNoCreadoX3();
                }else{ 
                    JOptionPane.showMessageDialog(null, "El mov.x3 no presenta una categoria ");                 
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void ValidarNoCreadoX3(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+txtCF1.getText()+"'and ArchivoAF='CREADO'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null,"Movimiento ya creado");
                }else{ 
                    System.out.println("Campo lleno");
                    StmAF x3=new StmAF();
                    x3.txtUserf1.setText(lblUserVF.getText());
                    x3.txtCartax3.setText(txtCF1.getText());
                    x3.setVisible(true);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void validauserAFE(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starse='1' and Estado='activo'");
                if(rs1.next() == true){
                   AFEditar();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void AFEditar(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+txtCF1.getText()+"'and ARCHIVOAF ='creado'");
                if(rs1.next() == true){
                    ValidarError();
                }else{ 
                    JOptionPane.showMessageDialog(null, "El mov.AF no se ha registrado");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void ValidarError(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+txtCF1.getText()+"' and Archivoaf='Creado' and Categoriaaf='IR' and Erroraf !='710' ");
                if(rs1.next() == true){
                    SmtAFEditar x3=new SmtAFEditar();
                    x3.txtUserf1.setText(lblUserVF.getText());
                    x3.txtCartax3.setText(txtCF1.getText());
                    x3.setVisible(true);                   
                }else{ 
                    JOptionPane.showMessageDialog(null, "El mov.AF no se puede editar");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    // MOVIMIENTO X1
    public void validauserx1R(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsr='1' and Estado='activo'");
                if(rs1.next() == true){
                    AFCreado();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    } 
    
    public void AFCreado(){
        System.out.println("transaccion AF(creado)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"' and ARCHIVOAF='CREADO'");  
                if(rs1.next() == true){
                    AFCorrecto();                                     
                }else {
                    JOptionPane.showMessageDialog(null, "El mov.AF no se ha registrado "+ txtCF1.getText());               
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void AFCorrecto(){
        System.out.println("AF-CON IR");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"' and CATEGORIAAF='IR'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "La mov.AF presenta un error de categoria IR "+ txtCF1.getText());                 
                }else {
                    ValidaCategoriaIA();                 
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void ValidaCategoriaIA(){
        System.out.println("AF-con IA");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"' and CATEGORIAAF='IA' and archivoaf='CREADO'");  
                if(rs1.next() == true){ 
                    ValidarNoCreadofx1(); 
                }else {
                    ValidaCategoriaIE();                 
                }
        } catch (SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void ValidaCategoriaIE(){
        System.out.println("af- con IE");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"' and CATEGORIAAF='IE'");  
                if(rs1.next() == true){  
                    ValidarNoCreadofx1(); 
                }else {
                    JOptionPane.showMessageDialog(null, "La mov.AF no presenta una categoria-ie");                 
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void ValidarNoCreadofx1(){
        System.out.println("NO CREADO-X1");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where CartaporteX1='"+txtCF1.getText()+"'and Archivox1='CREADO'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El moviminento ya registrado");
                    System.out.println("Mov. x1 ya registrado---");
                }else{ 
                    Stmx1 x1=new Stmx1();
                    x1.txtUserf1.setText(lblUserVF.getText());
                    x1.txtCartax3.setText(txtCF1.getText());
                    x1.setVisible(true);  
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void validauserx1E(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starse='1' and Estado='activo'");
                if(rs1.next() == true){
                  x1CreadoE(); 
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void x1CreadoE(){
        System.out.println("transaccion AF(creado)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where cartaporteX1='"+txtCF1.getText()+"' and ARCHIVOX1='CREADO' ");  
                if(rs1.next() == true){
                    x1CreadoIR();
                }else {
                    JOptionPane.showMessageDialog(null, "El mov.x1 no se ha registrado "+ txtCF1.getText());               
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void x1CreadoIR(){
        System.out.println("transaccion AF(creado)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where cartaporteX1='"+txtCF1.getText()+"' and CATEGORIAX1='IR' AND ERRORX1 !='710'");  
                if(rs1.next() == true){                    
                    Smtx1Editar x1=new Smtx1Editar();
                    x1.txtUserf1.setText(lblUserVF.getText());
                    x1.txtCartax3.setText(txtCF1.getText());
                    x1.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "El mov.x1 no se puede editar "+ txtCF1.getText());               
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void validauserAG(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  staG='1' and Estado='activo'");
                if(rs1.next() == true){
                    validaAFg();
                }else {
                    JOptionPane.showMessageDialog(null, "Opcion no disponible al usuario");
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    }
    
    public void validaAFg(){
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+txtCF1.getText()+"'and ARCHIVOAF ='creado'");
                if(rs1.next() == true){
                    AFCorrectod(); 
                }else{ 
                    JOptionPane.showMessageDialog(null, "El mov.AF no se ha registrado"); 
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error SQL Registro "+ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }  
    }
    
    public void AFCorrectod(){
        System.out.println("transaccion x1(creado)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"' and CATEGORIAAF ='IR'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El mov.AF presenta una categoria IR ");                 
                }else {
                    AFIA();                 
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void AFIA(){
        System.out.println("transaccion x1(creado)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"' and CATEGORIAAF='IA'");  
                if(rs1.next() == true){ 
                    x1Creado(); 
                }else {
                    AFIE();               
                }
        } catch (SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void AFIE(){
        System.out.println("transaccion x1(creado)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where cartaporteAF='"+txtCF1.getText()+"' and CATEGORIAAF='IE'");  
                if(rs1.next() == true){ 
                    x1Creado(); 
                }else {
                    JOptionPane.showMessageDialog(null, "La transacción no se puede crear, sin tener un acuse IA o IE en AF, ");                 
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    
    public void x1Creado(){
        System.out.println("transaccion x1(creado)");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where cartaportex1='"+txtCF1.getText()+"' and Archivox1 ='CREADO'");  
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El registro de transacciones ya se ha completado ");                   
                }else {
                    StmAG x3=new StmAG();
                    x3.txtUserf1.setText(lblUserVF.getText());
                    x3.txtCartax3.setText(txtCF1.getText());
                    x3.setVisible(true);                     
                }
        } catch (HeadlessException | SQLException ex) {
            System.out.println("Error Rev-x1() consulta-para actualizacion "+ex.getMessage());
        } 
    }
    //fecha para registro automatico de mov.
    String txtFch1,txtFch2,fchc210,fchag;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        txtFch1=(datefecha.format(date));
        fchc210=datefecha.format(date);
        Date hora = new Date();
    	DateFormat datehora = new SimpleDateFormat("HH:mm:ss");
        txtFch2= (datehora.format(hora));  
        System.out.println("hora sistema "+txtFch1+" "+txtFch2+".....");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");   
        fchag=datefecha1.format(date); 
    }
    
    String cartax3,arribox3,eventox3;
    public void movx3a() throws IOException {
        System.out.println("Revisar el mov. x3 en trackitweb para procesar");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select * from tb_edi where transaction_type='"+"x3"+"' and arrival_date between convert(datetime,'"+txtos1.getText()+" "+"00:00:00"+"') and convert(datetime,'"+txtos2.getText()+" "+"23:59:59"+"')");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                cartax3=rs.getString("reference_number").trim();
                arribox3=rs.getString("arrival_date").trim();
                eventox3=rs.getString("reason_code");  
                if (eventox3 == null){
                    System.out.println("no hay codigo de rason para x3 "+cartax3);
                }else{
                    System.out.println("puede procesar x3 para "+cartax3+" Nota: Revisar mov no creado");   
                    Movx3ST();
                }                
            }    
        } catch (SQLException ex) {
            System.out.println("Metodo de movx3a() "+ex.getMessage());
        }
    }
    
    String unidad,rem1,terminal_carta,folio_carta,VALOR_CLI_RUBRO1,cpox3,status_orden,idx3; 
    public void Movx3ST() throws IOException {
        System.out.println("Revisar el mov. x3 en STRACK-EDI para procesar");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("SELECT * FROM TBL_REG_X3_1 WHERE cartaportex3='"+cartax3+"' AND Archivox3 IS NULL");
            ResultSet rs=stmt.executeQuery();
            if(rs.next() == true){
                System.out.println("REGISTRAR MOV.X3 "+cartax3);
                Movx3ST1();                 
            }else { 
                System.out.println("EL MOV.X3 YA SE HA REGISTRADO "+cartax3);                 
            }   
        } catch (SQLException ex) {
            System.out.println("Metodo de Movx3ST "+ex.getMessage());
        }
    }
    
    public void Movx3ST1() throws IOException {
        System.out.println("Revisar el mov. x3 en STRACK-EDI para procesar");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("SELECT * FROM TBL_REG_X3_1 WHERE cartaportex3='"+cartax3+"' ");
            ResultSet rs=stmt.executeQuery();
            if(rs.next() == true){
                    unidad=rs.getString("unidad");  
                    rem1=rs.getString("rem1").trim();  
                    terminal_carta=rs.getString("ter_carta").trim(); 
                    folio_carta=rs.getString("folio_carta").trim();
                    VALOR_CLI_RUBRO1=rs.getString("VALOR_CLI_RUBRO1").trim();
                    cpox3=VALOR_CLI_RUBRO1.replaceAll("CPO","").trim();
                    status_orden=rs.getString("status_orden").trim();                    
                    idx3=rs.getString("id_x3").trim(); 
                    System.out.println("Puede registrar mov.x3-is null "+cartax3+"..."+unidad+"-"+rem1+"-"+terminal_carta+"-"+folio_carta+"-"+VALOR_CLI_RUBRO1+"-"+cpox3+""+status_orden+"-"+idx3 );
                Convenio();  
                }else { 
                    System.out.println("Revisa movx3.creado---"+cartax3+"JBT.X3");  
                }   
        } catch (SQLException ex) {
            System.out.println("Metodo de Movx3ST1 "+ex.getMessage());
        }
    }
     
    String orcpo,descp,cargcpo,pesocpo,ccpo,equipo,cd_origen,nom_origen,cd_destino,nom_destino,recorrido;
    public void Convenio() throws IOException{
        System.out.println("Consulta convenio");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_CPO where CPO ='"+cpox3.trim()+"' and estado ='ACTIVO'");
                if(rs1.next() == true){
                    System.out.println("Convenio Llegada a cargar (214) Starsx3()" + VALOR_CLI_RUBRO1 +" cpo "+cpox3+"\r\n"+"\r\n");
                    orcpo=rs1.getString("cod_origen").trim();
                    descp=rs1.getString("cod_destino").trim(); 
                    cargcpo=rs1.getString("tipocarga").trim();
                    pesocpo=rs1.getString("peso").trim();
                    equipo=rs1.getString("Modo").trim();
                    nom_origen=rs1.getString("nom_origen").trim();
                    cd_origen=rs1.getString("cd_origen").trim();
                    nom_destino=rs1.getString("nom_destino").trim();
                    cd_destino=rs1.getString("cd_destino").trim();
                    recorrido=rs1.getString("hrstransito").trim();
                    System.out.println("modo de transporte "+equipo+" horas de transito " + recorrido);
                    String code1="MATERIAL";
                        String code2=cargcpo;
                        boolean resultado=code2.contains(code1);
                        if(resultado){
                            ccpo="2"; 
                        }else{
                            ccpo="1";
                        } 
                    VRegistroAuto();
                }else {
                    System.out.println("Convenio Llegada a cargar (214) (214) Starsx3() NA");
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro TBL_REG_CPO "+ex.getMessage());
        } 
    } 
    
    public void VRegistroAuto() throws IOException{
        System.out.println("VRegistroAuto Llegada a cargar (214) Starsx3()");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where cartaportex3='"+cartax3+"' AND  Archivox3 is null");
                if(rs1.next() == true){
                    System.out.println("VRegistroAuto (false) Llegada a cargar (214) Starsx3() "+ cartax3);
                    RegistroX3();                     
                }else {
                    System.out.println("archivo ya creado !!!CREADO!!!! "+ cartax3);
                }
        } catch (SQLException ex) {
            System.out.println("VRegistroAuto Llegada a cargar (214) Starsx3() "+ex.getMessage());
        } 
    }
    
    public void RegistroX3() throws SQLException, IOException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strfchx3 = txtFch1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strfchx3 );
            } catch (ParseException ex) {
            }
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set FechaX3=?,zhx3='"+"Hora central"+"',hstransito ='"+recorrido+"',usuario='"+"ADMON"+"',cd_Origen='"+cd_origen+"',cd_Destino='"+cd_destino+"',Remitente='"+nom_origen
                        +"',Destinatario='"+nom_destino+"',fecha='"+txtFch1+"',equipo='"+equipo
                        +"',Creado='"+"AUTOMATICO"+"',remolquex3='"+rem1+"',unidadx3='"+unidad+"',VALOR_CLI_RUBRO1='"+VALOR_CLI_RUBRO1+"',origen_nom='"+orcpo+"',destinatario_nom='"+descp+"',fchx3='"+arribox3.substring(0,11).trim()+"',"
                        + "Hrx3='"+arribox3.substring(11,16).trim()+"',Carga='"+cargcpo.toUpperCase()+"',Peso='"+pesocpo+"',ReasonCodex3='"+eventox3.trim().toUpperCase()+"',Archivox3='CREADO' where cartaportex3='"+cartax3+"' ");            
                    stp.setDate(1, new java.sql.Date(fechaj.getTime()));
                    stp.executeUpdate();
                    System.out.println("RegistroX3() Llegada a cargar (214) Starsx3(update) "+ cartax3 +" Actualización exitosa !!");                    
                    Transaccionx3();
                    ValiPrevioAF();
                } catch (SQLException ex) {
                    System.out.println("Error RegistroX3() Llegada a cargar (214) Starsx3(update)  "+ex.getMessage());
                }
        }     
    }
    
    public void Transaccionx3() throws IOException{
        System.out.println("Transaccionx3() Crear archivo X3 "+cartax3);
        String ruta="C:\\214/214 "+cartax3+" x3.txt";
        File archivo=new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()){
            System.out.println("El archivo ya existe X3 "+cartax3);
        }else{
            bw=new BufferedWriter(new FileWriter(archivo));
            bw.write("CAB,04400                         ,54930                         ,X,004010,214,P"+"\r\n"+
            "HDR,04400,ZZ,54930,ZZ,"+terminal_carta.trim()+"0"+folio_carta.trim()+",XSUP,"+VALOR_CLI_RUBRO1.replaceAll("CPO", "").trim()+","+unidad.trim()+","+terminal_carta.trim()+"0"+folio_carta.trim()+",,,,,XSUP,B,"+equipo+",,"+"\r\n"+
            "ADR,SF,,"+orcpo+",,,\r\n"+
            "ADR,ST,,"+descp+",,,\r\n"+ 
            "LX,1,X3,"+eventox3.toUpperCase().trim()+","+arribox3.substring(0,11).replaceAll("-","").trim()+","+arribox3.substring(11,16).replaceAll(":","").trim()+","+"CT"+",,,,,,,,,,"+"0000000"+","+"0000000"+",XSUP,"+rem1.trim()+","+ccpo.trim()+","+pesocpo.trim()+",L,");
            bw.close();
            System.out.println(" Archivo creado cartaporte.."+cartax3+"214 (x3) TRAKI");
        }
    }
    
     public void ValiPrevioAF(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+cartax3+"'");
                if(rs1.next() == true){
                    System.out.println("el registro previo af ya existe");
                }else {
                  PrevioAF();  
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro AF"+ex.getMessage());
            //JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        } 
    } 
    
    public void PrevioAF() throws SQLException{
        System.out.println("Pre-registro de AF");
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                Statement st=(Statement)miConexion.createStatement();
                st.execute("insert into TBL_REG_AF_1(CartaporteAF,id_x3) values('"+cartax3+"','"+idx3+"')");
                System.out.println("Pre-registro de AF ");
            } catch (SQLException ex) {
                System.out.println("Error PrevioAF() "+ex.getMessage());
            }
        }    
    }
    
    String cartaAF,llegada,salida,entrega,eventoAF,bol;
    public void movafa() throws IOException{
        System.out.println("consultar tb_edi-AF ");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select * from tb_edi where  transaction_type='"+"af"+"'  and arrival_date between convert(datetime,'"+txtos1.getText()+" "+"00:00:00"+"') and convert(datetime,'"+txtos2.getText()+" "+"23:58:00"+"')");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                cartaAF=rs.getString("reference_number").trim();
                llegada=rs.getString("arrival_date");
                salida=rs.getString("departure_date").trim();
                entrega=rs.getString("eta_date").trim();
                eventoAF=rs.getString("reason_code").trim();                    
                if ("FACTXX".equals(bol)||eventoAF == null){
                    System.out.println("factura generica "+cartaAF);
                }else{
                    System.out.println("Revisar bol en recepcion de documentos "+cartaAF+"-"+eventoAF);
                    repdoctos();                    
                }                    
            }    
        } catch (SQLException ex) {
            System.out.println("movafa() "+ex.getMessage());
        }         
    }
    
    public void repdoctos() throws IOException{
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select * from TBL_REG_X3_1 where cartaportex3='"+cartaAF+"' and  aplicacion='registrado' and AP50 is null");
            ResultSet rs=stmt.executeQuery();
            if(rs.next() == true){
                System.out.println("existe en recepcion de doctos" + cartaAF);
                bol=rs.getString("EvidenciaRD").trim();  
                RevAF();
            }else {
                System.out.println("el mov. af no tiene bol en recepcion de doctos "); 
            } 
        } catch (SQLException ex) {
            System.out.println("repdoctos() "+ex.getMessage());
        }  
    }
    
    String terAF,folioAF,cpoAF,fcargaAF,fentregaAF,origenAF,destAF,cargaAF,pesoAF,eqAF,uniAF,remAF,cargaAF1,stAF,stfchx3,sthrx3, fce,he,fce1,desc,id_x3;    
    public void RevAF() throws IOException{
        System.out.println("cartaporte en tbl_reg_af_1");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+cartaAF+"' AND Archivox3='CREADO'");  
            if(rs1.next() == true){
                System.out.println("Existe registro de x3 CREADO de la CARTAPORTE "+ cartaAF+"\n\t");                    
                terAF=rs1.getString("ter_carta");
                folioAF=rs1.getString("folio_carta");
                cpoAF=rs1.getString("VALOR_CLI_RUBRO1");
                origenAF=rs1.getString("origen_nom");
                destAF=rs1.getString("destinatario_nom");
                cargaAF=rs1.getString("carga");
                pesoAF=rs1.getString("peso");
                eqAF=rs1.getString("Equipo");
                uniAF=rs1.getString("Unidadx3");
                remAF=rs1.getString("Remolquex3");
                stAF=rs1.getString("status_orden"); 
                sthrx3=rs1.getString("hstransito"); 
                id_x3=rs1.getString("id_x3");
                String code1="MAT";
                String code2=cargaAF;
                boolean resultado=code2.contains(code1);
                if(resultado){
                    cargaAF1="2";
                }else{
                    cargaAF1="1";
                }
                    Bol();
            }else {
                    System.out.println("ARCHIVO NO CREADO EN X3");
            }
        } catch (NumberFormatException | SQLException ex) {
            System.out.println("Error RevAF(1) Transacción Salida de Cargar (214) "+ex.getMessage());
        } 
    }
    
    public void Bol() throws IOException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where bol='"+bol+"'");
                if(rs1.next() == true){
                    System.out.println("El bol "+ rs1.getString("bol")+" ingresado ya se ha registrado ");
                }else {
                    cateforiax3();
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro BOL "+ex.getMessage());
        } 
    }
    
    public void cateforiax3() throws IOException{
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+cartaAF+"'and CATEGORIA ='IR'");
                if(rs1.next() == true){
                    System.out.println( "La Transacción x3 presenta un error de Categoria IR-cateforiax3()");
                }else{ 
                    categoriax3ia();
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro cateforiax3()"+ex.getMessage());
        } 
    }
    
    public void categoriax3ia() throws IOException{
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_x3_1 where Cartaportex3='"+cartaAF+"'and Archivox3='CREADO' AND CATEGORIA ='IA'");
                if(rs1.next() == true){
                    ValidaAFC();
                }else{ 
                    categoriaxie();
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro cateforiax31() "+ex.getMessage());
        } 
    }
    
    public void categoriaxie() throws IOException{
        System.out.println("NO CREADO");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_x3_1 where Cartaportex3='"+cartaAF+"'and Archivox3='CREADO' AND CATEGORIA ='IE'");
                if(rs1.next() == true){
                    ValidaAFC();
                }else{ 
                    System.out.println("La Transacción no se puede crear, sin tener un acuse IA o IE en x3, "+cartaAF+ " cateforiax32()");    
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro  cateforiax32()"+ex.getMessage());
        } 
    } 
    
    public void ValidaAFC() throws IOException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+cartaAF+"' and ArchivoAF ='CREADO'");  
                if(rs1.next() == true){
                    System.out.println("EL ARCHIVO AF YA FUE CREADO");  
                }else {
                    System.out.println("Registro de TRANSACCIÓN AF-NUEVA");
                    RegistroAF(); 
                }
        } catch (SQLException ex) {
            System.out.println("Error RevAF(2) Transacción Salida de Cargar (214)"+ex.getMessage());
        } 
    }
    
    public void RegistroAF() throws SQLException, IOException{
        System.out.println("RegistroAF() Transacción Salida de Cargar (214)");
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFchaf = txtFch1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFchaf);
            } catch (ParseException ex) {
            }
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set FechaAF=?,usuario='ADMON',Fecha='"+txtFch1+"',ter_cartaAF='"+terAF+"',fchAF='"+salida.substring(0,10)
                    +"',hrAF='"+salida.substring(11,16)+"', hrsDescg='"+entrega.substring(11,16)+"', fchDescg='"+entrega.substring(0,10)+"', hrProg='"+llegada.substring(11,16)+"', fchProg='"+llegada.substring(0,10)+"',statusorden='"+stAF+"', remolqueAF='"+remAF
                    +"', unidadAF='"+uniAF+"', destinoAF='"+destAF+"', origenAF='"+origenAF+"', ReasonCodeAF='"+eventoAF.trim().toUpperCase()+"', FolioAF='"+folioAF+"', bol='"+bol.toUpperCase()+"',ArchivoAF='CREADO',CreadoAF='AUTOMATICO',zhAF ='"+"Hora central"+"', id_x3='"+id_x3+"' where CartaporteAF='"+cartaAF+"' ");
                    System.out.println("RegistroAF() Transacción Salida de Cargar (214) Actualizados");
                    stp.setDate(1, new java.sql.Date(fechaj.getTime()));
                    stp.executeUpdate();
                    TransaccionAF();  
            } catch (SQLException ex) {
                    System.out.println("Error RegistroAF(3) Transacción Salida de Cargar (214-registro) "+ex.getMessage());
            }
        }  
    }
    
    private void TransaccionAF() throws IOException{
        System.out.println("TransaccionAF() Crear archivo AF "+cartaAF);
        String ruta="C:\\214/214 "+cartaAF+" AF.txt";
        File archivo=new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()){
            System.out.println("El archivo ya existe"+cartaAF);
        }else{
            bw=new BufferedWriter(new FileWriter(archivo));
            bw.write("CAB,04400                         ,54930                         ,X,004010,214,P"+"\r\n"+
            "HDR,04400,ZZ,54930,ZZ,"+terAF.trim()+"0"+folioAF.trim()+",XSUP,"+cpoAF.replaceAll("CPO", "").trim()+","+uniAF.trim()+","+terAF.trim()+"0"+folioAF.trim()+",,,,,XSUP,B,"+eqAF+","+bol.trim().toUpperCase()+","+"\r\n"+
                    "ADR,SF,,"+origenAF.trim()+",,,\r\n"+
                    "ADR,ST,,"+destAF.trim()+",,,\r\n"+
                    "LX,1,AF,"+eventoAF.trim().toUpperCase()+","+llegada.substring(0,10).replaceAll("-","").trim()+","+llegada.substring(11,16).replaceAll(":","").trim()+","+"CT"+","+salida.substring(0,10).replaceAll("-","").trim()+","+salida.substring(11,16).replaceAll(":","").trim()+","+"CT"+","+entrega.substring(0,10).replaceAll("-","").trim()+","+entrega.substring(11,16).replaceAll(":","").trim()+","+"CT"+",,,,"+"0000000"+","+"0000000"+",XSUP,"+remAF.trim()+","+cargaAF1+","+pesoAF.trim()+",L,");
            bw.close();
            System.out.println("TransaccionAF() Transacción Salida de Cargar (214-archivo) TRAKI");
            ValiPreviox1();
        }     
    }
    
    public void ValiPreviox1(){
        System.out.println("ValiPreviox1() Transacción Salida de Cargar (214-X1-AG-AF)  ");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where Cartaportex1='"+cartaAF+"'");
            if(rs1.next() == true){
                System.out.println("ValiPreviox1() Transacción Salida de Cargar (214-X1-AG-AF)  YA EXISTE "+cartaAF);
            }else {
                Previox1();  
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro x1 "+ex.getMessage());
        }
    }
    
    public void Previox1() throws SQLException{
        System.out.println("Previox1() Transacción Salida de Cargar (214-X1-AG-AF)  "+cartaAF);
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                Statement st=(Statement)miConexion.createStatement();
                st.execute("insert into TBL_REG_X1_1(Cartaportex1) values('"+cartaAF+"')");
                System.out.println("Previox1() Transacción Salida de Cargar (214-X1-AG-AF) REGISTRO"+cartaAF);
            } catch (SQLException ex) {
                System.out.println("Error Previox1() Transacción Salida de Cargar (214-X1-AG-AF)"+ex.getMessage());
            }
        }    
    }
    
    String cartax1,arribox1,eventox1; 
    public void movx1a() throws IOException{
        System.out.println("consultar tb_edi-x1 ");
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try { 
            PreparedStatement stmt=miConexion1.prepareStatement("select * from tb_edi where transaction_type='"+"x1"+"' and arrival_date between convert(datetime,'"+txtos1.getText()+" "+"00:00:00"+"') and convert(datetime,'"+txtos2.getText()+" "+"23:58:00"+"')");
            ResultSet rs=stmt.executeQuery();
            while(rs.next()){
                cartax1=rs.getString("reference_number").trim();
                arribox1=rs.getString("arrival_date");
                eventox1=rs.getString("reason_code").trim();   
                    if (eventox1 == null ){
                        System.out.println("no hay codigo de rason para x1   "+cartax1);
                    }else{
                        System.out.println("puede procesar x1 para "+cartax1);   
                        ValidaAF();
                    }                    
            }   
        } catch (SQLException ex) {
            System.out.println("erpCarta  Starsx1-(yaz) "+ex.getMessage());
        }              
    }
    
    public void ValidaAF() throws IOException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where Cartaporteaf='"+cartax1+"' AND ArchivoAF='CREADO' and CategoriaAF ='IR'");  
                if(rs1.next() == true){
                    System.out.println(" LA CARTAPORTE "+ rs1.getString("cartaporteaf")+" presenta un IR");                    
                }else {
                    ValidaAF1();
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro BOL ValidaAF1() -x1-3"+ex.getMessage());
        } 
    }
    
    public void ValidaAF1() throws IOException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where Cartaporteaf='"+cartax1+"' AND ArchivoAF='CREADO' and CategoriaAF ='IA'");  
                if(rs1.next() == true){
                    Revx1();
                }else {
                    ValidaAF2();
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro BOL -ValidaAF1() "+ex.getMessage());
        } 
    }
    
    public void ValidaAF2() throws IOException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where Cartaporteaf='"+cartax1+"' AND ArchivoAF='CREADO' and CategoriaAF ='IE'");  
                if(rs1.next() == true){
                    Revx1();
                }else {
                    System.out.println("LA TRANSACCION AF- SIN CATEGORIA"+ cartax1);
                }
        } catch (SQLException ex) {
            System.out.println("Error SQL Registro BOL ValidaAF2() "+ex.getMessage());
        } 
    } 
    
    String terx1,foliox1,cpox1,fcargax1,fentregax1,origenx1,destx1,cargax1,pesox1,eqx1,unix1,remx1,stx1,cargaxx1,bolaf,id_AF;
    public void Revx1() throws IOException{
        System.out.println(" Revx1()Llegada a Destino (214) Starsx1() "+cartax1+" sin espacio x1");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from  VTBL_REG_AF_STATUS_1 where CartaporteAF='"+cartax1+"' and ArchivoAF='creado'");
                if(rs1.next() == true){
                    terx1=rs1.getString("ter_carta");
                    foliox1=rs1.getString("folio_carta");
                    cpox1=rs1.getString("VALOR_CLI_RUBRO1");
                    fcargax1=rs1.getString("fecha_carga");
                    fentregax1=rs1.getString("fecha_entrega");
                    origenx1=rs1.getString("origen_nom");
                    destx1=rs1.getString("destinatario_nom");
                    cargax1=rs1.getString("carga");
                    pesox1=rs1.getString("peso");
                    eqx1=rs1.getString("Equipo");
                    unix1=rs1.getString("unidadAF");
                    remx1=rs1.getString("remolqueAF");
                    stx1=rs1.getString("status_orden");   
                    bolaf=rs1.getString("bol");  
                    //sizh1=rs1.getString("zhx3");
                    id_AF=rs1.getString("idAF");
                    
                    String code1="MATERIAL";
                        String code2=cargax1;
                        boolean resultado=code2.contains(code1);
                        if(resultado){
                            cargaxx1="2";
                        }else{
                            cargaxx1="1";
                        } 
                        Validax1C();
                }else {
                    System.out.println("No-Registro Revx1()Llegada a Destino (214) Starsx1()-no se ha creado archivo de AF");
                }
        } catch (SQLException ex) {
            System.out.println("Error Revx1()Llegada a Destino (214) Starsx1() "+ex.getMessage());
        } 
    }
    
    public void Validax1C() throws IOException{
        System.out.println("validar archvio creado x1 Validax1C()");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            
            ResultSet rsx1 = statement.executeQuery("SELECT * FROM TBL_REG_X1_1 WHERE CartaporteX1='"+cartax1+"' and Archivox1='Creado'");  
                if(rsx1.next() == true){
                    System.out.println("EL ARCHIVO x1 YA FUE CREADO!!");  
                }else {
                    System.out.println("Registro de TRANSACCIÓN x1-NUEVA  *jbt*"+"\t\n");
                    Registrox1(); 
                }
        } catch (SQLException ex) {
            System.out.println("Error RevAF() Transacción Salida de Cargar (214)"+ex.getMessage());
        } 
    }
    
    public void Registrox1() throws SQLException, IOException{
        System.out.println(remx1+"");
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strfchx1 = txtFch1;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strfchx1);
            } catch (ParseException ex) {
            }
        System.out.println(" Registrox1() Llegada a Destino (214) Starsx1() "+cartax1);
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {
                PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X1_1 set Fechax1=?,usuario='ADMON',fch_x1='"+txtFch1+"',hrx1='"+arribox1.substring(11,16).trim()+"',fchx1='"+arribox1.substring(0,11).trim()+"',StatusOB='"+stx1.trim()+"', Remolquex1='"+remx1.trim()+"', Unidadx1='"+unix1.trim()+"', ReasonCodex1='"+eventox1.trim().toUpperCase()+"',FolioX1='"+foliox1+"', Ter_cartaX1='"+terx1+"', Factura='"+bolaf+"',idAF='"+id_AF+"',Archivox1='CREADO',Creacionx1='AUTOMATICO',zhx1='"+"Hora central"+"'"
                + "where CartaporteX1='"+cartax1+"' ");
                System.out.println("Registrox1() Llegada a Destino (214) Starsx1() Actaliza"+cartax1);
                stp.setDate(1, new java.sql.Date(fechaj.getTime()));
                stp.executeUpdate();    
                Transaccionx1();
                } catch (SQLException ex) {
                    System.out.println("Error Registrox1() Llegada a Destino (214) Starsx1() "+ex.getMessage());
                }
        }      
    }
    
    public void Transaccionx1() throws IOException{
        System.out.println("Transaccionx1() Llegada a Destino (214) Starsx1() Actaliza"+cartaAF);
        String ruta="C:\\214/214 "+cartax1+" x1.txt";
        File archivo=new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()){
            System.out.println("El archivo ya existe"+cartax1);
        }else{
            bw=new BufferedWriter(new FileWriter(archivo));
            bw.write("CAB,04400                         ,54930                         ,X,004010,214,P"+"\r\n"+
                "HDR,04400,ZZ,54930,ZZ,"+terx1.trim()+"0"+foliox1.trim()+",XSUP,"+cpox1.replaceAll("CPO", "").trim()+","+unix1.trim()+","+terx1.trim()+"0"+foliox1.trim()+",,,,,XSUP,B,"+eqx1+","+bolaf.trim()+","+"\r\n"+
                "ADR,SF,,"+origenx1.trim()+",,,\r\n"+
                "ADR,ST,,"+destx1.trim()+",,,\r\n"+
                "LX,1,X1,"+eventox1.trim().toUpperCase()+","+arribox1.substring(0,10).replace("-","").trim()+","+arribox1.substring(11,16).replace(":","").trim()+","+"CT"+",,,,,,,,,,"+"0000000"+","+"0000000"+",XSUP,"+remx1.trim()+","+cargaxx1+","+pesox1.trim()+",L,");
            bw.close();
            System.out.println("Transaccionx1() Transacción Salida de Cargar (214) Archivo  TRAKI"+cartaAF);
        }
    }
    
    public void afPanel(){
        DefaultTableModel model = (DefaultTableModel) JTableStar.getModel();
            JTableStar.setModel(model);
            String query="select * from VpanelafRecpcion WHERE CategoriaAF='IR' or CategoriaAF is null OR ArchivoAF IS NULL order by fecha_orden asc";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[16];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]="AF";
                    data[1]=resp.getString("CartaporteAF");//
                    data[2]=resp.getString("status_orden");//
                    data[3]=resp.getString("fecha_orden").substring(0,11);//
                    data[4]=resp.getString("ArchivoAF");
                    data[5]=resp.getString("VALOR_CLI_RUBRO1");
                    data[6]=resp.getString("ErrorAF");
                    data[7]=resp.getString("CategoriaAF");
                    data[8]=resp.getString("nom_origen");//                    
                    data[9]=resp.getString("cd_origen");//
                    data[10]=resp.getString("nom_destino");//
                    data[11]=resp.getString("Unidadx3");
                    data[12]=resp.getString("Remolquex3");
                    model.addRow(data);
                }JTableStar.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(TBL_STARSG.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableStar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lbl1;
    public javax.swing.JLabel lblUserVF;
    public javax.swing.JTextField txtCF1;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtFolio2;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtRem;
    private javax.swing.JTextField txtTerminal;
    private javax.swing.JTextField txtUnidad;
    private javax.swing.JTextField txtos1;
    private javax.swing.JTextField txtos2;
    // End of variables declaration//GEN-END:variables
}