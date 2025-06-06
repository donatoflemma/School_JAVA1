package _05_13;
/**
 * 
 * Die Klasse Punkt modelliert Punkte  auf der Ebene (X-Y Koordinatensystem)
 * 
 * -> Ein Punkt hat x- und y- Koordinaten
 * 
 * Was kann man mit Punkten machen?
 * 
 * 			1. längst x- und y-Axis verschieben
 * 			2. Den abstand zu einem gegebenen Punkt bestimmen
 * 			3. Als Text repräsentieren, zum Beispiel: (3.2 | 1.9)
 * 			4. Übrprüfen, ob der Punkt sich im ersten Quadrant befindent
 * 
 *
 *Erstelle ein Programm, wo ein Array aus drei Punkten erstellt wird und die einzelne Methoden
 *der Klasse Punkt aufgerufen werden. 
 *
 */

public class Punkt {
	/**
	 * Attribute
	 */
	double x;
	double y;
	
	/**
	 * Konstruktoren
	 */
	public Punkt(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	/**
	 * Methoden
	 */
	
	void shift(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}
	/**
	 * 
	 * @param other
	 * @return
	 */
	 public double distanceTo (Punkt other) {
		
		return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
	}
	
	public String asText() {
		
		return "(" + this.x + " | " + this.y + ")";
	}
	boolean istImErstenQuadrant() {
		return this.x > 0 && this.y > 0;
	}

}
