package Spiels_Memory;

import Prog1Tools.IOTools;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
//import Spiels_Memory.Cards;

public class Prova {
	public static void main (String [] args) {
		// COLOR STRING
		String RESET = "\u001B[0m";
		String GRÜN = "\u001B[32m";
		String GELP = "\u001B[33m";
		
		
		
		int userErsteX = 0;
		String userErsteY = "L";
		int userAntwort = 0;
		
		
		int userZweiteX = 0;
		String userZweiteY = "L";
		
		
		
		int cards = 0;
		boolean winn = false;
		boolean gradeZahl = false;
		int counter= 0;
		int counterAlphabet = 0;
		
		String alphabet [] = { "A", "B", "C", "D"};
		
			do {
				try {
					cards= IOTools.readInt("Bitte, geben Sie den Anzahl von Carten (Es soll eine grade Zahl sein und maximal 20 ): ");
					List<Cards> cardsArray = new ArrayList<>();
					
					if (cards % 2 != 1 && cards < 21) {
						int reihen = (int)(Math.sqrt(cards));
						int spalte = cards /reihen;
						gradeZahl = true;
						// Creazione delle carte con valori in default
						for (int n = 0;n < 2;n++) {
							for (int i = 1; i < (cards/2) + 1 ;i++,counter++) {
								cardsArray.add(new Cards(i,5,"A",true,false,"O"));
							}}
						// mischia le carte 
						Collections.shuffle(cardsArray);
					
					//##################################### Assegnazione valori carte #############################################
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
						
						System.out.println();
						
						for (Cards c : cardsArray) {
							System.out.println(c.toString());
						}
						
						do {
						// CREAZIONE DELLA GRIGLIA " NUMERI"
							for (int i =0;i<spalte;i ++) {
								if (i != (spalte - 1) ) {
									if (i == 0) {
										System.out.print("      " + (i+1) + "  -  " );
									}
									else {
										System.out.print((i + 1) + "  -  ");
									}
										
								}
								else {
								System.out.println(i  + 1);
									System.out.println();
									System.out.print(alphabet[0] + "     ");
								}
							 //CREAZIONE DELLA GRIGLIA " CARTE "
							}
						
						//#########################  IL PROBLEMA INCOMINCIA QUA #################################################
						for (Cards c : cardsArray) {
							
							                                                                                              
							if (c.getinGame() == true && (
									
									(userErsteX != c.getCordinateX() | !userErsteY.toUpperCase().equals(c.getCordinateY())) &&
									(userZweiteX != c.getCordinateX() | !userZweiteY.toUpperCase().equals(c.getCordinateY() )))
									
								){
								
								if (c.getCordinateX() != spalte  ) {
									
									
									System.out.print(c.getEntdeckt() + "  -  ");
									
								}
								else if (c.getCordinateX() == spalte) {
									
									System.out.println(c.getEntdeckt());
									// Aggiungo clausola alla if
										if (counterAlphabet != (reihen -1)) {
											counterAlphabet ++;
											System.out.print(alphabet[counterAlphabet] + "     ");
										}
										
								}
							} 
							// else if GRÜN KART
							else if(c.getinGame() == true && userErsteX == c.getCordinateX() && userErsteY.toUpperCase().equals(c.getCordinateY())){
								
								if (c.getCordinateX() != spalte ) {
									
									System.out.print(GRÜN + c.getCardNummer() + RESET +"  -  ");
									
									}
								else if (c.getCordinateX() == spalte) {
								
									System.out.print(GRÜN + c.getCardNummer() + RESET );
									
									}
									
									
									if (counterAlphabet != (cards)) {
										
										if (counterAlphabet != (reihen -1)) {
											counterAlphabet ++;
											System.out.print(alphabet[counterAlphabet] + "     ");
										}
										
									}
									
								}
							// else if GELP KARTE
							//else if(c.getinGame() == true &&  userZweiteX == c.getCordinateX() && userZweiteY.toUpperCase().equals(c.getCordinateY())){
							
								//if (c.getCordinateX() != spalte ) {
								
									//System.out.print(GELP + c.getCardNummer() + RESET +"  -  ");
									
								//	}
								//else if (c.getCordinateX() == spalte) {
									
									//System.out.print(GELP + c.getCardNummer() + RESET );
									
									//}
									
									
									//if (counterAlphabet != (cards)) {
										
										//if (counterAlphabet != (reihen -1)) {
											//counterAlphabet ++;
											//System.out.print(alphabet[counterAlphabet] + "     ");
										//}
										
									//}
									
								//}
							
							}
							
						// ################ INIZIO DEL GIOCO #######################
						
						if (userAntwort == 0) {
							System.out.println("Erste Karte");
							userErsteX = IOTools.readInt("Bitte, geben Sie den   x coordinate : ");
							userErsteY = IOTools.readString("Bitte, geben Sie den  y coordinate : ");
							System.out.println();
							
							}
						if (userAntwort < 2) {
							userAntwort ++;
						}
						
						if (userAntwort == 2) {
							System.out.println("Zweite Karte");
							userZweiteX = IOTools.readInt("Bitte, geben Sie den x coordinate : ");
							userZweiteY = IOTools.readString("Bitte, geben Sie den y coordinate : ");
							userAntwort = 0;
							
						}
						
						counterAlphabet = 0;
					
						//######################################### CONFRONTO DELLE CARTE ########################################################
						//if () {
							// deve stare qua in modo da incominciare di nuovo il giro delle carte 
						//	userErsteAntwort = 0;
						//}
						
						
					}while(winn != true);
					
				
				}	
				
				}
				
				catch (Exception e ){
					System.out.println("Bitte , geben Sie eine grader Zahl !!");
					gradeZahl = false;
				}
			}while (!gradeZahl);
	
		}
			

}



