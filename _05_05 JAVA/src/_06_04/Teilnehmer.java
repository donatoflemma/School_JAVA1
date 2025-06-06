package _06_04;

import java.time.LocalDate;
import java.util.Objects;
// l´implementazione dell´interafccia comparable serve per poter utilizzare il .sort delle´ArrayList 
// in quanto rischiamando e sovrascrivendo il metodo Tocompare , do a java le indicazioni su quale 
// attributo applicare il controllo e il riordino , senza di cio mi da errore perche non sa dove vedere 
public class Teilnehmer implements Comparable<Teilnehmer>  {
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
	// Equals mi serve per fare i confronti e capire se le istanze siano uguali o meno 
	// devo sovrascrivere il metodo della classe Objeckt per renderlo personalizzato 
	
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
	// in questo caso io indico che il riordino deve farsi tramite l´attributo delle istanze di nome "name"
	
	@Override
	public int compareTo(Teilnehmer o) {
		
		return name.compareTo(o.name);
	}
	
	
	
	
	/**
	 * Alle sinnvolle Methoden und Konstruktoren
	 */

}
