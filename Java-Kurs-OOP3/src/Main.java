
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer cp1 = new Computer();
//		System.out.println(cp1.mainboard);
//		
//		Mainboard board1 = new Mainboard();
//		System.out.println(board1);
//		
//		cp1.mainboard = board1;
//		System.out.println(cp1.mainboard);
		
		Mainboard board2 = new Mainboard();
		Computer cp2 = new Computer("Interl", board2, 500);
		
		Mainboard mainboardAsus = new Mainboard(4, 2, 4);
		Mainboard mainboardAsrock = new Mainboard(2, 1, 2);
		
		Computer computerPeter = new Computer("Intel", mainboardAsus, 400);
		System.out.println(computerPeter.mainboard.ramSlots);
		// wir wollen vom Computer computerPeter 
		// aus seinem zugewisenen Mainboard wissen 
		// wie viel ramSlots das Mainboard hat
		
		Computer computerOlga = new Computer(2, 1, 2, "AMD");
		System.out.println(computerOlga.mainboard.ramSlots);
		
		Auto bmw = new Auto("BMW", "Goodyear", "Winterreifen");
		bmw.ausgabeDaten();
		Auto vw = new Auto("VW", "michielin", "Sommerreifen");
		vw.ausgabeDaten();
	}

}
