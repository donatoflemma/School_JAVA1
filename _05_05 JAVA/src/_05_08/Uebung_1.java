package _05_08;

import Prog1Tools.IOTools;

public class Uebung_1 {
public static void main(String[] args) {
	/**
	 * Lese zwei Zahlen (ints) aus der Tastatur ein - n und m
	 * 
	 *  Bilde die Summe aller ungeraden Zahlen zwischen den Zahlen n und m.
	 *  
	 *  Gebe alle ungerade Zahlen zwischen n und m (aufsteigend) und am Ende die Summe der 
	 *  ungeraden Zahlen auf der Konsole aus. 
	 *  
	 *  
	 *  Beispiel:
	 *  			n : 5
	 *  			m : 15
	 *  
	 *  Ungerade zahlen zwischen 5 und 15: 5 7 9 11 13 15
	 *  Die Summe = 60
	 * 
	 */
	int n = IOTools.readInt("n : "), m = IOTools.readInt("m: ");
	
	if(n> m) {
		int temp = n;
		n = m;
		m = temp;
	}
	
//	int x;
//	if (n % 2 == 1)
//		x = n;
//	else
//		x = n + 1;
	
	//int x = (n % 2== 1) ? n : m;
	
	int sum = 0;
	
//	for(int x = (n % 2== 1) ? n : m; x <= m;System.out.print(x + " "), sum += x, x+= 2) {
//		
//			
//	}
	
	for(int x = (n % 2== 1) ? n : m; x <= m;x+= 2) {
		System.out.print(x + " ");
		sum += x;
		
	}
	
	System.out.println();
	System.out.println("sum = " + sum);
	
}
}
