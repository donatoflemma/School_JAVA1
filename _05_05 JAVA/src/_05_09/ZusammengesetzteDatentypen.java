package _05_09;
/**
 * 
 * Sammlung (Array in Java):
 * 			- Mehrere Werte, die vom gleichen Typ sind und inhaltlich zusammenhängend!
 * 
 * Syntax:
 * 			T [] name; ---- Deklaration
 * 			T [] name = {wert1, wert2, wert2, ...} ----- Array-Initialization-list
 * 
 * 			T [] name = new T[N]; ---- Array der Größe N erzeugen, wobei N muss eine positive ganze Zahl sein
 * 
 *
 */
public class ZusammengesetzteDatentypen {
	
	public static void main(String[] args) {
		String [] names = {"Alice", "Bob", "Chris"};
		System.out.println(names.length);//3
		
		System.out.println(names[2]);//Chris
		
		// Speichere die ersten 10 ungerade Zahlen in einem Array und gebe Elemente des 
		//Arrays mit Space getrennt in einer Zeile auf der Konsole aus!
		
		int [] numbers = new int[10];//{1,3,5,7,9,11,13,15,17,19};
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = 2 * i + 1;
		}
		for(int i = 0, number = 1; i < numbers.length; i++, number += 2) {
			numbers[i] = number;
		}
		
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");
		
		
		/**
		 * Definiere ein Array, welches 100 Zufallszahlen zwischen 0 und 100 speichert. 
		 * 
		 * - Ermittele das kleinste Element im array
		 * 
		 * - Ermittele den Durchschnittswert der 100 Zufallszahlen.
		 */
		
		int [] zufallszahlen = new int [100];
		
		for(int i = 0; i < zufallszahlen.length; i++)
			zufallszahlen[i] = (int) (Math.random() * 101);
		
		
		System.out.println();
		for (int i = 0; i < zufallszahlen.length; i++) 
			System.out.print(zufallszahlen[i] + " ");
		
		
	}

}
