package _06_13;

/**
 * make me immutable!
 * 
 * Chaining ist gewünscht!
 */
public class Kreis {
	private final double radius;
	private final Punkt mittelpunkt;
	
	
	public Kreis(){

		this(1.0);
	}
	
	public Kreis(double radius){

		this(radius, new Punkt(0.0, 0.0));
	}
	public Kreis(double radius, Punkt mittelpunkt){
		
		if(radius > 0)
			this.radius = radius;
		else
			this.radius = 1.0;
		this.mittelpunkt = new Punkt(mittelpunkt.getX(), mittelpunkt.getY()); // mittelpunkt;
		
	}
	
	public String toString() {
		return this.radius + " : " + this.mittelpunkt.toString();
	}	
	
	public Kreis scale(double scaleFactor) {
		if(scaleFactor > 0)
			//this.radius *= scaleFactor;
			return new Kreis(this.radius * scaleFactor, this.mittelpunkt);
		return new Kreis(this.radius, this.mittelpunkt);
	}
	double area() {
		
		return Math.PI * Math.pow(radius, 2);
	}
	double perimeter() {
		return 2 * Math.PI * radius;
	}

	boolean containsPoint(Punkt p) {
		
		return this.mittelpunkt.distanceTo(p) < this.radius;
		
	}

	public Kreis setRadius(double radius) {
		if(radius > 0) 
			//this.radius = radius;
			return new Kreis(radius, this.mittelpunkt);
		else
			{
			System.err.println("invalid value for radius : " + radius);
			return new Kreis(this.radius, this.mittelpunkt);
			}
	}

	

	public Punkt getMittelpunkt() {
		return new Punkt(mittelpunkt.getX(), mittelpunkt.getY()); // mittelpunkt;
	}

	public Kreis setMittelpunkt(Punkt mittelpunkt) {
		//this.mittelpunkt = mittelpunkt;
		
		return new Kreis(this.radius, mittelpunkt);
	}
	


	
	
	
}
