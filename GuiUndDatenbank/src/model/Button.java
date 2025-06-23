package model;

import java.awt.Color;
import launcher.*;
import javax.swing.*;


public class Button extends JButton {
	final private int x ; // coordinate
	final private int y ; // coordinate
	
	
	
	public Button (String textBotton, int x , int y,int anwendung) {
		super(textBotton);
		this.x = x;
		this.y = y;
		this.setBounds(x, y , 200, 30);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setHorizontalAlignment(JTextField.CENTER);
		this.getEvent(anwendung);
		
	}
	public Button (String textBotton, int x , int y, int width, int height,int anwendung) {
		super(textBotton);
		this.x = x;
		this.y = y;
		this.setBounds(x, y , width, height);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setHorizontalAlignment(JTextField.CENTER);
		this.getEvent(anwendung);
		
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
	
	public void getEvent( int anwendung) {
		switch (anwendung){
			case 1:
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "EditPanel"));
				break;
			case 2:
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "FormPanel"));
				break;
				
			case 3:
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "TablePanel"));
				break;
			case 4:
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "LoginPanel"));
				break;
			case 5:
				this.addActionListener(e -> System.out.println(MainLauncher.getFormPanel().getText()));
				break;
			case 6:
				this.addActionListener(e -> System.out.println(MainLauncher.getTablePanel().getText()));
				break;
			case 7:
				this.addActionListener(e -> System.out.println(MainLauncher.getLoginPanel().getText()));
				break;
			case 8:
				this.addActionListener(e -> System.out.println(MainLauncher.getChange().getText()));
				break;
			case 9:
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "Change"));
				break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
