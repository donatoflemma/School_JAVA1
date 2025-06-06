package _05_12;

public class BMI {
	static String evalBMI(double index) {
		String evalText; 
		
		if(index < 16)
			evalText = "Kritisches Untergewicht";
		
		else if ( index < 18.5)
				evalText = "Untergewicht";
			
			else if (index < 25)
					evalText = "Normalgewicht";
				
				else if (index < 30)
						evalText = "Leichtes Übergewicht";
					
					else
						evalText = "Übergewicht";
		return evalText;
	}
	
	static double calcBMI(double wKg, int hCm) {
		
		double bmi = wKg / (hCm / 100.0 * hCm / 100.0);
		return bmi;
	}
}
