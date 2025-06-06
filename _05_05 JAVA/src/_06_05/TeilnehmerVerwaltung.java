package _06_05;

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

		Collections.sort(participants);
		print();
	}

	public void printParticipantsSortedByBirthday() {

		Comparator<Teilnehmer> c = new SortBasedOnBirthday();
		Collections.sort(participants, c);
		print();
	}
	
	public void printParticipantsSortedByAdress() {
		
		// Sortiere nach Anschrifft
		Collections.sort(participants, null);
		
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
