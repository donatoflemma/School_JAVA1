package _05_20;

import _05_19.Artikel;

public class Zusammenfassung {
	 int i = 0;
	 static int j = 1;

	public static void main(String[] args) {
		
		//System.out.println(i);
		System.out.println(j);
		System.out.println(Zusammenfassung.j);
		//go();
		foo();
		Zusammenfassung.foo();
		
		// Zugriff auf Instanz-Elemente geht nur über ein Objekt
		
		
		System.out.println(new Zusammenfassung().i);
		
		new Zusammenfassung().go();
		
		Artikel.setMwst(21);
		
		System.out.println(new Artikel(2025, "xyz", 450));
	}
	
	 void go() {
		
	}
	 
	 static void foo() {
		 
	 }
}
