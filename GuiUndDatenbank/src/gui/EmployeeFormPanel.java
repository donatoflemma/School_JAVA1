package gui;

import javax.swing.*;
import model.Button;
import model.Field;
import model.Mainframe;

public class EmployeeFormPanel implements Runnable{
	 public void run() {
	        // Invoked on the event dispatching thread.
	        // Construct and show GUI.
	    	 //Create and set up the window.
		 Mainframe root = new Mainframe("MyApp");
		 
		 Field name = new Field("Name",190,30);
		 Field lastName = new Field("Last Name",190,70);
		 Field id = new Field("id",190,110);
		 Field workType = new Field("Work Type",190,150);
		 Field hollyday = new Field("Hollyday",190,190);
		 Field wage = new Field("wage",190,230);
		 
		 Button add = new Button("add",190,270);
		 
		 
		 root.add(name);
		 root.add(lastName);
		 root.add(id);
		 root.add(workType);
		 root.add(hollyday);
		 root.add(wage);
		 root.add(add);
		
	    	  
	    }

	    public static void main(String[] args) {
	    	// The invokeLater method schedules a Runnable to be processed 
	    	//on the event dispatching thread
	        SwingUtilities.invokeLater(new EmployeeFormPanel());
	        
	       
	    }

}
