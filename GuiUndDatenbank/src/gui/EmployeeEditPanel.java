package gui;
import javax.swing.*;
import model.Button;
import model.Field;

public class EmployeeEditPanel extends JPanel{
	 final private Button addWorker = new Button("add new worker",190,70,2);
	 final private Button search = new Button("search and Table",190,150,3);
	 final private Button change = new Button("Change",190,230,4);
	 final private Button delet = new Button("Delet",190,310,5);
		
	 public EmployeeEditPanel () {
		 setLayout(null); // permette il posizionamento libero
		 add(addWorker);
		 add(search);
		 add(change);
		 add(delet);
	    	  
	    }
	

}

		
