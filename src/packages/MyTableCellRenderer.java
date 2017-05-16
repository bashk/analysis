/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packages;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Bashkimi
 */
public class MyTableCellRenderer extends DefaultTableCellRenderer
{    
    
    public MyTableCellRenderer()
    {
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	setBackground(null);
	Component tableCellRendererComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
	
	String s1 = "", s2 = "";
	try{
	    s1 = table.getValueAt(row, 0).toString();
	    s2 = table.getValueAt(row, 1).toString();
	}
	catch(NullPointerException npe){
	    if(s1 == null)
		s1 = "";
	    if(s2 == null)
		s2 = "";
	}
	if(!s1.equals(s2))
	{
	    setBackground(new Color(255, 102, 102));
	}
	else
	{
	    setBackground(new Color(153, 255, 153));
	}
	return tableCellRendererComponent;
    }
}
