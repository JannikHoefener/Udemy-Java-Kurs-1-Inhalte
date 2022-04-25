
public class MainClass {

	public static void main(String[] args) {
		// Hier entsteht das Projekt

	//  Datentyp variablenNamen = new Konstruktor();
		Hund bello = new Hund(4, "Bello", "Terrier");
		bello.bellen();
		
		Hund clara = new Hund(5, "Clara", "Hovart");
		clara.bellen();
		
		Laptop samsungLaptop = new Laptop(8, 600.99, "Samsung");
		samsungLaptop.laptopWerte();
		
		Laptop medionLaptop = new Laptop(4, 400, "Medion");
		medionLaptop.laptopWerte();
		
		Auto bmw = new Auto();
		bmw.bremsen();
		
		Auto.ausgabe();
	}
}
