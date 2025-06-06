package Spiels_Memory;

import Spiels_Memory.Test;

public class Cards {
	private final int  cardNummer;
	private  int cordinateX ;
	private   String cordinateY;
	private boolean inGame ;
	private String entdecke  ;
	
	public Cards (int cardNummer, int cordinateX  , String cordinateY ,boolean inGame,String entdecke) {
		// non posso usarli se do un valore gia dichirato
		this.cardNummer = cardNummer ;
		this.cordinateX = cordinateX;
		this.cordinateY = cordinateY;
		this.inGame = inGame;
		this.entdecke = entdecke;
		
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

	public String getEntdecke() {
		return entdecke;
	}

	public void setInGame(boolean inGame) {
		this.inGame = inGame;
	}

	public void setEntdecke(String entdecke) {
		this.entdecke = entdecke;
	}

	@Override
	public String toString() {
		return "Cards [cardNummer=" + cardNummer + ", cordinateX=" + cordinateX + ", cordinateY=" + cordinateY
				+ ", inGame=" + inGame + ", entdecke=" + entdecke + "]";
	}
	public static void clearConsole() {
	    for (int i = 0; i < 50; ++i) System.out.println();
	}
	
}
