package _07_03;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Test {

	/**
	 * 
	 * Die Personen in der Liste zeilenweise in eine Datei ausgeben und zwar in der Format: Bob, 1965-03-21 ausgibt und zwar nach Name sortiert.
	 * 
	 * Das Trennzeichen kann auch eventuell mit von Client fetgeletes Trennzeichen ersetzt werden
	 * @throws IOException 
	 * 
	 */
	public static void sort(List<Person> personen, Path pfad) throws IOException {
		Collections.sort(personen);
		List<String> pers = new ArrayList<String>();

		
		personen.stream().map(person -> person.format()).forEach(person -> pers.add(person));;
		
		Files.write(pfad, pers);
		
		
	}
	/**
	 * 
	 * @param personen
	 * @param year
	 * @return true, wenn in der Liste eine Person mit dem Geburtsjahr year beinhaltet ist, sonst false
	 */
	public static boolean contains (List<Person> personen, int year) {
		return  false;
	}
	/**
	 * 
	 * Gebe das Geburtsjahr der Personen mit , separiert aus der Konsole aus.
	 */
	public static void print(List<Person> personen){
		
	}
	public static void main(String[] args) throws IOException {
		
		sort(Arrays.asList(
				new Person("Chris",LocalDate.of(1980, 12, 23)),
				new Person("Alice", LocalDate.of(1971, 8, 31)),
				new Person("Bob", LocalDate.of(1950, 11, 28))), 
				
				Paths.get("personen.txt"));
	}
}

class Person implements Comparable<Person>{
	private String name;
	private LocalDate geburtsdatum;
	public Person(String name, LocalDate geburtsdatum) {
		this.name = name;
		this.geburtsdatum = geburtsdatum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getGeburtsdatum() {
		return geburtsdatum;
	}
	public void setGeburtsdatum(LocalDate geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", geburtsdatum=" + geburtsdatum + "]";
	}
	
	public String format(String... sep) {
		if(sep.length > 1)
			throw new IllegalArgumentException("Maximum ein Argument erwatet");
		if(sep.length == 0)
			return name + ", " + geburtsdatum;
		
		return name + sep + geburtsdatum;
			
	}
	
	
	@Override
	public int compareTo(Person o) {
		
		return name.compareTo(o.name);
	}
	
	
}
