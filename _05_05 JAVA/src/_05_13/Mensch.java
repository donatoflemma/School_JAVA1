package _05_13;

import Prog1Tools.IOTools;

public class Mensch {
	// Attribute
	double gewicht; 
	int groesse ;
	
	
	
	
	// Operationen = Methoden
	
	 Mensch(double gewicht, int groesse) {
		this.gewicht = gewicht;
		this.groesse = groesse;
	}
	
	double getBMI() {
		return gewicht / (groesse / 100.0 * groesse / 100.);
	}
	
	String evalBMI() {
		double bmi = this.getBMI();
		if (bmi < 16)
			return "Kritisches Untergewicht";
		else if (bmi < 18.)
			return "Untergewicht";
		else if (bmi < 25)
			return "Normalgewicht";
		else if (bmi < 30)
			return "Leichtes Übergewicht";
		else
			return "Übergewicht";
	}
	
	public String toString() {
		return "Gewicht in kg = " + this.gewicht + ", Körpergröße in cm = " + this.groesse;
	}

}
