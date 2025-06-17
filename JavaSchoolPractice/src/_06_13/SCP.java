package _06_13;
/**
 * String Constant Pool:
 * 						 - Sonerbereich auf dem Heap
 * 					     - Beinhaltet nur String Literals.
 * 						 - Keine Duplikate
 */
public class SCP {
public static void main(String[] args) {
	String s1 = "Bob";
	String s2 = "Bob";
	// Es gibt nur ein einziges Objekt auf dem SCP
	System.out.println(s1 == s2); // true
	
	String s3 = new String("Bob"); // Heap Objekt (1)
	String s4 = new String("Bob"); // Heap Objekt (2)
	
	System.out.println(s3 == s4); // false
	
	
	String b = s1.toUpperCase(); // "Bob" = "BOB"
	
	System.out.println(s1 == s2);
	System.out.println(s1);//"BOB"
	System.out.println(b);
	
	s1.concat(" Marley");
	
	System.out.println(s1);
}
}
