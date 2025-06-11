package _06_04;
import java.util.*;



public class Quiz  {
	public static void main (String[] args) {
	 String []	name_array = {"Bob","Chris","Alice"};
	 
	 List<String> name_list = new ArrayList<String>();
	 List<String> converte = new ArrayList<String>(Arrays.asList(name_array));
	 for (String name : name_array) {
		 name_list.add(name);
	 }
	 //System.out.println(Arrays.toString(name_array));
	 //System.out.println(name_list);
	 Collections.sort(converte);
	 Collections.reverse(converte);
	 System.out.print(converte);
	 
	}
   
	
	
}
