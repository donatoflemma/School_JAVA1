package flights.models;

public class Passenger {
	// Attributi private per l´incapsulamento e final se non devono cambiare 
	private final String name;
	private final String lastName;
	private final String ID;
	private String flightNumber;
	
	public Passenger (String name,String lastName,String ID,String flightNumber){
		// Il costruttore deve essere !! public !! in modo da creare altri ogetti in altri package 
		this.name = name;
		this.lastName = lastName;
		this.ID = ID;
		this.flightNumber = flightNumber;
	}
	// Tutti i Setter e i Getter devono essere pubblici 
	public String getName () {
		return this.name;
	}
	public String getlastName () {
		return this.lastName;
	}
	public String getID () {
		return this.ID;
	}
	public String getFlightNumber () {
		return this.flightNumber;
	}
	public void setFlightNumber (String flightnumber) {
		// anche il Setter deve essere impostato public per poter essere accessibile da ogni package !!!!! 
		this.flightNumber = flightNumber;
	}
}
