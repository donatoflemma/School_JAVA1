package _06_24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Lesen {
public static void main(String[] args) {
	/**
	 * Datei zum Lesen öffnen
	 * Lesen
	 * Schliessen 
	 */
	
	//Reader, FileReader, BufferedReader
	File f = new File("names.txt");
	System.out.println(f.exists());
	//FileReader fr = null;
	BufferedReader br = null;
	try{
		//fr = new FileReader(f);
		br = new BufferedReader(new FileReader(f));
		//int x = fr.read();
		//char[] cbuf = new char[5];
		//int x = br.read(cbuf);
		//System.out.println("x = " + x);
		//System.out.println("cbuf = " + Arrays.toString(cbuf));
		String line = br.readLine();
		System.out.println("line = " + line);
	}catch (FileNotFoundException e) {
		System.out.println("Datei existiert nicht");
	} catch (IOException e) {
		System.out.println("Aus der Datei kann nicht gelesen werden.");
	}
	finally {
		if (br != null) // fr != null
			try {
				//fr.close()
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	System.out.println(f.exists());//false
	
}
}
