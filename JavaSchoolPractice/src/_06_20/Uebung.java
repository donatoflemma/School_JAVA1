package _06_20;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import Prog1Tools.IOTools;
/**
 * 1. Implementiere die Methode toString der Klassen Punkt und Kreis entsprechend!
 * 
 * 2. Definiere eine Methode parse, in der Klassen Punkt und Kreis, die aus einem Text (String) jeweis Punkt bzw Kreis Objekt für 
 *  den Aufrufer zurück gibt. 
 */
public class Uebung {
	
	
public static void main(String[] args) {
	
	System.out.println("Test...: " + Arrays.toString("abc".split("b"))); // ["a', "c"]
	System.out.println("Test...: " + Arrays.toString("abc".split("x"))); // 
	System.out.println(LocalTime.of(12, 13));
	System.out.println(new ArrayList<Integer>(Arrays.asList(1,2,3,8,9)));
	System.out.println(LocalDate.of(2025,6, 20));
	
	System.out.println(new Punkt(2.3, 4.5)); // erwartet: (2.3, 4.5)
	
	System.out.println(Punkt.parsePunkt("(0.25, 0.75"));
	System.out.println(Punkt.parsePunkt(IOTools.readLine("Punkt: ")));
	System.out.println(new Kreis(1.0, new Punkt(0, 0)));// erwartet: (0.0, 0.0) : 1,0
}
}
