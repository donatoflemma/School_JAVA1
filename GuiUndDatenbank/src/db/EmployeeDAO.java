package db;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import db.DatabaseConnection;
import model.Employee; 

public class EmployeeDAO {
	//Connection conn = DatabaseConnection.connect();
	/*variabile Connection  in cui richiamo il metodo per fare la connesione col Database*/
	
	//DoubleArrayTable sqlData = null; // la devo dichiarare prima del try se no mi da errore perche la esco con return 
	
	// mi serve per il return di table
	public static class DoubleArrayTable {
	    private String[][] objTable;
	    private final String[] columnNames = {"Name", "Last Name", "ID_em", "Work Type", "Vacation", "Wage"};

	    DoubleArrayTable(String[][] objTable) {
	        this.objTable = objTable;
	    }

	    public String[][] getObjTable() {
	        return objTable;
	    }

	    public String[] getColumnNames() {
	        return columnNames;
	    }
	}
	
	
	
	public  void Insert(Employee n) {
		Connection conn = DatabaseConnection.connect();
		if (conn != null) {
		try {
			
		String sql = "INSERT INTO employee (name,lastName,id_em,workType,vacation,wage) VALUES (?,?,?,?,?,?)";
		/* I ? sono segnaposto: verranno sostituiti dai veri valori più avanti.
			Questo evita problemi di SQL injection ed è più sicuro.*/
		PreparedStatement stmt = conn.prepareStatement(sql);//Chiede a conn (l’oggetto Connection) di preparare la query.
		//Usa PreparedStatement per tutto: è sicuro, flessibile, pulito.
		stmt.setString(1,n.getName());// index della formattazione e valore 
		stmt.setString(2,n.getLastName());
		stmt.setString(3,n.getId_em());
		stmt.setString(4,n.getWorkType());
		stmt.setInt(5,n.getVacation()); // fare caso al cambio metodo per l´int !!!!
		stmt.setInt(6,n.getWage());
		
		stmt.executeUpdate();//Esegue la query di modifica (INSERT, UPDATE, DELETE).
		// tutti metodi della classe PreparedStatement
		System.out.println("Data successfully entered.");
		conn.close();//Chiude la connessione al database -è un metodo della classe Connection
		}
		
		catch (SQLException e) {
		e.printStackTrace();
		}
	}
}
	
	
	
