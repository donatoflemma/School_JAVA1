package _06_12;

import java.util.function.Predicate;

/**
 * 1. Lambda Expression
 * 2. Functional Interfaces @FunctionalInterface
 * 3. Interfaces mit Konkrete Methoden: default & static
 */

interface MyInterface{
	public boolean m(int i);
}



public class Java8NeueFeatures {
public static void main(String[] args) {
	
	Predicate<String> p;
	C cObj = new C();
	//cObj.sm();
	I8.sm();
	I9.sm();
	
	//C.sm();
	
	MyInterface mi = ( j) -> {if (j > 0) return true; else return false;};
	
	
}
}

interface I8{
	public abstract void m();
	
	public default void dm() {
		
	}
	
	public static void sm() {
		
	}
}

interface I9{
	public abstract void f();
	public abstract void m();
	public default void  m2() {
		
	}
	public default void dm() {
		
	}
	
public static void sm() {
		
	}
}

class C implements I8, I9{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dm() {
		// TODO Auto-generated method stub
		
		I8.super.dm();
		
	}
	
}