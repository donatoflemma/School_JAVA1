package gui;
import java.sql.*;
import java.util.Arrays;
import javax.swing.*;
import db.DatabaseConnection;
import db.EmployeeDAO;
import db.EmployeeDAO.DoubleArrayTable;
import model.Button;
import model.Field;

public class EmployeeTablePanel extends JPanel{
	final private Field imputUser = new Field("enter name or 'all'" ,10,30,565,30);
	final private Button search = new Button("rsc",520,70,50,30,7);
	final private Button back = new Button("back",15,70,50,30,1);
	/*JTable(): A table is created with empty cells.
    
    JTable(int rows, int cols): Creates a table of size rows * cols.
    
    JTable(Object[][] data, Object []Column): A table is created with 
    the specified name where
    []Column defines the column names.*/
	private JTable employeeTable;
	private JScrollPane scroll = new JScrollPane();
	private int counterArrayPlace;
	

	
	
	
	public EmployeeTablePanel() {
		this.employeeTable = employeeTable;
		this.scroll = scroll;
		setLayout(null); // permette il posizionamento libero
		add(imputUser);
		add(search);
		add(back);
		add (scroll);
		scroll.setBounds(10, 150, 565, 250);   //x = lato sinistro  y = lato superiore  width   height 
		scroll.setBorder(null);
		this.setName("Table");// mi serve per il case 6 del Button per fare distinzione 
										
	}
	
	public String  getImputUser() {
		String output =imputUser.getText();
		return output ;
		
	}
	

	public void Table(DoubleArrayTable sqlData ) {
		//employeeTable = new JTable(objTable,columnNames);
		employeeTable = new JTable(sqlData.getObjTable(),sqlData.getColumnNames());
		scroll.setViewportView(null);
		scroll.setViewportView(employeeTable);
		System.out.println(Arrays.deepToString(sqlData.getObjTable()));
		repaint();
	}
}

/*– JScrollPane(): crea un nuovo JScrollPane con barre orizzontali e verticali
visibili solo se necessario
– JScrollPane(int vsb, int hsb): imposta i parametri per la visualizzazione
delle barre orizzontali e verticali
– JScrollPane(Component c): visualizza il componente specificato
– JScrollPane(Component c, int vsb, int hsb): visualizza il componente
specificato impostando i parametri per la visualizzazione delle barre
orizzontali e verticali*/

	  
