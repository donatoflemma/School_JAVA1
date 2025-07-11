package _06_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/**
 * Lernziele:
 * 				- Immutabliät
 * 				- Factory desseign
 * 				- Serialization / Deserialization
 * 				
 */

public class SerializationDeerialization {
public static void main(String[] args) {
	
	List<Integer> ints = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
	System.out.println(ints);
	


	
	
	
	
	
}
}

class Cource implements Comparable<Cource>, Serializable{
	 //Beschreibung 
	private final String beschreibung;
	// Start Uhrzeit
	private final LocalTime start;
	
	// End Uhrzeit
	private final LocalTime end;

	public Cource(String beschreibung, LocalTime start, LocalTime end) {
		super();
		this.beschreibung = beschreibung;
		this.start = start;
		this.end = end;
	}

	public String getBeschreibung() {
		return beschreibung;
	}
	public LocalTime getStart() {
		return start;
	}

	
	public LocalTime getEnd() {
		return end;
		
	}

	

	@Override
	public String toString() {
		return "Cource [beschreibung=" + beschreibung + ", start=" + start + ", end=" + end + "]";
	}
	
	public String format(String sep) {
		return beschreibung + sep + start + sep + end;
	}

	@Override
	public int compareTo(Cource o) {
		
		return beschreibung.compareTo(o.beschreibung);
	}

	@Override
	public int hashCode() {
		return Objects.hash(beschreibung, end, start);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cource other = (Cource) obj;
		return Objects.equals(beschreibung, other.beschreibung) && Objects.equals(end, other.end)
				&& Objects.equals(start, other.start);
	}
	

}

class CourceFactory{
	/**
	 * Funktionalitäten um Kurs Objekte zu generieren
	 */
	public static Cource of (String beschreibung, LocalTime start, LocalTime end) {
		return new Cource(beschreibung, start, end);
	}
	
	public static Cource parse(String cource, String sep) { 
		String [] tokens = cource.trim().split(sep);
		assert tokens.length == 3;
		return new Cource(tokens[0], LocalTime.parse(tokens[1]), LocalTime.parse(tokens[2]));
	}
	
	
}

class Schedule{
	/**
	 * Kurse verwalten:
	 * 					-> Eine Liste von Kursen (Objekte der Klasse Cource)
	 * 
	 * 1. Einfügen
	 * 2. Sortieren
	 * 3. Suchen
	 * 4. Löschen
	 * 5. Serialisieren (Alle Kurse in eine Datei schreiben)
	 * 6. Kurse aus einer Datei laden (Deserialisieren)
	 * 
	 */
	private List<Cource> cources = new ArrayList<Cource>();
	
	public void add (Cource c) {
		if(c == null)
			throw new NullPointerException("null doesnt represent a cource");
		 cources.add(c);
	}
	public void add(Cource[] cs) {
		
		cources.addAll(Arrays.asList(cs));
		cources.removeIf((e) -> e == null);
	}
	public void add (List<Cource> cs) {
	  
	   add((Cource[]) cs.toArray());
	}
	
	public void sort() {
		Collections.sort(cources);
	}
	public void sort(Comparator<Cource> rule) {
		Collections.sort(cources, rule);
	}
	public List<Cource> courcesOfName(String description){
		return cources.stream().filter((e) ->e.getBeschreibung().equalsIgnoreCase(description)).toList();
	}
	public List<Cource> courcesOfStart(LocalTime start){
		return  cources.stream().filter(c -> c.getStart().equals(start)).toList();
	}
	
	public void remove(Cource c) {
		cources.remove(c);
	}
	public void saveCourcesToFile(String pfad) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(pfad)))){
			oos.writeObject(cources);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void loadCourcesFromFile(String pfad) {
		//TODO
	}
}