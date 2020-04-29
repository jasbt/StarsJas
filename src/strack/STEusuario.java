package strack;

import Clases.ConexionEDI;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class STEusuario extends javax.swing.JFrame {

    public STEusuario() {
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
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRol = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jst2 = new javax.swing.JCheckBox();
        jst10 = new javax.swing.JCheckBox();
        jst11 = new javax.swing.JCheckBox();
        jst12 = new javax.swing.JCheckBox();
        jst3 = new javax.swing.JCheckBox();
        jst4 = new javax.swing.JCheckBox();
        jst5 = new javax.swing.JCheckBox();
        jst6 = new javax.swing.JCheckBox();
        jst13 = new javax.swing.JCheckBox();
        jst1 = new javax.swing.JCheckBox();
        jst7 = new javax.swing.JCheckBox();
        jst8 = new javax.swing.JCheckBox();
        jst9 = new javax.swing.JCheckBox();
        jst14 = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jst15 = new javax.swing.JCheckBox();
        jst16 = new javax.swing.JCheckBox();
        jst17 = new javax.swing.JCheckBox();
        jst18 = new javax.swing.JCheckBox();
        jst19 = new javax.swing.JCheckBox();
        jst20 = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jst29 = new javax.swing.JCheckBox();
        jst32 = new javax.swing.JCheckBox();
        jst33 = new javax.swing.JCheckBox();
        jst34 = new javax.swing.JCheckBox();
        jst35 = new javax.swing.JCheckBox();
        jst31 = new javax.swing.JCheckBox();
        jst36 = new javax.swing.JCheckBox();
        jst37 = new javax.swing.JCheckBox();
        jst30 = new javax.swing.JCheckBox();
        jst72 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jst46 = new javax.swing.JCheckBox();
        jst48 = new javax.swing.JCheckBox();
        jst49 = new javax.swing.JCheckBox();
        jst51 = new javax.swing.JCheckBox();
        jst50 = new javax.swing.JCheckBox();
        jst47 = new javax.swing.JCheckBox();
        jst52 = new javax.swing.JCheckBox();
        jst53 = new javax.swing.JCheckBox();
        jst45 = new javax.swing.JCheckBox();
        jPanel7 = new javax.swing.JPanel();
        jst60 = new javax.swing.JCheckBox();
        jst61 = new javax.swing.JCheckBox();
        jst62 = new javax.swing.JCheckBox();
        jst63 = new javax.swing.JCheckBox();
        jst64 = new javax.swing.JCheckBox();
        jst65 = new javax.swing.JCheckBox();
        jst66 = new javax.swing.JCheckBox();
        jst67 = new javax.swing.JCheckBox();
        jst68 = new javax.swing.JCheckBox();
        jPanel10 = new javax.swing.JPanel();
        jst38 = new javax.swing.JCheckBox();
        jst40 = new javax.swing.JCheckBox();
        jst41 = new javax.swing.JCheckBox();
        jst42 = new javax.swing.JCheckBox();
        jst43 = new javax.swing.JCheckBox();
        jst39 = new javax.swing.JCheckBox();
        jst44 = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jst54 = new javax.swing.JCheckBox();
        jst55 = new javax.swing.JCheckBox();
        jst56 = new javax.swing.JCheckBox();
        jst57 = new javax.swing.JCheckBox();
        jst58 = new javax.swing.JCheckBox();
        jst59 = new javax.swing.JCheckBox();
        jPanel9 = new javax.swing.JPanel();
        jst21 = new javax.swing.JCheckBox();
        jst22 = new javax.swing.JCheckBox();
        jst23 = new javax.swing.JCheckBox();
        jst24 = new javax.swing.JCheckBox();
        jst25 = new javax.swing.JCheckBox();
        jst26 = new javax.swing.JCheckBox();
        jst27 = new javax.swing.JCheckBox();
        jst28 = new javax.swing.JCheckBox();
        jstconfiguracion = new javax.swing.JCheckBox();
        jcbTerminal = new javax.swing.JCheckBox();
        txtNuser = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jst69 = new javax.swing.JCheckBox();
        jst70 = new javax.swing.JCheckBox();
        jst71 = new javax.swing.JCheckBox();
        jst73 = new javax.swing.JCheckBox();
        jst74 = new javax.swing.JCheckBox();
        jst76 = new javax.swing.JCheckBox();
        jst77 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        cbcomplemento = new javax.swing.JCheckBox();
        tbnCrear1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCreado = new javax.swing.JTextField();

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial Rounded MT Bold", 1, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        jLabel6.setText("Usuario:");

        jLabel2.setText("Nombre completo:");

        jLabel4.setText("Contraseña:");

        jLabel7.setText("Rol:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Modulos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Stars", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 153))); // NOI18N

        jst2.setText("Mov.x3");
        jst2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst2ActionPerformed(evt);
            }
        });

        jst10.setText("Crear");
        jst10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst10ActionPerformed(evt);
            }
        });

        jst11.setText("Editar");
        jst11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst11ActionPerformed(evt);
            }
        });

        jst12.setText("Cancelar");
        jst12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst12ActionPerformed(evt);
            }
        });

        jst3.setText("Mov.AF");
        jst3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst3ActionPerformed(evt);
            }
        });

        jst4.setText("Mov.x1");
        jst4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst4ActionPerformed(evt);
            }
        });

        jst5.setText("Mov.AP");
        jst5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst5ActionPerformed(evt);
            }
        });

        jst6.setText("Mov.AG");
        jst6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst6ActionPerformed(evt);
            }
        });

        jst13.setText("Consultar");
        jst13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst13ActionPerformed(evt);
            }
        });

        jst1.setText("Stars");
        jst1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst1ActionPerformed(evt);
            }
        });

        jst7.setText("Mov.AP(Servicio)");
        jst7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst7ActionPerformed(evt);
            }
        });

        jst8.setText("Papelera");
        jst8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst8ActionPerformed(evt);
            }
        });

        jst9.setText("Panel mov.");
        jst9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst9ActionPerformed(evt);
            }
        });

        jst14.setText("exportar");
        jst14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst10)
                            .addComponent(jst11)
                            .addComponent(jst12)
                            .addComponent(jst13)
                            .addComponent(jst14)))
                    .addComponent(jst9)
                    .addComponent(jst2)
                    .addComponent(jst1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jst3)
                                .addComponent(jst4)
                                .addComponent(jst5)
                                .addComponent(jst6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jst7, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jst8))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jst1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RecepDoctos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(204, 0, 0));

        jst15.setText("RecpDoctos");
        jst15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst15ActionPerformed(evt);
            }
        });

        jst16.setText("Crear");
        jst16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst16ActionPerformed(evt);
            }
        });

        jst17.setText("Editar");
        jst17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst17ActionPerformed(evt);
            }
        });

        jst18.setText("Cancelar");
        jst18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst18ActionPerformed(evt);
            }
        });

        jst19.setText("Consultar");
        jst19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst19ActionPerformed(evt);
            }
        });

        jst20.setText("exportar");
        jst20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst16)
                            .addComponent(jst17)
                            .addComponent(jst18)
                            .addComponent(jst19)
                            .addComponent(jst20)))
                    .addComponent(jst15))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jst15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst20))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cobranza", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 153));

        jst29.setText("Validador 810");
        jst29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst29ActionPerformed(evt);
            }
        });

        jst32.setText("Crear");
        jst32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst32ActionPerformed(evt);
            }
        });

        jst33.setText("Editar");
        jst33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst33ActionPerformed(evt);
            }
        });

        jst34.setText("Cancelar");
        jst34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst34ActionPerformed(evt);
            }
        });

        jst35.setText("Consultar");
        jst35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst35ActionPerformed(evt);
            }
        });

        jst31.setText("Edi 210");
        jst31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst31ActionPerformed(evt);
            }
        });

        jst36.setText("exportar");
        jst36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst36ActionPerformed(evt);
            }
        });

        jst37.setText("Re-crear");
        jst37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst37ActionPerformed(evt);
            }
        });

        jst30.setText("Descargar");
        jst30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst30ActionPerformed(evt);
            }
        });

        jst72.setText("Stars(210)");
        jst72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst72ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jst29)
                    .addComponent(jst31)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst30)
                            .addComponent(jst32)
                            .addComponent(jst33)
                            .addComponent(jst34)
                            .addComponent(jst35)
                            .addComponent(jst36)
                            .addComponent(jst37)
                            .addComponent(jst72))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jst29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst72))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ctrl.Visitantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(0, 0, 153));

        jst46.setText("Control de Vistas");
        jst46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst46ActionPerformed(evt);
            }
        });

        jst48.setText("Crear");
        jst48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst48ActionPerformed(evt);
            }
        });

        jst49.setText("Editar");
        jst49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst49ActionPerformed(evt);
            }
        });

        jst51.setText("Cerrar");
        jst51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst51ActionPerformed(evt);
            }
        });

        jst50.setText("Cancelar");
        jst50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst50ActionPerformed(evt);
            }
        });

        jst47.setText("Control de Eq.");
        jst47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst47ActionPerformed(evt);
            }
        });

        jst52.setText("Consultar");
        jst52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst52ActionPerformed(evt);
            }
        });

        jst53.setText("exportar");
        jst53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst53ActionPerformed(evt);
            }
        });

        jst45.setText("Visitas");
        jst45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst45ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jst45)
                    .addComponent(jst46)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst48)
                            .addComponent(jst53)
                            .addComponent(jst51)
                            .addComponent(jst49)
                            .addComponent(jst52)
                            .addComponent(jst50))
                        .addComponent(jst47)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jst45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst49)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ctrl.Expedientes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(0, 0, 153));

        jst60.setText("Control de Exped.");
        jst60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst60ActionPerformed(evt);
            }
        });

        jst61.setText("Crear");
        jst61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst61ActionPerformed(evt);
            }
        });

        jst62.setText("Editar");
        jst62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst62ActionPerformed(evt);
            }
        });

        jst63.setText("Permiso");
        jst63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst63ActionPerformed(evt);
            }
        });

        jst64.setText("Baja");
        jst64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst64ActionPerformed(evt);
            }
        });

        jst65.setText("Consultar");
        jst65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst65ActionPerformed(evt);
            }
        });

        jst66.setText("exportar");
        jst66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst66ActionPerformed(evt);
            }
        });

        jst67.setText("Antidoping");
        jst67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst67ActionPerformed(evt);
            }
        });

        jst68.setText("Historico ");
        jst68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst68ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jst60)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst61)
                            .addComponent(jst62)
                            .addComponent(jst64)
                            .addComponent(jst65)
                            .addComponent(jst63)
                            .addComponent(jst66)
                            .addComponent(jst67)
                            .addComponent(jst68))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jst60)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst61)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst62)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst67)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst68)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Catalogos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(0, 0, 153));

        jst38.setText("CPO'S");
        jst38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst38ActionPerformed(evt);
            }
        });

        jst40.setText("Crear");
        jst40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst40ActionPerformed(evt);
            }
        });

        jst41.setText("Editar");
        jst41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst41ActionPerformed(evt);
            }
        });

        jst42.setText("Cancelar");
        jst42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst42ActionPerformed(evt);
            }
        });

        jst43.setText("Consultar");
        jst43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst43ActionPerformed(evt);
            }
        });

        jst39.setText("Code Edi");
        jst39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst39ActionPerformed(evt);
            }
        });

        jst44.setText("exportar");
        jst44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst44ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst38)
                            .addComponent(jst39))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst40)
                            .addComponent(jst41)
                            .addComponent(jst42)
                            .addComponent(jst43)
                            .addComponent(jst44))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jst38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst44))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rev.Aplicaciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 153))); // NOI18N
        jPanel8.setForeground(new java.awt.Color(0, 0, 153));

        jst54.setText("Rev.Aplicaciones");
        jst54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst54ActionPerformed(evt);
            }
        });

        jst55.setText("Crear");
        jst55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst55ActionPerformed(evt);
            }
        });

        jst56.setText("Editar");
        jst56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst56ActionPerformed(evt);
            }
        });

        jst57.setText("Cancelar");
        jst57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst57ActionPerformed(evt);
            }
        });

        jst58.setText("Consultar");
        jst58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst58ActionPerformed(evt);
            }
        });

        jst59.setText("exportar");
        jst59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst59ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jst54)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst55)
                            .addComponent(jst56)
                            .addComponent(jst57)
                            .addComponent(jst58)
                            .addComponent(jst59))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jst54)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst57)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst59)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administración", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(153, 0, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(0, 0, 153));

        jst21.setText("Actualizacion EDI");
        jst21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst21ActionPerformed(evt);
            }
        });

        jst22.setText("Usuarios");
        jst22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst22ActionPerformed(evt);
            }
        });

        jst23.setText("Crear");
        jst23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst23ActionPerformed(evt);
            }
        });

        jst24.setText("Editar");
        jst24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst24ActionPerformed(evt);
            }
        });

        jst25.setText("Cancelar");
        jst25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst25ActionPerformed(evt);
            }
        });

        jst26.setText("Activar");
        jst26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst26ActionPerformed(evt);
            }
        });

        jst27.setText("Consultar");
        jst27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst27ActionPerformed(evt);
            }
        });

        jst28.setText("exportar");
        jst28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst28ActionPerformed(evt);
            }
        });

        jstconfiguracion.setText("Configuracion");
        jstconfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jstconfiguracionActionPerformed(evt);
            }
        });

        jcbTerminal.setText("Terminal");
        jcbTerminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTerminalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst21)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jst23)
                                    .addComponent(jst24)
                                    .addComponent(jst25)
                                    .addComponent(jst26)
                                    .addComponent(jst27)
                                    .addComponent(jst28)))
                            .addComponent(jst22)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jcbTerminal)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jstconfiguracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jst21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbTerminal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jstconfiguracion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtNuser.setEditable(false);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Incidencias TI", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jPanel11.setForeground(new java.awt.Color(0, 0, 153));

        jst69.setText("Incidencias");
        jst69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst69ActionPerformed(evt);
            }
        });

        jst70.setText("Agregar");
        jst70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst70ActionPerformed(evt);
            }
        });

        jst71.setText("Cerrar");
        jst71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst71ActionPerformed(evt);
            }
        });

        jst73.setText("Cancelar");
        jst73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst73ActionPerformed(evt);
            }
        });

        jst74.setText("Consultar");
        jst74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst74ActionPerformed(evt);
            }
        });

        jst76.setText("exportar");
        jst76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst76ActionPerformed(evt);
            }
        });

        jst77.setForeground(new java.awt.Color(204, 0, 0));
        jst77.setText("Inventarios SST");
        jst77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jst77ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jst69)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jst76)
                            .addComponent(jst70)
                            .addComponent(jst71)
                            .addComponent(jst73)
                            .addComponent(jst74))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jst77)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jst69)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst70)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst71)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst76)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jst77)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contabilidad", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        cbcomplemento.setText("Complementos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbcomplemento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cbcomplemento)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNuser, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtNuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        tbnCrear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        tbnCrear1.setText("Limpiar");
        tbnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCrear1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ediicion de usuario");

        jLabel17.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        jLabel8.setText("Fecha:");

        txtCreado.setEditable(false);
        txtCreado.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(736, 736, 736)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCreado))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(tbnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCreado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(txtUserf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13,st14,st15,st16,st17,st18,st19,st20,st21,st22,st23,st24,st25,st26,st27,st28,st29,st30,st31,st32,
    st33,st34,st35,st36,st37,st38,st39,st40,st41,st42,st43,st44,st45,st46,st47,st48,st49,st50,st51,st52,st53,st54,st55,st56,st57,st58,st59,st60,st61,st62,st63,st64,
    st65,st66,st67,st68,st72,st79;
   
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        exitForm(evt);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        if(txtNuser.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre de usuario");
            return;
        }if(txtCodigo.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese una contraseña");
            return;
        }if(txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre del usuario");
            return;
        }if(txtRol.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Ingrese un rol");
            return;
        }else{ 
            FechaSit();
            ValidarPermisos();            
        } 
    }//GEN-LAST:event_tbnCrearActionPerformed
    
    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        ClearForm();
    }//GEN-LAST:event_tbnCrear1ActionPerformed

    private void jst2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst2ActionPerformed
        if(!jst2.isSelected()){
            System.out.println("No activo");
            st2="0";
        }else{
            System.out.println("activo");
            st2="1";
        }
    }//GEN-LAST:event_jst2ActionPerformed

    private void jst10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst10ActionPerformed
        if(!jst10.isSelected()){
            System.out.println("No activo");
            st10="0";
        }else{
            System.out.println("activo");
            st10="1";
        }
    }//GEN-LAST:event_jst10ActionPerformed

    private void jst11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst11ActionPerformed
        if(!jst11.isSelected()){
            System.out.println("No activo");
            st11="0";
        }else{
            System.out.println("activo");
            st11="1";
        }
    }//GEN-LAST:event_jst11ActionPerformed

    private void jst12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst12ActionPerformed
        if(!jst12.isSelected()){
            System.out.println("No activo");
            st12="0";
        }else{
            System.out.println("activo");
            st12="1";
        }
    }//GEN-LAST:event_jst12ActionPerformed

    private void jst3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst3ActionPerformed
        if(!jst3.isSelected()){
            System.out.println("No activo");
            st3="0";
        }else{
            System.out.println("activo");
            st3="1";
        }
    }//GEN-LAST:event_jst3ActionPerformed

    private void jst4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst4ActionPerformed
        if(!jst4.isSelected()){
            System.out.println("No activo");
            st4="0";
        }else{
            System.out.println("activo");
            st4="1";
        }
    }//GEN-LAST:event_jst4ActionPerformed

    private void jst5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst5ActionPerformed
        if(!jst5.isSelected()){
            System.out.println("No activo");
            st5="0";
        }else{
            System.out.println("activo");
            st5="1";
        }
    }//GEN-LAST:event_jst5ActionPerformed

    private void jst6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst6ActionPerformed
        if(!jst6.isSelected()){
            System.out.println("No activo");
            st6="0";
        }else{
            System.out.println("activo");
            st6="1";
        }
    }//GEN-LAST:event_jst6ActionPerformed

    private void jst13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst13ActionPerformed
        if(!jst13.isSelected()){
            System.out.println("No activo");
            st13="0";
        }else{
            System.out.println("activo");
            st13="1";
        }
    }//GEN-LAST:event_jst13ActionPerformed

    private void jst1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst1ActionPerformed
        if(!jst1.isSelected()){
            System.out.println("No activo");
            st1="0";
        }else{
            System.out.println("activo");
            st1="1";
        }
    }//GEN-LAST:event_jst1ActionPerformed

    private void jst7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst7ActionPerformed
        if(!jst7.isSelected()){
            System.out.println("No activo");
            st7="0";
        }else{
            System.out.println("activo");
            st7="1";
        }
    }//GEN-LAST:event_jst7ActionPerformed

    private void jst8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst8ActionPerformed
        if(!jst8.isSelected()){
            System.out.println("No activo");
            st8="0";
        }else{
            System.out.println("activo");
            st8="1";
        }
    }//GEN-LAST:event_jst8ActionPerformed

    private void jst9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst9ActionPerformed
        if(!jst9.isSelected()){
            System.out.println("No activo");
            st9="0";
        }else{
            System.out.println("activo");
            st9="1";
        }
    }//GEN-LAST:event_jst9ActionPerformed

    private void jst14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst14ActionPerformed
        if(!jst14.isSelected()){
            System.out.println("No activo");
            st14="0";
        }else{
            System.out.println("activo");
            st14="1";
        }
    }//GEN-LAST:event_jst14ActionPerformed

    private void jst15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst15ActionPerformed
        if(!jst15.isSelected()){
            System.out.println("No activo");
            st15="0";
        }else{
            System.out.println("activo");
            st15="1";
        }
    }//GEN-LAST:event_jst15ActionPerformed

    private void jst16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst16ActionPerformed
        if(!jst16.isSelected()){
            System.out.println("No activo");
            st16="0";
        }else{
            System.out.println("activo");
            st16="1";
        }
    }//GEN-LAST:event_jst16ActionPerformed

    private void jst17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst17ActionPerformed
        if(!jst17.isSelected()){
            System.out.println("No activo");
            st17="0";
        }else{
            System.out.println("activo");
            st17="1";
        }
    }//GEN-LAST:event_jst17ActionPerformed

    private void jst18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst18ActionPerformed
        if(!jst18.isSelected()){
            System.out.println("No activo");
            st18="0";
        }else{
            System.out.println("activo");
            st18="1";
        }
    }//GEN-LAST:event_jst18ActionPerformed

    private void jst19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst19ActionPerformed
        if(!jst19.isSelected()){
            System.out.println("No activo");
            st19="0";
        }else{
            System.out.println("activo");
            st19="1";
        }
    }//GEN-LAST:event_jst19ActionPerformed

    private void jst20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst20ActionPerformed
        if(!jst20.isSelected()){
            System.out.println("No activo");
            st20="0";
        }else{
            System.out.println("activo");
            st20="1";
        }
    }//GEN-LAST:event_jst20ActionPerformed

    private void jst29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst29ActionPerformed
        if(!jst29.isSelected()){
            System.out.println("No activo");
            st29="0";
        }else{
            System.out.println("activo");
            st29="1";
        }
    }//GEN-LAST:event_jst29ActionPerformed

    private void jst32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst32ActionPerformed
        if(!jst32.isSelected()){
            System.out.println("No activo");
            st32="0";
        }else{
            System.out.println("activo");
            st32="1";
        }
    }//GEN-LAST:event_jst32ActionPerformed

    private void jst33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst33ActionPerformed
        if(!jst33.isSelected()){
            System.out.println("No activo");
            st33="0";
        }else{
            System.out.println("activo");
            st33="1";
        }
    }//GEN-LAST:event_jst33ActionPerformed

    private void jst34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst34ActionPerformed
        if(!jst34.isSelected()){
            System.out.println("No activo");
            st34="0";
        }else{
            System.out.println("activo");
            st34="1";
        }
    }//GEN-LAST:event_jst34ActionPerformed

    private void jst35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst35ActionPerformed
        if(!jst35.isSelected()){
            System.out.println("No activo");
            st35="0";
        }else{
            System.out.println("activo");
            st35="1";
        }
    }//GEN-LAST:event_jst35ActionPerformed

    private void jst31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst31ActionPerformed
        if(!jst31.isSelected()){
            System.out.println("No activo");
            st31="0";
        }else{
            System.out.println("activo");
            st31="1";
        }
    }//GEN-LAST:event_jst31ActionPerformed

    private void jst36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst36ActionPerformed
        if(!jst36.isSelected()){
            System.out.println("No activo");
            st36="0";
        }else{
            System.out.println("activo");
            st36="1";
        }
    }//GEN-LAST:event_jst36ActionPerformed

    private void jst37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst37ActionPerformed
        if(!jst37.isSelected()){
            System.out.println("No activo");
            st37="0";
        }else{
            System.out.println("activo");
            st37="1";
        }
    }//GEN-LAST:event_jst37ActionPerformed

    private void jst30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst30ActionPerformed
        if(!jst30.isSelected()){
            System.out.println("No activo");
            st30="0";
        }else{
            System.out.println("activo");
            st30="1";
        }
    }//GEN-LAST:event_jst30ActionPerformed

    private void jst46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst46ActionPerformed
        if(!jst46.isSelected()){
            System.out.println("No activo");
            st46="0";
        }else{
            System.out.println("activo");
            st46="1";
        }
    }//GEN-LAST:event_jst46ActionPerformed

    private void jst48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst48ActionPerformed
        if(!jst48.isSelected()){
            System.out.println("No activo");
            st48="0";
        }else{
            System.out.println("activo");
            st48="1";
        }
    }//GEN-LAST:event_jst48ActionPerformed

    private void jst49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst49ActionPerformed
        if(!jst49.isSelected()){
            System.out.println("No activo");
            st49="0";
        }else{
            System.out.println("activo");
            st49="1";
        }
    }//GEN-LAST:event_jst49ActionPerformed

    private void jst51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst51ActionPerformed
        if(!jst51.isSelected()){
            System.out.println("No activo");
            st51="0";
        }else{
            System.out.println("activo");
            st51="1";
        }
    }//GEN-LAST:event_jst51ActionPerformed

    private void jst50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst50ActionPerformed
        if(!jst50.isSelected()){
            System.out.println("No activo");
            st50="0";
        }else{
            System.out.println("activo");
            st50="1";
        }
    }//GEN-LAST:event_jst50ActionPerformed

    private void jst47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst47ActionPerformed
        if(!jst47.isSelected()){
            System.out.println("No activo");
            st47="0";
        }else{
            System.out.println("activo");
            st47="1";
        }
    }//GEN-LAST:event_jst47ActionPerformed

    private void jst52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst52ActionPerformed
        if(!jst52.isSelected()){
            System.out.println("No activo");
            st52="0";
        }else{
            System.out.println("activo");
            st52="1";
        }
    }//GEN-LAST:event_jst52ActionPerformed

    private void jst53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst53ActionPerformed
        if(!jst53.isSelected()){
            System.out.println("No activo");
            st53="0";
        }else{
            System.out.println("activo");
            st53="1";
        }
    }//GEN-LAST:event_jst53ActionPerformed

    private void jst45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst45ActionPerformed
        if(!jst45.isSelected()){
            System.out.println("No activo");
            st45="0";
        }else{
            System.out.println("activo");
            st45="1";
        }
    }//GEN-LAST:event_jst45ActionPerformed

    private void jst38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst38ActionPerformed
        if(!jst38.isSelected()){
            System.out.println("No activo");
            st38="0";
        }else{
            System.out.println("activo");
            st38="1";
        }
    }//GEN-LAST:event_jst38ActionPerformed

    private void jst40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst40ActionPerformed
        if(!jst40.isSelected()){
            System.out.println("No activo");
            st40="0";
        }else{
            System.out.println("activo");
            st40="1";
        }
    }//GEN-LAST:event_jst40ActionPerformed

    private void jst41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst41ActionPerformed
        if(!jst41.isSelected()){
            System.out.println("No activo");
            st41="0";
        }else{
            System.out.println("activo");
            st41="1";
        }
    }//GEN-LAST:event_jst41ActionPerformed

    private void jst42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst42ActionPerformed
        if(!jst42.isSelected()){
            System.out.println("No activo");
            st42="0";
        }else{
            System.out.println("activo");
            st42="1";
        }
    }//GEN-LAST:event_jst42ActionPerformed

    private void jst43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst43ActionPerformed
        if(!jst43.isSelected()){
            System.out.println("No activo");
            st43="0";
        }else{
            System.out.println("activo");
            st43="1";
        }
    }//GEN-LAST:event_jst43ActionPerformed

    private void jst39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst39ActionPerformed
        if(!jst39.isSelected()){
            System.out.println("No activo");
            st39="0";
        }else{
            System.out.println("activo");
            st39="1";
        }
    }//GEN-LAST:event_jst39ActionPerformed

    private void jst44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst44ActionPerformed
        if(!jst44.isSelected()){
            System.out.println("No activo");
            st44="0";
        }else{
            System.out.println("activo");
            st44="1";
        }
    }//GEN-LAST:event_jst44ActionPerformed

    private void jst54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst54ActionPerformed
        if(!jst54.isSelected()){
            System.out.println("No activo");
            st54="0";
        }else{
            System.out.println("activo");
            st54="1";
        }
    }//GEN-LAST:event_jst54ActionPerformed

    private void jst55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst55ActionPerformed
        if(!jst55.isSelected()){
            System.out.println("No activo");
            st55="0";
        }else{
            System.out.println("activo");
            st55="1";
        }
    }//GEN-LAST:event_jst55ActionPerformed

    private void jst56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst56ActionPerformed
        if(!jst56.isSelected()){
            System.out.println("No activo");
            st56="0";
        }else{
            System.out.println("activo");
            st56="1";
        }
    }//GEN-LAST:event_jst56ActionPerformed

    private void jst57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst57ActionPerformed
        if(!jst57.isSelected()){
            System.out.println("No activo");
            st57="0";
        }else{
            System.out.println("activo");
            st57="1";
        }
    }//GEN-LAST:event_jst57ActionPerformed

    private void jst58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst58ActionPerformed
        if(!jst58.isSelected()){
            System.out.println("No activo");
            st58="0";
        }else{
            System.out.println("activo");
            st58="1";
        }
    }//GEN-LAST:event_jst58ActionPerformed

    private void jst59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst59ActionPerformed
        if(!jst59.isSelected()){
            System.out.println("No activo");
            st59="0";
        }else{
            System.out.println("activo");
            st59="1";
        }
    }//GEN-LAST:event_jst59ActionPerformed

    private void jst21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst21ActionPerformed
        if(!jst21.isSelected()){
            System.out.println("No activo");
            st21="0";
        }else{
            System.out.println("activo");
            st21="1";
        }
    }//GEN-LAST:event_jst21ActionPerformed

    private void jst22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst22ActionPerformed
        if(!jst22.isSelected()){
            System.out.println("No activo");
            st22="0";
        }else{
            System.out.println("activo");
            st22="1";
        }
    }//GEN-LAST:event_jst22ActionPerformed

    private void jst23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst23ActionPerformed
        if(!jst23.isSelected()){
            System.out.println("No activo");
            st23="0";
        }else{
            System.out.println("activo");
            st23="1";
        }
    }//GEN-LAST:event_jst23ActionPerformed

    private void jst24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst24ActionPerformed
        if(!jst24.isSelected()){
            System.out.println("No activo");
            st24="0";
        }else{
            System.out.println("activo");
            st24="1";
        }
    }//GEN-LAST:event_jst24ActionPerformed

    private void jst25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst25ActionPerformed
        if(!jst25.isSelected()){
            System.out.println("No activo");
            st25="0";
        }else{
            System.out.println("activo");
            st25="1";
        }
    }//GEN-LAST:event_jst25ActionPerformed

    private void jst26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst26ActionPerformed
        if(!jst26.isSelected()){
            System.out.println("No activo");
            st26="0";
        }else{
            System.out.println("activo");
            st26="1";
        }
    }//GEN-LAST:event_jst26ActionPerformed

    private void jst27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst27ActionPerformed
        if(!jst27.isSelected()){
            System.out.println("No activo");
            st27="0";
        }else{
            System.out.println("activo");
            st27="1";
        }
    }//GEN-LAST:event_jst27ActionPerformed

    private void jst28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst28ActionPerformed
        if(!jst28.isSelected()){
            System.out.println("No activo");
            st28="0";
        }else{
            System.out.println("activo");
            st28="1";
        }
    }//GEN-LAST:event_jst28ActionPerformed

    private void jst60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst60ActionPerformed
        if(!jst60.isSelected()){
            System.out.println("No activo");
            st60="0";
        }else{
            System.out.println("activo");
            st60="1";
        }
    }//GEN-LAST:event_jst60ActionPerformed

    private void jst61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst61ActionPerformed
        if(!jst61.isSelected()){
            System.out.println("No activo");
            st61="0";
        }else{
            System.out.println("activo");
            st61="1";
        }
    }//GEN-LAST:event_jst61ActionPerformed

    private void jst62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst62ActionPerformed
        if(!jst61.isSelected()){
            System.out.println("No activo");
            st62="0";
        }else{
            System.out.println("activo");
            st62="1";
        }
    }//GEN-LAST:event_jst62ActionPerformed

    private void jst63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst63ActionPerformed
        if(!jst63.isSelected()){
            System.out.println("No activo");
            st63="0";
        }else{
            System.out.println("activo");
            st63="1";
        }
    }//GEN-LAST:event_jst63ActionPerformed

    private void jst64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst64ActionPerformed
        if(!jst64.isSelected()){
            System.out.println("No activo");
            st64="0";
        }else{
            System.out.println("activo");
            st64="1";
        }
    }//GEN-LAST:event_jst64ActionPerformed

    private void jst65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst65ActionPerformed
        if(!jst65.isSelected()){
            System.out.println("No activo");
            st65="0";
        }else{
            System.out.println("activo");
            st65="1";
        }
    }//GEN-LAST:event_jst65ActionPerformed

    private void jst66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst66ActionPerformed
        if(!jst66.isSelected()){
            System.out.println("No activo");
            st66="0";
        }else{
            System.out.println("activo");
            st66="1";
        }
    }//GEN-LAST:event_jst66ActionPerformed

    private void jst67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst67ActionPerformed
        if(!jst67.isSelected()){
            System.out.println("No activo");
            st67="0";
        }else{
            System.out.println("activo");
            st67="1";
        }
    }//GEN-LAST:event_jst67ActionPerformed

    private void jst68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst68ActionPerformed
        if(!jst68.isSelected()){
            System.out.println("No activo");
            st68="0";
        }else{
            System.out.println("activo");
            st68="1";
        }
    }//GEN-LAST:event_jst68ActionPerformed

    private void jst72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst72ActionPerformed
        if(!jst72.isSelected()){
            System.out.println("No activo");
            st72="0";
        }else{
            System.out.println("activo");
            st72="1";
        }
    }//GEN-LAST:event_jst72ActionPerformed

    private void jst69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst69ActionPerformed
        if(!jst69.isSelected()){
            System.out.println("No activo");
            st69="0";
        }else{
            System.out.println("activo");
            st69="1";
        }
    }//GEN-LAST:event_jst69ActionPerformed

    private void jst70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst70ActionPerformed
        if(!jst70.isSelected()){
            System.out.println("No activo");
            st70="0";
        }else{
            System.out.println("activo");
            st70="1";
        }
    }//GEN-LAST:event_jst70ActionPerformed

    private void jst71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst71ActionPerformed
        if(!jst71.isSelected()){
            System.out.println("No activo");
            st71="0";
        }else{
            System.out.println("activo");
            st71="1";
        }
    }//GEN-LAST:event_jst71ActionPerformed

    private void jst73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst73ActionPerformed
        if(!jst73.isSelected()){
            System.out.println("No activo");
            st73="0";
        }else{
            System.out.println("activo");
            st73="1";
        }
    }//GEN-LAST:event_jst73ActionPerformed

    private void jst74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst74ActionPerformed
        if(!jst74.isSelected()){
            System.out.println("No activo");
            st74="0";
        }else{
            System.out.println("activo");
            st74="1";
        }
    }//GEN-LAST:event_jst74ActionPerformed

    private void jst76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst76ActionPerformed
        if(!jst76.isSelected()){
            System.out.println("No activo");
            st76="0";
        }else{
            System.out.println("activo");
            st76="1";
        }
    }//GEN-LAST:event_jst76ActionPerformed

    private void jst77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jst77ActionPerformed
        if(!jst77.isSelected()){
            System.out.println("No activo");
            st77="0";
        }else{
            System.out.println("activo");
            st77="1";
        }
    }//GEN-LAST:event_jst77ActionPerformed

    private void jstconfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jstconfiguracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jstconfiguracionActionPerformed

    private void jcbTerminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTerminalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTerminalActionPerformed
    
    public void RegistroUser() throws SQLException{
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFecha = txtCreado.getText();
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
            try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                try {
                    PreparedStatement stp=miConexion.prepareStatement("update TBL_Usuarios  set fchBaja=?,ctaTer='"+st79+"',rol='"+txtRol.getText().toUpperCase().trim()+"',modifico='"+txtUserf1.getText().toUpperCase()+"',contrasenia='"+txtCodigo.getText().trim()+"',Stars='"+st1+"',stx3='"+st2+"',stAF='"+st3+"',stx1='"+st4+"',stAG='"+st6+"',stAPS='"+st5+"',stAPV='"+st7+"',stPa='"+st8+"',stPn='"+st9+"',starsr='"+st10+"',starse='"+st11+"',starsc='"+st12+"',starsb='"+st13+"',starsex='"+st14+"',RDoctos='"+st15+"',rdr='"+st16+"',rde='"+st17+"',rdc='"+st18+"',rdb='"+st19+"',rdex='"+st20+"',Admin='"+st21+"',usuarios='"+st22+"',ur='"+st23+"',ue='"+st24+"',uc='"+st25+"',ua='"+st26+"',ub='"+st27+"',uex='"+st28+"',Edi810='"+st29+"',edi810des='"+st30+"',Edi210='"+st31+"',edi210r='"+st32+"',edi210e='"+st33+"',edi210c='"+st34+"',edi210b='"+st35+"',edi210ex='"+st36+"',edi210RCrea='"+st37+"',CtaCPO='"+st38+"',CtaEDI='"+st39+"',ctar='"+st40+"',ctae='"+st41+"',ctac='"+st42+"',ctab='"+st43+"',ctaex='"+st44+"',CtlAceso='"+st45+"',ctlav='"+st46+"',ctlae='"+st47+"',ctluser='"+st48+"',ctlusee='"+st49+"',ctlusec='"+st50+"',ctluses='"+st51+"',ctluseb='"+st52+"',ctluseex='"+st53+"',ctlAPL='"+st54+"',aplr='"+st55+"',aple='"+st56+"',aplc='"+st57+"',aplb='"+st58+"',aplex='"+st59+"',ctlexp='"+st60+"',expr='"+st61+"', expe='"+st62+"',expp='"+st63+"',expb='"+st64+"', expc='"+st65+"', expex='"+st66+"',expA='"+st67+"',expAH='"+st68+"',strars210='"+st72+"',RINCS ='"+st69+"',AINC ='"+st70+"', FINC ='"+st71+"', CINC ='"+st73+"', QINC ='"+st74+"', EXPINC ='"+st76+"', INVTI ='"+st77+"',conf='"+st78+"', cont='"+st80+"' where nombreu='"+txtNuser.getText()+"'");
                    stp.setDate(1, new java.sql.Date(fechaj.getTime()));
                    stp.executeUpdate();        
                    JOptionPane.showMessageDialog(null, "Actualización de usuario", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
                    ActionEvent evt = null;
                    exitForm(evt);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error intente nuevamente", "Mensaje de error", JOptionPane.ERROR_MESSAGE);
                }
            }    
    } 
       
    public void ClearForm(){
        txtNombre.setText("");
        txtCodigo.setText("");
        txtRol.setText("");
        jst1.setSelected(false);
        jst2.setSelected(false);
        jst3.setSelected(false);
        jst4.setSelected(false);
        jst5.setSelected(false);
        jst6.setSelected(false);
        jst7.setSelected(false);
        jst8.setSelected(false);
        jst9.setSelected(false);
        jst10.setSelected(false);
        jst11.setSelected(false);
        jst12.setSelected(false);
        jst13.setSelected(false);
        jst14.setSelected(false);
        jst15.setSelected(false);
        jst16.setSelected(false);
        jst17.setSelected(false);
        jst18.setSelected(false);
        jst19.setSelected(false);
        jst20.setSelected(false);
        jst21.setSelected(false);
        jst22.setSelected(false);
        jst23.setSelected(false);
        jst24.setSelected(false);
        jst25.setSelected(false);
        jst26.setSelected(false);
        jst27.setSelected(false);
        jst28.setSelected(false);
        jst29.setSelected(false);
        jst30.setSelected(false);
        jst31.setSelected(false);
        jst32.setSelected(false);
        jst33.setSelected(false);
        jst34.setSelected(false);
        jst35.setSelected(false);
        jst36.setSelected(false);
        jst37.setSelected(false);
        jst38.setSelected(false);
        jst39.setSelected(false);
        jst40.setSelected(false);
        jst41.setSelected(false);
        jst42.setSelected(false);
        jst43.setSelected(false);
        jst44.setSelected(false);
        jst45.setSelected(false);
        jst46.setSelected(false);
        jst47.setSelected(false);
        jst48.setSelected(false);
        jst49.setSelected(false);
        jst50.setSelected(false);
        jst51.setSelected(false);
        jst52.setSelected(false);
        jst53.setSelected(false);
        jst54.setSelected(false);
        jst55.setSelected(false);
        jst56.setSelected(false);
        jst57.setSelected(false);
        jst58.setSelected(false);
        jst59.setSelected(false);
        jst60.setSelected(false);
        jst61.setSelected(false);
        jst62.setSelected(false);
        jst63.setSelected(false);
        jst64.setSelected(false);
        jst65.setSelected(false);
        jst66.setSelected(false);
        jst67.setSelected(false);
        jst68.setSelected(false);
        jst69.setSelected(false);
        jst70.setSelected(false);
        jst71.setSelected(false);
        jst72.setSelected(false);
        jst73.setSelected(false);
        jst74.setSelected(false);
        jst76.setSelected(false);
        jst77.setSelected(false);
        jstconfiguracion.setSelected(false);
        cbcomplemento.setSelected(false);
    }    
    
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        txtCreado.setText(datefecha.format(date));   
    }
    
    String st69,st70,st71,st73,st74,st76,st77,st78,st80;
    public void ValidarPermisos(){
        if(!jst1.isSelected()){	st1="0";	}else{	st1="1"; }
        if(!jst2.isSelected()){	st2="0";	}else{	st2="1"; }
        if(!jst3.isSelected()){	st3="0";	}else{	st3="1"; }
        if(!jst4.isSelected()){	st4="0";	}else{	st4="1"; }
        if(!jst5.isSelected()){	st5="0";	}else{	st5="1"; }
        if(!jst6.isSelected()){	st6="0";	}else{	st6="1"; }
        if(!jst7.isSelected()){	st7="0";	}else{	st7="1"; }
        if(!jst8.isSelected()){	st8="0";	}else{	st8="1"; }
        if(!jst9.isSelected()){	st9="0";	}else{	st9="1"; }
        if(!jst10.isSelected()){	st10="0";	}else{	st10="1"; }
        if(!jst11.isSelected()){	st11="0";	}else{	st11="1"; }
        if(!jst12.isSelected()){	st12="0";	}else{	st12="1"; }
        if(!jst13.isSelected()){	st13="0";	}else{	st13="1"; }
        if(!jst14.isSelected()){	st14="0";	}else{	st14="1"; }
        if(!jst15.isSelected()){	st15="0";	}else{	st15="1"; }
        if(!jst16.isSelected()){	st16="0";	}else{	st16="1"; }
        if(!jst17.isSelected()){	st17="0";	}else{	st17="1"; }
        if(!jst18.isSelected()){	st18="0";	}else{	st18="1"; }
        if(!jst19.isSelected()){	st19="0";	}else{	st19="1"; }
        if(!jst20.isSelected()){	st20="0";	}else{	st20="1"; }
        if(!jst21.isSelected()){	st21="0";	}else{	st21="1"; }
        if(!jst22.isSelected()){	st22="0";	}else{	st22="1"; }
        if(!jst23.isSelected()){	st23="0";	}else{	st23="1"; }
        if(!jst24.isSelected()){	st24="0";	}else{	st24="1"; }
        if(!jst25.isSelected()){	st25="0";	}else{	st25="1"; }
        if(!jst26.isSelected()){	st26="0";	}else{	st26="1"; }
        if(!jst27.isSelected()){	st27="0";	}else{	st27="1"; }
        if(!jst28.isSelected()){	st28="0";	}else{	st28="1"; }
        if(!jst29.isSelected()){	st29="0";	}else{	st29="1"; }
        if(!jst30.isSelected()){	st30="0";	}else{	st30="1"; }
        if(!jst31.isSelected()){	st31="0";	}else{	st31="1"; }
        if(!jst32.isSelected()){	st32="0";	}else{	st32="1"; }
        if(!jst33.isSelected()){	st33="0";	}else{	st33="1"; }
        if(!jst34.isSelected()){	st34="0";	}else{	st34="1"; }
        if(!jst35.isSelected()){	st35="0";	}else{	st35="1"; }
        if(!jst36.isSelected()){	st36="0";	}else{	st36="1"; }
        if(!jst37.isSelected()){	st37="0";	}else{	st37="1"; }
        if(!jst38.isSelected()){	st38="0";	}else{	st38="1"; }
        if(!jst39.isSelected()){	st39="0";	}else{	st39="1"; }
        if(!jst40.isSelected()){	st40="0";	}else{	st40="1"; }
        if(!jst41.isSelected()){	st41="0";	}else{	st41="1"; }
        if(!jst42.isSelected()){	st42="0";	}else{	st42="1"; }
        if(!jst43.isSelected()){	st43="0";	}else{	st43="1"; }
        if(!jst44.isSelected()){	st44="0";	}else{	st44="1"; }
        if(!jst45.isSelected()){	st45="0";	}else{	st45="1"; }
        if(!jst46.isSelected()){	st46="0";	}else{	st46="1"; }
        if(!jst47.isSelected()){	st47="0";	}else{	st47="1"; }
        if(!jst48.isSelected()){	st48="0";	}else{	st48="1"; }
        if(!jst49.isSelected()){	st49="0";	}else{	st49="1"; }
        if(!jst50.isSelected()){	st50="0";	}else{	st50="1"; }
        if(!jst51.isSelected()){	st51="0";	}else{	st51="1"; }
        if(!jst52.isSelected()){	st52="0";	}else{	st52="1"; }
        if(!jst53.isSelected()){	st53="0";	}else{	st53="1"; }
        if(!jst54.isSelected()){	st54="0";	}else{	st54="1"; }
        if(!jst55.isSelected()){	st55="0";	}else{	st55="1"; }
        if(!jst56.isSelected()){	st56="0";	}else{	st56="1"; }
        if(!jst57.isSelected()){	st57="0";	}else{	st57="1"; }
        if(!jst58.isSelected()){	st58="0";	}else{	st58="1"; }
        if(!jst59.isSelected()){	st59="0";	}else{	st59="1"; }
        if(!jst60.isSelected()){	st60="0";	}else{	st60="1"; }
        if(!jst61.isSelected()){	st61="0";	}else{	st61="1"; }
        if(!jst62.isSelected()){	st62="0";	}else{	st62="1"; }
        if(!jst63.isSelected()){	st63="0";	}else{	st63="1"; }
        if(!jst64.isSelected()){	st64="0";	}else{	st64="1"; }
        if(!jst65.isSelected()){	st65="0";	}else{	st65="1"; }
        if(!jst66.isSelected()){	st66="0";	}else{	st66="1"; }
        if(!jst67.isSelected()){	st67="0";	}else{	st67="1"; }
        if(!jst68.isSelected()){	st68="0";	}else{	st68="1"; }
        if(!jst72.isSelected()){	st72="0";	}else{	st72="1"; }
        if(!jst69.isSelected()){	st69="0";	}else{	st69="1"; }
        if(!jst70.isSelected()){	st70="0";	}else{	st70="1"; }
        if(!jst71.isSelected()){	st71="0";	}else{	st71="1"; }
        if(!jst73.isSelected()){	st73="0";	}else{	st73="1"; }
        if(!jst74.isSelected()){	st74="0";	}else{	st74="1"; }
        if(!jst76.isSelected()){	st76="0";	}else{	st76="1"; }
        if(!jst77.isSelected()){	st77="0";	}else{	st77="1"; }
        if(!jstconfiguracion.isSelected()){	st78="0";	}else{	st78="1"; }
        if(!jcbTerminal.isSelected()){	st79="0";	}else{	st79="1"; }
        if(!cbcomplemento.isSelected()){	st80="0";	}else{	st80="1"; }
        try {
                RegistroUser();
            } catch (SQLException ex) {
                Logger.getLogger(STEusuario.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox cbcomplemento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    public javax.swing.JCheckBox jcbTerminal;
    public javax.swing.JCheckBox jst1;
    public javax.swing.JCheckBox jst10;
    public javax.swing.JCheckBox jst11;
    public javax.swing.JCheckBox jst12;
    public javax.swing.JCheckBox jst13;
    public javax.swing.JCheckBox jst14;
    public javax.swing.JCheckBox jst15;
    public javax.swing.JCheckBox jst16;
    public javax.swing.JCheckBox jst17;
    public javax.swing.JCheckBox jst18;
    public javax.swing.JCheckBox jst19;
    public javax.swing.JCheckBox jst2;
    public javax.swing.JCheckBox jst20;
    public javax.swing.JCheckBox jst21;
    public javax.swing.JCheckBox jst22;
    public javax.swing.JCheckBox jst23;
    public javax.swing.JCheckBox jst24;
    public javax.swing.JCheckBox jst25;
    public javax.swing.JCheckBox jst26;
    public javax.swing.JCheckBox jst27;
    public javax.swing.JCheckBox jst28;
    public javax.swing.JCheckBox jst29;
    public javax.swing.JCheckBox jst3;
    public javax.swing.JCheckBox jst30;
    public javax.swing.JCheckBox jst31;
    public javax.swing.JCheckBox jst32;
    public javax.swing.JCheckBox jst33;
    public javax.swing.JCheckBox jst34;
    public javax.swing.JCheckBox jst35;
    public javax.swing.JCheckBox jst36;
    public javax.swing.JCheckBox jst37;
    public javax.swing.JCheckBox jst38;
    public javax.swing.JCheckBox jst39;
    public javax.swing.JCheckBox jst4;
    public javax.swing.JCheckBox jst40;
    public javax.swing.JCheckBox jst41;
    public javax.swing.JCheckBox jst42;
    public javax.swing.JCheckBox jst43;
    public javax.swing.JCheckBox jst44;
    public javax.swing.JCheckBox jst45;
    public javax.swing.JCheckBox jst46;
    public javax.swing.JCheckBox jst47;
    public javax.swing.JCheckBox jst48;
    public javax.swing.JCheckBox jst49;
    public javax.swing.JCheckBox jst5;
    public javax.swing.JCheckBox jst50;
    public javax.swing.JCheckBox jst51;
    public javax.swing.JCheckBox jst52;
    public javax.swing.JCheckBox jst53;
    public javax.swing.JCheckBox jst54;
    public javax.swing.JCheckBox jst55;
    public javax.swing.JCheckBox jst56;
    public javax.swing.JCheckBox jst57;
    public javax.swing.JCheckBox jst58;
    public javax.swing.JCheckBox jst59;
    public javax.swing.JCheckBox jst6;
    public javax.swing.JCheckBox jst60;
    public javax.swing.JCheckBox jst61;
    public javax.swing.JCheckBox jst62;
    public javax.swing.JCheckBox jst63;
    public javax.swing.JCheckBox jst64;
    public javax.swing.JCheckBox jst65;
    public javax.swing.JCheckBox jst66;
    public javax.swing.JCheckBox jst67;
    public javax.swing.JCheckBox jst68;
    public javax.swing.JCheckBox jst69;
    public javax.swing.JCheckBox jst7;
    public javax.swing.JCheckBox jst70;
    public javax.swing.JCheckBox jst71;
    public javax.swing.JCheckBox jst72;
    public javax.swing.JCheckBox jst73;
    public javax.swing.JCheckBox jst74;
    public javax.swing.JCheckBox jst76;
    public javax.swing.JCheckBox jst77;
    public javax.swing.JCheckBox jst8;
    public javax.swing.JCheckBox jst9;
    public javax.swing.JCheckBox jstconfiguracion;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCreado;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtNuser;
    public javax.swing.JTextField txtRol;
    public javax.swing.JTextField txtUserf1;
    // End of variables declaration//GEN-END:variables

}