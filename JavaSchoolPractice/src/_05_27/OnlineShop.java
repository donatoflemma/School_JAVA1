package _05_27;

public class OnlineShop {
public static void main(String[] args) {
	Artikel a1 = new Artikel("A", 120), a2 = new Artikel("B", 20), a3 = new Artikel("C", 50);
	
	Warenkorb wk = new Warenkorb(50);
	
	wk.artikelHinzufuegen(a1, 3);
	wk.artikelHinzufuegen(a2, 3);
	wk.artikelHinzufuegen(a3, 4);
	
	System.out.println(wk.berschneGesammtwert());
	System.out.println(wk.getNumberOfArticles());
	
	wk.setVersand(new ExpressLieferung());
	System.out.println(wk.getVersandKosten());

}
}
