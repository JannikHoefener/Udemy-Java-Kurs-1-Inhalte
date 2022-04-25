
public class Auto {
	//Eigenschaften
	String autoMarke;
	Reifen reifen;
	
	//Konstruktor
	public Auto() {
		
	}
	public Auto (String autoMarke, String reifenMarke, String reifenTyp) {
		reifen = new Reifen (reifenMarke, reifenTyp);
		this.autoMarke = autoMarke;
	}
	
	//Methoden
	public void ausgabeDaten() {
		System.out.println(this.autoMarke);
		System.out.println(this.reifen.reifenTyp);
		
	}
}
