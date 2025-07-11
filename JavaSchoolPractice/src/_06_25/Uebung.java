package _06_25;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Prog1Tools.IOTools;

public class Uebung {
	
	public static void methodeTwo() {
		String pfad = IOTools.readLine("Pfad zur Datei: ");
		int i = 1;
		
		try(BufferedReader br2 = new BufferedReader(new FileReader(pfad))){
			
			String zeile = null;
			while ((zeile = br2.readLine()) != null)
				System.out.println(i++ + ". " + zeile);
		} 
		catch (FileNotFoundException e) {
			System.out.println("Datei existiert nicht");
			methodeTwo();
		} 
		catch (IOException e) {
			System.out.println("Das Lesen aus der Datei geht nicht");
		}
	}
	
	public static void methodeOne() {
		String pfad = IOTools.readLine("Pfad zur Datei: ");
		BufferedReader br = null;
		int i = 1;
		try {
			br = new BufferedReader(new FileReader(pfad));
			String zeile = null;
			while ((zeile = br.readLine()) != null)
				System.out.println(i++ + ". " + zeile);
		} catch (FileNotFoundException e) {
				System.out.println("Datei existiert nicht.");
				methodeOne();
		} catch (IOException e) {
			System.out.println("Das Lesen geht nicht");
		}

		finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {

				}
			System.out.println("Programm abgeschlossen");
		}
	}
	
	public static void main(String[] args) {
	

		System.out.println("=================Teil 1==========================");	
		methodeOne();
		
		System.out.println("===================Teil 2=============================");

		methodeTwo();

		
		
	}
}
