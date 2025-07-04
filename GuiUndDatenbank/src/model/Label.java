package model;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Label extends JLabel{
	final private int x;
	final private int y;
	final private int width;
	final private int height;
	final private String txt;
	
	public Label(int x,int y,String txt) {
		this.x = x;
		this.y = y;
		this.width = 200;
		this.height = 30;
		this.txt = txt;
		this.setBounds(x, y, width, height); // x, y, width, height
		this.setOpaque(true); // ❗ necessario per vedere lo sfondo
		//this.setBackground(Color.YELLOW); // o qualsiasi colore
		this.setForeground(Color.GREEN); // colore del testo
		this.setHorizontalAlignment(JTextField.CENTER);
	}
	
	public void setTextEmpty() {
		this.setText("");
	}
	
	public void setText() {
		this.setText(txt);
	}
}
