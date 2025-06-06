package _05_26;

public class SchnellLadend extends Zustand {

	private static SchnellLadend schnellLadend;
	private SchnellLadend() {
		
	}
	public static SchnellLadend getSchnellLadend() {
		//...
		return new SchnellLadend();// schenllLadend;
	}
	@Override
	public void bearbeiten(Ladegeraet ladegeraet) {
		// TODO Auto-generated method stub
		
	}

}
