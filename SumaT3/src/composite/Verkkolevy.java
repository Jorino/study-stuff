package composite;

public class Verkkolevy implements TietokoneenOsa {
	
	private int hinta;
	
	public Verkkolevy(int hinta){
		this.hinta = hinta;
	}

	@Override
	public int osanTiedot() {
		// TODO Auto-generated method stub
		System.out.println("Verkkolevy: " + hinta);
		return hinta;
	}

	@Override
	public void lisaaOsa(TietokoneenOsa osa) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Et voi lisätä osia yksinkertaiseen osaan.");
		
	}

}
