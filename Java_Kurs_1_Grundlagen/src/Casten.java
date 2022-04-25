
public class Casten {


	public static void main(String[] args) {
		/* Was ist eine Typumwandlung (auch: Casten)
		 * 
		 * Das ist eine Umwandlung von einen Datentyp in einen Anderen
		 */
		
		//Expleziete Casten
		int userAlter = (int)18.5; // (int) = castoperator 
		System.out.println(userAlter); //Out: 18 (informationsverlust)
		
		// Impleziertes Casten (von klein nach groß) keine Datenverluste (größeren Werte Bereich)
		// Umwandlung findet bei Zuweisung statt
		int zahl1 = 30;
		double zahl2 = zahl1;
		System.out.println(zahl2);
		
		// Explizites Casten (von groß zu klein) Datenverluste
		// Umwandlung findet mit dem Cast (Datentyp-)operator statt
		
		// 1. Auto = 3450,45 € 2. Auto = 2690,94€ 
		int auto1 = (int)3450.45;
		int auto2 = (int)2690.94;
		
		int gesPreis = auto1 + auto2;
		System.out.println(gesPreis);
	}

}
