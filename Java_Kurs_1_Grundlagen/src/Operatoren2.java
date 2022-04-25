
public class Operatoren2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Vergleichs Operatoren (Häufig bei If und Else)
		

		int a = 3;
		int b = 3;
		boolean c;
		
		c = a == b; // Ist a gleich b ? Ausgabe 1.=true 2.=false
		System.out.println(c);
		
		c = a < b; // Ist a kleiner b ? Ausgabe 1.=true 2.=false
		System.out.println(c);

//----------------------------------------
		
		int lebenGegner = 0;
		boolean hit = true;
		
		if (lebenGegner == 0 && hit == true) { //true oder false
			System.out.println("Gegener zerstört!");
		} else { 
				System.out.println("Gegner hat noch: " + lebenGegner + " Leben!");
		}
	}

}
