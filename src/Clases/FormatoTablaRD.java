package Clases;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatoTablaRD extends DefaultTableCellRenderer{
  private int columna_patron ;

    public FormatoTablaRD(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
    
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,20)).equals("REGISTRADO")) {
            setBackground(Color.white);  
        }else  if(String.valueOf(table.getValueAt(row,9)).equals("CANCELACION VENTANA") || String.valueOf(table.getValueAt(row,9)).equals("RETIRO DE UNIDAD")) {
            setBackground(new java.awt.Color(51, 224, 255));
        }else  if(String.valueOf(table.getValueAt(row,1)).equals("CANCELADO")) {
            setBackground(Color.RED);
        }else  if(String.valueOf(table.getValueAt(row,12)).equals("CANCELADO")) {
            setBackground(Color.orange);
        }else
        setBackground(Color.lightGray);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
    }
}