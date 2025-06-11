package Spiels_Memory;

import Spiels_Memory.Test;

public class Cards {
	private final int  cardNummer;
	private  int cordinateX ;
	private   String cordinateY;
	private boolean inGame ;
	private boolean entdeckt ;
	private String abdeckt  ;
	
	
	public Cards (int cardNummer, int cordinateX  , String cordinateY ,boolean inGame,boolean entdeckt,String abdeckt) {
		// non posso usarli se do un valore gia dichirato
		this.cardNummer = cardNummer ;
		this.cordinateX = cordinateX;
		this.cordinateY = cordinateY;
		this.inGame = inGame;
		this.entdeckt = entdeckt;
		this.abdeckt = abdeckt;
		
		
	}
	

	public int getCardNummer() {
		return cardNummer;
	}

	public int getCordinateX() {
		return cordinateX;
	}
	public void setCordinateX(int cordinateX) {
		this.cordinateX = cordinateX;
	}

	public void setCordinateY(String cordinateY) {
		this.cordinateY = cordinateY;
	}
	public String getCordinateY() {
		return cordinateY;
	}
	public boolean getinGame() {
		return inGame;
	}

	public String getabdeckt() {
		return abdeckt;
	}
	
	public boolean getEntdeckt() {
		return entdeckt;
	}

	public void setInGame(boolean inGame) {
		this.inGame = inGame;
	}
	
	public void setEntdeckt(boolean entdeckt) {
		this.entdeckt = entdeckt;
	}
	
	public void setAbtdeckt(String abdeckt) {
		this.abdeckt = abdeckt;
	}
	
	
	

	@Override
	public String toString() {
		return "Cards [cardNummer=" + cardNummer + ", cordinateX=" + cordinateX + ", cordinateY=" + cordinateY
				+ ", inGame=" + inGame + ", entdecke=" + abdeckt + "]";
	}
	public static void clearConsole() {
	    for (int i = 0; i < 50; ++i) 
	    	System.out.println();
	}
	
}
