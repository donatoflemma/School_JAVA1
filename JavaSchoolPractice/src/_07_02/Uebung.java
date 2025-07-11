package _07_02;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Uebung {
public static void main(String[] args) {
	/**
	 * 1. Erzeuge folgende Verzeichnisstruktur und Datei:
	 * 
	 *  2025/Winter/Urlaub/Südtirol/readme.txt
	 *  
	 * 2. Schreibe einen drei zeiligen Text in die Datei readme.txt
	 * 
	 * 3. Gebe auf der Konsole die Größe der Datei readme.txt
	 * 
	 * 4. Gebe auf der Konsole zeilenweise den Inhalt der Datei readme.txt
	 * 
	 * 5. Kopiere den Inhalt der Datei in eine neue Date liesmich.txt und lösche die alte Datei readme.txt
	 * 
	 */
	Path pathToDirectory = Paths.get("2025", "Winter", "Urlaub", "Suedtirol");
	Path pathToFile = Paths.get("2025", "Winter", "Urlaub", "Suedtirol", "readme.txt");
	
	try {
		//1
		//Files.createDirectories(pathToDirectory); // Directories created
		//Files.createFile(pathToFile );
		
		//2
		Files.write(pathToFile, Arrays.asList("Bob", "Alice", "chris"));
		//3
		//System.out.println("size of readme.txt = " + Files.size(pathToFile));
		
		//4
//		for (String line : Files.readAllLines(pathToFile)) {
//			System.out.println(line);
//		}
		
		Files.copy(pathToFile, System.out); //... Bulk Operation
		
		//5 --- Kopieren, löeschen
		
//		Path senke =  Paths.get("2025", "Winter", "Urlaub", "Suedtirol", "liesmich.txt");
//		Files.copy(pathToFile, senke );
//		Files.delete(pathToFile);
		
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("done");
	
}
}
