package _06_30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 1. Serialisierbarkeit wird geerbt, Figur implements Serializable => Kreis auch
 * 
 * 2. Für die Serialisierung, alle Attribute müssen serualizable sein oder
 * 3. transient, dann werden sie nicht gespeichert
 * 4. Bei der Deserialisierung, transient markierte Attribute werden auf default values gesetzt
 * 
 * 
 * Wenn die Elternklassen nicht Serializable sind, dann müssen sie über parameterlosen Kunstruktor verfügen, sonnst: InvalidClassException
 * Außerdem: Bei der Deserialisierung, die parameterlosen Konstruktoren der nicht-serialisierebaren Elternklassen werden laufen..
 * 
 * 
 * Was ist die SerialVersionUID?
 * 	
 * 	- Eindeutige Zahl, errechnet von Java authomatisch aus den Attributen
 *  - Wenn nahc der Serialisierung, die Anatomie der Klasse sich geändert hat, bei der Deserialisierung, entsteht ein Kompatibilitätsproblem
 *     -> InvalidClassException
 *     
 *  - Workaroung:
 *  				-> Die SerialVersionUID explizit auf eine Konstante setzen!
 */

public class SerDeser {
	public static void main(String[] args) {

//		Kreis k = new Kreis(new Punkt(0.25, 0.33), 1.0);
//		System.out.println("Obejct to serialize: " + k);

		/**
		 * Mittels PrintWriter k in einer Datei speichern: kreis.txt Inhalt der Datei:
		 * 0.25, 0.33, 1.0
		 */
		/**
		 * Mittels BufferedReader, den Inhalt der Datei einlesen und den Kreis erzeugen
		 */

		/**
		 * Serialisieren und Deserialisieren, wie wir das Thema am Freitag behandelt
		 * haben...
		 * 
		 * Datei: circle.ser
		 */

		//SErialization
//		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("circle.ser")))) {
//			oos.writeObject(k);
//			System.out.println("Serialization was successfull");
//		} 
//		catch (FileNotFoundException e) {
//
//			e.printStackTrace();
//		}
//		catch (NotSerializableException e) {
//
//			e.printStackTrace();
//		} catch (InvalidClassException e) {
//
//			e.printStackTrace();
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		}
		
		//Derserialization
		
		System.out.println("============Derserialization==============");
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("circle.ser")))){
			
			Kreis k2 = (Kreis) ois.readObject();
			System.out.println("Deserialized Kreis = " + k2);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (InvalidClassException e) {

			e.printStackTrace();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}
}

class Punkt implements Serializable{
	private double x;
	private double y;

	public Punkt(double x, double y) {
		System.out.println("Punkt construction");
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Punkt [x=" + x + ", y=" + y + "]";
	}

	public String format() {
		return x + "," + y;
	}

}

class Figur /*implements Serializable*/{
	protected /* transient*/  Punkt mittelpunkt; // Aus der Serialisierung ausklammern, wird nicht gespeichert

	public Figur(Punkt mittelpunkt) {
		System.out.println("Figur construction");
		this.mittelpunkt = mittelpunkt;
	}
	public Figur() {
		System.out.println("default constructor of Figure");
		this.mittelpunkt = new Punkt(0, 0);
	}

	public Punkt getMittelpunkt() {
		return mittelpunkt;
	}

}
/**
 * Serialisierbarkeit wird geerbt
 */

class Kreis extends Figur implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double radius;
	private String color = "Blue";

	public Kreis(Punkt mittelpunkt, double radius) {
		super(mittelpunkt);
		System.out.println("Kreis construction");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "Kreis [radius=" + radius + ", Mittelpunkt =" + getMittelpunkt() + "]";
	}

	public String format() {
		return getMittelpunkt().format() + ", " + radius;
	}

}