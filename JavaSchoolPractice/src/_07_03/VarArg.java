package _07_03;
/**
 * var-arg:
 * 			- Variable Anzahl von Argumenten, Optional Parameter (0 bis n Argumente
 * 			- var-arg ist intern Array
 * 			- Seit Java 1.5
 * 
 * 
 * Rules:
 * 			- var-arg Parameter muss das letzte Parameter sein
 * 			- Es kann nur einen var-arg Parameter geben
 * 			- var-arg ist intern array, deshalb Überladen mit Arary und var-arg würde zu Duplikation führen -> Es geht nicht!
 * 
 */

public class VarArg {
	
//	static void m(int[] ia) {
//		for (int i : ia) {
//			System.out.print(i + " ");
//		}
//	}
	//
	static void m(int... numbers) {
		for (int number : numbers) { // Aha, var-arg kann wie ein Array oder List behandelt werden
			System.out.print(number + " ");
		}
		System.out.println(numbers.length);
		System.out.println(numbers.getClass());
		System.out.println(numbers[0]);
	}
	
//static void m(int[] numbers) {
//		
//	}
	public static int indexOf(int[] numbers, int x) {
		for(int i = 0; i< numbers.length; i++)
			if (numbers[i] == x)
				return i;
		return  -1;
	}
	
	public static int indexOf(int x, int... numbers ) {
		for(int i = 0; i< numbers.length; i++)
			if (numbers[i] == x)
				return i;
		return  -1;
	}
	
public static void main(String... args) {
//	m(new int[] {}); // arg = zero LEngth Array (empty Array)
	//m();
	System.out.println();
	m(5,6,7,8,9);//m(new int[] {5,6,7,8,9});
	
//	m(new int[] {1}); // arg = {1}
	System.out.println();
	m(new int[] {1,3});
}
}
