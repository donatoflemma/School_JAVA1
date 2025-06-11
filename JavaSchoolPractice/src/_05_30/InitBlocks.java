package _05_30;
/**
 * Ein Init-Block (Initialisierungsblock) sieht wie ein namenslosere Methode oder Konstruktor aus.
 * 
 * 
 * Zwei Arten:
 * 			 - static init Block:
 * 								 - Statische Init Blöcke laufen nur 1x, wenn die Klasse geladen wird
 * 			 - instance Init Block:
 * 								  - Instance Init Blöcke werden unmittelbar nach super() - Aufruf in jedem Konstruktor eingetrage!
 */
public class InitBlocks {
	static {
		System.out.println("static init block of main class");
	}
public static void main(String[] args) {
	
	System.out.println("main ...");
	System.out.println(Box.s);//3

Box b = new Box();
System.out.println(b); //1 2 3 
System.out.println();
Box b2 = new Box(10);
System.out.println(b2);
//	
//	System.out.println();
//	
//	Box b3 = new Box(10, 20);
//	System.out.println(b3);
}
}

class Box{
	private int a;
	private int b;
	private int c;
	
	public static int s = 3;
	
	
		{
	    System.out.println("instance init Block");
		System.out.println("Object will be constructed");
		System.out.println("Attributs will be initialized");
		}
	
		static 
		{
			System.out.println("static init block");
		}
		
	public Box() {
		super();
		//Hier werden die Anweisungen aus den Init-Blocks eingetragen, falls welche gibt!
		this.a = 1;
		this.b = 2;
		this.c = 3;
		
	}
	public Box(int a) {
		
		this.a = a;
		this.b = 2;
		this.c = 3;
		
	}
	public Box(int a, int b) {
		
		this.a = a;
		this.b = b;
		this.c = 3;
	
	}
	public Box(int a, int b, int c) {
	    
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	@Override
	public String toString() {
		return "Box [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
}