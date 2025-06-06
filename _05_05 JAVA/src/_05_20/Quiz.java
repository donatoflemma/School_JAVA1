package _05_20;

public class Quiz{
public static void main(String[] args) {
	//Base b = new Base();
	
	Derived d = new Derived();
	
	
}
}

class Base extends Object{
	public Base(String s) {
		super();
		System.out.println("Base construction");
	}
	public Base() {
		super();
	}
}

class Derived extends Base{
	
	public Derived() {
		super();
		//super("Base"); // Base()
		System.out.println("Derived construction");
	}
}

class Box extends Object{
	int i;
	public Box(int i) {
		super();
		this.i = 0;
		
	}
	
}