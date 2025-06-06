/*
 * 
 * Variable = Behälter
 * 
 * Was hat eine Variable in Java ?
 * 			1. Name (Bezeichnung)
 * 			2. DatenType
 * 			3. Speicheradresse und iene Speicherbedarf
 * 			4. Wert bzw Inhalt
 * 
 *  Der Name (1) und der DatenType (2) werden festgelegt durch die Variable Deklaration.
 *  
 *  Name:
 *  	- Rules:
 *  			- kewords sind reserviert
 *  			- Wort bestehend aus : _, Alphabets (klein und Groß), Ziffer und Währungszeichen
 *  			- Nicht mit Ziffer beginnen
 *  
 *  
 *  
 *  	- Conventions (Empfehlung) , Oracle empfehlt:
 *  
 *  				- Kurz und aussagekräftig
 *  				- camelCase
 *  Beispiel:
 *  		anzahl_von_stunden
 *  		anzahlVonStunden
 *  
 *  Datetyp:
 *  		- wähle geeignetere  Datentyp
 *  		  
 *  			int anzahl den studenten 
 *  			long anzahl der millisekunden , wail zu lang für int und short ist 
 *  
 *  Die Speicheradresse legt die Speicherverwaltung (Memory Manager) fest und der speicherbedarrf steht in Zusammenhang
 *	mit den Datentyp !!
 *	
 *
 *
 *
 *
 *
 * */
public class Variable {
	public static void main (String[] args) {
		int x = 23 ; // Variable Deklaration
		System.out.println(x);
		//int x?_y9; // Error man kann nicht so den Variable nennen 
		//int x$_5; // So lauft 
		
		int j;
		j = 23;
		
		int a,b,c; // mehrer Variable zusemmen deklarieren
		int d = 2, p,r=22;  // mehrer Variable Inizialisieren
	}

}
