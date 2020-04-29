package strack;

import java.io.File;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.ConexionEDI;
import Clases.Exportar810;
import Clases.FormatotTabla810;
import java.awt.HeadlessException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.sql.JDBCType;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Consulta810 extends javax.swing.JFrame {

    DefaultTableModel model;
    public Consulta810() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableAcuse = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnDescargar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jcbActiva = new javax.swing.JCheckBox();
        jcbCancelado = new javax.swing.JCheckBox();
        jcbNota = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jcbAceptado = new javax.swing.JCheckBox();
        jcbRechazo = new javax.swing.JCheckBox();
        jcbPendiente = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFF1 = new javax.swing.JTextField();
        txtFF2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        txtFolio2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtFA1 = new javax.swing.JTextField();
        txtFA2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jcbtol = new javax.swing.JCheckBox();
        jcbrct = new javax.swing.JCheckBox();
        jcbtd = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XML( 810- Status de Cobranza)");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Acuses", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton5.setToolTipText("Exportar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        JTableAcuse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Proveedor", "Serie", "Folio", "UUID", "Fecha de Factura", "Fecha 810", "Hora", "Código", "Observaciones", "Status Acuse", "Status Talón", "Nota Credito", "Folio de Nota", "Cartaporte", "Bol", "Stars", "Status (Stars)", "Fecha de Lectura"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableAcuse.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTableAcuse.getTableHeader().setReorderingAllowed(false);
        JTableAcuse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableAcuseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTableAcuse);
        if (JTableAcuse.getColumnModel().getColumnCount() > 0) {
            JTableAcuse.getColumnModel().getColumn(0).setMinWidth(40);
            JTableAcuse.getColumnModel().getColumn(0).setPreferredWidth(45);
            JTableAcuse.getColumnModel().getColumn(0).setMaxWidth(80);
            JTableAcuse.getColumnModel().getColumn(1).setMinWidth(80);
            JTableAcuse.getColumnModel().getColumn(1).setPreferredWidth(100);
            JTableAcuse.getColumnModel().getColumn(1).setMaxWidth(120);
            JTableAcuse.getColumnModel().getColumn(2).setMinWidth(30);
            JTableAcuse.getColumnModel().getColumn(2).setPreferredWidth(50);
            JTableAcuse.getColumnModel().getColumn(2).setMaxWidth(70);
            JTableAcuse.getColumnModel().getColumn(3).setMinWidth(40);
            JTableAcuse.getColumnModel().getColumn(3).setPreferredWidth(50);
            JTableAcuse.getColumnModel().getColumn(3).setMaxWidth(80);
            JTableAcuse.getColumnModel().getColumn(4).setMinWidth(250);
            JTableAcuse.getColumnModel().getColumn(4).setPreferredWidth(280);
            JTableAcuse.getColumnModel().getColumn(4).setMaxWidth(300);
            JTableAcuse.getColumnModel().getColumn(6).setMinWidth(50);
            JTableAcuse.getColumnModel().getColumn(6).setPreferredWidth(80);
            JTableAcuse.getColumnModel().getColumn(6).setMaxWidth(100);
            JTableAcuse.getColumnModel().getColumn(7).setMinWidth(55);
            JTableAcuse.getColumnModel().getColumn(7).setPreferredWidth(65);
            JTableAcuse.getColumnModel().getColumn(7).setMaxWidth(80);
            JTableAcuse.getColumnModel().getColumn(8).setMinWidth(50);
            JTableAcuse.getColumnModel().getColumn(8).setPreferredWidth(20);
            JTableAcuse.getColumnModel().getColumn(8).setMaxWidth(80);
            JTableAcuse.getColumnModel().getColumn(9).setMinWidth(160);
            JTableAcuse.getColumnModel().getColumn(9).setPreferredWidth(180);
            JTableAcuse.getColumnModel().getColumn(9).setMaxWidth(300);
            JTableAcuse.getColumnModel().getColumn(10).setMinWidth(50);
            JTableAcuse.getColumnModel().getColumn(10).setPreferredWidth(80);
            JTableAcuse.getColumnModel().getColumn(10).setMaxWidth(100);
            JTableAcuse.getColumnModel().getColumn(11).setMinWidth(60);
            JTableAcuse.getColumnModel().getColumn(11).setPreferredWidth(80);
            JTableAcuse.getColumnModel().getColumn(11).setMaxWidth(100);
            JTableAcuse.getColumnModel().getColumn(12).setMinWidth(60);
            JTableAcuse.getColumnModel().getColumn(12).setPreferredWidth(80);
            JTableAcuse.getColumnModel().getColumn(12).setMaxWidth(100);
            JTableAcuse.getColumnModel().getColumn(13).setMinWidth(80);
            JTableAcuse.getColumnModel().getColumn(13).setPreferredWidth(80);
            JTableAcuse.getColumnModel().getColumn(13).setMaxWidth(100);
            JTableAcuse.getColumnModel().getColumn(14).setMinWidth(80);
            JTableAcuse.getColumnModel().getColumn(14).setPreferredWidth(100);
            JTableAcuse.getColumnModel().getColumn(14).setMaxWidth(150);
            JTableAcuse.getColumnModel().getColumn(15).setMinWidth(100);
            JTableAcuse.getColumnModel().getColumn(15).setPreferredWidth(100);
            JTableAcuse.getColumnModel().getColumn(15).setMaxWidth(120);
            JTableAcuse.getColumnModel().getColumn(16).setMinWidth(80);
            JTableAcuse.getColumnModel().getColumn(16).setPreferredWidth(80);
            JTableAcuse.getColumnModel().getColumn(16).setMaxWidth(100);
            JTableAcuse.getColumnModel().getColumn(17).setMinWidth(100);
            JTableAcuse.getColumnModel().getColumn(17).setPreferredWidth(80);
            JTableAcuse.getColumnModel().getColumn(17).setMaxWidth(100);
            JTableAcuse.getColumnModel().getColumn(18).setMinWidth(80);
            JTableAcuse.getColumnModel().getColumn(18).setPreferredWidth(80);
            JTableAcuse.getColumnModel().getColumn(18).setMaxWidth(100);
        }

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busqueda.png"))); // NOI18N
        jButton6.setToolTipText("Consulta por Status/ Fechas");
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

        btnDescargar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar1.png"))); // NOI18N
        btnDescargar.setToolTipText("Descargar acuse");
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Status de Factura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jcbActiva.setText("Activa");

        jcbCancelado.setText("Cancelado");

        jcbNota.setText("Nota");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jcbActiva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbCancelado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbNota))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbActiva)
                .addComponent(jcbCancelado)
                .addComponent(jcbNota))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estado de Acuse 810", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jcbAceptado.setText("Aceptado");

        jcbRechazo.setText("Rechazado");

        jcbPendiente.setText("Pendiente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jcbAceptado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbRechazo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbPendiente)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbAceptado)
                .addComponent(jcbRechazo)
                .addComponent(jcbPendiente))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fecha de");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Factura:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFF2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFF1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtFF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Folios:");

        txtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioActionPerformed(evt);
            }
        });

        txtFolio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolio2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Fecha de");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Acuse:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFA2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFA1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(txtFA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serie", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jcbtol.setText("TOL");

        jcbrct.setText("RCT");

        jcbtd.setText("TD");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jcbtol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbrct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbtd))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jcbtol)
                .addComponent(jcbrct)
                .addComponent(jcbtd))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1217, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDescargar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton7)
                    .addComponent(btnDescargar)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setText("Usuario:");

        lblUserVF.setText("Usuario");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setToolTipText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Validador de XML(810)");

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
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(lblUserVF)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(lblUserVF))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDescargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescargarActionPerformed
        System.out.println("Metodos.Consulta810.btnDescargarActionPerformed()-descarga(1)");
        try {
            BajarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (JTableAcuse.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(JTableAcuse);
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
        //Archivos();
        Clear(); 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void JTableAcuseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableAcuseMouseClicked
        try {
            SelecionaRegistro();
        } catch (IOException ex) {
            Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableAcuseMouseClicked
        
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //impiarJtbl();
        Consulta();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        MenuGeneral ms=new MenuGeneral();
        ms.lblUser.setText(lblUserVF.getText());
        ms.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuGeneral ms=new MenuGeneral();
        ms.lblUser.setText(lblUserVF.getText());
        ms.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
        //LimpiarJtbl();
        queryFolio();
    }//GEN-LAST:event_txtFolioActionPerformed

    private void txtFolio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolio2ActionPerformed
          
    public void Consulta(){
        LimpiarJtbl();
        if( (!txtFolio.getText().equals("")) && (txtFolio2.getText().equals("")) && txtFF1.getText().equals("") && txtFF2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("folio");
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where folio="+txtFolio.getText()+" ORDER BY FCH_CREA ASC";          
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if( (!txtFolio.getText().equals("")) && (!txtFolio2.getText().equals("")) && ((txtFF1.getText().equals("") && txtFF2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("rango de folios");
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where folio BETWEEN "+txtFolio.getText()+" AND "+txtFolio2.getText()+"  ORDER BY FCH_CREA ASC";          
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbActiva.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("facturas SERIE TOL");  
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }else if( (jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbActiva.isSelected() && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("facturas SERIE TD");
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='td' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }             
        }else if( (jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbActiva.isSelected() && !jcbtol.isSelected() && !jcbtd.isSelected()){
            System.out.println("facturas SERIE RCT"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("facturas activas"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where statustal='activo' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (jcbCancelado.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("facturas cancelada"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where statustal='cancelado' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("facturas nota");  
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where nota='aplicada' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (jcbAceptado.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("810 aceptado");
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where estado='aceptado' or estado='concidencia' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (jcbRechazo.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("810 rechazado");  
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where estado='rechazado' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (jcbPendiente.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("810 pendiente");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where estado is null order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie tol y activa"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie tol y cancelado"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie tol y nota"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && jcbrct.isSelected()){
            System.out.println("serie rct y activo"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && jcbCancelado.isSelected() &&!jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && jcbrct.isSelected()){
            System.out.println("serie rct y cancelado"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' and statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && jcbrct.isSelected()){
            System.out.println("serie rct y nota"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie td y activo"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='td' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie td y cancelado"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='td' and statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie td y nota"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='td' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie tol y aceptado"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and estado='aceptado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && jcbrct.isSelected()){
            System.out.println("serie rct y aceptado"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' and estado='concidencia' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie tol y rechazado"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and estado='rechazado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("serie tol y pendiente"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and estado is null order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
        
        
        else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()))){
            System.out.println("fecha de factura y tol"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='TOL' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbtd.isSelected() && !jcbtol.isSelected()))){
            System.out.println("fecha de factura y rct"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='RCT' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbrct.isSelected() && !jcbtol.isSelected()))){
            System.out.println("fecha de factura y td"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='TD' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y estado activa"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where Fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND statustal='Activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y estado cancelado");    
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where Fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND statustal='CANCELADO' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y estado nota");    
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where Fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND NOTA='APLICADA' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbAceptado.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbtol.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()))){
            System.out.println("fecha de factura y ACEPTADO"); 
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND ESTADO='ACEPTADO' OR ESTADO='CONCIDENCIA' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbRechazo.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbrct.isSelected() && !jcbPendiente.isSelected() && !jcbtd.isSelected() && !jcbtol.isSelected()))){
            System.out.println("fecha de factura y RECHAZO");  
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND ESTADO='rechazado' order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbPendiente.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected() && !jcbtol.isSelected()))){
            System.out.println("fecha de factura y PENDIENTE");    
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND ESTADO is null order by fch_crea asc";       
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbActiva.isSelected() && jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbCancelado.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y tol y activo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='TOL' AND statustal='ACTIVO' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbActiva.isSelected() && jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbCancelado.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de factura y rct y activo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND statustal='ACTIVO' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbActiva.isSelected() && jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbCancelado.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de factura y td y activo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND statustal='ACTIVO' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbCancelado.isSelected() && jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de factura y tol y cancelado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbCancelado.isSelected() && jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de factura y rct y cancelado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbCancelado.isSelected() && jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y td y cancelado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y tol y aceptdo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='tol' AND estado='aceptado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de factura y rct y aceptdo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND estado='concidencia' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y td y aceptdo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND estado='aceptado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbtol.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y tol y activa y aceptada");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='tol' AND estado='aceptado' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbrct.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de factura y rct y activa y aceptada");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND estado='concidencia' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbtd.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de factura y td y activa y aceptada");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND estado='aceptado' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbRechazo.isSelected() && jcbtol.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbPendiente.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de factura y tol y activa y rechazado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='tol' AND estado='rechazado' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbRechazo.isSelected() && jcbrct.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de factura y rct y activa y rechazado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND estado='rechazado' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbRechazo.isSelected() && jcbtd.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y td y activa y rechazado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND estado='rechazado' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbPendiente.isSelected() && jcbtol.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de factura y td y activa y pendiente");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='tol' AND estado is null and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbPendiente.isSelected() && jcbrct.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de factura y rct y activa y pendiente");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND estado is null and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbPendiente.isSelected() && jcbtd.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de factura y td y activa y pendiente");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND estado is null and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && jcbtol.isSelected()&& !jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de acuse y tol");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND SERIE='tol'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && jcbrct.isSelected()&& !jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de acuse y rct");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND SERIE='rct'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && jcbtd.isSelected()&& !jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y td");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND SERIE='td'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && !jcbtd.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y activo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && !jcbtd.isSelected()&& jcbCancelado.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbActiva.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y cancelado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='cancelado'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbActiva.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y nota");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND nota='aplicada'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbAceptado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbActiva.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y aceptado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' or estado='concidencia'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbRechazo.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbActiva.isSelected() && !jcbPendiente.isSelected() && !jcbAceptado.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y rechazado");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado'   order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbActiva.isSelected() && jcbtol.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y tol y activo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo' and serie='tol'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbActiva.isSelected() && jcbrct.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y rct y activo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo' and serie='rct'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbActiva.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y td y activo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo' and serie='td'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbActiva.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y td y activo");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo' and serie='td'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && jcbtol.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de acuse y tol y cancelado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='cancelado' and serie='tol'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && jcbrct.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de acuse y rct y cancelado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='cancelado' and serie='rct'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y td y cancelado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='cancelado' and serie='td'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtol.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y tol y nota ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND nota='aplicada' and serie='tol'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbrct.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y rct y nota ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND nota='aplicada' and serie='rct'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y td y nota ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND nota='aplicada' and serie='td'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtol.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de acuse y tol y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='tol'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbrct.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            System.out.println("fecha de acuse y rct y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='concidencia' and serie='rct'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y td y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='td'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtol.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            System.out.println("fecha de acuse y tol y rechazado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='tol'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbrct.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y rct y rechazado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='rct'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y td y rechazado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='td'  order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && jcbtol.isSelected()){
            System.out.println("fecha de acuse y tol y activo y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='tol' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y rct y activo y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='concidencia' and serie='rct' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y td y activo y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='td' and statustal='activo' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && jcbtol.isSelected()){
            System.out.println("fecha de acuse y tol y cancelado y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='tol' and statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y rct y cancelado y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='rct' and statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y td y cancelado y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='td' and statustal='cancelado' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && jcbtol.isSelected()){
            System.out.println("fecha de acuse y tol y nota y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='tol' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y rct y nota y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='rct' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y td y nota y aceptado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='td' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbrct.isSelected() && jcbtol.isSelected()){
            System.out.println("fecha de acuse y tol y nota y rechazado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='tol' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y rct y nota y rechazado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='rct' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            System.out.println("fecha de acuse y td y nota y rechazado ");   
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);  
            String query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='td' and nota='aplicada' order by fch_crea asc";      
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        
        else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()) && !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected())){
            System.out.println("CONSULTA GENERAL");
            DefaultTableModel model = (DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 ORDER BY FCH_CREA ASC";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");//
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        FormatotTabla810 ft = new FormatotTabla810(0);
        JTableAcuse.setDefaultRenderer (Object.class, ft );
    }

    public void LimpiarJtbl(){
        DefaultTableModel model=(DefaultTableModel) JTableAcuse.getModel();
    	for (int i=0; i<JTableAcuse.getRowCount(); i++){
    		model.removeRow(i);
    		i-=1;
    	}
    }
        
    public void Clear(){        
        txtFolio.setText("");
        txtFolio2.setText("");
        LimpiarJtbl();  
        txtFF1.setText("");
        txtFF2.setText("");
        txtFA1.setText("");
        txtFA2.setText("");
        jcbActiva.setSelected(false);
        jcbCancelado.setSelected(false);
        jcbNota.setSelected(false);
        jcbAceptado.setSelected(false);
        jcbRechazo.setSelected(false);
        jcbPendiente.setSelected(false);
        jcbtol.setSelected(false);
        jcbrct.setSelected(false);
        jcbtd.setSelected(false);
    }
    
    String id;
    public void SelecionaRegistro() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = JTableAcuse.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
            }else{
                DefaultTableModel model=(DefaultTableModel)JTableAcuse.getModel();
                //id =(String)model.getValueAt(FilaSeleccionada,0);
                doc =(String)model.getValueAt(FilaSeleccionada,1);
                //txtachivo.setText(doc);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error");
        }
    }
    
    String t1,t2,t3,t4,t5,t6,t7,t8,doc,detalle;    
    public void BajarArchivo() throws IOException {
        System.out.println("Metodos.Consulta810.BajarArchivo(2)");
        if(!txtFolio.getText().equals("")){
           Connection miConexion =(Connection)ConexionEDI.GetConnection();
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery("select *  from TBL_ACUSE810 WHERE folio='"+txtFolio.getText()+"'");
                while (resp.next()==true) {
                    t1= resp.getString("uuid").trim();                    
                    t2= resp.getString("folio").trim();
                    t3= resp.getString("serie").trim();
                    t4= resp.getString("proveedor").trim();
                    t5= resp.getString("codigo").trim();
                    t6= resp.getString("fecha").trim();
                    t7= resp.getString("hora").trim();
                    t8= resp.getString("observacion");
                    if (t5.equals("00")){
                        System.out.println("Aceptado normalmente");
                        detalle="<?xml version=\"1.0"+"\""+" "+"encoding=\"UTF-8"+"\""+" "+"?>\r"+"\n" +
                "<acuseRecibo>\r" +"\n" +
                "<ruta destinatario=\"54930\" remitente=\"0000000100\"/>\r" +"\n" +
                "<documento UUID=\""+t1+"\""+" "+"folioFiscal=\""+t2+"\""+" "+"serie=\""+t3+"\""+" "+"referenciaProveedor=\""+t4+"/>\r" +"\n" +
                "<recepcion estatus=\""+t5+"\""+" "+"fechahora=\""+t6.substring(0,10)+"T"+t7+"/>\r" +"\n" +
                "</acuseRecibo>";
                    }else{
                        System.out.println("El acuse presenta error");
                        detalle="<?xml version=\"1.0"+"\""+" "+"encoding=\"UTF-8"+"\""+" "+"?>\r"+"\n" +
                "<acuseRecibo>\r" +"\n" +
                "<ruta destinatario=\"54930\" remitente=\"0000000100\"/>\r" +"\n" +
                "<documento UUID=\""+t1+"\""+" "+"folioFiscal=\""+t2+"\""+" "+"serie=\""+t3+"\""+" "+"referenciaProveedor=\""+t4+"/>\r" +"\n" +
                "<recepcion estatus=\""+t5+"\""+" "+"fechahora=\""+t6.substring(0,10)+"T"+t7+"/>\r" +"\n" +
                "<error>"+t8.replace("error","")+"</error>\r" +"\n" +                
                "</acuseRecibo>";                                
                    }
                    Reconstruir();  
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "El archivo no existe en la ruta C:Edi810"); 
            }             
        }else{
           JOptionPane.showMessageDialog(null, "Ingrese un nombre de archivo"); 
        }                 
    }
       
    public void Reconstruir() throws IOException{
        System.out.println("Metodos.Consulta810.Reconstruir()"+txtFolio.getText());
        File dir= new File("C:\\Edi810/");
         if(dir.exists()){
            System.out.println("El fichero ya existe");
            String ruta = "C:\\Edi810/"+txtFolio.getText().replaceAll(".xml", "")+".xml".trim();
            File txtarch = new File(ruta);
            BufferedWriter bw;
            if(txtarch.exists()){                
                JOptionPane.showMessageDialog(this, "Archivo existente");
            }else{
                bw = new BufferedWriter(new FileWriter(txtarch));
                bw.write(detalle);
    		bw.close();
    		JOptionPane.showMessageDialog(this,"Archivo Descargado en C:Edi810");
            }
         }else{
            System.out.println("El fichero es nuevo");
            dir.mkdir();
            String ruta = "C:\\Edi810/"+t2+".xml".trim();
            File txtarch = new File(ruta);
            BufferedWriter bw;
            if(txtarch.exists()){
                JOptionPane.showMessageDialog(this, "Archivo ya existente");
            }else{
                bw = new BufferedWriter(new FileWriter(txtarch));
                bw.write(detalle);
    		bw.close();
    		JOptionPane.showMessageDialog(this,"Archivo Descargado");
            }
         }
    }
    
    public void queryFolio(){
        LimpiarJtbl();
            DefaultTableModel model =(DefaultTableModel) JTableAcuse.getModel();
            JTableAcuse.setModel(model);
            String query="SELECT * FROM VTBL_ACUSES_810 where folio="+txtFolio.getText()+" ORDER BY FCH_CREA ASC";          
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[20];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("ID");
                    data[1]=resp.getString("PROVEEDOR");
                    data[2]=resp.getString("SERIE");
                    data[3]=resp.getString("FOLIO");
                    data[4]=resp.getString("UUID");
                    data[5]=resp.getString("FCH_CREA");
                    data[6]=resp.getString("fch");
                    data[7]=resp.getString("HORA");
                    data[8]=resp.getString("CODIGO");
                    data[9]=resp.getString("OBSERVACION");
                    data[10]=resp.getString("ESTADO");
                    data[11]=resp.getString("statustal");
                    data[12]=resp.getString("nota");
                    data[13]=resp.getString("folio_nota");
                    data[14]=resp.getString("cartaporte");
                    data[15]=resp.getString("bol810");
                    data[16]=resp.getString("statustar");
                    data[17]=resp.getString("categoriast");
                    data[18]=resp.getString("FECHA");
                    model.addRow(data);
                }JTableAcuse.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(Consulta810.class.getName()).log(Level.SEVERE, null, ex);
            }
        FormatotTabla810 ft = new FormatotTabla810(0);
        JTableAcuse.setDefaultRenderer (Object.class, ft );
    }
    
    
    public static final String ANSI_RESET = "C:\\Users\\Desarrollo 1\\Documents\\yazmin-usb";
    public static final String ANSI_RED = "C:\\Users\\Desarrollo 1\\Documents\\yazmin-usb";
  
    public void Archivos(){
        String scarpeta=System.getProperty("user.dir");
        System.out.println("Carpeta de usuario "+ scarpeta);
        
        System.out.println(ANSI_RED +" listado simple "+ANSI_RESET );
        
        File carpeta= new File(scarpeta);
        String [] listado =  carpeta.list();
        if(listado == null || listado.length==0){
            System.out.println("No hay elementos en la carpeta");
            return;
        }else{   
            for(int i=0; i< listado.length; i++){
                System.out.println(listado[i]);
            }
        }
        
        
        File[] archivos = carpeta.listFiles();
    if (archivos == null || archivos.length == 0) {
      System.out.println("No hay elementos dentro de la carpeta actual");
      return;
    }
    else {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
      for (int i=0; i< archivos.length; i++) {
        File archivo = archivos[i];
        System.out.println(String.format("%s (%s) - %d - %s", 
                                          archivo.getName(), 
                                          archivo.isDirectory() ? "Carpeta" : "Archivo",
                                          archivo.length(),
                                          sdf.format(archivo.lastModified())
                                          ));
      }
    }
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableAcuse;
    private javax.swing.JButton btnDescargar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jcbAceptado;
    private javax.swing.JCheckBox jcbActiva;
    private javax.swing.JCheckBox jcbCancelado;
    private javax.swing.JCheckBox jcbNota;
    private javax.swing.JCheckBox jcbPendiente;
    private javax.swing.JCheckBox jcbRechazo;
    private javax.swing.JCheckBox jcbrct;
    private javax.swing.JCheckBox jcbtd;
    private javax.swing.JCheckBox jcbtol;
    public javax.swing.JLabel lblUserVF;
    private javax.swing.JTextField txtFA1;
    private javax.swing.JTextField txtFA2;
    private javax.swing.JTextField txtFF1;
    private javax.swing.JTextField txtFF2;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtFolio2;
    // End of variables declaration//GEN-END:variables
}