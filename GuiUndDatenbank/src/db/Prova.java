package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import db.DatabaseConnection;
import model.Employee; 
import db.EmployeeDAO.DoubleArrayTable;

public class Prova {
	public DoubleArrayTable Table(String lookingFor,List checkb) {//String classPane,List checkb
		Connection conn = DatabaseConnection.connect();
		int  counterArrayPlace = 0;
		DoubleArrayTable sqlData = null; // la devo dichiarare prima del try se no mi da errore perche la esco con return 
		//System.out.println("classPane: " + classPane +  "    lookingFor: " + lookingFor );
		if(conn != null) {
			
			try {
				ResultSet rs ; // mi serve una variabile locale per salvare qullo che succede nella if
				ResultSet countRS;
				Statement stmt1 ;
				Statement stmt2 ;
				PreparedStatement stmt3;
				PreparedStatement stmt4;
				// Qua devo mettere una if in modo da utilizzare le jcheckbox
				
				
				
				if (lookingFor.equalsIgnoreCase("all" ) ) { // Sia per il nome che per la List del Check 
					// checkb.get(0).equals("all")
					String sql; // dichiaro la variabile 
					if(checkb.get(0).equals("all")) {
						sql = "SELECT * FROM employee;";
						stmt1 = conn.createStatement();// se non devo passare niente nella Query
						rs = stmt1.executeQuery(sql);
						}
					else {
						//+ String.join(", ", fields) +
						sql = "SELECT "+ String.join(",", checkb) + "FROM employee;";
						stmt1 = conn.createStatement();// se non devo passare niente nella Query
						rs = stmt1.executeQuery(sql);
					}
						
						
						
						String sqlCount = "SELECT COUNT(*) FROM employee;";
						stmt2 = conn.createStatement();
						countRS = stmt2.executeQuery(sqlCount);
						
						}
				else {	
					
					String sql;
					if(checkb.get(0).equals("all")) {
						sql = "SELECT * FROM employee Where name = ?;";
						stmt3 = conn.prepareStatement(sql);// se devo inserire qualcosa nella Query
						stmt3.setString(1, lookingFor);
						rs = stmt3.executeQuery();// non passa niente perche PrepareStatement prepara tutto
						}
					else {
						//+ String.join(", ", fields) +
						sql = "SELECT "+ String.join(",", checkb) + "FROM employee Where name = ?;";
						stmt3 = conn.prepareStatement(sql);// se devo inserire qualcosa nella Query
						stmt3.setString(1, lookingFor);
						rs = stmt3.executeQuery();// non passa niente perche PrepareStatement prepara tutto
					}
					
					
					
					
					
//						String sql = "SELECT * FROM employee Where name = ?;";
//						stmt3 = conn.prepareStatement(sql);// se devo inserire qualcosa nella Query
//						stmt3.setString(1, lookingFor);
//						rs = stmt3.executeQuery();// non passa niente perche PrepareStatement prepara tutto
						
						String sqlCount = "SELECT COUNT(*) FROM employee Where name = ?;";
						stmt4 = conn.prepareStatement(sqlCount);
						stmt4.setString(1, lookingFor);
						countRS = stmt4.executeQuery();
						}
				countRS.next(); // a quanto pare lo devo fare per forza per poter passare alla colonna dove sta il numero !!!
				int NumberObj = countRS.getInt("COUNT(*)"); // cosi so quante persone sono contenute nella ricerca
				
				String[][] objTable = new String [NumberObj][6];// Array con [N. ogetti][Quante colonne ci sono in ogni ogetto ]
				//counterArrayPlace = 0;
				
				while (rs.next()) {
					objTable [counterArrayPlace][0] = rs.getString("name");
					objTable [counterArrayPlace][1] = rs.getString("lastName");
					objTable [counterArrayPlace][2] = rs.getString("id_em");
					objTable [counterArrayPlace][3] = rs.getString("workType");
					objTable [counterArrayPlace][4] = rs.getString("vacation");
					objTable [counterArrayPlace][5] = rs.getString("wage") ;
					counterArrayPlace ++;// mi serve per inserire in ordine tutti i dati
					}
			sqlData = new DoubleArrayTable(objTable);
			rs = null;  // mi serve una variabile locale per salvare qullo che succede nella if
			countRS = null;
			stmt1 = null;
			stmt2 = null;
			stmt3 = null;
			stmt4 = null;
			conn.close();
			
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		
		}
	
		return sqlData;
	}
	

}