	public  void delete(String fieldName,String fieldId_em) {
		Connection conn = DatabaseConnection.connect();
		if (conn != null) {
		try {String Sql = "DELETE FROM employee WHERE name = ? and id_em = ?;";
		PreparedStatement stmt = conn.prepareStatement(Sql);
		stmt.setString(1,fieldName);
		stmt.setString(2,fieldId_em );
		stmt.executeUpdate();
		
		System.out.println("Employee successfully deleted");
		conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		}}
	
	
	
	
	public void update(String  workType, Integer vacation, Integer wage,String name, String Id_em) {
		Connection conn = DatabaseConnection.connect();
		List<String> fields = new ArrayList<>();
		List<Object> values = new ArrayList<>();
		int counterValues = 1;
		if(!"workType".equals(workType)) {
			fields.add("workType = ?");
			values.add(workType);
		}
		if(!"vacation".equals(vacation)) {
			fields.add("vacation = ?");
			values.add(vacation);
		}
		if(!"wage".equals(wage)) {
			fields.add("wage = ?");
			values.add(wage);
		}
		try {//
			if (values.size() > 0 && conn != null) {
				String sql = "UPDATE employee SET " + String.join(", ", fields) + " WHERE name = ? and Id_em = ? ;";
				PreparedStatement stmt = conn.prepareStatement(sql);
				for (int i = 0; i < values.size(); i++) {
					Object val = values.get(i);
					if(values.get(i) instanceof String) {// instanceof serve per fare il comfronto del type Object
						stmt.setString(counterValues,(String)val);
						counterValues++;}
					else if (val instanceof Integer ) {
						stmt.setInt(counterValues, (Integer)val);
						counterValues ++;
					}
					
		        }
				stmt.setString(values.size()+1, name);
				stmt.setString(values.size()+2, Id_em);
				stmt.executeUpdate();
				System.out.println("Update complete");
				conn.close();//Marco	Bianchi	M045678	carpenter	8	1500
			}}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	public DoubleArrayTable Table(String lookingFor) {//String classPane,
		Connection conn = DatabaseConnection.connect();
		int  counterArrayPlace = 0;
		DoubleArrayTable sqlData = null; // la devo dichiarare prima del try se no mi da errore perche la esco con return 
		//System.out.println("classPane: " + classPane +  "    lookingFor: " + lookingFor );
		if(conn != null) {
			
			try {
				ResultSet rs ; // mi serve una variabile locale per salvare qullo che succede nella if
				ResultSet countRS;
				Statement stmt1 ;
				Statement stmt2 ;
				PreparedStatement stmt3;
				PreparedStatement stmt4;
				if (lookingFor.equalsIgnoreCase("all") ) { //&&"EmployeeTablePanel".equals(classPane) 
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
				//counterArrayPlace = 0;
				
				while (rs.next()) {
					objTable [counterArrayPlace][0] = rs.getString("name");
					objTable [counterArrayPlace][1] = rs.getString("lastName");
					objTable [counterArrayPlace][2] = rs.getString("id_em");
					objTable [counterArrayPlace][3] = rs.getString("workType");
					objTable [counterArrayPlace][4] = rs.getString("vacation");
					objTable [counterArrayPlace][5] = rs.getString("wage") ;
					counterArrayPlace ++;// mi serve per inserire in ordine tutti i dati
					}
			sqlData = new DoubleArrayTable(objTable);
			rs = null;  // mi serve una variabile locale per salvare qullo che succede nella if
			countRS = null;
			stmt1 = null;
			stmt2 = null;
			stmt3 = null;
			stmt4 = null;
			conn.close();
			
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
		}
	
		return sqlData;
	}
	
	
	
	
	
	//Overloading  per Delet che acetta due parametri 
	public DoubleArrayTable Table(String fieldName,String fieldId_em) {//String classPane,
		Connection conn = DatabaseConnection.connect();
		int  counterArrayPlace = 0;
		DoubleArrayTable sqlData = null; // la devo dichiarare prima del try se no mi da errore perche la esco con return 
		//System.out.println("classPane: " + classPane +  "    lookingFor: " + fieldName );
		if(conn != null) {
			try {
				ResultSet rs ; // mi serve una variabile locale per salvare qullo che succede nella if
				ResultSet countRS;
				Statement stmt1 ;
				Statement stmt2 ;
				PreparedStatement stmt3;
				PreparedStatement stmt4;
				String sql = "SELECT * FROM employee Where name = ? and id_em = ?;";
				stmt3 = conn.prepareStatement(sql);// se devo inserire qualcosa nella Query
				stmt3.setString(1, fieldName);
				stmt3.setString(2, fieldId_em);
				rs = stmt3.executeQuery();// non passa niente perche PrepareStatement prepara tutto
						
				String sqlCount = "SELECT COUNT(*) FROM employee Where name = ? and id_em = ?;";
				stmt4 = conn.prepareStatement(sqlCount);
				stmt4.setString(1, fieldName);
				stmt4.setString(2, fieldId_em);
				countRS = stmt4.executeQuery();
				countRS.next(); // a quanto pare lo devo fare per forza per poter passare alla colonna dove sta il numero !!!
				int NumberObj = countRS.getInt("COUNT(*)"); // cosi so quante persone sono contenute nella ricerca
				
				String[][] objTable = new String [NumberObj][6];// Array con [N. ogetti][Quante colonne ci sono in ogni ogetto ]
				//counterArrayPlace = 0;
				
				while (rs.next()) {
					objTable [counterArrayPlace][0] = rs.getString("name");
					objTable [counterArrayPlace][1] = rs.getString("lastName");
					objTable [counterArrayPlace][2] = rs.getString("id_em");
					objTable [counterArrayPlace][3] = rs.getString("workType");
					objTable [counterArrayPlace][4] = rs.getString("vacation");
					objTable [counterArrayPlace][5] = rs.getString("wage") ;
					counterArrayPlace ++;// mi serve per inserire in ordine tutti i dati
					}
			sqlData = new DoubleArrayTable(objTable);
			rs = null;  // mi serve una variabile locale per salvare qullo che succede nella if
			countRS = null;
			stmt1 = null;
			stmt2 = null;
			stmt3 = null;
			stmt4 = null;
			conn.close();
			
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
		}
	
		return sqlData;
	}
	
}


















