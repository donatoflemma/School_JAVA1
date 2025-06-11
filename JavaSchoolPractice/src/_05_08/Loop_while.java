package _05_08;

import Prog1Tools.IOTools;
/**
 * 
 * syntax while:
 * 
 * 				 while(Bedingung)
 * 						{
 * 							Anweisungen
 * 						}
 *
 */
public class Loop_while {
public static void main(String[] args) {
	
	int n = IOTools.readInt("n : "), m = IOTools.readInt("m: ");
	
	if(n> m) {
		int temp = n;
		n = m;
		m = temp;
	}
	
	int sum = 0;
	
//	for(int x = (n % 2== 1) ? n : m; x <= m;x+= 2) {
//		System.out.print(x + " ");
//		sum += x;
//		
//	}
	
	int x = (n % 2== 1) ? n : m; 
	
	while(x <= m) {
		System.out.print(x + " ");
		sum += x;
		x+= 2;
		
	}
	
	System.out.println();
	System.out.println("sum = " + sum);
}
}
