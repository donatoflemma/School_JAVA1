package Spiels_Memory;
import Prog1Tools.IOTools;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class Test {
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
		
		
		
		int cards = 12;
		boolean winn = false;
		boolean gradeZahl = false;
		int counter= 0;
		int counterAlphabet = 0;
		int reihen = 3;
		int spalte = 4;
		
		String alphabet [] = { "A", "B", "C", "D"};
		
					List<Cards> cardsArray = new ArrayList<>();
					
					// Creazione delle carte con valori in default
						for (int n = 0;n < 2;n++) {
							for (int i = 1; i < (cards/2) + 1 ;i++,counter++) {
								cardsArray.add(new Cards(i,5,"A",true,false,"O"));
							}}
						// mischia le carte 
						Collections.shuffle(cardsArray);
					
					//##################################### Assegnazione valori carte #############################################
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
							
							     //   c.getinGame() == true &&  l´ho tolto peche mi da problemi con la parte ddi sotto
							// per controllare se le due carte sono uguali !!! forse lo dovró rimettere ma non ne sono sicuro
							if ((userErsteX != c.getCordinateX() || !userErsteY.toUpperCase().equals(c.getCordinateY())) &&
								(userZweiteX != c.getCordinateX() || !userZweiteY.toUpperCase().equals(c.getCordinateY() )))
							{
								
								if (c.getCordinateX() != spalte  ) {
									
									
									System.out.print(c.getabdeckt() + "  -  ");
									c.setEntdeckt(false);
									
								}
								else if (c.getCordinateX() == spalte) {
									
									System.out.println(c.getabdeckt());
									c.setEntdeckt(false);
									
									// Aggiungo clausola alla if
										if (counterAlphabet != (reihen -1)) {
											counterAlphabet ++;
											System.out.print(alphabet[counterAlphabet] + "     ");
										}
										
								}
							} 
							// else if GRÜN KART
							// Stesso qua , da vedere !!!!  c.getinGame() == true 
							else if( userErsteX == c.getCordinateX() && userErsteY.toUpperCase().equals(c.getCordinateY())){
								
								if (c.getCordinateX() != spalte ) {
									
									System.out.print(GRÜN + c.getCardNummer() + RESET +"  -  ");
									c.setEntdeckt(true);
									}
								else if (c.getCordinateX() == spalte) {
								
									System.out.println(GRÜN + c.getCardNummer() + RESET );
									c.setEntdeckt(true);
									
									//if (counterAlphabet != (cards)) {
										if (counterAlphabet != (reihen -1)) {
											counterAlphabet ++;
											System.out.print(alphabet[counterAlphabet] + "     ");
										}
										
									//}
								}
									
								}
							
							// else if GELP KARTE
							//c.getinGame() == true &&
							else if( userZweiteX == c.getCordinateX() && userZweiteY.toUpperCase().equals(c.getCordinateY())){
							
								if (c.getCordinateX() != spalte ) {
								
									System.out.print(GELP + c.getCardNummer() + RESET +"  -  ");
									c.setEntdeckt(true);
									}
								else if (c.getCordinateX() == spalte) {
									
									System.out.println(GELP + c.getCardNummer() + RESET );
									c.setEntdeckt(true);
									
									//if (counterAlphabet != (cards)) {
										
										if (counterAlphabet != (reihen -1)) {
											counterAlphabet ++;
											System.out.print(alphabet[counterAlphabet] + "     ");
										}
										
									//}
								}
									
								}
						
							
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
							userAntwort ++ ; // prima era = 0 !!!
							// Qua deve partire la logica per cancellare le carte !!!!!
							
							
						}
						
						counterAlphabet = 0;
						//System.out.println(" SuerAntwort: " + userAntwort);
					
						//######################################### CONFRONTO DELLE CARTE ########################################################
						if (userAntwort == 3) {
							for(Cards c : cardsArray) {
								if (c.getEntdeckt() & c.getinGame()) {
									for (Cards b : cardsArray) {
										
											if ( b.getEntdeckt() && b.getinGame() &&  c.getCardNummer() == b.getCardNummer()) {
												
												
														c.setInGame(false);
														c.setAbtdeckt("X");  
											
														b.setInGame(false);
														b.setAbtdeckt("X");
														userAntwort =0;
														
														
														
											
											
											}
										
											
										
											
										
									}
								}
						}
						
					}
						//if (userAntwort == 4) { 
						//	for(Cards c : cardsArray) {
						//		c.getabdeckt();
						//		userErsteX = 0;
						//		userErsteY = "L";
					
						//		userZweiteX = 0;
						//		userZweiteY = "L";
						//		userAntwort = 0;
						//	}
								
						//}
						
						
							
								
									
								
							
						
						
						
					}while(winn != true);
				
				}	
				
				
				
				
			
	
		}
			







