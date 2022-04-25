
public class WasIstEinArray {
	
	public static void main(String[] args) {
	
	//Variablen Deklaration
	//Datentyp Name = Wert;
	int zahl1 = 50;
	double zahl2 = 34.34;
		
	//Array Deklaration
	//Datenytp [] Name = new Datenytp[Anzahl]
	int [] zahlenArray = new int [7]; //Ist eine Datenstruktur, dioe uns ermöglicht 7 Werte von typ Int zu speichern
	zahlenArray[3] = 50;
	zahlenArray[5] = 500;
	zahlenArray[0] = 40;
	
	double [] zahlenArray2 = new double [9]; // nur ein neuer Array erstellt, mit dem Typ double mit 9 Speicher-Möglichkeiten
	zahlenArray2 [1] = 34.23;
	zahlenArray2 [4] = 50.45;
	
	//String [] namenArray = {"Wert1", "Wert2", "Wert3"};
	
	String [] personA = {"Peter", "Müller", "35"};
	System.out.println("Name: "+ personA [0]);
	System.out.println("Nachname: "+ personA [1]);
	System.out.println("Alter: "+ personA [2]);
	
	
	
	}
	
}
