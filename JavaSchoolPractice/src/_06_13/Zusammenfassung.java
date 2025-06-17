package _06_13;

public class Zusammenfassung {
public static void main(String[] args) {
	
	go(()  -> System.out.println("---"));
}

static void go(I p) {
	I.sm();
	p.df();
	p.m();
}
}

@FunctionalInterface
interface I{
	
	public abstract void m();
	
	
	default void df () {
		System.out.println("...");
	}
	static void sm() {
		System.out.println("+++");
	}
}