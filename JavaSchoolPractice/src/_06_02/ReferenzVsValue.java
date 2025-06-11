package _06_02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

/**
 * Value Types(Wert-Typen): Primitive Datentypen
 * 
 * Reference Types (Referenz-Typen): Array, Klassen, Interfaces, Enums
 */
public class ReferenzVsValue {

	public static void main(String[] args) {
		int i = 3;
		int j = i; // Value Assignment: Inhalt der Variable i wird kopiert und an j zugewiesen
		System.out.println("i = " + i + ", j = " + j);// i = 3, j = 3
		i++;
		System.out.println("i = " + i + ", j = " + j);// i = 4, j = 3
		Person p = new Person(65, 189);
		
		Person q = p;// Referenz Assignment, es findet keine Kopierung statt: q wird auf dasselbe Objekt auf dem Heap referenzieren (zeige, verweisen)
		
		System.out.println("p = " + p.toString() + ", q = " + q.toString());
		p.weight = 70;
		System.out.println("p = " + p.toString() + ", q = " + q.toString());
		
		System.out.println(p.hashCode() + ", " + q.hashCode());
		
		// 
		
		int [] ia = new int[3];// [0, 0, 0]
		int [] ja = new int[3];// [0, 0, 0]
		
		System.out.println(p == q);// true , p und q sind identisch (referenzieren auf ein und dasselbe Objekt)
		j = 4;
		System.out.println(i == j);//true, Inhaltsvergleich
		System.out.println(ia == ja);//false, ia und ja verweisen auf zwei Objekte, die nur onhaltlich gleich sind
		
		
		System.out.println(Arrays.equals(ia, ja));////true, Die equals Methode überprüft Inhalsgleichheit
		
		Person peter = new Person(72, 185);
		Person nico = new Person(72, 185);
		
		System.out.println(peter == nico); // false
		System.out.println(peter.equals(nico));//true???
		
		String[] names = {"Bob", "Alice", "Chris"};
		
		System.out.println(Arrays.binarySearch(names, "Alice"));
		
		
	}
}


class Person{
	double weight;
	int height;

	public Person(double weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, weight);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return height == other.height && Double.doubleToLongBits(weight) == Double.doubleToLongBits(other.weight);
	}
	

}