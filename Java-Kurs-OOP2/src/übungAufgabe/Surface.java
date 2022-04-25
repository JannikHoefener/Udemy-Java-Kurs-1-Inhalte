package übungAufgabe;

public class Surface extends Laptop {
	boolean stiftDabei;

	
	public Surface(String marke, int ram, String cpu, double preis, boolean stiftdabei) {
		super(marke, ram, cpu, preis);
		this.stiftDabei = stiftdabei;
		// TODO Auto-generated constructor stub
	}
	public void infoAusgabe() {
		super.infoAusgabe();
	}

}
