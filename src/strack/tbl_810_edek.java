package strack;

import java.io.File;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.ConexionEDI;
import Clases.Exportar810;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class tbl_810_edek extends javax.swing.JFrame {

    DefaultTableModel tm=new DefaultTableModel();
    private void PropiedadesTabla(){
        jbtacuses810.setDefaultRenderer(Object.class, new ImgTable());
        String titulos []={"No.", "Proveedor", "Serie", "Folio", "UUID", "Fecha de factura", "Fecha de 810", "Hora", "Código", "Observaciones", "Status 810", "Status talon", "Nota de credito", "Folio de nota", "Carta porte", "Evidencia", "Stars","Proceso","Lectura"};
        tm=new DefaultTableModel(null,titulos);
        jbtacuses810.setModel(tm);
    }
    
    public tbl_810_edek() {
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbtacuses810 = new javax.swing.JTable();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("XML( 810- Status de Cobranza)");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Acuses", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton5.setToolTipText("Exportar");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        jbtacuses810.setModel(new javax.swing.table.DefaultTableModel(
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
        jbtacuses810.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jbtacuses810.getTableHeader().setReorderingAllowed(false);
        jbtacuses810.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtacuses810MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jbtacuses810);
        if (jbtacuses810.getColumnModel().getColumnCount() > 0) {
            jbtacuses810.getColumnModel().getColumn(0).setMinWidth(40);
            jbtacuses810.getColumnModel().getColumn(0).setPreferredWidth(45);
            jbtacuses810.getColumnModel().getColumn(0).setMaxWidth(80);
            jbtacuses810.getColumnModel().getColumn(1).setMinWidth(80);
            jbtacuses810.getColumnModel().getColumn(1).setPreferredWidth(100);
            jbtacuses810.getColumnModel().getColumn(1).setMaxWidth(120);
            jbtacuses810.getColumnModel().getColumn(2).setMinWidth(30);
            jbtacuses810.getColumnModel().getColumn(2).setPreferredWidth(50);
            jbtacuses810.getColumnModel().getColumn(2).setMaxWidth(70);
            jbtacuses810.getColumnModel().getColumn(3).setMinWidth(40);
            jbtacuses810.getColumnModel().getColumn(3).setPreferredWidth(50);
            jbtacuses810.getColumnModel().getColumn(3).setMaxWidth(80);
            jbtacuses810.getColumnModel().getColumn(4).setMinWidth(250);
            jbtacuses810.getColumnModel().getColumn(4).setPreferredWidth(280);
            jbtacuses810.getColumnModel().getColumn(4).setMaxWidth(300);
            jbtacuses810.getColumnModel().getColumn(6).setMinWidth(50);
            jbtacuses810.getColumnModel().getColumn(6).setPreferredWidth(80);
            jbtacuses810.getColumnModel().getColumn(6).setMaxWidth(100);
            jbtacuses810.getColumnModel().getColumn(7).setMinWidth(55);
            jbtacuses810.getColumnModel().getColumn(7).setPreferredWidth(65);
            jbtacuses810.getColumnModel().getColumn(7).setMaxWidth(80);
            jbtacuses810.getColumnModel().getColumn(8).setMinWidth(50);
            jbtacuses810.getColumnModel().getColumn(8).setPreferredWidth(20);
            jbtacuses810.getColumnModel().getColumn(8).setMaxWidth(80);
            jbtacuses810.getColumnModel().getColumn(9).setMinWidth(160);
            jbtacuses810.getColumnModel().getColumn(9).setPreferredWidth(180);
            jbtacuses810.getColumnModel().getColumn(9).setMaxWidth(300);
            jbtacuses810.getColumnModel().getColumn(10).setMinWidth(50);
            jbtacuses810.getColumnModel().getColumn(10).setPreferredWidth(80);
            jbtacuses810.getColumnModel().getColumn(10).setMaxWidth(100);
            jbtacuses810.getColumnModel().getColumn(11).setMinWidth(60);
            jbtacuses810.getColumnModel().getColumn(11).setPreferredWidth(80);
            jbtacuses810.getColumnModel().getColumn(11).setMaxWidth(100);
            jbtacuses810.getColumnModel().getColumn(12).setMinWidth(60);
            jbtacuses810.getColumnModel().getColumn(12).setPreferredWidth(80);
            jbtacuses810.getColumnModel().getColumn(12).setMaxWidth(100);
            jbtacuses810.getColumnModel().getColumn(13).setMinWidth(80);
            jbtacuses810.getColumnModel().getColumn(13).setPreferredWidth(80);
            jbtacuses810.getColumnModel().getColumn(13).setMaxWidth(100);
            jbtacuses810.getColumnModel().getColumn(14).setMinWidth(80);
            jbtacuses810.getColumnModel().getColumn(14).setPreferredWidth(100);
            jbtacuses810.getColumnModel().getColumn(14).setMaxWidth(150);
            jbtacuses810.getColumnModel().getColumn(15).setMinWidth(100);
            jbtacuses810.getColumnModel().getColumn(15).setPreferredWidth(100);
            jbtacuses810.getColumnModel().getColumn(15).setMaxWidth(120);
            jbtacuses810.getColumnModel().getColumn(16).setMinWidth(80);
            jbtacuses810.getColumnModel().getColumn(16).setPreferredWidth(80);
            jbtacuses810.getColumnModel().getColumn(16).setMaxWidth(100);
            jbtacuses810.getColumnModel().getColumn(17).setMinWidth(100);
            jbtacuses810.getColumnModel().getColumn(17).setPreferredWidth(80);
            jbtacuses810.getColumnModel().getColumn(17).setMaxWidth(100);
            jbtacuses810.getColumnModel().getColumn(18).setMinWidth(80);
            jbtacuses810.getColumnModel().getColumn(18).setPreferredWidth(80);
            jbtacuses810.getColumnModel().getColumn(18).setMaxWidth(100);
        }

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/busqueda.png"))); // NOI18N
        jButton6.setToolTipText("Consulta por Status/ Fechas");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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

        btnDescargar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDescargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar1.png"))); // NOI18N
        btnDescargar.setToolTipText("Descargar acuse");
        btnDescargar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDescargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescargarActionPerformed(evt);
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

        txtFF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFF1MouseClicked(evt);
            }
        });

        txtFF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFF2MouseClicked(evt);
            }
        });

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

        txtFA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFA1MouseClicked(evt);
            }
        });

        txtFA2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFA2MouseClicked(evt);
            }
        });

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
                    .addComponent(jScrollPane1)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnDescargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        try {
            BajarArchivo();
        } catch (IOException ex) {
            Logger.getLogger(tbl_810_edek.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnDescargarActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jbtacuses810.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(jbtacuses810);
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

    private void jbtacuses810MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtacuses810MouseClicked
        try {
            SelecionaRegistro();
        } catch (IOException ex) {
            Logger.getLogger(tbl_810_edek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtacuses810MouseClicked
        
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Consulta();
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
        LimpiarJtbl();
        query="SELECT * FROM VTBL_ACUSES_810 where folio="+txtFolio.getText()+" ORDER BY FCH_CREA ASC"; 
        sqledek();      
    }//GEN-LAST:event_txtFolioActionPerformed

    private void txtFolio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFolio2ActionPerformed

    private void txtFF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFF1MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtFF1.setText(datefecha.format(date));   
    }//GEN-LAST:event_txtFF1MouseClicked

    private void txtFF2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFF2MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtFF2.setText(datefecha.format(date)); 
    }//GEN-LAST:event_txtFF2MouseClicked

    private void txtFA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFA1MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtFA1.setText(datefecha.format(date)); 
    }//GEN-LAST:event_txtFA1MouseClicked

    private void txtFA2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFA2MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtFA2.setText(datefecha.format(date)); 
    }//GEN-LAST:event_txtFA2MouseClicked
    
    String query;
    public void Consulta(){
        LimpiarJtbl();
        if( (!txtFolio.getText().equals("")) && (txtFolio2.getText().equals("")) && txtFF1.getText().equals("") && txtFF2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where folio="+txtFolio.getText()+" ORDER BY FCH_CREA ASC";          
            sqledek();
        } else if( (!txtFolio.getText().equals("")) && (!txtFolio2.getText().equals("")) && ((txtFF1.getText().equals("") && txtFF2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where folio BETWEEN "+txtFolio.getText()+" AND "+txtFolio2.getText()+"  ORDER BY FCH_CREA ASC";          
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') order by fch_crea asc";       
            sqledek();
        }else if( (jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbActiva.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' order by fch_crea asc";       
            sqledek();  
        }else if( (jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbActiva.isSelected() && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='td' order by fch_crea asc";       
            sqledek();           
        }else if( (jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbActiva.isSelected() && !jcbtol.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' order by fch_crea asc";       
             sqledek();
        }else if( (jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where statustal='activo' order by fch_crea asc";       
            sqledek();
        }else if( (jcbCancelado.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where statustal='cancelado' order by fch_crea asc";       
            sqledek(); 
        }else if( (jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where nota='aplicada' order by fch_crea asc";       
            sqledek();
        }else if( (jcbAceptado.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where estado='aceptado' or estado='concidencia' order by fch_crea asc";       
            sqledek();
        }else if( (jcbRechazo.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where estado='rechazado' order by fch_crea asc";       
            sqledek();
        }else if( (jcbPendiente.isSelected()) && ((txtFolio.getText().equals("")) && (txtFF1.getText().equals("") && txtFF2.getText().equals("") &&txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where estado is null order by fch_crea asc";       
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and nota='aplicada' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && jcbCancelado.isSelected() &&!jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' and statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' and nota='aplicada' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='td' and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='td' and statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='td' and nota='aplicada' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and estado='aceptado' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='rct' and estado='concidencia' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and estado='rechazado' order by fch_crea asc";      
            sqledek();
        }else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && jcbPendiente.isSelected()))&& jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where serie='tol' and estado is null order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()))){
            query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='TOL' order by fch_crea asc";       
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbtd.isSelected() && !jcbtol.isSelected()))){
            query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='RCT' order by fch_crea asc";       
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbrct.isSelected() && !jcbtol.isSelected()))){
            query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='TD' order by fch_crea asc";       
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where Fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND statustal='Activo' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where Fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND statustal='CANCELADO' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()))&& !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where Fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND NOTA='APLICADA' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbAceptado.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbtol.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected()))){
            query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND ESTADO='ACEPTADO' OR ESTADO='CONCIDENCIA' order by fch_crea asc";       
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbRechazo.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbrct.isSelected() && !jcbPendiente.isSelected() && !jcbtd.isSelected() && !jcbtol.isSelected()))){
            query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND ESTADO='rechazado' order by fch_crea asc";       
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("")&& jcbPendiente.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected() && !jcbtol.isSelected()))){
            query="SELECT * FROM VTBL_ACUSES_810 where FCH_CREA BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND ESTADO is null order by fch_crea asc";       
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbActiva.isSelected() && jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbCancelado.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='TOL' AND statustal='ACTIVO' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbActiva.isSelected() && jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbCancelado.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND statustal='ACTIVO' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbActiva.isSelected() && jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbCancelado.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND statustal='ACTIVO' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbCancelado.isSelected() && jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbCancelado.isSelected() && jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbCancelado.isSelected() && jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbtol.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='tol' AND estado='aceptado' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbrct.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND estado='concidencia' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbtd.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
             && !jcbActiva.isSelected() && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND estado='aceptado' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbtol.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='tol' AND estado='aceptado' and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbrct.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND estado='concidencia' and statustal='activo' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbAceptado.isSelected() && jcbtd.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND estado='aceptado' and statustal='activo' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbRechazo.isSelected() && jcbtol.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbPendiente.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='tol' AND estado='rechazado' and statustal='activo' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbRechazo.isSelected() && jcbrct.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND estado='rechazado' and statustal='activo' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbRechazo.isSelected() && jcbtd.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbPendiente.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND estado='rechazado' and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbPendiente.isSelected() && jcbtol.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='tol' AND estado is null and statustal='activo' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbPendiente.isSelected() && jcbrct.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='rct' AND estado is null and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFF1.getText().equals("") && !txtFF2.getText().equals("") && jcbPendiente.isSelected() && jcbtd.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFA1.getText().equals("") && txtFA2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fch_crea BETWEEN convert(datetime,'"+txtFF1.getText()+" 00:00') and convert(datetime,'"+txtFF2.getText()+" 23:59') AND SERIE='td' AND estado is null and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && jcbtol.isSelected()&& !jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND SERIE='tol'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && jcbrct.isSelected()&& !jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND SERIE='rct'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && jcbtd.isSelected()&& !jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND SERIE='td'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && !jcbtd.isSelected()&& jcbActiva.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbCancelado.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && !jcbtd.isSelected()&& jcbCancelado.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbNota.isSelected()  && !jcbActiva.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='cancelado'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbPendiente.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbActiva.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND nota='aplicada'  order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbAceptado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbActiva.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' or estado='concidencia'  order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbRechazo.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbActiva.isSelected() && !jcbPendiente.isSelected() && !jcbAceptado.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado'   order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbActiva.isSelected() && jcbtol.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo' and serie='tol'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbActiva.isSelected() && jcbrct.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo' and serie='rct'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbActiva.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo' and serie='td'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbActiva.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbCancelado.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='activo' and serie='td'  order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && jcbtol.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='cancelado' and serie='tol'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && jcbrct.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='cancelado' and serie='rct'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND statustal='cancelado' and serie='td'  order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtol.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND nota='aplicada' and serie='tol'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbrct.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND nota='aplicada' and serie='rct'  order by fch_crea asc";      
             sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND nota='aplicada' and serie='td'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtol.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='tol'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbrct.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbtd.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='concidencia' and serie='rct'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbtol.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='td'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtol.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbrct.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='tol'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbrct.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbtd.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='rct'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='td'  order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='tol' and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='concidencia' and serie='rct' and statustal='activo' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='td' and statustal='activo' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='tol' and statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && !jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='rct' and statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && jcbCancelado.isSelected() && jcbtd.isSelected()&& !jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='td' and statustal='cancelado' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='tol' and nota='aplicada' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='rct' and nota='aplicada' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && jcbAceptado.isSelected() && !jcbPendiente.isSelected() && !jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='aceptado' and serie='td' and nota='aplicada' order by fch_crea asc";      
            sqledek(); 
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbrct.isSelected() && jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='tol' and nota='aplicada' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && !jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='rct' and nota='aplicada' order by fch_crea asc";      
            sqledek();
        }else if( (!txtFA1.getText().equals("") && !txtFA2.getText().equals("") && !jcbCancelado.isSelected() && jcbtd.isSelected()&& jcbNota.isSelected()) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
              && !jcbActiva.isSelected()  && !jcbAceptado.isSelected() && !jcbPendiente.isSelected() && jcbRechazo.isSelected())) && !jcbrct.isSelected() && !jcbtol.isSelected()){
            query="SELECT * FROM VTBL_ACUSES_810 where fecha BETWEEN convert(datetime,'"+txtFA1.getText()+" 00:00') and convert(datetime,'"+txtFA2.getText()+" 23:59') AND estado='rechazado' and serie='td' and nota='aplicada' order by fch_crea asc";      
            sqledek();
        }
        
        else if( (txtFA1.getText().equals("") && txtFA2.getText().equals("")) && ((txtFolio.getText().equals("")) && (txtFolio2.getText().equals("") && txtFF1.getText().equals("") && txtFF2.getText().equals("")  
            && !jcbActiva.isSelected() && !jcbCancelado.isSelected() && !jcbNota.isSelected() && !jcbAceptado.isSelected() && !jcbRechazo.isSelected() && !jcbPendiente.isSelected()) && !jcbtol.isSelected() && !jcbtd.isSelected() && !jcbrct.isSelected())){
            query="SELECT * FROM VTBL_ACUSES_810 ORDER BY FCH_CREA ASC";
            sqledek();
        }        
    }
    
    JLabel a,b,c,d,e;
    public void sqledek(){
        String sa="";
        String esa="";
        String st="";
        String est="";
        String n="";
        String en="";
        String s="";
        String es="";
        String ss="";
        String ess="";
         
        jbtacuses810.setDefaultRenderer(Object.class, new ImgTable());
        String [] Reg=new String[21];      
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(query);
                while (rs1.next()) {
                    Reg[0]=rs1.getString("ID");
                    Reg[1]=rs1.getString("PROVEEDOR");
                    Reg[2]=rs1.getString("SERIE");
                    Reg[3]=rs1.getString("FOLIO");
                    Reg[4]=rs1.getString("UUID");
                    Reg[5]=rs1.getString("FCH_CREA");
                    Reg[6]=rs1.getString("fch");
                    Reg[7]=rs1.getString("HORA");
                    Reg[8]=rs1.getString("CODIGO");
                    Reg[9]=rs1.getString("OBSERVACION");
//                    Reg[10]=rs1.getString("ESTADO");
//                    Reg[11]=rs1.getString("statustal");
//                    Reg[12]=rs1.getString("nota");
                    Reg[13]=rs1.getString("folio_nota");
                    Reg[14]=rs1.getString("cartaporte");
                    Reg[15]=rs1.getString("bol810");
//                    Reg[16]=rs1.getString("statustar");
//                    Reg[17]=rs1.getString("categoriast");
                    Reg[18]=rs1.getString("FECHA");
                    
                    sa=rs1.getString("ESTADO");
                    esa=sa;
                    if(esa == null || esa.equals("")){
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
                    }else if(esa.equals("ACEPTADO")){
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
                    }else if(esa.equals("RECHAZADO")){
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));                        
                    }
                    
                    st=rs1.getString("statustal");
                    est=st;
                    if(est == null || est.equals("")){
                        b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
                    }else if(est.equals("ACTIVO")){
                        b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
                    }else if(est.equals("CANCELADO")){
                        b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));                        
                    }
                    
                    n=rs1.getString("nota");
                    en=n;
                    if(en == null || en.equals("")){
                        c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
                    }else if(en.equals("APLICADA")){
                        c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
                    }
                    
                    s=rs1.getString("statustar");
                    es=s;
                    if(es == null || es.equals("")){
                        d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
                    }else if(es.equals("APLICADO")){
                        d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
                    }else if(es.equals("CANCELADO")){
                        d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));                        
                    }
                    
                    ss=rs1.getString("categoriast");
                    ess=ss;
                    if(ess == null || ess.equals("")){
                        e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
                    }else{
                        if (null == ess){
                            e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));
                        }else switch (ess) {
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
                    tm.addRow(new Object[]{Reg[0],Reg[1],Reg[2],Reg[3],Reg[4],Reg[5],Reg[6],Reg[7],Reg[8],Reg[9],a,b,c,Reg[13],Reg[14],Reg[15],d,e,Reg[18]});                   

                }//while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } jbtacuses810.setModel(tm);        
    }

    public void LimpiarJtbl(){
        DefaultTableModel model=(DefaultTableModel) jbtacuses810.getModel();
    	for (int i=0; i<jbtacuses810.getRowCount(); i++){
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
            FilaSeleccionada = jbtacuses810.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "Seleccione un registro","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }else{
                DefaultTableModel model=(DefaultTableModel)jbtacuses810.getModel();
                doc =(String)model.getValueAt(FilaSeleccionada,1);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    String t1,t2,t3,t4,t5,t6,t7,t8,doc,detalle;    
    public void BajarArchivo() throws IOException {
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
                        detalle="<?xml version=\"1.0"+"\""+" "+"encoding=\"UTF-8"+"\""+" "+"?>\r"+"\n" +
                "<acuseRecibo>\r" +"\n" +
                "<ruta destinatario=\"54930\" remitente=\"0000000100\"/>\r" +"\n" +
                "<documento UUID=\""+t1+"\""+" "+"folioFiscal=\""+t2+"\""+" "+"serie=\""+t3+"\""+" "+"referenciaProveedor=\""+t4+"/>\r" +"\n" +
                "<recepcion estatus=\""+t5+"\""+" "+"fechahora=\""+t6.substring(0,10)+"T"+t7+"/>\r" +"\n" +
                "</acuseRecibo>";
                    }else{
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
                JOptionPane.showMessageDialog(null, "El archivo no existe en la ruta C:Edi810","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }             
        }else{
           JOptionPane.showMessageDialog(null, "Ingrese un nombre de archivo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE); 
        }                 
    }
       
    public void Reconstruir() throws IOException{
        File dir= new File("C:\\Edi810/");
         if(dir.exists()){
            String ruta = "C:\\Edi810/"+txtFolio.getText().replaceAll(".xml", "")+".xml".trim();
            File txtarch = new File(ruta);
            BufferedWriter bw;
            if(txtarch.exists()){                
                JOptionPane.showMessageDialog(this, "Archivo existente","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }else{
                bw = new BufferedWriter(new FileWriter(txtarch));
                bw.write(detalle);
    		bw.close();
    		JOptionPane.showMessageDialog(this,"Archivo Descargado en C:Edi810","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }
         }else{
            dir.mkdir();
            String ruta = "C:\\Edi810/"+t2+".xml".trim();
            File txtarch = new File(ruta);
            BufferedWriter bw;
            if(txtarch.exists()){
                JOptionPane.showMessageDialog(this, "Archivo ya existente","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }else{
                bw = new BufferedWriter(new FileWriter(txtarch));
                bw.write(detalle);
    		bw.close();
    		JOptionPane.showMessageDialog(this,"Archivo Descargado","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }
         }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JTable jbtacuses810;
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