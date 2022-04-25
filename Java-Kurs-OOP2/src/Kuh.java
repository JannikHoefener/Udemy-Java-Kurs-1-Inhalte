//Sub / Kindsklasse
public class Kuh extends Tier {
	
	//Eigenschaften / Attribute nur für diese Subklasse in der wir uns befinden.
	int kufe;
	
	//Konstruktoren 
	public Kuh(String name, int groeße, int gewicht, int kufe) { 
		super(name,groeße,gewicht);
		this.kufe = kufe;
	}
	
	//Methoden vererbt von von der Super Klasse 
	@Override
	public void essen() {
		super.essen();
		System.out.println("Die Kuh muss das essen immer wiederkäuen");
	}
	
	//Methoden nur für diese Subklasse in der wir uns befinden.

		
}
