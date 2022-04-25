
public interface ITelefon {
	// Interfaces werden h�ufig bei der Vererbung verwendet
	// Sagen nur was zu tun ist aber nicht wie es zu tun ist
	
// Eigenschaften / Attribute => nur Konstanten
	public static final String NETZANBIETER = "Telekom";
	// public = Modifikator (�ber die Klasse hienaus sichtbar)
	// static = es muss kein Objekt erstellt werden, damit wir auf die Eigenschaft zugreifen k�nnnen
	// final = Modifier(dass sich der Wert nicht mehr �ndern kann) 
	//         in diesem Beispiel kann sich der Sting "Telekom" nicht mehr �ndern f�r die Variable Netzanbieter
	
	// Konstanten
	// NETZANBIETER ist eine Konstante, sie werden immer in Gro�buchstaben geschrieben
	// Konstanten k�nnen nicht mehr ver�ndert werden
	
// Methodensignaturen / nur Methodenk�pfe (Keine Bodys)
	public abstract void powerOn();
	public abstract boolean esKlingelt();
	public abstract boolean anrufen();

}
