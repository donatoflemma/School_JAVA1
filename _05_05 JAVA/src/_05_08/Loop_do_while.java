package _05_08;

import Prog1Tools.IOTools;

/**
 * 
 * do 
 * 	{
 * 	Anweisungen
 * 	}while(Bedingung);
 * 
 * Fußgesteuerte Schleife
 * 
 * Block (Anweisungen) wird mindestens 1x ausgeführt. 
 *
 */

public class Loop_do_while {
	
	public static void main(String[] args) {
		// Sequenz - Berechnung von BMI
				
		double weight;
		
		do{
			 weight = IOTools.readDouble("please your weight in kg: ");
		}while(weight <= 0);
		
		int height ;
		do{
			 height = IOTools.readInt("please your height in cm: ");
		}while(height <= 0);
		
		
				double bmi = weight / (height / 100.0 * height /100.0);
				System.out.println("BMI = " + bmi );
			
				String evalText; 
				
				if(bmi < 16)
					evalText = "Kritisches Untergewicht";
				
				else if ( bmi < 18.5)
						evalText = "Untergewicht";
					
					else if (bmi < 25)
							evalText = "Normalgewicht";
						
						else if (bmi < 30)
								evalText = "Leichtes Übergewicht";
							
							else
								evalText = "Übergewicht";
							
						
					
					
				
				System.out.println("Auswertung: " + evalText);
	}

}
