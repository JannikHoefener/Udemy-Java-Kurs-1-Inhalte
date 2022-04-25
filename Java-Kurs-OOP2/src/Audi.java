
public class Audi extends Auto {

	boolean quattro;
	
	public Audi(int ps, int türen, String typ, boolean quattro) {
		super("Audi", ps, türen, typ);
		this.quattro = quattro;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void starten() {
		// TODO Auto-generated method stub
		super.starten();
	}

}
