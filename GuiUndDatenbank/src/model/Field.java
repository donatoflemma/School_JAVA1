package model;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Field extends JTextField{
	final private int x ; // coordinate
	final private int y ; // coordinate
	private String text;
	private boolean firstClick = true;
	//final private int width;
	//final private int height;
	
	public Field (String text, int x , int y) {
		super(text);
		this.x = x;
		this.y = y;
		this.setBounds(x, y , 200, 30);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setHorizontalAlignment(JTextField.CENTER);
		// new MouseAdapter é una classe astratta gia presente
		
		this.addMouseListener(new MouseAdapter() {
	            public void mouseClicked(MouseEvent e) {
	            	if (firstClick) {
	                    setText("");
	                    firstClick = false;}
	            }});}
	
	public Field (String text, int x , int y,int width,int height) {
		super(text);
		//this.width = width;
		//this.height = height;
		this.x = x;
		this.y = y;
		this.setBounds(x, y , width, height);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setHorizontalAlignment(JTextField.CENTER);
		// new MouseAdapter é una classe astratta gia presente
		this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
            	if (firstClick) {
                    setText("");
                    firstClick = false;}
            	}});}

	

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	

	@Override
	public String toString() {
		return "Field [x=" + x + ", y=" + y + "]";
	}

	public void setText(String text) {
		super.setText(text); 
		this.text = text;
	}
	
}

