package de.anonyme.klassen;

public class Main {

	public static void main(String[] args) {

		// Eine anonyme Klasse "leiht" sich den Namen einer Klasse oder eines Interfaces.
			
// Bisher
		Person p1 = new Person("Ralf");

// Anonyme Klasse

		// => Leiht sich die anonyme Klasse den Namen einer Klasse, so ist sie eine
		//    Ableitung der Klasse, deren Namen sie übernimmt.

		new Person("Olaf") {
			public void printName() {
				System.out.println("Der Name: " + this.getName());
			}
		};
		
		
//Bisher
		Hund hund1 = new Hund();
		hund1.machLaute();
		
		Katze katze1 = new Katze();
		katze1.machLaute();
		
// Anonoyme Klasse
		
		// => Leiht sich die anonyme Klasse den Namen eines Interfaces, 
		//    so ist sie eine Ableitung der Klasse Object 
		//    und muss die Methoden des Interfaces implementieren
		
		Tier elefant = new Tier() {
			public String machLaute() {
				return "törö";
			}
		};
		
		Tier schwein = new Tier() {
			public String machLaute() {
				return "oink oink";
			}
			
		};

	}
}
