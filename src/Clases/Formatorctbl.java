package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Formatorctbl extends DefaultTableCellRenderer{
  private int columna_patron ;

    public Formatorctbl(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
    
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,2)).equals("INACTIVO")) {
            setBackground(new java.awt.Color(247,174,162));
        }else  
        setBackground(Color.WHITE);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }
}