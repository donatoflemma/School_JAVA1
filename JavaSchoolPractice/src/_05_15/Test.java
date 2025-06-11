package _05_15;

import _05_13.Punkt;

public class Test {

	public static void main(String[] args) {
		Kreis k = new Kreis(1.0); // new Kreis();
		k.setRadius(1.5);
		
		Kreis k2 = new Kreis(1.5);
		k2.mittelpunkt = new Punkt(0.5, 0.5);
		
		Kreis k3 = new Kreis(1.5, new Punkt(0.5, 0.5));
		
		System.out.println(k.asText());
		System.out.println("Area of Circle " + k3.asText() + " is " + k3.area());
		k3.scale(-0.5);
		k3.setRadius(-0.5);
		System.out.println("Area of Circle " + k3.asText() + " is " + k3.area());
		
		
	}

}
