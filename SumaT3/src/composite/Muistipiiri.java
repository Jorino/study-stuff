package composite;



public class Muistipiiri implements TietokoneenOsa{
	
	private int hinta;
	
	public Muistipiiri(int hinta){
		this.hinta = hinta;
	}

	@Override
	public int osanTiedot() {
		// TODO Auto-generated method stub
		System.out.println("Muistipiiri: " + hinta);
		return hinta;
	}

	@Override
	public void lisaaOsa(TietokoneenOsa osa) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Et voi lisätä osia yksinkertaiseen osaan.");
		
	}

}
