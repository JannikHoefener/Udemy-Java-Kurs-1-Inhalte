
// Super- / ElternKlasse
public class Tier {

	//Eigenschaften / Attribute
	String name;
	int gewicht;
	int groe�e;
	
	//Konstruktoren
	public Tier(String name, int groe�e, int gewicht) {
		this.name = name;
		this.gewicht = gewicht;
		this.groe�e = groe�e;
		
		
	}
	
	//Methoden
	public void essen() {
		System.out.println("Das Tier hat gegessen");
	}
}
