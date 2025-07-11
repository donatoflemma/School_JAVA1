package _06_26;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import Prog1Tools.IOTools;

/**
 * Aus einer Datei Lesen:
 * 							- Datei muss reguläre Datei sein (kein Verzeichnis)
 * 							- Die Datei muss existiert
 * 							- Leseberechtigung
 * In eine Datei schreiben:
 * 							Datei muss reguläre Datei sein (Kein Verzeichnis)
 * 							Überprüfen, ob das Überschreiben erwünscht ist oder am Ende Einfügen
 * 							Schreibberechtigung
 * 					- 
 */

public class DateiKopieren {
	public static void copy(String from, String to) throws Exception {
			File fileToWrite = new File(to), fileToReadeFrom = new File(from);
			/**
			 * Wenn die Voraussetzung für das Lesen nicht erfüllt ist,  werfe eine Exception
			 */
		     if(!fileToReadeFrom.exists() || !fileToReadeFrom.isFile() || !fileToReadeFrom.canRead())
		    	 
			     throw new Exception("File to read from doesnt fullfill the requirements...");
		     
		     /**
		      * Wenn die Voraussetzung dür das Schreiben nicht erfüllt ist, Exception werfen
		      */
		     if(!fileToWrite.isFile() || !fileToWrite.canWrite())
		    	 throw new Exception("File to write to is either a directory or you dont have write access...");
		     
		    	 
		try(BufferedReader r = new BufferedReader(new FileReader(new File(from))); 
				BufferedWriter w = new BufferedWriter(new FileWriter(fileToWrite))){
			
			String line = null;
			int numberOfLines = 0;
			while ((line = r.readLine()) != null) {
				w.write(line);
				w.newLine();
				numberOfLines++;
			}
		System.out.println("Number of libnes copied: " + numberOfLines);
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
public static void main(String[] args) {
	
	String quelle = IOTools.readLine("Quelldatei: ");
	String ziel = IOTools.readLine("Zieldatei: ");
	
	try {
		copy(quelle, ziel);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
