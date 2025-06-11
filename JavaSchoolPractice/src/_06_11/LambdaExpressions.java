package _06_11;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Was wollen wir verstehen:
 * 				- Java 8 new Features
 * 				- Lambda Expressions
 * 				- Functional Programming
 * 				- Functional Interfaces:
 * 										- Ein Interface mit nur einer abstrakten Methode
 * 
 * Lambda Notation:
 * 					
 * 					 (Parameterliste) -> {Anweisungen der Methode}
 * 
 * 
 * Conventional:
 * 				 Modifiers Return type name(Parameterlist){
 * 														Anweisungen
 * 													}
 * 
 */
public class LambdaExpressions {
	
	public static void main(String[] args) {
		String [] names = {"Bob", "Chris", "Alice"};
		
		// Array absteigend sortiert auf der Konsole ausgeben
		
		Comparator<String> c =  (o1,  o2) ->  o2.compareTo(o1);

		
		Arrays.sort(names,  (o1,  o2) ->  o2.compareTo(o1));
		
		System.out.println(Arrays.toString(names));
		
		
		
		
	}

}


