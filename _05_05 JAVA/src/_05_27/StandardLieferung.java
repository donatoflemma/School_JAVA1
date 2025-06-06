package _05_27;

public class StandardLieferung implements Versand {

	@Override
	public double berechnen(Warenkorb w) {
		
		return .5 * w.getNumberOfArticles();
	}

}
