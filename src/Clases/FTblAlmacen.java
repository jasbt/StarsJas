package Clases;
import java.awt.Color;
import java.awt.Component;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class FTblAlmacen extends DefaultTableCellRenderer{
    private int columna_patron ;
    Icon img1 = new javax.swing.ImageIcon("/Iconos/boton-de-verificacion.png");
    Icon img2 = new javax.swing.ImageIcon("/Iconos/boton-de-verificacion.png");
    Icon img3 = new javax.swing.ImageIcon("/Iconos/boton-de-verificacion.png");

    public FTblAlmacen(int Colpatron)
    {
        this.columna_patron = Colpatron;
    }
    
  @Override
    public Component getTableCellRendererComponent ( JTable table, Object value, boolean selected, boolean focused, int row, int column ){
        setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,2)).equals("0")) {            
        }else  if(String.valueOf(table.getValueAt(row,2)).equals("1")) {
               setBackground(new java.awt.Color(152,251,152));
        }else  if(String.valueOf(table.getValueAt(row,2)).equals("2")) {
                setBackground(Color.RED);
        }else
        setBackground(Color.lightGray);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
        
    }//end de component
        
    
}//end de class

/*
setBackground(Color.white);
        table.setForeground(Color.black);
        if(String.valueOf(table.getValueAt(row,2)).equals("0")) {
            if(String.valueOf(table.getValueAt(row,7)).equals("IR")) {
                setBackground(Color.orange);                
            }
        }else  if(String.valueOf(table.getValueAt(row,4)).equals("PROCESAR")) {
               setBackground(new java.awt.Color(152,251,152));
        }else  if(String.valueOf(table.getValueAt(row,2)).equals("CANCELADO")) {
                setBackground(Color.RED);
        }else
        setBackground(Color.lightGray);
        super.getTableCellRendererComponent(table, value, selected, focused, row, column);
        return this;
*/