
public class Hund {

	// Eigenschaften / Attribute
	int alter;
	String name;
	String rasse;
	
	// Konstruktoren (Um die Eigenschaften mit Werten zu befüllen
	// public Hund() {} <= Standart Konstruktor
	
	public Hund (int alter, String name, String rasse) {
		this.alter = alter;
		this.name = name;
		this.rasse = rasse;
	}
	
	// Methoden
	public void bellen() {
		System.out.println("der Hund " + this.name + " bellt!");
	}
}
