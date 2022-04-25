
public class SchleifeWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Kontrollstrukturen steuern den Programmablauf

		// while = solange ...
		/* Allgemeiner Aufbau einer while-Schleife
		 *
		 *while (Bedingung) {
		 *    "Anweisungsblock"
		 *}
		 *
		 *Merke: Bedungung kann entweder true oder false sein
		 */
		int count = 1;
		while (count != 6) { // true
			System.out.println("Ich bin " + count);
			count ++;
		}
		int counter = 1;
		while (true) {
			System.out.println("Hi");
			if (counter == 3 ) {
				break;
			}
			counter ++;
		}
		
	}

}
