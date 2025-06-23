package _06_23;

public class TryCatchFinally {
public static void main(String[] args) {
	System.out.println("Start");
	try {
		// Guarded region, hier könnte evtl. eine Ausnahme Objekt geworfen werden
		System.out.println("try");
		int i = Integer.parseInt("f3.2");
		System.out.println("i = " + i);
	} catch (Exception e) {
		// Ausnahmebehandlung
		
		System.out.println("cathc");
		int i = Integer.parseInt("f3.2");
		System.out.println("i = " + i);
	}
	finally {
		// Aufräumearbeit
		System.out.println("finally");
	}
	
	System.out.println("Fortsetzung");
	
	System.out.println("End");
}
}
