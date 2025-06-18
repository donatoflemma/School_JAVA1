package gui;

import javax.swing.SwingUtilities;

import launcher.MainLauncher;
import model.Button;
import model.Field;
import model.Mainframe;

public class EmployeeTablePanel implements Runnable {
	 public void run() {
	        // Invoked on the event dispatching thread.
	        // Construct and show GUI.
	    	 //Create and set up the window.
		 Mainframe root = new Mainframe("MyApp");
		 
		
		 
		 Field imputUser = new Field("enter name",10,30,565,30);
		 Button research = new Button("rsc",520,70,50,30);
		 
		 
		 root.add(imputUser);
		 
		 root.add(research);
		 
	    	  
	    }

	    public static void main(String[] args) {
	    	// The invokeLater method schedules a Runnable to be processed 
	    	//on the event dispatching thread
	        SwingUtilities.invokeLater(new EmployeeTablePanel());
	        
	       
	    }
}
