package _05_20;

public class Punkt  {
	private double x;
	private double y;
	public Punkt(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}
	
	public  double distanceTo(Punkt other) {
		return Math.sqrt(Math.pow(x - other.x, 2) + Math.pow(y - other.y, 2));
	}
	
}
