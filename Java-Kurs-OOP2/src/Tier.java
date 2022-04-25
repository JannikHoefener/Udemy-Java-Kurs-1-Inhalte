
// Super- / ElternKlasse
public class Tier {

	//Eigenschaften / Attribute
	String name;
	int gewicht;
	int groeﬂe;
	
	//Konstruktoren
	public Tier(String name, int groeﬂe, int gewicht) {
		this.name = name;
		this.gewicht = gewicht;
		this.groeﬂe = groeﬂe;
		
		
	}
	
	//Methoden
	public void essen() {
		System.out.println("Das Tier hat gegessen");
	}
}
