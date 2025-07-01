package model;

import java.awt.Color;
import launcher.*;
import javax.swing.*;

import db.EmployeeDAO;
import db.UserDAO;
import gui.Delet;


public class Button extends JButton {
	final private int x ; // coordinate
	final private int y ; // coordinate
	final private String textBotton;
	
	
	
	public Button (String textBotton, int x , int y,int anwendung) {
		//super(textBotton);
		this.textBotton=textBotton;
		this.setText(textBotton);
		this.x = x;
		this.y = y;
		this.setBounds(x, y , 200, 30);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setHorizontalAlignment(JTextField.CENTER);
		this.getEvent(anwendung);
		
	}
	public Button (String textBotton, int x , int y, int width, int height,int anwendung) {
		//super(textBotton);
		this.textBotton=textBotton;
		this.setText(textBotton);
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
	
	public String getTextButton() {
		return textBotton;
	}

	@Override
	public String toString() {
		return "Button [x=" + x + ", y=" + y + "]";
	}
	
	public void getEvent( int anwendung) {
		switch (anwendung){
			case 1: // Back Buttons
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "EditPanel"));
				break;// carico il JPanel che mi serve il metodo show fa parte della classe JFrame
			case 2://EmployeeEditPanel
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "FormPanel"));
				break;
				
			case 3://EmployeeEditPanel
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "TablePanel"));
				break;
			case 4:
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "LoginPanel"));
				break;

				
			case 5:// Add  --------- EmployeeFormPanel 
				this.addActionListener(e -> { Employee n = MainLauncher.getFormPanel().getInstanz();
											  EmployeeDAO dao = new EmployeeDAO();
											  dao.Insert(n);
											  System.out.println(MainLauncher.getFormPanel().getInstanz().toString());
											 });
				break;// vado a creare delle istanze con il Listner del Bottone
				// dao = mi serve perche il metodo non é static , qundi devo chiamare un´istanza e utilizzarla per il metodo
				// n = creata da getIstanz() presente nel EmployeeFormPanel
				
				
				
				
				
			case 6:// Search ---- EmployeeTablePanel
				//this.addActionListener(e -> System.out.println(MainLauncher.getTablePanel().getText()));
				this.addActionListener(e -> MainLauncher.getTablePanel().Table(MainLauncher.getTablePanel().getText()));
				break;
				
				
				
				
				
				
				
				
			case 7://LogIn
				this.addActionListener(e -> { User u = MainLauncher.getLoginPanel().getInstanz();
				  							  UserDAO userData = new UserDAO();
				                              userData.Login(u);
				                              if (userData.Login(u) ) {
				                            	 // System.out.println(MainLauncher.getLoginPanel().getInstanz().toString());
				                            	  MainLauncher.getLayout().show(MainLauncher.getContainer(), "EditPanel");
				                            	  //System.out.println(userData.Login(u));
				                              }
				                              else {
				                            	  System.out.println("failed");
				                            	  // Ricordarsi di fare un Filed dove compare che la password o il nome sono sbagliati !!!
				                              }});
				break;// vado a creare un´istanza con il Listner del Bottone e ricchiamo il metodo toString()
			case 8:// change
				this.addActionListener(e -> MainLauncher.getChange().getPopChange().getMainframe().setVisible(true));
				break;
			case 9: //EmployeeEditPanel
//				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "Change"));
				this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "Delet"));
				break;
			case 10: // Delet 
				//this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "Change"));
				this.addActionListener(e -> MainLauncher.getDelet().getPopDel().getMainframe().setVisible(true));
				break;
				
				
				
				
				
				
				
			case 11: // Button Yes in Delet or Change
				this.addActionListener(e ->{
					if ("popDel".equals(MainLauncher.getDelet().getPopDel().getMainframe().getTitle())) {
						 MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
					
						//PROSEGUIRE IL CODICE ; DEVO ELIMINARE 
					}
					else {
						MainLauncher.getChange().getPopChange().getMainframe().setVisible(false);
					
						//PROSEGUIRE IL CODICE ; DEVO SLAVARE LE MODIFICHE 
					}});
				break;
				
				
				
				
				
				
				
				
				
				
				
				
				
			case 12: // Button No in Delet or Change
				this.addActionListener(e ->{
					if ("popDel".equals(MainLauncher.getDelet().getPopDel().getMainframe().getTitle())) {
						MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
						}
					else {
						MainLauncher.getChange().getPopChange().getMainframe().setVisible(false); 
					}});
				break;
			}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
