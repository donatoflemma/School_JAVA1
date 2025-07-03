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
										  //System.out.println(MainLauncher.getFormPanel().getInstanz().toString());
			 							});
										break;
		case 7:// Search ---- EmployeeTablePanel/ Delet / Change
			this.addActionListener(e -> {  if(this.getParent().getName().equals("Table")) {
												EmployeeDAO dao = new EmployeeDAO();
												System.out.println("if");
												MainLauncher.getTablePanel().Table(dao.Table( MainLauncher.getTablePanel().getImputUser()));
												}
											else if(this.getParent().getName().equals("Delet"))
											{
												EmployeeDAO dao = new EmployeeDAO();
												System.out.println("else if");
												MainLauncher.getDelet().TableDelet(dao.Table( MainLauncher.getDelet().getNameField(),MainLauncher.getDelet().getId_em()));}
											else{
												EmployeeDAO dao = new EmployeeDAO();
												System.out.println("else");
												System.out.println("Delet :" + MainLauncher.getDelet().getName());
												System.out.println("Table :" + MainLauncher.getTablePanel().getName());
												System.out.println("Change :" + MainLauncher.getChange().getName());
												MainLauncher.getChange().TableChange(dao.Table( MainLauncher.getChange().getNameField(),MainLauncher.getChange().getId_em()));}});
										break;	
		case 8://LogI
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
		case 9:// change - delet Buttons  
			this.addActionListener(e -> {if (this.getParent().getName().equals("Delet")) {
											MainLauncher.getDelet().getPopDel().getMainframe().setVisible(true);
										}
										else {
											MainLauncher.getChange().getPopChange().getMainframe().setVisible(true);
										}});
			break;
		case 10:// Button Yes in Delet or Change
			//"popDel".equals(MainLauncher.getDelet().getPopDel().getMainframe().getTitle()
			this.addActionListener(e ->{
//				if ("popDel".equals(MainLauncher.getDelet().getPopDel().getMainframe().getName())) {
//					System.out.println("del");
//						EmployeeDAO dao = new EmployeeDAO();
//						System.out.println(this.getParent().getParent().getName());
//						dao.delete(MainLauncher.getDelet().getName(), MainLauncher.getDelet().getId_em());
//						MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
//				}
//				else {
					MainLauncher.getChange().getPopChange().getMainframe().setVisible(false);
					System.out.println(MainLauncher.getChange().getWorkType());
					System.out.println(MainLauncher.getChange().getVacation());
					System.out.println(MainLauncher.getChange().getWage());
					
					});
			
			
				break;
		case 11: // Button No in Delet or Change  	Paolo	Testa	P098112	carpenter	6	1558
			this.addActionListener(e ->{
				if ("popDel".equals(MainLauncher.getDelet().getPopDel().getMainframe().getName())) {
					MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
					
					}
				else {
					MainLauncher.getChange().getPopChange().getMainframe().setVisible(false);
					}});
			break;
		}
	
	}
	
}
