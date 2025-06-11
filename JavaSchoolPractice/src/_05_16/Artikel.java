package _05_16;

public class Artikel {
	private final String name;
	private double preis;

	public Artikel(String name, double preis) {
		this.name = name;
		this.preis = preis;
	}

	public String getName() {
		return name;
	}

	public double getPreis() {
		return preis;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	@Override
	public String toString() {
		return "Artikel [name=" + name + ", preis=" + preis + "]";
	}
	
	

}
