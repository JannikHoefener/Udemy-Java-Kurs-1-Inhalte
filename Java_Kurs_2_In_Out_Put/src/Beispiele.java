import java.util.Scanner;

public class Beispiele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner newScanner = new Scanner (System.in); // System.in = Input = Tastatur
		
		String ganzerName = newScanner.nextLine(); //ließt mehrere Wörter ein
		char geschlecht = newScanner.next().charAt(0); //ließt nur 1 einzelnes Wort ein
		int age = newScanner.nextInt();
		double mobile = newScanner.nextDouble();
		
		newScanner.close();
		
		System.out.println("Name: " + ganzerName);
		System.out.println("Geschlecht: " + geschlecht);
		System.out.println("Alter: " + age);
		System.out.println("Handy-Nummer: " + mobile);
	}

}
