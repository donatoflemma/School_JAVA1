package _06_17;

import Prog1Tools.IOTools;

/**
 * Fehler (Error) 
 * 
 * Fehlerarten:
 * 				- Syntax Fehler
 * 				- Laufzeitfehler (Runtime Exceptions)
 * 				- Logischer Fehler
 * 
 * Ursachen:
 * 			- Werte, die von außen übergeben werden,  benutzen ohne überprüfung
 * 			- Physikalische Einschränkungen
 *          - Denkfehler
 */
public class Ausnahmebehandlung {
public static void main(String[] args) {
	System.out.println("Program start...");
	int result;
	
	int[] a = {1,2,3,5,8,6,6,7,9};
	int index;
	
	try {
		System.out.println("try Block..");
		result = Mathematik.divide(IOTools.readInt("Zaehler: "), IOTools.readInt("Nenner: "));
		System.out.println("Ergebnis = " + result);
		
		index = Mathematik.indexOf(a, 13);
		System.out.println("13 ist an der Stelle = " + index + " im array");
		
	} catch (NennerIstZeroException e) {
		
		System.out.println("Catch Block...");
		System.out.println(e.getMessage());
	}
	catch (ElementDoesntExistInArrayException e) {
		
		System.out.println("Catch Block...");
		System.out.println(e.getMessage());
	}
	
	
	
//	int[] a = {1,2,3,5,8,6,6,7,9};
//	
//	int index;
//	try {
//		index = Mathematik.indexOf(a, 13);
//		System.out.println("13 ist an der Stelle = " + index + " im array");
//	} catch (ElementDoesntExistInArrayException e) {
//		System.out.println(e.getMessage());
//	}
	
	
	System.out.println("Programm termination...");
	
}
}
