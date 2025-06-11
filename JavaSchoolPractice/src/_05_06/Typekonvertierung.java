package _05_06;
/*
 * type conversion, cast operator (explicit cast, implicit cast) , Promotion (Windening), Shortening
 * 
 * Safe (Promotion, widening , Implicit):
 * 
 * 			byte -> short -> int -> long -> float ->double
 * 		unsafe(Narrowing, Shortening);
 * 			double -> float -> long -> int -> short -> byte
 * */
public class Typekonvertierung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 127;
		byte b = (byte)x; // explicit cast (shortening:  31 bits --> 8 bits)
		
		System.out.println("x = " + x + ", b =" + b);
		
		System.out.println(Integer.toBinaryString(127));
		
		long n = x; // Implicit  non mi da problemi perche rientra nella capacita del long 

	}

}
