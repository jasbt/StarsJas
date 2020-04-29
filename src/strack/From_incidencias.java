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
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import javax.swing.table.DefaultTableModel;

public class From_incidencias extends javax.swing.JFrame {
    private DefaultComboBoxModel modelempleado;
    private DefaultComboBoxModel modeldepto;
    
    private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 18, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
         
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font blueFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);    
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
     
    private static final String iTextExampleImage = "C:/Strack/Iconos/logo.png";
    
    
    public From_incidencias() {
        modelempleado = new DefaultComboBoxModel(new String [] {});
        modeldepto = new DefaultComboBoxModel(new String [] {});
        initComponents();
        itempleado();
        itemdepto();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtUserf1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblincidencias = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbempleado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbdepto = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtnumero1 = new javax.swing.JTextField();
        txtnumero2 = new javax.swing.JTextField();
        tbnCrear = new javax.swing.JButton();
        tbnCrear1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("From de incidencias");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Registro de Incidencias");

        jLabel17.setText("Usuario:");

        txtUserf1.setEditable(false);
        txtUserf1.setBorder(null);

        tblincidencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "AUSENTISMO", "TIEMPO EXTRA", "OTRAS PERCEP.", "DESCANSO TRABAJADO", "PRIMA DOMINICAL", "VACACIONES", "DÍA FESTIVO ", "OBSERVACIONES"
            }
        ));
        jScrollPane1.setViewportView(tblincidencias);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setText("Empleado:");

        cbempleado.setModel(modelempleado);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setText("Departamento:");

        cbdepto.setModel(modeldepto);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setText("Periodo:");

        tbnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Agregar.png"))); // NOI18N
        tbnCrear.setText("Registrar");
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar-1.png"))); // NOI18N
        jButton1.setText("Regresar");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/simbolo.png"))); // NOI18N
        jButton2.setText("PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbdepto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tbnCrear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbnCrear1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbnCrear1)
                    .addComponent(jButton1)
                    .addComponent(tbnCrear)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(cbdepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtnumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserf1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUserf1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //exitForm(evt);
        dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void exitForm(ActionEvent evt) {
        this.dispose();
    }
        
    String idx3, recorrido,txtOrigen2,txtDestino2,txtCDrem,txtcddestino,fecha;
    String dato,dato1,dato2,dato3,dato4,dato5,dato6,dato7;
    private void tbnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrearActionPerformed
        FechaSit(); 
        if(cbempleado.getSelectedItem().toString().equals("SELECCIONE")){
            JOptionPane.showMessageDialog(null,"Indique un empleado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(cbdepto.getSelectedItem().toString().equals("SELECCIONE")){
            JOptionPane.showMessageDialog(null,"Indique el departamento.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtnumero1.getText().equals("")||txtnumero1.getText()==null || txtnumero2.getText().equals("")||txtnumero2.getText()==null){
            JOptionPane.showMessageDialog(null,"Indique el periodo a reportar.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            DefaultTableModel model=(DefaultTableModel)tblincidencias.getModel();
            dato=String.valueOf(model.getValueAt(tblincidencias.getSelectedRow(),0));
            dato1=String.valueOf(model.getValueAt(tblincidencias.getSelectedRow(),1));
            dato2=String.valueOf(model.getValueAt(tblincidencias.getSelectedRow(),2));
            dato3=String.valueOf(model.getValueAt(tblincidencias.getSelectedRow(),3));
            dato4=String.valueOf(model.getValueAt(tblincidencias.getSelectedRow(),4));
            dato5=String.valueOf(model.getValueAt(tblincidencias.getSelectedRow(),5));
            dato6=String.valueOf(model.getValueAt(tblincidencias.getSelectedRow(),6));
            dato7=String.valueOf(model.getValueAt(tblincidencias.getSelectedRow(),7));
            
//            if(dato7.length()  >= 30 && dato7.length()  <= 120 ){}{
//            JOptionPane.showMessageDialog(null,"No se han indicado observaciones.","Informativo",JOptionPane.INFORMATION_MESSAGE);
//            return;
//            }else{
//                    
//            }
            Registrar();
        }
    }//GEN-LAST:event_tbnCrearActionPerformed

    private void tbnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCrear1ActionPerformed
        txtnumero1.setText("");
        txtnumero2.setText("");
        cbempleado.setSelectedItem("SELECCIONE");
        cbdepto.setSelectedItem("SELECCIONE");
    }//GEN-LAST:event_tbnCrear1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"Revisar emision por depto");
//        Document doc=new Document();
// //       Document document = new Document(PageSize.A4.rotate());
//        try {
//            String ruta=System.getProperty("user.home");
//            PdfWriter.getInstance(doc, new FileOutputStream(ruta+"/Desktop/incidencias/incidencias.pdf"));
//            doc.open();
//            
//            Chunk chunk = new Chunk("Reporte", chapterFont);
//            //chunk.setBackground(BaseColor.GRAY);
//
//            Chapter chapter = new Chapter(new Paragraph(chunk), 1);
//            chapter.setNumberDepth(0);
//            chapter.add(new Paragraph("Subtitulo", paragraphFont));
//            // We add an image (Añadimos una imagen)
//            Image image;
//            try {
//                image = Image.getInstance(iTextExampleImage);  
//                image.setAbsolutePosition(10f, 10f);
//                image.setAlignment(Element.ALIGN_CENTER);
//                chapter.add(image);
//            } catch (BadElementException ex) {
//                System.out.println("Image BadElementException" +  ex);
//            } catch (IOException ex) {
//                System.out.println("Image IOException " +  ex);
//            }
//            doc.add(chapter);            
//            
//            Font fuente= new Font();
//            fuente.setSize(8);
//            fuente.setColor(BaseColor.DARK_GRAY);
//            fuente.setFamily(FontFamily.TIMES_ROMAN.toString());
//            
//            doc.add(new Paragraph("Reporte de incidencias", fuente));
//            doc.add( Chunk.NEWLINE );//salto de liena
//
//            Paragraph paragraphHello = new Paragraph();
//            paragraphHello.add("Departamento y Fechas de reporte");
//            paragraphHello.setAlignment(Element.ALIGN_JUSTIFIED);
//            doc.add(paragraphHello);            
//            doc.add( Chunk.NEWLINE );
//            
//            Paragraph paragraphLorem = new Paragraph();
//            paragraphLorem.add("Datos del reporte");
//            doc.add(paragraphLorem);
//            PdfPTable tbl= new PdfPTable(5);
//            tbl.addCell("AUSENTISMO");
//            tbl.addCell("TIEMPO_EXTRA");
//            tbl.addCell("OTRAS_PERCEP");
//            tbl.addCell("DESCANSO_TRABAJADO"); 
//            tbl.addCell("PRIMA_DOMINICAL");            
//            tbl.addCell("VACACIONES");
//            tbl.addCell("DIA_FESTIVO");
//            tbl.addCell("OBSERVACIONES"); 
//            tbl.addCell("NOMBRE_DE_EMPLEADOO");   
//            tbl.addCell("DIAS_LABORADOS");            
//            tbl.addCell("PERIODO_I");
//            tbl.addCell("PERIODO_F");
//            tbl.addCell("DEPTO");
//
//            //conexion a dbo
//            Connection miConexion =(Connection)ConexionEDI.GetConnection();
//            try {
//               Statement statement =(Statement)miConexion.createStatement();
//                ResultSet rs = statement.executeQuery("select * from tbl_incidencia_nom where nombre_de_empleado='"+cbempleado.getSelectedItem().toString()+"'");
//                    if(rs.next() == true){
//                        do{
//                            tbl.addCell(rs.getString(1));
//                            tbl.addCell(rs.getString(2));
//                            tbl.addCell(rs.getString(3));
//                            tbl.addCell(rs.getString(4));
//                            tbl.addCell(rs.getString(5));
//                            tbl.addCell(rs.getString(6));
//                            tbl.addCell(rs.getString(7));
//                            tbl.addCell(rs.getString(8));
//                            tbl.addCell(rs.getString(9));
//                            tbl.addCell(rs.getString(10));
//                            tbl.addCell(rs.getString(11));
//                            tbl.addCell(rs.getString(12));
//                            tbl.addCell(rs.getString(13));                            
//                        }while(rs.next());
//                        doc.add(tbl);
//                    }else {
//                        JOptionPane.showMessageDialog(null,"No hay resultados","Informativo",JOptionPane.INFORMATION_MESSAGE);
//                    }
//            } catch (SQLException ex) {
//                JOptionPane.showMessageDialog(null,"Ha ocurrido un error inesperado ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
//            }             
//            doc.close();
//            JOptionPane.showMessageDialog(null, "Reporte creado","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
//        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
//        } 
    }//GEN-LAST:event_jButton2ActionPerformed
                 
    String registro;
    public void FechaSit(){
        Date date = new Date();
    	DateFormat datefecha = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat datefecha1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        registro=datefecha1.format(date);          
    }
    
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
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    } 
    
    public void itemdepto(){
        Connection miConexion =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement =(Statement)miConexion.createStatement();
            ResultSet rs1 = statement.executeQuery(" select * from TBL_DEPTO ");
            modeldepto.addElement("SELECCIONE");
                while(rs1.next()){
                    modeldepto.addElement(rs1.getString("Departamento"));                    
                }//fin de while                
                statement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 
    }   
       
    int n1,n2,n3,n4,n5,n6,n7;
    public void Registrar(){
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String strFecha = registro.trim()+" 00:00:00.00";
            Date fechaj = null;
            try {
                fechaj = formatoDelTexto.parse(strFecha);
            } catch (ParseException ex) {
            }
            
        SimpleDateFormat fti = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String f1 =txtnumero1.getText().trim()+" 00:00:00.00";
            Date fi = null;
                try {
                    fi = formatoDelTexto.parse(f1);
                } catch (ParseException ex) {
                }
                
        SimpleDateFormat ftf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        String f2 =txtnumero2.getText().trim()+" 00:00:00.00";
            Date ff = null;
                try {
                    ff = formatoDelTexto.parse(f2);
                } catch (ParseException ex) {
                }             
        
        n1=Integer.parseInt(dato);
        n2=Integer.parseInt(dato1);
        n3=Integer.parseInt(dato2);
        n4=Integer.parseInt(dato3);
        n5=Integer.parseInt(dato4);
        n6=Integer.parseInt(dato5);
        n7=Integer.parseInt(dato6);
        
        Connection miConexionx3 =(Connection)ConexionEDI.GetConnection();
        try {
        Statement statementx3 =(Statement)miConexionx3.createStatement();
        ResultSet rx3 = statementx3.executeQuery(" select * from tbl_incidencia_nom where NOMBRE_DE_EMPLEADO='"+cbempleado.getSelectedItem().toString()+"' and  periodo_i= convert(datetime,'"+txtnumero1.getText().replaceAll("-","")+" 00:00:00.000') and  periodo_f= convert(datetime,'"+txtnumero2.getText().replaceAll("-","")+" 00:00:00.000')");
        if(rx3.next() == true){
            PreparedStatement stp=miConexionx3.prepareStatement("update tbl_incidencia_nom set FECHA_CREA=?,PERIODO_I=?,PERIODO_F=?,"
            + "AUSENTISMO='"+dato+"',TIEMPO_EXTRA='"+n2+"',OTRAS_PERCEP='"+n3+"',DESCANSO_TRABAJADO='"+n4+"',PRIMA_DOMINICAL='"+n5+"',VACACIONES='"+n6+"',DIA_FESTIVO='"+n7+"' ,DEPTO='"+cbdepto.getSelectedItem().toString().toLowerCase()+"',OBSERVACIONES='"+dato7+"',"
            + "USUARIO='"+txtUserf1.getText().toUpperCase()+"' where NOMBRE_DE_EMPLEADO='"+cbempleado.getSelectedItem().toString()+"' and  periodo_i= convert(datetime,'"+txtnumero1.getText().replaceAll("-","")+" 00:00:00.000') and  periodo_f= convert(datetime,'"+txtnumero2.getText().replaceAll("-","")+" 00:00:00.000')");
            java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
            java.sql.Timestamp timestamp2 = new java.sql.Timestamp(fi.getTime());
            java.sql.Timestamp timestamp3 = new java.sql.Timestamp(ff.getTime());
            stp.setTimestamp(1,timestamp);
            stp.setTimestamp(2,timestamp2);
            stp.setTimestamp(3,timestamp3); 
            stp.executeUpdate();
            JOptionPane.showMessageDialog(null,"Actualización correcta","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);            
        }else{
            PreparedStatement stp=miConexionx3.prepareStatement("insert into tbl_incidencia_nom (FECHA_CREA,PERIODO_I,PERIODO_F,AUSENTISMO,TIEMPO_EXTRA,OTRAS_PERCEP,DESCANSO_TRABAJADO,PRIMA_DOMINICAL,VACACIONES,DIA_FESTIVO ,OBSERVACIONES,USUARIO,NOMBRE_DE_EMPLEADO,DEPTO) values "
            + "(?,?,?,'"+n1+"','"+n2+"','"+n3+"','"+n4+"','"+n5+"','"+n6+"','"+n7+"','"+dato7+"','"+txtUserf1.getText().toUpperCase()+"','"+cbempleado.getSelectedItem().toString()+"','"+cbdepto.getSelectedItem().toString().toLowerCase()+"')"); 
            java.sql.Timestamp timestamp = new java.sql.Timestamp(fechaj.getTime());
            java.sql.Timestamp timestamp2 = new java.sql.Timestamp(fi.getTime());
            java.sql.Timestamp timestamp3 = new java.sql.Timestamp(ff.getTime());
            stp.setTimestamp(1,timestamp);
            stp.setTimestamp(2,timestamp2);
            stp.setTimestamp(3,timestamp3);                    
            stp.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registro correcto","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);          
        }
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error en la conexión, intente nuevamente. ","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        } 

    }
    //trabajar en reporte  select * from reloj_checador--codigo select * from incidencias_nom--codigoempleado
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbdepto;
    private javax.swing.JComboBox<String> cbempleado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblincidencias;
    private javax.swing.JButton tbnCrear;
    private javax.swing.JButton tbnCrear1;
    public javax.swing.JTextField txtUserf1;
    private javax.swing.JTextField txtnumero1;
    private javax.swing.JTextField txtnumero2;
    // End of variables declaration//GEN-END:variables
}


