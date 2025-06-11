package _05_16;

public class OnlineShop {
public static void main(String[] args) {
	Artikel b = new Artikel("Laptop - Thinkpad", 839.0);
	
	Warenkorb w = new Warenkorb(100);
	w.artikelHinzufuegen(b, 6);
	w.artikelHinzufuegen(new Artikel("Collage Block", 1.99), 3);
	w.artikelHinzufuegen(new Artikel("Kuglschreiber", .99), 3);
	
	
	System.out.println("Freie Plätze: " + w.getAnzahlFreiePlatz() + ", Anzahl Artikel: " + w.getNumberOfArticles());
	
	w.ShowArticles();
	
}
}
