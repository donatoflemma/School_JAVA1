package gui;
import javax.swing.*;
import model.*;


public class Changes extends JPanel{
	final private  Field name = new Field("name",190,70);
	final private  Field workType = new Field("work type",190,110);
	final private  Field vacation = new Field("vacation",190,150);
	final private  Field wage = new Field("wage",190,190);
	final private Button change = new Button("change",190,270,9);
	final private Button back = new Button("back",20,30,50,30,1);
	final private Button search = new Button("search",430,70,50,30,7);
	final private Pop popChange = new Pop("Are you sure to change ?","popChange");
	
	
	
	public Changes() {
		setLayout(null); // permette il posizionamento libero
		add(name);
		add(workType);
		add(vacation);
		add(wage);
		add(change);
		add(back);
		add(search);
		this.setName("Change");
	}

	public String  getText() {
		String output = "work type: " + workType.getText() + "\n" +
			    		"vacation: " + vacation.getText() + "\n" +
			    		"wage: " + wage.getText();
		return output ;
		
	}
	
	
	public Pop getPopChange() {
		return popChange;
	}

}
