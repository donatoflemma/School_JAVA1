package gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Popup;

import model.Button;
import model.Field;
import model.Mainframe;

import java.sql.*;

public class Delet extends JPanel {
	final private  Field name = new Field("name",190,90);
	final private Button surch = new Button("surch",430,90,50,30,1);
	final private Button back = new Button("back",20,30,50,30,1);
	final private Button delet = new Button("delet",190,140,8);
	final private Pop pop = new Pop ();
	
		
	public Delet() {
		setLayout(null); // permette il posizionamento libero
		add(name);
		add(back);
		add(surch);
		add(delet);
		}
	public Pop getPop() {
		return this.pop;
	}

//	public String  getText() {
//		String output = "work type: " + workType.getText() + "\n" +
//				    	"vacation: " + vacation.getText() + "\n" +
//				    	"wage: " + wage.getText();
//		return output ;}
			
		}
	 class Pop extends Popup  {
		static private Mainframe m = new Mainframe("pop",300,300);
		static private JLabel txt= new JLabel("Are u sure to delet ?");
		static private Button yes = new Button ("yes",50,200,50,30,1);
		static private Button no = new Button ("no",50,200,50,30,1);
		
		public Pop() {
			m.add(txt);
			m.add(yes);
			m.add(no);
			//this.show();
			//popup.hide();
		}
}
	

