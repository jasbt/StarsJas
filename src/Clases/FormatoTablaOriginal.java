package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatoTablaOriginal extends DefaultTableCellRenderer{
  private int columna_patron ;

    public FormatoTablaOriginal(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
    
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,4)).equals("CREADO") ||String.valueOf(table.getValueAt(row,4)).equals("AP-50")) {
            if(String.valueOf(table.getValueAt(row,7)).equals("IR")) {
                setBackground(Color.orange);                
            }
        }else if(String.valueOf(table.getValueAt(row,2)).equals("CANCELADO")) {
                setBackground(Color.RED);
        }else
        setBackground(Color.lightGray);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }
}