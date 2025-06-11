package _05_13;
/**
 * 
 *  Objekt Erzeugung:
 *  					new Konstruktor([Argumente])
 *  Zugriff auf Mitglieder:
 *  
 *  				v.Mtglieder, Mitglieder = Attribute oder Methode
 *  
 *  			Mensch paul = new Mensch(58.5, 173);
 *  
 *  			paul.getBMI()
 *  			paul.gewicht = 89;
 *  
 *  Member-Selection-Operator = .
 *
 */
public class Objekte {
public static void main(String[] args) {
	
	int i = 34;
	boolean b = true;
	String s = "Bob";
	int[] ia = {1,2,3};
	double [] da = new double[250];
	
	Mensch paul = new Mensch(58.5, 173);
	paul.gewicht = 89;
//	paul.groesse = 190;
	
	Mensch petra = new Mensch(55,163);
	
//	petra.gewicht = 55;
//	petra.groesse = 163;
	
	System.out.println(paul.gewicht);
	System.out.println(paul.groesse);
	
	System.out.println(petra.gewicht);
	System.out.println(petra.groesse);
	
//	double index = paul.getBMI();
//	String evalText = paul.evalBMI();
	
	System.out.println("i = " + i);
	System.out.println("paul = " + paul);
}
}
