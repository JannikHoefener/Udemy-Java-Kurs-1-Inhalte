//Sub / Kindsklasse
public class Kuh extends Tier {
	
	//Eigenschaften / Attribute nur f�r diese Subklasse in der wir uns befinden.
	int kufe;
	
	//Konstruktoren 
	public Kuh(String name, int groe�e, int gewicht, int kufe) { 
		super(name,groe�e,gewicht);
		this.kufe = kufe;
	}
	
	//Methoden vererbt von von der Super Klasse 
	@Override
	public void essen() {
		super.essen();
		System.out.println("Die Kuh muss das essen immer wiederk�uen");
	}
	
	//Methoden nur f�r diese Subklasse in der wir uns befinden.

		
}
