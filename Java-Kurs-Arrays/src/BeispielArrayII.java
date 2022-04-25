import java.util.Scanner;

public class BeispielArrayII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] fragen = {"Wie viel 5 + 4? ", "Wie viel ist 3*5? "}; //Index = 0 bis 1
		int[] antworten = {9,15};
		
		int count = 0;
		
		while (count < fragen.length) {
			System.out.println(fragen[count]);
			
			Scanner userErgebnis = new Scanner (System.in);
			int eingabeUser = userErgebnis.nextInt();
			
			if (eingabeUser == antworten[count]) {
				System.out.println("Richtig! ");
				count += 1;
			} else {
				System.out.println("Falsch! Leider Verloren! Der Test ist beendet ");
				break;
			}
				
		}
		//System.out.println("Du hast alle Fragen richtig beantwortet, Glückwunsch!");
	}

}
