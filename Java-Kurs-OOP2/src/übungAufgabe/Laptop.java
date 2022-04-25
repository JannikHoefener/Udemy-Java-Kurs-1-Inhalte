package übungAufgabe;

public class Laptop {
	String marke;
	int ram;
	String cpu;
	double preis;
	
	public Laptop(String marke, int ram, String cpu, double preis) {
		super();
		this.marke = marke;
		this.ram = ram;
		this.cpu = cpu;
		this.preis = preis;
	}
	
	public void infoAusgabe () {
		System.out.println("Der Laptop startet ... weitere Angaben folgen, wenn der Laptop hochefahren ist.");
		System.out.println("Der Laptop ist einsatzbereit. \nWerte: \nMarke: " + marke + ", hat " + ram + "gb RAM und einen " + cpu + " CPU.\nDer Laptop kostet: " + preis +" €\n");
	}
	
	

}
