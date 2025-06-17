package _06_13;

/**
 * Dont edit me!!
 */
public class Punkt {
	
	private double x;
	private double y;
	
	
	public double getX() {
		return x;
	}



	public double getY() {
		return y;
	}



	public Punkt(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	
	public void shift(double dx, double dy){
		this.x += dx;
		this.y += dy;
	}
	
	public double distanceTo (Punkt other) {
		
		return Math.sqrt(Math.pow(other.x - this.x, 2) + Math.pow(other.y - this.y, 2));
	}
	
	public String toString() {
		
		return "(" + this.x + " | " + this.y + ")";
	}
	public boolean istImErstenQuadrant() {
		return this.x > 0 && this.y > 0;
	}

}
