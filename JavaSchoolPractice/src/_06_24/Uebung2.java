package _06_24;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Uebung2 {
public static void main(String[] args) {

	String[] names = {"Alice", "Bob", "Chris"};
	
	// Schreibe die Elemente des Arrays in einer Datei names.txt. Ein Element pro Zeile und nummeriert 1. 2. 3.
	//FileWriter fw = null;
	//BufferedWriter bw = null;
	PrintWriter pw = null;
	try {
		
		pw = new PrintWriter(new File("names.txt"));
		int i = 1;
		for (String name : names) {
			pw.println(i++ + ". " + name ); 
			
		}
		
		
	} catch (IOException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	finally {
		
			if(pw != null) 
				pw.close();
		}
	

}
}
