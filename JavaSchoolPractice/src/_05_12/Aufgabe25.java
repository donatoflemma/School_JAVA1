package _05_12;

import Prog1Tools.IOTools;

/**
 * 
 * Aufgabe 25:  
 * 
Implementieren Sie ein Java-Programm, das den Benutzer zunächst auffordert, einen 
Kleinbuchstaben einzugeben und das anschließend den entsprechenden Großbuchstaben 
auf den Bildschirm ausgibt. Für die Umwandlung ist der Einsatz einer if- oder switch
Anweisung und die explizite Verwendung von ASCII-Codes nicht erlaubt. Beispiel für einen 
Programmablauf :  
Eingabe = ‚h‘  
Ausgabe = ‚H‘ 


Vorgehensweise:

			- Definiere einzelne Methoden:
				1. Für das Einlesen (Kleinbuchstabe soll eingelesen werden) 
				2. für die Umwandlung (Kleinbuchstabe - Großbuchstabe)
			- Von der main- Methode heraus sollen dieses zwei Methoden aufgerufen werden und das
			 Ergebnis soll auf der Konsole ausgegeben werden. 
 *
 */
public class Aufgabe25 {
	private static char readSmallLetterFromConsole() {
		char smallletter = IOTools.readChar("small letter (a-z): ");
		while (smallletter > 'z' || smallletter <'a')
		{
			System.out.println("Fehlerhafte Eingabe..");
			smallletter = IOTools.readChar("small letter (a-z): ");
		}
		return smallletter;
	}
//Annhame: Parameter ist tatsächlich ein Kleinbuchstabe
	
	private static char toCapitalLetter(char smallLetter) {
		
		return (char) (smallLetter - 32);
	
	}
public static void main(String[] args) {
	
	char c = readSmallLetterFromConsole();
	
	System.out.println("Capital Letter of " + c + " = " + toCapitalLetter(c));
	
}
}
