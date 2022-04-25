package übungAufgabe;

public class MacBook extends Laptop {

	//Variablen auf das MacBook bezogen
	String internetbrowser;
	
	public MacBook(String marke, int ram, String cpu, double preis, String internetbrowser) {
		super(marke, ram, cpu, preis);
		this.internetbrowser = internetbrowser;
		// TODO Auto-generated constructor stub
	}
	public void infoAusgabe() {
		super.infoAusgabe();
	}

}
