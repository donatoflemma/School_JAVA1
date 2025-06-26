package gui;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import model.Employee;

public class Table extends JTable{
	// dichiariamo un String Array per i nomi delle colonne 
	
	private Employee [][] data = {};
	
	public Table (Employee u) {
		
		JScrollPane scrollPane = new JScrollPane(this);
		this.setFillsViewportHeight(true);
		
/*The JScrollPane constructor is invoked with an argument that refers to the table object.
 *  This creates a scroll pane as a container for the table; the table is automatically added to the container.
    JTable.setFillsViewportHeight is invoked to set the fillsViewportHeight property. When this property is 
    true the table uses the entire height of the container, even if the table doesn't have enough rows to 
    use the whole vertical space. This makes it easier to use the table as a drag-and-drop target.
*/
	}
	
}
