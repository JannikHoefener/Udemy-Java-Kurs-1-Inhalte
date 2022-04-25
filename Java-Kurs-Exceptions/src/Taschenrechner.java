


public class Taschenrechner {
	//Attribute / Eigenschaften 
	
	//Konstruktoren
	
	//Methoden
	public static void plus (int userZahl1, int userZahl2) {
		System.out.println("Ergebnis: " + (userZahl1 + userZahl2));
	}
	
	public static void minus (int userZahl1, int userZahl2) {
		System.out.println("Ergebnis: " + (userZahl1 - userZahl2));
	}
	
	public static void division (int userZahl1, int userZahl2) throws Exception {
		if (userZahl2 == 0) {
			throw new NichtDurchNullTeilenExeption("Hey du darfst keine Null eintippen");
		} else  {
			System.out.println("Ergebnis: " + (userZahl1 / userZahl2));
		}
	}
	
	// Static macht aus den Methoden keine Objekt methoden sonder Klassen Methoden.
	// Es muss also kein Objekt erstellt werden um auf die Methoden zu zugreifen.

}
