package _05_27;

public class MehrfacheVererbung {
	public static void main(String[] args) {
		Maultier mt = new Maultier();
		mt.m();
	}

}

interface Esel{
	void m();
}

interface Pferd{
	void m() ;
}
/**
 * Mehrfache Vererbung ist  in Java nicht erlaubt!
 */
class Maultier implements Esel, Pferd{

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}
	
}