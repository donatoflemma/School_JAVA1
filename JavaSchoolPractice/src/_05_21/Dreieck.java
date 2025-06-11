package _05_21;

import _05_20.Figur;
import _05_20.Punkt;

/**
 * 
 *  Ein Dreieck kann eindeutig durch a, b, eingeschlossenes Winkel alpha und den Mittelpunkt angegeben werden.
 *  
 *  Ein Dreieck ist eine Spezialisierung von Figur
 *  
 *  - Setters und Getters
 *  - toString
 *  - Flächeninhalt berechnen
 *  - Umfang berechnen
 *
 */
public class Dreieck extends Figur {
	
	private double a;
	private double b;
	private double gamma;
	
	public Dreieck(Punkt mp, double a, double b, double alpha) {
		super(mp);
		
		if(a > 0)
			this.a = a;
		else
			this.a = 1;
		if(b > 0)
			this.b = b;
		else
			this.b = 1;
		
		if(alpha > 0 && alpha < Math.PI)
			this.gamma = alpha;
		else
			this.gamma = Math.PI/4;
		
	}
	
	

	public double getA() {
		return a;
	}

	public void setA(double a) {
		if(a > 0)
			this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		if(b > 0)
			this.b = b;
	}

	public double getAlpha() {
		return gamma;
	}

	public void setAlpha(double alpha) {
		if(alpha > 0 && alpha < Math.PI)
			this.gamma = alpha;
	}
	
	public double area() {
		return  .5 * a * b * Math.sin(gamma);
	}
	
	public double perimeter() {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(gamma));
		return a + b + c;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[mittelpunkt=" + mittelpunkt + ", a = " + + a + ", b = " + b + ", gamma = " + gamma +"]";
	}
}
