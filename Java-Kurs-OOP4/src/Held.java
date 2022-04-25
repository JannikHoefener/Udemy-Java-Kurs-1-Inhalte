
public class Held {
	public String name; // Zugriff auch außerhalb der Klasse erlaubt
	
	private int lebenspunkte; // Zugriff nur innerhalb der Klasse erlaubt
	
	int alter; // vor int steht quasi unsichtbar "package"

	// Konstruktor
	public Held(int lebenspunkte) {
		if (lebenspunkte <= 100 && lebenspunkte > 0) {
		this.lebenspunkte = lebenspunkte;
		} else {
			this.lebenspunkte = 100;
			System.out.println("Der Wert ist nicht erlaubt. Er wurde nun automatisch auf 100 gesetzt");
		}
	}
	// Methoden
	public void getLebenspunkte() {
		System.out.println(this.lebenspunkte);
	}
	
	public void setLebenspunkte(int schaden) {
		this.lebenspunkte -= schaden;
		System.out.println(this.lebenspunkte);
		
	}

}
