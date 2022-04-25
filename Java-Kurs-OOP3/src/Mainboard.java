
public class Mainboard {
	// Mainboard ist eine Komplexe Klasse, 
	// Denn wir wollen auch das Mainboard detalierter Beschreiben.
	// Denn ein Mainboard ist auch ein Objekt mit spezifischen Eigenschaften.
	
	// Eigenschaften / Attribute
	int ramSlots;
	int kartenSlots;
	int usbPorts;
	
	// Standart-Konstruktor um erstes Mainboard (board2) erstellen zu können welches
	// keine Werte zuweisung hat.
	public Mainboard() { 	
	}

	// Konstruktor
	public Mainboard (int ramSlots, int kartenSlots, int usbPorts) {
		this.ramSlots = ramSlots;
		this.kartenSlots = kartenSlots;
		this.usbPorts = usbPorts;
	}
	
	// Methoden
}
