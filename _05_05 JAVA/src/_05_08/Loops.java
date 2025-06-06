package _05_08;
/**
 * 
 * 1. Zähl-Schleife (for Loop)
 * 2. Kopfgesteuerte Schleife (while Loop)
 * 3. Fußgesteuerte Schleife (do while Loop)
 * 
 * 
 * 1. for loop:
 *             basic for loop:
 *             
 *             for (init ;Bedingung ;fortsetzung )
 *             			{
 *             				Anweisungen
 *             			}
 *             
 *         init wird nur 1x (bei der ersten Iteration) ausgeführt. 
 *
 */
public class Loops {
public static void main(String[] args) {
	
	// Gebe die ersten 10 natürlichen Zahlen auf der Konsole aus. 
	
//	
//	for (int i = 1 ; i < 11; i++)
//		{
//		System.out.print(i + " ");
//		} 
	

//	int i = 1;
//	for ( ; i < 11; i++)
//		{
//		System.out.print(i + " ");
//		}
//	System.out.println();
//	System.out.println("i = " + i);
	
//	int i = 1;
//	for ( ; i < 11; )
//		{
//		System.out.print(i + " ");
//		i++;
//		}
//	System.out.println();
//	System.out.println("i = " + i);
	
	int i = 1;
	for (; i < 11;System.out.print(i + " "), i++ )
		{
		
		}
	System.out.println();
	System.out.println("i = " + i);
	
	for ( ;  ;  )
	{
		System.out.println("Bob");
	}
}
}
