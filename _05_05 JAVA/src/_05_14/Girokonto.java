package _05_14;

import Prog1Tools.IOTools;

public class Girokonto {
/*
 * Attribute
 * */
	String inhaber;
	String iban;
	double kontostand;
	double dispo;
/*
 * Kontostruktur
 * 
 * */
	Girokonto(String inhaber,String iban, double eroeffnunsbetrag,double dispo){
		// per poter dare un Muster , dispo puo andare col default value
		//this.inhaber = "Muster Inhaber";
		//this.iban = "DE123 456 789";
		//this.kontostand = 1.0;
		if (inhaber !=null)
			this.inhaber = inhaber;
		else
			this.inhaber = IOTools.readLine("Inhaber:");
		this.iban = iban; // in der Praxis wird hier überprufen
		if (eroeffnunsbetrag > 50)
			this.kontostand = eroeffnunsbetrag;
		else {
			System.err.println("Mindest Betrag für Kontöffnung ist 50 Euro");
			while (this.kontostand < 50)
				this.kontostand = IOTools.readDouble("Eröffnunsbetrag: ");
			}
		if (dispo >=0)
			this.dispo = dispo;
		else
		{
			System.err.println("Dispo darf nicht negativ sein !");
			while (this.dispo <0)
				this.dispo = IOTools.readDouble("Dispo: ");
		}
			
	}
	public static void main(String[] args) {
		
		//Girokonto gk = new Girokonto();
		//System.out.println (gk.inhaber);
		//System.out.println (gk.iban);
		//System.out.println (gk.kontostand + " " + gk.dispo);
		
	}

}
