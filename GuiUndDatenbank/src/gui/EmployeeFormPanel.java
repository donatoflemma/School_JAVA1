package gui;
import javax.swing.*;
import model.*;
import db.EmployeeDAO;
import db.EmployeeDAO;

public class EmployeeFormPanel extends JPanel{
	final private Field name = new Field("Name",190,30);
	final private Field lastName = new Field("Last Name",190,70);
	final private Field id = new Field("id",190,110);
	final private Field workType = new Field("Work Type",190,150);
	final private Field hollyday = new Field("Hollyday",190,190);
	final private Field wage = new Field("wage",190,230);
	final private Button add = new Button("add",190,270,5);
	final private Button back = new Button("back",20,30,50,30,1);
		 
	public EmployeeFormPanel() {
		setLayout(null); // permette il posizionamento libero
		add(name);
		add(lastName);
		add(id);
		add(workType);
		add(hollyday);
		add(wage);
		add(add);
		add(back);
	}


	public Employee getInstanz() {
		return  new Employee(name.getText(),lastName.getText(),
							id.getText(),workType.getText(),
							Integer.parseInt(hollyday.getText()),
							Integer.parseInt(wage.getText()));
	}
	
	public void getInstanza(Field name,Field lastName ,Field id, Field workType,Field hollyday,Field wage) {
			Employee n = new Employee(name.getText(),lastName.getText(),
							id.getText(),workType.getText(),
							Integer.parseInt(hollyday.getText()),
							Integer.parseInt(wage.getText()));
	}
	
}
	
