package model;

import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.Popup;

public class Pop extends Popup {
	final private Mainframe m;// = new Mainframe("pop",300,200);
	final private JLabel Jl;//= new JLabel("Are u sure to delet ?");
	final private String txt; 
	final private Button yes = new Button ("yes",25,110,50,30,10);
	final private Button no = new Button ("no",205,110,50,30,11);
	final private Font f=new Font("Arial",Font.PLAIN,16);
	 
	 public Pop(String txt, String FrameName,String distinguish) {// ne creo due !!!
		 	m = new Mainframe (FrameName,300,200);// Per cambiare il nome e poter 
		 	this.txt = txt;							//lavorare in comoditá con la if del bottone 
		 	Jl = new JLabel(txt);
			m.add(Jl);
			m.add(yes);
			m.add(no);
			Jl.setBounds(75, 40, 200, 30);// posizione e dimensione del box
			Jl.setFont(f);
			yes.setDistinguish(distinguish);
			no.setDistinguish(distinguish);
			//txt.setBounds(ALLBITS, ABORT, WIDTH, HEIGHT);
		}
	 
	 //public void setMainframeVisible(boolean visible) {
	//	 m.setVisible(visible);
		 
//	 }
	 public Mainframe getMainframe() {
		 return m;
	 }

	 public void  setNameMainframe(String Newname) {
		 m.setName(Newname);
	 }
}


