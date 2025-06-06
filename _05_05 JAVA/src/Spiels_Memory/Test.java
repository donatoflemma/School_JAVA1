package Spiels_Memory;

import Prog1Tools.IOTools;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Test {
	public static void main (String [] args) {
		int userX;
		String userY;
		int cards = 0;
	
		boolean gradeZahl = false;
		int counter= 0;
		int counterPrint = 1;
		
		String alphabet [] = { "A", "B", "C", "D"};
		do {
			try {
				cards= IOTools.readInt("Bitte, geben Sie den Anzahl von Carten (Es soll eine grade Zahl sein und maximal 20 ): ");
				List<Cards> cardsArray = new ArrayList<>();
				//Cards[] cardsArray = new Cards[cards];
				if (cards % 2 != 1 | cards < 21) {
					int reihen = (int)(Math.sqrt(cards));
					int spalte = cards /reihen;
					
					gradeZahl = true;
					//System.out.println("den Anzahl von Carten :" + ReihenSpalten);
					// ######### COSA DEVO FARE NEL CODICE 1111
					// L´ITERAZIONE DEVE ESSERE PER DUE VOLTE 
					for (int n = 0;n < 2;n++) {
						//System.out.println("secondo giro ");
						for (int i = 1; i < (cards/2) + 1 ;i++,counter++) {
							//System.out.println("index: "+counter + "CardNummer:" + i);
							
					//cardsArray[counter] = new Cards(i,5,"A",true,"O");
					cardsArray.add(new Cards(i,5,"A",true,"O"));
					}}
					// mischia le carte 
					Collections.shuffle(cardsArray);
					
					//##################################### creazione griglia #############################################
					switch(cards) {
					  case 4:
					    //  2 x 2
						  for(int i = 0, a =2,corX=1; i < 2 ;i++ , a++,corX++) {
							cardsArray.get(i).setCordinateY("A");
							cardsArray.get(a).setCordinateY("B");
							
							cardsArray.get(i).setCordinateX(corX);
							cardsArray.get(a).setCordinateX(corX);
						  }
					   break;
					  case 6:
					    // 2 x 3
						  for(int i = 0, a=3,corX=1; i < 3 ;i++ , a++,corX++) {
								cardsArray.get(i).setCordinateY("A");
								cardsArray.get(a).setCordinateY("B");
								
								cardsArray.get(i).setCordinateX(corX);
								cardsArray.get(a).setCordinateX(corX);
							  }
					    break;
					  case 8:
					   //  2 × 4
						  for(int i = 0, a=4,corX=1; i < 4 ;i++ , a++,corX++) {
								cardsArray.get(i).setCordinateY("A");
								cardsArray.get(a).setCordinateY("B");
								
								cardsArray.get(i).setCordinateX(corX);
								cardsArray.get(a).setCordinateX(corX);
							  }
						break;
					  case 10:
					   // 2 x 5
						// piccola corezzione da aggiustare in futuro 
						  reihen = 2;
						  spalte = 5;
						  
						  for(int i = 0, a=5,corX=1; i < 5 ;i++ , a++,corX++) {
								cardsArray.get(i).setCordinateY("A");
								cardsArray.get(a).setCordinateY("B");
								
								cardsArray.get(i).setCordinateX(corX);
								cardsArray.get(a).setCordinateX(corX);
							  }
						break;
					  case 12:
				       //  3 × 4
						  // DA CORREGGERE !!!!!!!!!
						  for(int i = 0, a=4,b=8,corX=1; i < 4 ;i++ , a++,b++,corX++) {
								cardsArray.get(i).setCordinateY("A");
								cardsArray.get(a).setCordinateY("B");
								cardsArray.get(b).setCordinateY("C");
								
								cardsArray.get(i).setCordinateX(corX);
								cardsArray.get(a).setCordinateX(corX);
								cardsArray.get(b).setCordinateX(corX);
							  }
					    break;
					  case 16:
					   // 4 × 4
						  for(int i = 0, a=4,b=8,c=12,corX=1; i < 4 ;i++ , a++,b++,c++,corX++) {
								cardsArray.get(i).setCordinateY("A");
								cardsArray.get(a).setCordinateY("B");
								cardsArray.get(b).setCordinateY("C");
								cardsArray.get(c).setCordinateY("D");
								
								cardsArray.get(i).setCordinateX(corX);
								cardsArray.get(a).setCordinateX(corX);
								cardsArray.get(b).setCordinateX(corX);
								cardsArray.get(c).setCordinateX(corX);
							  }
					    break;
					   //case 18:
					//  3 × 6
						 //  for(int i = 0, a=7,b=13,corX=1; i < 6 ;i++ , a++,b++,corX++) {
						//		cardsArray.get(i).setCordinateY("A");
						//		cardsArray.get(a).setCordinateY("B");
						//		cardsArray.get(b).setCordinateY("C");
						//		
						//		cardsArray.get(i).setCordinateX(corX);
						//		cardsArray.get(a).setCordinateX(corX);
						//		cardsArray.get(b).setCordinateX(corX);
						//	  }
						//break;
					   //case 20:
					// 4 × 5
						//   for(int i = 0, a=5,b=10,c=14,corX=1; i < 5 ;i++ , a++,b++,c++,corX++) {
						//		cardsArray.get(i).setCordinateY("A");
						//		cardsArray.get(a).setCordinateY("B");
						//		cardsArray.get(b).setCordinateY("C");
						//		cardsArray.get(c).setCordinateY("D");
								
						//		cardsArray.get(i).setCordinateX(corX);
						//		cardsArray.get(a).setCordinateX(corX);
						//		cardsArray.get(b).setCordinateX(corX);
						//		cardsArray.get(c).setCordinateX(corX);
						//	  }
						//break;
					
					}
					System.out.println("Reihen: " + reihen + "         Spalten:" + spalte);
					// CREAZIONE DELLA GRIGLIA " LETTERE"
					for (int i =0;i<spalte;i ++) {
						if (i != (spalte - 1) ) {
							if (i == 0) {
								System.out.print("      " + alphabet[i] + "  -  " );
							}
							else {
								System.out.print(alphabet[i] + "  -  ");
							}
							
						}
						else {
							System.out.println(alphabet[i] );
							System.out.println();
							System.out.print("1     ");
						}
					// CREAZIONE DELLA GRIGLIA " CARTE "
					}
					for (Cards c : cardsArray) {
						
						//System.out.println();
                        //System.out.println(c.toString());
						
						if (c.getCordinateX() != spalte && c.getinGame() == true) {
							
							
							System.out.print(c.getEntdecke() + "  -  ");
							
						}
						else if (c.getCordinateX() == spalte && c.getinGame() == true) {
							
							System.out.println(c.getEntdecke());
							if (counterPrint != (cards)) {
								if (counterPrint != reihen) {
									counterPrint ++;
									System.out.print(counterPrint + "     ");
								}
								//System.out.print(counterPrint + "     ");
								//System.out.print("counter  "+counterPrint);
							}
							
						}
                    }
					
					
					}
				// ################ INIZIO DEL GIOCO #######################
				userX = IOTools.readInt("Bitte, geben Sie den x coordinate ");
				userY = IOTools.readString("Bitte, geben Sie den y coordinate ");
				userY.toUpperCase();
				System.out.println(userY.toUpperCase());
			}
			catch (Exception e ){
				System.out.println("Bitte , geben Sie eine grader Zahl !!");
				gradeZahl = false;
			}
		}while (!gradeZahl);
		
		
		
	}
	

	
	
	
}
