
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
		// super.essen(); gibt es nicht mehr das es ja kein MethodenBody gibt
	}

	@Override
	public void atmen() {
		System.out.println("Der Hund atmet �ber die Lunge");
		// TODO Auto-generated method stub
		
	}
	
	//spezifische Methoden nur f�r diese Subklasse in der wir uns befinden 
	//und alles was von ihr wieder erbt
	public void bellen() {
		
	}
	
}
