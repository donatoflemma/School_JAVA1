package _06_18;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

import Prog1Tools.IOTools;

public class Uebung {
	public static void main(String[] args) {
		
		

		/**
		 * Rufe die Methode hier auf und das eingelesene Geburtsdatum soll auf Deutsch
		 * formatiert in der Format DD.MM.YY auf der Konsole ausgegeben werden
		 */

	boolean isOk = true;
		
		do {
			try {
				LocalDate d = readBirthday("please enteryour birthday in the form YYYY-MM-DD: ");
				System.out.println(d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
				isOk = true;
			} catch (BirthdayException e) {
	           System.out.println(e.getMessage());
	           isOk = false;
	           
			}	
		}while(!isOk);
		

	}

	/**
	 * 
	 * @param message --- etwas was für den User angezeigt wird, wie zum Beispiel:
	 *                Gebe dein Geburtsdatum in der Format YYYY-MM-DD ein;
	 * @return .... Ein gültiges Geburtsdatum soll zurückgegeben werden
	 * 
	 *         Lernziel: - Praxis - Exception Mechanismus in Java
	 */
	static LocalDate readBirthday(String message) throws BirthdayException {
		
		try{
			String text = IOTools.readLine(message);
			LocalDate input = LocalDate.parse(text);
			LocalDate today = LocalDate.now();
			if (input.isBefore(today))
				return input;
			
		}catch (DateTimeParseException e) {
			System.out.println("Falsches Format, bite nochmal versuchen...");
			return readBirthday(message); //Rekursion
			
		}

		throw new BirthdayException("Das Geburtsdatum muss in der Vergangenheit liegen!");



	}
	static LocalDate readBirthdayV2(String message) throws BirthdayException {
		
		try{
			String text = IOTools.readLine(message);
			LocalDate input = LocalDate.parse(text);
			LocalDate today = LocalDate.now();
			if (input.isBefore(today))
				return input;
			
		}catch (DateTimeParseException e) {
			System.out.println("Falsches Format, bite nochmal versuchen...");
			throw e;
			
		}

		throw new BirthdayException("Das Geburtsdatum muss in der Vergangenheit liegen!");



	}
	static class BirthdayException extends Exception {

		public BirthdayException(String message) {
			super(message);
		}
	}
}
