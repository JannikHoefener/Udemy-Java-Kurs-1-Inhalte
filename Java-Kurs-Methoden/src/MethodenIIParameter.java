
public class MethodenIIParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		erstelleGegner("Peter", 100);
		erstelleGegner("Olaf", 80);
		erstelleGegner("Rudi", 50);
	}
	public static void erstelleGegner(String name, int lebenspunkte) {
		String gegnerName = name;
		int gegnerLeben = lebenspunkte;
		System.out.println("Gegner wurde erstellt! " + gegnerName + " LP: " + gegnerLeben);
	}

}
