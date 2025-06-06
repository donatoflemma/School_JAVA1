package _05_27;

import _05_22.Girokonto;
import _05_22.Konto;
import _05_22.Sparkonto;

/**
 * Overriding Rules:
 * 					 - Sichtbarkeit nicht reduzieren
 * 					 - Signatur (Name der Methode + Parameterliste) nicht änern
 * 					 - Return type muss covariant sein!
 * 					 - Covariant:
 * 									A ist Covariant zu B, wenn A eine IST-EINE-Beziehung zu B hat! 
 */
public class Quiz {
public static void main(String[] args) {
	
	Derived d = new Derived();
	int a = 23;
	d.m(a);
			
}
}

class Base{
	public void m(int x) {
		System.out.println("m(x)");
	}
	
	protected Konto f(double x) {
		return new Girokonto(null, null, null, x, x);
	}
}

class Derived extends Base{
	@Override
	public void m(int s) {
		System.out.println("m(s)");
	}
	
	@Override
	public Sparkonto f(double x) {
			// TODO Auto-generated method stub
			return new Sparkonto(null, null, null, x, x);
					
		}
}