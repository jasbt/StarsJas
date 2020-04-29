package Clases;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

public class PDFPlantilla {
    private  File destino=null;
     
    public PDFPlantilla(){}
    
    public void Destino(){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("archivo pdf", "pdf","edi");
        JFileChooser fileChooser=new JFileChooser();
        fileChooser.setFileFilter(filter);
        int resultado =fileChooser.showSaveDialog(null);
        if(resultado == JFileChooser.APPROVE_OPTION){
            this.destino =fileChooser.getSelectedFile().getAbsoluteFile();
        }
    }
    
    public void Generar(String titulo, String asunto, String codigo) throws BadElementException, IOException{
        Destino();
        if(this.destino !=null){
            try {   
                com.itextpdf.text.Document mypdf = new com.itextpdf.text.Document(PageSize.A4, 35,30,50,50);
                PdfWriter.getInstance(mypdf, new FileOutputStream(this.destino + ".pdf"));
                mypdf.open();
                Paragraph paragraph = new Paragraph();  
                Font font1 = new Font();
                font1.setSize(16);
                font1.setColor(7,7,8);
                mypdf.addKeywords(codigo);
                Image imagen = Image.getInstance("C://IconosStrack//Logo ST.png"); 
                mypdf.add(imagen);
                mypdf.add(new Paragraph("FORMATO CADENA DE CUSTODIA ",font1));
                paragraph.setAlignment(Element.ALIGN_CENTER);
                mypdf.add(new Paragraph("Política contra el Consumo de Alcohol y Drogas: “Queda prohibido, el consumo, el uso, venta, posesión, distribución, fabricación, transferencia, transporte o tentativa de sustancias toxicas y alcohol. La presencia de alcohol o sustancias tóxicas en cualquier modalidad mientras se mantenga al servicio y/o se encuentre en proceso de prestar servicios a Supertrack está prohibido.” "));
                mypdf.add(new Paragraph("   CADENA DE CUSTODIA "));
                mypdf.add(new Paragraph("   Transportista: "+titulo));
                paragraph.setAlignment(Element.ALIGN_RIGHT);
                paragraph.add(new Phrase(Chunk.NEWLINE)); 
                mypdf.add(new Paragraph("   Código:"+asunto));
                mypdf.add(new Paragraph("   ")); mypdf.add(new Paragraph(codigo));
                String parrafo1="   ";
                mypdf.add(new Paragraph(parrafo1));
                
                mypdf.add(new Paragraph("Tabla informativa"));
                paragraph.add(new Phrase(Chunk.NEWLINE));  
                mypdf.add(new Paragraph("   "));
                PdfPTable tabla=new PdfPTable(3);
                PdfPCell Image = null;
                tabla.addCell(imagen);
                tabla.addCell("CELDA 2");
                tabla.addCell("CELDA 3");
                tabla.addCell("1 celda");
                tabla.addCell("2 celda");
                tabla.addCell(asunto);
                mypdf.add(tabla);
                mypdf.add(new Paragraph("fin de tabla "));
                /*
                Image imagen1 = Image.getInstance("C://IconosStrack//Logo ST.png"); 
                mypdf.add(imagen1);*/
                
                mypdf.close();
                JOptionPane.showMessageDialog(null, "Archivo PDF creado exitosamente");
            } catch (DocumentException | FileNotFoundException e) {
            }
        }
    } 
}
