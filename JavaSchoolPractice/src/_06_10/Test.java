package _06_10;

public class Test {
	

public static void main(String[] args) {
	
	Outer o = new Outer(12);
	Outer.Inner i = o.new Inner(15) ;
	Outer.InnerS s = new Outer.InnerS(25);
	
	Outer.Inner j = new Outer(3).new Inner(21);
	
	int x = o.getX();
	int y = i.getY();
	
}
}

/**
 * Innere Klasse = Eine Klasse als Mitglieder (Vergelcihbar mit Attribute und Methoden) einer Klasse
 */
class Outer{
	
	private int x;
	public Outer(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public class Inner{
		private int y;
		public Inner(int y) {
			this.y = y;
		}
		public int getY() {
			return y;
		}
		
		
		public void go() {
			System.out.println(this.y);
			System.out.println(x);// Zugriff auf private Elemente der äußeren Klasse ist zulässig
			
		}
		
	}
	public static void sm() {
		//...
		Outer o = new Outer(0);
		
		System.out.println(o.x);
	}
	
	public static class InnerS{
		private int z;
		public InnerS(int z) {
			this.z = z;
		}
		public void bar() {
			System.out.println(z);
			
			Inner v = new Outer(1).new Inner(0);
			System.out.println(v.y);
			 
			Outer o = new Outer(0);
			System.out.println(o.x);
		}
	}
	
public void foo() {
	System.out.println(this.x);
	System.out.println(new Inner(15).y);//Zugriff auf private Elemente der inneren Klasse ist zulässig
}
}