package _06_20;

import java.time.LocalTime;

import Prog1Tools.IOTools;

/**
 * keywords: throws, throw, try, catch
 * 
 * API:
 * 			- Throwable
 * 			- Error, Exception (RuntimeException, Checked Exceptions)
 * 			- RuntimeException und Error sind unchecked
 * 
 * Aufgabe 1:
 * 				- Analysiere den Code für die Klasse Punkt und Kreis, wo erfoderlich ist, baue den Exception Mechanismus ein
 * 
 */

class ParameterException extends Exception{
	
	public ParameterException(String s) {
		super(s);
	}
}

class ParameterISNegativeException extends ParameterException{
	
	public ParameterISNegativeException(String message) {
		super(message);
	}
}

class ParameterISOutOfBoundException extends ParameterException{
	public ParameterISOutOfBoundException(String s) {
		super(s);
	}
}
public class Zusammenfassung {
	/**
	 * 
	 * @param 
	 * @return  Die Fakulität von n
	 * 
	 * Fakulität (n):
	 * 					Fakul(0) = 1
	 * 					Fakul(1) = 1
	 * 					Fakul(2) = 2 * 1 = 2
	 * 					Fakul(3) = 3 * 2 * 1 = 6
	 * 				    Fakul(4) = 4 * 3 * 2 * 1 = 24
	 * 					...
	 * 
	 * 					Fakul(n) = n * (n-1) * (n-2) ... *1
	 *  Die Fakulität ist mathematisch nur für nicht-negative Zahlen definiert. 
	 * @throws ParameterISNegativeException 
	 */
	
	/**
	 * 
	 * @param n
	 * @return
	 * @throws ParameterISNegativeException
	 * @throws ParameterISOutOfBoundException 
	 */
	public static int fakul(int n) throws ParameterException{
		
	
		
		// Sonderfall (Ausnahme = Exception)
		
		if(n < 0)
			throw new ParameterISNegativeException("Fakulität ist nur für nicht negative Zahlen definiert: " + n);
		
		else if (n > 13)
			 throw new ParameterISOutOfBoundException("Zahl ist zur groß: " + n);
		
		// normal -> n ist nicht- negativ (>= 0)
		int result = 1;
		for(int i = 1; i <= n; i++)
			result *= i;
		return result;
	}

	public static void main(String[] args) {
		try {
			System.out.println(fakul(IOTools.readInt("n: ")));
			
		}
		
		catch (ParameterISNegativeException | ParameterISOutOfBoundException e) {
			System.out.println(e.getMessage());
			
		}
//		catch (ParameterISOutOfBoundException e) {
//			System.out.println(e.getMessage());
//			
//		}
		catch (ParameterException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		try {
		Kreis k = new Kreis(0, new Punkt(0, 0));
		System.out.println("k = " + k);
		System.out.println("Fläche = " + k.area());
		k.setRadius(-3.5);
		System.out.println("k = " + k);
		System.out.println("Fläche = " + k.area());
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("normal termination");
		
		
	}
}