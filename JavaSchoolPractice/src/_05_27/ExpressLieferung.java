package _05_27;

public class ExpressLieferung implements Versand{

	@Override
	public double berechnen(Warenkorb w) {
		
		return 0.05 * w.berschneGesammtwert();
	}

}
