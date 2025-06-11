package _05_06;
/*
 * 
 * 
 * 
 * operatoren : && , || , ! (Unary) , ^
 * 
 * 1. operanden sin von Typ boolian und das Ergebnis ist auch boolean !
 * 2. Vorrand : Sehe tabelle !
 * 
 * 	a			b				a && b    a||b     a ^ b
 * 	true		false     		false				true
 *  true		true			true 
 *  false       false			false	  false
 *  false       true            false               true
 *  
 *  -Short Circuit
 * 
 * */

public interface Logischerops {
	public static void main (String[] args) {
		int i = 2 , j = 3;
		
		boolean b = ++i <= j && j++ >=4;
		
		System.out.println("i =" + i + ", j= " + j + ", b =" +b); // fare attenzione se sta & o && 
		// con && s´intende che viene lavorato inizialmente solo uno e se é falso ignora e 
		// non lavora il secondo , se invece é & va a lavorare entrambe 
		
	}

}
