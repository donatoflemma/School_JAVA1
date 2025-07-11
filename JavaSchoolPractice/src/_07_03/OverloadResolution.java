package _07_03;
/**
 * Overloading Rules:
 * 					 - Unterschiedliche Parameterliste
 * Resolution:
 * 				1. Exakt Match ... m(short)
 * 				2. Bei primitiven Datentypen: Promotion (Widening) : m(int), m(long), m(float), m(double)
 * 				3.1. Autoboxing: m(Short)
 * 				3.2. Autoboxing und anschließendes Upcast: m(Number), m(Object)
 * 				4. var-arg: m(short...)
 * 
 * 	
 */
public class OverloadResolution {

	public static void m(long x) {
		System.out.println("long");
	}

	public static void m(int x) {
		System.out.println("int");
	}

	public static void m(short... s) {
		System.out.println("short...");
	}
	public static void m(long... s) {
		System.out.println("short...");
	}

	public static void m(Short s) {
		System.out.println("Short");
	}
	public static void m(Number n) {
		System.out.println("number");
	}
	public static void m(Object o) {
		System.out.println("Object");
	}
	public static void main(String[] args) {

		short sh = 3;
		m(sh);
		m(1,2,3); // int... -> long...
		
		//long[] longs = new int[3];
		long[] longs = new long[3];
		longs[0] = 1;
	}
}
