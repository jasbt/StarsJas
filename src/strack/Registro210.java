package strack;

import Clases.ConexionEDI;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Registro210 extends javax.swing.JFrame {

    public Registro210() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtConvenio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtRemitente = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDom1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFolio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtFchTalon = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFactura = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtBol = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtFchbol = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txtBolStars = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtRef = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtPlanta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtIva = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtRetencion = new javax.swing.JTextField();
        txtFCreacion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtDom2 = new javax.swing.JTextField();
        txtDestinatario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        txtStars = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtCarga = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtCaja = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtFchStars = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        txtCenc2 = new javax.swing.JTextField();
        txtCenc1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        txtConvenio.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Transacción 210");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nueva Transacción 210 (Facturación)");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar1.png"))); // NOI18N
        tbnCrear.setText("Crear");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/eliminar.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Origen", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        jLabel11.setText("Remitente:");

        txtRemitente.setEditable(false);
        txtRemitente.setBorder(null);

        jLabel12.setText("Domicilio:");

        txtDom1.setEditable(false);
        txtDom1.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtRemitente)
                    .addComponent(txtDom1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Factura", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel13.setText("Terminal:");

        txtTer.setEditable(false);
        txtTer.setBorder(null);

        jLabel5.setText("Folio:");

        txtFolio.setEditable(false);
        txtFolio.setBorder(null);

        jLabel6.setText("Fecha:");

        txtFchTalon.setEditable(false);
        txtFchTalon.setBorder(null);

        jLabel2.setText("Factura:");

        txtFactura.setEditable(false);
        txtFactura.setBorder(null);

        jLabel21.setText("Status:");

        txtStatus.setEditable(false);
        txtStatus.setBorder(null);

        jLabel29.setText("Factura(Bol):");

        jLabel34.setText("Fecha (Bol):");

        jLabel35.setText("Factura(Stars):");

        txtBolStars.setEditable(false);
        txtBolStars.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFchbol)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBol))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTer, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5)
                                        .addGap(0, 9, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFchTalon))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtBolStars)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel5)
                    .addComponent(txtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFchTalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtBolStars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtBol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(txtFchbol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rubros de Facturación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel4.setText("Referencia:");

        txtRef.setEditable(false);
        txtRef.setBorder(null);
        txtRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRefActionPerformed(evt);
            }
        });

        jLabel7.setText("Codigo:");

        txtCodigo.setEditable(false);
        txtCodigo.setBorder(null);

        jLabel8.setText("Planta:");

        txtPlanta.setEditable(false);
        txtPlanta.setBorder(null);

        jLabel9.setText("Iva:");

        txtSubtotal.setEditable(false);
        txtSubtotal.setBorder(null);

        jLabel10.setText("Total:");

        txtTotal.setEditable(false);
        txtTotal.setBorder(null);

        jLabel22.setText("Subtotal:");

        txtIva.setEditable(false);
        txtIva.setBorder(null);

        jLabel23.setText("Retención:");

        txtRetencion.setEditable(false);
        txtRetencion.setBorder(null);

        txtFCreacion.setEditable(false);
        txtFCreacion.setBorder(null);

        jLabel24.setText("Creación:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(txtRef))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlanta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(22, 22, 22)
                        .addComponent(txtSubtotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(14, 14, 14)
                                .addComponent(txtRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(txtFCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtRetencion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFCreacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        txtDom2.setEditable(false);
        txtDom2.setBorder(null);

        txtDestinatario.setEditable(false);
        txtDestinatario.setBorder(null);

        jLabel14.setText("Domicilio:");

        jLabel20.setText("Destinatario:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDestinatario)
                    .addComponent(txtDom2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtDestinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte de Stars", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(329, 162));

        jLabel28.setText("Cartaporte(Factura):");

        jLabel30.setText("Tipo de carga:");

        txtCarga.setEditable(false);
        txtCarga.setBorder(null);

        txtPeso.setEditable(false);
        txtPeso.setBorder(null);

        jLabel33.setText("Peso:");

        jLabel36.setText("Caja:");

        jLabel37.setText("Fecha:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel33)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(jLabel36)
                            .addGap(47, 47, 47)
                            .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStars, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFchStars, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtFchStars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtCarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Centro de Costo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        txtCenc2.setEditable(false);
        txtCenc2.setBorder(null);

        txtCenc1.setEditable(false);
        txtCenc1.setBorder(null);

        jLabel31.setText("Domicilio:");

        jLabel32.setText("Remitente:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCenc1)
                    .addComponent(txtCenc2, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtCenc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtCenc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel16.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
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
        if(txtBol.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el folio de remision del proveedor","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFchbol.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la fecha de evidencia (bol)","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtStars.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la cartaporte o factura de stars","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFchStars.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese la fecha de cartaporte o factura de stars","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtCaja.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el numero de caja asignado","Informativo",JOptionPane.INFORMATION_MESSAGE);
        }else{ 
            val_bol();
        }            
    }//GEN-LAST:event_tbnCrearActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRefActionPerformed
     
    String evento,evento1,sizh,sizh1;    
    public void CreaRegistra(){
        Fechas();
        int i =JOptionPane.showConfirmDialog(this, "Confirma que los datos para la factura :"+"\n"+" '"+txtFactura.getText()+"' ? ",
                "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(i == 0){
            try { 
                Registro210();                               
            } catch (SQLException ex) {
                Logger.getLogger(Registro210.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(i == 1){
            JOptionPane.showMessageDialog(null, "Revise nuevamente los datos","Informativo",JOptionPane.INFORMATION_MESSAGE);
        }
    }
        
    public void Registro210() throws SQLException{ 
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();  
        try {
           Statement statement1 =(Statement)miConexion1.createStatement();
           ResultSet rsa = statement1.executeQuery("select * from VTBL_FACTURA210 where factura='"+txtFactura.getText()+"' and  STATUS_TAL='activa' and archivo210='creado'");
                if(rsa.next() == true){  
                    JOptionPane.showMessageDialog(this, "Transacción ya registrada","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }else {
                        String cpoU=txtRef.getText().replace("CPO", "").trim();
                        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                        String strFecha = fch210;
                            Date fechaj = null;
                            try {
                                fechaj = formatoDelTexto.parse(strFecha);
                            } catch (ParseException ex) {
                            }
                        Connection miConexion =(Connection)ConexionEDI.GetConnection();
                        PreparedStatement stp=miConexion.prepareStatement("update TBL_FACTURA210 set fecha210=?,usuario='"+txtUserf1.getText().toUpperCase()+"', prefecha='"+txtFCreacion.getText()+"', editado='"+"CREADO"+"',bolstar='"+txtBolStars.getText().toUpperCase()+"', archivo210='"+"CREADO"+"',fchbol='"+txtFchbol.getText()+"',fechacarta='"+txtFchStars.getText()+"',caja='"+txtCaja.getText().trim()+"',cartaporte='"+txtStars.getText().toUpperCase()+"', bolfactura='"+txtBol.getText().toUpperCase()+"',control='0' where factura='"+txtFactura.getText()+"'");                           
                        java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                        stp.setTimestamp(1,timestamp);
                        stp.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Registro actualizado","Informativo",JOptionPane.INFORMATION_MESSAGE);
                        ActionEvent evt = null;
                        exitForm(evt);
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(this, "Falla la actualización de datos","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    String fs,fch210;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        txtFCreacion.setText(datefecha.format(date)); 
        String dato=txtFCreacion.getText();
        fs= dato.replaceAll("-","");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fch210=(datefecha1.format(date));
    }
    
    String min1;
    public void Vfecha(){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFecha = txtFchbol.getText();
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
                Vfecha1();
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese la fecha de evidenica en el formato AAAA-MM-DD ","Informativo",JOptionPane.INFORMATION_MESSAGE);
            }     
    }
    
    String min;
    public void Vfecha1(){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFecha = txtFchStars.getText();
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
                ValidaCaja();
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(null, "Ingrese la fecha de stars en el formato AAAA-MM-DD ","Informativo",JOptionPane.INFORMATION_MESSAGE);
            }     
    }
    
    public void ValidaCaja(){
        String expresion ="([0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtCaja.getText());
            mach.find();
        if(mach.matches()){
            Fechas();
            CreaRegistra();
        }else{
            JOptionPane.showMessageDialog(null,"El campo caja solo debe contener números.","Informativo",JOptionPane.INFORMATION_MESSAGE);  
        }                       
    }
    
    String fe,ff,fst;
    public void Fechas(){                   
        String ftalon=txtFchTalon.getText().trim();
        String ftalon1= ftalon.replaceAll("-","");
        ff= ftalon1.substring(0,8);
        
        String fbol=txtFchbol.getText().trim();
        String fevi= fbol.replaceAll("-","");
        fe= fevi.substring(0,8);
        
        String fstar=txtFchStars.getText().trim();
        String stars= fstar.replaceAll("-","");
        fst= stars.substring(0,8);
    }
          
    public void val_bol(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();  
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from VTBL_FACTURA210 where bolfactura='"+txtBol.getText()+"' and campo_ref1='"+txtRef.getText().trim().replace("CPO", "")+"' and STATUS_TAL='activa' and folio_nota is null and archivo210 ='creado'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "Evidencia ya registrado en un activo ","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    val_CP();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void val_CP(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();  
        try {
           Statement statement =(Statement)miConexion.createStatement();
           ResultSet rs1 = statement.executeQuery("select * from VTBL_FACTURA210 where  cartaporte='"+txtStars.getText()+"' and STATUS_TAL='activa' and folio_nota is null and archivo210 ='creado'");
                if(rs1.next() == true){
                    JOptionPane.showMessageDialog(null, "Carta porte en proceso de cobranza","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }else {
                    Vfecha();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JTextField txtBol;
    private javax.swing.JTextField txtBolStars;
    public javax.swing.JTextField txtCaja;
    public javax.swing.JTextField txtCarga;
    public javax.swing.JTextField txtCenc1;
    public javax.swing.JTextField txtCenc2;
    public javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConvenio;
    public javax.swing.JTextField txtDestinatario;
    public javax.swing.JTextField txtDom1;
    public javax.swing.JTextField txtDom2;
    private javax.swing.JTextField txtFCreacion;
    public javax.swing.JTextField txtFactura;
    private javax.swing.JTextField txtFchStars;
    public javax.swing.JTextField txtFchTalon;
    public javax.swing.JTextField txtFchbol;
    public javax.swing.JTextField txtFolio;
    public javax.swing.JTextField txtIva;
    public javax.swing.JTextField txtPeso;
    public javax.swing.JTextField txtPlanta;
    public javax.swing.JTextField txtRef;
    public javax.swing.JTextField txtRemitente;
    public javax.swing.JTextField txtRetencion;
    private javax.swing.JTextField txtStars;
    public javax.swing.JTextField txtStatus;
    public javax.swing.JTextField txtSubtotal;
    public javax.swing.JTextField txtTer;
    public javax.swing.JTextField txtTotal;
    public javax.swing.JTextField txtUserf1;
    // End of variables declaration//GEN-END:variables
}

//boton de cagar datos //ConsultaDatos(); 

//    String referencia2,carga,ref;
//    public void ConsultaDatos(){
//        Connection miConexion =(Connection)ConexionEDI.GetConnection();
//        try {
//           Statement statement =(Statement)miConexion.createStatement();
//           ResultSet rs1 = statement.executeQuery("select * from VTBL_FACTURA210 where FACTURA='"+txtFactura.getText()+"'and Archivo210 is NULL ");
//                if(rs1.next() == true){
//                    txtTer.setText(rs1.getString("talon_prefijo").trim());
//                    txtFolio.setText(rs1.getString("talon_folio").trim());
//                    txtFchTalon.setText(rs1.getString("fch_crea").trim());
//                    txtStatus.setText(rs1.getString("STATUS_TAL").trim());
//                    txtRef.setText(rs1.getString("campo_ref1").trim());
//                    txtCodigo.setText(rs1.getString("campo_ref2").trim());
//                    txtPlanta.setText(rs1.getString("campo_ref4").trim());
//                    txtSubtotal.setText(rs1.getString("MONTO_FLETE").trim());
//                    txtIva.setText(rs1.getString("val_iva").trim());
//                    txtRetencion.setText(rs1.getString("val_riva").trim());
//                    txtTotal.setText(rs1.getString("val_total").trim());
//                    txtCaja.setText(rs1.getString("caja"));
//                    String rf= rs1.getString("campo_ref1").trim();
//                    ref= rf.replaceAll("CPO","");
//                    String cj=txtCaja.getText().trim();
//                    txtCaja.setText(cj);
//                    ConsultaCPO();  
//                    if (!txtCaja.equals("")){
//                        txtCaja.getText().trim();
//                    }
//                }else {
//                    JOptionPane.showMessageDialog(null, "Ya se a generado una transacción para esta factura ");
//                }
//        } catch (HeadlessException | SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
//        } 
//    }
    
//    String ar,Payment,py,py1,tar,modo;
//    public void ConsultaCPO(){
//        Connection miConexion =(Connection)ConexionEDI.GetConnection();
//        try {
//           Statement statement =(Statement)miConexion.createStatement();
//           ResultSet rs1 = statement.executeQuery("select * from TBL_Reg_CPO where CPO ='"+ref.trim()+"' and estado ='activo'");
//                if(rs1.next() == true){
//                    txtRemitente.setText(rs1.getString("nom_origen").trim()+","+rs1.getString("cod_origen").trim());
//                    txtDom1.setText(rs1.getString("dir_origen").trim()+","+rs1.getString("cd_origen").trim()+","+rs1.getString("ccd_origen").trim()+","+rs1.getString("cp_origen").trim()+",MX");
//                    txtDestinatario.setText(rs1.getString("nom_destino").trim()+","+rs1.getString("cod_destino").trim());
//                    txtDom2.setText(rs1.getString("dir_destino").trim()+","+rs1.getString("cd_destino").trim()+","+rs1.getString("ccd_destino").trim()+","+rs1.getString("cp_destino").trim()+",MX");   
//                    txtCenc1.setText(rs1.getString("nom_ccosto").trim()+","+rs1.getString("cod_ccosto").trim());
//                    txtCenc2.setText(rs1.getString("dir_ccosto").trim()+","+rs1.getString("cd_ccosto").trim()+","+rs1.getString("ccd_ccosto").trim()+","+rs1.getString("cp_ccosto").trim()+",MX");      
//                    txtCarga.setText(rs1.getString("tipocarga").trim());
//                    txtPeso.setText(rs1.getString("peso").trim());
//                    ar=rs1.getString("equipo").trim();
//                    Payment=txtCarga.getText();
//                    py=rs1.getString("smp").trim();
//                    modo=rs1.getString("modo").trim();
//                    String code1="MATERIAL";
//                        String code2=Payment;
//                        boolean resultado=code2.contains(code1);
//                        if(resultado){
//                            py1="2";
//                        }else{
//                            py1="1";
//                        }
//                        String codea="40";
//                        String codeb=ar;
//                        boolean resultado1=codeb.contains(codea);
//                        if(resultado1){
//                            tar="40";
//                        }else{
//                            tar="53";
//                        }   
//                }else {
//                    JOptionPane.showMessageDialog(null, "No hay registro de la CPO o se encuentra Cancelada","Informativo",JOptionPane.INFORMATION_MESSAGE);
//                }
//        } catch (HeadlessException | SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la información "+ex.getMessage(),"Mensaje de Error",JOptionPane.ERROR_MESSAGE);
//        } 
//    }

//    File rutarch;
//    private void Transaccion210() throws SQLException{
//        try {
//            String nombre="";
//            JFileChooser file=new JFileChooser("//SERVIDOR_11//EnvioEDI");
//            file.showSaveDialog(this);
//            File guarda =file.getSelectedFile();
//            if(guarda !=null){
//            FileWriter  save=new FileWriter(guarda+".txt");
//            save.write("CAB,01210                         ,54930                         ,X,004010,210,P"+"\r\n"+
//                "HDR,01210,ZZ,54930,ZZ,"+txtStars.getText().trim().toUpperCase()+","+txtBol.getText().toUpperCase().trim()+","+py+","+fst+","+ptotal+","+fe+",XSUP,MXP,"+txtFactura.getText()+","+ff+","+txtRef.getText().replaceAll("CPO", "").trim()+","+fe+",B,"+modo+","+fs+","+txtPeso.getText()+",XSUP,"+txtCaja.getText()+","+tar+",05300,"+ar+","+"\r\n"+
//                "ADR,CA,SUPERTRACK SA DE CV,54930,CALLE HUEJOTZINGO AEROPUERTO KM 0+0.27,CUARTO BARRIO HUEJOTZINGO,PU,74160,MX"+"\r\n"+
//                "ADR,SH,"+txtRemitente.getText()+","+txtDom1.getText()+"\r\n"+
//                "ADR,ST,"+txtDestinatario.getText()+","+txtDom2.getText()+"\r\n"+
//                "ADR,BT,"+txtCenc1.getText()+","+txtCenc2.getText()+"\r\n"+
//                "ADR,CN,"+txtDestinatario.getText()+","+txtDom2.getText()+"\r\n"+
//                "LX,1,1"+"\r\n"+
//                "L5,1,"+py1+"\r\n"+
//                "L0,1,1,FR,"+txtPeso.getText().trim()+"\r\n"+
//                "L1,1,"+psub1+",FR,"+psub+",400"+"\r\n"+
//                "L1,2,"+piva1+",FR,"+piva+",750"+"\r\n"+
//                "L1,3,"+preten1+",FR,"+preten+",TAY");
//            save.close();
//            JOptionPane.showMessageDialog(null,"El archivo se a guardado Exitosamente","Información",JOptionPane.INFORMATION_MESSAGE);
//            rutarch=guarda;
//            Registro210();
//            }else{
//                JOptionPane.showMessageDialog(null,"Se ha cancelado la transacción ","Información",JOptionPane.INFORMATION_MESSAGE);
//            }
//        }catch(IOException ex)   {
//            JOptionPane.showMessageDialog(null,"Su archivo no se ha guardado","Advertencia",JOptionPane.WARNING_MESSAGE);
//        }
//    }