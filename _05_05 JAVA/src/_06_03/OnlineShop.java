package _06_03;

import java.util.ArrayList;

public class OnlineShop {
public static void main(String[] args) {
	Artikel b = new Artikel("Laptop - Thinkpad", 839.0);
	
	Warenkorb w = new Warenkorb(100);
	w.artikelHinzufuegen(b, 6);
	w.artikelHinzufuegen(new Artikel("Collage Block", 1.99), 3);
	w.artikelHinzufuegen(new Artikel("Kuglschreiber", .99), 3);
	
	
	System.out.println("Freie Plätze: " + w.getAnzahlFreiePlatz() + ", Anzahl Artikel: " + w.getNumberOfArticles());
	
	w.ShowArticles();
	
	Artikel x = new Artikel("Laptop - Thinkpad", 839.0);
	Artikel y = new Artikel("Laptop - Samsung", 739.0);
	
	System.out.println(w.istArtikelImWarenkorb(x));//true??
	System.out.println(w.istArtikelImWarenkorb(y));//false
	
	ArrayList<Integer> ints = new ArrayList<Integer>();
	ints.add(21); ints.add(23);ints.add(45);
	System.out.println(ints);
	System.out.println(ints.contains(29));// false
	int i = 23;
	System.out.println(ints.contains(i));// true
	
	w.showArtikelsSortedByPreis();
}
}
