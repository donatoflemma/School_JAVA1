package _06_05;

import java.util.Objects;

public class Anschrifft implements Comparable<Anschrifft>{
	private String strasseMitHnr;
	private String plz;
	private String ort;
	
	public Anschrifft(String strasseMitHnr, String plz, String ort) {
		super();
		this.strasseMitHnr = strasseMitHnr;
		this.plz = plz;
		this.ort = ort;
	}

	public String getStrasseMitHnr() {
		return strasseMitHnr;
	}

	public void setStrasseMitHnr(String strasseMitHnr) {
		this.strasseMitHnr = strasseMitHnr;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	@Override
	public String toString() {
		return "Anschrifft [strasseMitHnr=" + strasseMitHnr + ", plz=" + plz + ", ort=" + ort + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(ort, plz, strasseMitHnr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anschrifft other = (Anschrifft) obj;
		return Objects.equals(ort, other.ort) && Objects.equals(plz, other.plz)
				&& Objects.equals(strasseMitHnr, other.strasseMitHnr);
	}

	@Override
	public int compareTo(Anschrifft o) {
		
		return toString().compareTo(o.toString());
	}
	
	
	
 /**
  * Definiere hier alle sinnvolle Konstruktoren und Methoden
  */
	
}
