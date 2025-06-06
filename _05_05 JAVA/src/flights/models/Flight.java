package flights.models;

public class Flight {
	//contiene info come numero volo, aeroporto, lista passeggeri, durata, orario.
   //	Delegazione: contiene un oggetto Airport

	private final String NumberFlight;
	private final String AirportDe;
	private final String AirportArr;
	private String Gasts [];
	private int DepartureH ;
	private int DepartureM ;
	private int ArriveH;
	private int ArriveM ;
	
	Flight(String NumberFlight, String AirportDe, String AirportArr, String Gasts [],int DepartureH, int DepartureM, int ArriveH,int ArriveM){
		this.NumberFlight = NumberFlight ;
		this.AirportDe = AirportDe;
		this.AirportArr = AirportArr;
		this.Gasts =Gasts ;
		/*
		 * this.DepartureH = DepartureH;
		 * this.DepartureM = DepartureM;
		 * */
		
		
		/*
		 * this.ArriveH = ArriveH;
		 * this.ArriveM = ArriveM;
		 * */
		
		
	}
	
	

	
	
}
