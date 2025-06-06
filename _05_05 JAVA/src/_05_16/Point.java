package _05_16;

public class Point {
	private double x;
	private double y;
	
	public Point(double x, double y) {
		
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

	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
  public static void main(String[] args) {
	Point p = new Point(2,3);
	System.out.println(p);
}
}
