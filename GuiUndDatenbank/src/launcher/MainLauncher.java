package launcher;
import javax.swing.*;
import java.awt.CardLayout;
import model.Mainframe;
import gui.*;



public class MainLauncher implements Runnable {
	static CardLayout layout ;  // per richiamare entrambi nel metodo del Buttom
	static JPanel container ;// devo dichiararli static fuori dal metodo
	static EmployeeEditPanel editPanel = new EmployeeEditPanel();
	static EmployeeFormPanel formPanel = new EmployeeFormPanel();
	static EmployeeTablePanel TablePanel = new EmployeeTablePanel();
	static LoginPanel loginPanel = new LoginPanel();
	static Changes change = new Changes();
	 
	
	public void run() {
	     Mainframe root = new Mainframe("MyApp");
	     layout = new CardLayout();// procedo con la inizializzazione delle istanze
	 	 container = new JPanel(layout);
		
		 // JPANEL !!
	 	 container.add(editPanel,"EditPanel");
	 	 container.add(formPanel,"FormPanel");
	 	 container.add(TablePanel,"TablePanel");
	 	 container.add(loginPanel,"LoginPanel");
		 container.add(change,"Change");
		
		
		 root.setContentPane(container);
		 layout.show(container, "LoginPanel"); // mostra il menu
}

	 

		public static void main(String[] args) {
	    	// The invokeLater method schedules a Runnable to be processed 
	    	//on the event dispatching thread
	        SwingUtilities.invokeLater(new MainLauncher());
	        
	       
	    }
		
		
		public static CardLayout getLayout() {
			return layout;
		}

		public static JPanel getContainer() {
			return container;
		}



		public static EmployeeEditPanel getEditPanel() {
			return editPanel;
		}



		public static EmployeeFormPanel getFormPanel() {
			return formPanel;
		}



		public static EmployeeTablePanel getTablePanel() {
			return TablePanel;
		}



		public static LoginPanel getLoginPanel() {
			return loginPanel;
		}

		public static Changes getChange() {
			return change;
		}

		

		
	    
	    
}
