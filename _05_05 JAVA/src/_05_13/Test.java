package _05_13;

import java.util.Iterator;

public class Test {
public static void main(String[] args) {
//	Punkt p = new Punkt(0.0,0.0);
//	
//	Punkt q = new Punkt(2.0,3.0);
//	
//	double v = p.distanceTo(q);
//	System.out.println("Abstand zwischen p und q = " + v);
	
	Punkt [] points = {new Punkt(0, 1) ,new Punkt(3, 0) ,new Punkt(0, 4) };
	for (int i = 0; i < points.length; i++) {
		System.out.println(points[i].asText());
	}

for (int i = 0; i < points.length; i++) {
	System.out.println(points[i].distanceTo(new Punkt(0, 0)));
}
	
}
}
