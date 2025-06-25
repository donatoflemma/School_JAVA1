package db;
import java.sql.*;
import db.DatabaseConnection;
import model.Employee; 

public class EmployeeDAO {
	
	public  void Insert(Employee n) {
		Connection conn = DatabaseConnection.connect();
		/*variabile Connection  in cui richiamo il metodo per fare la connesione col Database*/
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
		System.out.println("Dati inseriti con successo.");
		
		conn.close();//Chiude la connessione al database -è un metodo della classe Connection
		}
		
		catch (SQLException e) {
		e.printStackTrace();
		}
	}
	}
}

