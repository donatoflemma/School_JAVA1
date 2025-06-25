package db;
import java.sql.*;

import model.User;


// da continuare 

public  class UserDAO {
	
	public boolean  Login(User u) {
		Connection conn = DatabaseConnection.connect();
		if (conn != null) {
		try {
		// mi da una risposta se esiste stampa 1 se non 0	
		String sql = "SELECT EXISTS(SELECT 1 FROM user WHERE name = ? AND password = ?);";
		PreparedStatement stmt = conn.prepareStatement(sql);//Chiede a conn (l’oggetto Connection) di preparare la query
		stmt.setString(1,u.getName());
		stmt.setString(2,u.getPassword());
		
		ResultSet rs = stmt.executeQuery();
		
		if (rs.next()) {
			boolean result = rs.getInt(1) == 1 ;// da capire meglio
/*ResultSet è come un cursore (puntatore) 
 * che inizia prima della prima riga dei risultati.
Devi chiamare rs.next() per spostarti alla prima riga effettiva.
Se non chiami rs.next(), non sei su nessuna riga valida → leggere dati fallisce.*/
		//System.out.println("ID: " + rs.getInt("id"));
		//System.out.println("Nome: " + rs.getString("nome"));
		//System.out.println("Email: " + rs.getString("email"));
			conn.close();
			return result;
		}
	}
			
		catch (SQLException e) {
		e.printStackTrace();
		return false;
		}
	}
		return false; // se conn é falso
}
}

/*                               ATTENZIONE
 * PreparedStatement stmt = conn.prepareStatement(sql); SICURA CONTRO SQLinjection
 * ResultSet rs = stmt.executeQuery();  NON SI USA INSERIRE PARAMETRI
 * 
 * Statement stmt = conn.createStatement();  PERICOLOSA - SOLO PER AUTOMAZIONI INTERNE
 * ResultSet rs = stmt.executeQuery(sql);  SI USA INSERIRE PARAMETRI
 * sql che vedi é la stringa della Query !!
 * */



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
    
    
    /*SELECT * FROM user ;
SELECT password FROM user WHERE name = 'Anna' ;
SELECT EXISTS (
    SELECT 1 FROM user WHERE name = 'Anna');
		*/

/*package db;

import java.sql.*;
import model.User;

public class UserDAO {

    public boolean Login(User u) {
        Connection conn = DatabaseConnection.connect();

        if (conn != null) {
            try {
                String sql = "SELECT EXISTS(SELECT 1 FROM user WHERE name = ? AND password = ?);";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, u.getName());
                stmt.setString(2, u.getPassword());

                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    boolean result = rs.getInt(1) == 1; // ✅ corretto confronto
                    conn.close();
                    return result;
                } else {
                    conn.close();
                    return false; // ✅ se nessuna riga trovata
                }

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }

        return false; // ✅ se conn è null
    }
}*/