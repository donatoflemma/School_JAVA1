package db;
import java.sql.*;

import model.User;


// da continuare 

public class UserDAO {
	
	public void  Login(User u) {
		Connection conn = DatabaseConnection.connect();
		if (conn != null) {
		try {
		// mi da una risposta se esiste stampa 1 se non 0	
		String sql = "SELECT EXISTS(SELECT 1 FROM user WHERE name = ? AND password = ?);";
		/*String sql = "SELECT password FROM user WHERE name = ?";*/
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		PreparedStatement stmt = conn.prepareStatement(sql);//Chiede a conn (l’oggetto Connection) di preparare la query
		
		
		
		
		/*
		while (rs.next()) {
		System.out.println("ID: " + rs.getInt("id"));
		System.out.println("Nome: " + rs.getString("nome"));
		System.out.println("Email: " + rs.getString("email"));
		
		SELECT * FROM user ;
SELECT password FROM user WHERE name = 'Anna' ;
SELECT EXISTS (
    SELECT 1 FROM user WHERE name = 'Anna');
		}*/
		conn.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
	}
	}
}




/*String sql = "SELECT * FROM user WHERE name = 'Anna'";
ResultSet rs = stmt.executeQuery(sql);

while (rs.next()) {
    String password = rs.getString("password");
    System.out.println("Password trovata: " + password);
}

*Nel ciclo while(rs.next()) ti muovi riga per riga nel risultato, e puoi estrarre i dati delle colonne con metodi come:

    getString("colonna")

    getInt("colonna")

    getBoolean("colonna")

    ecc...
*/
