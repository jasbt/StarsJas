package strack;

import Clases.ConexionEDI;
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
import javax.swing.JOptionPane;

public class RecpDoctos extends javax.swing.JFrame {

    public RecpDoctos() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        tbnCrear = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCreado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCartax3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEvidencia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRV = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCaseta = new javax.swing.JTextField();
        txtDiesel = new javax.swing.JTextField();
        txtPension = new javax.swing.JTextField();
        txtgarificacio = new javax.swing.JTextField();
        txtaduana = new javax.swing.JTextField();
        txtTalachas = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtmaniobra = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txthotel = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtanticipo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtreparacion = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtinfracciones = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txteqs = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtlubricante = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtOtro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtTotalGasto = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        tbnCrear1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recepción de Docmentos");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        tbnCrear.setText("Registrar");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Orden de Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        jLabel6.setText("Registro:");

        txtCreado.setEditable(false);
        txtCreado.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cartaporte:");

        txtCartax3.setEditable(false);
        txtCartax3.setBorder(null);

        jLabel4.setText("Evidencia:");

        jLabel7.setText("Fecha Evidencia:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Ruta:");

        txtRuta.setEditable(false);
        txtRuta.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtRuta.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Recibo de valores:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gatos de Viaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 0, 0))); // NOI18N

        jLabel1.setText("Casetas:");

        jLabel3.setText("Diesel:");

        jLabel10.setText("Gratificación:");

        jLabel11.setText("Pensión:");

        jLabel12.setText("Aduanas:");

        jLabel13.setText("Talachas:");

        txtCaseta.setText("00");

        txtDiesel.setText("00");

        txtPension.setText("00");

        txtgarificacio.setText("00");

        txtaduana.setText("00");

        txtTalachas.setText("00");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Factura1.png"))); // NOI18N
        jButton2.setToolTipText("Calcular gastos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel16.setText("Maniobras:");

        txtmaniobra.setText("00");

        jLabel18.setText("Hotel:");

        txthotel.setText("00");

        jLabel19.setText("Aniticipo:");

        txtanticipo.setText("00");

        jLabel20.setText("Reparaciones:");

        txtreparacion.setText("00");

        jLabel21.setText("Infracciones:");

        txtinfracciones.setText("00");

        jLabel22.setText("Eq.Seguridad:");

        txteqs.setText("00");

        jLabel23.setText("Lubricantes:");

        txtlubricante.setText("00");

        jLabel14.setText("Otros:");

        txtOtro.setText("00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtaduana, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPension, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtgarificacio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCaseta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtinfracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel18))
                                        .addGap(2, 2, 2)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txthotel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtanticipo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(18, 18, 18)
                                .addComponent(txtmaniobra, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTalachas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtlubricante, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txteqs, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txtmaniobra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCaseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(txthotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtDiesel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtgarificacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtanticipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(txtreparacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(txtPension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(txtinfracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtaduana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(txteqs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtTalachas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(txtlubricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Total de gastos:");

        txtTotalGasto.setEditable(false);
        txtTotalGasto.setText("00.00");
        txtTotalGasto.setBorder(null);

        jLabel24.setText("Código de Aut:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFecha))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEvidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCreado, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRV)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(txtTotalGasto, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRuta))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEvidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtRV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTotalGasto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCreado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Recepción de Documentos");

        jLabel17.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbnCrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbnCrear1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addComponent(jLabel5))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1)
                    .addComponent(tbnCrear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    
    int code;
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        FechaSit();
        if(!txtEvidencia.getText().equals("") && !txtCodigo.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Ingrese unicamente la evidencia o código de autorización.","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtEvidencia.getText().equals("") && txtCodigo.getText().equals("") ){
            JOptionPane.showMessageDialog(null, "Ingrese unicamente la evidencia o código de autorización.","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(!txtEvidencia.getText().equals("") && txtCodigo.getText().equals("") ){
            code=1;
            if(txtFecha.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingresa la fecha de evidencia","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }if(txtRV.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingresa el recibo de valores","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }else{
                try {
                    formatofecha();
                } catch (IOException | ParseException | SQLException ex) {
                    Logger.getLogger(RecpDoctos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }    
        }if(txtEvidencia.getText().equals("") && !txtCodigo.getText().equals("") ){
            code=2;
            if(txtFecha.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingresa la fecha de autorización","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }if(txtRV.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Ingresa el recibo de valores","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                return;
            }else{
                try {
                    NT();
                } catch (IOException | ParseException | SQLException ex) {
                    Logger.getLogger(RecpDoctos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }         
    }//GEN-LAST:event_tbnCrearActionPerformed
                   
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        ClearForm();
    }//GEN-LAST:event_tbnCrear1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sumagastos();
        valores();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void sumagastos(){
        String a,b,c,d,e,f,g,h,i,j,k,l,m,n;
            a=txtCaseta.getText();
            double na = Double.parseDouble(a);
            b=txtDiesel.getText();
            double nb  = Double.parseDouble(b);        
            c=txtgarificacio.getText();
            double nc = Double.parseDouble(c);        
            d=txtPension.getText();
            double nd  = Double.parseDouble(d);        
            e=txtaduana.getText();
            double ne = Double.parseDouble(e);        
            f=txtTalachas.getText();
            double nf  = Double.parseDouble(f);        
            g=txtlubricante.getText();        
            double ng  = Double.parseDouble(g);
            h=txtmaniobra.getText();        
            double nh  = Double.parseDouble(h);
            i=txthotel.getText();        
            double ni  = Double.parseDouble(i);
            j=txtanticipo.getText();        
            double nj  = Double.parseDouble(j);
            k=txtreparacion.getText();        
            double nk  = Double.parseDouble(k);
            l=txteqs.getText();        
            double nl  = Double.parseDouble(l);
            m=txtOtro.getText();        
            double nm  = Double.parseDouble(m);
            n=txtinfracciones.getText();        
            double nn  = Double.parseDouble(n);
            double r=na+nb+nc+nd+ne+nf+ng+nh+ni+nj+nk+nl+nm+nn;
            txtTotalGasto.setText(""+r);                   
    }
    
    String valor;
    public void valores(){
        valor="Caseta "+txtCaseta.getText()+",Diesel "+txtDiesel.getText()+",Gratificacion "
        +txtgarificacio.getText()+", Pension "+txtPension.getText()+", Aduanas "+txtaduana.getText()
        +", Talachas "+txtTalachas.getText()+", Lubricantes "+txtlubricante.getText()+", Maniobras "
        +txtmaniobra.getText()+", Hotel "+txthotel.getText()+", Anticipo "+txtanticipo.getText()
        +", Reparaciones "+txtreparacion.getText()+", Infraccines "+txtinfracciones.getText()
        +", Eq.Seguridad "+txteqs.getText()+", Otros "+txtOtro.getText();     
    }
    
    String fmt;
    public void formatofecha() throws IOException, ParseException, SQLException{
        fmt="0000-00-00"; 
        if(fmt.length() == txtFecha.getText().length()){            
            StringTokenizer tokens = new StringTokenizer (txtFecha.getText(),"-");
            System.out.println(""+tokens.countTokens());
            if(tokens.countTokens() ==3){
            String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtFecha.getText());
            mach.find();
            bol();        
            }else{
               JOptionPane.showMessageDialog(null,"Error en Formato de Fecha AAAA-MM-DD","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null,"Error en Formato de Fecha AAAA-MM-DD","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }      
    }
    
    public void NT() throws IOException, ParseException, SQLException{
        if (txtCodigo.getText().toUpperCase().equals("TONU")||txtCodigo.getText().toUpperCase().equals("Tonu")||txtCodigo.getText().toUpperCase().equals("tonu")||txtCodigo.getText().toUpperCase().equals("cancelacion")||txtCodigo.getText().toUpperCase().equals("Cancelacion")||txtCodigo.getText().toUpperCase().equals("CANCELACION")||txtCodigo.getText().toUpperCase().equals("RETIRO")||txtCodigo.getText().toUpperCase().equals("Retiro")||txtCodigo.getText().toUpperCase().equals("retiro")){
            JOptionPane.showMessageDialog(null, "El código de autorizacion no es valido.","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }else{
            formatofecha1();            
        } 
    }
    
    public void formatofecha1() throws IOException, ParseException, SQLException{
        fmt="0000-00-00"; 
        if(fmt.length() == txtFecha.getText().length()){            
            StringTokenizer tokens = new StringTokenizer (txtFecha.getText(),"-");
            System.out.println(""+tokens.countTokens());
            if(tokens.countTokens() ==3){
            String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtFecha.getText());
            mach.find();
            bol1();        
            }else{
               JOptionPane.showMessageDialog(null,"Error en Formato de Fecha AAAA-MM-DD","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
            }
        }else {
            JOptionPane.showMessageDialog(null,"Error en Formato de Fecha AAAA-MM-DD","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }      
    }
    
    String VALOR_CLI_RUBRO1;
    public void bol() throws IOException, ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_RECP_DOCTOS where cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){   
                    VALOR_CLI_RUBRO1=rs1.getString("VALOR_CLI_RUBRO1");
                    Duplicidadbol();
                }else {
                    //CreaRegistra();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void bol1() throws IOException, ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_RECP_DOCTOS where cartaportex3='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){   
                    VALOR_CLI_RUBRO1=rs1.getString("VALOR_CLI_RUBRO1");
                    Duplicidadbol1();
                }else {
                    //CreaRegistra();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void Duplicidadbol() throws IOException, ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_RECP_DOCTOS where VALOR_CLI_RUBRO1='"+VALOR_CLI_RUBRO1+"' and evidenciaRD='"+txtEvidencia.getText()+"'");
            if(rs1.next() == true){ 
                if (txtEvidencia.getText().toUpperCase().equals("TONU")||txtEvidencia.getText().toUpperCase().equals("Tonu")||txtEvidencia.getText().toUpperCase().equals("tonu")
                    ||txtEvidencia.getText().toUpperCase().equals("cancelacion")||txtEvidencia.getText().toUpperCase().equals("Cancelacion")||txtEvidencia.getText().toUpperCase().equals("CANCELACION")
                    ||txtEvidencia.getText().toUpperCase().equals("RETIRO")||txtEvidencia.getText().toUpperCase().equals("Retiro")||txtEvidencia.getText().toUpperCase().equals("retiro")
                    ||txtEvidencia.getText().toUpperCase().equals("VACIO")||txtEvidencia.getText().toUpperCase().equals("Vacio")||txtEvidencia.getText().toUpperCase().equals("vacio")    ){
                    CreaRegistra();
                }else{
                    JOptionPane.showMessageDialog(null, "La evidencia ingresado ya se ha registrado con la misma CPO "+rs1.getString("valor_cli_rubro1"),"Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                }                    
            }else {
                CreaRegistra();
            }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void Duplicidadbol1() throws IOException, ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from VTBL_RECP_DOCTOS where VALOR_CLI_RUBRO1='"+VALOR_CLI_RUBRO1+"' and evidenciaRD='"+txtCodigo.getText()+"'");
                if(rs1.next() == true){ 
                    JOptionPane.showMessageDialog(null, "La evidencia ya se ha registrado en la misma CPO: "+ rs1.getString("valor_cli_rubro1"),"Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);                   
                }else {
                    CreaRegistra1();
                }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
        } 
    }    
    
    public void CreaRegistra() throws IOException, ParseException, SQLException{
        int i =JOptionPane.showConfirmDialog(this, "Confirma los datos en la cartaporte : "+"\n"+" '"+txtCartax3.getText()+"' ? ",
                "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(i == 0){
            RegistroX3();
        }else if(i == 1){
            JOptionPane.showMessageDialog(null, "Revise la información","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void CreaRegistra1() throws IOException, ParseException, SQLException{
        int i =JOptionPane.showConfirmDialog(this, "Confirma los datos en la cartaporte : "+"\n"+" '"+txtCartax3.getText()+"' ? ",
                "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(i == 0){
            RegistroX31();
        }else if(i == 1){
            JOptionPane.showMessageDialog(null, "Revise la información","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void RegistroX3() throws SQLException, ParseException{  
        String vtotal=txtTotalGasto.getText();
        double n4=Double.parseDouble(vtotal);
        
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha2 = txtFecha.getText()+" "+"00:00:00.000";//fecha de evidencia
        String strFecha = fchx3;   //fecha del sistema     
            Date fechaj = null;
            Date fechai = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha2);
                fechai = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set FchERD=?,FchRD=?,EvidenciaRD='"+txtEvidencia.getText().toUpperCase().trim()+"',UsuarioRD='"+txtUserf1.getText().toUpperCase().trim()+"',aplicacion='REGISTRADO',recibo_valores='"+txtRV.getText()+"',total_gastos='"+n4+"',des_gastos='"+valor+"',COD ='1' where cartaportex3='"+txtCartax3.getText()+"'");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechai.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.setTimestamp(2,timestamp1);
                    stp.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Datos Registrados Actualizados","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);    
                    ActionEvent evt = null;
                    exitForm(evt); 
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
                }
            } 
    }
    
    public void RegistroX31() throws SQLException, ParseException{  
        String vtotal=txtTotalGasto.getText();
        double n4=Double.parseDouble(vtotal);
        
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha2 = txtFecha.getText()+" "+"00:00:00.000";//fecha de evidencia
        String strFecha = fchx3;   //fecha del sistema     
            Date fechaj = null;
            Date fechai = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha2);
                fechai = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set FchERD=?,FchRD=?,EvidenciaRD='"+txtCodigo.getText().toUpperCase().trim()+"',UsuarioRD='"+txtUserf1.getText().toUpperCase().trim()+"',aplicacion='REGISTRADO',recibo_valores='"+txtRV.getText()+"',total_gastos='"+n4+"',des_gastos='"+valor+"',COD ='2' where cartaportex3='"+txtCartax3.getText()+"'");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechai.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.setTimestamp(2,timestamp1);
                    stp.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Datos Registrados Actualizados","Mensaje informativo", JOptionPane.INFORMATION_MESSAGE);
                    ActionEvent evt = null;
                    exitForm(evt); 
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error intente nuevamente","Mensaje de error", JOptionPane.ERROR_MESSAGE);
                }
            }              
    }
    
    public void ClearForm(){
        txtCreado.setText("");
        txtFecha.setText("");
        txtEvidencia.setText("");
        txtCodigo.setText("");
    }
    
    String fchx3;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        txtCreado.setText(datefecha.format(date));
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchx3=datefecha1.format(date);  
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtCartax3;
    private javax.swing.JTextField txtCaseta;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCreado;
    private javax.swing.JTextField txtDiesel;
    private javax.swing.JTextField txtEvidencia;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtOtro;
    private javax.swing.JTextField txtPension;
    private javax.swing.JTextField txtRV;
    public javax.swing.JTextField txtRuta;
    private javax.swing.JTextField txtTalachas;
    private javax.swing.JTextField txtTotalGasto;
    public javax.swing.JTextField txtUserf1;
    private javax.swing.JTextField txtaduana;
    private javax.swing.JTextField txtanticipo;
    private javax.swing.JTextField txteqs;
    private javax.swing.JTextField txtgarificacio;
    private javax.swing.JTextField txthotel;
    private javax.swing.JTextField txtinfracciones;
    private javax.swing.JTextField txtlubricante;
    private javax.swing.JTextField txtmaniobra;
    private javax.swing.JTextField txtreparacion;
    // End of variables declaration//GEN-END:variables
}