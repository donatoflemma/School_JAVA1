package _05_06;
/*
 * 
 * Expression:
 *			-Literal
 *			- Variable
 *			- Eine Zusammensetzung aus Literal, Varianble und Operatoren
 *			- Expression wird ausgewertet (entsteht ein wert)
 * */
public class Expression {

	public static void main(String[] args) {
	String s = "abc";
	String s2= s + "def";
	System.out.println(s2); 
	
	System.out.println(s2 + 700 + 2);// abcdef7002 in questo caso che abbiamo subito una String 
									  // converte immediatamente anche i numeri 
	System.out.println(700 + 2 + s2); // 702abcdef in questo caso troviamo subito i numeri e quindi
									// li addiziona e poi li converte come Stringhe 

	}

}
