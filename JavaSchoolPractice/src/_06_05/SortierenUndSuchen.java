package _06_05;

import java.util.Arrays;
import java.util.List;

/**
 * Sammlung von Daten verwalten:
 * 									-> Array   T[]
 * 									-> Collection:
 * 													List<T>, Set>T>, Queue<T> ...
 * 
 * Häufige Operationen: Suchen und Sortierenm
 * 
 * 			-> Arrays
 * 			-> Collections
 * 
 * Die zwei Hilfsklassen sind mit statische Methoden ausgestattet..
 * 
 * Suchen:
 * 				-> Arrays.binarySearch (array, Key)
 * 				-> Collections.binarySearch(List, Key)
 * 
 * Binray Search:
 * 					- Die Methode implementiert den binären Suchalgorithmus
 * 					- Der Algorithmus geht nicht von Links nach Rechts (Linear, nicht effizient!), sondern startet in der Mitte und geht bedint nach 
 * 					 Links oder nach Rechts (Rekursiv).
 * 					-Der Algorithmus geht von einem sortierten Array bzw. einer sortierten Liste aus
 * 					- Wenn die Sammlung nicht sortiert ist, das Ergebnis der Such ist nicht determiniert
 */
public class SortierenUndSuchen {
	
	private static int suche (int[] numbers, int x) {
		Arrays.sort(numbers);
		return Arrays.binarySearch(numbers, x);
	}
	
	public static void main(String[] args) {
		int[] ints = {5,5,5,5,5,7,9,2,4,6,8,0};
		
		int index = suche(ints, 3);
		
		
		System.out.println(Arrays.toString(ints));
		System.out.println("index: " + index);
		
	}

}
