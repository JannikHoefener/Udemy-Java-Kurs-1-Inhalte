
public class BeispielMethoden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int gegnerLeben = 100;
		System.out.println("Der Boss hat: " + gegnerLeben + " Lebenspunkte");
		
		gegnerLeben = gegnerHit(gegnerLeben);
		System.out.println("Gegner getroffen, Boss hat noch: " + gegnerLeben + " Lebenspunkte");
	}
	public static int gegnerHit(int aktuellLeben) {
		 int neuGegnerLeben; //lokal
		 
		 neuGegnerLeben = aktuellLeben - 20;
		 
		 return neuGegnerLeben;
	}

}
