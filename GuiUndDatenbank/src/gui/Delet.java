package gui;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Popup;

import model.Button;
import model.Field;
import model.Mainframe;
import model.Pop;

import java.awt.Font;
import java.sql.*;

public class Delet extends JPanel {
	final  private  Field name = new Field("name",190,90);
	final  private Button surch = new Button("surch",430,90,50,30,1);
	final  private Button back = new Button("back",20,30,50,30,1);
	final  private Button delet = new Button("delet",190,140,10);
	final private Pop popDel = new Pop("Are u sure to delet ?","popDel"); 
	
	
		
	public Delet() {
		setLayout(null); // permette il posizionamento libero
		add(name);
		add(back);
		add(surch);
		add(delet);
}


	public Pop getPopDel() {
		return popDel;
	}
	
	

//	public String  getText() {
//		String output = "work type: " + workType.getText() + "\n" +
//				    	"vacation: " + vacation.getText() + "\n" +
//				    	"wage: " + wage.getText();
//		return output ;}
			

}

	

