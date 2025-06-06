package _05_20;

public class Kreis extends Figur {

	private double radius;

	public Kreis(double radius, Punkt mittelpunkt) {
		
		super(mittelpunkt); //.. die erste Anweisung im Konstruktor
		
		if (radius > 0)
			this.radius = radius;
		else
			this.radius = 1.0;
		

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if (radius > 0)
			this.radius = radius;
	}

	
	

	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	public boolean contains(Punkt p) {
		return this.mittelpunkt.distanceTo(p) < radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[mittelpunkt=" + mittelpunkt + ", radius= " + radius + "]";
	}

}
