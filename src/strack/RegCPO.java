package strack;

import Clases.ConexionEDI;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class RegCPO extends javax.swing.JFrame {
    
    private DefaultComboBoxModel modelterminal;
    public RegCPO() {
        modelterminal = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        lister();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        tbnCrear1 = new javax.swing.JButton();
        lblencabezado = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRegCPO = new javax.swing.JTextField();
        txtEquipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtModo = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtviaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbterminal = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtnomOrigen = new javax.swing.JTextField();
        txtcodigoOrigen = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcpOrigen = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtedoOrigen = new javax.swing.JTextField();
        txtdirOrigen = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtcodOrigen = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtnomDestino = new javax.swing.JTextField();
        txtcodigoDestino = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtcpDestino = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtedoDestino = new javax.swing.JTextField();
        txtdirDestino = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtcodDestino = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtnomCosto = new javax.swing.JTextField();
        txtcodigoCosto = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtcpCosto = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtedoCosto = new javax.swing.JTextField();
        txtdirCosto = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtcodCosto = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        tbnCrear.setText("Guardar");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        lblencabezado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de CPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setText("CPO:");

        jLabel3.setText("Equipo:");

        jLabel4.setText("Transporte:");

        jLabel6.setText("Carga:");

        jLabel7.setText("Peso:");

        jLabel27.setText("Tipo:");

        jLabel2.setText("Viaje:");

        jLabel5.setText("Terminal:");

        cbterminal.setModel(modelterminal);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegCPO, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtModo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtviaje, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbterminal, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRegCPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtModo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtviaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(cbterminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Origen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel9.setText("Nombre de origen:");

        jLabel10.setText("Código de origen:");

        jLabel11.setText("Direccion de origen:");

        jLabel12.setText("Código postal:");

        jLabel13.setText("Ciudad:");

        jLabel14.setText("edo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtnomOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel10))
                    .addComponent(txtdirOrigen))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtedoOrigen)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodOrigen)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtnomOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtcodigoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtcpOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtdirOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtedoOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtcodOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel20.setText("Nombre de destino:");

        jLabel21.setText("Código de destino:");

        jLabel22.setText("Direccion de destino:");

        jLabel23.setText("Código postal:");

        jLabel24.setText("Ciudad:");

        jLabel25.setText("edo:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtnomDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel21))
                    .addComponent(txtdirDestino))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel23))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtedoDestino)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodDestino)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtnomDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtcodigoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtcpDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtdirDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtedoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(txtcodDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Centro de Costo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel15.setText("Nombre de centro:");

        jLabel16.setText("Código de centro de costo:");

        jLabel18.setText("Direccion:");

        jLabel19.setText("Código postal:");

        jLabel26.setText("Ciudad:");

        jLabel28.setText("edo:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtnomCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodigoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcpCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtdirCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtedoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcodCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtnomCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtcodigoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtcpCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtdirCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(txtedoCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(txtcodCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel29.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblencabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(tbnCrear)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tbnCrear1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblencabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1)
                    .addComponent(tbnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        if(txtRegCPO.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un numero de CPO","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtEquipo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el tipo de equipo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtCarga.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la carga","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtPeso.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el peso","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txttipo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese tipo de servicio","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtviaje.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese campo viaje","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtnomOrigen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de origen","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtdirOrigen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la dirección de origen","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcodigoOrigen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de la planta de origen","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcpOrigen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo postal de origen","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtedoOrigen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la ciudad de origen","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcodOrigen.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la edo de origen","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtnomDestino.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre de destino","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtdirDestino.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la dirección de destino","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcodigoDestino.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de la planta de destino","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcpDestino.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo postal de destino","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtedoDestino.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la ciudad de destino","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcodDestino.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la edo de destino","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtnomCosto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del centro de costo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtdirCosto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la dirección del centro de costo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcodigoCosto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo de la planta del centro de costo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcpCosto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo postal del centro de costo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtedoCosto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la ciudad del centro de costo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtcodCosto.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la edo del centro de costo","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(cbterminal.getSelectedItem().toString().equals("Seleccione")){
            JOptionPane.showMessageDialog(null, "Indique la terminal de la ruta","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        } else{   
            GuardarCPO();
        }
    }//GEN-LAST:event_tbnCrearActionPerformed
        
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        txtRegCPO.setText("");
        txtEquipo.setText("");
        txtCarga.setText("");        
        txtPeso.setText("");
        txtModo.setText("");        
        txtnomOrigen.setText("");
        txtcodigoOrigen.setText("");
        txtcpOrigen.setText("");
        txtdirOrigen.setText("");
        txtedoOrigen.setText("");
        txtcodOrigen.setText("");        
        txtnomDestino.setText("");
        txtcodigoDestino.setText("");
        txtcpDestino.setText("");
        txtdirDestino.setText("");
        txtedoDestino.setText("");
        txtcodDestino.setText("");        
        txtnomCosto.setText("");
        txtcodCosto.setText("");
        txtcodigoCosto.setText("");
        txtcpCosto.setText("");
        txtdirCosto.setText("");
        txtedoCosto.setText("");
        txtcodCosto.setText("");
        cbterminal.setSelectedItem("Seleccione");
    }//GEN-LAST:event_tbnCrear1ActionPerformed
    
    public void GuardarCPO(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_Reg_CPO where CPO='"+txtRegCPO.getText()+"'");
                if(rs1.next() == true){
                    statement.execute("update TBL_Reg_CPO set tipo='"+txttipo.getText()+"',usuario='"+txtUserf1.getText().toUpperCase()+"',modo='"+txtModo.getText().toUpperCase().trim()+"',estado='"+"ACTIVO"
                    +"',nom_ccosto='"+txtnomCosto.getText().toUpperCase()+"',cod_ccosto='"+txtcodigoCosto.getText().toUpperCase()+"',dir_ccosto='"+txtdirCosto.getText().toUpperCase()
                    +"',cd_ccosto='"+txtedoCosto.getText().toUpperCase()+"',ccd_ccosto='"+txtcodCosto.getText().toUpperCase()+"',cp_ccosto='"+txtcpCosto.getText().toUpperCase()+"',nom_destino='"+txtnomDestino.getText().toUpperCase()
                    +"',cod_destino='"+txtcodigoDestino.getText().toUpperCase()+"',dir_destino='"+txtdirDestino.getText().toUpperCase()+"',cd_destino='"+txtedoDestino.getText().toUpperCase()+"',ccd_destino='"+txtcodDestino.getText().toUpperCase()
                    +"',cp_destino='"+txtcpDestino.getText().toUpperCase()+"',nom_origen='"+txtnomOrigen.getText().toUpperCase()+"',cod_origen='"+txtcodigoOrigen.getText().toUpperCase()+"',dir_origen='"+txtdirOrigen.getText().toUpperCase()
                    +"',cd_origen='"+txtedoOrigen.getText().toUpperCase()+"',ccd_origen='"+txtcodOrigen.getText().toUpperCase()+"',cp_origen='"+txtcpOrigen.getText().toUpperCase()+"',peso='"+txtPeso.getText().toUpperCase()
                    +"',equipo='"+txtEquipo.getText().toUpperCase()+"',tipocarga='"+txtCarga.getText().toUpperCase()+"',smp='"+txtviaje.getText().trim().toUpperCase()+"',terminal='"+cbterminal.getSelectedItem().toString().toUpperCase()+"' where cpo='"+txtRegCPO.getText().toUpperCase()+"' ");
                    JOptionPane.showMessageDialog(this, "Datos Registrados Actualizados","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);    
                    ActionEvent evt = null;
                    exitForm(evt); 
                }else {
                    statement.execute("insert into TBL_Reg_CPO (CPO,equipo,tipocarga,peso,nom_origen,cod_origen,dir_origen,cd_origen,ccd_origen,cp_origen,nom_destino,cod_destino,"
                    + "dir_destino,cd_destino,ccd_destino,cp_destino,nom_ccosto,cod_ccosto,dir_ccosto,cd_ccosto,ccd_ccosto,cp_ccosto,estado,modo,usuario,tipo,smp,terminal) "
                    +"values('"+txtRegCPO.getText().toUpperCase()+"','"+txtEquipo.getText().toUpperCase()+"','"+txtCarga.getText().toUpperCase()+"','"+txtPeso.getText().toUpperCase()+"','"+txtnomOrigen.getText().toUpperCase()+"','"+txtcodigoOrigen.getText().toUpperCase()
                    +"','"+txtdirOrigen.getText().toUpperCase()+"','"+txtedoOrigen.getText().toUpperCase()+"','"+txtcodOrigen.getText().toUpperCase()+"','"+txtcpOrigen.getText().toUpperCase()+"','"+txtnomDestino.getText().toUpperCase()+"','"
                    +txtcodigoDestino.getText().toUpperCase()+"','"+txtdirDestino.getText().toUpperCase()+"','"+txtedoDestino.getText().toUpperCase()+"','"+txtcodDestino.getText().toUpperCase()+"','"+txtcpDestino.getText().toUpperCase()+"','"
                    +txtnomCosto.getText().toUpperCase()+"','"+txtcodigoCosto.getText().toUpperCase()+"','"+txtdirCosto.getText().toUpperCase()+"','"+txtedoCosto.getText().toUpperCase()+"','"+txtcodCosto.getText().toUpperCase()+"','"+txtcpCosto.getText().toUpperCase()
                    +"','ACTIVO','"+txtModo.getText().toUpperCase().trim()+"','"+txtUserf1.getText().toUpperCase()+"','"+txttipo.getText()+"','"+txtviaje.getText().trim().toUpperCase()+"','"+cbterminal.getSelectedItem().toString().toUpperCase()+"')");
                    JOptionPane.showMessageDialog(this, "Datos Registrados Correctamente","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE); 
                    ActionEvent evt = null;
                    exitForm(evt); 
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }        
    }

    public void lister(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_TERMINAL where ESTADO='0'");
            modelterminal.addElement("Seleccione");
                while(rs1.next()){
                    modelterminal.addElement(rs1.getString("PREFIJO")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        }         
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> cbterminal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JLabel lblencabezado;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtCarga;
    public javax.swing.JTextField txtEquipo;
    public javax.swing.JTextField txtModo;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtRegCPO;
    public javax.swing.JTextField txtUserf1;
    public javax.swing.JTextField txtcodCosto;
    public javax.swing.JTextField txtcodDestino;
    public javax.swing.JTextField txtcodOrigen;
    public javax.swing.JTextField txtcodigoCosto;
    public javax.swing.JTextField txtcodigoDestino;
    public javax.swing.JTextField txtcodigoOrigen;
    public javax.swing.JTextField txtcpCosto;
    public javax.swing.JTextField txtcpDestino;
    public javax.swing.JTextField txtcpOrigen;
    public javax.swing.JTextField txtdirCosto;
    public javax.swing.JTextField txtdirDestino;
    public javax.swing.JTextField txtdirOrigen;
    public javax.swing.JTextField txtedoCosto;
    public javax.swing.JTextField txtedoDestino;
    public javax.swing.JTextField txtedoOrigen;
    public javax.swing.JTextField txtnomCosto;
    public javax.swing.JTextField txtnomDestino;
    public javax.swing.JTextField txtnomOrigen;
    public javax.swing.JTextField txttipo;
    public javax.swing.JTextField txtviaje;
    // End of variables declaration//GEN-END:variables
}