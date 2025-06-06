package _05_19;
/**
 * Modelliert elektronische Artikel bei Conrad Electronics Online Shop
 * 
 * statische Attribute (Modifier static):
 * 						- Gleicher Wert für alle Objekte der Klasse
 * 						- Klassenvariable (Gleicher Inhalt Klassenweit)
 * 						- Typischerweise, solche Attribute werden nicht im Konstruktor initialisiert
 * 
 * statische Methoden (Modifier static):
 * 										- Gleiche Wirkung bzw liefert geleichen wert für Objekte der Klasse
 * 										- Klassenmethoden 
 * 
 * Klassenmitglieder:
 * 					 - Attribute (Instanzattribute vs. Klassenattribute)
 * 					 - Konstruktoren
 * 					 - Methoden (Instanzmethoden vs. Klassnemethoden)
 */

/**
 * Apassung:
 * 				- Attribut hersteller:
 * 						-zusätzlich soll Hersteller des Artikels erfasst werden. 
 * 						- Es gilt alle Artikel sind vom Hersteller Conrad Electronics GmbH
 * 				- Attribut id:
 * 						- Jedes Artikel soll eindeutige Identifikation zugeordnet werden. 
 * 						- Id startet mit dem Text CON und wird mit eindeutiger Nummer ergänzt.
 * 
 * 						- Beispiel: CON001, CON002, CON003 ....			
 * 				- toString soll definiert werden
 * 				- Definiere eine Methode, den Preis mit dem MWST-Anteil berechnet und für den Aufrufer zurück gibt.
 * 				- Der Konstruktor, wenn erforderlich, angepasst werden
 * 				- Lernziel:
 * 							- static, final
 * 
 * 
 * Attribute, die static und final werden üblicherweise:
 * 
 * 			- public deklariert
 * 			- ALL CAPS
 */
public class Artikel {
	

	// Istanzvariable !!!! Vriabili dell OOP 
	 private final int erstellungsjahr;
	 private final String bezeichnung;
	 private double preis;
	 private final String id;
	 
	 
	 // Static Attribute , Klassen Variable
	 private static double mwst;  // Mehwertsteuersatz in % 
	 public static final  String HERSTELLER = "Conrad Electronics GmbH";
	 
	 
	 
	 private static int nummer = 0;
	
	public  Artikel(int erstellungsjahr, String bezeichnung, double preis) {
		//nummer++;
		
//		if(nummer < 10)
//			this.id = "CON00" + nummer;
//		else if(nummer < 100)
//			this.id ="CON0"+ nummer;
//		else 
//			this.id = "CON" + nummer;
		
		this.id = (++nummer <10) ? "CON00" + nummer : (nummer< 100) ? "CON0" + nummer : "CON" + nummer;
		
		this.erstellungsjahr = erstellungsjahr;
		this.bezeichnung = bezeichnung;
		this.preis = preis;
	}

	public int getErstellungsjahr() {
		return erstellungsjahr;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public double getPreis() {
		return preis;
	}
	
	public static double getMwst() {
		return mwst;
	}

	public void setPreis(double preis) {
		this.preis = preis;
	}

	public static void setMwst(double mwst) {
		//this.mwst = mwst;  Statischer Code hat keinen Zugriff auf this
		Artikel.mwst = mwst;
	}
	
	
	public String toString() {
		return "Artikel [erstellungsjahr=" + erstellungsjahr + ", bezeichnung=" + bezeichnung + ", preis=" + preis
				+ ", id=" + id +  ", MWST = " +  mwst + ", Hersteller = " + HERSTELLER +  "]";
	}
	
	
	
	

}
