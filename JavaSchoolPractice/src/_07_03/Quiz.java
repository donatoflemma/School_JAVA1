package _07_03;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1. Schaut ihr Euch in der Klasse Files und Paths die Var-Arg Methoden an!
 *     
 *     
 *     			- Files.write
 *     			- Files.readAllLines
 *     			- Files.createFile
 *     			- Files.createDirectories bzw createDirectory
 *     			- Paths.get
 *     
 *   2. Was sind die Vorteile von var-arg Parameter  :
 *   													einfacher und sauberer Code
 *   													Man kann trotzdem Array übergeben => Flexiblität, Kompatibel (abwärts) 
 */
public class Quiz {
public static void main(String[] args) {
	Path p = Paths.get("test.txt");
	p = Paths.get("a",  "b", "c", "test.txt");
	

}
}
