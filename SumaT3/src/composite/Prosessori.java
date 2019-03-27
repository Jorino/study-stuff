package composite;

public class Prosessori implements TietokoneenOsa {
	
	private int hinta;
	
	public Prosessori(int hinta){
		this.hinta = hinta;
	}

	@Override
	public int osanTiedot() {
		// TODO Auto-generated method stub
		System.out.println("Prosessori: " + hinta);
		return hinta;
	}

	@Override
	public void lisaaOsa(TietokoneenOsa osa) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Et voi lisätä osia yksinkertaiseen osaan.");
		
	}

}
