package _06_13;

public class DesignPatterns {
public static void main(String[] args) {
	Konto k = new Konto(1000);
	System.out.println(k);
	
	//k.setKontostand(1500);
	System.out.println(k);
	//k.kontostand = 800;
	System.out.println(k);
	
	k = k.einzahlen(800);
	System.out.println(k);
	
	String s = "Alexander".substring(3, 6).toUpperCase().concat("ta").toLowerCase();
	//xan
	//XAN
	//XANta
	System.out.println(s);//xanta
	
	/**
	 * 1. Wieviele SCP Objekte gibt es? 2
	 * 2. Wieviele Objekte sind Garbage? 3
	 * 
	 * 
	 */
	
	k = k.einzahlen(500).einzahlen(100).einzahlen(50).auszahlen(250).einzahlen(150);
	
	KontoMutable km = new KontoMutable(1000);
	km.einzahlen(500).einzahlen(100).einzahlen(50).auszahlen(250).einzahlen(150);
	
}
}


class Konto{
	private  final double kontostand ;
	//...

	public Konto(double kontostand) {
		super();
		this.kontostand = kontostand;
	}

	@Override
	public String toString() {
		return "Kotno [kontostand=" + kontostand + "]";
	}

	public double getKontostand() {
		return kontostand;
	}

    public Konto einzahlen(double betrag) {
    	//this.kontostand += betrag;
    	
    	return new Konto(this.kontostand + betrag);
    }
	
    public Konto auszahlen(double betrag) {
    	return new Konto(this.kontostand - betrag);
    }
	
}

class KontoMutable{
	private   double kontostand ;
	//...

	public KontoMutable(double kontostand) {
		super();
		this.kontostand = kontostand;
	}

	@Override
	public String toString() {
		return "Kotno [kontostand=" + kontostand + "]";
	}

	public double getKontostand() {
		return kontostand;
	}

    public KontoMutable einzahlen(double betrag) {
    	this.kontostand += betrag;
    	return this;
    	//return new Konto(this.kontostand + betrag);
    }
	
    public KontoMutable auszahlen(double betrag) {
    	this.kontostand -= betrag;
    	return this;
    	//return new Konto(this.kontostand - betrag);
    }
	
}