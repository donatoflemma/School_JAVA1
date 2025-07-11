package _06_24;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Uebung {
public static void main(String[] args) {
	String[] names = {"Alice", "Bob", "Chris"};
	
	// Schreibe die Elemente des Arrays in einer Datei names.txt. Ein Element pro Zeile und nummeriert 1. 2. 3.
	//FileWriter fw = null;
	BufferedWriter bw = null;
	try {
		bw = new BufferedWriter(new FileWriter(new File("names.txt")));
		int i = 1;
		for (String name : names) {
			bw.write(i++ + ". " + name ); 
			bw.newLine();
		}
		
		
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		try {
			if(bw != null) bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
}
