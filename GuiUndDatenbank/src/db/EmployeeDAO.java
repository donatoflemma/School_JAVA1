package db;
import java.sql.*;
import db.DatabaseConnection;
import model.Employee; 

public class EmployeeDAO {
	final private Connection conn = DatabaseConnection.connect();
	/*variabile Connection  in cui richiamo il metodo per fare la connesione col Database*/
	
	
	public  void Insert(Employee n) {
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
	
	public  void delte(Employee n) {
		if (conn != null) {
		try {String Sql = "DELETE FROM employee WHERE name = ? and lastName = ?;";
		PreparedStatement stmt = conn.prepareStatement(Sql);
		stmt.setString(1,n.getName());
		stmt.setString(2,n.getLastName() );
		stmt.executeUpdate();
		
		System.out.println("Data successfully deleted");
		conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		}}
	
	public void update(Employee n) {
		if (conn != null) {
		try {String Sql = "UPDATE employee\r\n"
						+ "SET workType = ?, vacation = ?, wage = ?\r\n"
						+ "WHERE name = ?; ";
		PreparedStatement stmt = conn.prepareStatement(Sql);
		stmt.setString(1,n.getWorkType());
		stmt.setInt(2,n.getVacation());
		stmt.setInt(3,n.getWage());
		stmt.setString(4,n.getName());
		stmt.executeUpdate();
		
		/*Be careful when updating records in a table! Notice the WHERE clause 
		 *in the UPDATE statement. The WHERE clause specifies which record(s) 
		 *that should be updated. If you omit the WHERE clause, all records in 
		 *the table will be updated!
		 *
		 *MUSTER:
		 *
		 *UPDATE Customers
		  SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
          WHERE CustomerID = 1;
          
         *
         *UPDATE Customers
          SET ContactName='Juan'
          WHERE Country='Mexico';*/
		System.out.println("Update complete");
		conn.close();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}}
	
}

