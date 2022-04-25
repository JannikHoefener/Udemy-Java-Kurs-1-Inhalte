
public class MethodenReturnII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ergebnis = summe();
		System.out.println("Der Wert aus der Methode Summe ist: " + ergebnis);
		
		int aufgabe = ergebnis - 3;
		System.out.println("Der Wert aus Aufgabe ist: " + aufgabe);
	}
	public static int summe () {
		int a,b,summe;
		a = 5;
		b = 5;
		
		summe = a+b;
		
		return summe;
	}

}
