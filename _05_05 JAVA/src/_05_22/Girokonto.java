package _05_22;

public class Girokonto extends Konto {
	private double dispo;

	public Girokonto(String inhaber, String kreditInst, String iban, double kontostand, double dispo) {
		super(inhaber, kreditInst, iban, kontostand);
		this.dispo = dispo;
	}

	public double getDispo() {
		return dispo;
	}

	public void setDispo(double dispo) {
		this.dispo = dispo;
	}

	@Override
	public boolean auszahlen(double betrag) {
		if (betrag < (dispo + kontostand)) {
			kontostand -= betrag;
			return true;
		}
		return false;
	}



}
