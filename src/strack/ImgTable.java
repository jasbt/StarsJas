//https://www.youtube.com/watch?v=oLksi_fsRHo
package strack;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author acer
 */
public class ImgTable extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, 
            boolean bln, boolean bl1, int i, int i1) {
        if(o instanceof JLabel){
            JLabel lbl=(JLabel)o;
            return lbl;
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bl1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
}