package Ubung;

import Prog1Tools.IOTools;

/*
 * Fahrenheit = (Celsius * 9)/5 + 32
 * */
public class Aufgaben1_Celcius {

	
	static float Konvertierung(int x) {
		float Fahrenheit = ((float)x * 9)/5 + 32;
		return  Fahrenheit ;
	}
	
	
	
	public static void main(String[] args) {
		boolean data = true;
		
		
		
		
		System.out.println("Zwei mögliche Verwendungszwecke des Programms");
		System.out.println("1  für die Umrechnung von Celsius in Fahrenheit und ");
		System.out.println("2  für eine tabellarische Umrechnung bei einem zu berechnenden Bereich");
		do {
			
			try {
				int Anwendung = IOTools.readInt("Welche Anwendung :");
				if (Anwendung == 1 ) {
					// Aufgabe 1
					int Temperatur = IOTools.readInt("Bitte geben Sie den Temperatur in Celsius: ");
					//float result = Konvertierung(Temperatur);
					System.out.println("Fahrenheit <" + Konvertierung(Temperatur)  + ">") ;
					data = true;
				}
				else {
					try {
						// Aufgabe 2
						int minus = IOTools.readInt("Erste Werte: ");
						int plus = IOTools.readInt("Zweite Werte: ");
						for (int i = minus; i <= plus; i++){
							System.out.println("Celsius :" + (i) + "   Fahrenheit :" + Konvertierung(i)) ;
							data = true;
					}} 
					catch (NumberFormatException e) {
					  System.out.println("Ungültige Eingabe, bitte geben Sie eine ganze Zahl ein.");
					  data = false;
					}while(data);
					
				
					
					}
				}
			
			catch (NumberFormatException e) {
			  System.out.println("Ungültige Eingabe, bitte geben Sie eine ganze Zahl ein.");
			  data = false;
			}
			}while(data);
		}
}
