package strack;

import Clases.ConexionEDI;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MenuGeneral extends javax.swing.JFrame {
    private Object lblUserVF;
    private static final String iTextExampleImage = "C:/Strack/Iconos/logo.png";

    public MenuGeneral() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblzh = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnFactura = new javax.swing.JButton();
        btnFactura1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblzh1 = new javax.swing.JLabel();
        btnUUID = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnUUID1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Strack FCA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/posicion.png"))); // NOI18N
        jButton2.setText("Stars");
        jButton2.setActionCommand("241 Manual");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Factura1.png"))); // NOI18N
        btnFactura.setText("Cobranza");
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        btnFactura1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Facturacion_1.png"))); // NOI18N
        btnFactura1.setText("CPO");
        btnFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactura1ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cpo.png"))); // NOI18N
        jButton3.setText("Validador XML");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cpo.png"))); // NOI18N
        jButton4.setText("Catalogos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cono.png"))); // NOI18N
        jButton6.setText("Contrucción");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblzh)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFactura1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblzh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFactura1)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFactura)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("Supertrack S.A de C.V");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Construcción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        btnUUID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/xml.png"))); // NOI18N
        btnUUID.setText("Complementos");
        btnUUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUUIDActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/sesion.png"))); // NOI18N
        jButton8.setText("Usuarios");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cono.png"))); // NOI18N
        jButton5.setText("Reloj Checador");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/facturacion.png"))); // NOI18N
        jButton1.setText("Configuración");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUUID1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/xml.png"))); // NOI18N
        btnUUID1.setText("Reporte de xml");
        btnUUID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUUID1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUUID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(btnUUID1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblzh1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(btnUUID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnUUID1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblzh1)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Bienvenido(a):");

        lblUser.setText("Usuario");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Control de Strack");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUUIDActionPerformed
       // JOptionPane.showMessageDialog(null, "Apartado en mantenimiento","",JOptionPane.INFORMATION_MESSAGE);
        UsuerAplicacion(); 
    }//GEN-LAST:event_btnUUIDActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        consultarUsuer1();        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Ctalogo();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Usuer810();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactura1ActionPerformed
        UsuerCPO();
    }//GEN-LAST:event_btnFactura1ActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        usercbz();
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        consultarUsuerST();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND conf='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    PanelConfiguracion cofig = new PanelConfiguracion();                    
                    cofig.lblUserVF.setText(lblUser.getText());
                    cofig.setVisible(true);                                         
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(true);
        tbl_jornada_laboral reloj=new tbl_jornada_laboral();
        reloj.txtusuario.setText(lblUser.getText());
        reloj.setVisible(true); 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        consultarUsuer();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnUUID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUUID1ActionPerformed
        Document doc=new Document(PageSize.A4.rotate()); //docuento con horientacion de hoja
        try {
            String ruta=System.getProperty("user.home");
            PdfWriter.getInstance(doc, new FileOutputStream(ruta+"/Desktop/incidencias/incidencias.pdf"));
            doc.open();  
            
            Paragraph titulo = new Paragraph();
            titulo.add("REPORTE DE INCIDENCIAS");
            titulo.setAlignment(Element.ALIGN_CENTER);
            titulo.getFont().setSize(12);
            titulo.add(Chunk.NEWLINE);
            doc.add(titulo); 
            
            Paragraph subtitulo = new Paragraph();
            subtitulo.add("PRE-NOMINA  ADMINISTRATIVOS");
            subtitulo.setAlignment(Element.ALIGN_CENTER);
            subtitulo.getFont().setSize(12);
            subtitulo.add(Chunk.NEWLINE);
            doc.add(subtitulo);
            
            Chapter chapter = new Chapter(new Paragraph(titulo), 1);
            chapter.setNumberDepth(0);
            chapter.add(subtitulo);
            chapter.add(Chunk.NEWLINE);
            //chapter.add(new Paragraph("PRE-NOMINA  ADMINISTRATIVOS",  fuente));                  
            
            Image image;
            try {
                image = Image.getInstance(iTextExampleImage);  
                image.setAbsolutePosition(30f, 540f);
                image.setAlignment(Element.ALIGN_LEFT);
                image.scaleAbsoluteWidth(60f);
                image.scaleAbsoluteHeight(20f);
                chapter.add(image);
                //doc.add(image);
            } catch (BadElementException ex) {
                System.out.println("Image BadElementException" +  ex);
            } catch (IOException ex) {
                System.out.println("Image IOException " +  ex);
            }
            doc.add(chapter);  
//            doc.add(Chunk.NEWLINE );//  SANTO DE LIENAS               

            Font fuente= new Font();
            fuente.setSize(10);
            fuente.setColor(BaseColor.DARK_GRAY);
            fuente.setFamily(Font.FontFamily.TIMES_ROMAN.toString());

            Font reg= new Font();
            reg.setSize(8);
            reg.setColor(BaseColor.BLACK);
            reg.setFamily(Font.FontFamily.TIMES_ROMAN.toString());  

            PdfPTable tbl= new PdfPTable(10);
            tbl.setWidthPercentage(100);
            tbl.setWidths(new float[] {8,30,10,10,10,10,10,10,10,30});
            //tbl.setWidths(new float[] {15, 20, 10, 10, 30, 10, 10,10});
            Paragraph c1 = new Paragraph("# EMPL.");
            //c1.getFont().setStyle(Font.NORMAL);
            c1.getFont().setStyle(Font.BOLD);
            c1.setAlignment(Element.ALIGN_JUSTIFIED);
            c1.getFont().setSize(8);
            tbl.addCell(c1);
            
            Paragraph c2 = new Paragraph("NOMBRE_DE_EMPLEADO");
            c2.getFont().setStyle(Font.BOLD);
            c2.setAlignment(Element.ALIGN_JUSTIFIED);
            c2.getFont().setSize(8);
            tbl.addCell(c2);
            
            Paragraph c3 = new Paragraph("AUSENTISMO");
            c3.getFont().setStyle(Font.BOLD);
            c3.setAlignment(Element.ALIGN_JUSTIFIED);
            c3.getFont().setSize(8);
            tbl.addCell(c3);
            
            Paragraph c4 = new Paragraph("TIEMPO_EXTRA");
            c4.getFont().setStyle(Font.BOLD);
            c4.setAlignment(Element.ALIGN_JUSTIFIED);
            c4.getFont().setSize(8);
            tbl.addCell(c4);            
            
            Paragraph c5 = new Paragraph("OTRAS PERCEP.");
            c5.getFont().setStyle(Font.BOLD);
            c5.setAlignment(Element.ALIGN_JUSTIFIED);
            c5.getFont().setSize(8);
            tbl.addCell(c5);
            
            Paragraph c6 = new Paragraph("DESCANSO TRABAJADO");
            c6.getFont().setStyle(Font.BOLD);
            c6.setAlignment(Element.ALIGN_JUSTIFIED);
            c6.getFont().setSize(8);
            tbl.addCell(c6);
            
            Paragraph c7 = new Paragraph("PRIMA DOMINICAL");
            c7.getFont().setStyle(Font.BOLD);
            c7.setAlignment(Element.ALIGN_JUSTIFIED);
            c7.getFont().setSize(8);
            tbl.addCell(c7);
            
            Paragraph c8 = new Paragraph("VACACIONES");
            c8.getFont().setStyle(Font.BOLD);
            c8.setAlignment(Element.ALIGN_JUSTIFIED);
            c8.getFont().setSize(8);
            tbl.addCell(c8);
            
            Paragraph c9 = new Paragraph("DÍA FESTIVO");
            c9.getFont().setStyle(Font.BOLD);
            c9.setAlignment(Element.ALIGN_JUSTIFIED);
            c9.getFont().setSize(8);
            tbl.addCell(c9);    
            
            Paragraph c10 = new Paragraph("OBSERVACIONES");
            c10.getFont().setStyle(Font.BOLD);
            c10.setAlignment(Element.ALIGN_JUSTIFIED);
            c10.getFont().setSize(8);
            tbl.addCell(c10);         
               
            //conexion a dbo
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            try {
               Statement statement =(Statement)miConexion.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM  tbl_incidencia_nom");
                    if(rs.next() == true){
                        do{
                            tbl.addCell(new Paragraph(rs.getString("ID"), reg));
                            tbl.addCell(new Paragraph(rs.getString("NOMBRE_DE_EMPLEADO"), reg));
                            tbl.addCell(new Paragraph(rs.getString("AUSENTISMO"), reg));
                            tbl.addCell(new Paragraph(rs.getString("TIEMPO_EXTRA"), reg));
                            tbl.addCell(new Paragraph(rs.getString("OTRAS_PERCEP"), reg));
                            tbl.addCell(new Paragraph(rs.getString("DESCANSO_TRABAJADO"), reg));
                            tbl.addCell(new Paragraph(rs.getString("PRIMA_DOMINICAL"), reg));
                            tbl.addCell(new Paragraph(rs.getString("VACACIONES"), reg));    
                            tbl.addCell(new Paragraph(rs.getString("DIA_FESTIVO"), reg)); 
                            tbl.addCell(new Paragraph(rs.getString("OBSERVACIONES"), reg)); 
                        }while(rs.next());                        
            doc.add(tbl);//fin de la tabla tbl.getHeader(doc.add("hola",fuente));
                    }else {
                        JOptionPane.showMessageDialog(null,"No hay resultados","Informativo",JOptionPane.INFORMATION_MESSAGE);
                    }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
            }  
           
            Paragraph lista = new Paragraph();
            lista.setAlignment(Element.ALIGN_JUSTIFIED);
            lista.getFont().setSize(8);
            lista.add(Chunk.NEWLINE);
            lista.add("1. SE DEBERA ANOTAR EL NOMBRE COMPLETO DEL EMPLEADO COMENZANDO POR APELLIDOS Y EN ORDEN ALFABETICO");
            lista.add(Chunk.NEWLINE);
            lista.add("2. EN LA PARTE DE ABAJO SE DETALLAN LAS CLAVES QUE SE USARAN PARA EL LLENADO");
            lista.add(Chunk.NEWLINE);
            lista.add("3. UNICAMENTE LAS CLAVES SE ANOTARAN EN EL RECUADRO QUE LE CORRESPONDA");
            lista.add(Chunk.NEWLINE);
            lista.add("4. SE ELABORARA UN REPORTE POR DEPARTAMENTO");
            lista.add(Chunk.NEWLINE);
            lista.add("5. EN RECUADRO DE OBSERVACIONES SE HARA UNA EXPLICACION BREVE DE LA INCIDENCIA");
            lista.add(Chunk.NEWLINE);
            lista.add("6. SI SE PAGAN VACACIONES DEBERA ANEXARSE FORMATO DE AUTORIZACION PARA SABER FECHA DE INGRESO Y DIAS QUE SE LE PAGAN");
            doc.add(lista);
             
            doc.close();
            JOptionPane.showMessageDialog(null, "Reporte creado","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
        } 
        
//            PdfPTable encabezado = new PdfPTable(3); 
//            encabezado.addCell("Logo ");
//            encabezado.addCell("FORMATO ");
//            encabezado.addCell("Fecha de inicio de vigencia");            
//            PdfPCell celdaFinal = new PdfPCell(new Paragraph("PRE-NOMINA  ADMINISTRATIVOS"));
//            celdaFinal.setColspan(3);
//            encabezado.addCell(celdaFinal);
//            doc.add(encabezado);

//            Paragraph saltolinea1 = new Paragraph();
//            saltolinea1.add("\n\n");           
//            doc.add(saltolinea1);
//            doc.add( Chunk.NEWLINE );//  SANTO DE LIENAS           
//            Paragraph paragraphLorem = new Paragraph();
//            paragraphLorem.add("Datos del reporte");
//            doc.add(paragraphLorem);  
            

/*Metodo original a restablecer*/

//        Connection miConexion =(Connection)ConexionEDI.GetConnection();
//        try {
//            Statement statement =(Statement)miConexion.createStatement();
//            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND cont='1'");
//            //ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND ctlAPL='1'");
//                if(rs1.next() == true){
//                    this.setVisible(true);
//                    ComparativoSAT_original erp=new ComparativoSAT_original();
//                    erp.txtusuario.setText(lblUser.getText());
//                    erp.setVisible(true);                      
//                }else {
                    //JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
//                }
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
//        } 
    }//GEN-LAST:event_btnUUID1ActionPerformed
      
    public void consultarUsuer(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND Admin='1'");
                if(rs1.next() == true){
                    Procesos menup=new Procesos();
                    menup.txtUserf1.setText(lblUser.getText());
                    menup.setVisible(true);
                    this.setVisible(false);   
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void consultarUsuer1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND Usuarios='1'");
                if(rs1.next() == true){
                    this.setVisible(true);
                    tbl_Usuarios canven=new tbl_Usuarios();
                    canven.txtUserf1.setText(lblUser.getText());
                    canven.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void consultarUsuerST1(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND ROL='administrador'");
                if(rs1.next() == true){
                    MenuStars menup=new MenuStars();
                    menup.txtUserf1.setText(lblUser.getText());
                    menup.setVisible(true);
                    this.setVisible(false);   
                }else {                    
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void Usuer810(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND Edi810='1'");
                if(rs1.next() == true){
                    this.setVisible(true);
                    tbl_810_edek rep810=new tbl_810_edek();
                    rep810.lblUserVF.setText(lblUser.getText());
                    rep810.setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void UsuerCPO(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND CtaCPO='1'");
                if(rs1.next() == true){
                    this.setVisible(true);
                    tbl_Reg_CPO cpo1=new tbl_Reg_CPO();
                    cpo1.lblUserVF.setText(lblUser.getText());
                    cpo1.setVisible(true);                                          
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Mensajde informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void Ctalogo(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND CtaEDI='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    MenuCTG cpo1=new MenuCTG();
                    cpo1.txtUserf1.setText(lblUser.getText());
                    cpo1.setVisible(true);                                       
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Mensajde informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void usercbz(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND Edi210='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    tbl_Reg_Fact_ede_edi_1 canven=new tbl_Reg_Fact_ede_edi_1();
                    canven.lblUserVF.setText(lblUser.getText());
                    canven.setVisible(true);                                           
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }

    public void consultarUsuerST(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND stars='1'");
                if(rs1.next() == true){
                    this.setVisible(true); 
                    MenuStars menup=new MenuStars();
                    menup.txtUserf1.setText(lblUser.getText());
                    menup.setVisible(true);    
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    public void UsuerAplicacion(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND cont='1'");
            //ResultSet rs1 = statement.executeQuery("select * from TBL_Usuarios where NombreU='"+lblUser.getText()+"' AND ctlAPL='1'");
                if(rs1.next() == true){
                    this.setVisible(true);
                    ComparativoSAT_original erp=new ComparativoSAT_original();
                    erp.txtusuario.setText(lblUser.getText());
                    erp.setVisible(true);                      
                }else {
                    JOptionPane.showMessageDialog(null,"Opción no disponible al usuario","Informativo",JOptionPane.INFORMATION_MESSAGE);
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFactura;
    private javax.swing.JButton btnFactura1;
    private javax.swing.JButton btnUUID;
    private javax.swing.JButton btnUUID1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JLabel lblUser;
    private javax.swing.JLabel lblzh;
    private javax.swing.JLabel lblzh1;
    // End of variables declaration//GEN-END:variables

}
/*Mantener para activar con parametros*/
//tbl_Reg_PCRETIRO rep810=new tbl_Reg_PCRETIRO();
//consultarUsuer();