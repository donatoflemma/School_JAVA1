package model;
import javax.swing. *;

public class Mainframe extends JFrame {
	private int width ;
	private int height ;
		
	public Mainframe(String name) {
	    this(name, 600, 500);  // chiama il costruttore con larghezza e altezza di default
	    // overloading del costruttore
	}
	
	public Mainframe (String name,int width,int height) {
		super(name);  
		this.width = width;
		this.height = height;
		this.setSize(width,height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(null); // disabilita il layout manager
		
	}
	
	public void setWidth(int width) {
		this.width = width;
		this.setSize(this.width, this.height); 
	}
	public void setHeight(int height) {
		this.height = height;
		this.setSize(this.width, this.height); 
	}
	
}
