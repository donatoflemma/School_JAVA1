package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import launcher.MainLauncher;
import model.Employee;
import model.User;

public class Originale {
	
	
	
//	public void getEvent( int anwendung) {
//		switch (anwendung){
//		case 1: // Back Buttons in EmployeeEditPanel
//			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "EditPanel"));
//			break;// carico il JPanel che mi serve il metodo show fa parte della classe JFrame
//		case 2://EmployeeEditPanel
//			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "FormPanel"));
//			break;
//			
//		case 3://EmployeeEditPanel
//			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "TablePanel"));
//			break;
//		case 4://EmployeeEditPanel
//			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "Change"));
//			break;
//		case 5://EmployeeEditPanel
//			this.addActionListener(e -> MainLauncher.getLayout().show(MainLauncher.getContainer(), "Delet"));
//			break;
//		case 6:// Add -- EmployeeFormPanel
//			this.addActionListener(e -> { Employee n = MainLauncher.getFormPanel().getInstanz();
//										  EmployeeDAO dao = new EmployeeDAO();
//										  dao.Insert(n);
//										  System.out.println(MainLauncher.getFormPanel().getInstanz().toString());
//			 							});
//										break;
//		case 7:// search ---- EmployeeTablePanel/ Delet
//			this.addActionListener(e -> {  if(this.getParent().getName().equals("Table")) {
//												EmployeeDAO dao = new EmployeeDAO();
//												//System.out.println(this.getParent().getName());
//												MainLauncher.getTablePanel().Table(dao.Table( MainLauncher.getTablePanel().getImputUser()));
//												}
//											else{
//												EmployeeDAO dao = new EmployeeDAO();
//												//System.out.println(MainLauncher.getDelet().getText());
//												MainLauncher.getDelet().TableDelet(dao.Table( MainLauncher.getDelet().getName(),MainLauncher.getDelet().getId_em()));}});
//											break;	
//		case 8://LogIn
//			this.addActionListener(e -> { User u = MainLauncher.getLoginPanel().getInstanz();
//			  							  UserDAO userData = new UserDAO();
//			  							  userData.Login(u);
//			  							  if (userData.Login(u) ) {
//			  								  MainLauncher.getLayout().show(MainLauncher.getContainer(), "EditPanel");
//			  								 }
//			  							  else {
//			  								  System.out.println("failed");
//			  								  // Ricordarsi di fare un Filed dove compare che la password o il nome sono sbagliati !!!
//			  							  		}});
//										break;
//		case 9:// change - delet Buttons
//			if(this.getParent().getName().equals("Delet")) {
//				this.addActionListener(e -> MainLauncher.getDelet().getPopDel().getMainframe().setVisible(true));
//				}
//			else {
//				this.addActionListener(e -> MainLauncher.getChange().getPopChange().getMainframe().setVisible(true));
//			}
//			break;
//		case 10:// Button Yes in Delet or Change
//			this.addActionListener(e ->{
//				if ("popDel".equals(MainLauncher.getDelet().getPopDel().getMainframe().getTitle())) {
//						EmployeeDAO dao = new EmployeeDAO();
//						dao.delete(MainLauncher.getDelet().getName(), MainLauncher.getDelet().getId_em());
//						MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
//				}
//				else {
//					MainLauncher.getChange().getPopChange().getMainframe().setVisible(false);
//				
//					//PROSEGUIRE IL CODICE ; DEVO SLAVARE LE MODIFICHE 
//				}});
//				break;
//		case 11: // Button No in Delet or Change
//			this.addActionListener(e ->{
//				if ("popDel".equals(MainLauncher.getDelet().getPopDel().getMainframe().getTitle())) {
//					MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
//					}
//				else {
//					MainLauncher.getChange().getPopChange().getMainframe().setVisible(false); 
//				}});
//			break;
//		}
			
	}		
				
		/*
		 * public void getEvent( int anwendung) {
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
				
				
				
				
				
			case 6:// Search ---- EmployeeTablePanel/ Delet
				
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
			case 8:// change###########################################
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
							EmployeeDAO dao = new EmployeeDAO();
							dao.delete(MainLauncher.getDelet().getName(), MainLauncher.getDelet().getId_em());
						 MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
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
		 * 
		 * 
		 * */		
				
				
				
				
				
				
				
			
			
	
