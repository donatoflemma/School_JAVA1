package _07_02;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * New Input Output (NIO) , NIO2
 * 
 * 				- Java 7 und Java 8
 */
/**
 * interface Path:
 * 				
 * class Paths, eine Fabrik Klasse (Factory design)
 */
/**
 * Files.write(p, ....), erzeugt leere Datei, wenn die Datei nicht existiert
 */
public class NIO {
	
	static void m(int... ints ) {
		
	}
	public static void main(String[] args) {
		
		//Pfad Konstruktion
		Path p = Paths.get("einkaufsliste.txt");
		
		
		
		
		try {
			//Files.createFile(p);	// Datei erzeugen
			//Files.delete(p); // Datei löschen
			//Schreiben,  falls die Datei nicht existiert, eine leere Datei wird erzeugt
			Files.write(p, Arrays.asList("Baby Spinat", "Zuchini", "Paprika", "Zwiebel", "Ziegenfrischkäse", "Knoblauch", "Eier"));//Bulk-Operation
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		try {
			List<String> lines = Files.readAllLines(p); //Bulk-Operation
			
			for (String line : lines) {
				System.out.println(line);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		System.out.println("done...");
		
		
	}

}
