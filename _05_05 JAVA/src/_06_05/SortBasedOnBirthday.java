package _06_05;

import java.util.Comparator;

public class SortBasedOnBirthday  implements Comparator<Teilnehmer>{

	@Override
	public int compare(Teilnehmer o1, Teilnehmer o2) {
		
		return o1.getGeburtsdatum().compareTo(o2.getGeburtsdatum());
	}

}
