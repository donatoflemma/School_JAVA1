package _06_17;

//class Mathematik{
//	
//	static boolean error = false;
//	
//	static int divide (int a, int b) {
//		//normall Fall
//		if(b != 0)
//			{
//			error = false;
//			return a / b;
//			}
//		
//		//Sonder Fall -> mit 0 / ist nicht erlaubt
//		else{
//			error = true;
//			return 0; // falsch
//		  
//		}
//		
//	}
//	
//	/**
//	 * die Methode soll den Index von x in array a zurück geben
//	 */
//	static int indexOf(int[] a, int x){
//		for (int i = 0; i < a.length; i++) {
//			if(x == a[i])
//				return i;
//		}
//		return -1;// spezieller Wert zurück geben 
//	}
//}

public class Mathematik{
	

	
	public static int divide (int a, int b) throws NennerIstZeroException {
		if(b == 0) // Sonder Fall
			throw new NennerIstZeroException(b, "Ungültiger nenner");
		else // Normal Fall
			return a / b;
		
	}
	
	
	public static int indexOf(int[] a, int x) throws ElementDoesntExistInArrayException{
		for (int i = 0; i < a.length; i++) {
			if(x == a[i])
				return i;
		}
		//return -1;
		throw new ElementDoesntExistInArrayException(x + " ist im Array nicht enthalten!");
	}
}

