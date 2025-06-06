package _05_15;

import _05_13.Punkt;

/**
 * 
 * Was kann man mit Kreise machen?
 * 							      - Vergrößern oder Verkleinern = scale
 * 								  - Flächeninhalt berechnen = area
 * 								  - Umfang berechnen ? perimeter
 * 								  - Überprüfueng, ob der Kreis ein gegebener Punkt beinhaltet
 *
 */

public class Kreis {
	private double radius;// radius > 0
	 Punkt mittelpunkt;
	
	/**
	 * Konstruktoren
	 */
	Kreis(){
//		this.radius = 1.0;
//		this.mittelpunkt = new Punkt(0.0, 0.0);
		this(1.0);
	}
	
	Kreis(double radius){
//		if(radius > 0)
//			this.radius = radius;
//		else
//			this.radius = 1.0;
//		this.mittelpunkt = new Punkt(0.0, 0.0);
		this(radius, new Punkt(0.0, 0.0));
	}
	Kreis(double radius, Punkt mittelpunkt){
		if(radius > 0)
			this.radius = radius;
		else
			this.radius = 1.0;
		this.mittelpunkt = mittelpunkt;
		
	}
	String asText() {
		return this.radius + " : " + this.mittelpunkt.asText();
	}	
	
	void scale(double scaleFactor) {
		if(scaleFactor > 0)
			this.radius *= scaleFactor;
	}
	double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}
	double perimeter() {
		return 2 * Math.PI * radius;
	}
	/**
	 * 
	 * @param p ist ein beliebiger Punkt vom aufrufer zu übergeben
	 * @return true, falls p innerhalb (Rand exklusiv) des Kreises sich befindet, sonst false!
	 */
	boolean containsPoint(Punkt p) {
		
		return this.mittelpunkt.distanceTo(p) < this.radius;
		
	}

	public void setRadius(double radius) {
		if(radius > 0) 
			this.radius = radius;
		
		else
			System.err.println("invalid value for radius : " + radius);
	}

	

	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}

	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;
	}
	


	
	
	
}
