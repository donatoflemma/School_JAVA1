package _06_10;

/**
 * Aufgabe 1:
 * 
 * Erstelle ein Interface Ansprechbar mit der Methode hey(). In der main() -
 * Methode der Klasse Task erstelle eine anonyme innere Klasse, die das
 * Interface implementiert und hey() überschreibt, sodass "'Servus, ich bin
 * namenslos" ausgegeben wird. Rufe die Methode hey auf!
 * 
 * 
 * Aufgabe 2:
 * 
 * Erstelle eine Klasse Outer. Die Klasse hat eine statische Attribut daten mit dem Wert 50. 
 * 
 * Definiere eine innere Klasse mit der Bezeichnung Nested. 
 * Die Klasse Nested soll eine Methode drucke() haben, die den Wert von
 * daten ausgibt.
 * 
 * Schreibe einen Code in der main - Methode der Klasse Task, die Funktionalitäten der Klasse aufruft.
 * 
 * 
 * Aufgabe 3:
 *  
 *  
 *  Definiere eine Klasse mit der Methode getArrayGröße, die die Länge des Arrays args (Parameter von der main -Methode) auf der Konsole ausgibt. 
 *  Die Methode ist parameterlos!
 */

interface Ansprechbar{
	void hey();
	
	
	
}
class MyOuter{
	private static  int data = 50;
	
	public static class Nested{
		public static void drucke() {
			System.out.println(data);
		}
	}
	
	public class RegularInner {
		public void drucke() {
			System.out.println(data);
		}
	}
	
	
	
}

public class Task {

	public static void main(String[] args) {
		//Aufgabe 3
		class Lokal{
			void getArrayGroesse() {
				System.out.println(args.length);
				for (String string : args) {
					System.out.print(string  + " ");
					
				}
				System.out.println();
			}
		}
		new Lokal().getArrayGroesse();
		
       //Aufgabe 2
		MyOuter.Nested.drucke();
		
		new MyOuter().new RegularInner().drucke();
		
	    //Aufgabe 1
		
		Ansprechbar a = new Ansprechbar() {
			
			@Override
			public void hey() {
				System.out.println("Servus! Ich bin namenslos");
			}

			
		};
		
		a.hey();
		
		
		speak(new Ansprechbar() {
			
			@Override
			public void hey() {
				System.out.println("Gruß Gott!");
				
			}

			
		});
		
		speak(() -> System.out.println("Gruß Gott!"));
		
		
}
public static void speak(Ansprechbar p) {
		p.hey();
	}
}
