package strack;

import java.io.File;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.ConexionEDI;
import Clases.ExportarStars;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Reportes_stars_edek extends javax.swing.JFrame {
    DefaultTableModel tm=new DefaultTableModel();
    private void PropiedadesTabla(){
        jtblreporte.setDefaultRenderer(Object.class, new ImgTable());
        String titulos []={"Carta porte", "Servicio", "Proveedor", "Destinatario", "Cita de carga", "LLegada a cargar", "Salida programada de carga", "Salida real de cargar", "Arribo a destino", "Unidad", "Remolque", "Carga", "Mov. x3", "Mov.AF", "Mov.x1", "Mov. AP", "Mov. AG","JIT","ETA","Usuario"};
        tm=new DefaultTableModel(null,titulos);
        jtblreporte.setModel(tm);
    }
    
    String creado,respuesta,fchAF,cx1,f;
    private DefaultComboBoxModel code;
    private DefaultComboBoxModel error;
    
    DefaultTableModel model;
    public Reportes_stars_edek() {
        code = new DefaultComboBoxModel(new String [] {});
        error = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTabla();
        llenacode();
        llenaerror();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblreporte = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTerminal = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtcartaporte = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtremuni = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtos1 = new javax.swing.JTextField();
        txtos2 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtdestinatario = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFch1 = new javax.swing.JTextField();
        txtFch2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jcbmovimiento = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jcberror = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jcbcategoria = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jcbcode = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jcbCarga = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Reportes.edek");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proceso de Stars", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jtblreporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carta porte ", "Servicio", "Proveedor", "Destinatario", "Cita de carga", "Llegada a cargar", "Salida programada de carga", "Salida real de carga", "Arribo a destino", "Unidad", "Remolque", "Carga", "x3", "AF", "AG", "x1", "AP", "JIT", "ETA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblreporte.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtblreporte.getTableHeader().setReorderingAllowed(false);
        jtblreporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblreporteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblreporte);
        if (jtblreporte.getColumnModel().getColumnCount() > 0) {
            jtblreporte.getColumnModel().getColumn(0).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(0).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(0).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(1).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(1).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(1).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(2).setMinWidth(180);
            jtblreporte.getColumnModel().getColumn(2).setPreferredWidth(180);
            jtblreporte.getColumnModel().getColumn(2).setMaxWidth(180);
            jtblreporte.getColumnModel().getColumn(3).setMinWidth(180);
            jtblreporte.getColumnModel().getColumn(3).setPreferredWidth(180);
            jtblreporte.getColumnModel().getColumn(3).setMaxWidth(180);
            jtblreporte.getColumnModel().getColumn(4).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(4).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(4).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(5).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(5).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(5).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(6).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(6).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(6).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(7).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(7).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(7).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(8).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(8).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(8).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(9).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(9).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(9).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(10).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(10).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(10).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(11).setMinWidth(120);
            jtblreporte.getColumnModel().getColumn(11).setPreferredWidth(120);
            jtblreporte.getColumnModel().getColumn(11).setMaxWidth(120);
            jtblreporte.getColumnModel().getColumn(12).setMinWidth(30);
            jtblreporte.getColumnModel().getColumn(12).setPreferredWidth(30);
            jtblreporte.getColumnModel().getColumn(12).setMaxWidth(30);
            jtblreporte.getColumnModel().getColumn(13).setMinWidth(30);
            jtblreporte.getColumnModel().getColumn(13).setPreferredWidth(30);
            jtblreporte.getColumnModel().getColumn(13).setMaxWidth(30);
            jtblreporte.getColumnModel().getColumn(14).setMinWidth(30);
            jtblreporte.getColumnModel().getColumn(14).setPreferredWidth(30);
            jtblreporte.getColumnModel().getColumn(14).setMaxWidth(30);
            jtblreporte.getColumnModel().getColumn(15).setMinWidth(30);
            jtblreporte.getColumnModel().getColumn(15).setPreferredWidth(30);
            jtblreporte.getColumnModel().getColumn(15).setMaxWidth(30);
            jtblreporte.getColumnModel().getColumn(16).setMinWidth(30);
            jtblreporte.getColumnModel().getColumn(16).setPreferredWidth(30);
            jtblreporte.getColumnModel().getColumn(16).setMaxWidth(30);
        }

        jLabel5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel5.setText("Terminal:");

        txtTerminal.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerminalActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel16.setText("Carta porte:");

        txtcartaporte.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtcartaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcartaporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTerminal, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(txtcartaporte))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtcartaporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel6.setText("Unidad o");

        txtremuni.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtremuni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtremuniActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel8.setText("Remolque:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtremuni, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtremuni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setText("carga");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel13.setText("Fecha de");

        txtos1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtos1MouseClicked(evt);
            }
        });

        txtos2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtos2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtos2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtos1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(txtos2))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(txtos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton8.setToolTipText("Buscar");
        jButton8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
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

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/limpiar.png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel11.setText("Proveedor:");

        txtProveedor.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel14.setText("Destinatario:");

        txtdestinatario.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtdestinatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdestinatarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtdestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setText("Fecha de");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel7.setText(" registro:");

        txtFch1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtFch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFch1MouseClicked(evt);
            }
        });

        txtFch2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtFch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFch2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFch2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(txtFch1))
                .addGap(8, 8, 8))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFch2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel9.setText("Movimiento:");

        jcbmovimiento.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jcbmovimiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "x3", "AF", "x1", "AP", "AG" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(62, 62, 62))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbmovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbmovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel12.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel12.setText("Error:");

        jcberror.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jcberror.setModel(error);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel1.setText("Categoria:");

        jcbcategoria.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jcbcategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "IA", "IE", "IR" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jcberror, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jcberror, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel15.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel15.setText("Code:");

        jcbcode.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jcbcode.setModel(code);

        jLabel17.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel17.setText("Carga:");

        jcbCarga.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jcbCarga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Material", "Racks" }));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jcbcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jcbCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 200, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Reportes");

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
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(10, 10, 10)
                        .addComponent(lblUserVF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(27, 27, 27))))
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

    private void jtblreporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblreporteMouseClicked
        
    }//GEN-LAST:event_jtblreporteMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jtblreporte.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(jtblreporte);
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
        txtFch1.setText("");
        txtFch2.setText("");
        txtremuni.setText("");
        txtTerminal.setText("");
        txtos1.setText("");
        txtos2.setText("");
        txtProveedor.setText("");
        txtdestinatario.setText("");
        txtcartaporte.setText("");
        jcbmovimiento.setSelectedItem("Todos");
        jcbcategoria.setSelectedItem("Todos");
        jcberror.setSelectedItem("Todos");
        jcbcode.setSelectedItem("Todos");
        jcbCarga.setSelectedItem("Todos");
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         exitForm(evt);    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        cleartbl();
        q="select * from vtbl_asig_stars_reporte_ter_ruta where usuario='"+lblUserVF.getText()+"' and  nom_origen like '%"+txtProveedor.getText()+"%' order by fecha_carga asc";
        //q="select * from vtbl_asig_stars_reporte_ter where  usuario='"+lblUserVF.getText()+"' and  nom_origen like '%"+txtProveedor.getText()+"%' order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
    }//GEN-LAST:event_txtProveedorActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Consulta();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void txtdestinatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdestinatarioActionPerformed
        q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and nom_destino like '%"+txtdestinatario.getText()+"%' order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
    }//GEN-LAST:event_txtdestinatarioActionPerformed
    
    private void txtcartaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcartaporteActionPerformed
        cleartbl();
        q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and folio='"+txtcartaporte.getText()+"' order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);             
    }//GEN-LAST:event_txtcartaporteActionPerformed

    private void txtremuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtremuniActionPerformed
        cleartbl();
        q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
    }//GEN-LAST:event_txtremuniActionPerformed

    private void txtTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerminalActionPerformed
        cleartbl();
        q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
    }//GEN-LAST:event_txtTerminalActionPerformed

    private void txtFch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFch1MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtFch1.setText(datefecha.format(date));   
    }//GEN-LAST:event_txtFch1MouseClicked

    private void txtFch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFch2MouseClicked
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyyMMdd");
        txtFch2.setText(datefecha.format(date));  
    }//GEN-LAST:event_txtFch2MouseClicked

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
        
    public void cleartbl(){
        DefaultTableModel model=(DefaultTableModel) jtblreporte.getModel();
        for (int i=0; i<jtblreporte.getRowCount(); i++){
            model.removeRow(i);
            i-=1;
        }
    }
      
    String q;
    public void Consulta(){
        cleartbl();
        if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("") 
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && (!txtcartaporte.getText().equals("")) 
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and folio='"+txtcartaporte.getText()+"' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && (!txtremuni.getText().equals("")) && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && (!txtProveedor.getText().equals(""))
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and nom_origen like '%"+txtProveedor.getText()+"%' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && (!txtdestinatario.getText().equals("")) && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and nom_destino like '%"+txtdestinatario.getText()+"%' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("") && !txtremuni.getText().equals("")) && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && txtremuni.getText().equals("") && (!txtProveedor.getText().equals(""))
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and nom_origen like '%"+txtProveedor.getText()+"%' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && (!txtdestinatario.getText().equals("")) && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and nom_destino like '%"+txtdestinatario.getText()+"%' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("") && !txtremuni.getText().equals("") && !txtProveedor.getText().equals(""))
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and nom_origen like '%"+txtProveedor.getText()+"%' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("") && !txtremuni.getText().equals("")) && txtProveedor.getText().equals("")
            && (!txtdestinatario.getText().equals("")) && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and nom_destino like '%"+txtdestinatario.getText()+"%' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && (!txtremuni.getText().equals("")) && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && txtremuni.getText().equals("") && (!txtProveedor.getText().equals(""))
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and nom_origen like '%"+txtProveedor.getText()+"%' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && (!txtdestinatario.getText().equals("")) && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and nom_destino like '%"+txtdestinatario.getText()+"%' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && (!txtremuni.getText().equals("") && !txtProveedor.getText().equals(""))
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and nom_origen like '%"+txtProveedor.getText()+"%' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && (!txtTerminal.getText().equals("")) && (!txtremuni.getText().equals("")) && txtProveedor.getText().equals("")
            && (!txtdestinatario.getText().equals("")) && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and terminal='"+txtTerminal.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and nom_destino like '%"+txtdestinatario.getText()+"%' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && (!txtremuni.getText().equals("")) && (!txtProveedor.getText().equals(""))
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and  (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and nom_origen like '%"+txtProveedor.getText()+"%' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && (!txtremuni.getText().equals("")) && txtProveedor.getText().equals("")
            && (!txtdestinatario.getText().equals("")) && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and nom_destino like '%"+txtdestinatario.getText()+"%' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && (!txtremuni.getText().equals("")) && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && (!txtremuni.getText().equals("")) && (!txtProveedor.getText().equals(""))
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"') and nom_origen like '%"+txtProveedor.getText()+"%' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && (!txtremuni.getText().equals("")) && txtProveedor.getText().equals("")
            && (!txtdestinatario.getText().equals("")) && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and (unidad='"+txtremuni.getText()+"' or rem1='"+txtremuni.getText()+"')  and nom_destino like '%"+txtdestinatario.getText()+"%' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && (!txtProveedor.getText().equals(""))
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter where  usuario='"+lblUserVF.getText()+"' and nom_origen like '%"+txtProveedor.getText()+"%' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos")) && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            switch (jcbmovimiento.getSelectedItem().toString()) {
                case "x3":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AF":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "x1":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AG":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mag='x' order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AP":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                default:
                    break;
            }
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && (!jcbCarga.getSelectedItem().toString().equals("Todos")) ){
            if(jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and tipocarga='material' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and tipocarga='racks' order by fecha_carga asc";  
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && (!jcbCarga.getSelectedItem().toString().equals("Todos")) ){
            if(jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and tipocarga='material' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and tipocarga='racks' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";  
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos")) && (!jcbcategoria.getSelectedItem().toString().equals("Todos"))
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbcategoria.getSelectedItem().toString().equals("IA")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and cx3='IA' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbcategoria.getSelectedItem().toString().equals("IE")){
                q="select * from vtbl_asig_stars_reporte_ter where  usuario='"+lblUserVF.getText()+"' and mx3='x' and cx3='IE' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbcategoria.getSelectedItem().toString().equals("IR")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and cx3='IR' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbcategoria.getSelectedItem().toString().equals("IA")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and caf='IA' order by fecha_carga asc";  
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbcategoria.getSelectedItem().toString().equals("IE")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and caf='IE' order by fecha_carga asc";  
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbcategoria.getSelectedItem().toString().equals("IR")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and caf='IR' order by fecha_carga asc";  
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbcategoria.getSelectedItem().toString().equals("IA")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and cx1='IA' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbcategoria.getSelectedItem().toString().equals("IE")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and cx1='IE' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbcategoria.getSelectedItem().toString().equals("IR")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and cx1='IR' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AP")  && jcbcategoria.getSelectedItem().toString().equals("IA")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' and ctap='IA' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AP")  && jcbcategoria.getSelectedItem().toString().equals("IE")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' and ctap='IE' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AP")  && jcbcategoria.getSelectedItem().toString().equals("IR")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' and ctap='IR' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos")) && (!jcbcategoria.getSelectedItem().toString().equals("Todos"))
            && (!jcberror.getSelectedItem().toString().equals("Todos")) && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbcategoria.getSelectedItem().toString().equals("IE")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and cx3='IE' and ex3='"+jcberror.getSelectedItem().toString()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbcategoria.getSelectedItem().toString().equals("IR")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and cx3='IR' and ex3='"+jcberror.getSelectedItem().toString()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbcategoria.getSelectedItem().toString().equals("IE")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and caf='IE' AND EAF='"+jcberror.getSelectedItem().toString()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbcategoria.getSelectedItem().toString().equals("IR")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and caf='IR' AND EAF='"+jcberror.getSelectedItem().toString()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbcategoria.getSelectedItem().toString().equals("IE")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and cx1='IE' AND EX1='"+jcberror.getSelectedItem().toString()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbcategoria.getSelectedItem().toString().equals("IR")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and cx1='IR' AND EX1='"+jcberror.getSelectedItem().toString()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AP") && jcbcategoria.getSelectedItem().toString().equals("IE")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' and ctap='IE' AND Eap='"+jcberror.getSelectedItem().toString()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AP") && jcbcategoria.getSelectedItem().toString().equals("IR")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' and ctap='IR' AND Eap='"+jcberror.getSelectedItem().toString()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos")) && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && (!jcbcode.getSelectedItem().toString().equals("Todos")) 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            switch (jcbmovimiento.getSelectedItem().toString()) {
                case "x3":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and rx3='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AF":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and raf='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "x1":
                    q="select * from vtbl_asig_stars_reporte_ter where  usuario='"+lblUserVF.getText()+"' and mx1='x' and rx1='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AP":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' and rap='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                default:
                    break;
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos")) && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && (!jcbcode.getSelectedItem().toString().equals("Todos")) 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("") && !txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && (!jcbCarga.getSelectedItem().toString().equals("Todos")) ){
            if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and rx3='"+jcbcode.getSelectedItem().toString()+"' and  tipocarga='material' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and rx3='"+jcbcode.getSelectedItem().toString()+"' and  tipocarga='racks' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and raf='"+jcbcode.getSelectedItem().toString()+"' and  tipocarga='material' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";     
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and raf='"+jcbcode.getSelectedItem().toString()+"' and  tipocarga='racks' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";     
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and rx1='"+jcbcode.getSelectedItem().toString()+"' and  tipocarga='material' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";      
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and rx1='"+jcbcode.getSelectedItem().toString()+"' and  tipocarga='racks' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";      
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AP") && jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' and rap='"+jcbcode.getSelectedItem().toString()+"' and  tipocarga='material' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";      
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AP") && jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and cap='x' and rap='"+jcbcode.getSelectedItem().toString()+"' and  tipocarga='racks' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";      
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos")) && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && (!jcbcode.getSelectedItem().toString().equals("Todos")) 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && (!txtFch1.getText().equals("") && !txtFch2.getText().equals("")) && txtcartaporte.getText().equals("") 
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            switch (jcbmovimiento.getSelectedItem().toString()) {
                case "x3":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and rx3='"+jcbcode.getSelectedItem().toString()+"' and fecha_real_carga between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AF":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and raf='"+jcbcode.getSelectedItem().toString()+"' and fecha_real_salida between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "x1":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and rx1='"+jcbcode.getSelectedItem().toString()+"' and fecha_real_destino between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AP":
//                q="SELECT * FROM vtbl_asig_stars_reporte where cap='x' and rap='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
//                Datostbl();
                    break;
                default:
                    break;
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos")) && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && (!jcbcode.getSelectedItem().toString().equals("Todos")) 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && (!txtFch1.getText().equals("") && !txtFch2.getText().equals("")) && txtcartaporte.getText().equals("") 
            && (!jcbCarga.getSelectedItem().toString().equals("Todos")) ){
            if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and rx3='"+jcbcode.getSelectedItem().toString()+"' and tipocarga='material' and fecha_real_carga between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x3") && jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and rx3='"+jcbcode.getSelectedItem().toString()+"' and tipocarga='racks' and fecha_real_carga between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and raf='"+jcbcode.getSelectedItem().toString()+"' and tipocarga='material' and fecha_real_salida between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";     
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AF") && jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and raf='"+jcbcode.getSelectedItem().toString()+"' and tipocarga='racks' and fecha_real_salida between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";     
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbCarga.getSelectedItem().toString().equals("Material")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and rx1='"+jcbcode.getSelectedItem().toString()+"' and tipocarga='material' and fecha_real_destino between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";      
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("x1") && jcbCarga.getSelectedItem().toString().equals("Racks")){
                q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and rx1='"+jcbcode.getSelectedItem().toString()+"' and tipocarga='racks' and fecha_real_destino between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";      
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
            }else if(jcbmovimiento.getSelectedItem().toString().equals("AP") ){
//                q="SELECT * FROM vtbl_asig_stars_reporte where cap='x' and rap='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";      
//                Datostbl();
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos")) && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && (!txtFch1.getText().equals("") && !txtFch2.getText().equals("")) && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            switch (jcbmovimiento.getSelectedItem().toString()) {
                case "x3":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x'  and fecha_real_carga between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AF":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x'  and fecha_real_salida between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "x1":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x'  and fecha_real_destino between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AP":
                    System.out.println("consulta por movimiento ap+fehas de movimiento");
//                q="SELECT * FROM vtbl_asig_stars_reporte where cap='x'  and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
//                Datostbl();
                    break;
                default:
                    break;
            }
        }else if( jcbmovimiento.getSelectedItem().toString().equals("Todos") && jcbcategoria.getSelectedItem().toString().equals("Todos")
            && jcberror.getSelectedItem().toString().equals("Todos") && jcbcode.getSelectedItem().toString().equals("Todos") 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' order by fecha_carga asc";   
            ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos") )&& jcbcategoria.getSelectedItem().toString().equals("Todos")
            && (!jcberror.getSelectedItem().toString().equals("Todos")) && (!jcbcode.getSelectedItem().toString().equals("Todos")) 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && (!txtos1.getText().equals("")) && (!txtos2.getText().equals(""))
            && txtFch1.getText().equals("") && txtFch2.getText().equals("") && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            switch (jcbmovimiento.getSelectedItem().toString()) {
                case "x3":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and where mx3='x' and ex3='"+jcberror.getSelectedItem().toString()+"' and rx3='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AF":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and where maf='x' and eaf='"+jcberror.getSelectedItem().toString()+"' and raf='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "x1":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and ex1='"+jcberror.getSelectedItem().toString()+"' and rx1='"+jcbcode.getSelectedItem().toString()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                default:
                    break;
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos") )&& jcbcategoria.getSelectedItem().toString().equals("Todos")
            && (!jcberror.getSelectedItem().toString().equals("Todos")) && (!jcbcode.getSelectedItem().toString().equals("Todos")) 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && (!txtFch1.getText().equals("")) && (!txtFch2.getText().equals("")) && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos")){
            switch (jcbmovimiento.getSelectedItem().toString()) {
                case "x3":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and ex3='"+jcberror.getSelectedItem().toString()+"' and rx3='"+jcbcode.getSelectedItem().toString()+"' and fecha_real_carga between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AF":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and eaf='"+jcberror.getSelectedItem().toString()+"' and raf='"+jcbcode.getSelectedItem().toString()+"' and fecha_real_carga between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "x1":            
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and ex1='"+jcberror.getSelectedItem().toString()+"' and rx1='"+jcbcode.getSelectedItem().toString()+"' and fecha_real_carga between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                default:
                    break;
            }
        }else if( (!jcbmovimiento.getSelectedItem().toString().equals("Todos") )&& jcbcategoria.getSelectedItem().toString().equals("Todos")
            && (!jcberror.getSelectedItem().toString().equals("Todos")) && (jcbcode.getSelectedItem().toString().equals("Todos")) 
            && txtTerminal.getText().equals("") && txtremuni.getText().equals("") && txtProveedor.getText().equals("")
            && txtdestinatario.getText().equals("") && txtos1.getText().equals("") && txtos2.getText().equals("")
            && (!txtFch1.getText().equals("")) && (!txtFch2.getText().equals("")) && txtcartaporte.getText().equals("")
            && jcbCarga.getSelectedItem().toString().equals("Todos") ){
            switch (jcbmovimiento.getSelectedItem().toString()) {
                case "x3":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx3='x' and ex3='"+jcberror.getSelectedItem().toString()+"' and fecha_real_carga between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "AF":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and maf='x' and eaf='"+jcberror.getSelectedItem().toString()+"' and fecha_real_salida between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                case "x1":
                    q="select * from vtbl_asig_stars_reporte_ter_ruta where  usuario='"+lblUserVF.getText()+"' and mx1='x' and ex1='"+jcberror.getSelectedItem().toString()+"' and fecha_real_destino between convert(datetime,'"+txtFch1.getText()+" 00:00:00.000') and convert(datetime,'"+txtFch2.getText()+" 23:59:59.000') order by fecha_carga asc";
                    ConsultaX3(creado, respuesta, error, creado, respuesta, fchAF, creado, creado, creado, creado, creado, error, cx1, creado, cx1, f, cx1);
                    break;
                default:
                    break;
            }
        }else{
            JOptionPane.showMessageDialog(null, "La consulta no se puede procesar","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
       
    public void llenacode(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_CTA_REASON_CODE where edo='0'");
            code.addElement("Todos");
                while(rs1.next()){
                    code.addElement(rs1.getString("codigo")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo 1.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void llenaerror(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_CODERROR where transaccion='214'");
            error.addElement("Todos");
                while(rs1.next()){
                    error.addElement(rs1.getString("code_error")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.2","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    JLabel a,b,c,d,e;
    public void ConsultaX3(String cartaporte, String tipo_movimiento_descrip, DefaultComboBoxModel error1, String nom_origen, String nom_destino, String fecha_carga, String fecha_real_carga, String salida_programada, String fecha_real_salida, String fecha_real_destino, String unidad, DefaultComboBoxModel error2, String rem1, String tipocarga, String mx3, String maf, String mx1){
        String ag="";
        String espacio="";
        String ap="";
        String esap="";
        String x1="";
        String esx1="";
        String af="";
        String esaf="";
        String x3="";
        String esx3="";
        
        String cx3="";
        String escx3="";
        
        String caf="";
        String escaf="";
       
        String escx1="";
        String cax1="";
        
        String escap="";
        String ccap="";
                
        jtblreporte.setDefaultRenderer(Object.class, new ImgTable());
        String [] Reg=new String[22];  
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(q);
                while (rs1.next()) {                    
                    Reg[0]=rs1.getString("Cartaporte"); 
                    Reg[1]=rs1.getString("tipo_movimiento_descrip");
                    Reg[2]=rs1.getString("nom_origen");
                    Reg[3]=rs1.getString("nom_destino");
                    Reg[4]=rs1.getString("fecha_carga");
                    Reg[5]=rs1.getString("fecha_real_carga");
                    Reg[6]=rs1.getString("salida_programada");
                    Reg[7]=rs1.getString("fecha_real_salida");
                    Reg[8]=rs1.getString("fecha_real_destino");
                    Reg[9]=rs1.getString("unidad");
                    Reg[10]=rs1.getString("rem1");
                    Reg[11]=rs1.getString("tipocarga");
                    Reg[17]=rs1.getString("fchJit");
                    Reg[18]=rs1.getString("fchJit");
                    Reg[19]=rs1.getString("user_mov");

                    x3=rs1.getString("mx3");
                    cx3=rs1.getString("cx3");
                    esx3=x3;
                    escx3=cx3;
                    
                    af=rs1.getString("maf");
                    caf=rs1.getString("caf");
                    esaf=af;
                    escaf=caf;
                                        
                    x1=rs1.getString("mx1");
                    esx1=x1;
                    cax1=rs1.getString("cx1");
                    escx1=cax1;
                    
                    ap=rs1.getString("cap");
                    esap=ap;
                    ccap=rs1.getString("ctap");
                    escap=ccap;
                    
                    ag=rs1.getString("mag");
                    espacio=ag;
                    
                    if(esx3 == null || esx3.equals("")){
                        e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));                        
                    }else{
                        if (null == escx3){
                            e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));
                        }else switch (escx3) {
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
                    
                    if(esaf == null || esaf.equals("")){                        
                        d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));
                    }else{
                        if (null == escaf){
                            d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));
                        }else switch (escaf) {
                            case "IA":
                                d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));
                                break;
                            case "IE":
                                d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w2.png"));
                                break;
                            case "IR":
                                d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));
                                break;
                            case "":
                            default:
                                break;
                        }   
                    }
                    
                    if(esx1 == null || esx1.equals("")){
                        c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));
                    }else{
                        if (null == escx1){
                            c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));
                        }else switch (escx1) {
                            case "IA":
                                c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));
                                break;
                            case "IE":
                                c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w2.png"));
                                break;
                            case "IR":
                                c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));
                                break;
                            case "":
                            default:
                                break;
                        } 
                    }
                    
                    if(esap == null || esap.equals("")){
                        b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));
                    }else{
                        if (null == escap){
                            b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));
                        }else switch (escap) {
                            case "IA":
                                b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));
                                break;
                            case "IE":
                                b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w2.png"));
                                break;
                            case "IR":
                                b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));
                                break;
                            case "":
                            default:
                                break;
                        }
                    }
                    
                    if(espacio == null || espacio.equals("")){
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));
                    }else{
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));
                    }
                    tm.addRow(new Object[]{Reg[0],Reg[1],Reg[2],Reg[3],Reg[4],Reg[5],Reg[6],Reg[7],Reg[8],Reg[9],Reg[10],Reg[11],e,d,c,b,a,Reg[17],Reg[18],Reg[19]});                   

                }//while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } jtblreporte.setModel(tm);       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbCarga;
    private javax.swing.JComboBox<String> jcbcategoria;
    private javax.swing.JComboBox<String> jcbcode;
    private javax.swing.JComboBox<String> jcberror;
    private javax.swing.JComboBox<String> jcbmovimiento;
    private javax.swing.JTable jtblreporte;
    public javax.swing.JLabel lblUserVF;
    private javax.swing.JTextField txtFch1;
    private javax.swing.JTextField txtFch2;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtTerminal;
    private javax.swing.JTextField txtcartaporte;
    private javax.swing.JTextField txtdestinatario;
    private javax.swing.JTextField txtos1;
    private javax.swing.JTextField txtos2;
    private javax.swing.JTextField txtremuni;
    // End of variables declaration//GEN-END:variables
}