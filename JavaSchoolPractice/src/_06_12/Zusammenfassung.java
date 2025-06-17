package _06_12;

import java.io.Serializable;

abstract class  Shape{
	public abstract void draw();
}

class MYShape extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Zusammenfassung {
	
	Serializable s;
	
	Runnable r;
	
	static void s(Shape sh) {
		sh.draw();
	}
	
public static void main(String[] args) {
	m( ()  -> {});
	
	//s(() -> {}); Target Type must be functional Interface! Was ist ein "Functional Interface"?!
	
}

static void m(Flyable f) {
	f.fly();
	//f.speak();
}
}


@FunctionalInterface
interface Flyable{
	void fly();
	//void speak();
}

class Bird implements Flyable
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void speak() {
//		// TODO Auto-generated method stub
//		
//	}
//	
}