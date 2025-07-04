package gui;
import java.util.Arrays;

import javax.swing.*;

import db.EmployeeDAO.DoubleArrayTable;
import model.*;


public class Changes extends JPanel{
	final private  Field name = new Field("name",190,70,95,30);
	final private  Field Id_em = new Field("Id-em",295,70,95,30);
	final private  Field workType = new Field("work type",190,140);
	final private  Field vacation = new Field("vacation",190,180);
	final private  Field wage = new Field("wage",190,220);
	final private Button change = new Button("change",190,260,9);
	final private Button back = new Button("back",20,30,50,30,1);
	final private Button search = new Button("search",430,70,50,30,7);
	final private Pop popChange = new Pop("Are you sure to change ?","popChange","Change");
	private JTable employeeTable;
	final private JScrollPane scroll = new JScrollPane();
	private int counterArrayPlace; // serve per l´Array per capire quante persone ci sono 
	private Label done = new Label(190,310,"Update complete");
	
	
	public Changes() {
		setLayout(null); // permette il posizionamento libero
		add(name);
		add(Id_em);
		add(workType);
		add(vacation);
		add(wage);
		add(change);
		add(back);
		add(search);
		add(scroll);
		add(done);
		
		scroll.setBounds(10, 350, 565, 100);   //x = lato sinistro  y = lato superiore  width   height 
		scroll.setBorder(null);
		this.setName("Change");
	}

	public String getWorkType() {
		return workType.getText();
	}

//	public int getVacation() {
//		return Integer.parseInt(vacation.getText());
//	}
	public Integer getVacation() {
		return Integer.parseInt(vacation.getText());
		
	}


//	public int getWage() {
//		return Integer.parseInt(wage.getText());
//	}
	public Integer getWage() {
		return Integer.parseInt(wage.getText());
	}

	public String  getText() {
		String output = "name : " + name.getText() + "\n" +
			    		"Id_em : " + Id_em.getText() + "\n" ;
		return output ;
		
	}
	
	
	public Pop getPopChange() {
		return popChange;
	}
	
	public String  getId_em() {
		String output = Id_em.getText();
		return output ;}
	
	public Label getDone() {
		return done;
	}

	public void setDone(Label done) {
		this.done = done;
	}

	public String  getNameField() {
		String output = name.getText();
		return output ;}
	
	public void TableChange(DoubleArrayTable sqlData ) {
		//employeeTable = new JTable(objTable,columnNames);
		employeeTable = new JTable(sqlData.getObjTable(),sqlData.getColumnNames());
		scroll.setViewportView(null);
		scroll.setViewportView(employeeTable);
		repaint();
	}

}
