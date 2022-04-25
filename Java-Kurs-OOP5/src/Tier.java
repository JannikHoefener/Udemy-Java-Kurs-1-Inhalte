// Super- / ElternKlasse
public abstract class Tier { 
	//abstract macht, dass wir aus der Kalsse Tier kein Objekt mehr erstellen können

// Eigenschaften / Attribute
	String name;
	int gewicht;
	int groeße;

// standart Konstruktor (Ohne Werte vergabe)
	// erstellen wir weil der andere Konstruktor den standart ablöst.
	//somit erstellen wir nochmal den Default Konstruktor um Ihnen "zuverwenden"
	public Tier() {
	}
	
//Konstruktoren
	public Tier(String name, int groeße, int gewicht) {
		this.name = name;
		this.gewicht = gewicht;
		this.groeße = groeße;
	}
	
// abstractee Methoden
	//Abstrake Methoden müssen aber in jeder Klasse die von dieser Klasse erbt verwendet werden
	public abstract void atmen();
	
	public abstract void essen(); 
	// Wie das Tier ist soll in den Sub Klassen selbst definiert werden
	/** Bevor wir abstract verwendet haben
	 *  public void essen () {
	 *  ...
	 *  }
	 */
	
// normale Methode
	//d.h. eine Abstracte Klasse muss nicht zwingend abstracte Methoden haben
	//wir können mit abstract jede Methode anpassen und abscrat setzten
	public String getName() {
		return name;
	}
}
