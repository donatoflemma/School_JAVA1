package _06_12;

import java.util.function.Predicate;

public class Sheep {
	private int age = 3;
	public int getAge() {
		return age;
	}
public static void main(String[] args) {
	
	Sheep s = new Sheep();
	s.go( x ->  adder(6, 2) < x.getAge());
	
}
void go(Predicate<Sheep> e) {
	Sheep s2 = new Sheep();
	if(e.test(s2))
		System.out.println("true");
	else
		System.out.println("false");
}
static int adder(int x, int y) {
	return x + y;
}
}
