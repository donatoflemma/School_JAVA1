package _06_30;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerDeserManipulieren {
	public static void main(String[] args) {
		
		Circle c = new Circle(new Point(.5, .75), 1.5);
		System.out.println("Circle pre Serialization...: " + c);
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("serialized_circle.ser")))){
			oos.writeObject(c);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("===============Deserialization ===================");
		Circle c2 = null;
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("serialized_circle.ser")))){
			
			c2 = (Circle) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Deserialized Circle = ...: " + c2);
	}

}

class Point{
	private double x;
	private double y;
	
	
	public Point(double x, double y) {
		
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
}

class Circle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient Point center;
	private double radius;
	public Circle(Point center, double radius) {
		
		this.center = center;
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
	
	//
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		//zusätzlich
		oos.writeDouble(center.getX());
		oos.writeDouble(center.getY());
	}
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException{
		ois.defaultReadObject();
		//zusätzlich
		double x = ois.readDouble();
		double y = ois.readDouble();
		this.center = new Point(x,y);
	}
	
}