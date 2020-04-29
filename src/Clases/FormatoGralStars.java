package Clases;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FormatoGralStars extends DefaultTableCellRenderer{
  private int columna_patron ;

    public FormatoGralStars(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column )
    {        
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,12)).equals("x") ) {
            setBackground(new java.awt.Color( 212, 230, 241));
            
            if(String.valueOf(table.getValueAt(row,13)).equals("x") ) {
            setBackground(new java.awt.Color(174, 214, 241));  
            }
            if(String.valueOf(table.getValueAt(row,14)).equals("x") ) {
            setBackground(new java.awt.Color(127, 179, 213));  
            }
            if(String.valueOf(table.getValueAt(row,15)).equals("x")) {
            setBackground(new java.awt.Color(237, 187, 153));  
            }
        }else if(String.valueOf(table.getValueAt(row,15)).equals("x")) {
            setBackground(new java.awt.Color(237, 187, 153));  
            }
        else
            setBackground(new java.awt.Color(244, 246, 246));           
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            return this;
    }
}