
public class Variablen {

	public static void main(String[] args) {
		
		// Grober Aufbau:
		// <Datentypen> <Variablenname> = <Wert> ;
		int varZahl = 3;
		// wir deklarieren eine Variable mit dem Namen varZahl mit dem typ int
		// und inizalisieren die 3 (zuweisung)
		// wichtig nicht das ; am Ende vergessen
		
		long varZahlZwei = 300;
		double varZahlDrei = 322.23;
		char zeichen = '+';
		
		float varZahlVier = 23.34f; 
		//hier versuchen wir ein Double in ein Float zu speicher, daher das f am ende des Wertes
		
		boolean userKlick = true; 
		//hier kann nur true oder false sein
		
		
		
		//Beispiel
		int highscore = 0;
		System.out.println("Dein Highscore:" + highscore);
		highscore = 10;
		System.out.println("Dein Highscore:" + highscore);
		highscore = 20;
		System.out.println("Dein Highscore:" + highscore);
		//wir arbeiten also mit der Variable weiter (wir müssen nicht noch mal int davor schreiben,
		//da Sie ja schon als int oben definiert wurde
	}

}
