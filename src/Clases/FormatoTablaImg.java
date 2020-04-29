package Clases;

import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatoTablaImg extends DefaultTableCellRenderer{
  private int columna_patron ;
    Icon img = new javax.swing.ImageIcon("Icono\\Nuevo.png");
    Icon img2 = new javax.swing.ImageIcon("Icono\\buscar.png");

    public FormatoTablaImg(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,1)).equals("1")) {
            imageUpdate((Image) img, column, row, row, row, row);
            
        }    
        else  
        setBackground(Color.red);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
 }
}