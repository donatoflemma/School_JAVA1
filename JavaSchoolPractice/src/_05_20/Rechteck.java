package _05_20;

/**
 * 
 * Rechteck ist eine Spezialisierung von Figur
 * 
 * 			-> Attribute und Methoden werden geerbt
 *
 */
public class Rechteck extends Figur {

	private double laenge;
	private double breite;

	public Rechteck(double laenge, double breite, Punkt mittelpunkt) {
		super(mittelpunkt);
		if (laenge > 0)
			this.laenge = laenge;
		else
			this.laenge = 1.0;

		if (breite > 0)
			this.breite = breite;
		else
			this.breite = 1.0;

	}

	public double getLaenge() {
		return laenge;
	}

	public void setLaenge(double laenge) {
		if (laenge > 0)
			this.laenge = laenge;
	}

	public double getBreite() {
		return breite;
	}

	public void setBreite(double breite) {
		if (breite > 0)
			this.breite = breite;
	}

	
		
	

	public double area() {
		return laenge * breite;
	}

	public double perimeter() {
		return 2 * (laenge + breite);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "[mittelpunkt=" + mittelpunkt +", laenge = " + + laenge + ", breite = " + breite + "]";
	}

	// Konstruktoren

	// Getters und Setters
	// Flächeninhalt - Berechnung
	// Umfang - Berechnung
	// toString
}
