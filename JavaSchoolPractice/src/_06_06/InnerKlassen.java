package _06_06;
/**
 * Innere Klassen:
 * 					1. Regular inner classes
 * 					2. Nested inner classes 
 * 					3. Local classes
 * 					4. Annonymous inner classes 
 */
public class InnerKlassen {

}


// 1
/**
 *  Vergleichbat mit Attributen und Methoden
 */
class Outer{
	private int x = 10;
	public   class Inner{
		private int y = 20;
		
		public void foo() {
			System.out.println(this.y);
			//System.out.println(this.x);
			Outer v = new Outer();
			System.out.println(v.x);
		}
	}
	
	public void go() {
		Outer ot = new Outer();
		System.out.println(ot.x);
		//System.out.println(ot.y);
		Inner in = new Inner();
		System.out.println(in.y);
		
	}
}

//3 
/**
 * Lokale Klassen:
 * 
 * Vergleichbar mit lokaler Variable
 */
class A{
	void bar() {
		int i = 21;
		
		class B{
			void m() {
				System.out.println(i);
			}
		}
		
		B b = new B();
		b.m();
	}
}
