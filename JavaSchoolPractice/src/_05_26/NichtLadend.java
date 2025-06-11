package _05_26;
/**
 * Overriding Rules:
 * 					- Die Sichtbarkeit darf nicht reduziert werden
 */

public class NichtLadend extends Zustand{
    private static NichtLadend nichtLadend;
    private NichtLadend() {
    	//
    }
    
    public static  NichtLadend getNichtLadend() {
    	return  new NichtLadend(); // nichtLadend;
    }
	@Override
	 public void bearbeiten(Ladegeraet ladegeraet) {
		// bb
		int ladestand = ladegeraet.getLadestand();
		if(ladestand >= 20 && ladestand < 100)
			ladegeraet.setZustand(NormalLadend.getNormalLadend());
		
	}
	

}
