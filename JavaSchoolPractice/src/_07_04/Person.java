package _07_04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;



public class Person implements Comparable<Person>{
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
	
	public int getAge() {
		int age = LocalDate.now().getYear() - geburtsdatum.getYear() ;
		if(geburtsdatum.getDayOfYear() > LocalDate.now().getDayOfYear())
			age--;
		return age;
	}
}
