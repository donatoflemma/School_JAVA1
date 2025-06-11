package _05_07;
/*
 * 
 * Syntax:
 * 		1. if (Bedingung - Boolean Expression){
 *				Anweisungen 
 * 			}
 * 
 * 		2. if (Bedingung - Boolean Expression){
 *				Anweisungen 
 * 			}
 * 			else{
 *				Anweisungen 
 * 			}
 * 
 * */
public class Verzweigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = 73;
		int height = 173;
		double bmi = weight /(height/100.0 * height / 100.0);
		//System.out.println("BMI = " + bmi);
		
		// Auswertung: 
		/*
		 * BMI < 16 : Kritische Untergewicht
		 * 16.........18.5 : Untergewicht 
		 * 18.5.......25 : Normalgewicht
		 * 25 ........30:  Leichtes Übergewicht
		 * BMI > 30 : Übergewicht
		 * 
		 * */
		String evalText;  // invece di stampare ogni volta creiamo il contenuto testo da stampare 
		// Come puoi vedere si puo togliere le graffe se le if riguardano solo un value!!!
		if ( bmi < 16) 
			evalText = "Kritische Untergewicht !!";
		
		else if (bmi >= 16 && bmi < 18.5) 
			evalText = "Untergewicht !!";
		
		else if (bmi >= 18.5 && bmi < 25) 
			evalText = "Normalgewicht ";
		
		else if (bmi >= 25 && bmi < 30) 
			evalText = " Leichtes Übergewicht ";
		
		else 
			evalText = "  Übergewicht !!";
		
		System.out.println(evalText);
		
	}

}
