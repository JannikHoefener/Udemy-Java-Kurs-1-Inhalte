import java.util.Scanner;

public class Einlesen1 {

	public static void main(String[] args) {

		//klasse = komplexer Datentyp sprich dort sind mehr als nur eine Information gespeichert
		
		Scanner scanner1 = new Scanner(System.in); //(new ist ein Operator)
		System.out.println("Bitte geben sie eine Zahl ein: ");
		double zahl = scanner1.nextDouble();
		System.out.println("Die Zahl lautet: " + zahl);
		
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Geben Sie bitte ihren Namen ein: ");
		String zeichenkette = scanner2.next(); //.nextString() ist nicht notwendig 
		System.out.println("Geben Sie bitte ihr Alter ein: ");
		int alter = scanner2.nextInt(); /* 	wenn Scanner2 ein Int einlieﬂt wird diese Information in der Variable alter gespeichert
		 									anders gesagt: in der Variable alter wird der n‰chste Int gespeichert, sobald scanner2 einen Int erkennt
		 								*/
		System.out.println("Ihr Name: " + zeichenkette + " Ihr Alter: " + alter);
	}

}
