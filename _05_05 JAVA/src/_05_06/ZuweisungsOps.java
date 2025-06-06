package _05_06;
/*
 * 
 * assignment operator (=)
 * 
 * +=, -= , /= , %= ....
 * 
 * op = 
 * 1. Zuweisungsoperatoren haben den niedrigsten Vorrang
 * 2. sind rechst-assoziativ
 * 
 * */

public class ZuweisungsOps {
	public static void main (String[] args) {
		int x = 3;
		x = x + 6;
		x += 6; // ovviamente sono uguali 
		
		int y = 2 ;
		x = y = 3;
		
		System.out.println(" x =" + x + ", y = " + y);
		
		// Dekrement und Inkrement Operatoren 
		
		x = x + 1;
		x +=1 ; 
		x ++; // Post-Inkrement !!
		++ x; // Pre-Inkrement !!
		
		System.out.println("x =" + x);
		System.out.println(x++);
		System.out.println(++x);
	}
}
