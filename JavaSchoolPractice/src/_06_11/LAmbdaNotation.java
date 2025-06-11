package _06_11;
import java.util.Random;

/**
 * Functional Interface:  hat genau eine abstrakte Methode
 */
@FunctionalInterface

interface I1{
	/**
	 * 
	 * @param x
	 * @return true, falls x gerade, sonst false
	 */
	boolean isEven(int x);
	
	
}
@FunctionalInterface
interface I2{
	/**
	 * 
	 * Gibt den Wert von x quadriert auf der Konsole aus
	 */
	void print(int x);
}
@FunctionalInterface
interface I3{
	/**
	 * 
	 * @return gibt eine zufäälige ganze Zahl zwischen 0 und 100 zurück
	 */
	int getInt();
}
@FunctionalInterface
interface I4{
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @return gibt die Summe aus x und y zurück
	 */
	int max(int x, int y);
}


public class LAmbdaNotation {
	
	public static void main(String[] args) {
		/**
		 * Initialisiere die Variable v1, v2, v3 und v4 mittels:
		 * 
		 * 1. Annonyme Inner Klassen
		 * 2. Lambda Expressions
		 */
		
		// Alla fine é la sintesi di questo
			/*
		I1 v1 = new I1() {
			@Override
			public boolean isEven(int x ) {
				return x % 2 == 0;
			}
		};*/
		
		I1 v1 = (int x ) ->{return x % 2 == 0;};
		// SI PUO ANCORA RIASSUMERE ANCHE COSI 
		// v1 = (x) ->  x % 2 == 0 ; in questa versione ho tolto le {} , ovviamente se é semplice il calcolo da fare 
		// nel caso ci fosse solo un PArametro , possono essere tolte le parentesi () 
		// ES : v1 = x ->  x % 2 == 0 ;
		
		I2 v2 = (int x) ->{System.out.println(x*x);};
		//I3 v3 = () ->{return rand.nextInt(101);};
		I4 v4 = (int x, int y) ->{return Math.max(x,y);};
	}

}
