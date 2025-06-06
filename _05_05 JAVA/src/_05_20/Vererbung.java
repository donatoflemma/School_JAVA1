package _05_20;
/**
 * 
 * OO Konzepte:
 * 				- Kapselung 
 * 				- Information Hiding
 * 				- Vererbung
 * 				- ..
 * 
 * Was ist Vererbung und warum?
 * 			
 * 		-> Ähnliche Klassen werden durch eine sog. Basisklasse beschrieben
 *Motivation für Vererbung:
 *							- Reale Welt abbilden
 *							- Coderedundanz vermeiden
 *							- Klassen werden schmaler:
 *									->bessere Lesbarkeit => einfachere Wartung
 *
 *
 * ISt-EINE-Beziehung:
 * 					  - Generlaisierung/Spezialisierung
 * 					  - Abgeleite (derived classes) Klassen = Kinder, erben Attribute und Methoden aus der Basisklasse
 * Objekterzeugung:
 * 					- fängt mit der Basisklasse an 
 *
 */
public class Vererbung {
	
	public static void main(String[] args) {
		Kreis k = new Kreis(3, new Punkt(0, 0));
		
		k.setMittelpunkt(new Punkt(0.5, 0.75));
	}

}
