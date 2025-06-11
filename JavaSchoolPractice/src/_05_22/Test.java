package _05_22;

public class Test {
	
	public static void main(String[] args) {
	
		Girokonto gk1 = new Girokonto("Paul", "Deutsche Bank", "1111", 1000, 500);
		Girokonto gk2 = new Girokonto("Peter", "Berliner Sparkasse", "2222", 800, 200);
		gk1.ueberweisen(gk2, 300);
		
		Sparkonto sk1 = new Sparkonto("Meyer", "Deutsche Bank", "3333", 1200, 1.25);
		Sparkonto sk2 = new Sparkonto("Petra", "Deutsche Bank", "4444", 1600, 2.25);
		gk1.ueberweisen(sk1, 500);
		sk1.ueberweisen(sk2, 200);
		sk2.ueberweisen(gk2, 10);
		
	
		
		
	}

}

class Base{
	protected int i = 3;
	public void m() {
		
	}
}

class Derived extends Base{
	int j = 5;
	public void f() {
		System.out.println(this.i);
	}
	
}