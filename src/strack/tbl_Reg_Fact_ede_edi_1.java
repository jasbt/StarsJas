package strack;

import Clases.ConexionEDI;
import java.io.File;
import Clases.ExportarStars;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class tbl_Reg_Fact_ede_edi_1 extends javax.swing.JFrame {

    DefaultTableModel tm=new DefaultTableModel();
    private void PropiedadesTabla(){
        jbtlcobranza.setDefaultRenderer(Object.class, new ImgTable());
        String titulos []={"Servicio","Factura","Status talon","Tipo talon","Status 810","Fecha de factura","Monto del flete", "Total", "Stars", "Status Stars", "Status de cobro", "997", "track ID", "Fecha de emision", "Código de error", "Categoria", "Referencia", "Código","Planta", "Caja","Carta porte","Feha de stars","Evidencia","Fecha de evidencia","Nota de credito","Recepción de evidencias","Tipo de evidencia","Usuario"};
        tm=new DefaultTableModel(null,titulos);
        jbtlcobranza.setModel(tm);
    }
    
    public tbl_Reg_Fact_ede_edi_1() {
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jbtlcobranza = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCF = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtFact1 = new javax.swing.JTextField();
        txtFact2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtF2 = new javax.swing.JTextField();
        jtbQuery = new javax.swing.JButton();
        txtF1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jorden = new javax.swing.JCheckBox();
        jespecial = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jactiva = new javax.swing.JCheckBox();
        jCancel = new javax.swing.JCheckBox();
        jnota = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtCarta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jStars = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jcategoria = new javax.swing.JCheckBox();
        txtBOL = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transacción 210(Cobranza).");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información de Facturas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jbtlcobranza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. ", "Factura", "Status Talon", "Tipo Talon ", "Status 810", "Fecha Talon", "Monto de Flete", "Total", "Stars", "Status (Stars)", "Archivo 210", "Fecha 210", "Error", "Categoria", "Referencia", "Código ", "Planta", "Caja", "Cartaporte", "Fecha Stars", "Remisión(bol)", "Fecha de Bol", "Nota de Credito", "Recep. Doctos", "Ref. Evidencia", "Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jbtlcobranza.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jbtlcobranza.getTableHeader().setReorderingAllowed(false);
        jbtlcobranza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtlcobranzaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jbtlcobranza);
        if (jbtlcobranza.getColumnModel().getColumnCount() > 0) {
            jbtlcobranza.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel3.setText("Factura:");

        txtCF.setEditable(false);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        jButton6.setToolTipText("Nuevo Archivo 210");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton7.setToolTipText("Editar Archivo 210");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/signos-1.png"))); // NOI18N
        jButton2.setToolTipText("Re-crear Archivo 210");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/005-gps.png"))); // NOI18N
        jButton8.setToolTipText("Crear 210 con Stars");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("Detalles:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Factura(bol):");

        txtFecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFecha1MouseClicked(evt);
            }
        });

        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("         210:");

        txtFact1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFact1ActionPerformed(evt);
            }
        });

        txtFact2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFact2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Folio:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Fechas:");

        txtF2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF2MouseClicked(evt);
            }
        });

        jtbQuery.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jtbQuery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jtbQuery.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbQueryActionPerformed(evt);
            }
        });

        txtF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtF1MouseClicked(evt);
            }
        });
        txtF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtF1ActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Factura"));

        jorden.setText("Orden");
        jorden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jordenActionPerformed(evt);
            }
        });

        jespecial.setText("Especial");
        jespecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jespecialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jespecial))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jorden)
                .addComponent(jespecial))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Status Factura"));

        jactiva.setText("Activa");
        jactiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jactivaActionPerformed(evt);
            }
        });

        jCancel.setText("Cancelado");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        jnota.setText("Nota");
        jnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jactiva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jnota))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jactiva)
                .addComponent(jCancel)
                .addComponent(jnota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Cartaporte:");

        txtCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCartaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 0, 0));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Stars"));

        jStars.setText("Stars");
        jStars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStarsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jStars)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jStars, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Status 210"));

        jcategoria.setText("Error");
        jcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jcategoria)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jcategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtBOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBOLActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Referencia 997"));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/e1.png"))); // NOI18N
        jButton9.setToolTipText("Faltante");
        jButton9.setBorder(null);
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptado997.png"))); // NOI18N
        jButton10.setToolTipText("Aceptado");
        jButton10.setBorder(null);
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/e.png"))); // NOI18N
        jButton11.setToolTipText("Aceptado con error");
        jButton11.setBorder(null);
        jButton11.setBorderPainted(false);
        jButton11.setContentAreaFilled(false);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/error997.png"))); // NOI18N
        jButton12.setToolTipText("Rechazado");
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/arc997.png"))); // NOI18N
        jButton13.setToolTipText("Decargar 997");
        jButton13.setBorder(null);
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Fecha de ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Serv."));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ruta.png"))); // NOI18N
        jButton14.setToolTipText("Ruta completa.");
        jButton14.setBorder(null);
        jButton14.setBorderPainted(false);
        jButton14.setContentAreaFilled(false);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/tonu.png"))); // NOI18N
        jButton15.setToolTipText("Cancelacion o retiro.");
        jButton15.setBorder(null);
        jButton15.setBorderPainted(false);
        jButton15.setContentAreaFilled(false);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton15)
            .addComponent(jButton14)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(1, 1, 1)
                                .addComponent(txtCF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFact2, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                                    .addComponent(txtFact1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtF1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCarta, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBOL, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFecha1)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtbQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtCF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtBOL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(txtCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(11, 11, 11)
                            .addComponent(jLabel5))
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtbQuery, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(16, 16, 16)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Transacción 210 (Cobranza)");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
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
                .addContainerGap(1242, Short.MAX_VALUE))
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
        if (jbtlcobranza.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(jbtlcobranza);
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
        cleartbl();
        txtCF.setText("");
        txtFact2.setText("");
        txtFact1.setText("");
        txtBOL.setText("");
        jorden.setSelected(false);
        jespecial.setSelected(false);
        jactiva.setSelected(false);
        jCancel.setSelected(false);
        jnota.setSelected(false);
        jStars.setSelected(false);
        jcategoria.setSelected(false);
        txtF1.setText("");
        txtF2.setText("");
        txtCarta.setText("");
        jLabel9.setText("");
        txtFecha1.setText("");
        txtFecha.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            exitForm(evt);       
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    
    private void jbtlcobranzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtlcobranzaMouseClicked
        try {
            SelecionaRegistro() ;
        } catch (IOException ex) {
            Logger.getLogger(tbl_Reg_Fact_ede_edi_1.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jbtlcobranzaMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!txtCF.getText().equals("")){
            usercbzR();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una factura para proceso de cobranza","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_jButton6ActionPerformed
    
    String  fac210,ter210,folio210,FCH_CREA,VAL_IVA, VAL_RIVA, VAL_TOTAL,TOTAL_TOTAL,TALON_PREFIJO,TALON_FOLIO,caja,campo_ref1,notac,campo_ref3,cartaportestars,fch210bol1,fch210bol,id;
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!txtCF.getText().equals("")){
            usercbzE();        
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una factura para proceso de cobranza","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }                 
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!txtCF.getText().equals("")){
            FechaSit();
            usercbzCR();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una factura para proceso de cobranza","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(!txtCF.getText().equals("")){
            usercbzRstar();
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una factura para proceso de cobranza","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        } 
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jtbQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbQueryActionPerformed
        consulta2();
    }//GEN-LAST:event_jtbQueryActionPerformed

    private void txtFact2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFact2ActionPerformed
    }//GEN-LAST:event_txtFact2ActionPerformed

    private void jordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jordenActionPerformed
    }//GEN-LAST:event_jordenActionPerformed

    private void jespecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jespecialActionPerformed
    }//GEN-LAST:event_jespecialActionPerformed

    private void jactivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jactivaActionPerformed

    }//GEN-LAST:event_jactivaActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
    }//GEN-LAST:event_jCancelActionPerformed

    private void txtFact1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFact1ActionPerformed
        talon();
    }//GEN-LAST:event_txtFact1ActionPerformed

    private void txtCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCartaActionPerformed
        cartaporte();
    }//GEN-LAST:event_txtCartaActionPerformed

    private void jnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnotaActionPerformed
    }//GEN-LAST:event_jnotaActionPerformed

    private void jStarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStarsActionPerformed
    }//GEN-LAST:event_jStarsActionPerformed

    private void jcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcategoriaActionPerformed
    }//GEN-LAST:event_jcategoriaActionPerformed

    private void txtBOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBOLActionPerformed
        bol();
    }//GEN-LAST:event_txtBOLActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cleartbl();
        query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and (EDO_997 IS NULL or EDO_997='')  order by FCH_CREA";            
            sql210(); 
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        cleartbl();
        query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and EDO_997 ='A' order by FCH_CREA";            
            sql210();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        cleartbl();
        query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and EDO_997 ='E' order by FCH_CREA";            
            sql210();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        cleartbl();
        query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and EDO_997 ='R' order by FCH_CREA";            
            sql210();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(!txtCF.getText().equals("")){
            try {
                Descarga();
            } catch (IOException ex) {
                Logger.getLogger(tbl_Reg_Fact_ede_edi_1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            JOptionPane.showMessageDialog(null, "Seleccione una factura para proceso de cobranza","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        cleartbl();
        if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && ( !txtF1.getText().equals("") && !txtF2.getText().equals("")) && txtBOL.getText().equals("") 
        && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) 
        && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where FCH_CREA BETWEEN convert(datetime,'"+ txtF1.getText() +" 00:00:00.000') and convert(datetime,' "+ txtF2.getText()+" 23:59:00.000') and  campo_ref5 !='tonu' order by FCH_CREA";          
            sql210();
        } else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") 
        && (!txtFecha.getText().equals("") && !txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) 
        && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and  campo_ref5 !='tonu' order by FCH_CREA";          
            sql210();            
        }        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        cleartbl();
        if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && ( !txtF1.getText().equals("") && !txtF2.getText().equals("")) && txtBOL.getText().equals("") 
        && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) 
        && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where FCH_CREA BETWEEN convert(datetime,'"+ txtF1.getText() +" 00:00:00.000') and convert(datetime,' "+ txtF2.getText()+" 23:59:00.000') and  campo_ref5 ='tonu' order by FCH_CREA";          
            sql210();  
        } else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") 
        && (!txtFecha.getText().equals("") && !txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) 
        && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and  campo_ref5 ='tonu' order by FCH_CREA";          
            sql210();             
        }                
    }//GEN-LAST:event_jButton15ActionPerformed

    private void txtF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtF1ActionPerformed
       
    }//GEN-LAST:event_txtF1ActionPerformed

    private void txtF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF1MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtF1.setText(datefecha.format(date));        
    }//GEN-LAST:event_txtF1MouseClicked

    private void txtF2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtF2MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtF2.setText(datefecha.format(date));      
    }//GEN-LAST:event_txtF2MouseClicked

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtFecha.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtFechaMouseClicked

    private void txtFecha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFecha1MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtFecha1.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtFecha1MouseClicked
     
    String statusCF,arh210,arhCPO,arch214,stars,nota,error,st997 ;
    public void SelecionaRegistro() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = jbtlcobranza.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
            }else{
                DefaultTableModel model=(DefaultTableModel)jbtlcobranza.getModel();
                String ter =(String)model.getValueAt(FilaSeleccionada,1);
                error =(String)model.getValueAt(FilaSeleccionada,14);
                descp();
                txtCF.setText(ter);
                st997=(String)model.getValueAt(FilaSeleccionada,12);
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error, vuelva a intentarlo","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void descp(){
        jLabel9.setText("");
        if(error==null){
        }else{
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            try {
               Statement statement =(Statement)miConexion.createStatement();
                ResultSet rs1 = statement.executeQuery("select * from TBL_CODERROR where code_error='"+error+"' ");
                    if(rs1.next() == true){
                        jLabel9.setText(rs1.getString("descripcion"));
                    }else {
                    }
            } catch (SQLException ex) {
                System.out.println("Error SQL Registro "+ex.getMessage());
            } 
        }        
    }
    
    public void talon(){
        cleartbl();
        query="SELECT * FROM VTBL_CONS_COBRANZA where TALON_FOLIO='"+ txtFact1.getText()+"' order by FCH_CREA"; 
        sql210();       
    }
    
    public void cartaporte(){
        cleartbl();
        query="SELECT * FROM VTBL_CONS_COBRANZA where  cartaporte='"+ txtCarta.getText()+"'  order by FCH_CREA"; 
        sql210();        
    }
    
    public void cleartbl(){
        DefaultTableModel model=(DefaultTableModel) jbtlcobranza.getModel();
    	for (int i=0; i<jbtlcobranza.getRowCount(); i++){
    		model.removeRow(i);
    		i-=1;
    	}
    }
    
    String fcreacion;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fcreacion=datefecha.format(date);   
    }
    
    public void queryFolio(){
        cleartbl();
        query="SELECT * FROM VTBL_CONS_FACTURACION210 where talon_folio='"+txtFact2.getText()+"' order by id";
        sql210();            
    }
    
    public void bol(){
        cleartbl();
        if((!txtBOL.getText().equals(""))){
            query="SELECT * FROM VTBL_CONS_COBRANZA where bolfactura='"+txtBOL.getText()+"' order by fch_crea";
            sql210();
        }else{
            JOptionPane.showMessageDialog(null, "No se cuenta con datos","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    String query;
    public void consulta2(){ 
        cleartbl();
        if( (!txtFact1.getText().equals("")) && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="SELECT * FROM VTBL_CONS_COBRANZA where TALON_FOLIO='"+ txtFact1.getText()+"' order by FCH_CREA"; 
            sql210();
        }else if( (!txtFact1.getText().equals("")) && (!txtFact2.getText().equals("")) && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="SELECT * FROM VTBL_CONS_COBRANZA where TALON_FOLIO between "+ txtFact1.getText() +" and "+ txtFact2.getText()+" order by FCH_CREA"; 
            sql210();           
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && (!txtBOL.getText().equals("")) && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="SELECT * FROM VTBL_CONS_COBRANZA where  bolfactura='"+txtBOL.getText()+"' order by FCH_CREA"; 
            sql210();            
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && (!txtCarta.getText().equals("")) && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && (txtBOL.getText().equals("")) ){
            query="SELECT * FROM VTBL_CONS_COBRANZA where  cartaporte='"+ txtCarta.getText()+"'  order by FCH_CREA"; 
            sql210();            
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("") ){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between '" +txtF1.getText()+" 00:00:00.0' and '"+txtF2.getText()+" 23:53:28.0'  order by FCH_CREA";            
            sql210();       
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")) {
            query="select * FROM  VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') order by FCH_CREA";            
            sql210();
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and tipo_talon='orden' order by FCH_CREA";            
            sql210();      
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM  VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and tipo_talon='especial' order by FCH_CREA";            
            sql210();        
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (!jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM  VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and STATUS_TAL='activa' order by FCH_CREA";            
            sql210();        
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,'"+ txtFecha1.getText()+" 23:59:00.000') and STATUS_TAL='cancelado' order by FCH_CREA";            
            sql210();       
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and nota='aplicada' order by FCH_CREA";            
            sql210(); 
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM  VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and EDOSTARS='APLICADO' order by FCH_CREA";            
            sql210();          
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and categoria='IR' order by FCH_CREA";            
            sql210();        
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (jorden.isSelected())&& (!jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and tipo_talon='orden' and STATUS_TAL='activa' order by FCH_CREA";            
            sql210();         
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and tipo_talon='orden' and STATUS_TAL='cancelado' order by FCH_CREA";            
            sql210();           
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and tipo_talon='orden' and nota='aplicada' order by FCH_CREA";            
            sql210();            
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and tipo_talon='especial' and STATUS_TAL='activa' order by FCH_CREA";            
            sql210();           
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and tipo_talon='especial' and STATUS_TAL='cancelado' order by FCH_CREA";            
            sql210();              
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && (!txtFecha.getText().equals("")) && (!txtFecha1.getText().equals("")) && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where fecha210 BETWEEN convert(datetime,'"+ txtFecha.getText() +" 00:00:00.000') and convert(datetime,' "+ txtFecha1.getText()+" 23:59:00.000') and tipo_talon='especial' and nota='aplicada' order by FCH_CREA";            
            sql210();             
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and tipo_talon='orden' order by FCH_CREA"; 
            sql210();                     
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and tipo_talon='especial' order by FCH_CREA"; 
            sql210();          
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and STATUS_TAL='activa' order by FCH_CREA"; 
            sql210();                
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and STATUS_TAL='cancelado' order by FCH_CREA"; 
            sql210();
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and nota='APLICADA' order by FCH_CREA"; 
            sql210();                 
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and EDOSTARS='APLICADO' order by FCH_CREA"; 
            sql210();                 
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and categoria='ir' order by FCH_CREA"; 
            sql210();                  
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (jorden.isSelected())&& (!jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and tipo_talon='ORDEN' AND STATUS_TAL='ACTIVA'  order by FCH_CREA"; 
            sql210();       
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and tipo_talon='ORDEN' AND STATUS_TAL='Cancelado'  order by FCH_CREA"; 
            sql210();   
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and tipo_talon='ORDEN' AND nota='APLICADA' order by FCH_CREA"; 
            sql210(); 
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected())&& txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and tipo_talon='especial' and STATUS_TAL='activa' order by FCH_CREA"; 
            sql210();           
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and tipo_talon='especial' and STATUS_TAL='CANCELADO' order by FCH_CREA"; 
            sql210();            
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && (!txtF1.getText().equals("")) && (!txtF2.getText().equals("")) && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * from VTBL_CONS_COBRANZA where FCH_CREA between convert(datetime,'"+txtF1.getText()+" 00:00:00.0') and convert(datetime,' "+txtF2.getText()+" 23:53:00.000') and tipo_talon='especial' and NOTA='APLICADA' order by FCH_CREA"; 
            sql210();          
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where tipo_talon='orden' order by FCH_CREA";            
            sql210();                                    
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where tipo_talon='ESPECIAL' order by FCH_CREA";            
            sql210();        
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (jorden.isSelected())&& (!jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where tipo_talon='ORDEN' and status_tal='ACTIVA' order by FCH_CREA";            
            sql210();                           
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where tipo_talon='especial' and status_tal='ACTIVA' order by FCH_CREA";            
            sql210();                          
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where tipo_talon='orden' and status_tal='cancelado' order by FCH_CREA";            
            sql210();            
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where tipo_talon='ORDEN' and nota='APLICADA' order by FCH_CREA";            
            sql210();                   
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where tipo_talon='especial' and status_tal='cancelado' order by FCH_CREA";            
            sql210();               
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where tipo_talon='especial' and nota='APLICADA' order by FCH_CREA";            
            sql210();           
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where status_tal='activa' order by FCH_CREA";            
            sql210();           
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="select * FROM VTBL_CONS_COBRANZA where status_tal='cancelado' order by FCH_CREA";            
            sql210();            
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="SELECT * FROM VTBL_CONS_COBRANZA where nota='APLICADA' order by FCH_CREA";
            sql210();                        
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="SELECT * FROM VTBL_CONS_COBRANZA where EDOSTARS='APLICADO' order by FCH_CREA";
            sql210();           
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="SELECT * FROM VTBL_CONS_COBRANZA where categoria='IR' order by FCH_CREA";
            sql210();            
        }else if( txtFact1.getText().equals("") && txtFact2.getText().equals("") && txtF1.getText().equals("") && txtF2.getText().equals("") && txtBOL.getText().equals("") && txtFecha.getText().equals("") && txtFecha1.getText().equals("") && (!jorden.isSelected())&& (!jespecial.isSelected()) && (!jactiva.isSelected())&& (!jCancel.isSelected()) && (!jnota.isSelected()) && (!jStars.isSelected()) && (!jcategoria.isSelected()) && txtCarta.getText().equals("")){
            query="SELECT * FROM VTBL_CONS_COBRANZA order by FCH_CREA";
            sql210();            
        }
    }
    
    JLabel a,b,c,d,e,f,g,h,k;
    public void sql210(){
        cleartbl();
        String statustal="";
        String status_tal="";
        
        String status810="";
        String status_810="";
        
        String edostars="";
        String edo_stars="";
        
        String archivo210="";
        String archivo_210="";
        
        String categoria210="";
        String categoria_210="";
        
        String nota210="";
        String nota_210="";
        
        String tipoe="";
        String tipoe_210="";
        
        String edo997="";
        String edo_997="";
        
        String acuse997="";
        String acuse_997="";
        
        String ref5="";
        String campo_ref5="";
        
        jbtlcobranza.setDefaultRenderer(Object.class, new ImgTable());
        String [] Reg=new String[30];      
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(query);
                while (rs1.next()) {
                    //Reg[0]=rs1.getString("id").trim();//No.
                    Reg[1]=rs1.getString("factura");//Factura
                                                    //Status talo
                    Reg[3]=rs1.getString("tipo_talon");//Tipo talon
                                                        //Status 810
                    Reg[5]=rs1.getString("FCH_CREA").trim();//Fecha de factura                
                    Reg[6]=rs1.getString("MONTO_FLETE").trim();//Monto del flete 
                    Reg[7]=rs1.getString("VAL_TOTAL");//Total                   
                    Reg[8]=rs1.getString("cpst");//Stars
                                                //Status Stras
                                                //Status de cobro
                                                //997
                    Reg[12]=rs1.getString("acuse_997");//Relacion 997
                    Reg[13]=rs1.getString("prefecha");//Fecha de emision
                    Reg[14]=rs1.getString("error");//Código de error
                                                   //Categoria
                    Reg[16]=rs1.getString("campo_ref1").trim();//Referencia
                    Reg[17]=rs1.getString("campo_ref2").trim();//Código
                    Reg[18]=rs1.getString("campo_ref4").trim();//Planta
                    Reg[19]=rs1.getString("caja");//Caja
                    Reg[20]=rs1.getString("CARTAPORTE");//Carta porte
                    Reg[21]=rs1.getString("fechacarta");//Feha de stars
                    Reg[22]=rs1.getString("bolFactura");//Evidencia
                    Reg[23]=rs1.getString("fchbol");//Fecha de evidencia
                                                //Nota de credito
                    Reg[25]=rs1.getString("erd");//Recepción de evidencias
                                                //Tipo de evidencia
                    Reg[27]=rs1.getString("usuario"); //Usuario
                    
                    statustal=rs1.getString("status_tal").trim();
                    status_tal=statustal;
                    if(status_tal==null|| status_tal.equals("")){
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\rueda-dentada.png"));                        
                    }else{
                        if(status_tal=="Activa"||status_tal.equals("Activa")){
                            a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\ok.png"));                        
                        }else if(status_tal=="Cancelado"||status_tal.equals("Cancelado")){
                            a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\stal.png"));                        
                        }
                    }
                    
                    status810=rs1.getString("ST810");
                    status_810=status810;
                    if(status_810==null|| status_810.equals("")){
                        b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\rueda-dentada.png"));                        
                    }else{
                        if(status_810=="ACEPTADO"||status_810.equals("ACEPTADO")){
                            b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\Correcto_IA.png"));                        
                        }else if(status_810=="RECHAZADO"||status_810.equals("RECHAZADO")){
                            b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\stal.png"));                        
                        }
                    }
                    
                    edostars=rs1.getString("EDOSTARS");
                    edo_stars=edostars;
                    if(edo_stars==null|| edo_stars.equals("")){
                        c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\rueda-dentada.png"));                        
                    }else{
                        if(edo_stars=="APLICADO"||edo_stars.equals("APLICADO")){
                            c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
                        }else if(edo_stars=="TONU"||edo_stars.equals("TONU")){
                            c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\ok.png"));                        
                        }else if(edo_stars=="NO REGISTRADO"||edo_stars.equals("NO REGISTRADO")){
                            c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\stal.png"));                        
                        }
                    }
                    
                    archivo210=rs1.getString("Archivo210");
                    archivo_210=archivo210;
                    categoria210=rs1.getString("categoria");
                    categoria_210=categoria210;
                    
                    if(archivo_210==null|| archivo_210.equals("")){
                        d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));   
                        e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\rueda-dentada.png"));                        
                    }else{
                        d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png")); 
                        if(categoria_210==null || categoria_210.equals("")){
                            e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));  
                        }else{
                            e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));                        
                        }  
                    }
                    
                    nota210=rs1.getString("nota");
                    nota_210=nota210;
                    if(nota_210==null|| nota_210.equals("")){
                        f=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));   
                    }else{
                        f=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                          
                    }
                    
                    tipoe=rs1.getString("serd");
                    tipoe_210=tipoe;
                    if(tipoe_210==null|| tipoe_210.equals("")){
                        g=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));   
                    }else if(tipoe_210=="NORMAL"|| tipoe_210.equals("NORMAL")){
                        g=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                          
                    }else if(tipoe_210=="CODIGO"|| tipoe_210.equals("CODIGO")){
                        g=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\ok.png"));                          
                    }
                    
                    /*997*/
                    edo997=rs1.getString("edo_997");
                    edo_997=edo997;
                    if(edo_997==null|| edo_997.equals("")){
                        h=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\e1.png"));   
                    }else if(edo_997==null|| edo_997.equals("A")){
                        h=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\aceptado997.png"));   
                    }else if(edo_997==null|| edo_997.equals("E")){
                        h=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\e.png"));   
                    }else if(edo_997==null|| edo_997.equals("R")){
                        h=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\error997.png"));   
                    }                 
