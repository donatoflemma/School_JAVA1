package _07_04;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uebung {
	
	/**
	 * 
	 * Definiere eine Methode, die die Summe beliebiger Anzahl von ganzen Zahlen bildet und die Summe zurück gibt.
	 */
	public static int summof(int... numbers) {
		int sum = 0;
		
		for (int number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	public static int summof_v2(int... numbers) {
		
		
		return Arrays.stream(numbers).sum();
	
	}
	/**
	 * 
	 * Nehme die Klasse Person von gestern!
	 * 
	 * 
	 * Definiere eine Methode, die eine beliebige Anzahl von Personen entgegen nimmt und den jungste Person  auf der Konsole ausgibt.
	 */
	
	
	public static void youngestPerson(Person...persons ) {
		int minage = Arrays.stream(persons).map(p-> p.getAge()).min((x, y) -> x.compareTo(y)).get();
		
		System.out.println(Arrays.stream(persons).filter(p -> p.getAge() == minage).collect(Collectors.toList()).get(0));
	}
	/**
	 * 
	 * Definiere eine Methode, die eine belibige Anzahl von Personen entgegen nimmt und alle Personen, die älter als 18 Jahre sind, sortiert als Liste zurück gibt. 
	 */
	
	public static List<Person> getAdults(Person...persons){
		return Arrays.stream(persons).filter(p -> p.getAge() > 18).sorted().collect(Collectors.toList());
	}
public static void main(String[] args) {
	System.out.println("Die summe aus 1, 3, 5, 7 und 9: " + summof(1,3,5,7,9));//25
	
	youngestPerson(new Person("Bob", LocalDate.of(1960, 12, 21)), new Person("Alice", LocalDate.of(1965, 12, 15)), new Person("Chris", LocalDate.of(1980, 5, 25)));
	
	Person[] pers = {
					 new Person("Andrea", LocalDate.of(1995, 12, 21)),
					 new Person("Paul", LocalDate.of(1995, 12, 21)),
					 new Person("MArtin", LocalDate.of(2010, 12, 21)),
					 new Person("Janine", LocalDate.of(2004, 12, 21)),
					 new Person("Josef", LocalDate.of(2016, 12, 21)),
					};
	System.out.println(getAdults(pers));
}
}
