package _06_02;

import java.awt.RenderingHints;
import java.util.ArrayList;

/**
 * Attribute und Methoden werden geerbt
 * 
 * -> Zusätzliche Attribute hinzufügen
 * -> zusätzliche Methoden hinzufügen
 * ->Evtl. geerbte Methode überschreiben, falls das Überschreiben erlaubt ist
 * 
 * Fortsetzung:
 * 				- final Methoden:
 * 									- das Überschreiben ist verboten
 * 				- final Klassen:
 * 									- die Verwerbung ist verboten
 */
public class Vererbung {
public static void main(String[] args) {
	Derivied d = new Derivied();
	d.b = 23;
	d.d = 34;
	d.foo();
	d.boo();
	d.go();
	
}
}


class MyList extends ArrayList{
	
}

/**
 * 
 */
abstract class Base{
	 int b;
	
	public void foo() {
		
	}
	public abstract final void go() ;
		
	
}

class Derivied extends Base{
	 int d;
	
	 public   void  boo() {
		
	}
	
	public final void go() {
		
	}
}
