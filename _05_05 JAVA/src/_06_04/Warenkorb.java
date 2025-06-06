package _06_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/**
 * Array											ArrayList (Collection Framework)
 * Fixed-Size										dynamic
 * 													Sehr viele Methoden
 */

public class Warenkorb {
	//private Artikel[] articles; // null
	private ArrayList<Artikel> articles;
	
	public Warenkorb(int size) {
		//this.articles = new Artikel[size];
		this.articles = new ArrayList<>(size);
	}
	/**
	 * 
	 * @param a 
	 * @param stueckzahl a soll stueckZahl mal ins Warenkorb hinzugefügt werden
	 * @return true, falls der Warenkorb genug platz hat die Artikel hinzugefügt werden könnten, sonst false
	 */
	public boolean artikelHinzufuegen(Artikel a, int stueckzahl) {
		for (int i = 0; i < stueckzahl; i++) {
			articles.add(a);
		}
		
		return true;
			
	}
	/**
	 * 
	 * Definiere eine Methode, die überprüft ob der Warenkorb leer ist
	 */
	
	public boolean istLeer() {
		return articles.isEmpty();
		
	}
	
	/**
	 * 
	 * Definiere eine Methode, die überprüft, ob der Warenkorn voll ist
	 */
	public boolean istVoll() {
			return false;
	}
	
	/**
	 * 
	 * Definiere eine Methode, die ermittelt wie viele freie Plätze der Warenkorb noch hat. 
	 */
	public int getAnzahlFreiePlatz() {
		
		
		return Integer.MAX_VALUE;
	}
	
	
	public int getNumberOfArticles() {
		return articles.size();
	}
	public double berschneGesammtwert() {
		//TODO
		double gesammtwert = 0.0;
	
		for (Artikel article : articles) {
			
			if(article != null)
				gesammtwert += article.getPreis();
		}
		
		return gesammtwert;
	}
	
	
	public void ShowArticles() {
//		for (int i = 0; i < getNumberOfArticles(); i++) 
//			System.out.println(articles.get(i));
		
	for (Artikel artikel : articles) {
		System.out.println(artikel);
	}
	}	
	
	/**
	 * Definiere eine Methode, die überprüft ob eib gegebenes Artikel im Warenkorb beinhaltet ist
	 */
	public boolean istArtikelImWarenkorb(Artikel a) {
		
		return articles.contains(a);
	}
	
	public void showArtikelsSortedByPreis() {
		System.out.println("......Sorted by preis......");
		Collections.sort(articles);
		ShowArticles();
	}
	public void showArtikelsSortedByName() {
		System.out.println("......Sorted by name......");
		
		Comparator<Artikel> c = new ComparatorBasedOnName();
		Collections.sort(articles, c);
		ShowArticles();
	}
	
	
	}

