// Super- / ElternKlasse
public abstract class Tier { 
	//abstract macht, dass wir aus der Kalsse Tier kein Objekt mehr erstellen k�nnen

// Eigenschaften / Attribute
	String name;
	int gewicht;
	int groe�e;

// standart Konstruktor (Ohne Werte vergabe)
	// erstellen wir weil der andere Konstruktor den standart abl�st.
	//somit erstellen wir nochmal den Default Konstruktor um Ihnen "zuverwenden"
	public Tier() {
	}
	
//Konstruktoren
	public Tier(String name, int groe�e, int gewicht) {
		this.name = name;
		this.gewicht = gewicht;
		this.groe�e = groe�e;
	}
	
// abstractee Methoden
	//Abstrake Methoden m�ssen aber in jeder Klasse die von dieser Klasse erbt verwendet werden
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
	//wir k�nnen mit abstract jede Methode anpassen und abscrat setzten
	public String getName() {
		return name;
	}
}
