
public class Computer {
	
	// Eigenschaften / Attribute
	String cpu; //referenz Variable (ohne wertzuordnung, bei Abfrage = Ausgabe: null)
	Mainboard mainboard;
	int preis;

	
	// Konstruktor
	public Computer (String cpu, Mainboard mainboard, int preis) {
		this.cpu = cpu;
		this.mainboard = mainboard;
		this.preis = preis; 
	}
	
	//Konstruktor 
	public Computer (int ramSlots,int kartenSlots, int usbPorts, String cpu) {
		mainboard = new Mainboard(ramSlots, kartenSlots, usbPorts);
		this.cpu = cpu;
	}
	// Methoden

}
