package _05_12;

import Prog1Tools.IOTools;

/**
 * 
 *Motivation:
 *				- Modularisierung:
 *									- Wartung ist einfacher:
 *											- Fehlersuche und Fehlerkorrektur
 *											- Erweiterung
 *											- Lesbarkeit 
 *									- Komplexe Aufgaben werden lösbar
 *									- erhöht die Wiederverwemdbarkeit
 *
 */
public class Methoden {

	
public static void main(String[] args) {

	double w = Input.readWeightFromConsole("Bitte Gewicht in kg: ");
	int h = Input.readHeightFromConsole("Bitte Größe in cm: ");
	
	double bmi = BMI.calcBMI(w, h);
	
	System.out.println("BMI = " + bmi );
	
	
	String evalText = BMI.evalBMI(bmi);
				
	System.out.println("Auswertung: " + evalText);
}




}
