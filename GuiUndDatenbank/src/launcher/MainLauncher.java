package launcher;
import model.Button;
import model.Field;
import model.Mainframe;

import javax.swing.*;



public class MainLauncher implements Runnable {
	 public void run() {
	        // Invoked on the event dispatching thread.
	        // Construct and show GUI.
	    	 //Create and set up the window.
		 Mainframe root = new Mainframe("MyApp");
		 
		
		 
		 Button addWorker = new Button("add new worker",190,70);
		 Button resurch = new Button("resurch and Table",190,150);
		 Button wageChange = new Button("wage change",190,230);
		 
		 
		 root.add(addWorker);
		 root.add(resurch);
		 root.add(wageChange);
		 
	    	  
	    }

	    public static void main(String[] args) {
	    	// The invokeLater method schedules a Runnable to be processed 
	    	//on the event dispatching thread
	        SwingUtilities.invokeLater(new MainLauncher());
	        
	       
	    }
}
