package _05_26;
/**
 * keyword enum
 * 
 * Auszählungstyp (Enumeration):
 * 								- Genauso wie Klassen in Java : Referenzdatentypen
 * 								- Die Objekte sind aufzählbar und überschaubar von Anzahl
 * 								- Seit Java 1.5 
 *                              - Vorteil: Typsicherheit
 *                              
 *  Syntax:
 *  			- Definition wird mit enum eingeleitet
 *  			- Es ist zwar möglich für Enums Attribute, Methoden und Konstruktoren zu definieren, aber:
 *  			    - Konstruktoren sind immer private und werden nur implizit aufgerufen
 *  
 *  
 *  			 - Objekterzeugung: 
 *  
 *  								Bezeichnung des Enums . Name des Objekts
 *  
 *  								Beispiel: Month.MAY, Muenze.EINZENT
 *  				
 */
public enum Muenze {
	EINZENT,ZWEIZENT,FUENFZENT,ZEHNZENT,ZWANZIGZENT,FUENZIGZENT,EINEURO,ZWEIEURO;
	
//	private double value;
//	
//	private Muenze() {
//		
//	}

}

enum Jahreszeiten{
		SOMMER , HERBST , WINTER , FRUEHLING
}