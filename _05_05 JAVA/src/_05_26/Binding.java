package _05_26;

/**
 * Early Binding (statisches Binden, frühes Binden):
 * 
 * -  Bindung zum Deklarationtyp (macht der Compiler)
 * 			
 * 				- Attribute und statische Methoden
 * 
 * 
 * Late Binding (dynamically Binding, spätes Binden)
 * 
 *  - Bindung zur Laufzeit (Runtime Type, das macht die Laufzeitumgebung) 
 *  		- Instance Methoden
 */
public class Binding {
public static void main(String[] args) {
	Base b = new Base();
	System.out.println(b.x);//10
	System.out.println(b.y);//Base.y -> 20
	b.m();//instance Methode ... Base.m
	b.f();// Base.f() -> static Methode ... Base.f
	
	Base p = new Derived();// Polymorphie
	System.out.println(p.x); // 10
	System.out.println(p.y); // 20 
	p.m();//instance Methode ... Derived.m
	p.f();//static Methode ... Base.f
}
}

class Base {
	int x = 10; // Instance Variable
	static int y = 20; // static Variable

	// Instance Methode
	void m() {
		System.out.println("instance Methode ... Base.m");
	}

	// static Methode
	static void f() {
		System.out.println("static Methode ... Base.f");
	}
   
}

class Derived extends Base {

	//Shadowing 
	int x = 100;
	static int y = 200;

	//Overriding
	void m() {
		System.out.println("instance Methode ... Derived.m");
	}

//static Methode
	static void f() {
		System.out.println("static Methode ... Derived.f");
	}
}