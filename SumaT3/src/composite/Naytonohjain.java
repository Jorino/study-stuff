package composite;

public class Naytonohjain implements TietokoneenOsa{
	
	private int hinta;
	
	public Naytonohjain(int hinta){
		this.hinta = hinta;
	}

	@Override
	public int osanTiedot() {
		// TODO Auto-generated method stub
		System.out.println("Naytönohjain: " + hinta);
		return hinta;
	}

	@Override
	public void lisaaOsa(TietokoneenOsa osa) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Et voi lisätä osia yksinkertaiseen osaan.");
		
	}

}
