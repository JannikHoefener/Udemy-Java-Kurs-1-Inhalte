import java.util.Scanner;

public class Einlesen2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int alter = scan.nextInt();
		String name = scan.next();
		
		Scanner.close();
		
		System.out.println("Name: " + name +" Alter: " + alter);
		
	}

}
