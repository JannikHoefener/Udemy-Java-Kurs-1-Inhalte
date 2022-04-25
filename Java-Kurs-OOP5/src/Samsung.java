
public abstract class Samsung {
//Eigenschafen
	private double preis; 		// weil private wird getter und Setter benötigt
	private String produktTyp;  // weil private wird getter und Setter benötigt
	
//Konstruktoren 
	public Samsung() {
	}
	public Samsung(double preis, String produktTyp) {
		super();
		this.setPreis(preis);
		this.setProduktTyp(produktTyp);
	}	
	
//Methoden und Methodensignaturen 
	
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getProduktTyp() {
		return produktTyp;
	}
	public void setProduktTyp(String produktTyp) {
		this.produktTyp = produktTyp;
	}
	


}
