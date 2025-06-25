package util;
// deve contenere solo le costanti di configurazione 
// tutto questo viene fatto per avere un codice pulito e ordinato 

public class DBConfig {
	public static final String URL = "jdbc:mysql://localhost:3306/javaexercise";
	public static final String USER = "root";
	public static final String PASSWORD = "1234";
}

/*jdbc:mysql://localhost:3306/miodb
     │             │      │     └ nome del tuo database
     │             │      └ porta (3306 è standard per MySQL)
     │             └ indirizzo (localhost = PC locale)
     └ specifica che usi JDBC + MySQL*/
