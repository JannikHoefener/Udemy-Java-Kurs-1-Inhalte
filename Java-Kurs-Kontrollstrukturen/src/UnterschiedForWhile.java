import java.util.Scanner;

public class UnterschiedForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Allgemeiner Aufbau einer for-Schleife
		 *
		 *for (Anfangswert; Abbruchbedinung; Z�hler) {
		 *}
		  Allgemeiner Aufbau einer while-Schleife
		 *
		 *while (Bedingung) {
		 *    "Anweisungsblock"
		 *}
		 *
		 *Merke: Bedingung kann entweder true oder false sein
		 */
		
//		for (int i = 1; i<5; i++) {
//			System.out.println("Asteroid wurde erstellt Nr: " + i);
//		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Dr�cke 1 f�r Schwierigkeitsgrad Leicht: \n Dr�cke 2 f�r Schwierigkeitsgrad Mittel: \n Dr�cke 3 f�r Schwierigkeitsgrad Schwer:");
		
		int userEingabe = scan.nextInt();
		
		int anzahlGegner = 0;
		
		if (userEingabe == 1) {
			anzahlGegner = 10;
		} else if (userEingabe == 2) {
			anzahlGegner = 20;
		} else if (userEingabe == 3) {
			anzahlGegner = 30;
		}
		
		while (anzahlGegner != 0) {
			System.out.println("Gegner Erstellt!");
			anzahlGegner --;
		}
	}

}
