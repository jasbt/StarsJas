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
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;

public class ImprimirPDF {
    private  File destino=null;
     
    public ImprimirPDF(){}
    
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
                /*mypdf.add(new Paragraph("Política contra el Consumo de Alcohol y Drogas: “Queda prohibido, el consumo, el uso, venta, posesión, distribución, fabricación, transferencia, transporte o tentativa de sustancias toxicas y alcohol. La presencia de alcohol o sustancias tóxicas en cualquier modalidad mientras se mantenga al servicio y/o se encuentre en proceso de prestar servicios a Supertrack está prohibido.” "));
                mypdf.add(new Paragraph("   CADENA DE CUSTODIA "));
                mypdf.add(new Paragraph("   Transportista: "+titulo));
                paragraph.setAlignment(Element.ALIGN_RIGHT);
                paragraph.add(new Phrase(Chunk.NEWLINE)); 
                mypdf.add(new Paragraph("   Código:"+asunto));
                mypdf.add(new Paragraph("   ")); 
                mypdf.add(new Paragraph(codigo));*/
                
                mypdf.close();                
                //JOptionPane.showMessageDialog(null, "Archivo PDF creado exitosamente");
            } catch (DocumentException | FileNotFoundException e) {
//JOptionPane.showMessageDialog(null, "Error de archivo PDF"+ Exception.class);
                
            }catch (IOException e) {
                e.printStackTrace();
	    }
        }
    } 
}
