package _05_26;

import java.time.Month;

public class Fallbeispiel {
public static void main(String[] args) {
	Autor a = new Autor("Meyer", "Otto", Anrede.HERR, AkadamischesTitle.DIPLOM);
	System.out.println("a= " + a);
}
}

/**
 * Konstruktoren, Setters, Getters und toString
 */

class Buch{
	String title;
	Autor autor;
	String isbn;
	int erscheinungsjahr;
	Month erscheinungsmonat; //Enum
}

/**
 * Wähle geeigneterer Datentyp für anrede und akadamischesTitle (Evtl. selber einen Datentyp definieren)
 * 
 * Konstruktoren, Setters und Getters, toString
 */
class Autor{
	 String name;
	 String vorname;
	 Anrede anrede;
	 AkadamischesTitle akadamischesTitle;
	public Autor(String name, String vorname, Anrede anrede, AkadamischesTitle akadamischesTitle) {
		super();
		this.name = name;
		this.vorname = vorname;
		this.anrede = anrede;
		this.akadamischesTitle = akadamischesTitle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public Anrede getAnrede() {
		return anrede;
	}
	public void setAnrede(Anrede anrede) {
		this.anrede = anrede;
	}
	public AkadamischesTitle getAkadamischesTitle() {
		return akadamischesTitle;
	}
	public void setAkadamischesTitle(AkadamischesTitle akadamischesTitle) {
		this.akadamischesTitle = akadamischesTitle;
	}
	@Override
	public String toString() {
		return "Autor [name=" + name + ", vorname=" + vorname + ", anrede=" + anrede + ", akadamischesTitle="
				+ akadamischesTitle + "]";
	}
	 
	 
}

enum AkadamischesTitle{
	BACHELOR,MASTER,DIPLOM,MAGISTER,DOKTOR;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		switch (this) {
		case BACHELOR:
			
			return "Bachelor";
		case MASTER:
			return "Mr.";
		case DIPLOM:
			return "Dipl.";
		case MAGISTER:
			return "Mag.";
		case DOKTOR:
			return "Dr.";

		default:
			return null;
		}
	}
}
enum Anrede{
	HERR, FRAU
}