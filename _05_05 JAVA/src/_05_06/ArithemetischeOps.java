package _05_06;
/*
 * +, -, *, /, % 
 * 
 * Multiplikative Operatoren (* ,/, %) haebn den gleuchen Vorrang und sind links assoziativ
 * 
 * Additive Operatoren (+ und -) haben den Vorrang und sind links assoziativ
 * 
 * Multiplikative Operatoren sind vorrangiger als additive Operatoren
 * */

public class ArithemetischeOps {
	public static void main (String [] args) {
		System.out.println(8/2); //4
		System.out.println(8/3); //2
		
		System.out.println(3.6/18); //0.2
		
		System.out.println(5 % 2); //1
		System.out.println(-5 % 3); // -2
		
		System.out.println(12 % -5); // 2
		
		System.out.println(12 % 5 - 6 / 2 * 3 + 2); 
		// da sinistra verso destra , prima il modulo poi la divisione e in fine la moltiplicazione 
		// , per poi terminare con gli altri operandi 
		// 12 % 5 - 6 / 2 * 3 + 2
		// 2 - 6 / 2 * 3 + 2
		// 2 - 3 * 3 + 2
		// 2 - 9 + 2
		// -7 +2
		// - 5
	}

}
