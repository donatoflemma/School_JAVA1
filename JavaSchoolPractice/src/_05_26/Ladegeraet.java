package _05_26;
/**
 * this.zustand = NichtLadend.getNichtLadend(); //Polymorphie --- Aufgabe bc)
 * 
 * Polymorphie:
 * 
 * 				- Die möglichkeit eine allgemein deklarierte Variable (Zustand zustand) auf Objekte der Unterklassen (NichtLadend, NormalLadend oder SchnellLadend)
 * 				  referenzieren zu lassen = Polymorphie
 */
public class Ladegeraet {
	private Zustand zustand;
	private int ladestand;

	public Ladegeraet() {
		//Aufgabe ba)
		this.zustand = NichtLadend.getNichtLadend(); //Polymorphie --- Aufgabe bc)
	}

	public int getLadestand() {
		return ladestand;
	}

	public void setZustand(Zustand zustand) {
		this.zustand = zustand;
	}

	public void ausloesen() {
		zustand.bearbeiten(this);
	}
}
