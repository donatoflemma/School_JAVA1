package _05_23;

import _05_22.Girokonto;
import _05_22.Konto;
import _05_22.Sparkonto;

public class Polymorphie {
	
	static void print(Girokonto gk) {
		System.out.println("Girokonto");
		System.out.println(gk);
	}
	static void print(Sparkonto sk)
	{
		System.out.println("Sparkonto");
		System.out.println(sk);
	}
	
	public static void main(String[] args) {
		
//		
//		String s = new String();;
//		
//		Object o = new Object();
//		
		Girokonto gk = new Girokonto("Paul", "Deutsche Bank", "1234", 1200, 800);
//		
//		//Polymorphie
//		
//		Object obj = s; // String ist ein Object (class String extends Object)
//		
		Konto k = gk; // Ein Girokonto ist ein Konto (class Girokonto extends Konto)
		Konto kt = new Sparkonto("Peter", "Deutsche Bank", "97972", 500, 2.5);
		kt = gk;
//		kt = new Girokonto("Paul", "Deutsche Bank", "1234", 1200, 800);
		
		print(gk);
		print((Girokonto)kt);
		
	}

}
