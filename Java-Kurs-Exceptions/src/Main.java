import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		try { 			// Hier folgt alles was Fehler-anfällig sein könnte		
			System.out.println("Bitte Zahl 1 eingeben...");
			int userZahl1 = scan.nextInt();
			System.out.println("Bitte Zahl 2 eingeben...");
			int userZahl2 = scan.nextInt();
			
			Taschenrechner.division(userZahl1, userZahl2);
			
		} catch (NichtDurchNullTeilenExeption e) { //Exception ist die gesammte "error Klasse" in Java
			System.out.println("Man kann nicht durch 0 teilen.");
			System.out.println("Bitte neue Zahlen eingeben.");
			int  neuEingabe1 = scan.nextInt();
			int  neuEingabe2 = scan.nextInt();
			
			try {
				Taschenrechner.division(neuEingabe1, neuEingabe2);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		System.out.println("Programm geht weiter!");
	}

}
