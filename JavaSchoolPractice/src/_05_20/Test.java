package _05_20;

public class Test {
public static void main(String[] args) {
	Kreis k = new Kreis(1, new Punkt(0, 0));
	
	Rechteck r = new Rechteck(3, 4, new Punkt(.5, .5));
	
	System.out.println(k);
	System.out.println(r);
	
	System.out.println(k.getMittelpunkt());
	k.setMittelpunkt(new Punkt(.3, .9));
	
	r.setMittelpunkt(new Punkt(0, 0));
	System.out.println(r.getMittelpunkt());
}
}
