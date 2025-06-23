package gui;
import javax.swing.*;
import model.Button;
import model.Field;

public class EmployeeTablePanel extends JPanel{
	final private Field imputUser = new Field("enter name",10,30,565,30);
	final private Button research = new Button("rsc",520,70,50,30,6);
	final private Button back = new Button("back",15,70,50,30,1);
	       
	public EmployeeTablePanel() {
		setLayout(null); // permette il posizionamento libero
		add(imputUser);
		add(research);
		add(back);
		
	}
	
	public String  getText() {
		String output = "imput User :" + imputUser.getText() ;
		return output ;
		
	}
		
		 
		 
		 
		 
		
	    	  
	    }

	  
