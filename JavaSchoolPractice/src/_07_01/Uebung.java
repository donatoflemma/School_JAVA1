package _07_01;

import java.io.File;
import java.io.IOException;

public class Uebung {
	public static void main(String[] args) {
		/**
		 * Erstelle im aktuellen Verzeichnis folgendes:
		 * 
		 * 			2025/Urlaub/Sommer/Italien/readme.txt
		 * 
		 * Die Verzeichnisse 2025, Urlaub, Sommer und Italien und die Datei readme.txt existieren noch nicht.
		 * 
		 * 
		 * -> Welche Klasse ist für diese Aufgabe verwantwortlich?
		 * 
		 * Schaut ihr die API der Klasse File, und wenn keine passende Methode gibt, weitere Klassen in java.io suchen....
		 * 
		 */
		
	
		File f = new File("2025/Urlaub/Sommer/Italien/readme.txt");
		
	
		try {
//			new File("2025").mkdir();
//			new File("2025", "Urlaub").mkdir();
//			new File("2025/Urlaub", "Sommer").mkdir();
//			new File("2025/Urlaub/Sommer", "Italien").mkdir();
			
			new File("2025/Urlaub/Sommer/Italien").mkdirs();
			
			boolean b = f.createNewFile();
			System.out.println("b = " + b);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
