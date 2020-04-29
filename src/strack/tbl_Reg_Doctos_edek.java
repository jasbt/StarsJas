package strack;

import java.io.File;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.ConexionEDI;
import Clases.ExportarStars;
import Clases.FormatoTablaRD;
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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class tbl_Reg_Doctos_edek extends javax.swing.JFrame {

    DefaultTableModel tm=new DefaultTableModel();
    private void PropiedadesTabla(){
        Jrblrecepcion.setDefaultRenderer(Object.class, new ImgTable());
        String titulos []={"Carta porte", "Status OS", "Fecha OS", "Núm. Orden", "Bitacora", "Unidad", "Remolque", "Origen", "Destino", "Stars", "Remisión", "Fecha de Remisión", "Operador", "Ruta", "Recibo de valores", "Gastos", "Total de gastos","Carga","Usuario","Fecha de registro","Status Recepción"};
        tm=new DefaultTableModel(null,titulos);
        Jrblrecepcion.setModel(tm);
    }
    
    public tbl_Reg_Doctos_edek() {
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jrblrecepcion = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCF1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtRutaRD = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        txtFolio2 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTerminal = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtRem = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtos1 = new javax.swing.JTextField();
        txtos2 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtReg1 = new javax.swing.JTextField();
        txtReg2 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel14.setText("jLabel14");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recepción de Documentos.edek");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Documentos de Viaje", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        Jrblrecepcion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cartaporte", "Status OS ", "Fecha OS ", "No.OS", "Bitacora ", "Unidad ", "Remolque", "Origen", "Destino ", "STARS", "Factura/Remision ", "Fecha de Evidencia", "Operador ", "Ruta", "Recibo de valores", "Gastos", "Total de Gastos", "Tipo de Carga", "Usuario", "Fecha Captura", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Jrblrecepcion.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Jrblrecepcion.getTableHeader().setReorderingAllowed(false);
        Jrblrecepcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JrblrecepcionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jrblrecepcion);
        if (Jrblrecepcion.getColumnModel().getColumnCount() > 0) {
            Jrblrecepcion.getColumnModel().getColumn(0).setMinWidth(50);
            Jrblrecepcion.getColumnModel().getColumn(0).setPreferredWidth(80);
            Jrblrecepcion.getColumnModel().getColumn(0).setMaxWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(1).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(1).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(1).setMaxWidth(120);
            Jrblrecepcion.getColumnModel().getColumn(2).setMinWidth(80);
            Jrblrecepcion.getColumnModel().getColumn(2).setPreferredWidth(80);
            Jrblrecepcion.getColumnModel().getColumn(2).setMaxWidth(80);
            Jrblrecepcion.getColumnModel().getColumn(3).setMinWidth(80);
            Jrblrecepcion.getColumnModel().getColumn(3).setPreferredWidth(80);
            Jrblrecepcion.getColumnModel().getColumn(3).setMaxWidth(120);
            Jrblrecepcion.getColumnModel().getColumn(4).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(4).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(4).setMaxWidth(120);
            Jrblrecepcion.getColumnModel().getColumn(5).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(5).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(5).setMaxWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(6).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(6).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(6).setMaxWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(7).setMinWidth(180);
            Jrblrecepcion.getColumnModel().getColumn(7).setPreferredWidth(180);
            Jrblrecepcion.getColumnModel().getColumn(7).setMaxWidth(220);
            Jrblrecepcion.getColumnModel().getColumn(8).setMinWidth(180);
            Jrblrecepcion.getColumnModel().getColumn(8).setPreferredWidth(180);
            Jrblrecepcion.getColumnModel().getColumn(8).setMaxWidth(220);
            Jrblrecepcion.getColumnModel().getColumn(10).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(10).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(10).setMaxWidth(180);
            Jrblrecepcion.getColumnModel().getColumn(11).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(11).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(11).setMaxWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(12).setMinWidth(150);
            Jrblrecepcion.getColumnModel().getColumn(12).setPreferredWidth(150);
            Jrblrecepcion.getColumnModel().getColumn(12).setMaxWidth(200);
            Jrblrecepcion.getColumnModel().getColumn(17).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(17).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(17).setMaxWidth(130);
            Jrblrecepcion.getColumnModel().getColumn(18).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(18).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(18).setMaxWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(19).setMinWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(19).setPreferredWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(19).setMaxWidth(100);
            Jrblrecepcion.getColumnModel().getColumn(20).setResizable(false);
        }

        jLabel11.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel11.setText("Carta porte:");

        txtCF1.setEditable(false);
        txtCF1.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCF1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtCF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Nuevo.png"))); // NOI18N
        jButton2.setToolTipText("Nuevo Reg. Doctos");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/edicion.png"))); // NOI18N
        jButton11.setToolTipText("Editar Reg. Doctos");
        jButton11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton9.setToolTipText("Cancelar Reg. Doctos");
        jButton9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
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
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setText("Ruta:");

        txtRutaRD.setEditable(false);
        txtRutaRD.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        txtRutaRD.setBorder(null);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRutaRD, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRutaRD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Folio:");

        txtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Terminal:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Unidad:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Remolque:");

        txtRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRem, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel8)
                .addComponent(txtRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Proveedor:");

        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13)
                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Fecha OS:");

        txtos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtos1MouseClicked(evt);
            }
        });

        txtos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtos2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtos1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtos2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Fch.Captura:");

        txtReg1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReg1MouseClicked(evt);
            }
        });

        txtReg2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReg2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReg1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReg2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(txtReg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtReg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton10.setToolTipText("Buscar");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton4.setToolTipText("Exportar");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        jButton5.setToolTipText("Limpiar");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton3.setToolTipText("Salir");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1187, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Recepción de Documentos");

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

    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserRegistro();            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una carta porte","Mensajde informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserCancela();            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione una carta porte","Mensajde informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (Jrblrecepcion.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(Jrblrecepcion);
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
            JOptionPane.showMessageDialog(this,"No hay datos ha exportar","Mensaje de error",JOptionPane.ERROR_MESSAGE);
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
        txtCF1.setText("");
        txtReg1.setText("");
        txtReg2.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          exitForm(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
        limpiartblx3();
        query="select * from vtbl_recep_doctos_ter where folio_carta='"+txtFolio.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
        qrecepcion();
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

    private void JrblrecepcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JrblrecepcionMouseClicked
        try {
            SelecionaRegistro() ;
        } catch (IOException ex) {
            Logger.getLogger(tbl_Reg_Doctos_edek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JrblrecepcionMouseClicked

    private void txtRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemActionPerformed
        //REMOLQUE
    }//GEN-LAST:event_txtRemActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
//        if(!txtCF1.getText().equals("")){
//            validauserEditar();
//        }else{
//            JOptionPane.showMessageDialog(null, "Seleccione una cartaporte ");
//        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void txtos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtos1MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtos1.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtos1MouseClicked

    private void txtos2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtos2MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtos2.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtos2MouseClicked

    private void txtReg1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReg1MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtReg1.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtReg1MouseClicked

    private void txtReg2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReg2MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtReg2.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtReg2MouseClicked
     
    public void limpiartblx3(){
        DefaultTableModel model=(DefaultTableModel) Jrblrecepcion.getModel();
    	for (int i=0; i<Jrblrecepcion.getRowCount(); i++){
            model.removeRow(i);
            i-=1;
    	}
    }
    
    String query;
    public void ConsultaX3(){
        if( ((txtRem.getText().equals("")) &&   !txtFolio.getText().equals("")) && (txtFolio2.getText().equals(""))  && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && (txtos1.getText().equals("") && txtos2.getText().equals("")) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter where folio_carta='"+txtFolio.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();        
        }else if(txtRem.getText().equals("")  &&   (!txtFolio.getText().equals("")) && (!txtFolio2.getText().equals("")) && (txtTerminal.getText().equals("") && txtUnidad.getText().equals("")) && (txtos1.getText().equals("") && txtos2.getText().equals("")) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where folio_carta between '"+txtFolio.getText()+"' and '"+txtFolio2.getText()+"' and usuario='"+lblUserVF.getText()+"'  order by fecha_orden";
            qrecepcion();                
        }else if((txtProveedor.getText().equals("") && txtRem.getText().equals("")  && txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtTerminal.getText().equals("") && txtUnidad.getText().equals(""))  && (!(txtos1.getText().equals("") && txtos2.getText().equals(""))) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")) {
            query="select * from vtbl_recep_doctos_ter  where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                        
        }else if((txtRem.getText().equals("")  && txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtTerminal.getText().equals("") && txtUnidad.getText().equals(""))  && (txtos1.getText().equals("") && txtos2.getText().equals("") && (!txtProveedor.getText().equals(""))) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")) {
            query="select * from vtbl_recep_doctos_ter  where nom_origen like'%"+txtProveedor.getText()+"%' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                         
        }else if((txtRem.getText().equals("")  && txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtTerminal.getText().equals("") && txtUnidad.getText().equals(""))  && (!(txtos1.getText().equals("") && txtos2.getText().equals("") && txtProveedor.getText().equals(""))) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")) {
            query="select * from vtbl_recep_doctos_ter  where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and nom_origen='"+txtProveedor.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                         
        }else if( (! txtTerminal.getText().equals("") )&&( txtos1.getText().equals("") && txtos2.getText().equals("") ) &&  ( txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtUnidad.getText().equals("") &&  txtRem.getText().equals("")) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where ter_carta='"+txtTerminal.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                         
        }else if( !( txtTerminal.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("") ) &&  ( txtFolio.getText().equals("") && txtFolio2.getText().equals("")   && txtUnidad.getText().equals("") &&  txtRem.getText().equals(""))  && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and ter_carta='"+txtTerminal.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                         
        }else if( txtRem.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("")  && txtTerminal.getText().equals("") && (txtUnidad.getText().equals("")) &&(! txtos1.getText().equals("")) && (!txtos2.getText().equals("")) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and usuario='"+lblUserVF.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                                  
        }else if( txtRem.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("")  && txtTerminal.getText().equals("") && (!txtUnidad.getText().equals("")) &&( txtos1.getText().equals("")) && (txtos2.getText().equals("")) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where unidad='"+txtUnidad.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                                     
        }else if( txtRem.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("")  && txtTerminal.getText().equals("") && (!txtUnidad.getText().equals("")) &&(! txtos1.getText().equals("")) && (!txtos2.getText().equals("")) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and unidad='"+txtUnidad.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                                  
        }else if( (txtRem.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("")) && (! (txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals(""))) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and ter_carta='"+txtTerminal.getText()+"' and unidad='"+txtUnidad.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                        
        }else if( (!txtRem.getText().equals("")) && txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") &&( txtos1.getText().equals("")) && (txtos2.getText().equals("")) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from VTBL_RECP_DOCTOS where rem1='"+txtRem.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                        
        }else if( (!txtRem.getText().equals("")) && txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") &&(! txtos1.getText().equals("")) && (!txtos2.getText().equals("")) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from VTBL_RECP_DOCTOS where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and rem1='"+txtRem.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                        
        }else if( ( txtUnidad.getText().equals("") && txtFolio.getText().equals("") && txtFolio2.getText().equals("") ) && (! (txtTerminal.getText().equals("") && txtRem.getText().equals("")  && txtos1.getText().equals("") && txtos2.getText().equals(""))) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and ter_carta='"+txtTerminal.getText()+"' and rem1='"+txtRem.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                         
        }else if( ( txtFolio.getText().equals("") && txtFolio2.getText().equals("")  ) && (! (txtUnidad.getText().equals("") && txtTerminal.getText().equals("") && txtRem.getText().equals("")  && txtos1.getText().equals("") && txtos2.getText().equals(""))) && txtReg1.getText().equals("")  &&  txtReg2.getText().equals("")){
            query="select * from vtbl_recep_doctos_ter  where fecha_orden between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:00.000') and ter_carta='"+txtTerminal.getText()+"' and rem1='"+txtRem.getText()+"' and unidad='"+txtUnidad.getText()+"' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();                                
        }else if(txtRem.getText().equals("")  && (txtFolio.getText().equals("") && txtFolio2.getText().equals("") && (!txtTerminal.getText().equals("")) && txtUnidad.getText().equals("")) && (!(txtReg1.getText().equals("") && txtReg2.getText().equals(""))) && (txtos1.getText().equals("") && txtos2.getText().equals(""))){
            query="select * from vtbl_recep_doctos_ter  where TER_CARTA='"+txtTerminal.getText()+"' AND FchRD between convert(datetime,'"+txtReg1.getText()+" 00:00:00.000') and convert(datetime,'"+txtReg2.getText()+" 23:59:00.000') and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();             
        }else if(txtRem.getText().equals("")  && (txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("")) && (!(txtReg1.getText().equals("") && txtReg2.getText().equals(""))) && (txtos1.getText().equals("") && txtos2.getText().equals(""))){
            query="select * from vtbl_recep_doctos_ter  where FchRD between convert(datetime,'"+txtReg1.getText()+" 00:00:00.000') and convert(datetime,'"+txtReg2.getText()+" 23:59:00.000') and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();             
        }else if( txtRem.getText().equals("") && (txtFolio.getText().equals("") && txtFolio2.getText().equals(""))  && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && (txtos1.getText().equals("") && txtos2.getText().equals("") && txtReg1.getText().equals("")  &&  txtReg2.getText().equals(""))){
            query="select * from vtbl_recep_doctos_ter  where usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            qrecepcion();             
        }
    }
    
    JLabel a,b;
    public void qrecepcion(){
        String aplicado="";
        String eaplicado="";
        String stars="";
        String estars=""; 
        Jrblrecepcion.setDefaultRenderer(Object.class, new ImgTable());
        String [] Reg=new String[22];      
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(query);
                while (rs1.next()) {              
                    Reg[0]=rs1.getString("cartaportex3");
                    Reg[1]=rs1.getString("status_orden");
                    Reg[2]=rs1.getString("fecha_orden").substring(0,11);
                    Reg[3]=rs1.getString("ordenser_folio");
                    Reg[4]=rs1.getString("bitacora");
                    Reg[5]=rs1.getString("unidad");
                    Reg[6]=rs1.getString("rem1");
                    Reg[7]=rs1.getString("nom_origen");
                    Reg[8]=rs1.getString("nom_destino");
                    //Reg[9]=rs1.getString("VALOR_CLI_RUBRO6");                    
                    Reg[10]=rs1.getString("evidenciard");
                    Reg[11]=rs1.getString("fcherd");//.substring(0,16);
                    Reg[12]=rs1.getString("operador");
                    Reg[13]=rs1.getString("ruta_bitacora");
                    Reg[14]=rs1.getString("recibo_valores");
                    Reg[15]=rs1.getString("des_gastos");
                    Reg[16]=rs1.getString("total_gastos");                    
                    Reg[17]=rs1.getString("tipocarga");                    
                    Reg[18]=rs1.getString("usuariord");
                    Reg[19]=rs1.getString("fchrd");//.substring(0,16);
                   // Reg[20]=rs1.getString("aplicacion");//.substring(0,16);                    
                    aplicado=rs1.getString("aplicacion");
                    eaplicado=aplicado;
                    stars=rs1.getString("VALOR_CLI_RUBRO6");
                    estars=stars;
                                        
                    if(eaplicado == null || eaplicado.equals("")){
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
                    }else{
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
                    }
                    
                    if(estars == null || estars.equals("")){
                        b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));                        
                    }else{
                        if(estars.equals("CANCELACION VENTANA") || estars.equals("RETIRO DE UNIDAD") ){
                            b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\ok.png"));                        
                        }else if(estars.equals("COMPLETO") ){
                            b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
                        }
                    }                    
                    tm.addRow(new Object[]{Reg[0],Reg[1],Reg[2],Reg[3],Reg[4],Reg[5],Reg[6],Reg[7],Reg[8],b,Reg[10],Reg[11],Reg[12],Reg[13],Reg[14],Reg[15],Reg[16],Reg[17],Reg[18],Reg[19],a});                   

                }//while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } Jrblrecepcion.setModel(tm);        
    }
    
    public void proveedor(){
        limpiartblx3();
            DefaultTableModel model = (DefaultTableModel) Jrblrecepcion.getModel();
            Jrblrecepcion.setModel(model);
            String query="select * from vtbl_recep_doctos_ter  where nom_origen like '%"+txtProveedor.getText()+"%' and usuario='"+lblUserVF.getText()+"' order by fecha_orden";
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[22];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("cartaportex3");
                    data[1]=resp.getString("status_orden");
                    data[2]=resp.getString("fecha_orden").substring(0,11);
                    data[3]=resp.getString("ordenser_folio");
                    data[4]=resp.getString("bitacora");
                    data[5]=resp.getString("unidad");
                    data[6]=resp.getString("rem1");
                    data[7]=resp.getString("nom_origen");
                    data[8]=resp.getString("nom_destino");
                    data[9]=resp.getString("VALOR_CLI_RUBRO6");                    
                    data[10]=resp.getString("evidenciard");
                    data[11]=resp.getString("fcherd");//.substring(0,16);
                    data[12]=resp.getString("operador");
                    data[13]=resp.getString("ruta_bitacora");
                    data[14]=resp.getString("recibo_valores");
                    data[15]=resp.getString("des_gastos");
                    data[16]=resp.getString("total_gastos");                    
                    data[17]=resp.getString("tipocarga");                    
                    data[18]=resp.getString("usuariord");
                    data[19]=resp.getString("fchrd");//.substring(0,16);
                    data[20]=resp.getString("aplicacion");//.substring(0,16);
                    model.addRow(data);
                }Jrblrecepcion.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(tbl_Reg_Doctos_edek.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(tbl_Reg_Doctos_edek.class.getName()).log(Level.SEVERE, null, ex);
            }
        FormatoTablaRD ft = new FormatoTablaRD(0);
        Jrblrecepcion.setDefaultRenderer (Object.class, ft );
    }
    
    public void validauserRegistro(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  rdr='1' and Estado='activo'");
            if(rs1.next() == true){
                Validarstatus();
            }else {
                JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void Validarstatus(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_RECP_DOCTOS where Cartaportex3='"+txtCF1.getText()+"'and status_orden='CANCELADO'");
            if(rs1.next() == true){
                JOptionPane.showMessageDialog(null,"La cartaporte se encuentra cancelada","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }else {
                validaRegistro();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public static boolean tsre=false;
    public void validaRegistro(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_RECP_DOCTOS where aplicacion='REGISTRADO' AND cartaportex3='"+txtCF1.getText()+"'");
            if(rs1.next() == true){
                JOptionPane.showMessageDialog(null,"Ya se ha registrado una evidencia","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }else {
                RecpDoctos x3=new RecpDoctos();
                x3.txtUserf1.setText(lblUserVF.getText());
                x3.txtRuta.setText(txtRutaRD.getText());
                x3.txtCartax3.setText(txtCF1.getText());
                x3.setVisible(true);                    
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
        
    public void validauserEditar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  rde='1' and Estado='activo'");
            if(rs1.next() == true){
                ValidarstatusRegistro();
            }else {
                JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String bolRecep,cartaRD;
    public void ValidarstatusRegistro(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select cartaportex3,evidenciaRD from VTBL_RECP_DOCTOS where Cartaportex3='"+txtCF1.getText()+"' and aplicacion='REGISTRADO'");
            if(rs1.next() == true){ 
                bolRecep=rs1.getString("evidenciaRD");
                cartaRD=rs1.getString("cartaporteX3");
                Validarstatus210();                    
            }else {
                JOptionPane.showMessageDialog(null,"Evidencia no registrada","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void Validarstatus210(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("SELECT * FROM VTBL_CONS_FACTURACION210 WHERE cartaportestars ='"+txtCF1.getText()+"' AND archivo210='creado' AND bolfactura='"+bolRecep+"'");
            if(rs1.next() == true){
                JOptionPane.showMessageDialog(null,"La cartaporte en proceso de cobranza ","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }else {
                ValidaStars214();                                            
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void ValidaStars214(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where ArchivoAF='CREADO' AND CartaporteAF='"+txtCF1.getText()+"' AND BOL='"+bolRecep+"'");
            if(rs1.next() == true){                    
                JOptionPane.showMessageDialog(null,"La cartaporte en proceso de stars","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }else {
                Cancela1();                        
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }    
    
    String evr;
    public void SelecionaRegistro() throws IOException{
        int FilaSeleccionada;
        try {
            FilaSeleccionada = Jrblrecepcion.getSelectedRow();
            if(FilaSeleccionada ==-1){
                JOptionPane.showMessageDialog(null, "No ha seleccionado fila");
            }else{
                DefaultTableModel model=(DefaultTableModel)Jrblrecepcion.getModel();
                String id =(String)model.getValueAt(FilaSeleccionada,0);
                String id1 =(String)model.getValueAt(FilaSeleccionada,13);
                String ev =(String)model.getValueAt(FilaSeleccionada,10);
                txtCF1.setText(id);
                txtRutaRD.setText(" "+id1);
                evr=ev;
            }
        } catch (HeadlessException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void validauserCancela(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  rdc='1' and Estado='activo'");
            if(rs1.next() == true){
                Validarstatus210c();
            }else {
                JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void Validarstatus210c(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("SELECT * FROM VTBL_CONS_FACTURACION210 WHERE archivo210='creado' and bolfactura='"+evr+"' and cartaportestars='"+txtCF1.getText()+"' AND archivo210='creado'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "La evidencia no se puede cancelar, ya que se encuentra en proceso de cobro","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    ValidaStars214c();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void ValidaStars214c(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where ArchivoAF='CREADO' AND CartaporteAF='"+txtCF1.getText()+"' and bol='"+evr+"'");
            if(rs1.next() == true){
                JOptionPane.showMessageDialog(null,"La evidencia se encuentra activa en stars","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }else {
                Cancela();                        
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }        
    
    public void Cancela(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_RECP_DOCTOS where Cartaportex3='"+txtCF1.getText()+"'and status_orden='CANCELADO'");
            if(rs1.next() == true){
                JOptionPane.showMessageDialog(null, "La cartaporte se encuentra cancelada","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }else {
                statement.execute("update TBL_REG_X3_1 set recibo_valores=null,total_gastos=null,des_gastos=null,evidenciaRD=null,UsuarioRD=null,FchERD=null,FchRD=null,aplicacion=null where cartaportex3='"+txtCF1.getText()+"'");
                JOptionPane.showMessageDialog(null, "Carta porte atualizada!","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }
        
    public void Cancela1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_RECP_DOCTOS where Cartaportex3='"+txtCF1.getText()+"'and status_orden='CANCELADO'");
            if(rs1.next() == true){
                JOptionPane.showMessageDialog(null,"La cartaporte cancelada ","Mensaje infomativo",JOptionPane.INFORMATION_MESSAGE);
            }else {
                RecpDoctosEditar x3=new RecpDoctosEditar();
                x3.txtUserf1.setText(lblUserVF.getText());
                x3.txtRuta.setText(txtRutaRD.getText());
                x3.txtCartax3.setText(txtCF1.getText());
                x3.setVisible(true);
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jrblrecepcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblUserVF;
    public javax.swing.JTextField txtCF1;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtFolio2;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtReg1;
    private javax.swing.JTextField txtReg2;
    private javax.swing.JTextField txtRem;
    public javax.swing.JTextField txtRutaRD;
    private javax.swing.JTextField txtTerminal;
    private javax.swing.JTextField txtUnidad;
    private javax.swing.JTextField txtos1;
    private javax.swing.JTextField txtos2;
    // End of variables declaration//GEN-END:variables
}