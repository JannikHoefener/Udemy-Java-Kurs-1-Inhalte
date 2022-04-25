
public class SchleifeFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kontrollstrukturen steuern den Programmablauf

		// for = sei ...
		/* Allgemeiner Aufbau einer for-Schleife
		 *
		 *for (Anfangswert; Abbruchbedinung; Zähler) {
		 *
		 *}
		 */
		
		for (int i = 0; i < 10; i++) { 
			// im Abbruchbedungsblock wird geprüft ob i < 10 ist, 
			// wenn true, dann wird weitrer ausgeführt 
			// => also i ++ (+1), i ist dann 1.
			// Schleife solange bis i = 10.
			System.out.println(i);
		}
		for (int j = 1; j <= 10; j++) {
			if (j == 5) {
				System.out.println("Hey du hast mich Gefunden " + j);
			}
			if (j == 10) {
				System.out.println("Hey du hast mich Gefunden " + j);
			}
		}
			
	}

}
