/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimientos;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author MR-BM
 */
public class ColorearFilas extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        
        super.getTableCellRendererComponent(table, value,  isSelected, hasFocus, row, column);
        
//        setBackground(Color.red);
        if(table.getValueAt(row, 5).toString().equals("Pendiente")){
            setBackground(Color.yellow);
        }else if (table.getValueAt(row, 5).toString().equals("Cancelado")) {
            setBackground(Color.red);
        }else if (table.getValueAt(row, 5).toString().equals("Atendido")) {
            setBackground(Color.green);
        }else{
            setBackground(Color.GRAY);
        }
        
        return this;
    }
    
    
}
