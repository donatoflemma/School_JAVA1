package _06_13;

import java.time.LocalTime;

public class Test {
public static void main(String[] args) {
	double r = 1.0;
	Punkt p = new Punkt(0.0, 0.0);
	
	Kreis k = new Kreis(r, p);
	
	System.out.println(k);
	
	p.shift(0.5,  0.5);
	
	System.out.println(k);
	r++;
	System.out.println(k);
	
	Punkt mp = k.getMittelpunkt();
	mp.shift(0.7, 0.7);
	System.out.println(mp);
	System.out.println(k);
	
	LocalTime t = LocalTime.of(12, 13);
	t = t.withHour(14);
	System.out.println(t);
}
}
