/*
 * 
 * Literals gibt es für :
 * 						- primitive Datentyp, String, Arrays
 * 
 * Literals für ganze Zahlen:
 * 				3,35L,
 * 	- Dezimal:
 * 				- Eine Kombination aus den Ziffern 0-9 , Präfix = keins !
 * 	- Binär:
 * 				- Ein  Kombination aus dne Ziffer 0-1, Präfix = ob !
 * - Oktal: 
 * 				- Ein  Kombination aus dne Ziffer 0-7, Präfix = 0 !
 * - Hexadezimal:
 * 				- Ein  Kombination aus dne Ziffer 0-9 und Buchstaben  a-f (Groß und Klein),Präfix = Ox !
 * 
 * - 1000er Trenner, seit Java 7:
 * 								- Motivation: Lesbarkeit
 * 								- Verbotene Stellem : am Anfang , am Ende, unmittelbar nach den Präfix !!
 * 
 * 	Zusammenfassung:
 * 					- Ziffer
 * 					- Präfix
 * 					- Zahlensystem (Binär, Oktal, Dezimal, Hexadezimal)
 * 					- Suffix
 * 
 * 
 * Eine ganze Zahl Literal ist per default int ! diese Kann man beeiflüßen mmit einem Suffix
 * 
 * Für long , es gibt L oder l als Suffix!
 * 
 * Fließkommanzahlen:
 * 
 * 					-.
 * 					- Suffix f oder F für float
 * 					- default (ohne Suffix) : double
 * 					- Scientific Notation  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class Literals {

	public static void main (String[] args) {
		int x = 032;  // ho messo il prefisso del Oktal in modo che possa darmi il valore preciso in decimale 
		System.out.println("x = " + x);
		
		x = 1_464_646; // Lesbar!!
		System.out.println("x = " + x);
		
		x = 0xaf31_132; // Hexadezimal
		System.out.println("x = " + x);
		
		
	}
}
