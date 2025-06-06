package _05_27;
/**
 *   class
 *   enum
 *   interface
 */
public class Interfaces {
public static void main(String[] args) {
	FlyaFlugfaehigble f; // Interfaces sind Referent-Datentypen!
	//f = new Flyable(); Interfaces können nicht instanziert werden!
	
}
}

/**
 * 
 * Ein Interface ist wie eine abstrakte Klasse, kann nicht instanziert werden:
 * 
 * 
 * Unterschiede zu Klassen:
 * 			Methoden in einem Interface sind automatisch abstract und public
 * 			Attribute in einem interface sind public static und final
 * 
 * 			Interfaces haben keinen Konstruktor
 * 
 * 
 */

interface FlyaFlugfaehigble{
	/*public static final */int X = 21;
	/*public abstract */ void fly();
}

class Vogel implements FlyaFlugfaehigble{

	@Override
	public void fly() {
		System.out.println("Bird is flying..");
		
	}
	
}