package gui;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;
import db.DatabaseConnection;
import db.EmployeeDAO;
import db.EmployeeDAO.DoubleArrayTable;
import model.Button;
import model.Checkb;
import model.Field;

public class EmployeeTablePanel extends JPanel{
	final private Field imputUser = new Field("enter name or 'all'" ,10,80,565,30);//30
	final private Button search = new Button("rsc",523,120,50,30,7);//70
	final private Button back = new Button("back",20,20,50,30,1);//20,30// 15, 70
	/*JTable(): A table is created with empty cells.
      JTable(int rows, int cols): Creates a table of size rows * cols.
      JTable(Object[][] data, Object []Column): A table is created with 
      the specified name where
      []Column defines the column names.*/
	private JTable employeeTable;
	private JScrollPane scroll = new JScrollPane();
	private int counterArrayPlace;
	final private Checkb all = new Checkb(10,120,50,30,"all");//70
	final private Checkb name = new Checkb(60,120,70,30,"name");//70
	final private Checkb lastName = new Checkb(130,120,80,30,"last name");//70
	final private Checkb id_em = new Checkb(220,120,40,30,"id");//70
	final private Checkb workType = new Checkb(270,120,80,30,"work type");//70
	final private Checkb vacation = new Checkb(360,120,80,30,"vacation");//70
	final private Checkb wage = new Checkb(440,120,70,30,"wage");//70
	//private List <String> checkb = new ArrayList<>();
	
	

	
	
	
	public EmployeeTablePanel() {
		this.employeeTable = employeeTable;
		this.scroll = scroll;
		setLayout(null); // permette il posizionamento libero
		add(imputUser);
		add(search);
		add(back);
		add (scroll);
		scroll.setBounds(10, 170, 565, 280);   //x = lato sinistro  y = lato superiore  width   height 
		scroll.setBorder(null);
		this.setName("Table");// mi serve per il case 6 del Button per fare distinzione 
	    add(all);
	    add(name);
	    add(lastName);
	    add(id_em);
	    add(workType);
	    add(vacation);
	    add(wage);
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


/*– JScrollPane(): crea un nuovo JScrollPane con barre orizzontali e verticali
visibili solo se necessario
– JScrollPane(int vsb, int hsb): imposta i parametri per la visualizzazione
delle barre orizzontali e verticali
– JScrollPane(Component c): visualizza il componente specificato
– JScrollPane(Component c, int vsb, int hsb): visualizza il componente
specificato impostando i parametri per la visualizzazione delle barre
orizzontali e verticali*/
 
	public Checkb getAll() {
		return all;
	}

	public Checkb getNameCh() {
		return name;
	}

	public Checkb getLastNameCh() {
		return lastName;
	}

	public Checkb getIdCh() {
		return id_em;
	}

	public Checkb getWorkTypeCh() {
		return workType;
	}

	public Checkb getVacationCh() {
		return vacation;
	}

	public Checkb getWageCh() {
		return wage;
	}
	// da finire con la lista !!!
	public List getSelect() {
		List <String> checkb = new ArrayList<>();
		String[] nameCheckb = {"name","lastName","id_em","workType","vacation","wage"};
		if (all.isSelected()) {
			checkb.add("all");
		}
		else {
			
		}
		return checkb;
		}
	
}
	
 
	  
