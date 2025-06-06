package ProjecktLuois.java;
import java.util.*;
//Asteroid
public class louis{    
	public static void main(String[] args) {
		int[][] field = new int[10][10];        
		field = position(field);        
		hit(field);        
		field_(field);    }    
	public static final String RESET = "\033[0m";  
	// Reset der Farbe   
	public static final String RED = "\033[31m";   
	// Rot    
	public static final String GREEN = "\033[32m"; 
	// Grün    
	public static void field_(int[][] field) {        
		for (int i = 0; i < field.length; i++) {    
			System.out.print(" _ ");        }        
		System.out.println();        
		for (int[] row : field) {            
			for (int cell : row) {                
				if (cell == 0) {      
					System.out.print("|_|");            
					} 
				else {        
					if (cell == 9) {         
						System.out.print("|" + GREEN + cell + RESET + "|");   
						} 
					else {                 
						System.out.print("|" + RED + cell + RESET + "|");     
						}                }            }  
			System.out.println();        }    }   
	public static int[][] hit(int[][] a) {     
		Random rand = new Random();       
		for (int i = 0; i < 10; i++) {          
			int row = rand.nextInt(a.length);          
			int col = rand.nextInt(a[i].length);           
			int met = rand.nextInt(2) + 1;          
			if (a[row][col] == 9) {               
				System.out.println("We got a Hit!");        
				}        
			a[row][col] = met;        }  
		return a;    } 
	public static int[][] position(int[][] a) {     
		Random rand = new Random();      
		int row = rand.nextInt(a.length);     
		int col = rand.nextInt(a[row].length);      
		a[row][col] = 9;        return a;    }}

