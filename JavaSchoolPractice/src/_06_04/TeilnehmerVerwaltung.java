package _06_04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TeilnehmerVerwaltung {

	private ArrayList<Teilnehmer> participants = new ArrayList<Teilnehmer>();

	public boolean teilnehmerAufnehme(Teilnehmer t) {
		return participants.add(t);
	}

	public boolean teilnehmerExistiert(Teilnehmer t) {
		return participants.contains(t);
	}

	public void print() {
		for (Teilnehmer teilnehmer : participants) {
			System.out.println(teilnehmer);
		}
	}

	public void printParticipantsSortedByName() {
		// Collection é l´interfaccia dove ci sta il metodo sort !!!!
		// quindi lo stiamo chiamand pero con l´implementazione dell´interfaccia COMPARABLE
		Collections.sort(participants);
		print();
	}

	public void printParticipantsSortedByBirthday() {
		// Collection é l´interfaccia dove ci sta il metodo sort !!!!
				// quindi lo stiamo chiamand pero con l´implementazione dell´interfaccia COMPARATOR !!!
		Comparator<Teilnehmer> c = new SortBasedOnBirthday();
		Collections.sort(participants, c);
		print();
	}
	/**
	 * Konstruktoren
	 * 
	 * Methoden: - Teilnehmer aufnehmen - Überprüfung, ob ein Teilnehmer existiert -
	 * Die Teilnehmerlsite nach Name soertiert anzeigen - Die Teilnehemerliste nach
	 * Geburtsdatum sortiert anzeigen - Die Teilnehmer nach Anschrifft sortiert
	 * anzeigen
	 */

}
