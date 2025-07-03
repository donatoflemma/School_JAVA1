package gui;
import javax.swing.JLabel;
import gui.EmployeeTablePanel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Popup;

import db.EmployeeDAO.DoubleArrayTable;
import model.Button;
import model.Field;
import model.Mainframe;
import model.Pop;

import java.awt.Font;
import java.sql.*;
import java.util.Arrays;

public class Delet extends JPanel {
	final  private  Field name = new Field("name",190,90,95,30);
	final  private  Field Id_em = new Field("Id-em",295,90,95,30);
	
	final  private Button search = new Button("search",430,90,50,30,7);
	final  private Button back = new Button("back",20,30,50,30,1);
	final  private Button delet = new Button("delet",190,140,9);
	final private Pop popDel = new Pop("Are u sure to delet ?","popDel"); 
	private JTable employeeTable;
	final private JScrollPane scroll = new JScrollPane();
	private int counterArrayPlace; // serve per l´Array per capire quante persone ci sono 

	
		
	public Delet() {
		setLayout(null); // permette il posizionamento libero
		add(name);
		add(Id_em);
		add(back);
		add(search);
		add(delet);
		add (scroll);
		
		scroll.setBounds(10, 200, 565, 250);   //x = lato sinistro  y = lato superiore  width   height 
		scroll.setBorder(null);
		this.setName("Delet");// mi serve per il case 6 del Button per fare distinzione 
}


	public Pop getPopDel() {
		return popDel;
	}
	
	

	public String  getNameField() {
		String output = name.getText();
		return output ;}
	
	public String  getId_em() {
		String output = Id_em.getText();
		return output ;}
			
	public void TableDelet(DoubleArrayTable sqlData ) {
		//employeeTable = new JTable(objTable,columnNames);
		employeeTable = new JTable(sqlData.getObjTable(),sqlData.getColumnNames());
		scroll.setViewportView(null);
		scroll.setViewportView(employeeTable);
		System.out.println(Arrays.deepToString(sqlData.getObjTable()));
		repaint();
	}
}

	

