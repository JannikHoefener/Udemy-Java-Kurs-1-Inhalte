
public interface ITelefon {
	// Interfaces werden häufig bei der Vererbung verwendet
	// Sagen nur was zu tun ist aber nicht wie es zu tun ist
	
// Eigenschaften / Attribute => nur Konstanten
	public static final String NETZANBIETER = "Telekom";
	// public = Modifikator (Über die Klasse hienaus sichtbar)
	// static = es muss kein Objekt erstellt werden, damit wir auf die Eigenschaft zugreifen könnnen
	// final = Modifier(dass sich der Wert nicht mehr ändern kann) 
	//         in diesem Beispiel kann sich der Sting "Telekom" nicht mehr ändern für die Variable Netzanbieter
	
	// Konstanten
	// NETZANBIETER ist eine Konstante, sie werden immer in Großbuchstaben geschrieben
	// Konstanten können nicht mehr verändert werden
	
// Methodensignaturen / nur Methodenköpfe (Keine Bodys)
	public abstract void powerOn();
	public abstract boolean esKlingelt();
	public abstract boolean anrufen();

}
