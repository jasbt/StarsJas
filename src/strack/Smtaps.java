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
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Smtaps extends javax.swing.JFrame {
    public Smtaps() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbnCrear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtTransporte = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCartax3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTerminal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtFCarta = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCPO = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTracto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtRem1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtmsj1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtFchAP = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtHrAP = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtZh = new javax.swing.JTextField();
        txtevento = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Código = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtOrigen1 = new javax.swing.JTextField();
        txtDestino1 = new javax.swing.JTextField();
        txtTcarga2 = new javax.swing.JTextField();
        txtPeso2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtRemitente = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtCDrem = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtdesinatario = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtcddestino = new javax.swing.JTextField();
        tbnCrear1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();
        tbnCrear2 = new javax.swing.JButton();

        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        tbnCrear.setText("Crear");
        tbnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrearActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancelar Servicio");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Orden de Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel6.setText("Transporte:");

        txtTransporte.setEditable(false);
        txtTransporte.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTransporte.setBorder(null);

        jLabel2.setText("Cartaporte:");

        txtCartax3.setEditable(false);
        txtCartax3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCartax3.setBorder(null);

        jLabel4.setText("Terminal:");

        txtTerminal.setEditable(false);
        txtTerminal.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTerminal.setBorder(null);

        jLabel7.setText("Folio:");

        txtFCarta.setEditable(false);
        txtFCarta.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtFCarta.setBorder(null);

        jLabel8.setText("CPO:");

        txtCPO.setEditable(false);
        txtCPO.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCPO.setBorder(null);

        jLabel9.setText("Unidad:");

        txtTracto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel10.setText("Remolque:");

        txtRem1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCPO)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFCarta))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTracto, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRem1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCartax3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTerminal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtFCarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCPO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTracto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtRem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Evento de Cancelar Servicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11), new java.awt.Color(0, 0, 51))); // NOI18N

        jLabel12.setText("Mensaje : ");

        txtmsj1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel15.setText("Evento:");

        jLabel16.setText("Fecha:");

        txtFchAP.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel18.setText("Hora:");

        txtHrAP.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        jLabel19.setText("Zona Hrs:");

        txtZh.setEditable(false);
        txtZh.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtZh.setBorder(null);

        txtevento.setEditable(false);
        txtevento.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtevento, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFchAP, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHrAP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmsj1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(txtZh))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(txtFchAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtHrAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtevento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtmsj1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtZh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Origen y Destino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(302, 193));

        jLabel23.setText("Código:");

        jLabel24.setText("Carga:");

        Código.setText("Código:");

        jLabel27.setText("Peso:");

        txtOrigen1.setEditable(false);
        txtOrigen1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtOrigen1.setBorder(null);

        txtDestino1.setEditable(false);
        txtDestino1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtDestino1.setBorder(null);

        txtTcarga2.setEditable(false);
        txtTcarga2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtTcarga2.setBorder(null);

        txtPeso2.setEditable(false);
        txtPeso2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtPeso2.setBorder(null);

        jLabel28.setText("Remitente:");

        txtRemitente.setEditable(false);
        txtRemitente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtRemitente.setBorder(null);

        jLabel29.setText("Cd:");

        txtCDrem.setEditable(false);
        txtCDrem.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtCDrem.setBorder(null);

        jLabel30.setText("Destinatario:");

        txtdesinatario.setEditable(false);
        txtdesinatario.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtdesinatario.setBorder(null);

        jLabel31.setText("Cd:");

        txtcddestino.setEditable(false);
        txtcddestino.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        txtcddestino.setBorder(null);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Código)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcddestino))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdesinatario))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCDrem))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTcarga2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtRemitente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtOrigen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(txtCDrem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtdesinatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Código)
                    .addComponent(txtDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txtcddestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtTcarga2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtPeso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Transacción 214 (AP Cancelación de Servicio)");

        jLabel17.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        tbnCrear2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        tbnCrear2.setText("Crear");
        tbnCrear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tbnCrear2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1)
                    .addComponent(tbnCrear2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(0, 22, Short.MAX_VALUE))
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
        if(txtCPO.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Actualice los datos.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtTracto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de unidad.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtRem1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de remolque.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtmsj1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de mensaje.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFchAP.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de fecha","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtHrAP.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de hora","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            try {
                unidad();
            } catch (SQLException ex) {
                Logger.getLogger(Smtaps.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Smtaps.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    }//GEN-LAST:event_tbnCrearActionPerformed
    
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        ClearForm();
    }//GEN-LAST:event_tbnCrear1ActionPerformed
    
    String mtd1,Stars;
    private void tbnCrear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear2ActionPerformed
        FechaSit();
        if(txtCPO.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Actualice los datos.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtTracto.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de unidad.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtRem1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de remolque.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtmsj1.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de mensaje.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtFchAP.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de fecha","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtHrAP.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Registre el campo de hora","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            try {
                unidad();
            } catch (SQLException ex) {
                Logger.getLogger(Smtapv.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(Smtapv.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_tbnCrear2ActionPerformed
      
    String fmt;
    public void formatofecha() throws ParseException{
        fmt="0000-00-00"; 
        if(fmt.length() == txtFchAP.getText().length()){            
            StringTokenizer tokens = new StringTokenizer (txtFchAP.getText(),"-");
            if(tokens.countTokens() ==3){
            String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtFchAP.getText());
            mach.find();
            amd();        
            }else{
                JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }      
        }else {
                JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }     
    }
    
    public void amd() throws ParseException{
        String anioa=fchap.substring(0,4);
        int num1 = Integer.parseInt(anioa);
        String mesa=fchap.substring(5,7);
        int num2 = Integer.parseInt(mesa);
        String diaa=fchap.substring(8,10);
        int num3 = Integer.parseInt(diaa);
        
        String anio=txtFchAP.getText().substring(0,4);
        int num4 = Integer.parseInt(anio);
        String mes=txtFchAP.getText().substring(5,7);
        int num5 = Integer.parseInt(mes);
        String dia=txtFchAP.getText().substring(8,10);
        int num6 = Integer.parseInt(dia);
        
        if(num5 > 0 && num6 > 0 && num4 <= num1 && num5 <= 12 && num6 <= 31  ){
            formatohora();
        }else{
            JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
    
    public void formatohora() throws ParseException{      
        String fh1=txtHrAP.getText();
        String hv="00:00";
        if(fh1.length() == txtHrAP.getText().length()){
            StringTokenizer tokens = new StringTokenizer (txtHrAP.getText(),":");
                if(tokens.countTokens() ==2){
                String expresion ="([0-9:0-9]+)";
                Pattern exp =Pattern.compile(expresion);
                Matcher mach = exp.matcher(txtHrAP.getText());
                mach.find();
                    String hr,mm;
                    hr=txtHrAP.getText().substring(0,2);
                    mm=txtHrAP.getText().substring(3,5);
                    int hm1,hm2;
                    hm1= Integer.parseInt(hr);
                    hm2= Integer.parseInt(mm);
                    if(hm1>=0 && hm1<24 && hm2>=0 && hm2<60){
                        CreaRegistra(); 
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
    
    public void unidad() throws SQLException, ParseException{
        String expresion ="([a-zA-Z0-9_]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtTracto.getText());
            mach.find();
        if(mach.matches()){            
            remolque();
        }else{
            JOptionPane.showMessageDialog(null,"El campo unidad no acepta caracteres especiales","Informativo",JOptionPane.INFORMATION_MESSAGE);   
        }
    }
    
    public void remolque() throws ParseException{  
        String expresion ="([0-9]+)";
            Pattern exp =Pattern.compile(expresion);
            Matcher mach = exp.matcher(txtRem1.getText());
            mach.find();
        if(mach.matches()){ 
            mensaje();
        }else{
            JOptionPane.showMessageDialog(null,"El campo remolque debe contener unicamente números","Informativo",JOptionPane.INFORMATION_MESSAGE);   
        }        
    }
    
    public void mensaje() throws ParseException{
        if (txtmsj1.getText().length() >= 30 && txtmsj1.getText().length() <= 120 ){            
            formatofecha();
        }else{
            JOptionPane.showMessageDialog(null,"El mensaje debe contener mas de 30 caracteres.","Alerta",JOptionPane.WARNING_MESSAGE);
        } 
    }
    
    public void CreaRegistra() throws ParseException{
        int i =JOptionPane.showConfirmDialog(this, "Confirma el movimiento para la carta porte: "+"\n"+" '"+txtCartax3.getText()+"' son correctos ? ",
                "Confirmación", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(i == 0){
            try {
                RegistroAP();
            } catch (SQLException ex) {
                Logger.getLogger(Smtaps.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(i == 1){
            JOptionPane.showMessageDialog(null,"Movimiento no registrado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
        }
    }
       
    public void RegistroAP() throws SQLException, ParseException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = fchap;
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
        SimpleDateFormat formatoDelTexto1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha1 = txtFchAP.getText().trim()+" 00:00:00.00";
            Date fechaK = null;
            try {
                fechaK = formatoDelTexto1.parse(strFecha1);
            } catch (ParseException ex) {
            }     

            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_X3_1 set fchap=?,fcha_ap=?,hrap='"+txtHrAP.getText()+"',reasoncodeap='AM',zhap='"+txtZh.getText()+"',msj1='"+txtmsj1.getText()+"',AP50='AP-APLICADO',ErrorAP=null,CategoriaAP=null,userAP='"+txtUserf1.getText().toUpperCase()+"',VALOR_CLI_RUBRO6='"+Stars+"',stinternoAP='0',Unidadap='"+txtTracto.getText().toUpperCase()+"',Remolqueap='"+txtRem1.getText().toUpperCase()+"' where cartaportex3='"+txtCartax3.getText()+"' ");
                    java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
                    java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechaK.getTime());
                    stp.setTimestamp(1,timestamp);
                    stp.setTimestamp(2,timestamp1);
                    stp.executeUpdate();
                    ValiPrevioAF();
                    JOptionPane.showMessageDialog(null,"Movimiento registrado!","Informativo",JOptionPane.INFORMATION_MESSAGE);                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                }
            }  
        ActionEvent evt = null;
        exitForm(evt);    
    }
    
   public void ValiPrevioAF() throws ParseException{
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_REG_AF_1 where CartaporteAF='"+txtCartax3.getText()+"'");
                if(rs1.next() == true){
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_REG_AF_1 set ArchivoAF='AP-50' where cartaporteAF='"+txtCartax3.getText()+"' ");
                    stp.executeUpdate();
                    panelx1();
                }else {
                    panelx1();
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }
       
    public void panelx1() throws SQLException, ParseException{     
        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
            try {        
                PreparedStatement stp=miConexion.prepareStatement("update tbl_asig_gst set cap='1' where cartaporte='"+txtCartax3.getText()+"'");
                stp.executeUpdate();        
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void ClearForm(){
        txtmsj1.setText("");
        txtFchAP.setText("");
        txtHrAP.setText("");
    }
    
    String fchap;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        fchap=datefecha1.format(date);  
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Código;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    private javax.swing.JButton tbnCrear2;
    public javax.swing.JTextField txtCDrem;
    public javax.swing.JTextField txtCPO;
    public javax.swing.JTextField txtCartax3;
    public javax.swing.JTextField txtDestino1;
    public javax.swing.JTextField txtFCarta;
    public javax.swing.JTextField txtFchAP;
    public javax.swing.JTextField txtHrAP;
    public javax.swing.JTextField txtOrigen1;
    public javax.swing.JTextField txtPeso2;
    public javax.swing.JTextField txtRem1;
    public javax.swing.JTextField txtRemitente;
    public javax.swing.JTextField txtTcarga2;
    public javax.swing.JTextField txtTerminal;
    public javax.swing.JTextField txtTracto;
    public javax.swing.JTextField txtTransporte;
    public javax.swing.JTextField txtUserf1;
    public javax.swing.JTextField txtZh;
    public javax.swing.JTextField txtcddestino;
    public javax.swing.JTextField txtdesinatario;
    public javax.swing.JTextField txtevento;
    private javax.swing.JTextField txtmsj1;
    // End of variables declaration//GEN-END:variables
}