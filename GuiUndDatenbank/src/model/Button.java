package model;

import java.awt.Color;
import javax.swing.*;


public class Button extends JButton {
	final private int x ; // coordinate
	final private int y ; // coordinate
	
	public Button (String text, int x , int y) {
		super(text);
		this.x = x;
		this.y = y;
		this.setBounds(x, y , 200, 30);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setHorizontalAlignment(JTextField.CENTER);
		
	}
	public Button (String text, int x , int y, int width, int height) {
		super(text);
		this.x = x;
		this.y = y;
		this.setBounds(x, y , width, height);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setHorizontalAlignment(JTextField.CENTER);
		
	}

	

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Button [x=" + x + ", y=" + y + "]";
	}
	

}
