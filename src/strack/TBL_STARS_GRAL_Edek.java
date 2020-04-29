package strack;

import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import Clases.ConexionEDI;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class TBL_STARS_GRAL_Edek extends javax.swing.JFrame {

    DefaultTableModel tm=new DefaultTableModel();
    
    private void PropiedadesTabla(){
        JTableStar.setDefaultRenderer(Object.class, new ImgTable());
        String titulos []={"Carta porte", "Servicio", "Proveedor", "Destinatario", "Cita de carga", "LLegada a cargar", "Salida programada de carga", "Salida real de cargar", "Arribo a destino", "Unidad", "Remolque", "Carga", "Mov. x3", "Mov.AF", "Mov.x1", "Mov. AP", "Mov. AG"};
        tm=new DefaultTableModel(null,titulos);             
        JTableStar.setModel(tm);
    }
    
    public TBL_STARS_GRAL_Edek() {
        initComponents();
        setLocationRelativeTo(null);
        PropiedadesTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableStar = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtCF1 = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
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
        jPanel17 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblerror = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtFolio = new javax.swing.JTextField();
        txtFolio2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtTerminal = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtUnidad = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtRem = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtos1 = new javax.swing.JTextField();
        txtos2 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtProveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblUserVF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel14.setText("jLabel14");

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel General de Movimientos (STARS)");
        setMinimumSize(new java.awt.Dimension(400, 800));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Movimientos de Stars", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        JTableStar.setEnabled(false);
        JTableStar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carta porte", "Servicio", "Proveedor", "Destinatario", "Cita de carga", "LLegada a cargar", "Salida programada de carga", "Salida real de cargar", "Arribo a destino", "Unidad", "Remolque", "Carga", "Mov. x3", "Mov.AF", "Mov.x1", "Mov. AP", "Mov. AG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
                //canEdit [columnIndex];
            }
        });
        JTableStar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        JTableStar.getTableHeader().setReorderingAllowed(false);
        JTableStar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableStarMouseClicked(evt);
            }
        });
        this.CorresYaz();
        jScrollPane1.setViewportView(JTableStar);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("Carta porte:");

        txtCF1.setEditable(false);
        txtCF1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtCF1.setBorder(null);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCF1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

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
                .addGap(0, 0, 0)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mov.AP", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 11))); // NOI18N

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cpo.png"))); // NOI18N
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
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addGap(0, 0, 0)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, Short.MAX_VALUE))
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
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel3.setText("Detalles:");

        lblerror.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        lblerror.setForeground(new java.awt.Color(0, 0, 153));
        lblerror.setText("Descripcion de movimientos");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jLabel4.setText("Codigo:");

        txtcode.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        txtcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodeActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cok.png"))); // NOI18N
        jButton6.setToolTipText("Movimiento correcto");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setDefaultCapable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w2.png"))); // NOI18N
        jButton13.setToolTipText("Movimiento aceptado con error");
        jButton13.setBorderPainted(false);
        jButton13.setContentAreaFilled(false);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w1.png"))); // NOI18N
        jButton23.setToolTipText("Movimiento con error fatal");
        jButton23.setBorderPainted(false);
        jButton23.setContentAreaFilled(false);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w3.png"))); // NOI18N
        jButton24.setToolTipText("Movimiento en espera de acuse");
        jButton24.setBorderPainted(false);
        jButton24.setContentAreaFilled(false);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cc.png"))); // NOI18N
        jButton25.setToolTipText("Movimiento no procesado");
        jButton25.setBorderPainted(false);
        jButton25.setContentAreaFilled(false);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/e.png"))); // NOI18N
        jButton26.setToolTipText("Movimiento de ETA");
        jButton26.setBorderPainted(false);
        jButton26.setContentAreaFilled(false);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/stal.png"))); // NOI18N
        jButton27.setToolTipText("Movimiento cancelado en espera de acuse");
        jButton27.setBorderPainted(false);
        jButton27.setContentAreaFilled(false);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblerror, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtcode)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/002-reloj.png"))); // NOI18N
        jButton4.setToolTipText("Stars automatico");
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

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/semaforo.png"))); // NOI18N
        jButton21.setToolTipText("Vista de AP");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
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

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sello.png"))); // NOI18N
        jButton22.setToolTipText("Agregar moviento anterior");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/002-calendario.png"))); // NOI18N
        jButton28.setToolTipText("Registra movimientos");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtFolio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFolioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Folio:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(txtFolio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Terminal:");

        txtTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTerminalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5)
            .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Unidad:");

        txtUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7)
            .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Remolque:");

        txtRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRem, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
            .addComponent(txtRem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Cita de Carga:");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtos1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtos2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Proveedor:");

        txtProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProveedorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13)
            .addComponent(txtProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel10)
                                .addGap(10, 10, 10)
                                .addComponent(lblUserVF))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
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
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserx3C();            
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(!txtCF1.getText().equals("")){ 
            validauserRegistroap();
        }else {
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserCancelaap();            
        }else {
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tbl_cpo_stars cpos=new tbl_cpo_stars();
        cpos.lblUserVF.setText(lblUserVF.getText());
        cpos.setVisible(true);
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
        lblerror.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            MenuStars ms=new MenuStars();
            ms.txtUserf1.setText(lblUserVF.getText());
            ms.setVisible(true);
            this.setVisible(false); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtFolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFolioActionPerformed
        limpiartblx3();
        limpiartblx3();
        lblerror.setText("");
        query="SELECT * FROM vtbl_asig_stars_global WHERE folio='"+txtFolio.getText()+"' order by fecha_carga asc";
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(query);
                if(rs1.next() == true){
                    ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);   
                    Detallesmovimiento();
                }else {
                    txtCF1.setText("");
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_txtFolioActionPerformed

    private void txtProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProveedorActionPerformed
        limpiartblx3();
        limpiartblx3();
        query="SELECT * FROM vtbl_asig_stars_global WHERE nom_origen like '%"+txtProveedor.getText()+"%' order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);   
        txtCF1.setText("");
    }//GEN-LAST:event_txtProveedorActionPerformed
    
    String cx1, ap1, fe;
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
            final Runnable tarea=new Runnable() {
            @Override
            public void run() {
                Connection miConexion =(Connection)ConexionEDI.GetConnection();
                try {
                   Statement statement =(Statement)miConexion.createStatement();
                    ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X1_STATUS_1\n" +
                    " inner join TBL_REG_CPO\n" +
                    "on VALOR_CLI_RUBRO1= CPO\n" +
                    "where ArchivoAF='creado' and Archivox1 is null and (CategoriaAF is not null or CategoriaAF !='ir') \n" +
                    "and \n" +
                    "( limite between DATEADD(MINUTE,-lim_antes,GETDATE()) and GETDATE()\n" +
                    "or limite between DATEADD(MINUTE,+lim_desp,GETDATE()) and GETDATE()\n" +
                    ") and alerta ='1' and estado='activo'");                   
//                    ResultSet rs1 = statement.executeQuery(""
//                            + "select * from vtbl_reg_x1_status_1 \n" +
//"where ArchivoAF='creado' and Archivox1 is null and (CategoriaAF is not null or CategoriaAF !='IR') \n" +
//"and (limite between DATEADD(MINUTE,-30,GETDATE()) and GETDATE()\n" +
//"or limite between DATEADD(MINUTE,+60,GETDATE()) and GETDATE())");
//                    ResultSet rs1 = statement.executeQuery("select * from vtbl_reg_x1_status_1 where ArchivoAF='creado' and Archivox1 is null and (CategoriaAF is not null or CategoriaAF !='IR')");
                        while( rs1.next() ){
                            fe=rs1.getString("cartaporteaf");
                            formularioemergente();
                        }//while
                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo. 2","Error",JOptionPane.ERROR_MESSAGE);
                }  
                //JOptionPane.showMessageDialog(null, "actualizar eta","Informativo",JOptionPane.INFORMATION_MESSAGE);
            }
        };
        ScheduledExecutorService timer= Executors.newSingleThreadScheduledExecutor();
        timer.scheduleAtFixedRate(tarea,5,5, TimeUnit.MINUTES);
        
        lblerror.setText("");
        limpiartblx3();
        comparacionesql();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void JTableStarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableStarMouseClicked
        try {
            SelecionaRegistro() ;
        } catch (IOException ex) {
            Logger.getLogger(TBL_STARS_GRAL_Edek.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JTableStarMouseClicked

    private void txtRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRemActionPerformed
        limpiartblx3();
        query="SELECT * FROM vtbl_asig_stars_global WHERE rem1='"+txtRem.getText()+"' order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1); 
        txtCF1.setText("");
    }//GEN-LAST:event_txtRemActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserx3E();            
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserEap();            
        }else {
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserAFR();           
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserAFE();           
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserxAF();   
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserAG();   
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserx1R();           
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        if(!txtCF1.getText().equals("")){
            validauserx1E();           
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);;
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        if(!txtCF1.getText().equals("")){
           validauserx1();        
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        if(!txtCF1.getText().equals("")){
            vmap();    
        }else{
            JOptionPane.showMessageDialog(null, "No se ha indicado una carta porte","Informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton21ActionPerformed
    
    String respuesta ;
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        FechaSit();
        respuesta = JOptionPane.showInputDialog("Carta porte a registrar:");                  
        if("null".equals(respuesta) || respuesta == null || respuesta.equals("null") || respuesta.equals("")){                                           
            JOptionPane.showMessageDialog(null,"No existe entrada de datos","Infomativo",JOptionPane.INFORMATION_MESSAGE);
        }else {
            int i =JOptionPane.showConfirmDialog(this, "Confirma la carta porte: "+"\n"+" '"+respuesta+"'? ",
                "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(i == 0){
                try { 
                    vcpoexistencia();
                } catch (ParseException ex) {
                    Logger.getLogger(TBL_STARS_GRAL_Edek.class.getName()).log(Level.SEVERE, null, ex);
                }
                }else if(i == 1){
                    JOptionPane.showMessageDialog(null,"Solicitud cancelada","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }           
        }  
    }//GEN-LAST:event_jButton22ActionPerformed

    private void txtTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTerminalActionPerformed
        limpiartblx3();
        query="SELECT * FROM vtbl_asig_stars_global WHERE terminal='"+txtTerminal.getText()+"' order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);
        txtCF1.setText("");
    }//GEN-LAST:event_txtTerminalActionPerformed

    private void txtUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnidadActionPerformed
        limpiartblx3();
        query="SELECT * FROM vtbl_asig_stars_global WHERE unidad='"+txtUnidad.getText()+"' order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1); 
        txtCF1.setText("");
    }//GEN-LAST:event_txtUnidadActionPerformed

    private void txtcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodeActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_CODERROR where transaccion='214' and code_error='"+txtcode.getText()+"'");
                if(rs1.next() == true){
                   JOptionPane.showMessageDialog(null, rs1.getString("descripcion"),"Informativo",JOptionPane.INFORMATION_MESSAGE);
                   lblerror.setText("");
                   txtcode.setText("");
                }else {
                    JOptionPane.showMessageDialog(null,"El código de error no existe","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_txtcodeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiartblx3();        
        query="select * from  vtbl_asig_stars_global where  (mx1='x' and cx1 ='ia') or (maf='x' and caf='ia') or (mx3='x' and cx3 ='ia') or(cap='x' and ctap='ia') order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);   
        lblerror.setText("");
        txtCF1.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        limpiartblx3();
        lblerror.setText("");
        query="select * from  vtbl_asig_stars_global where  (mx1='x' and cx1 ='ie') or (maf='x' and caf='ie') or (mx3='x' and cx3 ='ie') or(cap='x' and ctap='ie') order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1); 
        lblerror.setText("");
        txtCF1.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        limpiartblx3();
        lblerror.setText("");
        query="select * from  vtbl_asig_stars_global where  (mx1='x' and cx1 ='ir') or (maf='x' and caf='ir') or (mx3='x' and cx3 ='ir') or(cap='x' and ctap='ir') order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1); 
        lblerror.setText("");
        txtCF1.setText("");
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        limpiartblx3();
        lblerror.setText("");
        query="select * from  vtbl_asig_stars_global where  (mx1='x' and cx1 is null) or (maf='x' and caf is null) or (mx3='x' and cx3 is null) or(cap='x' and ctap is null) order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);   
        lblerror.setText("");
        txtCF1.setText("");
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        limpiartblx3();
        lblerror.setText("");
        query="select * from  vtbl_asig_stars_global where  (mx1 is null) and (maf is null) and (mx3 is null) and (cap is null) order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);   
        lblerror.setText("");
        txtCF1.setText("");
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        limpiartblx3();
        lblerror.setText("");
        query="select * from  vtbl_asig_stars_global where  (mx1='xx' ) or (maf='xx') or (mx3='xx') or(cap='xx') order by fecha_carga asc";
        ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);   
        lblerror.setText("");
        txtCF1.setText("");
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where usuario='"+lblUserVF.getText()+"' ");
                if(rs1.next() == true){
                    if(rs1.getString("usuario").toUpperCase().equals("YAZMIN") || rs1.getString("usuario").toUpperCase().equals("JANTONIO")){
                        tbl_sregistro_mov canven=new tbl_sregistro_mov();
                        canven.txtUserf1.setText(lblUserVF.getText());
                        canven.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null,"Acceso denegado", "Advertencia",JOptionPane.WARNING_MESSAGE);
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"Acceso denegado", "Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButton28ActionPerformed
    
    public void vcpoexistencia() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where cartaportex3='"+respuesta+"'");
                if(rs1.next() == true){
                   vcpoproceso();
                }else {
                    JOptionPane.showMessageDialog(null,"La carta porte no existe.","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void vcpoproceso() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where (Archivox3 is null or Archivox3 !='creado') and (AP50 is null or AP50 !='ap-aplicado') and cartaportex3='"+respuesta+"'");
                if(rs1.next() == true){
                   Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                    try {
                    Statement statement1 =(Statement)miConexion1.createStatement();
                    ResultSet rsa1 = statement1.executeQuery("select * from  tbl_asig_gst where cartaporte='"+respuesta+"'");
                        if(rsa1.next() == true){
                            upcitas();
                        }else {
                            cpregistrar();
                        }
                    } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }else {
                    JOptionPane.showMessageDialog(null,"La carta porte presenta un proceso de stars","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cpregistrar() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from vtbl_carga_general_stars_hps where cartaportex3='"+respuesta+"'");
                if(rs1.next() == true){
                    String a=rs1.getString("cartaportex3");
                    String b=rs1.getString("tipo_movimiento_descrip");
                    String c=rs1.getString("nom_origen");
                    String d=rs1.getString("nom_destino");
                    String g=rs1.getString("unidad");
                    String h=rs1.getString("rem1");
                    String i=rs1.getString("tipocarga");
                    String j=rs1.getString("ter_carta");
                    String k=rs1.getString("folio_carta");
                    Integer folio= Integer.parseInt(k);
                    try {
                        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                        Statement statement1 =(Statement)miConexion.createStatement();
                        statement.execute("INSERT INTO tbl_asig_gst(cartaporte,tipo_movimiento_descrip,nom_origen,nom_destino,unidad,rem1,tipocarga,terminal,folio) "
                        + "values ('"+a+"','"+b+"','"+c+"','"+d+"','"+g+"','"+h+"','"+i+"','"+j+"','"+folio+"')");
                        updatecita();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                    } 
                }else {
                    JOptionPane.showMessageDialog(null,"No se encontro registro de la solicitud","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void updatecita()throws SQLException, ParseException{   
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchAF;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }            
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set fecha_carga=?,salida_programada=? where Cartaporte='"+respuesta+"'");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.setTimestamp(2,timestamp);
                    stp.executeUpdate();  
                    upcitasx3();
                    JOptionPane.showMessageDialog(null,"Registro cargado. Considere que las cita y salida son actuales.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }  
    } 
    
    String creado,error,ap2;
    public void SelecionaRegistro() throws IOException{
//        int FilaSeleccionada;
//        try {
//            FilaSeleccionada = JTableStar.getSelectedRow();
//            if(FilaSeleccionada ==-1){
//                JOptionPane.showMessageDialog(null,"Seleccione un registro","Informativo",JOptionPane.INFORMATION_MESSAGE);
//            }else{
//                DefaultTableModel model=(DefaultTableModel)JTableStar.getModel();
//                String id =(String)model.getValueAt(FilaSeleccionada,0);
//                 txtCF1.setText(id);
//                Detallesmovimiento();
//            }
//        } catch (HeadlessException ex) {
//           JOptionPane.showMessageDialog(null,"Excepción no controlada","Error",JOptionPane.ERROR_MESSAGE);
//        }
    }
    
    /*Detalles de movimientos*/
    public void Detallesmovimiento(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from tbl_asig_gst where cartaporte='"+txtCF1.getText()+"' and (mx3 is not null or cap is not null)");
                if(rs1.next() == true){
                    String a="x3: "+ rs1.getString("cx3")+" "+rs1.getString("ex3")+"     AF: "+rs1.getString("caf")+" "+rs1.getString("eaf")+"     x1: "+rs1.getString("cx1")+" "+rs1.getString("ex1")+"     AP: "+rs1.getString("ctap")+" "+rs1.getString("eap")+"     AG: "+rs1.getString("cag");
                    lblerror.setText(a.replace("null","")); 
                }else {
                    lblerror.setText("");
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void limpiartblx3(){
        DefaultTableModel model=(DefaultTableModel) JTableStar.getModel();
    	for (int i=0; i<JTableStar.getRowCount(); i++){
    		model.removeRow(i);
    		i-=1;
    	}
    }
    
    String query;
    public void comparacionesql(){
        limpiartblx3();
        if(! txtFolio.getText().equals("") && (txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && txtRem.getText().equals("") && txtProveedor.getText().equals("") &&  txtos1.getText().equals("") && txtos2.getText().equals("")) )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global WHERE folio='"+txtFolio.getText()+"' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);
        }else if( (!txtFolio.getText().equals("") && !txtFolio2.getText().equals("")) && (txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && txtRem.getText().equals("") && txtProveedor.getText().equals("") &&  txtos1.getText().equals("") && txtos2.getText().equals("")) )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global WHERE folio between '"+txtFolio.getText()+"' and '"+txtFolio2.getText()+"'  order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);    
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && (!txtTerminal.getText().equals("")) && (txtUnidad.getText().equals("") && txtRem.getText().equals("") && txtProveedor.getText().equals("") &&  txtos1.getText().equals("") && txtos2.getText().equals("")) )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global WHERE terminal='"+txtTerminal.getText()+"' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);    
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && (!txtUnidad.getText().equals("")) && (txtRem.getText().equals("") && txtProveedor.getText().equals("") &&  txtos1.getText().equals("") && txtos2.getText().equals("")) )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global WHERE unidad='"+txtUnidad.getText()+"' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);    
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && (!txtRem.getText().equals("")) && (txtProveedor.getText().equals("") &&  txtos1.getText().equals("") && txtos2.getText().equals("")) )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global WHERE rem1='"+txtRem.getText()+"' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);    
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && txtRem.getText().equals("") && (!txtProveedor.getText().equals("")) &&  (txtos1.getText().equals("") && txtos2.getText().equals("")) )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global WHERE nom_origen like'%"+txtProveedor.getText()+"%' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);   
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && txtRem.getText().equals("") && txtProveedor.getText().equals("") &&  (!txtos1.getText().equals("") && !txtos2.getText().equals("")) )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global WHERE  fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);    
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && (!txtTerminal.getText().equals("") && !txtUnidad.getText().equals("")) && txtRem.getText().equals("") && txtProveedor.getText().equals("") &&  txtos1.getText().equals("") && txtos2.getText().equals("") )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global where terminal='"+txtTerminal.getText()+"' and unidad='"+txtUnidad.getText()+"' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && (!txtTerminal.getText().equals("")) && txtUnidad.getText().equals("") && (!txtRem.getText().equals("")) && txtProveedor.getText().equals("") &&  txtos1.getText().equals("") && txtos2.getText().equals("") )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global where terminal='"+txtTerminal.getText()+"' and rem1='"+txtRem.getText()+"' order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && (!txtTerminal.getText().equals("")) && txtUnidad.getText().equals("") && txtRem.getText().equals("") && txtProveedor.getText().equals("") &&  (!txtos1.getText().equals("") && !txtos2.getText().equals("")) )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global WHERE terminal='"+txtTerminal.getText()+"' and fecha_carga between convert(datetime,'"+txtos1.getText()+" 00:00:00.000') and convert(datetime,'"+txtos2.getText()+" 23:59:59.000') order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);    
            txtCF1.setText("");
        }else if( txtFolio.getText().equals("") && txtFolio2.getText().equals("") && txtTerminal.getText().equals("") && txtUnidad.getText().equals("") && txtRem.getText().equals("") && txtProveedor.getText().equals("") &&  txtos1.getText().equals("") && txtos2.getText().equals("") )  {
            limpiartblx3();
            query="SELECT * FROM vtbl_asig_stars_global order by fecha_carga asc";
            ConsultaX3(creado, respuesta, error, respuesta, fchAF, creado, creado, creado, creado, creado, cx1, error, cx1, f, cx1, cx1, cx1);
            txtCF1.setText("");
        }
    }
    
    JLabel a,b,c,d,e;
    public void ConsultaX3(String cartaporte ,String tipo_movimiento_descrip ,
        String nom_origen ,String nom_destino ,String fecha_carga ,String fecha_real_carga ,
        String salida_programada ,String fecha_real_salida ,String fecha_real_destino ,String unidad ,
        String rem1 ,String tipocarga, String mx3 ,String maf ,String mx1 ,String cap ,String mag ){
        limpiartblx3();
        
        String agp="";
        String espacio1="";
        
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
        
        String frc="";
        String efrc="";
        
        String frs="";
        String efrs="";
        
        String fsp="";
        String efsp="";
        
        String frd="";
        String efrd="";
        
        JTableStar.setDefaultRenderer(Object.class, new ImgTable());
        String [] Reg=new String[21];      
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(query);
                while (rs1.next()) {
                    Reg[0]=rs1.getString("Cartaporte"); 
                    txtCF1.setText(rs1.getString("Cartaporte"));
                    Reg[1]=rs1.getString("tipo_movimiento_descrip");
                    Reg[2]=rs1.getString("nom_origen");
                    Reg[3]=rs1.getString("nom_destino");
                    Reg[4]=rs1.getString("fecha_carga").substring(0,16);
                    //Reg[5]=rs1.getString("fecha_real_carga");
                    //Reg[6]=rs1.getString("salida_programada").substring(0,16);
                    //Reg[7]=rs1.getString("fecha_real_salida");
                    //Reg[8]=rs1.getString("fecha_real_destino");
                    Reg[9]=rs1.getString("unidad");
                    Reg[10]=rs1.getString("rem1");
                    Reg[11]=rs1.getString("tipocarga");
                    
                    frd=rs1.getString("fecha_real_destino");
                    efrd=frd;
                    
                    fsp=rs1.getString("salida_programada");
                    efsp=fsp;
                    
                    frc=rs1.getString("fecha_real_carga");
                    efrc=frc;
                    
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
                    
                    agp=rs1.getString("spe");
                    espacio1=agp;
                    
                    if(efrd == null || efrd.equals("")){
                        efrd="";
                    }else{
                        efrd=efrd.substring(0,16);
                    }    
                    
                    if(efrc == null || efrc.equals("")){
                        efrc="";
                    }else{
                        efrc=efrc.substring(0,16);
                    }
                    
                    if(efrs == null || efrs.equals("")){
                        efrs="";
                    }else{
                        efrs=efrs.substring(0,16);
                    }
                    
                    if(efsp == null || efsp.equals("")){
                        efsp="";
                    }else{
                        efsp=efsp.substring(0,16);
                    }
                                        
                    if(esx3 == null || esx3.equals("")){
                        e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));                        
                    }else if(esx3 == "xx" || esx3.equals("xx")){
                        e=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\stal.png"));
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
                    }else if(esaf == "xx" || esaf.equals("xx")){
                        d=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\stal.png"));
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
                    }else if(esx1 == "xx" || esx1.equals("xx")){
                        c=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\stal.png"));
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
                    }else if(esap == "xx" || esap.equals("xx")){
                        b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\stal.png"));
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
                    
                    if(espacio1 == null || espacio1.equals("")){
                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cc.png"));
                    }else if ( espacio1.equals("x")){
                        if (null == escx1){
                            a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\e.png")); 
                        }else{
                            a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\e1.png"));
                        }                      
                    }                    
                    tm.addRow(new Object[]{Reg[0],Reg[1],Reg[2],Reg[3],Reg[4],efrc,efsp,efrs,efrd,Reg[9],Reg[10],Reg[11],e,d,c,b,a});                   

                }//while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } JTableStar.setModel(tm);

    }
        
    /*Movimiento x3*/
    public void validauserx3R(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsr='1' and Estado='activo'");
                if(rs1.next() == true){
                    Validarstatusx3c();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    } 
    
    String movr;
    public void Validarstatusx3c(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' order by idst desc");
            if(rs1.next() == true){   
              if(rs1.getString("mov").equals("Mov.AF")||rs1.getString("mov").equals("Mov.AP")||rs1.getString("mov").equals("Mov.x3")){
                  movr=rs1.getString("mov");
                  validaudcancelapX3();
              }else if (rs1.getString("mov").equals("Mov.x1")){
                  Validarstatus();
              }
            }else {
                Validarstatus();                   
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
        
    public void validaudcancelapX3(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and mov='"+movr+"' and categoria is not null");
                if(rs1.next() == true){
                    if(rs1.getString("categoria").equals("IA") || rs1.getString("categoria").equals("IE") ){
                        Validarstatus();
                    }else{
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                    }                    
                }else {
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void Validarstatus(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where stcp='0' and (Archivox3 is null or Archivox3 !='creado') and (AP50 is null or AP50 !='ap-aplicado') and Cartaportex3='"+txtCF1.getText()+"'");
                if(rs1.next() == true){   
                        Stmx3 x3=new Stmx3();
        Connection miConexionx3 =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statementx3 =(Statement)miConexionx3.createStatement();
            ResultSet rx3 = statementx3.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"' AND unidad IS NOT NULL");
                if(rx3.next() == true){
                    if(rx3.getString("rem1").trim().equals("") || rx3.getString("rem1").trim().equals(null) || rx3.getString("rem1").trim()==null){
                        JOptionPane.showMessageDialog(null, "Los datos no son consistentes en el remolque","Advertencia",JOptionPane.WARNING_MESSAGE);
                        ActionEvent evt = null;
                        exitForm(evt); 
                    }else{
                        x3.txtRem1.setText(rx3.getString("rem1").trim());
                        x3.txtTracto.setText(rx3.getString("unidad").trim());
                        x3.txtFchCarga.setText(rx3.getString("fchx3"));
                        x3.txtHrCarga.setText(rx3.getString("Hrx3"));
                        x3.txtZh.setText(rx3.getString("zhx3").trim());
                        x3.txtCPO.setText(rx3.getString("VALOR_CLI_RUBRO1").replaceAll("CPO|cpo","").trim());
                        x3.idx3=rx3.getString("id_x3");
                    Connection miConexioncx3 =(Connection)ConexionEDI.GetConnection();
                    try {
                       Statement statementcx3 =(Statement)miConexioncx3.createStatement();
                       ResultSet rscx3 = statementcx3.executeQuery("select * from TBL_Reg_CPO where CPO ='"+x3.txtCPO.getText()+"' and estado ='ACTIVO' and hrstrans is not null");
                            if(rscx3.next() == true){
                                x3.txtTcarga2.setText(rscx3.getString("tipocarga").trim());
                                x3.txtPeso2.setText(rscx3.getString("peso").trim());
                                x3.txtRemitente.setText(rscx3.getString("nom_origen").trim());
                                x3.txtdesinatario.setText(rscx3.getString("nom_destino").trim());
                                x3.txtTransporte.setText(rscx3.getString("modo"));  
                                x3.txtOrigen2=rscx3.getString("cod_origen").trim();
                                x3.txtDestino2=rscx3.getString("cod_destino").trim();
                                x3.txtCDrem=rscx3.getString("cd_origen").trim();
                                x3.txtcddestino=rscx3.getString("cd_destino").trim();
                                x3.recorrido=rscx3.getString("hrstransito").trim();
                                x3.txtUserf1.setText(lblUserVF.getText());
                        x3.txtCartax3.setText(txtCF1.getText());
                        x3.setVisible(true); 
                            }else {
                                JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                //ActionEvent evt = null;
                                //exitForm(evt); 
                            }
                    } catch (HeadlessException | SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                    }                    
                    }                      
                }else {
                    JOptionPane.showMessageDialog(null, "Los datos no son consistentes en la unidad o remolque ","Advertencia",JOptionPane.WARNING_MESSAGE);
                    //ActionEvent evt = null;
                    //exitForm(evt); 
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }                              
                }else {
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }    

    /*Editar Movimiento x3*/
    public void validauserx3E(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starse='1' and Estado='activo'");
                if(rs1.next() == true){
                   ValidarEditarx3();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    } 
    
    public void ValidarEditarx3(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
//            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Archivox3='CREADO' and (Categoria ='IR') and cartaportex3='"+txtCF1.getText()+"'");
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Archivox3='CREADO' and (Categoria ='IR') and Error!='710' and cartaportex3='"+txtCF1.getText()+"'");           
                if(rs1.next() == true){
                        Smtx3Editar x3=new Smtx3Editar();
                        Connection miConexionedx3 =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementex3 =(Statement)miConexionedx3.createStatement();
                            ResultSet rex3 =statementex3.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"' and Archivox3='creado'");
                                if(rex3.next() == true){
                                    x3.txtRem1.setText(rex3.getString("rem1").trim());
                                    x3.txtCPO.setText(rex3.getString("VALOR_CLI_RUBRO1").replaceAll("CPO|cpo","").trim());
                                    x3.txtTracto.setText(rex3.getString("unidad").trim());
                                    x3.idx3=rex3.getString("id_x3");
                                    x3.txtFchCarga.setText(rex3.getString("fchx3"));
                                    x3.txtHrCarga.setText(rex3.getString("Hrx3"));
                                    x3.txtZh.setText(rex3.getString("zhx3").trim());   

                        Connection miConexionecx3 =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementcx3 =(Statement)miConexionecx3.createStatement();
                           ResultSet rcx3 =statementcx3.executeQuery("select * from TBL_Reg_CPO where CPO ='"+x3.txtCPO.getText()+"' and estado ='ACTIVO'");
                                if(rcx3.next() == true){
                                    x3.txtOrigen2=rcx3.getString("cod_origen").trim();
                                    x3.txtDestino2=rcx3.getString("cod_destino").trim();
                                    x3.txtTcarga2.setText(rcx3.getString("tipocarga").trim());
                                    x3.txtPeso2.setText(rcx3.getString("peso").trim());
                                    x3.txtRemitente.setText(rcx3.getString("nom_origen").trim());
                                    x3.txtCDrem=rcx3.getString("cd_origen").trim();
                                    x3.txtdesinatario.setText(rcx3.getString("nom_destino").trim());
                                    x3.txtcddestino=rcx3.getString("cd_destino").trim();
                                    x3.recorrido=rcx3.getString("hrstransito").trim();
                                    x3.txtTransporte.setText(rcx3.getString("modo"));                    
                                }else {
                                    JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                    ActionEvent evt = null;
                                    exitForm(evt); 
                                }
                        } catch (HeadlessException | SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        } 
                    }else {
                        JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        ActionEvent evt = null;
                        exitForm(evt); 
                    }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }                         
                            x3.txtUserf1.setText(lblUserVF.getText());
                            x3.txtCartax3.setText(txtCF1.getText());
                            x3.setVisible(true);                    
                }else {
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /*Cancelar movimiento x3*/
    public void validauserx3C(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsc='1' and Estado='activo'");
                if(rs1.next() == true){
                    ValidarCancelarx3();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    } 
    
    public void ValidarCancelarx3(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Archivox3='CREADO' and (Categoria ='ia' or Categoria='ie') and actual <= diax3 and Cartaportex3='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                    ValidaCancelarafcancel();
                }else {
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }  
    
    public void ValidaCancelarafcancel(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"'");
                if(rs1.next() == true){ 
                    a10();
                }else{
                   vrAFc();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void a10(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AP'");
            if(rs1.next() == true){
                Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                try {
                    Statement statement1 =(Statement)miConexion1.createStatement();
                    ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AP' and categoria is not null");
                    if(rs11.next() == true){
                        if (rs11.getString("Categoria").equals("IA") || rs11.getString("Categoria").equals("IE")){
                            a20();
                        } else{
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                                                            
                    }else {    
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE); 
                    }
                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }                                     
            }else {   
                a20();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void a20(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AF'");
            if(rs1.next() == true){
                Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                try {
                    Statement statement1 =(Statement)miConexion1.createStatement();
                    ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AF' and categoria is not null");
                    if(rs11.next() == true){
                        if (rs11.getString("Categoria").equals("IA") || rs11.getString("Categoria").equals("IE")){
                            a30();
                        } else{
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                                                           
                    }else {    
                       JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);   
                    }
                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }                                     
            }else {    
                a30();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void a30(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.x3'");
            if(rs1.next() == true){
                Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                try {
                    Statement statement1 =(Statement)miConexion1.createStatement();
                    ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.x3' and categoria is not null");
                    if(rs11.next() == true){
                        if (rs11.getString("Categoria").equals("IA") || rs11.getString("Categoria").equals("IE")){
                            vrAFc();
                        } else{                            
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                                                           
                    }else {    
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);  
                    }
                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }                                     
            }else {  
                vrAFc();
               //JOptionPane.showMessageDialog(null,"La carta porte no se puede procesar","Advertencia",JOptionPane.WARNING_MESSAGE);  
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void vrAFc(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where archivox3='CREADO' and (ap50 is null or ap50!='AP-APLICADO') AND (Categoria ='IA' OR Categoria='IE') and (ArchivoAF !='creado' or ArchivoAF is null) and CartaporteAF='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                        Connection miConexioncx3 =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementcx3 =(Statement)miConexioncx3.createStatement();
                            ResultSet cx3 = statementcx3.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"' and archivox3='CREADO'");
                                if(cx3.next() == true){
                        Smtx3Cancel x3=new Smtx3Cancel();                                    
                                    x3.txtTerminal.setText(cx3.getString("ter_carta").trim());
                                    x3.txtRem1.setText(cx3.getString("remolquex3").trim());
                                    x3.txtCPO.setText(cx3.getString("VALOR_CLI_RUBRO1").replaceAll("CPO|cpo","").trim());
                                    x3.txtFCarta.setText(cx3.getString("folio_carta").trim());
                                    x3.txtTracto.setText(cx3.getString("unidadX3").trim()); 
                                    x3.txtFchCarga.setText(cx3.getString("FCHX3").trim());
                                    x3.txtHrCarga.setText(cx3.getString("HRX3").trim());
                                    x3.txtTransporte.setText(cx3.getString("EQUIPO").trim());
                                    x3.txtEvento.setText(cx3.getString("REASONCODEX3").trim());
                                    x3.txtZh.setText(cx3.getString("ZHX3").trim());      
                                    Connection miConexionx3 =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementx3r =(Statement)miConexionx3.createStatement();
                                       ResultSet x3r = statementx3r.executeQuery("select * from TBL_Reg_CPO where CPO ='"+x3.txtCPO.getText()+"' and estado ='ACTIVO'");
                                            if(x3r.next() == true){
                                                x3.txtOrigen2.setText(x3r.getString("cod_origen").trim());
                                                x3.txtDestino2.setText(x3r.getString("cod_destino").trim());
                                                x3.txtTcarga2.setText(x3r.getString("tipocarga").trim());
                                                x3.txtPeso2.setText(x3r.getString("peso").trim());
                                                x3.txtRemitente.setText(x3r.getString("nom_origen").trim());
                                                x3.txtCDrem.setText(x3r.getString("cd_origen").trim());
                                                x3.txtdesinatario.setText(x3r.getString("nom_destino").trim());
                                                x3.txtcddestino.setText(x3r.getString("cd_destino").trim());   
                        x3.txtUserf1.setText(lblUserVF.getText());
                        x3.txtCartax3.setText(txtCF1.getText());
                        x3.setVisible(true);                                                 
                                            }else {
                                                JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                ActionEvent evt = null;
                                                exitForm(evt); 
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    }    
                                }else {
                                    JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                    ActionEvent evt = null;
                                    exitForm(evt); 
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                                        
                }else{ 
                    vrAFcaf();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public void vrAFcaf(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where ArchivoAF ='CREADO'  AND categoriaaf='IR'  and CartaporteAF='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                        Connection miConexioncx3 =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementcx3 =(Statement)miConexioncx3.createStatement();
                            ResultSet cx3 = statementcx3.executeQuery("select * from VTBL_REG_X3_STATUS_1 where Cartaportex3='"+txtCF1.getText()+"' and archivox3='CREADO'");
                                if(cx3.next() == true){
                        Smtx3Cancel x3=new Smtx3Cancel();                                    
                                    x3.txtTerminal.setText(cx3.getString("ter_carta").trim());
                                    x3.txtRem1.setText(cx3.getString("remolquex3").trim());
                                    x3.txtCPO.setText(cx3.getString("VALOR_CLI_RUBRO1").replaceAll("CPO|cpo","").trim());
                                    x3.txtFCarta.setText(cx3.getString("folio_carta").trim());
                                    x3.txtTracto.setText(cx3.getString("unidadX3").trim()); 
                                    x3.txtFchCarga.setText(cx3.getString("FCHX3").trim());
                                    x3.txtHrCarga.setText(cx3.getString("HRX3").trim());
                                    x3.txtTransporte.setText(cx3.getString("EQUIPO").trim());
                                    x3.txtEvento.setText(cx3.getString("REASONCODEX3").trim());
                                    x3.txtZh.setText(cx3.getString("ZHX3").trim());      
                                    Connection miConexionx3 =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementx3r =(Statement)miConexionx3.createStatement();
                                       ResultSet x3r = statementx3r.executeQuery("select * from TBL_Reg_CPO where CPO ='"+x3.txtCPO.getText()+"' and estado ='ACTIVO'");
                                            if(x3r.next() == true){
                                                x3.txtOrigen2.setText(x3r.getString("cod_origen").trim());
                                                x3.txtDestino2.setText(x3r.getString("cod_destino").trim());
                                                x3.txtTcarga2.setText(x3r.getString("tipocarga").trim());
                                                x3.txtPeso2.setText(x3r.getString("peso").trim());
                                                x3.txtRemitente.setText(x3r.getString("nom_origen").trim());
                                                x3.txtCDrem.setText(x3r.getString("cd_origen").trim());
                                                x3.txtdesinatario.setText(x3r.getString("nom_destino").trim());
                                                x3.txtcddestino.setText(x3r.getString("cd_destino").trim());    
                        x3.txtUserf1.setText(lblUserVF.getText());
                        x3.txtCartax3.setText(txtCF1.getText());
                        x3.setVisible(true);                                                   
                                            }else {
                                                JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                ActionEvent evt = null;
                                                exitForm(evt); 
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    }    
                                }else {
                                    JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                   // ActionEvent evt = null;
                                    //exitForm(evt); 
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                          
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }    
    
    /*Movimiento AP*/
    public void validauserRegistroap(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  staps='1' and Estado='activo'");
                if(rs1.next() == true){
                    validaudcancelaf();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
        
    public void validaudcancelaf(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"'");
            if(rs1.next() == true){
                c10();                                    
            }else {    
                validaudcancelap();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }           
    }
    
    public void c10(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AF'");
            if(rs1.next() == true){
                Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                try {
                    Statement statement1 =(Statement)miConexion1.createStatement();
                    ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AF' and categoria is not null ");
                    if(rs11.next() == true){
                        if (rs11.getString("Categoria").equals("IA") || rs11.getString("Categoria").equals("IE")){
                            c20();
                        } else{
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                                     
                    }else {    
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                    }
                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }                                     
            }else {    
                c20();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void c20(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AP'");
            if(rs1.next() == true){
                Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                try {
                    Statement statement1 =(Statement)miConexion1.createStatement();
                    ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AP' and categoria is not null ");
                    if(rs11.next() == true){
                        if (rs11.getString("Categoria").equals("IA") || rs11.getString("Categoria").equals("IE")){
                            c30();
                        } else{
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                                     
                    }else {    
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                    }
                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }                                     
            }else {    
                c30();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void c30(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.x3'");
            if(rs1.next() == true){
                Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                try {
                    Statement statement1 =(Statement)miConexion1.createStatement();
                    ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.x3' and categoria is not null ");
                    if(rs11.next() == true){
                        if (rs11.getString("Categoria").equals("IA") || rs11.getString("Categoria").equals("IE")){
                            validaudcancelap();
                        } else{
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                                     
                    }else {    
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                    }
                } catch (HeadlessException | SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }                                     
            }else {    
                validaudcancelap();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void validaudcancelap(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AP'");
                if(rs1.next() == true){
                    if(rs1.getString("categoria").equals("IA") || rs1.getString("categoria").equals("IE") ){
                        APnuevoV();
                    }else{
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                    }                    
                }else {  
                   APnuevoV();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void APnuevoV(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 WHERE stcp='0' and (Archivox3 is null or Archivox3 !='CREADO') and (AP50 is null or AP50!='ap-aplicado') and cartaportex3='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                    int i =JOptionPane.showConfirmDialog(this, "Confirma la cancelación de ventana: "+"\n"+" '"+txtCF1.getText()+"'? ",
                    "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if(i == 0){
                        Connection miConexionap =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementap =(Statement)miConexionap.createStatement();
                            ResultSet rap = statementap.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"' and (Archivox3 is null or Archivox3 !='CREADO')");
                                if(rap.next() == true){
                        Smtapv apv=new Smtapv();                                    
                                    apv.txtTerminal.setText(rap.getString("ter_carta").trim());
                                    apv.txtRem1.setText(rap.getString("rem1").trim());
                                    apv.txtCPO.setText(rap.getString("VALOR_CLI_RUBRO1").trim().replaceAll("CPO|cpo",""));
                                    apv.txtFCarta.setText(rap.getString("folio_carta").trim());
                                    apv.txtTracto.setText(rap.getString("unidad").trim());
                                    apv.txtZh.setText(rap.getString("zhx3").trim());
                                    Connection miConexionapr =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementapr =(Statement)miConexionapr.createStatement();
                                       ResultSet rapr = statementapr.executeQuery("select * from TBL_Reg_CPO where CPO ='"+apv.txtCPO.getText()+"' and estado ='ACTIVO'");
                                            if(rapr.next() == true){
                                                apv.txtOrigen1.setText(rapr.getString("cod_origen").trim());
                                                apv.txtDestino1.setText(rapr.getString("cod_destino").trim());
                                                apv.txtTcarga2.setText(rapr.getString("tipocarga").trim());
                                                apv.txtPeso2.setText(rapr.getString("peso").trim());
                                                apv.txtRemitente.setText(rapr.getString("nom_origen").trim());
                                                apv.txtCDrem.setText(rapr.getString("cd_origen").trim());
                                                apv.txtdesinatario.setText(rapr.getString("nom_destino").trim());
                                                apv.txtcddestino.setText(rapr.getString("cd_destino").trim());
                                                apv.txtTransporte.setText(rapr.getString("modo").trim());     
                        apv.txtUserf1.setText(lblUserVF.getText());
                        apv.txtCartax3.setText(txtCF1.getText());
                        apv.setVisible(true);                                                 
                                            }else {
                                                JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                //ActionEvent evt = null;
                                                //exitForm(evt); 
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    }    
                                }else {
                                    Connection miConexionrap =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementrap =(Statement)miConexion.createStatement();
                                        ResultSet rrap = statementrap.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"'");
                                            if(rrap.next() == true){
                        Smtapv apv=new Smtapv();                                                
                                                apv.txtTerminal.setText(rrap.getString("ter_carta").trim());
                                                apv.txtRem1.setText(rrap.getString("rem1").trim());
                                                apv.txtCPO.setText(rrap.getString("VALOR_CLI_RUBRO1").trim().replaceAll("CPO|cpo",""));
                                                apv.txtFCarta.setText(rrap.getString("folio_carta").trim());
                                                apv.txtFCarta.setText(rrap.getString("folio_carta").trim());
                                                apv.txtTracto.setText(rrap.getString("unidad").trim());
                                                apv.txtFchAP.setText(rrap.getString("fecha_carga").substring(0,10).trim());
                                                apv.txtHrAP.setText(rrap.getString("fecha_carga").substring(11,16).trim());
                                                apv.txtZh.setText(rrap.getString("zhx3").trim());
                                                Connection miConexioncap =(Connection)ConexionEDI.GetConnection();
                                                try {
                                                   Statement statementcap =(Statement)miConexion.createStatement();
                                                   ResultSet rcap = statementcap.executeQuery("select * from TBL_Reg_CPO where CPO ='"+apv.txtCPO.getText()+"' and estado ='ACTIVO'");
                                                        if(rcap.next() == true){
                                                            apv.txtOrigen1.setText(rcap.getString("cod_origen").trim());
                                                            apv.txtDestino1.setText(rcap.getString("cod_destino").trim());
                                                            apv.txtTcarga2.setText(rcap.getString("tipocarga").trim());
                                                            apv.txtPeso2.setText(rcap.getString("peso").trim());
                                                            apv.txtRemitente.setText(rcap.getString("nom_origen").trim());
                                                            apv.txtCDrem.setText(rcap.getString("cd_origen").trim());
                                                            apv.txtdesinatario.setText(rcap.getString("nom_destino").trim());
                                                            apv.txtcddestino.setText(rcap.getString("cd_destino").trim());
                                                            apv.txtTransporte.setText(rcap.getString("modo").trim());    
                        apv.txtUserf1.setText(lblUserVF.getText());
                        apv.txtCartax3.setText(txtCF1.getText());
                        apv.setVisible(true);                                                             
                                                        }else {
                                                            JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                            //ActionEvent evt = null;
                                                            //exitForm(evt); 
                                                        }
                                                } catch (HeadlessException | SQLException ex) {
                                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                                }   
                                            }else {
                                                JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                //ActionEvent evt = null;
                                                //exitForm(evt);
                                            }
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    } 
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo .","Error",JOptionPane.ERROR_MESSAGE);
                        }                         
                    }else if(i == 1){
                        JOptionPane.showMessageDialog(null,"Movimiento no procesado","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                    }
                }else {
                    APnuevoS();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void APnuevoS(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(" select * from VTBL_REG_AF_STATUS_1 where (ArchivoAF is null or ArchivoAF ='CANCELADO' ) AND (AP50!='AP-APLICADO' OR AP50 IS NULL) AND (Archivox3 ='CREADO') AND (Categoria='IE' OR Categoria='IA') and stcp='0' and cartaportex3='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                        Connection miConexionsp =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementsp =(Statement)miConexionsp.createStatement();
                            ResultSet rsp = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"' and archivoX3='CREADO'");
                                if(rsp.next() == true){
                        Smtaps aps=new Smtaps();                                    
                                    aps.txtTerminal.setText(rsp.getString("ter_carta").trim());
                                    aps.txtRem1.setText(rsp.getString("remolquex3").trim());
                                    aps.txtCPO.setText(rsp.getString("VALOR_CLI_RUBRO1").trim().replaceAll("CPO|cpo",""));
                                    aps.txtFCarta.setText(rsp.getString("folio_carta").trim());
                                    aps.txtTracto.setText(rsp.getString("unidadx3").trim());
                                    aps.txtFchAP.setText(rsp.getString("fchx3").trim());
                                    aps.txtZh.setText(rsp.getString("zhx3").trim());
                                    Connection miConexionaps =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementaps =(Statement)miConexionaps.createStatement();
                                       ResultSet raps = statementaps.executeQuery("select * from TBL_Reg_CPO where CPO ='"+aps.txtCPO.getText()+"' and estado ='ACTIVO'");
                                            if(raps.next() == true){
                                                aps.txtOrigen1.setText(raps.getString("cod_origen").trim());
                                                aps.txtDestino1.setText(raps.getString("cod_destino").trim());
                                                aps.txtTcarga2.setText(raps.getString("tipocarga").trim());
                                                aps.txtPeso2.setText(raps.getString("peso").trim());
                                                aps.txtRemitente.setText(raps.getString("nom_origen").trim());
                                                aps.txtCDrem.setText(raps.getString("cd_origen").trim());
                                                aps.txtdesinatario.setText(raps.getString("nom_destino").trim());
                                                aps.txtcddestino.setText(raps.getString("cd_destino").trim());
                                                aps.txtTransporte.setText(raps.getString("modo").trim()); 
                                                aps.mtd1=raps.getString("MODO").trim();
                                                String code1="MATERIAL";
                                                    String code2=aps.txtTcarga2.getText();
                                                    boolean resultado=code2.contains(code1);
                                                    if(resultado){
                                                        aps.Stars="RETIRO DE UNIDAD";
                                                    }else{
                                                        aps.Stars="CANCELACION VENTANA";
                                                    } 
                        aps.txtUserf1.setText(lblUserVF.getText());
                        aps.txtCartax3.setText(txtCF1.getText());
                        aps.setVisible(true);                                                     
                                            }else {
                                                JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                //ActionEvent evt = null;
                                                //exitForm(evt); 
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    }     
                                }else {
                                    Connection miConexionas =(Connection)ConexionEDI.GetConnection();
                                    try {
                                        Statement statementas =(Statement)miConexionas.createStatement();
                                        ResultSet ras = statementas.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"'");
                                            if(ras.next() == true){
                        Smtaps aps=new Smtaps();                                                 
                                                aps.txtTerminal.setText(ras.getString("ter_carta").trim());
                                                aps.txtRem1.setText(ras.getString("rem1").trim());
                                                aps.txtCPO.setText(ras.getString("VALOR_CLI_RUBRO1").trim().replaceAll("CPO|cpo",""));
                                                aps.txtFCarta.setText(ras.getString("folio_carta").trim());
                                                aps.txtFCarta.setText(ras.getString("folio_carta").trim());
                                                aps.txtTracto.setText(ras.getString("unidad").trim());
                                                aps.txtFchAP.setText(ras.getString("fecha_carga").substring(0,10).trim());
                                                aps.txtHrAP.setText(ras.getString("fecha_carga").substring(11,16).trim());
                                                aps.txtZh.setText(ras.getString("zhx3").trim());
                                                Connection miConexionps =(Connection)ConexionEDI.GetConnection();
                                                try {
                                                   Statement statementps =(Statement)miConexion.createStatement();
                                                   ResultSet rps = statementsp.executeQuery("select * from TBL_Reg_CPO where CPO ='"+aps.txtCPO.getText()+"' and estado ='ACTIVO'");
                                                        if(rps.next() == true){
                                                            aps.txtOrigen1.setText(rps.getString("cod_origen").trim());
                                                            aps.txtDestino1.setText(rps.getString("cod_destino").trim());
                                                            aps.txtTcarga2.setText(rps.getString("tipocarga").trim());
                                                            aps.txtPeso2.setText(rps.getString("peso").trim());
                                                            aps.txtRemitente.setText(rps.getString("nom_origen").trim());
                                                            aps.txtCDrem.setText(rps.getString("cd_origen").trim());
                                                            aps.txtdesinatario.setText(rps.getString("nom_destino").trim());
                                                            aps.txtcddestino.setText(rps.getString("cd_destino").trim());
                                                            aps.txtTransporte.setText(rps.getString("modo").trim());  
                                                            aps.mtd1=rps.getString("MODO").trim();
                                                            String code1="MATERIAL";
                                                                String code2=aps.txtTcarga2.getText();
                                                                boolean resultado=code2.contains(code1);
                                                                if(resultado){
                                                                    aps.Stars="RETIRO DE UNIDAD";
                                                                }else{
                                                                    aps.Stars="CANCELACION VENTANA";
                                                                } 
                        aps.txtUserf1.setText(lblUserVF.getText());
                        aps.txtCartax3.setText(txtCF1.getText());
                        aps.setVisible(true);                                                                 
                                                        }else {
                                                            JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                            //ActionEvent evt = null;
                                                            //exitForm(evt); 
                                                        }
                                                } catch (HeadlessException | SQLException ex) {
                                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                                } 
                                            }else {
                                                JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                               // ActionEvent evt = null;
                                                //exitForm(evt); 
                                            }
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    } 
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                   
                }else {                    
                    APnuevoSaf();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void APnuevoSaf(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where ArchivoAF  ='CREADO' AND CategoriaAF='IR' and CartaporteAF='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                        Connection miConexionsp =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementsp =(Statement)miConexionsp.createStatement();
                            ResultSet rsp = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"' and archivoX3='CREADO'");
                                if(rsp.next() == true){
                        Smtaps aps=new Smtaps();                                    
                                    aps.txtTerminal.setText(rsp.getString("ter_carta").trim());
                                    aps.txtRem1.setText(rsp.getString("remolquex3").trim());
                                    aps.txtCPO.setText(rsp.getString("VALOR_CLI_RUBRO1").trim().replaceAll("CPO|cpo",""));
                                    aps.txtFCarta.setText(rsp.getString("folio_carta").trim());
                                    aps.txtTracto.setText(rsp.getString("unidadx3").trim());
                                    aps.txtFchAP.setText(rsp.getString("fchx3").trim());
                                    aps.txtZh.setText(rsp.getString("zhx3").trim());
                                    Connection miConexionaps =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementaps =(Statement)miConexionaps.createStatement();
                                       ResultSet raps = statementaps.executeQuery("select * from TBL_Reg_CPO where CPO ='"+aps.txtCPO.getText()+"' and estado ='ACTIVO'");
                                            if(raps.next() == true){
                                                aps.txtOrigen1.setText(raps.getString("cod_origen").trim());
                                                aps.txtDestino1.setText(raps.getString("cod_destino").trim());
                                                aps.txtTcarga2.setText(raps.getString("tipocarga").trim());
                                                aps.txtPeso2.setText(raps.getString("peso").trim());
                                                aps.txtRemitente.setText(raps.getString("nom_origen").trim());
                                                aps.txtCDrem.setText(raps.getString("cd_origen").trim());
                                                aps.txtdesinatario.setText(raps.getString("nom_destino").trim());
                                                aps.txtcddestino.setText(raps.getString("cd_destino").trim());
                                                aps.txtTransporte.setText(raps.getString("modo").trim());
                                                aps.mtd1=raps.getString("MODO").trim();
                                                String code1="MATERIAL";
                                                    String code2=aps.txtTcarga2.getText();
                                                    boolean resultado=code2.contains(code1);
                                                    if(resultado){
                                                        aps.Stars="RETIRO DE UNIDAD";
                                                    }else{
                                                        aps.Stars="CANCELACION VENTANA";
                                                    } 
                        aps.txtUserf1.setText(lblUserVF.getText());
                        aps.txtCartax3.setText(txtCF1.getText());    
                        aps.setVisible(true);                                                     
                                            }else {
                                                JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                //ActionEvent evt = null;
                                                //exitForm(evt); 
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    }     
                                }else {
                                    Connection miConexionas =(Connection)ConexionEDI.GetConnection();
                                    try {
                                        Statement statementas =(Statement)miConexionas.createStatement();
                                        ResultSet ras = statementas.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"'");
                                            if(ras.next() == true){
                        Smtaps aps=new Smtaps();                                                
                                                aps.txtTerminal.setText(ras.getString("ter_carta").trim());
                                                aps.txtRem1.setText(ras.getString("rem1").trim());
                                                aps.txtCPO.setText(ras.getString("VALOR_CLI_RUBRO1").trim().replaceAll("CPO|cpo",""));
                                                aps.txtFCarta.setText(ras.getString("folio_carta").trim());
                                                aps.txtFCarta.setText(ras.getString("folio_carta").trim());
                                                aps.txtTracto.setText(ras.getString("unidad").trim());
                                                aps.txtFchAP.setText(ras.getString("fecha_carga").substring(0,10).trim());
                                                aps.txtHrAP.setText(ras.getString("fecha_carga").substring(11,16).trim());
                                                aps.txtZh.setText(ras.getString("zhx3").trim());
                                                Connection miConexionps1 =(Connection)ConexionEDI.GetConnection();
                                                try {
                                                   Statement statementps1 =(Statement)miConexion.createStatement();
                                                   ResultSet rps = statementsp.executeQuery("select * from TBL_Reg_CPO where CPO ='"+aps.txtCPO.getText()+"' and estado ='ACTIVO'");
                                                        if(rps.next() == true){
                                                            aps.txtOrigen1.setText(rps.getString("cod_origen").trim());
                                                            aps.txtDestino1.setText(rps.getString("cod_destino").trim());
                                                            aps.txtTcarga2.setText(rps.getString("tipocarga").trim());
                                                            aps.txtPeso2.setText(rps.getString("peso").trim());
                                                            aps.txtRemitente.setText(rps.getString("nom_origen").trim());
                                                            aps.txtCDrem.setText(rps.getString("cd_origen").trim());
                                                            aps.txtdesinatario.setText(rps.getString("nom_destino").trim());
                                                            aps.txtcddestino.setText(rps.getString("cd_destino").trim());
                                                            aps.txtTransporte.setText(rps.getString("modo").trim());  
                                                            aps.mtd1=rps.getString("MODO").trim();
                                                            String code1="MATERIAL";
                                                                String code2=aps.txtTcarga2.getText();
                                                                boolean resultado=code2.contains(code1);
                                                                if(resultado){
                                                                    aps.Stars="RETIRO DE UNIDAD";
                                                                }else{
                                                                    aps.Stars="CANCELACION VENTANA";
                                                                }
                        aps.txtUserf1.setText(lblUserVF.getText());
                        aps.txtCartax3.setText(txtCF1.getText());    
                        aps.setVisible(true);                                                                 
                                                        }else {
                                                            JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                            //ActionEvent evt = null;
                                                            //exitForm(evt); 
                                                        }
                                                } catch (HeadlessException | SQLException ex) {
                                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                                } 
                                            }else {
                                                JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                //ActionEvent evt = null;
                                                //exitForm(evt); 
                                            }
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    } 
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                       
                }else {                    
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /*Editar Movimiento AP*/
    public void validauserEap(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starse='1' and Estado='activo'");
                if(rs1.next() == true){
                    movapc();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void movapc(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X3_STATUS_1 where AP50='AP-APLICADO' and archivox3='CREADO' and (CategoriaAP='IR') and ErrorAP !='710' and cartaportex3='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                        Connection miConexioneaps =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementeaps =(Statement)miConexion.createStatement();
                            ResultSet reaps = statementeaps.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"'");
                                if(reaps.next() == true){
                        SmtapsEditar eaps=new SmtapsEditar();                                    
                                    eaps.txtTerminal.setText(reaps.getString("ter_carta").trim());
                                    eaps.txtEvento.setText(reaps.getString("ReasonCodeAP").trim());
                                    eaps.txtRem1.setText(reaps.getString("Remolqueap").trim());
                                    eaps.txtCPO.setText(reaps.getString("VALOR_CLI_RUBRO1").trim().replaceAll("CPO|cpo",""));
                                    eaps.txtFCarta.setText(reaps.getString("folio_carta").trim());
                                    eaps.txtTracto.setText(reaps.getString("Unidadap").trim());
                                    eaps.txtFchAP.setText(reaps.getString("fchx3").trim());
                                    eaps.txtZh.setText(reaps.getString("zhx3").trim());
                                    Connection miConexionea =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementea =(Statement)miConexion.createStatement();
                                       ResultSet rea = statement.executeQuery("select * from TBL_Reg_CPO where CPO ='"+eaps.txtCPO.getText()+"' and estado ='ACTIVO'");
                                            if(rea.next() == true){
                                                eaps.txtOrigen1.setText(rea.getString("cod_origen").trim());
                                                eaps.txtDestino1.setText(rea.getString("cod_destino").trim());
                                                eaps.txtTcarga2.setText(rea.getString("tipocarga").trim());
                                                eaps.txtPeso2.setText(rea.getString("peso").trim());
                                                eaps.txtRemitente.setText(rea.getString("nom_origen").trim());
                                                eaps.txtCDrem.setText(rea.getString("cd_origen").trim());
                                                eaps.txtdesinatario.setText(rea.getString("nom_destino").trim());
                                                eaps.txtcddestino.setText(rea.getString("cd_destino").trim());
                                                eaps.txtTransporte.setText(rea.getString("modo").trim());
                        eaps.txtUserf1.setText(lblUserVF.getText());
                        eaps.txtCartax3.setText(txtCF1.getText());
                        eaps.setVisible(true);                                                
                                            }else {
                                                JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                //ActionEvent evt = null;
                                                //exitForm(evt);
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    }   
                                }else {
                                    JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                    //ActionEvent evt = null;
                                    //exitForm(evt);
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                       
                }else {
                    Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                                try {
                                   Statement statement1 =(Statement)miConexion1.createStatement();
                                    ResultSet rs11 = statement1.executeQuery("select * from VTBL_REG_X3_STATUS_1 where AP50='AP-APLICADO' and (archivox3 !='CREADO' or Archivox3 is null) and (CategoriaAP ='IE' or CategoriaAP='IR') and ErrorAP!='710' and cartaportex3='"+txtCF1.getText()+"'");
                                        if(rs11.next() == true){
                                                Connection miConexionapr =(Connection)ConexionEDI.GetConnection();
                                                try {
                                                   Statement statementapr =(Statement)miConexion.createStatement();
                                                    ResultSet rapr = statementapr.executeQuery("select * from VTBL_REG_X3_STATUS_1 where CartaporteX3='"+txtCF1.getText()+"'");
                                                        if(rapr.next() == true){
                                                SmtapvEditar apre=new SmtapvEditar();                                                            
                                                            apre.txtTerminal.setText(rapr.getString("ter_carta").trim());
                                                            apre.txtRem1.setText(rapr.getString("Remolqueap").trim());
                                                            apre.txtCPO.setText(rapr.getString("VALOR_CLI_RUBRO1").replaceAll("CPO|cpo","").trim());
                                                            apre.txtFCarta.setText(rapr.getString("folio_carta").trim());
                                                            apre.txtFCarta.setText(rapr.getString("folio_carta").trim());
                                                            apre.txtTracto.setText(rapr.getString("Unidadap").trim());
                                                            apre.txtFchAP.setText(rapr.getString("fecha_carga").substring(0,10).trim());
                                                            apre.txtHrAP.setText(rapr.getString("fecha_carga").substring(11,16).trim());
                                                            apre.txtZh.setText(rapr.getString("zhx3").trim());                   
                                                            Connection miConexionap =(Connection)ConexionEDI.GetConnection();
                                                            try {
                                                               Statement statementap =(Statement)miConexionap.createStatement();
                                                               ResultSet rap = statementap.executeQuery("select * from TBL_Reg_CPO where CPO ='"+apre.txtCPO.getText()+"' and estado ='ACTIVO'");
                                                                    if(rap.next() == true){
                                                                        apre.txtOrigen1.setText(rap.getString("cod_origen").trim());
                                                                        apre.txtDestino1.setText(rap.getString("cod_destino").trim());
                                                                        apre.txtTcarga2.setText(rap.getString("tipocarga").trim());
                                                                        apre.txtPeso2.setText(rap.getString("peso").trim());
                                                                        apre.txtRemitente.setText(rap.getString("nom_origen").trim());
                                                                        apre.txtCDrem.setText(rap.getString("cd_origen").trim());
                                                                        apre.txtdesinatario.setText(rap.getString("nom_destino").trim());
                                                                        apre.txtcddestino.setText(rap.getString("cd_destino").trim());
                                                                        apre.txtTransporte.setText(rap.getString("modo").trim());  
                                                apre.txtUserf1.setText(lblUserVF.getText());
                                                apre.txtCartax3.setText(txtCF1.getText());
                                                apre.setVisible(true);                                                                        
                                                                    }else {
                                                                        JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                                        //ActionEvent evt = null;
                                                                        //exitForm(evt);
                                                                    }
                                                            } catch (HeadlessException | SQLException ex) {
                                                                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                                            }     
                                                        }else {
                                                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);                                       
                                                            //ActionEvent evt = null;
                                                            //exitForm(evt); 
                                                        }
                                                } catch (SQLException ex) {
                                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                                }                                                 
                                        }else{
                                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);                                       
                                        }
                                } catch (HeadlessException | SQLException ex) {
                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                }  
                }                                
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /*Cancelar Movimiento AP*/
    public void validauserCancelaap(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsc='1' and Estado='activo'");
                if(rs1.next() == true){
                   movAPc();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void movAPc(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select *  from VTBL_REG_X3_STATUS_1 where AP50='AP-APLICADO' and archivox3='CREADO' and (CategoriaAP ='IE' or CategoriaAP='IA') and actual <= diaap and cartaportex3='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                        Connection miConexioneap =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementeap =(Statement)miConexioneap.createStatement();
                            ResultSet reap = statementeap.executeQuery("select * from TBL_REG_X3_1 where CartaporteX3='"+txtCF1.getText()+"' and archivox3='creado'");
                                if(reap.next() == true){
                        SmtapsCancel ap=new SmtapsCancel();                                    
                                    ap.txtTerminal.setText(reap.getString("ter_carta").trim());
                                    ap.txtRem1.setText(reap.getString("Remolqueap").trim());
                                    ap.txtCPO.setText(reap.getString("VALOR_CLI_RUBRO1").replaceAll("CPO|cpo","").trim());
                                    ap.txtFCarta.setText(reap.getString("folio_carta").trim());
                                    ap.txtTracto.setText(reap.getString("Unidadap").trim());
                                    ap.txtFchAP.setText(reap.getString("fchap").substring(0,10).trim());
                                    ap.txtHrAP.setText(reap.getString("hrap").trim());
                                    ap.txtZh.setText(reap.getString("zhap").trim());
                                    ap.txtEvento.setText(reap.getString("ReasonCodeAP")); 
                                    Connection miConexioneaps =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementeaps =(Statement)miConexioneaps.createStatement();
                                       ResultSet eaps = statement.executeQuery("select * from TBL_Reg_CPO where CPO ='"+ap.txtCPO.getText()+"' and estado ='ACTIVO'");
                                            if(eaps.next() == true){
                                                ap.txtOrigen1.setText(eaps.getString("cod_origen").trim());
                                                ap.txtDestino1.setText(eaps.getString("cod_destino").trim());
                                                ap.txtTcarga2.setText(eaps.getString("tipocarga").trim());
                                                ap.txtPeso2.setText(eaps.getString("peso").trim());
                                                ap.txtRemitente.setText(eaps.getString("nom_origen").trim());
                                                ap.txtCDrem.setText(eaps.getString("cd_origen").trim());
                                                ap.txtdesinatario.setText(eaps.getString("nom_destino").trim());
                                                ap.txtcddestino.setText(eaps.getString("cd_destino").trim());
                                                ap.txtTransporte.setText(eaps.getString("modo").trim());
                        ap.txtUserf1.setText(lblUserVF.getText());
                        ap.txtCartax3.setText(txtCF1.getText());
                        ap.setVisible(true);                                                 
                                            }else {
                                                JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                //ActionEvent evt = null;
                                                //exitForm(evt);
                                            }
                                    } catch (HeadlessException | SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    }    
                                }else {
                                    //ActionEvent evt = null;
                                    //exitForm(evt); 
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                                              
                }else {
                    Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
                                try {
                                   Statement statement1 =(Statement)miConexion1.createStatement();
                                    ResultSet rs11 = statement1.executeQuery("select * from VTBL_REG_X3_STATUS_1 where AP50='AP-APLICADO' and (archivox3 !='CREADO' or Archivox3 is null) and (CategoriaAP ='IE' or CategoriaAP='IA')and actual <= diaap and cartaportex3='"+txtCF1.getText()+"'");
                                        if(rs11.next() == true){
                                                Connection miConexionapb =(Connection)ConexionEDI.GetConnection();
                                                try {
                                                   Statement statementapb =(Statement)miConexionapb.createStatement();
                                                    ResultSet apb= statement.executeQuery("select * from TBL_REG_X3_1 where CartaporteX3='"+txtCF1.getText()+"' and ap50='AP-APLICADO' and (archivox3 is null or archivox3='cancelado')");
                                                        if(apb.next() == true){
                                                SmtapvCancel ap=new SmtapvCancel();                                                            
                                                            ap.txtTerminal.setText(apb.getString("ter_carta").trim());
                                                            ap.txtRem1.setText(apb.getString("Remolqueap").trim());
                                                            ap.txtCPO.setText(apb.getString("VALOR_CLI_RUBRO1").replaceAll("CPO|cpo","").trim());
                                                            ap.txtFCarta.setText(apb.getString("folio_carta").trim());
                                                            ap.txtTracto.setText(apb.getString("Unidadap").trim());
                                                            ap.txtFchAP.setText(apb.getString("fchap").substring(0,10).trim());
                                                            ap.txtHrAP.setText(apb.getString("hrap").trim());
                                                            ap.txtZh.setText(apb.getString("zhap").trim());
                                                            ap.txtEvento.setText(apb.getString("ReasonCodeAP"));
                                                            Connection miConexionbap =(Connection)ConexionEDI.GetConnection();
                                                            try {
                                                               Statement statementbap =(Statement)miConexionbap.createStatement();
                                                               ResultSet bap = statementbap.executeQuery("select * from TBL_Reg_CPO where CPO ='"+ap.txtCPO.getText()+"' and estado ='ACTIVO'");
                                                                    if(bap.next() == true){
                                                                        ap.txtOrigen1.setText(bap.getString("cod_origen").trim());
                                                                        ap.txtDestino1.setText(bap.getString("cod_destino").trim());
                                                                        ap.txtTcarga2.setText(bap.getString("tipocarga").trim());
                                                                        ap.txtPeso2.setText(bap.getString("peso").trim());
                                                                        ap.txtRemitente.setText(bap.getString("nom_origen").trim());
                                                                        ap.txtCDrem.setText(bap.getString("cd_origen").trim());
                                                                        ap.txtdesinatario.setText(bap.getString("nom_destino").trim());
                                                                        ap.txtcddestino.setText(bap.getString("cd_destino").trim());
                                                                        ap.txtTransporte.setText(bap.getString("modo").trim());
                                                ap.txtUserf1.setText(lblUserVF.getText());
                                                ap.txtCartax3.setText(txtCF1.getText());
                                                ap.setVisible(true);                                                                        
                                                                    }else {
                                                                        JOptionPane.showMessageDialog(null, "Verifique el registro de la CPO ","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                                        //ActionEvent evt = null;
                                                                        //exitForm(evt);
                                                                    }
                                                            } catch (HeadlessException | SQLException ex) {
                                                                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                                            }    
                                                        }else {
                                                            JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                            //ActionEvent evt = null;
                                                            //exitForm(evt);
                                                        }
                                                } catch (SQLException ex) {
                                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                                }                                                                                            
                                        }else{
                                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);                                       
                                        }
                                } catch (HeadlessException | SQLException ex) {
                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                }  
                }                                
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /*Movimiento AF*/
     public void validauserAFR(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsr='1' and Estado='activo'");
                if(rs1.next() == true){
                    apcanceladoaf();                    
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    } 
    
    public void AFnuevo(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where stcp='0' and archivox3='CREADO' and (ap50 is null or ap50!='AP-APLICADO') AND (Categoria ='IA' OR Categoria='IE') and (ArchivoAF !='creado' or ArchivoAF is null) and CartaporteAF='"+txtCF1.getText()+"'");
                if(rs1.next() == true){

        Connection miConexionaf =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statementaf =(Statement)miConexionaf.createStatement();
            ResultSet raf = statementaf.executeQuery("select * from VTBL_REG_AF_STATUS_1_sp where CartaporteAF='"+txtCF1.getText()+"' and salida_programada is not null");  
                if(raf.next() == true){
        StmAF af=new StmAF();                    
                    af.txtTerminal=raf.getString("ter_carta");
                    af.Status=(raf.getString("status_orden"));
                    af.txtRem1.setText(raf.getString("remolquex3"));
                    af.txtCPO1.setText(raf.getString("VALOR_CLI_RUBRO1"));
                    af.txtFCarta=raf.getString("folio_carta");
                    af.txtTracto.setText(raf.getString("unidadx3").trim());
                    af.txtTcarga.setText(raf.getString("carga"));
                    
                    af.txtOrigen=raf.getString("origen_nom");
                    af.txtDestino=raf.getString("destinatario_nom");
                    af.txtPeso.setText(raf.getString("peso"));
                    af.txtFPCarga.setText(raf.getString("salida_programada").substring(0,10));
                    af.txtHPCarga.setText(raf.getString("salida_programada").substring(11,16));
                    af.txtFPEntrega.setText(raf.getString("fecha_entrega").substring(0,10));
                    af.txtHPEntrega.setText(raf.getString("fecha_entrega").substring(11,16));
                    
                    af.txtRemitente.setText(raf.getString("remitente").trim());
                    af.txtDestinatario.setText(raf.getString("destinatario").trim());
                    af.txtZh.setText(raf.getString("zhx3").trim());
                    af.idAF=raf.getString("idAF");
                    af.txtFchSalida.setText(raf.getString("fchAF"));
                    af.txtHrSalida.setText(raf.getString("hrAF"));
                    af.txtBol.setText(raf.getString("evidenciard"));
                af.txtUserf1.setText(lblUserVF.getText());
                af.txtCartax3.setText(txtCF1.getText());
                af.setVisible(true);                    
                }else {
                    JOptionPane.showMessageDialog(null,"Verificar el tiempo asignado a cargar.","Advertencia",JOptionPane.WARNING_MESSAGE);
                    //ActionEvent evt = null;
                    //exitForm(evt);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }    
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void ValidarstatusAFc(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where Mov='Mov.AF' and (categoria is null or categoria ='IR') and cartaporte='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null,"La carta porte no se puede procesar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }else {
                    vrx1();                   
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void vrx1(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
            try {
                       Statement statement1 =(Statement)miConexion1.createStatement();
                        ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_X1_1 where Cartaportex1='"+txtCF1.getText()+"'");
                            if(rs11.next() == true){
                                Connection miConexion =(Connection)ConexionEDI.GetConnection();
                                try {
                                   Statement statement =(Statement)miConexion.createStatement();
                                    ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where (Archivox1 is null or Archivox1 !='creado') and Cartaportex1='"+txtCF1.getText()+"'");
                                        if(rs1.next() == true){
                                            AFnuevo();
                                        }else{   
                                            vrx1R();
                                        }
                                } catch (HeadlessException | SQLException ex) {
                                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                }                                
                            }else{   
                                AFnuevo(); 
                            }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }  
    }    
    
    public void vrx1R(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
            try {
                Statement statement1 =(Statement)miConexion1.createStatement();
                ResultSet rs11 = statement1.executeQuery("SELECT * FROM VTBL_REG_X1_STATUS_1 where (Archivox1='CREADO' AND Categoriax1='IR') and Cartaportex1='"+txtCF1.getText()+"'");
                    if(rs11.next() == true){
        Connection miConexionaf =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statementaf =(Statement)miConexionaf.createStatement();
            ResultSet raf = statementaf.executeQuery("select * from VTBL_REG_AF_STATUS_1_sp where CartaporteAF='"+txtCF1.getText()+"' and salida_programada is not null");  
                if(raf.next() == true){
                StmAF af=new StmAF();                    
                    af.txtTerminal=raf.getString("ter_carta");
                    af.Status=(raf.getString("status_orden"));
                    af.txtRem1.setText(raf.getString("remolquex3"));
                    af.txtCPO1.setText(raf.getString("VALOR_CLI_RUBRO1"));
                    af.txtFCarta=raf.getString("folio_carta");
                    af.txtTracto.setText(raf.getString("unidadx3").trim());
                    af.txtTcarga.setText(raf.getString("carga"));
                    
                    af.txtOrigen=raf.getString("origen_nom");
                    af.txtDestino=raf.getString("destinatario_nom");
                    af.txtPeso.setText(raf.getString("peso"));
                    af.txtFPCarga.setText(raf.getString("salida_programada").substring(0,10));
                    af.txtHPCarga.setText(raf.getString("salida_programada").substring(11,16));
                    af.txtFPEntrega.setText(raf.getString("fecha_entrega").substring(0,10));
                    af.txtHPEntrega.setText(raf.getString("fecha_entrega").substring(11,16));
                    
                    af.txtRemitente.setText(raf.getString("remitente").trim());
                    af.txtDestinatario.setText(raf.getString("destinatario").trim());
                    af.txtZh.setText(raf.getString("zhx3").trim());
                    af.idAF=raf.getString("idAF");
                    af.txtFchSalida.setText(raf.getString("fchAF"));
                    af.txtHrSalida.setText(raf.getString("hrAF"));
                    af.txtBol.setText(raf.getString("evidenciard"));   
                af.txtUserf1.setText(lblUserVF.getText());
                af.txtCartax3.setText(txtCF1.getText());
                af.setVisible(true);                     
                }else {
                    JOptionPane.showMessageDialog(null,"Verificar el tiempo asignado a cargar.","Advertencia",JOptionPane.WARNING_MESSAGE);
                    //ActionEvent evt = null;
                    //exitForm(evt);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }   
            }else{  
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);   
                }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }  
    }
    
    String movrr;    
    public void apcanceladoaf(){
       Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' order by idst desc");
            if(rs1.next() == true){   
              if(rs1.getString("mov").equals("Mov.AF")||rs1.getString("mov").equals("Mov.AP")||rs1.getString("mov").equals("Mov.x1")){
                  movrr=rs1.getString("mov");
                 apcanceladoap();
              }else if (rs1.getString("mov").equals("Mov.x3")){
                  vrx1();
              }
            }else {
                vrx1();                   
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }   
    
    public void apcanceladoap(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and mov='"+movrr+"' and categoria is not null");
                if(rs1.next() == true){
                    if(rs1.getString("categoria").equals("IA") || rs1.getString("categoria").equals("IE") ){
                        vrx1();
                    }else{
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                    }                    
                }else {
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void apcanceladoap1(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
            try {
                Statement statement1 =(Statement)miConexion1.createStatement();
                ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.AF' is not null ");
                    if(rs11.next() == true){
                        if(rs11.getString("categoria").equals("IA") || rs11.getString("categoria").equals("IE")){                            
                            vrx1();
                        }else{
                           JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE); 
                        }                                                       
                    }else{  
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE); 
                    }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }  
    }
    
    /*Editar Movimiento AF*/
    public void validauserAFE(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starse='1' and Estado='activo'");
                if(rs1.next() == true){
                   AFEditar();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void AFEditar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from tbl_reg_x1_1  where Cartaportex1='"+txtCF1.getText()+"' and archivoX1='CREADO'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }else{
                    AFEditarx1();                    
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void AFEditarx1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where ARCHIVOAF ='creado' and (CategoriaAF='IR')and CartaporteAF='"+txtCF1.getText()+"'");
                if(rs1.next() == true){   
                            Connection miConexioneaf =(Connection)ConexionEDI.GetConnection();
                            try {
                                Statement statementaf =(Statement)miConexioneaf.createStatement();
                                ResultSet raf = statementaf.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+txtCF1.getText()+"'");  
                                    if(raf.next() == true){
                        SmtAFEditar af=new SmtAFEditar();                                        
                                        af.txtTerminalf=raf.getString("ter_carta");
                                        af.Status=(raf.getString("status_orden"));
                                        af.txtRem1.setText(raf.getString("remolquex3"));
                                        af.txtCPO1.setText(raf.getString("VALOR_CLI_RUBRO1"));
                                        af.txtFCartaf=raf.getString("folio_carta");
                                        af.txtTracto.setText(raf.getString("unidadx3").trim());
                                        af.txtTcarga.setText(raf.getString("carga"));

                                        af.txtOrigen=raf.getString("origen_nom");
                                        af.txtDestino=raf.getString("destinatario_nom");
                                        af.txtPeso.setText(raf.getString("peso"));
                                        af.txtFPCarga.setText(raf.getString("fecha_carga").substring(0,10));
                                        af.txtHPCarga.setText(raf.getString("fecha_carga").substring(11,16));
                                        af.txtFPEntrega.setText(raf.getString("fchDescg"));
                                        af.txtHPEntrega.setText(raf.getString("hrsDescg"));

                                        af.txtRemitente.setText(raf.getString("remitente").trim());
                                        af.txtDestinatario.setText(raf.getString("destinatario").trim());
                                        af.txtZh.setText(raf.getString("zhx3").trim());
                                        af.idAF=raf.getString("idAF");
                                        af.txtBol.setText(raf.getString("bol"));
                                        af.txtFchSalida.setText(raf.getString("fchAF"));
                                        af.txtHrSalida.setText(raf.getString("hrAF"));  
                        af.txtUserf1.setText(lblUserVF.getText());
                        af.txtCartax3.setText(txtCF1.getText());
                        af.setVisible(true);                                        
                                    }else {
                                        JOptionPane.showMessageDialog(null,"Verificar el tiempo asignado a cargar.","Advertencia",JOptionPane.WARNING_MESSAGE);
                                        //ActionEvent evt = null;
                                        //exitForm(evt);
                                    }
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                            }                      
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /*Cancelar Movimiento AF*/
    public void validauserxAF(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsc='1' and Estado='activo'");
                if(rs1.next() == true){
                    ValidaCancelarAF();                
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void ValidaCancelarAF(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where ARCHIVOAF ='creado' and (CategoriaAF ='IE' OR CategoriaAF='IA') and  actual <= dia and CartaporteAF='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                    ValidaCancelarx1cancel();
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public void ValidaCancelarx1cancel(){ 
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
            try {
                Statement statement1 =(Statement)miConexion1.createStatement();
                ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"'");
                    if(rs11.next() == true){
                        if(rs11.getString("Mov").equals("Mov.x1")){
                            apcanceladox11();
                        }else{
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                     
                    }else{ 
                        vrx1c();                  
                    }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }         
    }
    
    public void apcanceladox11(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
            try {
                Statement statement1 =(Statement)miConexion1.createStatement();
                ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.x1' and categoria is not null");
                    if(rs11.next() == true){
                        if(rs11.getString("categoria").equals("IA") || rs11.getString("categoria").equals("IE")){
                            vrx1c();
                        }else{
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                             
                    }else{ 
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);               
                    }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }  
    }
    
    public void vrx1c(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where (Archivox1 is null or Archivox1 !='creado') and Cartaportex1='"+txtCF1.getText()+"'");
                if(rs1.next() == true){

                        Connection miConexionAF =(Connection)ConexionEDI.GetConnection();
                        try {
                            Statement statementAF =(Statement)miConexionAF.createStatement();
                            ResultSet raf = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+txtCF1.getText()+"'");  
                                if(raf.next() == true){
                        SmtAFCancel af=new SmtAFCancel();                                    
                                    af.txtTerminal.setText(raf.getString("ter_carta"));
                                    af.txtTransporte.setText(raf.getString("equipo"));
                                    af.txtRem1.setText(raf.getString("remolqueAF"));
                                    af.txtCPO1.setText(raf.getString("VALOR_CLI_RUBRO1"));
                                    af.txtFCarta.setText(raf.getString("folio_carta"));
                                    af.txtTracto.setText(raf.getString("unidadAF").trim());
                                    af.txtTcarga.setText(raf.getString("carga"));

                                    af.txtOrigen.setText(raf.getString("origen_nom"));
                                    af.txtDestino.setText(raf.getString("destinatario_nom"));
                                    af.txtPeso.setText(raf.getString("peso"));
                                    af.txtFPCarga.setText(raf.getString("fchProg"));
                                    af.txtHPCarga.setText(raf.getString("hrProg"));
                                    af.txtFPEntrega.setText(raf.getString("fchDescg"));
                                    af.txtHPEntrega.setText(raf.getString("hrsDescg"));

                                    af.txtRemitente.setText(raf.getString("remitente").trim());
                                    af.txtcdOrigen.setText(raf.getString("cd_origen").trim());
                                    af.txtDestinatario.setText(raf.getString("destinatario").trim());
                                    af.txtcdDestino.setText(raf.getString("cd_destino").trim());
                                    af.txtZh.setText(raf.getString("zhx3").trim());
                                    af.txtFchSalida.setText(raf.getString("fchAF"));
                                    af.txtHrSalida.setText(raf.getString("hrAF"));
                                    af.txtBol.setText(raf.getString("bol"));
                                    af.txtEvento.setText(raf.getString("ReasonCodeAF")); 
                        af.txtUserf1.setText(lblUserVF.getText());
                        af.txtCartax3.setText(txtCF1.getText());
                        af.setVisible(true);                                    
                                }else {
                                    JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                    //ActionEvent evt = null;
                                    //exitForm(evt);
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                    
                }else{ 
                    vrx1cr();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public void vrx1cr(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where (Archivox1='creado' and Categoriax1='IR') and Cartaportex1='"+txtCF1.getText()+"'");
                if(rs1.next() == true){

                        Connection miConexionAF =(Connection)ConexionEDI.GetConnection();
                        try {
                            Statement statementAF =(Statement)miConexionAF.createStatement();
                            ResultSet raf = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+txtCF1.getText()+"'");  
                                if(raf.next() == true){
                        SmtAFCancel af=new SmtAFCancel();                                    
                                    af.txtTerminal.setText(raf.getString("ter_carta"));
                                    af.txtTransporte.setText(raf.getString("equipo"));
                                    af.txtRem1.setText(raf.getString("remolqueAF"));
                                    af.txtCPO1.setText(raf.getString("VALOR_CLI_RUBRO1"));
                                    af.txtFCarta.setText(raf.getString("folio_carta"));
                                    af.txtTracto.setText(raf.getString("unidadAF").trim());
                                    af.txtTcarga.setText(raf.getString("carga"));

                                    af.txtOrigen.setText(raf.getString("origen_nom"));
                                    af.txtDestino.setText(raf.getString("destinatario_nom"));
                                    af.txtPeso.setText(raf.getString("peso"));
                                    af.txtFPCarga.setText(raf.getString("fchProg"));
                                    af.txtHPCarga.setText(raf.getString("hrProg"));
                                    af.txtFPEntrega.setText(raf.getString("fchDescg"));
                                    af.txtHPEntrega.setText(raf.getString("hrsDescg"));

                                    af.txtRemitente.setText(raf.getString("remitente").trim());
                                    af.txtcdOrigen.setText(raf.getString("cd_origen").trim());
                                    af.txtDestinatario.setText(raf.getString("destinatario").trim());
                                    af.txtcdDestino.setText(raf.getString("cd_destino").trim());
                                    af.txtZh.setText(raf.getString("zhx3").trim());
                                    af.txtFchSalida.setText(raf.getString("fchAF"));
                                    af.txtHrSalida.setText(raf.getString("hrAF"));
                                    af.txtBol.setText(raf.getString("bol"));
                                    af.txtEvento.setText(raf.getString("ReasonCodeAF")); 
                        af.txtUserf1.setText(lblUserVF.getText());
                        af.txtCartax3.setText(txtCF1.getText());
                        af.setVisible(true);                                    
                                }else {
                                    JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                    //ActionEvent evt = null;
                                    //exitForm(evt);
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                       
 
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    /*Movimiento x1*/     
    public void validauserx1R(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsr='1' and Estado='activo'");
                if(rs1.next() == true){
                    apcanceladox1r();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario.","Error",JOptionPane.ERROR_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    } 
    
    public void apcanceladox1r(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
            try {
                Statement statement1 =(Statement)miConexion1.createStatement();
                ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"'");
                    if(rs11.next() == true){
                        if(rs11.getString("Mov").equals("Mov.x1")){
                            apcanceladox1();
                        }else{
                            X1nuevo();
                        }                                                                     
                    }else{ 
                        X1nuevo();                  
                    }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }  
    } 
    
    public void apcanceladox1(){
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
            try {
                Statement statement1 =(Statement)miConexion1.createStatement();
                ResultSet rs11 = statement1.executeQuery("select * from TBL_REG_STARS_CANCEL where cartaporte='"+txtCF1.getText()+"' and Mov='Mov.x1' and categoria is not null");
                    if(rs11.next() == true){
                        if(rs11.getString("categoria").equals("IA") || rs11.getString("categoria").equals("IE")){
                            X1nuevo(); 
                        }else{
                            JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                        }                                                                             
                    }else{ 
                        JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);               
                    }
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }  
    } 
    
    public void X1nuevo(){              
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X1_STATUS_1 where stcp='0' and archivoaf='CREADO' AND (Categoriaaf ='IA' or Categoriaaf ='IE') AND (Archivox1 !='CREADO' OR Archivox1 IS NULL) and ArchivoAF='creado' and Cartaportex1='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                        Stmx1 x1=new Stmx1();
                        Connection miConexionx1 =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementx1 =(Statement)miConexionx1.createStatement();
                           ResultSet rx1 = statementx1.executeQuery("select * from  TBL_REG_AF_1 where CartaporteAF='"+txtCF1.getText()+"' and AGETA ='AG-ETA'");
                                if(rx1.next() == true){
                                    x1.txtFchLlegada.setText(rx1.getString("fchAG"));
                                    x1.txtHrLlegada.setText(rx1.getString("hrAG"));
                                    Connection miConexionx1eta =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementx1eta =(Statement)miConexionx1eta.createStatement();
                                       ResultSet rx1eta = statementx1eta.executeQuery("select * from  VTBL_REG_X1_STATUS_1 where CartaporteX1='"+txtCF1.getText()+"'");
                                            if(rx1eta.next() == true){                  
                                                x1.txtTerminalc=rx1eta.getString("ter_carta");
                                                x1.stos=rx1eta.getString("status_orden");
                                                x1.txtRem1.setText(rx1eta.getString("remolqueaf"));
                                                x1.txtCPO1.setText(rx1eta.getString("VALOR_CLI_RUBRO1"));
                                                x1.txtFCartac=rx1eta.getString("folio_carta");
                                                x1.txtTracto.setText(rx1eta.getString("unidadaf").trim());
                                                x1.txtTcarga.setText(rx1eta.getString("carga"));
                                                x1.txtPeso.setText(rx1eta.getString("peso"));
                                                x1.txtBol.setText(rx1eta.getString("BOL"));
                                                x1.txtRemitente.setText(rx1eta.getString("Remitente"));
                                                x1.txtDestinatario.setText(rx1eta.getString("Destinatario"));
                                                x1.txtZhx1.setText(rx1eta.getString("zhx3").trim());  
                                            }else {
                                                System.out.println("No hay registro");
                                            }
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    } 
                                }else {
                                    Connection miConexionnx1 =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementnx1 =(Statement)miConexionnx1.createStatement();
                                       ResultSet rnx1 = statementnx1.executeQuery("select * from  VTBL_REG_X1_STATUS_1 where CartaporteX1='"+txtCF1.getText()+"'");
                                            if(rnx1.next() == true){
                                                x1.txtTerminalc=rnx1.getString("ter_carta");
                                                x1.stos=rnx1.getString("status_orden");
                                                x1.txtRem1.setText(rnx1.getString("remolqueaf"));
                                                x1.txtCPO1.setText(rnx1.getString("VALOR_CLI_RUBRO1"));
                                                x1.txtFCartac=rnx1.getString("folio_carta");
                                                x1.txtTracto.setText(rnx1.getString("unidadaf").trim());
                                                x1.txtTcarga.setText(rnx1.getString("carga"));
                                                x1.txtPeso.setText(rnx1.getString("peso"));
                                                x1.txtBol.setText(rnx1.getString("BOL"));

                                                x1.txtRemitente.setText(rnx1.getString("Remitente"));
                                                x1.txtDestinatario.setText(rnx1.getString("Destinatario"));

                                                x1.txtFchLlegada.setText(rnx1.getString("fchDescg"));
                                                x1.txtHrLlegada.setText(rnx1.getString("hrsDescg"));
                                                x1.txtZhx1.setText(rnx1.getString("zhx3").trim());
 
                                            }else {
                                                JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                                //ActionEvent evt = null;
                                                //exitForm(evt);
                                            }
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    } 
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                
                        x1.txtUserf1.setText(lblUserVF.getText());
                        x1.txtCartax3.setText(txtCF1.getText());
                        x1.setVisible(true);                    
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    /*Editar Movimiento x1*/
    public void validauserx1E(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starse='1' and Estado='activo'");
                if(rs1.next() == true){
                  x1Editar();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void x1Editar(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X1_STATUS_1 where (Categoriax1 ='IR') AND ERRORX1 !='710' AND Archivox1 ='CREADO' and ArchivoAF='creado' AND Cartaportex1='"+txtCF1.getText()+"'");
                if(rs1.next() == true){                        
                        Connection miConexionex1 =(Connection)ConexionEDI.GetConnection();
                        try {
                           Statement statementex1 =(Statement)miConexionex1.createStatement();
//                           ResultSet rex1 = statementex1.executeQuery("select * from  TBL_REG_AF_1 where CartaporteAF='"+txtCF1.getText()+"' and AGETA ='AG-ETA'");
                           ResultSet rex1 = statementex1.executeQuery("select * from  TBL_REG_AF_1 where CartaporteAF='"+txtCF1.getText()+"' ");
                                if(rex1.next() == true){
                                Smtx1Editar x1=new Smtx1Editar();
                                    x1.txtFchLlegada.setText(rex1.getString("fchAG"));
                                    x1.txtHrLlegada.setText(rex1.getString("hrAG"));
                                    Connection miConexionrx1 =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementrx1 =(Statement)miConexionrx1.createStatement();
                                       ResultSet rrx1= statement.executeQuery("select * from  VTBL_REG_X1_STATUS_1 where CartaporteX1='"+txtCF1.getText()+"'");
                                            if(rrx1.next() == true){                  
                                                x1.txtTerminal=rrx1.getString("ter_carta");
                                                x1.stos=rrx1.getString("status_orden");
                                                x1.txtRem1.setText(rrx1.getString("remolqueaf"));
                                                x1.txtCPO1.setText(rrx1.getString("VALOR_CLI_RUBRO1"));
                                                x1.txtFCarta=rrx1.getString("folio_carta");
                                                x1.txtTracto.setText(rrx1.getString("unidadaf").trim());
                                                x1.txtTcarga.setText(rrx1.getString("carga"));
                                                x1.txtPeso.setText(rrx1.getString("peso"));
                                                x1.txtBol.setText(rrx1.getString("BOL"));

                                                x1.txtRemitente.setText(rrx1.getString("Remitente"));
                                                x1.txtDestinatario.setText(rrx1.getString("Destinatario"));
                                                x1.txtZhx1.setText(rrx1.getString("zhx3").trim());   

                                    Connection miConexionrx1r =(Connection)ConexionEDI.GetConnection();
                                    try {
                                       Statement statementx1r =(Statement)miConexionrx1r.createStatement();
                                       ResultSet rx1r = statement.executeQuery("select * from  VTBL_REG_X1_STATUS_1 where CartaporteX1='"+txtCF1.getText()+"'");
                                            if(rx1r.next() == true){
                                                x1.txtTerminal=rx1r.getString("ter_carta");
                                                x1.stos=rx1r.getString("status_orden");
                                                x1.txtRem1.setText(rx1r.getString("remolqueaf"));
                                                x1.txtCPO1.setText(rx1r.getString("VALOR_CLI_RUBRO1"));
                                                x1.txtFCarta=rx1r.getString("folio_carta");
                                                x1.txtTracto.setText(rx1r.getString("unidadaf").trim());
                                                x1.txtTcarga.setText(rx1r.getString("carga"));
                                                x1.txtPeso.setText(rx1r.getString("peso"));
                                                x1.txtBol.setText(rx1r.getString("BOL"));

                                                x1.txtRemitente.setText(rx1r.getString("Remitente"));
                                                x1.txtDestinatario.setText(rx1r.getString("Destinatario"));

                                                x1.txtFchLlegada.setText(rx1r.getString("fchDescg"));
                                                x1.txtHrLlegada.setText(rx1r.getString("hrsDescg"));
                                                x1.txtZhx1.setText(rx1r.getString("zhx3").trim()); 
                        x1.txtUserf1.setText(lblUserVF.getText());
                        x1.txtCartax3.setText(txtCF1.getText());
                        x1.setVisible(true);
                                            }else {
                                                JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                            }
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    }                                                 
                                            }else {
                                                JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                            }
                                    } catch (SQLException ex) {
                                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                                    } 
                                }else {
                                                JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
  
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }    
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    /*Cancelar Movimiento x1*/
    public void validauserx1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  starsc='1' and Estado='activo'");
                if(rs1.next() == true){                    
                    ValidaCancelarx1();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    String t,f;
    public void ValidaCancelarx1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X1_STATUS_1 where Archivox1='CREADO' AND (Categoriax1='IA' OR Categoriax1='IE') AND Errorx1!='710' and actual <= dia AND cartaportex1='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                    t=rs1.getString("ter_cartax1");
                    f=rs1.getString("Foliox1");
                    v210();
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);                          
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    public void v210(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_CONS_FACTURACION210 where archivo210='CREADO' and terminal_carta='"+t+"' and folio_carta='"+f+"'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null,"La carta porte en proceso de cobro","Advertencia",JOptionPane.WARNING_MESSAGE);
                }else{ 
                    
                    Connection miConexionx1 =(Connection)ConexionEDI.GetConnection();
                    try {
                       Statement statementx1 =(Statement)miConexionx1.createStatement();
                       ResultSet rx1 = statementx1.executeQuery("select * from  VTBL_REG_X1_STATUS_1 where CartaporteX1='"+txtCF1.getText()+"'");
                            if(rx1.next() == true){
                            Smtx1Cancel x1=new Smtx1Cancel();
                                x1.txtTerminal.setText(rx1.getString("ter_cartax1"));
                                x1.txtRem1.setText(rx1.getString("remolquex1"));
                                x1.txtCPO1.setText(rx1.getString("VALOR_CLI_RUBRO1"));
                                x1.txtFCarta.setText(rx1.getString("FolioX1"));
                                x1.txtTracto.setText(rx1.getString("unidadx1").trim());
                                x1.txtTcarga.setText(rx1.getString("carga"));
                                x1.txtOrigen.setText(rx1.getString("origen_nom"));
                                x1.txtDestino.setText(rx1.getString("destinatario_nom"));
                                x1.txtPeso.setText(rx1.getString("peso"));
                                x1.txtBol.setText(rx1.getString("Factura"));
                                x1.txtTransporte.setText(rx1.getString("EQUIPO"));
                                x1.txtFchLlegada.setText(rx1.getString("fchx1"));
                                x1.txtHrLlegada.setText(rx1.getString("hrx1"));

                                x1.txtRemitente.setText(rx1.getString("Remitente"));
                                x1.txtcdOrigen.setText(rx1.getString("cd_Origen"));
                                x1.txtDestinatario.setText(rx1.getString("Destinatario"));
                                x1.txtcdDestino.setText(rx1.getString("cd_destino"));
                                x1.txtZh.setText(rx1.getString("zhx1").trim());
                                x1.txtEvento.setText(rx1.getString("ReasonCodex1"));  
                            x1.txtUserf1.setText(lblUserVF.getText());
                            x1.txtCartax3.setText(txtCF1.getText());                  
                            x1.setVisible(true);
                            }else {
                                JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                //ActionEvent evt = null;
                                //exitForm(evt);
                            }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                    }                                         
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /*Registrar movimiento AG*/
    public void validauserAG(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUserVF.getText()+"' and  staG='1' and Estado='activo'");
                if(rs1.next() == true){
                    validaAF_AG();
                }else {
                    JOptionPane.showMessageDialog(null,"Opcion no disponible al usuario","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void  validaAF_AG(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where ARCHIVOAF ='creado' and (CategoriaAF='IA' OR CategoriaAF='IE') and CartaporteAF='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                    X1_AG(); 
                }else {
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }
    
    public void X1_AG(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_X1_STATUS_1 where  (Archivox1 ='CREADO' and categoriax1='IR' AND ERRORX1 !='710' or Archivox1 !='CREADO' OR Archivox1 IS NULL) AND Cartaportex1='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                        StmAG ag=new StmAG();
                        Connection miConexionag =(Connection)ConexionEDI.GetConnection();
                        try {
                            Statement statementag =(Statement)miConexionag.createStatement();
                            ResultSet rag = statementag.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+txtCF1.getText()+"'");  
                                if(rag.next() == true){
                                    ag.txtTerminal=rag.getString("ter_carta");
                                    ag.txtRem1.setText(rag.getString("remolqueAF"));
                                    ag.txtCPO1.setText(rag.getString("VALOR_CLI_RUBRO1"));
                                    ag.txtFCarta=rag.getString("folio_carta");
                                    ag.txtTracto.setText(rag.getString("unidadAF").trim());
                                    ag.txtTcarga.setText(rag.getString("carga"));
                                    ag.txtBol.setText(rag.getString("bol").trim());
                                    ag.txtPeso.setText(rag.getString("peso"));
                                    ag.txtRemitente.setText(rag.getString("remitente").trim());
                                    ag.txtDestinatario.setText(rag.getString("destinatario").trim());
                                    ag.txtZh.setText(rag.getString("zhx3")); 
                                    ag.idAF=rag.getString("idAF");
                        ag.txtUserf1.setText(lblUserVF.getText());
                        ag.txtCartax3.setText(txtCF1.getText());
                        ag.setVisible(true); 
                                }else {
                                    JOptionPane.showMessageDialog(null, "La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                                    //ActionEvent evt = null;
                                    //exitForm(evt); 
                                }
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                        }                     
                }else{ 
                    JOptionPane.showMessageDialog(null,"La transaccion no se puede registrar","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }    
    
    public void vmap(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X3_1 where AP50='ap-aplicado' and cartaportex3='"+txtCF1.getText()+"'");
                if(rs1.next() == true){
                    apViewG viewap=new apViewG();
                    viewap.txtUserf1.setText(lblUserVF.getText());
                    viewap.txtCartax4.setText(txtCF1.getText());
                    viewap.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"La carta porte no presenta un movimiento de cancelación.","Infomativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }     
    
    String fchAF;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchAF=datefecha1.format(date);
    }
    
    //metodo que actualiza fechas de stars
    public void upcitas()throws SQLException, ParseException{           
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchAF;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }            
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set fecha_carga=?,salida_programada=? where Cartaporte='"+respuesta+"'");                    
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.setTimestamp(2,timestamp1);                    
                    stp.executeUpdate(); 
                    upcitasx3();
                    JOptionPane.showMessageDialog(null,"Registro actualizado. Considere que las cita y salida son actuales.","Informativo",JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }  
    }
    
    public void upcitasx3()throws SQLException, ParseException{           
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchAF;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }            
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set fecha_carga=?,fecha_entrega=? where Cartaportex3='"+respuesta+"'");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.setTimestamp(2,timestamp1);  
                    stp.executeUpdate(); 
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }  
    }  

    public void formularioemergente(){
//        final Runnable tarea=new Runnable() {
//            @Override
//            public void run() {
StmAG ag=new StmAG();
Connection miConexionag =(Connection)ConexionEDI.GetConnection();
try {
    Statement statementag =(Statement)miConexionag.createStatement();
    ResultSet rag = statementag.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+fe+"'");  
        if(rag.next() == true){
            ag.txtTerminal=rag.getString("ter_carta");
            ag.txtRem1.setText(rag.getString("remolqueAF"));
            ag.txtCPO1.setText(rag.getString("VALOR_CLI_RUBRO1"));
            ag.txtFCarta=rag.getString("folio_carta");
            ag.txtTracto.setText(rag.getString("unidadAF").trim());
            ag.txtTcarga.setText(rag.getString("carga"));
            ag.txtBol.setText(rag.getString("bol").trim());
            ag.txtPeso.setText(rag.getString("peso"));
            ag.txtRemitente.setText(rag.getString("remitente").trim());
            ag.txtDestinatario.setText(rag.getString("destinatario").trim());
            ag.txtZh.setText(rag.getString("zhx3")); 
            ag.idAF=rag.getString("idAF");
ag.txtUserf1.setText(lblUserVF.getText());
ag.txtCartax3.setText(fe);
ag.setVisible(true); 
        }else {
//            JOptionPane.showMessageDialog(null, "Los datos no son consistentes ","Advertencia",JOptionPane.WARNING_MESSAGE);
//            ActionEvent evt = null;
//            exitForm(evt); 
        }
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
}
//			}
//        	};
//        ScheduledExecutorService timer= Executors.newSingleThreadScheduledExecutor();
//        timer.scheduleAtFixedRate(tarea,1,1, TimeUnit.MINUTES);

    }//metodo
    
    public void CorresYaz(){
       /*SwingUtilities.invokeLater(new Runnable()
        {            
            public void run()
            {
                ActionListener action = new ActionListener()
                {   
                    public void actionPerformed(ActionEvent event)
                    {
                        initTabla();
                        System.out.println("inicializo tabla");
                    }
                };
                timer = new Timer(delay, action);
                timer.setInitialDelay(0);
                timer.start();
            }
        });
    }    
    select * from VTBL_X3_ASIGNACION 
    public void detenerTIMER(){
         timer.stop();
    } */
    }   
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
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
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JLabel lblUserVF;
    private javax.swing.JLabel lblerror;
    public javax.swing.JTextField txtCF1;
    private javax.swing.JTextField txtFolio;
    private javax.swing.JTextField txtFolio2;
    private javax.swing.JTextField txtProveedor;
    private javax.swing.JTextField txtRem;
    private javax.swing.JTextField txtTerminal;
    private javax.swing.JTextField txtUnidad;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtos1;
    private javax.swing.JTextField txtos2;
    // End of variables declaration//GEN-END:variables
}

/*https://mvnrepository.com/artifact/org.glassfish.main.common/glassfish-api/4.1.2#gradle
El secreto 
girasoles, cafe y libros!
st260719jbT-yazstk01@gmail.com
--imagenes en sql.
https://jonathanbucaro.com/2015/08/23/guardar-imagen-en-base-de-datos-de-sql-server/
http://www.mediafire.com/file/0z9reathpr52a2v/grabar_imagen_sql_server.zip/file

https://www.adictosaltrabajo.com/2004/05/22/imagenbbdd/

conexiones de pool
http://www.juntadeandalucia.es/servicios/madeja/contenido/recurso/218
https://docs.microsoft.com/en-us/dotnet/framework/data/adonet/sql-server-connection-pooling
*/