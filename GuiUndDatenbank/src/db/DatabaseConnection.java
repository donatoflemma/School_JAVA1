package db;
import java.sql.*;
import util.DBConfig;


public class DatabaseConnection {
	
	public static Connection connect() {
/*Connection: è il tipo di dato restituito dal metodo. 
 * È una classe di Java che rappresenta una connessione attiva con un database.*/
		 try {
			 
		 return DriverManager.getConnection(DBConfig.URL, DBConfig.USER,DBConfig.PASSWORD);
		 /*DriverManager.getConnection(...): è un metodo di Java 
		  * che prova a stabilire una connessione con il tuo database.
		  * È come fare login su un sito: serve l’indirizzo, il nome utente e la password.*/
		 } catch (SQLException e) {
			 	e.printStackTrace();
			 	/*Questo serve per stampare l’errore completo nel terminale.
			 	 *È utile per il debugging, perché ti mostra dove si è verificato 
			 	 *l’errore e cosa lo ha causato.*/
			 	return null;
			 	/*Se la connessione fallisce, torniamo null*/
		 }
	}
}


