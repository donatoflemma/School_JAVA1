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
	private String distinguish;
	
	
	
	
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
	public Button (String textBotton, int x , int y, int width, int height,int anwendung,String distinguish) {
		//super(textBotton);
		this.textBotton=textBotton;
		this.setText(textBotton);
		this.x = x;
		this.y = y;
		this.distinguish = distinguish;
		this.setBounds(x, y , width, height);
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setHorizontalAlignment(JTextField.CENTER);
		this.getEvent(anwendung);
		
	}

	
    public String getDistinguish() {
    	return distinguish;
    }
    public void setDistinguish(String set) {
    	this.distinguish = set;
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
										  MainLauncher.getFormPanel().getDone().setText();
			 							});
										break;
		case 7:// Search ---- EmployeeTablePanel/ Delet / Change
			this.addActionListener(e -> {  if(this.getParent().getName().equals("Table")) {
//												System.out.println(MainLauncher.getTablePanel().getSelect());
												EmployeeDAO dao = new EmployeeDAO();
												MainLauncher.getTablePanel().Table(dao.Table( MainLauncher.getTablePanel().getImputUser(),MainLauncher.getTablePanel().getSelect()));
												//System.out.println(MainLauncher.getTablePanel().getCh().getText());
												if(MainLauncher.getTablePanel().getAll().isSelected()) {// seleziono tutti i bottoni
													MainLauncher.getTablePanel().getNameCh().setSelected(true);
													MainLauncher.getTablePanel().getLastNameCh().setSelected(true);
													MainLauncher.getTablePanel().getIdCh().setSelected(true);
													MainLauncher.getTablePanel().getWorkTypeCh().setSelected(true);
													MainLauncher.getTablePanel().getVacationCh().setSelected(true);
													MainLauncher.getTablePanel().getWageCh().setSelected(true);
												}}
											else if(this.getParent().getName().equals("Delet"))
											{
												EmployeeDAO dao = new EmployeeDAO();
												MainLauncher.getDelet().TableDelet(dao.Table( MainLauncher.getDelet().getNameField(),MainLauncher.getDelet().getId_em()));}
											else{
												EmployeeDAO dao = new EmployeeDAO();
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
			//this.addActionListener(e ->{System.out.println(this.getDistinguish());});
			this.addActionListener(e ->{
				if (this.getDistinguish().equals("Delet")) {
						System.out.println("del");
						EmployeeDAO dao = new EmployeeDAO();
						System.out.println(this.getParent().getParent().getName());
						dao.delete(MainLauncher.getDelet().getName(), MainLauncher.getDelet().getId_em());
						MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
						MainLauncher.getDelet().getDone().setText();
						System.out.println("sto nella if");
					
				}
				else {
					System.out.println("sto nella else");
					MainLauncher.getChange().getPopChange().getMainframe().setVisible(false);
					String name = MainLauncher.getChange().getNameField();
					String Id_em = MainLauncher.getChange().getId_em();
					String workType = MainLauncher.getChange().getWorkType();
					Integer vacation = MainLauncher.getChange().getVacation();
					Integer wage = MainLauncher.getChange().getWage();
					EmployeeDAO dao = new EmployeeDAO();
					dao.update(workType, vacation, wage, name, Id_em);
					MainLauncher.getChange().getDone().setText();
					}});
			
			
				break;
		case 11: // Button No in Delet or Change  	Paolo	Testa	P098112	carpenter	6	1558
			this.addActionListener(e ->{
				if (this.getDistinguish().equals("Delet")) {
					MainLauncher.getDelet().getPopDel().getMainframe().setVisible(false);
					System.out.println("sto nella if");
					}
				else {
					MainLauncher.getChange().getPopChange().getMainframe().setVisible(false);
					System.out.println("sto nella else");
					}});
			break;
		}
	
	}
	
}
