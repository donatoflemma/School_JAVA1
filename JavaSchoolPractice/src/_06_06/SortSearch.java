package _06_06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import _06_05.Anschrifft;
import _06_05.Teilnehmer;



public class SortSearch {
	/**
	 * 
	 * Die Teilenehmerliste nach Name aufsteigend sortiert auf der Konsole ausgeben. Wenn zwei Teilnehmer gleichen Name haben, dann sollen sie nach 
	 * Geburtsdatum Sortiert werden. Lasse die Klasse Teilnehmer unverändert. 
	 * 
	 * 
	 * Beispiel:
	 * 			 Peter Meyer, 19.03.1985
	 * 			 Peter Meyer, 21.05.1981
	 * 
	 *Nach Sortierung:
	 *					Peter Meyer, 21.05.1981
	 *					Peter Meyer, 19.03.1985
	 */
	
	private static void m(List<Teilnehmer> teilenehmerListe) {
		
		
		
//		Comparator<Teilnehmer> c = new Comparator<Teilnehmer>() {
//
//			@Override
//			public int compare(Teilnehmer t1, Teilnehmer t2) {
//				if(t1.compareTo(t2) == 0)
//					return t1.getGeburtsdatum().compareTo(t2.getGeburtsdatum());
//				
//				return t1.compareTo(t2);
//			}
//		};
		
		
		Collections.sort(teilenehmerListe, new Comparator<Teilnehmer>() {

			@Override
			public int compare(Teilnehmer t1, Teilnehmer t2) {
				if(t1.compareTo(t2) == 0)
					return t1.getGeburtsdatum().compareTo(t2.getGeburtsdatum());
				
				return t1.compareTo(t2);
			}
		});
		
		
		for (Teilnehmer teilnehmer : teilenehmerListe) {
			System.out.println(teilnehmer);
		}
		
	}
	

public static void main(String[] args) {
	
	List<Teilnehmer> tL = new ArrayList<Teilnehmer>();
	tL.add(new Teilnehmer("Peter Meyer", new Anschrifft("***", "---", "++++"), LocalDate.of(1984, 5, 21)));
	tL.add(new Teilnehmer("Paul Otto", new Anschrifft("***", "---", "++++"), LocalDate.of(1980, 5, 13)));
	tL.add(new Teilnehmer("Piya Schürmann", new Anschrifft("***", "---", "++++"), LocalDate.of(1979, 4, 15)));
	tL.add(new Teilnehmer("Patrick Mehrmann", new Anschrifft("***", "---", "++++"), LocalDate.of(1991, 12, 21)));
	tL.add(new Teilnehmer("Peter Meyer", new Anschrifft("***", "---", "++++"), LocalDate.of(1982, 5, 21)));
	tL.add(new Teilnehmer("Peter Meyer", new Anschrifft("***", "---", "++++"), LocalDate.of(1983, 5, 21)));
	m(tL);


	
}
}
