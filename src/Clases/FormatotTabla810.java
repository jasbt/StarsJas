package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatotTabla810 extends DefaultTableCellRenderer{
  private int columna_patron ;

    public FormatotTabla810(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,10)).equals("ACEPTADO")) {            
        } else if(String.valueOf(table.getValueAt(row,10)).equals("RECHAZADO")) {
            setBackground(Color.red);
        } else if(String.valueOf(table.getValueAt(row,10)).equals("CONCIDENCIA")) {
            setBackground(new java.awt.Color(51, 224, 255));
        } else  
        setBackground(Color.lightGray);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
 }
}

