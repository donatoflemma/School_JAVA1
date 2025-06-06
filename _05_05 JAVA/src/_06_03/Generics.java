package _06_03;

import java.util.ArrayList;

/**
 * Primitive Datentypen									Wrapper Klassen
 * 
 *	 boolean											Boolean
 *   byte												Byte
 *   short												Short
 *   char												Character
 *   int												Integer
 *   long												Long
 *   float												Float
 *   double												Double
 */

public class Generics {
public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<>();
	ArrayList<Integer> ints = new ArrayList<>();
	

	
	names.add(new String("Bob"));
	System.out.println(names.size());
	names.add(new String("Alice"));
	names.add(new String("Chris"));
	System.out.println(names.size());
	System.out.println(names);
	names.add(1, "Stefan");
	
	System.out.println(names);
	Flasche<Bier> bf;
	Flasche<Wein> wf;
	Flasche<Wasser> wasserF;
	
	// Semantisch  nicht sauber!!
//	Flasche<String> sf;
//	Flasche<Integer> ix;
}
}

class Getraenk{
	
}
class Wasser extends Getraenk{
	
}

class Wein extends Getraenk{
	
}

class Bier extends Getraenk{
	
}



/**
 * 
 * Eine generische Klasse:
 * 						  - Eine Parameterisierte Klasse (Parameter vergleichbar mit Methoden)
 * 						  - t steht für beliebiger Datentyp (primitive Datentypen sind ausgeschlossen)!
 */
class Flasche<T extends Getraenk>{
	private T content;

	public Flasche(T content) {
		super();
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	public boolean istLeer() {
		return this.content == null;
	}
}

//class BierFlasche{
//	private Bier content;
//	public BierFlasche(Bier content) {
//		this.content = content;
//	}
//	public Bier getContent() {
//		return content;
//	}
//	public void setContent(Bier content) {
//		this.content = content;
//	}
//	
//	public boolean isLeer() {
//		return content == null;
//	}
//	
//}
//class WasserFlasche{
//	private Wasser  content;
//
//	public WasserFlasche(Wasser content) {
//		super();
//		this.content = content;
//	}
//
//	public Wasser getContent() {
//		return content;
//	}
//
//	public void setContent(Wasser content) {
//		this.content = content;
//	}
//	
//	public boolean istLeer() {
//		return this.content == null;
//	}
//}
//
//class WeinFlasche{
//	private Wein content;
//	
//	public WeinFlasche(Wein content) {
//		this.content = content;
//	}
//
//	public Wein getContent() {
//		return content;
//	}
//
//	public void setContent(Wein content) {
//		this.content = content;
//	}
//	
//	public boolean istLeer() {
//		return this.content == null;
//	}
//	
//}