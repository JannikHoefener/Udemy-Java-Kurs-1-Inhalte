
public class BMW extends Auto {

	boolean xDrive;
	
	public BMW(int ps, int t�ren, String typ, boolean xDrive) {
		super("BMW", ps, t�ren, typ);
		this.xDrive = xDrive;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void starten() {
		// TODO Auto-generated method stub
		super.starten();
		System.out.println("N�hmlich der BMW startet");
	}
	

}
