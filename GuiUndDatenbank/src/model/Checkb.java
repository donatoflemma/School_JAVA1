package model;

import javax.swing.JCheckBox;

public class Checkb extends JCheckBox{
	final private int x;
	final private int y;
	final private int width;
	final private int height;
	final private String txtCheck;


	public Checkb(int x,int y,int width,int height,String txtCheck) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.txtCheck = txtCheck;
		this.setBounds(x, y , width, height);
		this.setText(txtCheck);
	}
	
	//boolean isSelected(): restituisce lo stato di selezione della spunta
}