
//Sub / Kindsklasse
public class Hund extends Tier{

	//spezifische Eigenschaften / Attribute nur für diese Subklasse in der wir uns befinden.
	int zaehne;
	
	//Konstruktoren
	public Hund(String name, int groeße, int gewicht, int zaehne) {
		super(name, groeße,gewicht);
		this.zaehne = zaehne;
	}

	@Override
	public void essen() {
		System.out.println("Der Hund muss sein essen noch kauen");
		super.essen();
	}
	
	//spezifische Methoden nur für diese Subklasse in der wir uns befinden.
		
}
