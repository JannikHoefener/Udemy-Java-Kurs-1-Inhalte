
public class MethodenII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Merke: Eine Methode erledigt immer eine bestimmte Aufgabe
		//Methode wird auch Funktion genannt
		
		
		//Beispiel: mehrere Gegner erstellen
//		string gegnerName1 = "Olaf";
//		int gegnerLeben = 100;
//		
//		string gegnerName2 = "Olaf";
//		int gegnerLeben = 100;
//		
//		string gegnerName3 = "Olaf";
//		int gegnerLeben = 100;
//		
//		string gegnerName4 = "Olaf";
//		int gegnerLeben = 100;
//		
//		string gegnerName5 = "Olaf";
//		int gegnerLeben = 100;
//		
//		string gegnerName6 = "Olaf";
//		int gegnerLeben = 100;
//		
//		string gegnerName7 = "Olaf";
//		int gegnerLeben = 100;
//		
//		string gegnerName8 = "Olaf";
//		int gegnerLeben = 100;
//		
//		string gegnerName9 = "Olaf";
//		int gegnerLeben = 100;
		
//		//Mit methoden (immer noch recht umständlich)
//		erstelleGegner();
//		erstelleGegner();
//		erstelleGegner();
//		erstelleGegner();
//		erstelleGegner(); //...
		
		//Mit Methoden
		
		for (int i = 1; i <= 10; i++) {
			erstelleGegner();
		}
		
	}
	// erstellt wird eine Methode die das für uns tut
	public static void erstelleGegner() {
		String gegnerName = "Olaf";
		int gegnerLeben = 100;
		System.out.println("Gegner wurde erstellt");
	}

}
