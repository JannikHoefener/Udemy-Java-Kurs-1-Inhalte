import java.util.Scanner;

public class GoogleKonto {
	// Atribute
	private String benutzerName;
	private String passwort;

	// Konstruktor
	public GoogleKonto(String benutzerName, String passwort) {
		this.benutzerName = benutzerName;
		this.passwort = passwort;
	}
	// Methoden
	public String getPasswort() {
		return passwort;
	}

	public void setPasswort(String passwort) {

		if (passwort.equals(this.passwort)) { // .equals() vergleiche mit dem was in der Klammer steht
			System.out.println("Passwort stimmt kann geändert werden");
			System.out.println("Bitte ein neues Passwort eingeben...");
			Scanner scan = new Scanner(System.in);
			String newPW = scan.nextLine();
			this.passwort = newPW;
			System.out.println("Das neue Passwort lautet: " + this.passwort);
		} else {
			System.out.println("Passwort falsch, kann nicht geändert werden");
		}

	}

	public String getBenutzerName() {
		return benutzerName;
	}

	public void setBenutzerName(String benutzerName) {
		this.benutzerName = benutzerName;
	}
}
