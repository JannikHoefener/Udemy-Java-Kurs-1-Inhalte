import java.util.Scanner;

public class BeispielArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array Deklaration	
		//Datenytp [] Name = new Datenytp[Anzahl]
		
		//Merke: Index beginnt bei 0 und Endet bei angegebener Größe -1
		
		System.out.println("Geben Sie Ihre 6 Lottozahlen ein: ");
		
		int [] lottoZahlen = new int [6]; //Index = 0 bis 5
		
		for(int i = 0; i < lottoZahlen.length; i++) {
			
			Scanner scanUserLottoZahlen = new Scanner (System.in);
			int zahlenUser = scanUserLottoZahlen.nextInt();
			
			lottoZahlen [i] = zahlenUser;
		}
		for (int i = 0; i < lottoZahlen.length; i++)
		System.out.println(lottoZahlen[i]);
	}

}
