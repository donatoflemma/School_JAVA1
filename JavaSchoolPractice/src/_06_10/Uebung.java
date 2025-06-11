package _06_10;

import java.util.ArrayList;

/**
 * Definiere folgende Klassen entsprechende des Programms unten:
 * 
 * 
 * Bibliothek:
 * 				- Attribute :
 * 								- Name der Bibliothek
 * 				- Konstruktoren
 * 				- Methoden
 * 
 * Buch:
 * 				- Attribute:
 * 							- title, autor, isbn
 * 				- Konstruktoren
 * 				- Methoden
 * Statstik:
 * 				- Attribute 
 * 				- Konstruktoren
 * 				- Methoden
 */
public class Uebung {
public static void main(String[] args) {
	
	Bibliothek bib = new Bibliothek("VW Bibliothek TU-Berlin");// Top-Level class
	Bibliothek.Buch b1 = bib.new Buch("Rich Dad Poor Dad", "Robert K.", "123445");// regular inner class
	Bibliothek.Buch b2 = bib.new Buch("Small Things Like These", "Claire K..", "456789");
	
	bib.buchHinzufuegen(b1);
	bib.buchHinzufuegen(b2);
	
	bib.gebeAlleBuecherAufDerKonsoleAus();
	
	Bibliothek.Statstik.gebeAnzahlVonBuecherInDerBibliothekAus();
	
	
	
	
}
}

class Bibliothek{
	private String name;
	private static  ArrayList<Buch> buecher = new ArrayList<Bibliothek.Buch>();
	
	private static Bibliothek instance;
	
	public Bibliothek(String name) {
		this.name = name;
	}
	
	
	
	public void buchHinzufuegen(Buch b) {
		buecher.add(b);
	}
	public void gebeAlleBuecherAufDerKonsoleAus() {
	for (Buch buch : buecher) {
		System.out.println(buch);
	}
		
	}
	public class Buch{
		private String title;
		private String autor;
		private String isbn;
		public Buch(String title, String autor, String isbn) {
			super();
			this.title = title;
			this.autor = autor;
			this.isbn = isbn;
		}
		@Override
		public String toString() {
			return "Buch [title=" + title + ", autor=" + autor + ", isbn=" + isbn + "]";
		}
		
		
	}
	
	public  static class Statstik {

		public static  void gebeAnzahlVonBuecherInDerBibliothekAus() {
			System.out.println(buecher.size());
			
		}
		
	}
}



