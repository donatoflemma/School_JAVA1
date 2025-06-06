package _05_22;

public class Sparkonto extends Konto{
	private double zinssatz;

	public Sparkonto(String inhaber, String kreditInst, String iban, double kontostand, double zinssatz) {
		super(inhaber, kreditInst, iban, kontostand);
		this.zinssatz = zinssatz;
	}

	@Override
	public boolean auszahlen(double betrag) {
		if(betrag < kontostand) {
    		this.kontostand -= betrag;
    		return true;
    	}
    	return false;
	}


	
	
	

}
