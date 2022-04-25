import sun.nio.cs.ext.MSISO2022JP;

public class Methoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//<Modifikator Rückgabentyp Methodenname ( Datentyp Parameter 1, Datentyp Parameter 2) >
// Ein Modifikator gibt den Sichtbereich der Methode an, es gibt public, private und protected
		
		ausgabe();
	}
	
	public static void ausgabe  () {
		System.out.println("Ich bin eine Methode");
	}
	
	public static void summe() {
		int a, b, summe;
		a = 5;
		b = 5;
		
		summe = a + b;
		System.out.println(summe);
	}

}
