package _06_05;

import java.time.LocalDate;
import java.util.Objects;

public class Teilnehmer implements Comparable<Teilnehmer> {
	private String name;
	private Anschrifft anschrifft;
	private final LocalDate geburtsdatum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Anschrifft getAnschrifft() {
		return anschrifft;
	}
	public void setAnschrifft(Anschrifft anschrifft) {
		this.anschrifft = anschrifft;
	}
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}
	public Teilnehmer(String name, Anschrifft anschrifft, LocalDate geburtsdatum) {
		super();
		this.name = name;
		this.anschrifft = anschrifft;
		this.geburtsdatum = geburtsdatum;
	}
	@Override
	public String toString() {
		return "Teilnehmer [name=" + name + ", anschrifft=" + anschrifft + ", geburtsdatum=" + geburtsdatum + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(anschrifft, geburtsdatum, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teilnehmer other = (Teilnehmer) obj;
		return Objects.equals(anschrifft, other.anschrifft) && Objects.equals(geburtsdatum, other.geburtsdatum)
				&& Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Teilnehmer o) {
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
	/**
	 * Alle sinnvolle Methoden und Konstruktoren
	 */

}
