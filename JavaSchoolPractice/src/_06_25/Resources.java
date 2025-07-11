package _06_25;

import java.io.IOException;

public class Resources {
	public static void main(String[] args) {
	
		System.out.println("start");
		try (A a = new A()){
			a.operation(0);
			System.out.println("I have been in a try bloc");
		
		}
		catch (IOException e) {
			System.out.println("first cach");
			
		} catch (Exception e) {
			
			System.out.println("second catch");
		}
	    System.out.println("termination");
	
	}

}


class A implements AutoCloseable{
	public A() throws IOException {
		System.out.println("Resource wird belegt...");
	}
	public void operation(int i) throws IOException {
		if (i == 0)
			throw new IOException("Something went wrong..");
		System.out.println("Es wird mit dem Resource gearbeitet");
	}
	@Override
	public void close() throws Exception{
		System.out.println("Resource wird freigegeben...");
		throw new Exception("Ich hatte Probleme beim Resourceschliessen");
		
	}
	
	
}