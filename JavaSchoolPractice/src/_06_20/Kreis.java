package _06_20;

class Kreis{
	private double radius;
	private Punkt mittelpunkt;
	
	/**
	 * 
	 * @param radius
	 * @param mittelpunkt
	 * 
	 * @throws IllegalArgumentException
	 */
	public Kreis(double radius, Punkt mittelpunkt) {
		if(radius <= 0)
			throw new IllegalArgumentException("Radius must be positive: " + radius);
		this.radius = radius;
		this.mittelpunkt = mittelpunkt;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius > 0)
			this.radius = radius;
		else
			throw new IllegalArgumentException("Radius must be positive: " + radius);
	}
	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}
	public void setMittelpunkt(Punkt mittelpunkt) {
		this.mittelpunkt = mittelpunkt;
	}
	@Override
	public String toString() {
		return "Kreis [radius=" + radius + ", mittelpunkt=" + mittelpunkt + "]"; //TODO: Der Text soll das Format (x, y) : radius haben
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}