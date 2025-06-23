package gui;
import javax.swing.*;
import model.*;


public class Changes extends JPanel{
	final private  Field workType = new Field("work type",190,110);
	final private  Field vacation = new Field("vacation",190,150);
	final private  Field wage = new Field("wage",190,190);
	final private Button change = new Button("change",190,270,8);
	
	final private Button back = new Button("back",510,70,50,30,1);
	
	public Changes() {
		setLayout(null); // permette il posizionamento libero
		add(workType);
		add(vacation);
		add(wage);
		add(change);
		add(back);
	}

	public String  getText() {
		String output = "work type: " + workType.getText() + "\n" +
			    		"vacation: " + vacation.getText() + "\n" +
			    		"wage: " + wage.getText();
		return output ;
		
	}
}
