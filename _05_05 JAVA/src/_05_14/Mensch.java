package _05_14;
/**
* attribute
* 
*Konstruktoren
* 				1. Jede Klasse in Java hat mindstens ein Kostruktor
* 			
* 				-> Wenn wir explizit keinen Konstruktor agegeben haben , dann generert der 
* 					Compiler automatisch sog. default Contructor
* 
* default Contructor:
* 					- ist Parameterlos
* 					- ist public
* 					- Die Attribute der klasse werden mit default values initialisiert
* 
*Datentyp                   default value
*byte, short , int, long		   0
*char					           zero charachter
*float, double                     0.0
*boolean						   false
*
*Referenzdatentype				   null
*
*
*Konstruktor:
*			- Haouptaufgaben: Attributen initialisieren
*			- Eine explizit nicht initialisiert Attribut hat eine default value 
*			- Korrektheit:
*						- Es soll immer gülgiges Objekt entstehen
*						-
*					
**/
	
public class Mensch {
/*
 * Attribute
 * */
double weight;
double height;
/*
 * Konstruktoren
 * */
Mensch(double weight, int height){
	if (weight < 40 || weight >150)
		this.weight = weight;
	if (weight < 90 || weight >220)
		this.height = height;
	
}
/*
 * Methoden
 * */
public static void main (String[] args) {
	Mensch m = new Mensch (58.5,173);
	System.out.println("weight of m = " + m.weight + ", height of m = " + m.height);
}
}
