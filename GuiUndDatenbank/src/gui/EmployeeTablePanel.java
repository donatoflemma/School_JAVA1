package gui;
import java.sql.*;

import javax.swing.*;

import db.DatabaseConnection;
import model.Button;
import model.Field;

public class EmployeeTablePanel extends JPanel{
	final private Field imputUser = new Field("enter name",10,30,565,30);
	final private Button research = new Button("rsc",520,70,50,30,6);
	final private Button back = new Button("back",15,70,50,30,1);
	final private String[] columnNames = {"Name","Last Name","ID_em","Work Type","Vacation","Wage"};
	private Object[][] objTable = {};
	
	public EmployeeTablePanel() {
		setLayout(null); // permette il posizionamento libero
		add(imputUser);
		add(research);
		add(back);
		
	}
	
	public String  getText() {
		String output =imputUser.getText();
		return output ;
		
	}
	
	
	public void Table(String lookingFor) {
		Connection conn = DatabaseConnection.connect();
		if (conn != null) {
			try {/////////// DA FINIRE!!!!!!!!!!!!!!!!
				ResultSet rs ; // mi serve una variabile locale per salvare qullo che succede nella if
				ResultSet countRS;
				Statement stmt1 ;
				Statement stmt2 ;
				PreparedStatement stmt3;
				PreparedStatement stmt4;
				
				if (lookingFor.equals("all")) {
					String sql = "SELECT * FROM employee;";
					stmt1 = conn.createStatement();// se non devo passare niente nella Query
					rs = stmt1.executeQuery(sql);
					
					String sqlCount = "SELECT COUNT(*) FROM employee;";
					stmt2 = conn.createStatement();
					countRS = stmt2.executeQuery(sqlCount);
					
					}
				else {
					String sql = "SELECT * FROM employee Where name = ?;";
					stmt3 = conn.prepareStatement(sql);// se devo inserire qualcosa nella Query
					stmt3.setString(1, lookingFor);
					rs = stmt3.executeQuery();// non passa niente perche PrepareStatement prepara tutto
					
					String sqlCount = "SELECT COUNT(*) FROM employee Where name = ?;";
					stmt4 = conn.prepareStatement(sqlCount);
					stmt4.setString(1, lookingFor);
					countRS = stmt4.executeQuery();
					}
			while (rs.next()) {
				//System.out.println("name: " + rs.getString("name"));
				//System.out.println("last name: " + rs.getString("lastName"));
				//System.out.println("id_em: " + rs.getString("id_em"));
				//System.out.println("work: " + rs.getString("workType"));
				//System.out.println("vacation: " + rs.getInt("vacation"));
				//System.out.println("wage: " + rs.getInt("wage"));
				//System.out.println();
				
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("lastName"));
				System.out.println(rs.getString("id_em"));
				System.out.println(rs.getString("workType"));
				System.out.println(rs.getInt("vacation"));
				System.out.println(rs.getInt("wage"));
				System.out.println();}
			countRS.next(); // a quanto pare lo devo fare per forza per poter passare alla colonna dove sta il numero !!!
			int NumberObj = countRS.getInt("COUNT(*)");
			System.out.println(NumberObj);
			conn.close();
			
			} catch (SQLException e) {
			}
		}
	//return table;
	}
}

	  
