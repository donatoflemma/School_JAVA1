package _06_26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;

public class Uebung {
	
	
	/**
	 * 
	 * Definiere eine Methode, die ein Warenkorb entgegen nimmt und die Artikel im Warenkorb Zeilenweise in einer Datei schreibt, und zwar 
	 * nach Name aufsteigend sorteiert.
	 * @throws FileNotFoundException 
	 */
	public static void saveWarenkorbToFile(Warenkorb wk, String path) {
		try(PrintWriter pw = new PrintWriter(new File(path))){
		
			Collections.sort(wk.getArticles(),( a1,  a2)  -> a1.getName().compareTo(a2.getName()));
			
			for(Artikel a : wk.getArticles())
				pw.println(a.toString());
			
		} catch (FileNotFoundException e) {
			//..
			
		}
	}
	
	/**
	 * 
	 * Definiere eine Methode, die aus einer Datei, eine Liste von Artikel einliest und die in einem Warenkorb speichert. Der Warenkorb soll den für den Aurfufer zurück
	 * gegebne werden.
	 * 
	 */
	
	public static Warenkorb loadArticlesFromFile(String path) {
		
		Warenkorb wk = new Warenkorb(10);
		try(BufferedReader br = new BufferedReader(new FileReader(new File(path)))){
			String line = null;
			while((line = br.readLine()) != null)
				wk.artikelHinzufuegen(new Artikel(line.split(",")[0].trim(), Double.parseDouble(line.split(",")[1])), 1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return wk;
		
	}
	
	/**
	 * 
	 * Teste die zwei Methoden!
	 */
public static void main(String[] args) {
	Warenkorb korb = new Warenkorb(10);
	korb.artikelHinzufuegen(new Artikel("Ladekabel", 1.99), 1);
	korb.artikelHinzufuegen(new Artikel("Monitor", 499.99), 1);
	korb.artikelHinzufuegen(new Artikel("Maus", 2.99), 1);
	korb.artikelHinzufuegen(new Artikel("Tastatur", 11.99), 1);
	
	String pfad = "articles.txt";
	
	saveWarenkorbToFile(korb, pfad);
	
	Warenkorb wk = loadArticlesFromFile(pfad);
	wk.ShowArticles();
}
}
