package _05_22;
/**
 * 
 * abstrakte Methode:
 * 						- Methode ohne Rumpf (body, Implementierungsteil, Körper)
 * 						- Signatur: abstract + Methodenkopf ;
 * 						- keyword abstract
 * 
 * 						- eine abstrakte Methode darf NUR in abstrakten Klassen eingetragen werden. 
 * 
 * abstrakte Klasse:
 * 					 - kann sowohl abstrakte als auch konkrette Methoden haben
 * 					 - Modifier :abstract
 * 					 - Können NICHT instanziert werden 
 *
 */
public  abstract class Konto {
	protected final String inhaber;
	protected final String kreditInst;
	protected final String iban;
	protected double kontostand;
	public Konto(String inhaber, String kreditInst, String iban, double kontostand) {
		super(); //Object
		this.inhaber = inhaber;
		this.kreditInst = kreditInst;
		this.iban = iban;
		this.kontostand = kontostand;
	}
	public double getKontostand() {
		return kontostand;
	}
	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}
	public String getInhaber() {
		return inhaber;
	}
	public String getKreditInst() {
		return kreditInst;
	}
	public String getIban() {
		return iban;
	}
	@Override
	public String toString() {
		return "Konto [inhaber=" + inhaber + ", kreditInst=" + kreditInst + ", iban=" + iban + ", kontostand="
				+ kontostand + "]";
	}
	
	public void einzahlen(double betrag) {
		this.kontostand += betrag;
	}
	
	public boolean ueberweisen(Konto empfaenger, double betrag) {


		if(this.auszahlen(betrag)) {
			empfaenger.einzahlen(betrag);
			return true;
		}
		return false;

	}
//	public boolean ueberweisen(Girokonto empfaenger, double betrag) {
//
//
//		if(this.auszahlen(betrag)) {
//			empfaenger.einzahlen(betrag);
//			return true;
//		}
//		return false;
//
//	}
//
//	public boolean ueberweisen(Sparkonto empfaenger, double betrag) {
//
//
//		if(this.auszahlen(betrag)) {
//			empfaenger.einzahlen(betrag);
//			return true;
//		}
//		return false;
//
//	}
    public abstract  boolean auszahlen(double betrag);
}
    

