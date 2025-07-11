package _07_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileStream {
public static void main(String[] args) {
	List<String>  names =  new ArrayList<String>(Arrays.asList("Bob", "Alice", "Chris"));
	
	for (String name : names) {
		System.out.println(name);
	}
	
	
	//Java 8
	
	names.forEach(s -> System.out.println(s)); // Concise
	
	try {
		Files.lines(Paths.get("2025", "Winter", "Urlaub", "Suedtirol", "readme.txt")).forEach(s -> System.out.println(s)); // concise
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
