package _06_04;

import java.util.Comparator;

class ComparatorBasedOnName implements Comparator<Artikel>{

	@Override
	public int compare(Artikel o1, Artikel o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}