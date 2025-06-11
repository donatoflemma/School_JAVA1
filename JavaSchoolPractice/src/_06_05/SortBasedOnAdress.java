package _06_05;

import java.util.Comparator;

public class SortBasedOnAdress implements Comparator<Teilnehmer>{

	@Override
	public int compare(Teilnehmer t1, Teilnehmer t2) {
	        
		return t1.getAnschrifft().compareTo(t2.getAnschrifft());
	
		
	}

}

// Paul-Robeson-Str. 34, 10439 Berlin
//Paul-Robeson-Str 34, 10440 Berlin
