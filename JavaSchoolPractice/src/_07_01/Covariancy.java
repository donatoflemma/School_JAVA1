package _07_01;
/**
 * Eine Klasse ist Covariant zu sich und ihren Elternklassen
 * 
 * Beispiel: Cat ist Covariant zu: Cat, Animal, Object
 * 
 * Primitive Datentypen sind Covariant nur zu sich selbst.
 * 
 * 
 * Beispiel:
 * 				int ist zwar Kompatibel zu long, aber nicht Covariant
 * 				Integer ist keine Kindklasse von Long
 * 
 * 
 */
public class Covariancy {
public static void main(String[] args) {
	
}
}


class Animal{
	
}
class Dog extends Animal{
	
}
class Bird extends Animal{
	
}
class Cat extends Animal{
	
}

class AnimalException extends Exception{
	
}
class DogException extends AnimalException{
	
}
class BirdException extends AnimalException{
	
}
class CatException extends AnimalException{
	
}

class Base{
	protected Animal m(int i) throws AnimalException{
		if(i == 0)
			return new Cat();// new Dog();//new Animal();
		else if( i< 0)
			throw new AnimalException();
		else throw new DogException();
	}
	
	public long f(String s) throws CatException{
		if (s.contains("cat"))
			throw new CatException();
		return s.length();
	}
}
/**
 * Overriding Rules:
 * 						1. Signatur (name der Methode + Parameterliste)  muss erhalten bleiben
 * 						2. Die Sichtbarkeit nicht reduzieren
 * 						3. Return-Typ muss covariant sein
 * 						4. keine neue checked Exception werfen.
 */
class Derived extends Base{
	
	public /*protected Cat, Bird, Animal*/ Dog m(int i) throws NullPointerException /*throws CatException, DogException, BirdException, AnimalException*/ {
		return new Dog();
	}
	public long f(String s) {
		return s.length();
	}
}