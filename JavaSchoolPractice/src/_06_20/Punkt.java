package _06_20;

class PunktFormatException extends IllegalArgumentException{
	public PunktFormatException(String message) {
		super(message);
	}
}

class Punkt{
	private double x;
	private double y;
	public Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")"; // TODO: Der Text soll wie (x, y) aussehen
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
	
	public static Punkt parsePunkt(String s) {
		//Annhame: s ist ein Punkt Darstellung der Form (x, y)
		s = s.trim();
		s = s.substring(1, s.length()-1);
		
		String [] values = s.split(",");//[| ]
		
		if(values.length == 2)
			try{
				return new Punkt(Double.parseDouble(values[0]), Double.parseDouble(values[1]));
			}catch (NumberFormatException e) {
				System.out.println("Text repräsentiert keine Zahl");
				throw e; // Propagation
			}
		throw new PunktFormatException("Punkt must be in the form (x, y): " + s);
	}
	
}