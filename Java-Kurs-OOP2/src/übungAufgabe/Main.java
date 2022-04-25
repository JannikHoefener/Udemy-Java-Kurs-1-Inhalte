package übungAufgabe;

public class Main {

	public static void main(String[] args) {
		
		Surface newSurface = new Surface("Windows", 16, "i7", 1500, false);
		newSurface.infoAusgabe();
		
		MacBook newMacBook = new MacBook("Apple", 8, "i5", 1900, "Safari");
		newMacBook.infoAusgabe();

	}

}
