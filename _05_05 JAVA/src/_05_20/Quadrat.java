package _05_20;
/**
 * 
 *  Ein Quadrat ist ein Viereck, mit alle vier Seiten gleich lang
 *  
 *  Ein Quadrat hat außerdem einen Mittelpunkt.
 *  
 *  
 *  Flächeninhalt und Umfang lassen sich auch berechnen. 
 *  
 *  Ergänze die Klasse:
 *  					 - Mit Attributen, Methoden, Setters, Getters, toString, und weitere Methoden
 *
 */
public class Quadrat extends Rechteck {
	
	public Quadrat (double seite, Punkt mittelpunkt){
		super(seite,seite, mittelpunkt);
		
		
	}
	public double Flächeninhalt() {
		return getLaenge() * getLaenge();
	}
	public double Umfang () {
		return getLaenge() * 4;
	}
	@Override
	public String toString() {
		return "Quadrat [seite =" + getLaenge() + " ---- " + "mittelpunkt =" +  mittelpunkt + "]";
	}
	public double getSeite() {
		return getLaenge();
	}
	public void setSeite(double seite) {
		setLaenge(seite);
		setBreite(seite);
	}
	
	
	
	
	
	
	
	
	
}
