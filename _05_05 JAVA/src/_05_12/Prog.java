package _05_12;

/**
 * 
 * ein Programm kann als Interaktion zwischen Methoden betrachtet werden:
 * 
 * 
 * 1. Caller (Aufrufende Methode oder Verwender)  =  Client Code
 * 2. Callee (aufgerufende Methode oder Dienstanbieter)  = Lib code
 * 
 * Methoden definition:
 * 
 * 						[Modifiers] <return type> <identifier> <( [Parameter list])> ---- Signatur
 * 							
 * 									<Block>			---- Körper der Methode
 * 
 * Methoden Aufruf:
 * 						identifier(Argument list) oder
 * 						v = identifier(Argument list)
 * 
 * return type (Rückgabewerttyp):
 * 									- steht unmittelbar vor dem Name der Methode
 * 								    - Datentyp oder void
 * 
 * void als Return type:
 * 						 - Wirk-Methode
 * 						 - der Client Code hat NICHTS zu empfangen
 * 
 * Aufgabe:
 * 			 - Definiere eine Methode, die überprüft ob eine ganze Zahl ungerade ist. 
 * 
 * 			 - Definiere eine Methode, die die Elemente in einem Array aus Integers mit 
 * 			   Leerzeichen getrennt auf der Konsole ausgibt. 
 * 
 *
 */

class Uebung{
	static boolean isOdd (int number) // number = 25
			 						
	{
		return (number % 2 == 1);	
	}
	
	static void printArray(int[] numbers) { // numbers = {1,3,5,7,9}
		
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
	}
}

public class Prog {
	public static void main(String[] args) {

		double w = Input.readWeightFromConsole("Bitte Gewicht in kg: ");
		int h = Input.readHeightFromConsole("Bitte Größe in cm: ");
		
		double bmi = BMI.calcBMI(w, h);
		
		System.out.println("BMI = " + bmi );
		
		
		String evalText = BMI.evalBMI(bmi);
					
		System.out.println("Auswertung: " + evalText);
		
		 boolean b = Uebung.isOdd(25); // 25 is an Argument
		 
		 if(b)
			 System.out.println("Zahl ist ungerade");
		 else
			 System.out.println("Zahl ist gerade");
		 int[] ia = {1,3,5,7,9};
		 Uebung.printArray(ia);
	}
}
