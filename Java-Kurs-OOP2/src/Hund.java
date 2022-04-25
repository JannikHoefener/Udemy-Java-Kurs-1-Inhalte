
//Sub / Kindsklasse
public class Hund extends Tier{

	//spezifische Eigenschaften / Attribute nur f�r diese Subklasse in der wir uns befinden.
	int zaehne;
	
	//Konstruktoren
	public Hund(String name, int groe�e, int gewicht, int zaehne) {
		super(name, groe�e,gewicht);
		this.zaehne = zaehne;
	}

	@Override
	public void essen() {
		System.out.println("Der Hund muss sein essen noch kauen");
		super.essen();
	}
	
	//spezifische Methoden nur f�r diese Subklasse in der wir uns befinden.
		
}
