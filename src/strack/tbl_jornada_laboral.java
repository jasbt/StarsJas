package strack;

import Clases.ConexionEDI;
import Clases.Exportar810;
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
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class tbl_jornada_laboral extends javax.swing.JFrame {
    private static final String iTextExampleImage = "C:/Strack/Iconos/logo.png";
    private DefaultComboBoxModel modelempleado;
    
    DefaultTableModel tm=new DefaultTableModel();
    private void PropiedadesTabla(){
        jtPeriodo.setDefaultRenderer(Object.class, new ImgTable());
        String titulos []={"Codigo","Empleado","Terminal","Dia","Fecha","Entrada","Salida","Horas","Reporte de entrada","Reporte de salida","a"};
        tm=new DefaultTableModel(null,titulos);
        jtPeriodo.setModel(tm);
    }
    
    public tbl_jornada_laboral() {
        modelempleado = new DefaultComboBoxModel(new String [] {});
        initComponents();
        setLocationRelativeTo(null);
        itempleado();
        PropiedadesTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtfecha1 = new javax.swing.JTextField();
        txtfecha2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPeriodo = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel1.setText("Jornada Laboral Supertrack");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel2.setText("Empleado:");

        jComboBox1.setModel(modelempleado);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 12)); // NOI18N
        jLabel3.setText("Periodo:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        jButton1.setToolTipText("Buscar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtPeriodo.setModel(tm);
        jtPeriodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtPeriodoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtPeriodo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cok.png"))); // NOI18N
        jButton2.setToolTipText("Exportar");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w3.png"))); // NOI18N
        jButton5.setToolTipText("Sin registro");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w2.png"))); // NOI18N
        jButton3.setToolTipText("Retardo");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/w1.png"))); // NOI18N
        jButton4.setToolTipText("Salida");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton6.setToolTipText("Procesar");
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/odt4.png"))); // NOI18N
        jButton7.setToolTipText("Procesar");
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/002-calendario.png"))); // NOI18N
        jButton8.setToolTipText("Procesar incidencias");
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/simbolo.png"))); // NOI18N
        jButton9.setToolTipText("Archivo de nomina");
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/herramienta.png"))); // NOI18N
        jButton10.setToolTipText("Procesar");
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2)
                                        .addComponent(txtfecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtfecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6)
                                    .addComponent(jButton7)
                                    .addComponent(jButton2)
                                    .addComponent(jButton8)
                                    .addComponent(jButton9)
                                    .addComponent(jButton10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel5.setText("Usuario:");

        txtusuario.setEditable(false);
        txtusuario.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Consultas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtPeriodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtPeriodoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPeriodoMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Boton para cuando los registros en el reloj cheador no se encuentra completo
        ClearTabla(); 
        q="select * from nom_checador_app  where fecha between '"+txtfecha1.getText()+" 00:00:00' and '"+txtfecha2.getText()+" 23:59:59'  and horas is null order by fecha asc"; 
        jbt();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ClearTabla(); 
        q="select * from nom_checador_app  where fecha between '"+txtfecha1.getText()+" 00:00:00' and '"+txtfecha2.getText()+" 23:59:59'  and rte>=0 order by fecha asc"; 
        jbt();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ClearTabla(); 
        q="select * from nom_checador_app  where fecha between '"+txtfecha1.getText()+" 00:00:00' and '"+txtfecha2.getText()+" 23:59:59'  and rte<=0 order by fecha asc"; 
        jbt();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        exitForm(evt);                
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (jtPeriodo.getRowCount() > 0) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                List<JTable> tb = new ArrayList<>();
                List<String> nom = new ArrayList<>();
                tb.add(jtPeriodo);
                nom.add("Hoja1");
                String file = chooser.getSelectedFile().toString().concat(".xls");
                try {
                    Exportar810 e = new Exportar810 (new File(file), tb, nom);
                    if (e.export()) {
                        JOptionPane.showMessageDialog(null, "Los datos fueron exportados exitosamente", "Mensaje Informativo", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error " + e.getMessage(), "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay datos ha exportar","Mensaje de Error",JOptionPane.ERROR_MESSAGE);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        //JOptionPane.showMessageDialog(this, "Error al generar archivo","Mensaje de archivo",JOptionPane.ERROR_MESSAGE);
        this.setVisible(true); 
        From_incidencias incidencias=new From_incidencias();
        incidencias.txtUserf1.setText(txtusuario.getText());
        incidencias.setVisible(true);    
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
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
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        ClearTabla();
        jComboBox1.setSelectedItem("SELECCIONE");
    }//GEN-LAST:event_jButton10ActionPerformed
    
    public void itempleado(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery("select distinct empleado from reloj_checador order by empleado asc");
            modelempleado.addElement("SELECCIONE");
                while(rs1.next()){
                    modelempleado.addElement(rs1.getString("empleado")); 
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo 1.","Error",JOptionPane.ERROR_MESSAGE);
        } 
    }    
    
    public void ClearTabla(){
        DefaultTableModel model=(DefaultTableModel) jtPeriodo.getModel();
    	for (int i=0; i<jtPeriodo.getRowCount(); i++){
            model.removeRow(i);
            i-=1;
    	}
    }   
    
    String q;
    public void Consultas(){
        ClearTabla(); 
        if(jComboBox1.getSelectedItem().toString().equals("SELECCIONE") && (!txtfecha1.getText().equals("") && !txtfecha2.getText().equals(""))){
            q="select * from nom_checador_app where fechan between convert(datetime,'"+txtfecha1.getText()+" 00:00:00.000') and convert(datetime,'"+txtfecha2.getText()+" 00:00:00.000') order by fechan asc"; 
            jbt();
        }else if( !jComboBox1.getSelectedItem().toString().equals("SELECCIONE") && (!txtfecha1.getText().equals("") && !txtfecha2.getText().equals(""))){
            q="select * from nom_checador_app where fechan between convert(datetime,'"+txtfecha1.getText()+" 00:00:00.000') and convert(datetime,'"+txtfecha2.getText()+" 00:00:00.000') and empleado ='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"' order by fechan asc"; 
            jbt();
        }else if( jComboBox1.getSelectedItem().toString().equals("SELECCIONE") && (txtfecha1.getText().equals("") && txtfecha2.getText().equals(""))){
            q="select * from nom_checador_app order by fechan asc";
            jbt();
        }
    }
    
    JLabel a,b,c,d,e;
    public void jbt(){
        System.out.println("consulta directa");
        String entrada="";
        String espacio_entrada="";
        
        String salida="";
        String espacio_salida="";
         
        jtPeriodo.setDefaultRenderer(Object.class, new ImgTable());
        String [] Reg=new String[21];      
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
            Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(q);
                while (rs1.next()) {
                    Reg[0]=rs1.getString("codigo");
                    Reg[1]=rs1.getString("empleado");
                    Reg[2]=rs1.getString("terminal");
                    Reg[3]=rs1.getString("dia");
                    Reg[4]=rs1.getString("fechan");
                    Reg[5]=rs1.getString("entrada");
                    Reg[6]=rs1.getString("salida");
                    Reg[7]=rs1.getString("horas");
                    entrada=rs1.getString("entrada");
                    if ("09:05:00".equals(entrada)){
                        System.out.println("normal");
                    }else{
                        System.out.println("retardo");
                    }
                    Reg[8]=rs1.getString("horas");
                    //Reg[8]=rs1.getString("rte");
                //    Reg[9]=rs1.getString("rte");
                    //Reg[10]=rs1.getString("rts");
                //    Reg[11]=rs1.getString("rts");
                    
//                    entrada=rs1.getString("entrada");
//                    espacio_entrada=entrada;
//                    if( (espacio_entrada == null || espacio_entrada.equals("")) ){
//                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));  
//                                       
//                    }else{
//                        
//                        int ea=Integer.parseInt(rs1.getString("rte"));
//                        if((ea>0)){
//                            a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w2.png")); 
//                        }else{
//                            System.out.println("Normal");
//                            a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));
//                        } 
//                        
//                    }
//                    
//                    
//                    salida=rs1.getString("salida");
//                    espacio_salida=salida;
//                    if(espacio_salida == null || espacio_salida.equals("")){
//                        b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
//                    }else{
                        
//                        int ea=Integer.parseInt(rs1.getString("rts"));
//                        if((ea<0)){
//                            b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png")); 
//                        }else{
//                            System.out.println("Normal");
//                            b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));
//                        } 
                        
                        //b=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
//                    }
                    
//                    if(espacio_entrada== null || espacio_entrada.equals("")){
//                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w3.png"));                        
//                    }else if(espacio_entrada.equals("ACEPTADO")){
//                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\cok.png"));                        
//                    }else if(espacio_entrada.equals("RECHAZADO")){
//                        a=new JLabel(new ImageIcon("C:\\Strack\\Iconos\\w1.png"));                      
//                    }
//                    tm.addRow(new Object[]{Reg[0],Reg[1],Reg[2],Reg[3],Reg[4],Reg[5],Reg[6],Reg[7],a,Reg[9],b,Reg[11]});                   

                    tm.addRow(new Object[]{Reg[0],Reg[1],Reg[2],Reg[3],Reg[4],Reg[5],Reg[6],Reg[7]});                   
                }//while
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
        } jtPeriodo.setModel(tm);        
    }

    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPeriodo;
    private javax.swing.JTextField txtfecha1;
    private javax.swing.JTextField txtfecha2;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}

//        DefaultTableModel model = (DefaultTableModel) jbtPeriodo.getModel();
//            jbtPeriodo.setModel(model);
//            String query="select distinct fecha,Hora,nom_empleado,terminal_name\n" +
//                        "from vreloj \n" +
//                        "where terminal_name !='ACCESO SITE'\n" +
//                        "order by nom_empleado asc"; 
//            Connection miConexion =(Connection)ConexionEDI.GetConnection();
//            String [] data = new String[25];
//            try {
//                Statement st=(Statement)miConexion.createStatement();
//                ResultSet resp= st.executeQuery(query);
//                while (resp.next()) {
//                    data[0]=resp.getString("nom_empleado");
//                    data[1]=resp.getString("fecha");
//                    data[2]=resp.getString("Hora");
//                    data[3]=resp.getString("terminal_name");
//                    model.addRow(data);
//                }jbtPeriodo.setModel(model);
//            } catch (SQLException ex) {
//                Logger.getLogger(InicioSession.class.getName()).log(Level.SEVERE, null, ex);
//            }try {
//                miConexion.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(InicioSession.class.getName()).log(Level.SEVERE, null, ex);
//            } 



//    public ArrayList Consulta(){
//        Connection miConexion =(Connection)ConexionEDI.GetConnection();
//        ArrayList lista = new ArrayList();
//        try {
//           Statement statement =(Statement)miConexion.createStatement();
//            ResultSet rs1 = statement.executeQuery("select distinct fecha,Hora,nom_empleado,terminal_name,dia\n" +
//                        "from vreloj \n" +
//                        "where terminal_name !='ACCESO SITE' and Fecha between '"+txtfecha1.getText()+"' and '"+txtfecha2.getText()+"' and nom_empleado ='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"'\n" +
//                        "order by nom_empleado asc");
////            ResultSet rs1 = statement.executeQuery("select distinct fecha,Hora,nom_empleado,terminal_name,dia\n" +
////                        "from vreloj \n" +
////                        "where terminal_name !='ACCESO SITE' and Fecha between '"+txtfecha1.getText()+"' and '"+txtfecha2.getText()+"' order by nom_empleado asc");
//            while (rs1.next()) {
//                String fecha =rs1.getString("fecha") +" "+ rs1.getString("hora")+" "+rs1.getString("dia")+" "+rs1.getString("nom_empleado") ;
//                lista.add(fecha);
//                System.out.println("jornadalaboral.InicioSession.Consulta() "+lista);
//                
////                    for  (int x=0; x<lista.hashCode() ; x++)
////                    System.out.println(lista.get(x));
//            }            
//            return lista;
//            
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
//        } 
//        return null;
//    }



//        Consulta1();//prueba
//        Consulta(); //arreglo
//            String query="select distinct nom_empleado,terminal_name,fecha,hora,emp_id,horario,tiempo,suma\n" +
//                        "from vtbl_horario_empledo\n" +
//                        "where terminal_name !='ACCESO SITE' and horario between '"+txtfecha1.getText()+"' and '"+txtfecha2.getText()+"' and nom_empleado ='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"'\n" +
//                        "order by nom_empleado asc"; 
//            String query="select distinct fecha,Hora,nom_empleado,terminal_name,horario,dia\n" +
//                        "from vreloj \n" +
//                        "where terminal_name !='ACCESO SITE' and punch_time between '"+txtfecha1.getText()+" 00:00:00' and '"+txtfecha2.getText()+" 23:59:59' and nom_empleado ='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"'\n" +
//                        "order by nom_empleado asc"; 


//    public void Consulta1(){
//        Connection miConexion =(Connection)ConexionEDI.GetConnection();
//        try {
//           Statement statement =(Statement)miConexion.createStatement();
//            ResultSet rs1 = statement.executeQuery("select distinct fecha,Hora,nom_empleado,terminal_name\n" +
//                        "from vreloj \n" +
//                        "where terminal_name !='ACCESO SITE' and Fecha between '"+txtfecha1.getText()+"' and '"+txtfecha2.getText()+"' and nom_empleado ='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"'\n" +
//                        "order by nom_empleado asc");
//            while (rs1.next()) {
//               System.out.println("Resultado: "+rs1.getString("fecha")+" "+rs1.getString("Hora")+" "+rs1.getString("nom_empleado")+" "+rs1.getString("terminal_name"));              
//            }                    
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
//        } 
//    }


//    public void jbt(){
//        System.out.println("jbt()");
//        Connection miConexion =(Connection)ConexionEDI.GetConnection();
//        try {
//           Statement statement =(Statement)miConexion.createStatement();
//            ResultSet rs2 = statement.executeQuery("select * from rep_empleado_jbt_bt  where terminal !='ACCESO SITE' and fecha between '"+txtfecha1.getText()+" 00:00:00' and '"+txtfecha2.getText()+" 23:59:59' order by fecha asc");
//            //ResultSet rs2 = statement.executeQuery("select * from rep_empleado_jbt_bt  where terminal !='ACCESO SITE' and fecha between '"+txtfecha1.getText()+" 00:00:00' and '"+txtfecha2.getText()+" 23:59:59'  and empleado ='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"' order by fecha asc");
//            while(rs2.next()){
//                System.out.println(rs2.getString("entrada")+" "+rs2.getString("er")+" "+ rs2.getString("empleado"));
//                if ( rs2.getString("entrada").equals(rs2.getString("er"))  || rs2.getString("entrada").equals("null")){
//                    System.out.println("Retardo"+ rs2.getString("empleado")+" "+rs2.getString("fecha")+" "+rs2.getString("entrada")+" "+rs2.getString("er")); 
//                }else {
//                    System.out.println("Revision "+ rs2.getString("empleado")+" "+rs2.getString("fecha")+" "+rs2.getString("entrada")+" "+rs2.getString("er"));                                    
//                }
//            }//en de while
//        } catch (SQLException ex) {
//            System.out.println("Error SQL consulta 210- factura"+ex.getMessage());
//        }         
//    }

/*Método general comprobado
DefaultTableModel model = (DefaultTableModel) jtPeriodo.getModel();
            jtPeriodo.setModel(model);
            String query="select * from rep_empleado_jbt where terminal !='ACCESO SITE' and fecha between '"+txtfecha1.getText()+" 00:00:00' and '"+txtfecha2.getText()+" 23:59:59' and empleado ='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"' order by fecha asc"; 
            Connection miConexion =(Connection)ConexionEDI.GetConnection();
            String [] data = new String[25];
            try {
                Statement st=(Statement)miConexion.createStatement();
                ResultSet resp= st.executeQuery(query);
                while (resp.next()) {
                    data[0]=resp.getString("empleado");
                    data[1]=resp.getString("fecha");
                    data[2]=resp.getString("entrada");
                    data[3]=resp.getString("salida");
                    data[4]=resp.getString("terminal");
                    data[5]=resp.getString("dia");
                    //data[6]=resp.getString("suma");
                    model.addRow(data);
                }jtPeriodo.setModel(model);
            } catch (SQLException ex) {
                Logger.getLogger(InicioSession.class.getName()).log(Level.SEVERE, null, ex);
            }try {
                miConexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(InicioSession.class.getName()).log(Level.SEVERE, null, ex);
            }
*/

/*
Y
A
Z
    public void jbt(){
        System.out.println("jbt()");
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs2 = statement.executeQuery(q);
//ResultSet rs2 = statement.executeQuery("select * from rep_empleado_jbt where terminal !='ACCESO SITE' and fecha between '"+txtfecha1.getText()+" 00:00:00' and '"+txtfecha2.getText()+" 23:59:59' and empleado ='"+jComboBox1.getSelectedItem().toString().toUpperCase()+"' order by fecha asc");
            while(rs2.next()){
                System.out.println(rs2.getString("entrada")+" "+ rs2.getString("empleado")+" "+ rs2.getString("rte")+" *** "+rs2.getString("salida")+" "+rs2.getString("rts"));
                int e=Integer.parseInt(rs2.getString("rte"));
                if(e>0){
                    System.out.println("despues");
                }else{
                    System.out.println("antes");
                }
                
                int s=Integer.parseInt(rs2.getString("rts"));
                if(s>0){
                    System.out.println("despues");
                }else{
                    System.out.println("antes");
                }
                
//use Checador
//go
//
//select * from rep_empleado_jbt where empleado='briones tepepa yazmin' and fecha between '20191101 00:00:00' and GETDATE()order by fecha asc
//select * from rep_empleado_jbt_bt where empleado='briones tepepa yazmin' and fecha between '20191101 00:00:00' and GETDATE()order by fecha asc
//select * from [dbo].[tbl_horarios] where empleado_r='1'
//
//select empleado,dia,terminal,fecha,entrada,salida,empleado_r,horas,DATEDIFF(MINUTE,entrada,er)reporte1,DATEDIFF(MINUTE,er,entrada)reporte2
//from rep_empleado_jbt_bt  where empleado='briones tepepa yazmin' and fecha between '20191101 00:00:00' and GETDATE()order by fecha asc
//
//select DATEDIFF(MINUTE,fecha_max,GETDATE()) AS Diferencia  
            }//en de while
M
I
N
*/