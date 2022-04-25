
public class Operatoren1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int varZahl = 5;
		
		int zahl1 = 10;
		int zahl2 = 5;
		int ergebnis;
		
		ergebnis = zahl1 + zahl2; //15
		System.out.println(ergebnis);
		
		ergebnis = zahl1 - zahl2; //5
		System.out.println(ergebnis);
		
		ergebnis = zahl1 * zahl2; //50
		System.out.println(ergebnis);
		
		ergebnis = zahl1 / zahl2; //2
		System.out.println(ergebnis);
		
//----------------------------------------------------
		varZahl++;
		System.out.println(varZahl); //6 (+1)
		varZahl++;
		System.out.println(varZahl); //7
		
		varZahl--;
		System.out.println(varZahl); //6 (-1)
		varZahl--;
		System.out.println(varZahl); //5

//----------------------------------------------------
		int lebenGegner = 100;
		int geschossEnergie = 20;
		
		//langsame version 
		lebenGegner = lebenGegner - geschossEnergie;
		System.out.println(lebenGegner);
		
		//schnelle version mit Zuweisung Operator
		lebenGegner -= geschossEnergie;
		System.out.println("Leben des Gegeners: " + lebenGegner);

//----------------------------------------------------
		
	}

}
