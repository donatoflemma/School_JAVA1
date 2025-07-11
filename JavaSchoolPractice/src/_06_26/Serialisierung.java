package _06_26;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * IO:
 * 			- Serialization:
 * 								-> write Object
 * 								-> read Object
 */

public class Serialisierung {

	public static void saveWarenkorbToFile(Warenkorb wk, String path) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(path)))){
		
			Collections.sort(wk.getArticles(),( a1,  a2)  -> a1.getName().compareTo(a2.getName()));
			
			//oos.writeObject(wk.getArticles()); // Auf einmal alle Artikel aus dem Array
			
			
				oos.writeObject(wk.getArticles());
			
			
		} catch (FileNotFoundException e) {
			//..
			System.out.println("FileNotFoundException: " + e.getMessage());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

public static Warenkorb loadArticlesFromFile(String path) {
		
		Warenkorb wk = new Warenkorb(10);
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(path)))){
		
			wk.setArticles((ArrayList<Artikel>) ois.readObject());
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		return wk;
		
	}
	
	public static void main(String[] args) {
		Warenkorb korb = new Warenkorb(10);
		
		korb.artikelHinzufuegen(new Artikel("Ladekabel", 1.99), 1);
		korb.artikelHinzufuegen(new Artikel("Monitor", 499.99), 1);
		korb.artikelHinzufuegen(new Artikel("Maus", 2.99), 1);
		korb.artikelHinzufuegen(new Artikel("Tastatur", 11.99), 1);
		
		String pfad = "article_Objects";
		
		saveWarenkorbToFile(korb, pfad);
		
		Warenkorb wk = loadArticlesFromFile(pfad);
		wk.ShowArticles();
		
	}
}
