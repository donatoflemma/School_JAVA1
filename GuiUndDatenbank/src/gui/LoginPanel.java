package gui;
import javax.swing.*;
import launcher.MainLauncher;
import model.Button;
import model.Field;
import model.Mainframe;

public class LoginPanel implements Runnable {
	 public void run() {
	        // Invoked on the event dispatching thread.
	        // Construct and show GUI.
	    	 //Create and set up the window.
		 Mainframe root1 = new Mainframe("MyApp");
		 
		 Field nameUser = new Field("Name User",190,150);
		 Field password = new Field("Password",190,190);
		 
		 Button send = new Button("send",190,270);
		 
		 
		 root1.add(nameUser);
		 root1.add(password);
		 root1.add(send);
		 
	    	  
	    }

	    public static void main(String[] args) {
	    	// The invokeLater method schedules a Runnable to be processed 
	    	//on the event dispatching thread
	        SwingUtilities.invokeLater(new LoginPanel());
	        
	       
	    }

}
