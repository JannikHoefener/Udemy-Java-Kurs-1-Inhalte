import java.util.Scanner;

public class AufgabeVerzweigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 1000;
		
		System.out.println("Wie viele Bundesl‰nder hat Deutschland?");
		System.out.println("A: 15"); //falsch
		System.out.println("B:  3"); //flasch
		System.out.println("C: 16"); //richtig
		System.out.println("C: 30"); //falsch
		System.out.println("Gebe nun die korrekte Anzahl ein: ");
		System.out.println("Ihr aktueller Score: " + score + " Punkte");
		
	
		Scanner scan = new Scanner(System.in); //erstellt einen neuen Scanner Namens scan vom typ Scanner 
		int eingabeUser = scan.nextInt();      //erstellt eine Variable Namens einfgabeUser 
										 	   //dessen inhalt die eingabe vom Scanner scan sein soll.
		
		if (eingabeUser == 16) {
			System.out.println("Das ist Richtig!!! Sie erhalten 100 Punkte");
			score += 100;
			System.out.println("Ihr aktueller Score: " + score + " Punkte");
			System.out.println("Wie heiﬂt der Bundespr‰sident?");
				//weitere else if verzweigungen in bezug auf die Frage
		} else if (eingabeUser == 3) {
			System.out.println("Das ist leider Falsch! - 150 Punkte");
			score -= 150;
			System.out.println("Ihr aktueller Score: " + score + " Punkte");
		} else if (eingabeUser == 15) {
			System.out.println("Das ist leider Falsch! - 25 Punkte");
			score -= 25;
			System.out.println("Ihr aktueller Score: " + score + " Punkte");
		}  else if (eingabeUser == 30) {
			System.out.println("Das ist leider Falsch! - 100 Punkte");
			score -= 100;
			System.out.println("Ihr aktueller Score: " + score + " Punkte");
		}
	}

}
