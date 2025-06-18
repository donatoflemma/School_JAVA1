package _06_17;

import java.util.Arrays;

import Prog1Tools.IOTools;

/**
 * Client Code (Aufrufer):
 * 						 - > Fehler behandeln
 * 
 * 
 * Lib Code (Aufgerufene Methode):
 * 
 * 				-> Fehler erkennen (error detection)
 * 				-> Fehler signalisieren (Mitteilen)
 * 
 * Fehler Signalisieren:
 * 						 - Spezielle Werte (Sonderwerte) zurück geben: -1, 0, false, null
 * 						 - error Variable einführen und beim Fehler auf true setzen
 * 
 */
public class Fehlerbehandlung {
	
	public static void main(String[] args) {
		
		int zaehler = IOTools.readInt("Zaehler; ");
		int nenner = IOTools.readInt("Nenner: ");
		
		int q = Mathematik.divide(zaehler, nenner);
		
		if(!Mathematik.error)
			System.out.println("q = " + q);
		else
			System.err.println("Dircidieren durch 0...");
		
		int [] numbers = {1, 3, 5, 7, 9, 2, 4, 6, 8};
		int index = Mathematik.indexOf(numbers, 19);
		
		if(index == -1)
			System.err.println("Zahl ist im Array nicht enthalten");
		else
			
			System.out.println("Index = " + index);
		
		if(index >= 0 && index < numbers.length)
			numbers[index] = 19;
		
		System.out.println(Arrays.toString(numbers));
	}

}