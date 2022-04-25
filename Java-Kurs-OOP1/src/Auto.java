
public class Auto {

	// Eigenschaften / Attribute
	static int reifen = 4;
	int preis;
	String marke;

	// Konstruktor(en) = ähnlich wie eine Methode nur ohne void oder Ausgabe/Return
	// Wert
	public Auto(int reifen, int preis, String marke) {
		this.reifen = reifen;
		this.preis = preis;
		this.marke = marke;
	}
	
	public static void ausgabe() {
		System.out.println("Ich bin einer Klassenmethode und brauche kein Objekt");
	}

	// Methoden
	public void gasGeben() { // Methode hat noch void oder eine Ausgabe/Return Wert
		System.out.println("Das Auto mit der Marke " + this.marke + " fährt jetzt los");
	}

	public void bremsen() {
		System.out.println("Das Auto mit der Marke " + this.marke + " bremst jetzt");
	}

	public void vergleichePreis(int preis) {
		if (this.preis <= preis ) {
			System.out.println("Der " + this.marke + " ist Billiger");
		} else {
			System.out.println("Der " + this.marke + " ist teurer");
			
		}
	}
}
