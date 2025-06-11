package _05_21;

import _05_20.Punkt;

public class Test {
public static void main(String[] args) {
	
	Dreieck d = new Dreieck(new Punkt(.5, .75), 3, 4, Math.PI / 2);
	System.out.println(d);
	
	System.out.println(d.getMittelpunkt());
	d.setMittelpunkt(new Punkt(0, 0));
	System.out.println(d);
	
	GleichseitigesDreieck gd = new GleichseitigesDreieck(new Punkt(0, 0), 5);
	System.out.println(gd.toString());
	gd.setA(8);
	
	System.out.println(gd);
	
	RechtwinkligesDreieck rd = new RechtwinkligesDreieck(new Punkt(0, 0), 3, 4);
	System.out.println(rd);
	
	rd.setAlpha(Math.PI/3);
	System.out.println(rd);
}
}
