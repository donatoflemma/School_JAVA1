package _05_07;

import Prog1Tools.IOTools;

public class MonatslaengeErmitteln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = IOTools.readInteger("Bitte Monat eingeben (1....12): ");
		int year = IOTools.readInteger("Bitte Jahr eingebe: ");;
		int numberOfDays = 0;
		boolean Schaltjahr = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0));
		// the switch case come value acetta solo int e gli altri compatibili come (char,Byte,short)
		 switch (month) {
		 case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			 numberOfDays = 31;
			 break;
		 case 2:
			 if (Schaltjahr) 
				numberOfDays = 29;
			else 
				numberOfDays = 28;
		    break;
		 
		 case 4:case 6:case 9:case 11:
			 numberOfDays = 30;
			 break;
			 }
		 if (Schaltjahr == true) {
			 System.out.println(" Diese Monate hat :" + numberOfDays + " Tagen und den Jahr ist  Schaltjahr !!");
		 }
		 else {
			 System.out.println(" Diese Monate hat :" + numberOfDays + " Tagen und den Jahr ist nicht  Schaltjahr !! ");
		 }
		 
	}
}
			
		
