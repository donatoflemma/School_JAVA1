package gui;
import java.sql.*;
import java.util.Arrays;
import javax.swing.*;
import db.DatabaseConnection;
import model.Button;
import model.Field;

public class EmployeeTablePanel extends JPanel{
	final private Field imputUser = new Field("enter name or 'all'" ,10,30,565,30);
	final private Button search = new Button("rsc",520,70,50,30,6);
	final private Button back = new Button("back",15,70,50,30,1);
	/*JTable(): A table is created with empty cells.
    
    JTable(int rows, int cols): Creates a table of size rows * cols.
    
    JTable(Object[][] data, Object []Column): A table is created with 
    the specified name where
    []Column defines the column names.*/
	private JTable employeeTable;
	private JScrollPane scroll = new JScrollPane();

	
	final private String[] columnNames = {"Name","Last Name","ID_em","Work Type","Vacation","Wage"};
	
	private int counterArrayPlace;
	
	public EmployeeTablePanel() {
		setLayout(null); // permette il posizionamento libero
		add(imputUser);
		add(search);
		add(back);
		add (scroll);
		scroll.setBounds(10, 150, 565, 250);   //x = lato sinistro  y = lato superiore  width   height 
		scroll.setBorder(null);
										
	}
	
	public String  getText() {
		String output =imputUser.getText();
		return output ;
		
	}
	
	
	public void Table(String lookingFor) {
		Connection conn = DatabaseConnection.connect();
		if (conn != null) {
			try {/////////// DA FINIRE!!!!!!!!!!!!!!!!
				ResultSet rs ; // mi serve una variabile locale per salvare qullo che succede nella if
				ResultSet countRS;
				Statement stmt1 ;
				Statement stmt2 ;
				PreparedStatement stmt3;
				PreparedStatement stmt4;
				
				if (lookingFor.equals("all")) {
					String sql = "SELECT * FROM employee;";
					stmt1 = conn.createStatement();// se non devo passare niente nella Query
					rs = stmt1.executeQuery(sql);
					
					String sqlCount = "SELECT COUNT(*) FROM employee;";
					stmt2 = conn.createStatement();
					countRS = stmt2.executeQuery(sqlCount);
					
					}
				else {
					String sql = "SELECT * FROM employee Where name = ?;";
					stmt3 = conn.prepareStatement(sql);// se devo inserire qualcosa nella Query
					stmt3.setString(1, lookingFor);
					rs = stmt3.executeQuery();// non passa niente perche PrepareStatement prepara tutto
					
					String sqlCount = "SELECT COUNT(*) FROM employee Where name = ?;";
					stmt4 = conn.prepareStatement(sqlCount);
					stmt4.setString(1, lookingFor);
					countRS = stmt4.executeQuery();
					}
				countRS.next(); // a quanto pare lo devo fare per forza per poter passare alla colonna dove sta il numero !!!
				int NumberObj = countRS.getInt("COUNT(*)"); // cosi so quante persone sono contenute nella ricerca 
				String[][] objTable = new String [NumberObj][6];// Array con [N. ogetti][Quante colonne ci sono in ogni ogetto ]
				counterArrayPlace = 0;
			while (rs.next()) {
				
				
				objTable [counterArrayPlace][0] = rs.getString("name");
				objTable [counterArrayPlace][1] = rs.getString("lastName");
				objTable [counterArrayPlace][2] = rs.getString("id_em");
				objTable [counterArrayPlace][3] = rs.getString("workType");
				objTable [counterArrayPlace][4] = rs.getString("vacation");
				objTable [counterArrayPlace][5] = rs.getString("wage") ;
				
				counterArrayPlace ++;// mi serve per inserire in ordine tutti i dati
			
			}
			employeeTable =new JTable(objTable, columnNames);
			
//			 scroll = new JScrollPane(table);
			scroll.setViewportView(null);// prima la pulisco in quanto é stata dichiarata fuori quindi 
										// in questo modo la svuoto 
			 scroll.setViewportView(employeeTable);
			 //add(scroll);
		
			
			System.out.println(Arrays.deepToString(objTable));
			conn.close();
//			revalidate();  // 🔄 aggiorna il layout
			repaint();
			} catch (SQLException e) {
			}
		}
	//return table;
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

	  
