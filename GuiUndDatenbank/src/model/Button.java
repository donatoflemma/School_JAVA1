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
		case 1: // Back Buttons in EmployeeEditPanel
			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "EditPanel"));
			break;// carico il JPanel che mi serve il metodo show fa parte della classe JFrame
		case 2://EmployeeEditPanel
			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "FormPanel"));
			break;
			
		case 3://EmployeeEditPanel
			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "TablePanel"));
			break;
		case 4://EmployeeEditPanel
			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "Change"));
			break;
		case 5://EmployeeEditPanel
			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "Delet"));
			break;
		case 6:// Add -- EmployeeFormPanel
			this.addActionListener(e -> { Employee n = MainLauncher.getFormPanel().getInstanz();
										  EmployeeDAO dao = new EmployeeDAO();
										  dao.Insert(n);
										  System.out.println(MainLauncher.getFormPanel().getInstanz().toString());
			 							});
										break;
		case 7:// Search ---- EmployeeTablePanel/ Delet
			this.addActionListener(e -> {  if(this.getParent().getName().equals("Table")) {
												EmployeeDAO dao = new EmployeeDAO();
												//System.out.println(this.getParent().getName());
												MainLauncher.getTablePanel().Table(dao.Table( MainLauncher.getTablePanel().getImputUser()));
												}
											else{
												EmployeeDAO dao = new EmployeeDAO();
												//System.out.println(MainLauncher.getDelet().getText());
												MainLauncher.getDelet().TableDelet(dao.Table( MainLauncher.getDelet().getName(),MainLauncher.getDelet().getId_em()));}});
											break;	
		case 8://LogIn
			this.addActionListener(e -> { User u = MainLauncher.getLoginPanel().getInstanz();
			  							  UserDAO userData = new UserDAO();
			  							  userData.Login(u);
			  							  if (userData.Login(u) ) {
			  								  MainLauncher.getLayout().show(MainLauncher.getContainer(), "EditPanel");
			  								 }
			  							  else {
			  								  System.out.println("failed");
			  								  // Ricordarsi di fare un Filed dove compare che la password o il nome sono sbagliati !!!
			  							  		}});
										break;
		case 9:// change - delet Buttons  ######### da continuare da qua !!!!!
			//if(this.getParent().getName().equals("Delet")) {
				this.addActionListener(e -> MainLauncher.getDelet().getPopDel().getMainframe().setVisible(true));
				//}
			//else {
				this.addActionListener(e -> MainLauncher.getChange().getPopChange().getMainframe().setVisible(true));
			//}
			break;
		case 10:// Button Yes in Delet or Change
			this.addActionListener(e ->{
				if ("popDel".equals(MainLauncher.getDelet().getPopDel().getMainframe().getTitle())) {
						EmployeeDAO dao = new EmployeeDAO();
						dao.delete(MainLauncher.getDelet().getName(), MainLauncher.getDelet().getId_em());
						MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
				}
				else {
					MainLauncher.getChange().getPopChange().getMainframe().setVisible(false);
				
					//PROSEGUIRE IL CODICE ; DEVO SLAVARE LE MODIFICHE 
			}});;
			
				break;
		case 11: // Button No in Delet or Change
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