/*metodo de guardar anterior
        Connection miConexion1 =(Connection)ConexionEDI.GetConnection();
        try {
           Statement statement1 =(Statement)miConexion1.createStatement();
            ResultSet rs1 = statement1.executeQuery("select DISTINCT PUESTO,DESCRIPCION,NOMBRELARGO,codigoempleado ,codigo from [dbo].[reloj_checador] inner join  vtbl_emplados_nominas on empleado=nombrelargo where nombrelargo='"+cbempleado.getSelectedItem().toString().toUpperCase()+"' ORDER BY NOMBRELARGO ASC");
                if(rs1.next()==true){
                    String codigoempledo=rs1.getString("codigo");
                    System.out.println(""+codigoempledo);
                    SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                    String strFecha =registro;
                        Date fechaj = null;
                        try {
                            fechaj = formatoDelTexto.parse(strFecha);
                        } catch (ParseException ex) {
                        }

                    SimpleDateFormat fti = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
                    String f1 =txtnumero.getText();
                    Date fi = null;
                        try {
                            fi = formatoDelTexto.parse(strFecha);
                        } catch (ParseException ex) {
                        }   
                    
                    int codigo=Integer.parseInt(codigoempledo);
                    System.out.println("strack.From_incidencias.Guardar() "+codigo);
                        try (Connection miConexion = (Connection)ConexionEDI.GetConnection()) {
                            try {
                                PreparedStatement stp=miConexion.prepareStatement("insert into incidencias_nom (fchregistro, fchevento, codigoempleado , incidencia, Observaciones, usuario ) values "
                                + "(?,?,'"+codigo+"','"+cbincidencia.getSelectedItem().toString().toUpperCase()+"','"+txtobservacion.getText().toUpperCase()+"','"+txtUserf1.getText().toUpperCase().trim()+"')"); 
                                java.sql.Timestamp timestamp1 = new java.sql.Timestamp(fechaj.getTime());
                                java.sql.Timestamp timestamp2 = new java.sql.Timestamp(fi.getTime());
                                stp.setTimestamp(1,timestamp1);
                                stp.setTimestamp(2,timestamp2);
                                stp.executeUpdate();
                                JOptionPane.showMessageDialog(null,"Registro correcto de incidencia.","Mensaje informativo",JOptionPane.INFORMATION_MESSAGE);
                            } catch (SQLException ex) {
                                JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                }else{
                    JOptionPane.showMessageDialog(null,"No se encuentrar resultados.","Mensaje de alerta",JOptionPane.WARNING_MESSAGE);
                }                
                statement1.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error al acceder al dbo.","Mensaje de error",JOptionPane.ERROR_MESSAGE);
        }  
*/

