package _05_26;

public class NormalLadend extends Zustand{
	private static NormalLadend normalLadend;
	
	private NormalLadend() {
		//...
	}

	public static NormalLadend getNormalLadend() {
		//...
		return new NormalLadend(); // normalLadend
	}
	@Override
	public void bearbeiten(Ladegeraet ladegeraet) {
		// TODO Auto-generated method stub
		
	}

}
