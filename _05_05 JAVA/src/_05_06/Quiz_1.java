package _05_06;

public class Quiz_1 {
	public static void main  (String [] args) {
		/*
		 * codefragment:
		 * 				- Berechne den BMI
		 * BMI = Gewicht in kg geteilt durch Größe im Meter zum quadrat
		 * 
		 * Beispiel :
		 * 			Größe in Meter = 173
		 * 			Gewicht in kg = 58.5
		 * 
		 * 		Errechnet BMI ca. 19.5
		 * 
		 * Deklarere entsprechende Variable für Gewicht in Kg, Größe in cm und BMI !
		 * 
		 * Scriben den Asdrücke für die Berechnung 
		 * */
		
		int heightcm = 173;
		double weightkg = 58.5 ;
		double bmi;
		
		bmi = weightkg /(heightcm/100.0 * heightcm/100.0); // abbiamo inserito il punto e lo zero con 100
		// in quanto se non facciamo cosi , viene calcolato come int e va a perdere i numeri dopo la virgola 
		System.out.println(bmi);
		
	}

}
