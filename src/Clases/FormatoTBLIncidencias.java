package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatoTBLIncidencias extends DefaultTableCellRenderer{
  private int columna_patron ;

    public FormatoTBLIncidencias(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
    
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,2)).equals("ABIERTO") ) {            
                setBackground(new java.awt.Color(214, 234, 248));               
        }else  if(String.valueOf(table.getValueAt(row,2)).equals("CANCELADO")) {
                setBackground(new java.awt.Color(245, 183, 177)); 
        }else
        setBackground(Color.white);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }
}