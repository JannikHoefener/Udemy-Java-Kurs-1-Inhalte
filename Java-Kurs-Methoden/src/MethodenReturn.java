
public class MethodenReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int summe = taschenRechner(5, 5, '+');
		System.out.println(summe);
	}
	public static int taschenRechner(int zahl1, int zahl2, char operator) { 
		// statt void steht dort int, da wir später einen int ausgegeben haben wollen
		int summe;
		
		if (operator == '+') {
			summe = zahl1 + zahl2;
		}
		else {
			summe = zahl1 - zahl2;
		}
		return summe;
	}

}
