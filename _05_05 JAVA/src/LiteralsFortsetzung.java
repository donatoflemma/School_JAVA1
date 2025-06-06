/*
 * char Literals:
 * 					Char Literals werden mit ' abgegrenzen
 * 					- Es darf genau ein Zeichen innerhalb ' und ' vorkommen und
 * 					- Erlaubte Escape Sequenzen: \b \t \n \f \r \" \' \\ 
 * 
 * boolean Litearals:
 * 					false,true 
 * 					-
 * */
public class LiteralsFortsetzung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'a'; // char si usa solo un carattere e acetta anche slo uno spazio vuoto 
		char d = ' ';
		char o = '?';
		char w = '\n'; // acetta  \n  \t
		String t= ""; // String acetta un variabile vuota !!!
		
		
		char s = '\u001E'; // A ASCII Tabelle
		System.out.println("s = " + s);
	}

}
