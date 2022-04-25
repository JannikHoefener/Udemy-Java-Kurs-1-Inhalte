
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Teil 1
//		Held player1 = new Held (101);
//		// System.out.println(player1.lebenspunkte); //nicht möglich, da es in der Klasse Held private ist
//		player1.getLebenspunkte();
//		
//		int schaden = 10;
//		player1.setLebenspunkte(schaden);

//Teil 2
		GoogleKonto peter = new GoogleKonto("Peter Müller", "1234");
		//Passwort Änderung
		peter.setPasswort("1234");
		System.out.println(peter.getPasswort());

	}

}
