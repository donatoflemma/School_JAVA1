package _06_23;
/**
 * Kommunikation mit Außenwelt:
 * 
 * 	1. Konsolenbasierte Anw:
 * 								- Tastatur & Konsole
 * 2. Dateiebasierte Anw.:
 * 								 - Dateien im Dateisystem
 * 3. GUI-basierte Anw.:
 * 
 * 4. Datenbankbasierte Anw.:
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Prog1Tools.IOTools;

/**
 * Streams (Datenstrom)
 * 						 - byte-basiert (Audio, Viedo, Bild)
 * 						 - Zeichenbasiert (Text Files)
 */

/**
 * Zeichenbasiert:
 * 
 * API:
 * 			-File (Regulaläre Dateien  und Verzeichnisse)
 * 			-Reader (FileReader, BufferedReader)
 * 			-Writer (FileWriter, BufferedWriter, PrintWriter)
 */
public class FileIO {
public static void main(String[] args) {
	//Konsolenbasiert
	String name = IOTools.readLine("name: "); // Tastatur (Scanner, System.in,...)
	System.out.println("name = " + name); // Konsole (OutputStream)
	
	/**
	 * 1. Verbindung aufbauen (Resource belegen)
	 * 2. Operation
	 * 3. Verbindung abbbauen (Resource freigeben)
	 */
	
	// Dateibasiert.
	
	File f = new File("names.txt");
	
	
    FileWriter fw = null;
   
	try {
	
		// 1. Verbindung aufbauen
		 fw = new FileWriter(f); // eine leere Datei wird erzeugt und die Verbindung wird e´hergestellt
		
		//2. Operation
		fw.write("read me"); // Inhalt wird im sog. Buffer zwischen gespeichert.
		//...
		fw.flush(); // Buffer leeren: Inhalt vom Buffer wird in Datei auf Dateisystem übertragen
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		
		
	}
	finally {
		try {
			//3. Verbindung abbbauen
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	
}
}
