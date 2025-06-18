package _06_18;



/**
 * Throwable hat zwei Kinder:
 * 								Error
 * 								Exception
 * 
 * Error und RuntimeExceptions (auch Klassen, die von Error und RuntimeException abgeleitet sind) sind unchecked:
 * 			-> Compiler zwingt nicht die Behandlung und die Deklaration
 * 			-> Wenn nicht behandelt, führen zum Programmabbruch zur Laufzeit
 * 
 * Beispiele für Error:
 * 						-> StackOverflowError
 * 						-> AssertionError
 * 						 ...
 * 
 * Fehlerklassen, die mit Error bzw Runtime Exception keine IST-EINE Beziehung aufweisen sind Checked:
 * 
 * 				-> Compiler zwingt die Deklaration und die Behandlung!
 */
public class CheckedVsUnchecked {
	
	public static void main(String[] args)  {
		
		
	  // m();
		
		
		try {
			m2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			m3();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		m4();
		
		System.out.println("normal termination");
		
	}
	
	static void m() /*throws Error*/ {
		throw new Error();
	}
	
	static void m2() throws Throwable {
		throw new Throwable();
	}
	
	static void m3() throws Exception{
		throw new Exception();
	}
	
	static void m4()  /*throws RuntimeException*/{
		throw new RuntimeException();
	}
	/**
	 * Eine Kurze Beschreibung, was die Methode macht
	 * 
	 * @param x
	 * @return
	 * @throws NegativeException
	 * @throws ZeroException
	 */
	static int m5(int x) throws NegativeException, ZeroException {
		if(x == 0)
			throw new ZeroException();
		else if (x < 0)
			throw new NegativeException();
		else
			return 2 *  x + 1;
	}
	

}
