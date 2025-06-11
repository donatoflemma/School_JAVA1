package _05_12;

import Prog1Tools.IOTools;

/**
 * 
 * Aufgabe 24: 
	Schreiben Sie ein Programm, bei dem der Nutzer eine nicht-negative ganze Zahl  
	eingibt und das Programm die Quersumme der Zahl berechnet. 
	
	Vorgehensweise:
					- Die Berechnung der Quersumme soll in eine Methode ausgelagert werden. 
	Lernziele:
				- Operatoren und primitive Datentypen
				- Kontrollstrukturen
				- Methoden definieren und Aufrufen
 *
 */
public class Aufgabe24 {
	
	public static void main(String[] args) {
		int x = readNonNegativeIntFromConsole();
		int qs = berechneQuersummeVon(x);
		System.out.println("Quersumme von " + x + " = " + qs);
		
		
		
	}
	/**
	 * @return
	 */
	private static int readNonNegativeIntFromConsole() {
		int x = IOTools.readInt("Bitte eine nicht-negative Zahl: ");
		while(x < 0)
		{
			System.out.println("Fehlerhafte Eingabe...");
			x = IOTools.readInt("Bitte eine nicht-negative Zahl: ");
		}
		return x;
	}
   /**
    * 
    * @param zahl is a non-negative integer
    * @return returns sum of digits of the number zahl
    */
	static int berechneQuersummeVon(int zahl) {
		int quersumme = 0;
		
		while(zahl != 0) {
			quersumme += zahl% 10;
			zahl /= 10;
		}
		return quersumme;
	}
}
