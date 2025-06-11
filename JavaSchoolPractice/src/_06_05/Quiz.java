package _06_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Konvertierungen:
 * 
 * 					 -> Array - List:  Arrays.asList(array)
 * 					 -> List - Array:  list.toArray()
 * 					
 */

public class Quiz {
	public static void main(String[] args) {
		String [] names_array = {"Bob","Chris", "Alice"};
		
		List<String> names_list =  new ArrayList<String>(Arrays.asList(names_array));
		
		
		
//		for (String name : names_array) {
//			names_list.add(name);
//		}
		
		
		System.out.println("----- Array unsortiert.....");
		System.out.println(Arrays.toString(names_array));
		System.out.println("-----List unsortiert....");
		System.out.println(names_list);
		
		// Gebe den Inhalt vom Array und von der Lsit sortiert auf der Konsole aus. 
		
		Collections.sort(names_list); //  List sorted naturally (based on Comparable) = Aufsteigend
		System.out.println("----List sorted ascending....");
		System.out.println(names_list);
		
		Arrays.sort(names_array); // Array sorted naturally (based on Comparable) = Aufsteiegend
		System.out.println("----Array sorted ascendinh....");
		System.out.println(Arrays.toString(names_array));
		
		// wir wollen die Elemente im Array bez in der Liste (Namen) absteigend sortieren
		
		Arrays.sort(names_array, new SortStringsDescending());
		System.out.println("----Array sorted descending....");
		System.out.println(Arrays.toString(names_array));
	}

}

class SortStringsDescending implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1);
	}
	
}
