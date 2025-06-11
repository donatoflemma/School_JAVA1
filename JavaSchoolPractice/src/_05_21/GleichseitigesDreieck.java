package _05_21;

import _05_20.Punkt;

/**
 * 
 * - Ein gleichseitiges Dreieck ist ein Dreieck  (IST-EINE-Beziehung)
 *
 */
public class GleichseitigesDreieck extends Dreieck{
	
 public GleichseitigesDreieck(Punkt mittelpunkt, double s) {
	 super(mittelpunkt, s, s, Math.PI/3);
 }
 
 @Override
public void setA(double a) {
		super.setA(a);
		super.setB(a);
	}
 
 @Override
	public void setB(double b) {
		this.setA(b);
	}
/**
 *  wir überschreiben die Methode, da die Formel hier einfach und  schneller ist!
 */
 @Override
	public double perimeter() {
		return 3 * getA(); 
	}
 
 @Override
	public void setAlpha(double alpha) {
	 System.err.println("unsupported operatoion, angle is always 60° (1.04..)");
	}
}
