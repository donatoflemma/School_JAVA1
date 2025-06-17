package _06_13;


/*
 * String ist Immutable:
 * 						 - Objekte der Klasse String lassen sich nicht ändern. 
 * 						 - toUppercase, toLowerCase... generieren neues Objekt, lassen das originale Objekt unverändert.
 * 
 * 
 * Wenn Mutablität erwünscht ist:
 * 									- StringBuffer
 * 									- StringBuilder
 */

/**
 *           		String					StringBuffer						StringBuilder
 *           
 *  Version  		1.0						1.0									1.5
 *  		 		Immutable				Mutable								Mutable
 * Threade-Safe		 						+									 -
 * Performance		 +						-									 +
 */
public class Immutablitaet {
public static void main(String[] args) {
	String s1 = new String("Bob");
	
	s1.concat(" Marley");
	
	System.out.println(s1); // "Bob"
	
	StringBuffer sbuf = new StringBuffer("Bob");
	
	sbuf.append(" Marley");
	System.out.println(sbuf); //"Bob Marley" .... Mutable
	
	
	StringBuilder sb = new StringBuilder("Bob");
	
	sb.append(" Marley");
	
	System.out.println(sb); // Bob Marley
	
}
}
