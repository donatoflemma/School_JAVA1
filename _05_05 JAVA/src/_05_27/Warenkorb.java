package _05_27;


public class Warenkorb {
	private Artikel[] articles; // null
	private Versand versand;
	
	public Warenkorb(int size) {
		this.articles = new Artikel[size];
	}
	/**
	 * 
	 * @param a 
	 * @param stueckzahl a soll stueckZahl mal ins Warenkorb hinzugefügt werden
	 * @return true, falls der Warenkorb genug platz hat die Artikel hinzugefügt werden könnten, sonst false
	 */
	public boolean artikelHinzufuegen(Artikel a, int stueckzahl) {
		if(getAnzahlFreiePlatz() >= stueckzahl) {
			int start = getNumberOfArticles();
			int stop = stueckzahl + getNumberOfArticles();
			
			for (int i = start; i < stop; i++) {
				
				articles[i] = a;
				
			}
				
			return true;
		}
		else
		{
			//...
			return false;
		}
			
	}
	/**
	 * 
	 * Definiere eine Methode, die überprüft ob der Warenkorb leer ist
	 */
	
	public boolean istLeer() {
		
//		for (Artikel article : articles) {
//			if(article != null)// Es gibt ein Artikel => Nicht Leer
//			{
//				
//				return false;
//			}
//		}
//		// Alle Elemente = null => Leer
//		return true;
		//return getAnzahlFreiePlatz() == articles.length;
		return getNumberOfArticles() == 0;
		
	}
	
	/**
	 * 
	 * Definiere eine Methode, die überprüft, ob der Warenkorn voll ist
	 */
	public boolean istVoll() {
//		for (Artikel article : articles) {
//			if(article == null) { // Es gibt freier Platz => nicht voll
//				return false;
//			}
//		}
//		return true;
		//return getNumberOfArticles() == articles.length;
		return getAnzahlFreiePlatz() == 0;
	}
	
	/**
	 * 
	 * Definiere eine Methode, die ermittelt wie viele freie Plätze der Warenkorb noch hat. 
	 */
	public int getAnzahlFreiePlatz() {
		
		
		int counter = 0;
		for (Artikel article : articles) {
			if(article == null)
				counter++;
		}
		return counter;
	}
	
	
	public int getNumberOfArticles() {
		return articles.length - getAnzahlFreiePlatz();
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
		for (int i = 0; i < getNumberOfArticles(); i++) 
			System.out.println(articles[i]);
		
	}
	public Versand getVersand() {
		return versand;
	}
	public void setVersand(Versand versand) { // Versand versand = new ExpressLieferung()
		this.versand = versand;
	}
	
	public double getVersandKosten() {
		
		return versand.berechnen(this);
	}
	
}
