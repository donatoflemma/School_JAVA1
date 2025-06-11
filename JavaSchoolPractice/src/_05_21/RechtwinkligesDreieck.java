package _05_21;

import _05_20.Punkt;

/**
 * 
 *  - Ein rechtwinkliges Dreieck ist ein Dreieck (IST-EINE-Beziehung)
 *
 */

public class RechtwinkligesDreieck extends Dreieck{
	
	public RechtwinkligesDreieck(Punkt mp, double a, double b) {
		super(mp, a, b, Math.PI/2);
	}
	
	@Override
	public void setAlpha(double alpha) {
		System.err.println("unsupported operation, angle is always 90° (1.57...)");
	}

	
}
