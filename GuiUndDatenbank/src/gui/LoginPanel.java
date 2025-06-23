package gui;
import javax.swing.*;
import model.Button;
import model.Field;

public class LoginPanel extends JPanel {
	final private  Field nameUser = new Field("Name User",190,150);
	final private  Field password = new Field("Password",190,190);
	final private Button logIn = new Button("Log in",190,270,7);
	
	final private Button forward = new Button("forward",510,70,50,30,1);
	
	public LoginPanel() {
		setLayout(null); // permette il posizionamento libero
		add(nameUser);
		add(password);
		add(logIn);
		add(forward);
	}

	public String  getText() {
		String output = "name User: " + nameUser.getText() + "\n" +
			    		"password: " + password.getText() + "\n" ;
		return output ;
		
	}
}
