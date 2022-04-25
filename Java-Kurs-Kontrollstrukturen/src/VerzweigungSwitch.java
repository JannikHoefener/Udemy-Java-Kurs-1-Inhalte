import java.util.Scanner;

public class VerzweigungSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch (5) {
		case 0: {
			System.out.println("Die Zahl ist eine 0");
		}
			break;
		case 3: {
			System.out.println("Die Zahl ist eine 3");
		}
			break;
		case 5: {
			System.out.println("Die Zahl ist eine 5");
		}
			break;
		}
		
		
		//Beispiel:
		int score = 1000;
		
		System.out.println("Wie viele Bundesl‰nder hat Deutschland?");
		System.out.println("A: 15"); //falsch
		System.out.println("B:  3"); //flasch
		System.out.println("C: 16"); //richtig
		System.out.println("C: 30"); //falsch
		System.out.println("Gebe nun die korrekte Anzahl ein: ");
		System.out.println("Ihr aktueller Score: " + score + " Punkte");
		
		Scanner scan = new Scanner(System.in);
		int eingabeSpieler = scan.nextInt();
		
		switch(eingabeSpieler) {
		case 16: {
			System.out.println("Das ist Richtig!!! Sie erhalten 100 Punkte");
			score += 100;
			System.out.println("Ihr aktueller Score: " + score + " Punkte");
			System.out.println("Wie heiﬂt der Bundespr‰sident?");
		}
			break;
		
		case 3: {
			System.out.println("Das ist leider Falsch! - 150 Punkte");
			score -= 150;
			System.out.println("Ihr aktueller Score: " + score + " Punkte");
		}
			break;
			
		case 15: {
			System.out.println("Das ist leider Falsch! - 25 Punkte");
			score -= 25;
			System.out.println("Ihr aktueller Score: " + score + " Punkte");
		}
			break;
			
		case 30: {
			System.out.println("Das ist leider Falsch! - 100 Punkte");
			score -= 100;
			System.out.println("Ihr aktueller Score: " + score + " Punkte");
		}
			break;
		default: {
			System.out.println("Zahl ist unbekannt");
		}
			break;
			
		}
		
	}

}
