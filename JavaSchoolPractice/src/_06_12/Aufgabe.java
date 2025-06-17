package _06_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PropertyResourceBundle;
import java.util.function.Function;
import java.util.function.Predicate;

public class Aufgabe {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<String>(Arrays.asList(new String[] {"Alice", "Bob", "Chris", "Nico", "Jana", "Alex", "Adrian"}));
		
//		System.out.println(ofLengthGreatherThan4(names)); // Alice, Chris, Adrian
//		System.out.println(startsWithVowels(names));
		
		
		System.out.println(filter(names, (String t) -> t.length() <= 4));
		
		
		System.out.println(filter(names, (String t) -> 
				{
				char start = t.charAt(0);
				return start  == 'A' || start == 'E' || start == 'I' || start == 'O'  || start == 'U';
				}
			));
		
		
	}
	
	
	
//	public static List<String> ofLengthGreatherThan4(List<String> names){
//		/**
//		 * Gebe alle Elemente aus strs, die mindestens aus fünf Zeichen bestehen
//		 */
//		 List<String> result = new ArrayList<String>();
//		 for (String str : names) {
//			if(str.length() >= 5)
//				result.add(str);
//		}
//		 return result;
//	}
//	
//	
//public static List<String> startsWithVowels(List<String> names) {
//	 List<String> result = new ArrayList<String>();
//	 for (String str : names) {
//		 char start = str.charAt(0);
//		if(start  == 'A' || start == 'E' || start == 'I' || start == 'O'  || start == 'U'  )
//			result.add(str);
//	}
//	 return result;
//}


public static List<String> filter(List<String> names, Predicate<String>  criteria){
	 List<String> result = new ArrayList<String>();
	 for (String str : names) {
		if(criteria.test(str))
			result.add(str);
	}
	 return result;
}
}
