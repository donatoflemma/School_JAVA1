package _06_23;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung {
public static void main(String[] args) {
	String[] names = {"Alice", "Bob", "Chris"};
	
	// Schreibe die Elemente des Arrays in einer Datei names.txt. Ein Element pro Zeile und nummeriert 1. 2. 3.
	FileWriter fw = null;
	try {
		fw = new FileWriter("names.txt"); // alte inhalt wird gelöscht
		int i = 1;
		for (String name : names) {
			fw.write(i++ + ". " + name + "\n"); // write ist Vergleichbar mit print, fw ist vergleichbar mit System.out
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		try {
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
