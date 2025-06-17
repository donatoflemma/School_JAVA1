package _06_13;

import java.util.Arrays;

public class Zeichenkette {
	
	public static void main(String[] args) {
		
//		String e = new String(); // alternativ: ""
//		
//		System.out.println(e.length()); // 0
//		System.out.println("".length()); //0
//		System.out.println(" ".length()); //1
//		
//		
//		char [] ca = {'a','b', 'c'};
//		
//		String sa = new String(ca);  // deep copy
//		
//		ca[0] = 'x';
//		System.out.println(Arrays.toString(ca)); //[x,b,c]
//		
//		System.out.println(sa);//abc
		
		String s1 = "Bob";//String Constant Pool Object
		String s2 = new String(s1);
		String s3 = "Bob"; // String Constant Pool Objet
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s1);
		System.out.println("Bob");
		
		
		
		
		
		
	}

}
