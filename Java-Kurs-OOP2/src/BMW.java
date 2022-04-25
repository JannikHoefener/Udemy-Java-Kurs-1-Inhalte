
public class BMW extends Auto {

	boolean xDrive;
	
	public BMW(int ps, int türen, String typ, boolean xDrive) {
		super("BMW", ps, türen, typ);
		this.xDrive = xDrive;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void starten() {
		// TODO Auto-generated method stub
		super.starten();
		System.out.println("Nähmlich der BMW startet");
	}
	

}
