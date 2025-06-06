package _05_16;
/**
 * 
 * Attribute:
 * 				- Variable, definiert innerhalb einer Klasse - Klassenmitglieder
 * 				- Zustand eines Objekts = Wertebelegung der Attribute
 * 				- typischerweise private zu deklarieren
 * 				- haben default Values 
 * 				- Werden durch Konstruktoren initialisiert.
 * 
 * Es gibt verschiedene Arten von Attribute:
 * 			
 * 				- Unveränderliche Attribute = final:
 * 
 * 
 * final Attribute:
 * 					- haben keinen default Value => müssen explizit initialisiert werden
 * 					- Initialisierung: direkt bei der Deklaration oder in jedem Konstruktor
 * 					- Jeder Konstruktor  muss nicht-initialisierte final Attribut initialisieren
 * 					- Methoden dürfen final Attribute nur lesend ansprechen (read-only access)!
 *
 */
public class Attribute {

}

class Buch{
	private final String title ; //= "Java ist auch eine Insel";
	private final String isbn;
	private final String autor;
	private double price;//
	private final int erscheinungsjahr;
	
	public Buch(String title, String isbn, String autor, double price, int erscheinungsjahr) {
		
		this.title = title;
		this.isbn = isbn;
		this.autor = autor;
		this.price = price;
		this.erscheinungsjahr = erscheinungsjahr;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getAutor() {
		return autor;
	}

	public int getErscheinungsjahr() {
		return erscheinungsjahr;
	}
	
}
/**
 * 
 * Modelliert Studenten der Hochschule TU Dresden
 *
 */
class Student{
	 /**
	  * 
	  * welche Attribute sollen final deklariert werden? 
	  * 
		  * Vorname -- -final
		  * Nachname
		  * Studiengang
		  * Studienmodus (Bachelor, Master, Promotion)
		  * Studienjahr
		  * Matrikelnummer  ---- final 
		  * Geburtsdatum    ---- final
		  * Geburtsort      ---- final
		  * anschrifft
		  *
	  */
	
}