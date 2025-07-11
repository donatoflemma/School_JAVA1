package _06_24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import Prog1Tools.IOTools;
import _06_20.Punkt;

public class FWritersReaders {
	
	/**
	 * 
	 * Schreibe eine Methode, die eine belibiege Anzahl von Punkten (die Klasse Punkt von 20.06) aus der Tastatur einliest und diese Punkten 
	 * als Array für den Aufrufer bereitstellt. 
	 */
	public static Punkt[] readPointsFromConsole(int arraySize) {
	
		assert (arraySize >= 0);
		
		Punkt[] points = new Punkt[arraySize];
		for (int i = 0; i < points.length; i++) {
			points[i] = Punkt.parsePunkt(IOTools.readLine("Punkt in der Format (x, y): "));
		}
		
		return points;
		
		
	}
	/**
	 * 
	 * Schreibe eine Methode, die ein Array aus Punkten (die Klasse Punkt von 20.06) entgegen nimmt und die Punkten in einer CSV Datei schreibt. 
	 * Der Pfad zu der Datei soll als Argument übergeben werden. 
	 */
	
	public static void writePointsToFile(Punkt[] points, String path) {
		PrintWriter pw = null;
		try {
			 pw = new PrintWriter(new File(path));
			 for (Punkt point : points) {
				pw.println(point.toString());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(pw != null)
				pw.close();
		}
	}
	
	/**
	 * 
	 * Definiere eine Methode, die die Anzahl von Zeichen in einer Datei ermittelt und diesen Wert für den Aufurfer zurück gibt. 
	 */
	public static long getNumberOfChrachtersFromFile(String path) {
		FileReader br = null;
		long counter = 0;
		try {
			 br = new FileReader(new File(path));
			while( br.read() != -1)
				counter++;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		return counter;
	}
	
	/**
	 * 
	 * Definiere eine Methode, die die Anzahl von Zeilen in einer Datei ermittelt und diesen Wert für den Aufrufer zurück gibt. 
	 */
	
	public static long getNumberOfLinesFromFile(String path) {
		BufferedReader fr = null;
		long counter = 0;
		try {
			 fr = new BufferedReader( new FileReader(path));
			 while(fr.readLine() != null)
				counter++;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fr != null)
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return counter;
	}
	
	/**
	 * 
	 * Teste die Methoden
	 */
	
public static void main(String[] args) {
	//writePointsToFile(readPointsFromConsole(5), "points.csv");
	System.out.println("Number of Characters: " + getNumberOfChrachtersFromFile("names.txt"));
	
	System.out.println("done...");

}
}
