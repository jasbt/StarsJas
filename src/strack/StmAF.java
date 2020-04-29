package strack;

import Clases.ConexionEDI;
import Clases.ImagenesStars;
import Clases.ImagenesStarsError;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class StmAF extends javax.swing.JFrame {
    private DefaultComboBoxModel modelaf;
    public StmAF() {
        modelaf = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        llenaemaf();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTcarga = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtRemitente = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtDestinatario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCartax3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTracto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRem1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCPO1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtBol = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFPCarga = new javax.swing.JTextField();
        txtHPCarga = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFPEntrega = new javax.swing.JTextField();
        txtHPEntrega = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFchSalida = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtHrSalida = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtZh = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tbnCrear1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salida de cargar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        tbnCrear.setText("Crear");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Origen y Destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel14.setText("Carga:");

        txtTcarga.setEditable(false);
        txtTcarga.setBorder(null);

        jLabel20.setText("Peso:");

        txtPeso.setEditable(false);
        txtPeso.setBorder(null);

        jLabel28.setText("Remitente:");

        txtRemitente.setEditable(false);
        txtRemitente.setBorder(null);

        jLabel29.setText("Destinatario:");

        txtDestinatario.setEditable(false);
        txtDestinatario.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDestinatario)
                        .addGap(10, 10, 10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(3, 3, 3)
                        .addComponent(txtTcarga, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtTcarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Orden de Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel2.setText("Cartaporte:");

        txtCartax3.setEditable(false);
        txtCartax3.setBorder(null);

        jLabel9.setText("Unidad:");

        jLabel10.setText("Remolque:");

        txtRem1.setEditable(false);
        txtRem1.setBorder(null);

        jLabel8.setText("CPO:");

        txtCPO1.setEditable(false);
        txtCPO1.setBorder(null);

        jLabel17.setText("No. BOL:");

        txtBol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBolActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(10, 10, 158));
        jLabel5.setText("Salida programada:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Entrega programada:");

        jLabel26.setForeground(new java.awt.Color(10, 10, 185));
        jLabel26.setText("Sumar hrs. de Transito para Fecha de Entrega.");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Nota:");

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setMaximumSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTracto, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRem1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFPEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHPEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(14, 14, 14)
                        .addComponent(txtFPCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHPCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCPO1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(txtBol, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTracto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCPO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtBol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFPCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHPCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFPEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHPEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evento salida de cargar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N
        jPanel4.setToolTipText("");
        jPanel4.setPreferredSize(new java.awt.Dimension(349, 151));

        jLabel15.setText("Evento:");

        jLabel16.setText("Fecha:");

        jLabel18.setText("Hora:");

        jLabel19.setText("Zona Hrs:");

        txtZh.setEditable(false);
        txtZh.setBorder(null);

        jLabel30.setForeground(new java.awt.Color(10, 10, 185));
        jLabel30.setText("Hora real de salida en planta o proveedor");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 0, 0));
        jLabel27.setText("Nota:");

        jComboBox1.setModel(modelaf);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtZh))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel30)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFchSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHrSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtFchSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtHrSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtZh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Transacción 214 (AF Salida de Cargar)");

        jLabel32.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel23)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        FechaSit();
        System.out.println("Metodos.StmAF.tbnCrearActionPerformed()"+Status+"-"+txtTerminal+"-"+txtDestino+"-"+txtOrigen+"-"+txtFCarta+"-"+idAF);
        String opcion = jComboBox1.getSelectedItem().toString();
        if(txtCPO1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Actualice los datos.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtTracto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de unidad.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtBol.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de bol.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFPCarga.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de cita de carga.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtHPCarga.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de hora de carga.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFPEntrega.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de cita de entrega.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtHPEntrega.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de hora de entrega.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(opcion.equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Seleccione un evento.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFchSalida.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo fecha de salida de carga.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtHrSalida.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de hora de salida de carga.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            try {           
                revmov();
            } catch (IOException | ParseException ex) {
                Logger.getLogger(StmAF.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }//GEN-LAST:event_tbnCrearActionPerformed
    
    public void revmov() throws IOException, ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where CartaporteAF='"+txtCartax3.getText()+"' and archivoAF ='CREADO'");
                if(rs1.next() == true){
                    ActionEvent evt = null;
                    exitForm(evt); 
                }else {
                    bolE();
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
        
    String evento,evento1;    
    String sizh,sizh1;
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        clearForm();
    }//GEN-LAST:event_tbnCrear1ActionPerformed

    private void txtBolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBolActionPerformed
    
    public void bolE() throws SQLException, ParseException{
        String expresion ="([a-zA-Z0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtBol.getText());
            mach.find();
        if(mach.matches()){ 
            vbolcpo();
        }else{
            JOptionPane.showMessageDialog(null,"El campo bol no acepta caracteres especiales","Informativo",JOptionPane.INFORMATION_MESSAGE);   
        }
    }
    
    public void vbolcpo() throws SQLException, ParseException{
        if(txtBol.getText().toUpperCase().equals("MULTIPLE")){
            unidad();
        }else{            
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            try {
                Statement statement =(Statement)miConexion.createStatement();
                ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_AF_STATUS_1 where bol='"+txtBol.getText()+"' and VALOR_CLI_RUBRO1='"+txtCPO1.getText()+"' ");
                    if(rs1.next() == true){     
                        JOptionPane.showMessageDialog(null, "La evidencia ya se ha registrado","Advertencia",JOptionPane.WARNING_MESSAGE);
                        txtBol.setText("");
                    }else {
                        unidad();
                    }               
            } catch (HeadlessException | SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            } 
        }
    }   
    
    public void unidad() throws SQLException, ParseException{
        String expresion ="([a-zA-Z0-9_]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtTracto.getText());
            mach.find();
        if(mach.matches()){ 
            ValidarSalida();
        }else{
            JOptionPane.showMessageDialog(null,"El campo unidad no acepta caracteres especiales","Informativo",JOptionPane.INFORMATION_MESSAGE);   
        }
    }
    
    String salida;     
    public void ValidarSalida() throws ParseException{        
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_REG_HR_CPO where cpo='"+txtCPO1.getText()+"' and salida='"+txtHPCarga.getText()+"' and dia=dias");  
                if(rs1.next() == true){
                    System.out.println("dia de la semana "+ rs1.getString("salida")+" "+rs1.getString("dias")+" "+rs1.getString("dia") );                      
                    jPanel5.removeAll();
                    ImagenesStars Imagen = new ImagenesStars();
                    jPanel5.add(Imagen);
                    jPanel5.repaint();
                    formato1();
                }else{
                    int i =JOptionPane.showConfirmDialog(this, "Confirma la salida programada registrada? ",
                    "Confirmación", JOptionPane.YES_OPTION, JOptionPane.WARNING_MESSAGE);
                        if(i == 0){
                            formato1();                    
                        }else if(i == 1){
                            jPanel5.removeAll();
                            ImagenesStarsError Imagen = new ImagenesStarsError();
                            jPanel5.add(Imagen);
                            jPanel5.repaint(); 
                            txtHPCarga.setText("");
                        }                    
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    String fmt1;
    public void formato1() throws ParseException{
        fmt1="0000-00-00"; 
        if(fmt1.length() == txtFPCarga.getText().length()){            
            StringTokenizer tokens = new StringTokenizer (txtFPCarga.getText(),"-");
            System.out.println(""+tokens.countTokens());
            if(tokens.countTokens() ==3){
            String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtFPCarga.getText());
            mach.find();
            amd1();        
            }else{
               JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else {
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }      
    }
    
    public void amd1() throws ParseException{
        String anioa=fchAF.substring(0,4);
        int num1 = Integer.parseInt(anioa);
        
        String anio=txtFPCarga.getText().substring(0,4);
        int num4 = Integer.parseInt(anio);
        String mes=txtFPCarga.getText().substring(5,7);
        int num5 = Integer.parseInt(mes);
        String dia=txtFPCarga.getText().substring(8,10);
        int num6 = Integer.parseInt(dia);
        
        if(num5 > 0 && num6 > 0 && num4 <= num1 && num5 <= 12 && num6 <= 31 ){
            formatohora1();
        }else{
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    public void formatohora1() throws ParseException{
        String fh1=txtHPCarga.getText(); 
        String hv="00:00";
        if(hv.length() == txtHPCarga.getText().length()){
            StringTokenizer tokens = new StringTokenizer (txtHPCarga.getText(),":");
                if(tokens.countTokens() ==2){
                String expresion ="([0-9:0-9]+)";
                Pattern exp =Pattern.compile(expresion);
                Matcher mach = exp.matcher(txtHPCarga.getText());
                mach.find();
                        String hr,mm;
                        hr=txtHPCarga.getText().substring(0,2);
                        mm=txtHPCarga.getText().substring(3,5);
                        int hm1,hm2;
                        hm1= Integer.parseInt(hr);
                        hm2= Integer.parseInt(mm);
                        if(hm1>=0 && hm1<24 && hm2>=0 && hm2<60){
                            formato2();
                        }else{
                            JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                        }              
                }else{
                    JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else{
           JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    String fmt2;
    public void formato2() throws ParseException{
        fmt2="0000-00-00"; 
        if(fmt2.length() == txtFPEntrega.getText().length()){            
            StringTokenizer tokens = new StringTokenizer (txtFPEntrega.getText(),"-");
            if(tokens.countTokens() ==3){
            String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtFPEntrega.getText());
            mach.find();
            amd2();        
            }else{
                JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else {
            JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }    
    }
    
    public void amd2() throws ParseException{
        String anioa=fchAF.substring(0,4);
        int num1 = Integer.parseInt(anioa);
        
        String anio=txtFPEntrega.getText().substring(0,4);
        int num4 = Integer.parseInt(anio);
        String mes=txtFPEntrega.getText().substring(5,7);
        int num5 = Integer.parseInt(mes);
        String dia=txtFPEntrega.getText().substring(8,10);
        int num6 = Integer.parseInt(dia);
        
        if(num5 > 0 && num6 > 0 && num4 <= num1 && num5 <= 12 && num6 <= 31 ){
            formatohora2();
        }else{
            JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    public void formatohora2() throws ParseException{
        String fh1=txtHPEntrega.getText(); 
        String hv="00:00";
        if(hv.length() == txtHPEntrega.getText().length()){
            StringTokenizer tokens = new StringTokenizer (txtHPEntrega.getText(),":");
                if(tokens.countTokens() ==2){
                String expresion ="([0-9:0-9]+)";
                Pattern exp =Pattern.compile(expresion);
                Matcher mach = exp.matcher(txtHPEntrega.getText());
                mach.find();
                        String hr,mm;
                        hr=txtHPEntrega.getText().substring(0,2);
                        mm=txtHPEntrega.getText().substring(3,5);
                        int hm1,hm2;
                        hm1= Integer.parseInt(hr);
                        hm2= Integer.parseInt(mm);
                        if(hm1>=0 && hm1<24 && hm2>=0 && hm2<60){
                            formato3();
                        }else{
                            JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                        }              
                }else{
                    JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else{
           JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    String fmt3;
    public void formato3() throws ParseException{
        fmt3="0000-00-00"; 
        if(fmt3.length() == txtFchSalida.getText().length()){            
            StringTokenizer tokens = new StringTokenizer (txtFchSalida.getText(),"-");
            if(tokens.countTokens() ==3){
            String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtFchSalida.getText());
            mach.find();
            amd3();        
            }else{
               JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else {
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }     
    }
    
    public void amd3() throws ParseException{
        String anioa=fchAF.substring(0,4);
        int num1 = Integer.parseInt(anioa);
        
        String anio=txtFchSalida.getText().substring(0,4);
        int num4 = Integer.parseInt(anio);
        String mes=txtFchSalida.getText().substring(5,7);
        int num5 = Integer.parseInt(mes);
        String dia=txtFchSalida.getText().substring(8,10);
        int num6 = Integer.parseInt(dia);
        
        if(num5 > 0 && num6 > 0 && num4 <= num1 && num5 <= 12 && num6 <= 31 ){
            formatohora3();
        }else{
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    public void formatohora3() throws ParseException{
        String fh1=txtHrSalida.getText(); 
        String hv="00:00";
        if(hv.length() == txtHrSalida.getText().length()){
            StringTokenizer tokens = new StringTokenizer (txtHrSalida.getText(),":");
                if(tokens.countTokens() ==2){
                String expresion ="([0-9:0-9]+)";
                Pattern exp =Pattern.compile(expresion);
                Matcher mach = exp.matcher(txtHrSalida.getText());
                mach.find();
                        String hr,mm;
                        hr=txtHrSalida.getText().substring(0,2);
                        mm=txtHrSalida.getText().substring(3,5);
                        int hm1,hm2;
                        hm1= Integer.parseInt(hr);
                        hm2= Integer.parseInt(mm);
                        if(hm1>=0 && hm1<24 && hm2>=0 && hm2<60){
                            Qcmaf();
                        }else{
                            JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                        }              
                }else{
                    JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }
        }else{
           JOptionPane.showMessageDialog(null,"Formato de hora no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    String Status,txtTerminal,txtDestino,txtOrigen,txtFCarta,idAF;
    public void RegistroAF() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchAF;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    //PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set FechaAF=?,fchAG='"+txtHPEntrega+"', hrAG='"+txtFPEntrega.getText()+"' where CartaporteAF='"+txtCartax3.getText()+"' ");
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set FechaAF=?, fchAG='"+txtHPEntrega.getText()+"', hrAG='"+txtFPEntrega.getText()+"',ErrorAF=null,CategoriaAF=null,Usuario='"+txtUserf1.getText().toUpperCase()+"',Fecha='"+fchAF.substring(0,10)+"',ter_cartaAF='"+txtTerminal+"',fchaf='"+txtFchSalida.getText()+"',hraf='"+txtHrSalida.getText()+"', hrsDescg='"+txtHPEntrega.getText()+"', fchDescg='"+txtFPEntrega.getText()+"', hrProg='"+txtHPCarga.getText()+"', fchProg='"+txtFPCarga.getText()+"',statusorden='"+Status+"', remolqueAF='"+txtRem1.getText()+"', unidadAF='"+txtTracto.getText()+"', destinoAF='"+txtDestino+"', origenAF='"+txtOrigen+"', ReasonCodeAF='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"', FolioAF='"+txtFCarta+"', bol='"+txtBol.getText().toUpperCase().trim()+"',ArchivoAF='CREADO',stinterno='0',CreadoAF='MANUAL',zhAF ='"+txtZh.getText()+ "' where CartaporteAF='"+txtCartax3.getText()+"' ");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.executeUpdate();
                    panelx1();
                    ValiPreviox1();
                    JOptionPane.showMessageDialog(null,"Movimiento registrado!","Informativo",JOptionPane.INFORMATION_MESSAGE);                    
                } catch (SQLException ex) {
                    System.out.println("error");
                    //JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo 1.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }   
            ActionEvent evt = null;
            exitForm(evt); 
    }
    
    public void panelx1() throws SQLException, ParseException{
        System.out.println( txtFchSalida.getText()+" "+txtHrSalida.getText()+":00.000");
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = txtFchSalida.getText()+" "+txtHrSalida.getText()+":00.000";
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set fecha_real_salida=?,unidad='"+txtTracto.getText()+"',rem1='"+txtRem1.getText()+"',maf='1' where cartaporte='"+txtCartax3.getText()+"'");
                java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                stp.setTimestamp(1,timestamp);
                stp.executeUpdate();                    
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo 2.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void Qcmaf() throws ParseException{
            int i =JOptionPane.showConfirmDialog(this, "Confirma el movimiento para la carta porte :"+"\n"+" '"+txtCartax3.getText()+"' como correctos ? ",
            "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(i == 0){
                    try { 
                        RegistroAF();
                    } catch (SQLException ex) {
                        Logger.getLogger(StmAF.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(i == 1){
                    JOptionPane.showMessageDialog(null,"Movimiento no registrado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                }//fin de confirmación
    }
           
    public void clearForm(){
        txtBol.setText("");
        jComboBox1.setSelectedItem("Seleccione");
        txtFchSalida.setText("");
        txtHrSalida.setText("");
    }
    
    String fchAF;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchAF=datefecha1.format(date);
    }
    
    public void ValiPreviox1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from TBL_REG_X1_1 where Cartaportex1='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){
                    System.out.println("el registro previo af existe");
                }else {
                  Previox1();  
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo 3.","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Previox1() throws SQLException{
        String numCadena =idAF;
        int numEntero = Integer.parseInt(numCadena);
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    Statement st=(Statement)miConexion.createStatement();
                    st.execute("insert into TBL_REG_X1_1 (Cartaportex1,idAF) values('"+txtCartax3.getText()+"','"+numEntero+"')");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }    
    }
    
    public void llenaemaf(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_CTA_REASON_CODE where edo='0'");
            modelaf.addElement("Seleccione");
                while(rs1.next()){
                    modelaf.addElement(rs1.getString("codigo")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtBol;
    public javax.swing.JTextField txtCPO1;
    public javax.swing.JTextField txtCartax3;
    public javax.swing.JTextField txtDestinatario;
    public javax.swing.JTextField txtFPCarga;
    public javax.swing.JTextField txtFPEntrega;
    public javax.swing.JTextField txtFchSalida;
    public javax.swing.JTextField txtHPCarga;
    public javax.swing.JTextField txtHPEntrega;
    public javax.swing.JTextField txtHrSalida;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtRem1;
    public javax.swing.JTextField txtRemitente;
    public javax.swing.JTextField txtTcarga;
    public javax.swing.JTextField txtTracto;
    public javax.swing.JTextField txtUserf1;
    public javax.swing.JTextField txtZh;
    // End of variables declaration//GEN-END:variables
}