/*boton de crear
        FechaSit(); 
        if(cbempleado.getSelectedItem().toString().equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Indique un empleado.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(cbincidencia.getSelectedItem().toString().equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Indique la incidencia a reportar.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtnumero.getText().equals("")||txtnumero.getText()==null){
            JOptionPane.showMessageDialog(null,"Indique el número de dias de la incidencia.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }if(txtobservacion.getText().equals("")||txtobservacion.getText()==null){
            JOptionPane.showMessageDialog(null,"Indique las observaciones.","Informativo",JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            if(txtnumero.getText().length() >= 10 ){                 
                StringTokenizer tokens = new StringTokenizer (txtnumero.getText(),"-");
                if(tokens.countTokens() ==3){
                String expresion ="([_0-9]+)-([_0-9]+)-([_0-9]+)";
                Pattern exp =Pattern.compile(expresion);
                Matcher mach = exp.matcher(txtnumero.getText());
                mach.find();
                if (txtobservacion.getText().replace("  ", "").length() >= 30 && txtobservacion.getText().replace("  ", "").length() <= 120 ){               
                    try {
                        Guardar();
                    } catch (SQLException ex) {
                        Logger.getLogger(From_incidencias.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"El observaciones debe contener más de 30 caracteres.","Alerta",JOptionPane.WARNING_MESSAGE);
                }        
                }else{
                   JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
                }
            }else {
                JOptionPane.showMessageDialog(null,"Formato de fecha no aceptado","Informativo",JOptionPane.INFORMATION_MESSAGE); 
            }             
        }
*/