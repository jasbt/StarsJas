package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatoTBL210 extends DefaultTableCellRenderer{
  private int columna_patron ;

    public FormatoTBL210(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
    
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,2)).equals("Cancelado")) {
            setBackground(Color.red);
        }else if(String.valueOf(table.getValueAt(row,13)).equals("IR") && String.valueOf(table.getValueAt(row,10)).equals("CREADO")) {
           setBackground(Color.ORANGE);
        }else if(String.valueOf(table.getValueAt(row,10)).equals("CREADO") || String.valueOf(table.getValueAt(row,10)).equals("REGISTRADO")) {
           //setBackground(Color.GREEN);
        }else if(String.valueOf(table.getValueAt(row,22)).equals("APLICADA") && !String.valueOf(table.getValueAt(row,10)).equals("CREADO")) {
           setBackground(new java.awt.Color(0,158,243));
            //ImageIcon img = new ImageIcon(this.getClass().getResource("C://Users//Desarrollo 1//Documents//NetBeansProjects//Edi-ST//src//Iconos//tres.png"));
        }else  
        setBackground(Color.lightGray);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
//        if(String.valueOf(table.getValueAt(row,2)).equals("Cancelado")) {
//            setBackground(Color.red);
//        }else if(String.valueOf(table.getValueAt(row,14)).equals("IR") && String.valueOf(table.getValueAt(row,11)).equals("CREADO")) {
//           setBackground(Color.ORANGE);
//        }else if(String.valueOf(table.getValueAt(row,11)).equals("CREADO") || String.valueOf(table.getValueAt(row,11)).equals("REGISTRADO")) {
//           //setBackground(Color.GREEN);
//        }else if(String.valueOf(table.getValueAt(row,23)).equals("APLICADA") && !String.valueOf(table.getValueAt(row,11)).equals("CREADO")) {
//           setBackground(new java.awt.Color(0,158,243));
//            //ImageIcon img = new ImageIcon(this.getClass().getResource("C://Users//Desarrollo 1//Documents//NetBeansProjects//Edi-ST//src//Iconos//tres.png"));
//        }else  
//        setBackground(Color.lightGray);
//        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
//        return this;
    }
}