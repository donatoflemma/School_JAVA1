package db;
import java.sql.*;

import model.User;


// da continuare 

public  class UserDAO {
	
	public boolean  Login(User u) {
		Connection conn = DatabaseConnection.connect();
		// classe Connection
		if (conn != null) {
		try {
		// mi da una risposta se esiste stampa 1 se no 0	
		String sql = "SELECT EXISTS(SELECT 1 FROM user WHERE name = ? AND password = ?);";
		PreparedStatement stmt = conn.prepareStatement(sql);//Chiede a conn (l’oggetto Connection) di preparare la query
		stmt.setString(1,u.getName());
		stmt.setString(2,u.getPassword());
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			boolean result = rs.getInt(1) == 1 ;  /*//rs.getInt(1) == 1 ;*/
			conn.close();
			return result;
			
		}
		}
		catch (SQLException e) {
		e.printStackTrace();
		}
		
	}

	return false;
}
}

/*                               ATTENZIONE
 * PreparedStatement stmt = conn.prepareStatement(sql); SICURA CONTRO SQLinjection
 * ResultSet rs = stmt.executeQuery();  NON SI USA INSERIRE PARAMETRI
 * 
 * Statement stmt = conn.createStatement();  PERICOLOSA - SOLO PER AUTOMAZIONI INTERNE
 * ResultSet rs = stmt.executeQuery(sql);  SI USA INSERIRE PARAMETRI
 * sql che vedi é la stringa della Query !!
 * 
 * 
 * /*ResultSet è come un cursore (puntatore) 
 * che inizia prima della prima riga dei risultati.
   Devi chiamare rs.next() per spostarti alla prima riga effettiva.
   Se non chiami rs.next(), non sei su nessuna riga valida → leggere dati fallisce.*/
		//System.out.println("ID: " + rs.getInt("id"));
		//System.out.println("Nome: " + rs.getString("nome"));
		//System.out.println("Email: " + rs.getString("email"));
//in pratica rs.next() passa da riga in riga e questa if ritorna true se esiste una riga con i dati dentro 
//non capisco perche non é while , in quanto dovrebbe essere un loop !!
 








  

