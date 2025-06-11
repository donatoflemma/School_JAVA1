package _05_30;

public class InitBlockQuiz {
	public static void main(String[] args) {
		System.out.println("start..");
		new Base();
		new Base("...");
		new Derived();
		new Derived("...");
		System.out.println("end");
	}

	static {
		System.out.println("static init...");
	}
}

class Base {
	{
		System.out.println("instance init block 1 of Base ");
	}
	static {
		System.out.println("static init 1 Block of Base");
	}

	public Base() {
		super();
		//Inits
		System.out.println("Base()");
	}

	public Base(String s) {
		super();
		//init blocks
		System.out.println("Base(String)");
	}

	{
		System.out.println("Instance Init Block 2 of Base");
	}
}

class Derived extends Base {
	{
		System.out.println("instance init block 1 of Derived ");
	}
	static {
		System.out.println("static init 1 Block of Derived");
	}

	public Derived() {
		super();
		//inits
		System.out.println("Derived()");
	}

	public Derived(String s) {
		System.out.println("Derived(String)");
	}

	{
		System.out.println("Instance Init Block 2 of Derived");
	}
}