//                    acuse997=rs1.getString("acuse_997");
//                    acuse_997=acuse997;
//                    if(acuse_997==null || acuse_997.equals("")){
//                        k=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));   
//                    }else{
//                        k=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                          
//                    }

                    /*campo_ref5*/
                    ref5=rs1.getString("campo_ref5");
                    campo_ref5=ref5;
                    if(campo_ref5=="TONU" || campo_ref5.equals("TONU")){
                        k=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\tonu.png"));   
                    }else if(campo_ref5 !="TONU" || !campo_ref5.equals("TONU") || campo_ref5.equals("null") || campo_ref5==null){
                        k=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\ruta.png"));   
                    } 
                    //tm.addRow(new Object[]{Reg[0],Reg[1],a,Reg[3],b,Reg[5],Reg[6],Reg[7],Reg[8],c,d,Reg[11],Reg[12],e,Reg[14],Reg[15],Reg[16],Reg[17],Reg[18],Reg[19],Reg[20],Reg[21],f,Reg[23],g,Reg[25]});                   
                    tm.addRow(new Object[]{k,Reg[1],a,Reg[3],b,Reg[5],Reg[6],Reg[7],Reg[8],c,d,h,Reg[12],Reg[13],Reg[14],e,Reg[16],Reg[17],Reg[18],Reg[19],Reg[20],Reg[21],Reg[22],Reg[23],f,Reg[25],g,Reg[27]});                   
                                           
                }//while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } jbtlcobranza.setModel(tm);
    }   
    
    public void Descarga() throws IOException{
        int st= Integer.parseInt(st997); 
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from tbl_relacion_997 where st='"+st+"'");
                if(rs1.next() == true){
                    String datos=rs1.getString("edi");
                    File dir= new File("C:\\Edi810/");
                    if(dir.exists()){
                       String ruta = "C:\\Edi997/"+st997+".edi".trim();
                       File txtarch = new File(ruta);
                       BufferedWriter bw;
                       if(txtarch.exists()){                
                           JOptionPane.showMessageDialog(this, "Archivo existente");
                       }else{
                           bw = new BufferedWriter(new FileWriter(txtarch));
                           bw.write(datos);
                           bw.close();
                           JOptionPane.showMessageDialog(null, "Arcivo descargado","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                       }
                    }else{
                       dir.mkdir();
                       String ruta = "C:\\Edi997/"+st997+".edi".trim();
                       File txtarch = new File(ruta);
                       BufferedWriter bw;
                       if(txtarch.exists()){
                           JOptionPane.showMessageDialog(this, "Archivo ya existente");
                       }else{
                           bw = new BufferedWriter(new FileWriter(txtarch));
                           bw.write(datos);
                           bw.close();
                           JOptionPane.showMessageDialog(null, "Archivo descargado","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                       }
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"El dato seleccionado no existe","Mnesajde informativo", JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    
    /* Crear 210 sin stars */
    public void usercbzR(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND edi210r='1'");
                if(rs1.next() == true){
                    ValidaRegistrado();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario" ,"Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void ValidaRegistrado(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from VTBL_CONS_COBRANZA where FACTURA='"+txtCF.getText()+"'and Archivo210='CREADO'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El proceso de cobranza ya se ha registrado","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    ValidaCrear();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String cpor;
    public void ValidaCrear(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from VTBL_CONS_COBRANZA where archivo210 is null and STATUS_TAL='activa' AND nota is null and ST810='ACEPTADO' and (EDOSTARS is null or EDOSTARS ='NO REGISTRADO' or EDOSTARS ='TONU') and FACTURA='"+txtCF.getText()+"'");
                if(rs1.next() == true){
                    Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                    try {
                       Statement statement1 =(Statement)miConexion1.createStatement();
                       ResultSet rs = statement1.executeQuery("select * from VTBL_FACTURA210 where FACTURA='"+txtCF.getText()+"'and Archivo210 is NULL ");
                            if(rs.next() == true){
                                Registro210 reg210=new Registro210();
                                reg210.txtFactura.setText(txtCF.getText()); 
                                reg210.txtTer.setText(rs.getString("talon_prefijo").trim());
                                reg210.txtFolio.setText(rs.getString("talon_folio").trim());
                                reg210.txtFchTalon.setText(rs.getString("fch_crea").trim());
                                reg210.txtStatus.setText(rs.getString("STATUS_TAL").trim());
                                reg210.txtRef.setText(rs.getString("campo_ref1").trim());
                                reg210.txtCodigo.setText(rs.getString("campo_ref2").trim());
                                reg210.txtPlanta.setText(rs.getString("campo_ref4").trim());
                                reg210.txtSubtotal.setText(rs.getString("MONTO_FLETE").trim());
                                reg210.txtIva.setText(rs.getString("val_iva").trim());
                                reg210.txtRetencion.setText(rs.getString("val_riva").trim());
                                reg210.txtTotal.setText(rs.getString("val_total").trim());
                                reg210.txtCaja.setText(rs.getString("caja")); 
                                reg210.txtFchbol.setText(rs.getString("campo_ref3")); 
                                if (!rs.getString("caja").equals("")){
                                    reg210.txtCaja.setText(rs.getString("caja").trim());
                                }
                                cpor=rs.getString("campo_ref1").trim().replace("CPO","");                               
                                Connection miConexionc =(Connection)ConexionEDI.GetConnection();
                                try {
                                   Statement statementc =(Statement)miConexionc.createStatement();
                                   ResultSet rsc = statementc.executeQuery("select * from TBL_Reg_CPO where CPO ='"+cpor+"' and estado ='activo' and TIPO='op'");
                                        if(rsc.next() == true){
                                            reg210.txtRemitente.setText(rsc.getString("nom_origen").trim()+","+rsc.getString("cod_origen").trim());
                                            reg210.txtDom1.setText(rsc.getString("dir_origen").trim()+","+rsc.getString("cd_origen").trim()+","+rsc.getString("ccd_origen").trim()+","+rsc.getString("cp_origen").trim()+",MX");
                                            reg210.txtDestinatario.setText(rsc.getString("nom_destino").trim()+","+rsc.getString("cod_destino").trim());
                                            reg210.txtDom2.setText(rsc.getString("dir_destino").trim()+","+rsc.getString("cd_destino").trim()+","+rsc.getString("ccd_destino").trim()+","+rsc.getString("cp_destino").trim()+",MX");   
                                            reg210.txtCenc1.setText(rsc.getString("nom_ccosto").trim()+","+rsc.getString("cod_ccosto").trim());
                                            reg210.txtCenc2.setText(rsc.getString("dir_ccosto").trim()+","+rsc.getString("cd_ccosto").trim()+","+rsc.getString("ccd_ccosto").trim()+","+rsc.getString("cp_ccosto").trim()+",MX");      
                                            reg210.txtCarga.setText(rsc.getString("tipocarga").trim());
                                            reg210.txtPeso.setText(rsc.getString("peso").trim());   
                                            reg210.txtUserf1.setText(lblUserVF.getText());
                                            reg210.setVisible(true);
                                        }else {
                                            JOptionPane.showMessageDialog(null, "No hay registro de la CPO o se encuentra Cancelada","Mensajde informativo",JOptionPane.INFORMATION_MESSAGE);
                                        }
                                } catch (HeadlessException | SQLException ex) {
                                    JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
                                }                                  
                            }else {
                                JOptionPane.showMessageDialog(null, "Ya se a generado una transacción para la factura","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                            }
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
                    }                                               
                }else {
                    JOptionPane.showMessageDialog(null, "El proceso de cobranza no se puede realizar", "Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);                     
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void usercbzE(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND edi210e='1'");
                if(rs1.next() == true){
                    Connection editar =(Connection)ConexionEDI.GetConnection();
                    try {
                       Statement steditar =(Statement)miConexion.createStatement();
                        ResultSet reditar = steditar.executeQuery("select * from v_configuracion where clave='C001' and edo='1'");
                            if(reditar.next() == true){ 
                            Connection miVerificacion =(Connection)ConexionEDI.GetConnection();
                            try {
                               Statement stv =(Statement)miVerificacion.createStatement();
                                ResultSet rv = stv.executeQuery("select * from tbl_factura210 where  fecha210 < DATEADD(day,-1,GETDATE()) and factura='"+txtCF.getText()+"'");
                                    if(rv.next() == true){  
                                        editarNota();
                                    }else{ 
                                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar. ","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                                    }
                            } catch (HeadlessException | SQLException ex) {
                                JOptionPane.showMessageDialog(null,"Error en la conexión, intente nuevamente.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
                            }                       
                            }else{ 
                                editarNota();
                            }
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Error en la conexión, intente nuevamente.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
                    }          
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información."+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String cpore;
    public void editarNota(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement1 =(Statement)miConexion1.createStatement();
            ResultSet rs1 = statement1.executeQuery("select * from VTBL_CONS_COBRANZA where archivo210='creado' and STATUS_TAL='activa' AND Nota is null and categoria ='ir' and ST810='ACEPTADO' and factura='"+txtCF.getText()+"'");
                if(rs1.next() == true){
                        Editar210 edt210=new Editar210();
                        edt210.txtFactura.setText(txtCF.getText());
                        Connection miConexion =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statement =(Statement)miConexion.createStatement();
                           ResultSet rs = statement.executeQuery("select * from VTBL_FACTURA210 where FACTURA='"+txtCF.getText()+"'and Archivo210='CREADO' ");
                                if(rs.next() == true){
                                    edt210.txtTer.setText(rs1.getString("talon_prefijo").trim());
                                    edt210.txtFolio.setText(rs1.getString("talon_folio").trim());
                                    edt210.txtFchTalon.setText(rs1.getString("fch_crea").trim());
                                    edt210.txtStatus.setText(rs1.getString("STATUS_TAL").trim());
                                    edt210.txtRef.setText(rs1.getString("campo_ref1").trim());
                                    edt210.txtCodigo.setText(rs1.getString("campo_ref2").trim());
                                    edt210.txtPlanta.setText(rs1.getString("campo_ref4").trim());
                                    edt210.txtSubtotal.setText(rs1.getString("MONTO_FLETE").trim());
                                    edt210.txtIva.setText(rs1.getString("val_iva").trim());
                                    edt210.txtRetencion.setText(rs1.getString("val_riva").trim());
                                    edt210.txtTotal.setText(rs1.getString("val_total").trim());
                                    edt210.txtCaja.setText(rs1.getString("caja").trim());
                                    edt210.txtBol.setText(rs1.getString("bolfactura"));
                                    edt210.txtStars.setText(rs1.getString("cartaporte"));
                                    edt210.txtFchStars.setText(rs1.getString("fechacarta"));
                                    edt210.txtFchbol.setText(rs1.getString("fchbol"));
                                    cpore=rs.getString("campo_ref1").trim().replace("CPO",""); 
                                    Connection miConexionc =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementc =(Statement)miConexionc.createStatement();
                                       ResultSet rsc = statementc.executeQuery("select * from TBL_Reg_CPO where CPO ='"+cpore+"' and estado ='activo' and TIPO='op'");
                                            if(rsc.next() == true){
                                                edt210.txtRemitente.setText(rsc.getString("nom_origen").trim()+","+rsc.getString("cod_origen").trim());
                                                edt210.txtDom1.setText(rsc.getString("dir_origen").trim()+","+rsc.getString("cd_origen").trim()+","+rsc.getString("ccd_origen").trim()+","+rsc.getString("cp_origen").trim()+",MX");
                                                edt210.txtDestinatario.setText(rsc.getString("nom_destino").trim()+","+rsc.getString("cod_destino").trim());
                                                edt210.txtDom2.setText(rsc.getString("dir_destino").trim()+","+rsc.getString("cd_destino").trim()+","+rsc.getString("ccd_destino").trim()+","+rsc.getString("cp_destino").trim()+",MX");   
                                                edt210.txtCenc1.setText(rsc.getString("nom_ccosto").trim()+","+rsc.getString("cod_ccosto").trim());
                                                edt210.txtCenc2.setText(rsc.getString("dir_ccosto").trim()+","+rsc.getString("cd_ccosto").trim()+","+rsc.getString("ccd_ccosto").trim()+","+rsc.getString("cp_ccosto").trim()+",MX");      
                                                edt210.txtCarga.setText(rsc.getString("tipocarga").trim());
                                                String observacion=rs1.getString("bolfactura")+","+rs1.getString("fchbol")+","+rs1.getString("cartaporte")+","+rs1.getString("fechacarta")+","+rs1.getString("caja")+","+rs1.getString("fecha210");
                                                edt210.txtPeso.setText(rsc.getString("peso").trim());                       
                                            }else {
                                                JOptionPane.showMessageDialog(null, "No hay registro de la CPO o se encuentra Cancelada","Mensajde informativo",JOptionPane.INFORMATION_MESSAGE);
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
                                    }                                  
                                }else {
                                    JOptionPane.showMessageDialog(null, "Ya se ha registrato el proceso de cobro","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error al acceder a la información  "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
                        } 
                        edt210.txtUserf1.setText(lblUserVF.getText());
                        edt210.setVisible(true);                     
                }else {
                        int i =JOptionPane.showConfirmDialog(this, "Procesar transacción sin presentar error para la factura :"+"\n"+" '"+txtCF.getText()+"'  ? ",
                        "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if(i == 0){
                        Connection miConexione =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statemente =(Statement)miConexione.createStatement();
                           ResultSet rse = statemente.executeQuery("select * from VTBL_FACTURA210 where FACTURA='"+txtCF.getText()+"' and Archivo210='CREADO' and STATUS_TAL='activa'");
                                if(rse.next() == true){
                                    Editar210 edt210=new Editar210();
                                    edt210.txtFactura.setText(txtCF.getText());
                                    edt210.txtTer.setText(rse.getString("talon_prefijo").trim());
                                    edt210.txtFolio.setText(rse.getString("talon_folio").trim());
                                    edt210.txtFchTalon.setText(rse.getString("fch_crea").trim());
                                    edt210.txtStatus.setText(rse.getString("STATUS_TAL").trim());
                                    edt210.txtRef.setText(rse.getString("campo_ref1").trim());
                                    edt210.txtCodigo.setText(rse.getString("campo_ref2").trim());
                                    edt210.txtPlanta.setText(rse.getString("campo_ref4").trim());
                                    edt210.txtSubtotal.setText(rse.getString("MONTO_FLETE").trim());
                                    edt210.txtIva.setText(rse.getString("val_iva").trim());
                                    edt210.txtRetencion.setText(rse.getString("val_riva").trim());
                                    edt210.txtTotal.setText(rse.getString("val_total").trim());
                                    edt210.txtCaja.setText(rse.getString("caja").trim());
                                    edt210.txtBol.setText(rse.getString("bolfactura"));
                                    edt210.txtStars.setText(rse.getString("cartaporte"));
                                    edt210.txtFchStars.setText(rse.getString("fechacarta"));
                                    edt210.txtFchbol.setText(rse.getString("fchbol"));
                                    cpore=rse.getString("campo_ref1").trim().replace("CPO",""); 
                                    Connection miConexionce =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementce =(Statement)miConexionce.createStatement();
                                       ResultSet rsce = statementce.executeQuery("select * from TBL_Reg_CPO where CPO ='"+cpore+"' and estado ='activo' and TIPO='op'");
                                            if(rsce.next() == true){
                                                edt210.txtRemitente.setText(rsce.getString("nom_origen").trim()+","+rsce.getString("cod_origen").trim());
                                                edt210.txtDom1.setText(rsce.getString("dir_origen").trim()+","+rsce.getString("cd_origen").trim()+","+rsce.getString("ccd_origen").trim()+","+rsce.getString("cp_origen").trim()+",MX");
                                                edt210.txtDestinatario.setText(rsce.getString("nom_destino").trim()+","+rsce.getString("cod_destino").trim());
                                                edt210.txtDom2.setText(rsce.getString("dir_destino").trim()+","+rsce.getString("cd_destino").trim()+","+rsce.getString("ccd_destino").trim()+","+rsce.getString("cp_destino").trim()+",MX");   
                                                edt210.txtCenc1.setText(rsce.getString("nom_ccosto").trim()+","+rsce.getString("cod_ccosto").trim());
                                                edt210.txtCenc2.setText(rsce.getString("dir_ccosto").trim()+","+rsce.getString("cd_ccosto").trim()+","+rsce.getString("ccd_ccosto").trim()+","+rsce.getString("cp_ccosto").trim()+",MX");      
                                                edt210.txtCarga.setText(rsce.getString("tipocarga").trim());
                                                edt210.txtPeso.setText(rsce.getString("peso").trim());                       
                                            }else {
                                                JOptionPane.showMessageDialog(null, "No hay registro de la CPO o se encuentra Cancelada","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
                                    }  
                                    edt210.txtUserf1.setText(lblUserVF.getText());
                                    edt210.setVisible(true);
                                }else {
                                    JOptionPane.showMessageDialog(null, "La transacción no se puede procesar","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "Error al acceder a la información  "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
                        } 
                        }else if(i == 1){
                           JOptionPane.showMessageDialog(null, "El proceso de cobranza cancelado ","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);   
                        }
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void usercbzRstar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND strars210='1'");
                if(rs1.next() == true){
                    ValidaReg1();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensajde informativo", JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void ValidaReg1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from VTBL_CONS_COBRANZA where FACTURA='"+txtCF.getText()+"' and Archivo210='CREADO'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "El proceso de cobranza ya se ha registrado","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    ValidaCrear1();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String cpors,star;
    public void ValidaCrear1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from VTBL_CONS_COBRANZA where archivo210 is null and STATUS_TAL='activa' AND nota is null and ST810='ACEPTADO' and EDOSTARS ='APLICADO' AND FACTURA='"+txtCF.getText()+"'");
                if(rs1.next() == true){
                        Registro210_214 reg210=new Registro210_214();
                        reg210.txtFactura.setText(txtCF.getText());
                        Connection miConexions =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statements =(Statement)miConexions.createStatement();
                           ResultSet rss = statement.executeQuery("select * from VTBL_FACTURA210 where FACTURA='"+txtCF.getText()+"' and archivo210 is null");
                                if(rss.next() == true){
                                    reg210.txtTer.setText(rss.getString("talon_prefijo").trim());
                                    reg210.txtFolio.setText(rss.getString("talon_folio").trim());
                                    reg210.txtFchTalon.setText(rss.getString("fch_crea").trim());
                                    reg210.txtStatus.setText(rss.getString("STATUS_TAL").trim());
                                    reg210.txtRef.setText(rss.getString("campo_ref1").trim());
                                    reg210.txtCodigo.setText(rss.getString("campo_ref2").trim());
                                    reg210.txtPlanta.setText(rss.getString("campo_ref4").trim());
                                    reg210.txtSubtotal.setText(rss.getString("MONTO_FLETE").trim());
                                    reg210.txtIva.setText(rss.getString("val_iva").trim());
                                    reg210.txtRetencion.setText(rss.getString("val_riva").trim());
                                    reg210.txtTotal.setText(rss.getString("val_total").trim());
                                    reg210.txtCaja.setText(rss.getString("caja").trim());
                                    reg210.txtStars.setText(rss.getString("terminal_carta").trim()+"0"+rss.getString("folio_carta").trim());
                                    star=rss.getString("terminal_carta").trim()+rss.getString("folio_carta").trim();
                                    cpors=rss.getString("campo_ref1").trim().replace("CPO",""); 
                                    Connection miConexionc =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementc =(Statement)miConexionc.createStatement();
                                       ResultSet rsc = statementc.executeQuery("select * from TBL_Reg_CPO where CPO ='"+cpors.trim()+"' and estado ='activo' and TIPO='op'");
                                            if(rsc.next() == true){
                                                reg210.txtRemitente.setText(rsc.getString("nom_origen").trim()+","+rsc.getString("cod_origen").trim());
                                                reg210.txtDom1.setText(rsc.getString("dir_origen").trim()+","+rsc.getString("cd_origen").trim()+","+rsc.getString("ccd_origen").trim()+","+rsc.getString("cp_origen").trim()+",MX");
                                                reg210.txtDestinatario.setText(rsc.getString("nom_destino").trim()+","+rsc.getString("cod_destino").trim());
                                                reg210.txtDom2.setText(rsc.getString("dir_destino").trim()+","+rsc.getString("cd_destino").trim()+","+rsc.getString("ccd_destino").trim()+","+rsc.getString("cp_destino").trim()+",MX");   
                                                reg210.txtCenc1.setText(rsc.getString("nom_ccosto").trim()+","+rsc.getString("cod_ccosto").trim());
                                                reg210.txtCenc2.setText(rsc.getString("dir_ccosto").trim()+","+rsc.getString("cd_ccosto").trim()+","+rsc.getString("ccd_ccosto").trim()+","+rsc.getString("cp_ccosto").trim()+",MX");      
                                                reg210.txtCarga.setText(rsc.getString("tipocarga").trim());
                                                reg210.txtPeso.setText(rsc.getString("peso").trim());

                                                Connection miConexionst =(Connection)ConexionEDI.GetConnection();
                                                try {
                                                   Statement statementst =(Statement)miConexionst.createStatement();
                                                    ResultSet rs = statement.executeQuery("select * from VTBL_STARS_810 where Archivox1='CREADO' AND Categoriax1='IA' and EvidenciaRD !='' AND CartaporteX1='"+star+"'");
                                                        if(rs.next() == true){
                                                            reg210.txtBolStars.setText(rs.getString("bol").trim());
                                                            reg210.txtBol.setText(rs.getString("evidenciard").trim());
                                                            reg210.txtFchStars.setText(rs.getString("fchAF").trim().substring(0,10));
                                                            reg210.txtFchbol.setText(rs.getString("fcherd").trim().substring(0,10));                                                             
                                                            reg210.txtUserf1.setText(lblUserVF.getText());                        
                                                            reg210.setVisible(true);
                                                        }else {
                                                            JOptionPane.showMessageDialog(null, "Verificar la cartaporte en recepción ","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                                                        }
                                                } catch (HeadlessException | SQLException ex) {
                                                    JOptionPane.showMessageDialog(null, "No se puede acceder a los datos "+ex.getMessage(),"Mensaje de error",JOptionPane.ERROR_MESSAGE);
                                                }                                    
                                            }else {                 
                                                JOptionPane.showMessageDialog(null, "No hay registro de la CPO o se encuentra Cancelada","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE );
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null, "No se puede acceder a los datos","Mensaje de error",JOptionPane.ERROR_MESSAGE );
                                    }                                    
                                }else {
                                    JOptionPane.showMessageDialog(null, "Ya se a generado una transacción para esta factura ","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE );
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "No se puede acceder a los datos","Mensaje de error",JOptionPane.ERROR_MESSAGE );
                        }               
                }else {
                    JOptionPane.showMessageDialog(null, "El proceso de cobranza no se puede realizar","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    } 

    public void usercbzCR(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' AND edi210RCrea='1'");
                if(rs1.next() == true){
                    Connection editar =(Connection)ConexionEDI.GetConnection();
                    try {
                       Statement steditar =(Statement)miConexion.createStatement();
                        ResultSet reditar = steditar.executeQuery("select * from v_configuracion where clave='C002' and edo='1'");
                            if(reditar.next() == true){ 
                            Connection miVerificacion =(Connection)ConexionEDI.GetConnection();
                            try {
                               Statement stv =(Statement)miVerificacion.createStatement();
                                ResultSet rv = stv.executeQuery("select * from tbl_factura210 where  fecha210 < DATEADD(day,-1,GETDATE()) and factura='"+txtCF.getText()+"'");
                                    if(rv.next() == true){  
                                        evaluarrecrear();
                                    }else{ 
                                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar. ","Mensajde informativo",JOptionPane.INFORMATION_MESSAGE);
                                    }
                            } catch (HeadlessException | SQLException ex) {
                                JOptionPane.showMessageDialog(null,"Error en la conexión, intente nuevamente.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
                            }                       
                            }else{ 
                                evaluarrecrear();
                            }
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Error en la conexión, intente nuevamente.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
                    } 
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    } 
    
    public void evaluarrecrear(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_CONS_COBRANZA where archivo210='creado' and STATUS_TAL='activa' AND Nota is null and ST810='ACEPTADO' and factura='"+txtCF.getText()+"'");
                if(rs1.next() == true){                   
                        int i =JOptionPane.showConfirmDialog(this, "Corfirma la re-creacion del archivo :"+"\n"+" '"+txtCF.getText()+"'  ? ",
                        "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                        if(i == 0){
                            actRegistro210();
                        }else if(i == 1){
                           JOptionPane.showMessageDialog(null, "El proceso de cobranza cancelado ","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);   
                        }    
                    }else{
                        JOptionPane.showMessageDialog(null, "El proceso de cobranza no se puede realizar","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);             
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void actRegistro210() throws SQLException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fcreacion;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        PreparedStatement stp=miConexion.prepareStatement("update TBL_FACTURA210 set fecha210=?,control='0',error=null,categoria=null,PREFECHA='"+fcreacion.substring(0,10)+"',editado='RECREADO', edo_997=null , acuse_997=null  where factura='"+txtCF.getText()+"'");
        java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
        stp.setTimestamp(1,timestamp);
        stp.executeUpdate();
        JOptionPane.showMessageDialog(null,"Transacción recreada","Mnesaje información",JOptionPane.INFORMATION_MESSAGE);
    }     
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCancel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox jStars;
    private javax.swing.JCheckBox jactiva;
    private javax.swing.JTable jbtlcobranza;
    private javax.swing.JCheckBox jcategoria;
    private javax.swing.JCheckBox jespecial;
    private javax.swing.JCheckBox jnota;
    private javax.swing.JCheckBox jorden;
    private javax.swing.JButton jtbQuery;
    public javax.swing.JLabel lblUserVF;
    private javax.swing.JTextField txtBOL;
    public javax.swing.JTextField txtCF;
    private javax.swing.JTextField txtCarta;
    private javax.swing.JTextField txtF1;
    private javax.swing.JTextField txtF2;
    private javax.swing.JTextField txtFact1;
    private javax.swing.JTextField txtFact2;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtFecha1;
    // End of variables declaration//GEN-END:variables
}