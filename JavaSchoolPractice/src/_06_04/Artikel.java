package _06_04;

import java.util.Objects;

public class Artikel implements Comparable<Artikel> {
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

	@Override
	public int hashCode() {
		return Objects.hash(name, preis);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Artikel other = (Artikel) obj;
		
		return Objects.equals(name, other.name)
				&& Double.doubleToLongBits(preis) == Double.doubleToLongBits(other.preis);
	}

	@Override
	public int compareTo(Artikel o) { // kleiner (-), gleich (0), größer (+)
				
	  return Double.valueOf(preis).compareTo(Double.valueOf(o.preis));
		
		//return new Double(preis).compareTo(new Double(o.preis));
	    
		
	}
	
	

}
