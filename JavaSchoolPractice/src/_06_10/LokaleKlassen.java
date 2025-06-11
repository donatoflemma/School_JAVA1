package _06_10;

import java.util.Comparator;

/**
 * Eine Variante von inneren Klassen:
 * 									 - definiert innerhalb einer Methode
 * 									 - Scope = Methodenkörper, funktioniert genauso wie lokale Variable
 */
public class LokaleKlassen {

}

class C{
	

	public void m() {
		
		 int x = 23;
		
		
		class LocalClass{
			
			void f() {
				System.out.println(x); // Variable x muss effektiv final sein!!
			}
		}
		
		//x++;
		
		LocalClass v = new LocalClass();
		
		v.f();
		
		class MyClass implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}

			
			
		}
		
		Comparator<String> co = new Comparator<String>() {
			
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		
	}
	

}