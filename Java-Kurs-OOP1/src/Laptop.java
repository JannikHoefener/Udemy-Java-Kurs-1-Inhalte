
public class Laptop {

	int ram;
	double preis;
	String marke;
	
	public Laptop (int ram, double preis, String marke) {
		this.ram = ram;
		this.preis = preis;
		this.marke = marke;
	}
	public void laptopWerte() {
		System.out.println("Der Laptop von der Marke " + this.marke + " hat " + this.ram + "gb RAM und kostet " + this.preis + "€.");

	}
}
