package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements TietokoneenOsa{
	private int hinta;
	private List<TietokoneenOsa> osat = new ArrayList<>();

	public Kotelo(int hinta){
		this.hinta = hinta;
	}
	
	@Override
	public int osanTiedot() {
		// TODO Auto-generated method stub
		System.out.println("Kotelo: " + hinta);
		for(TietokoneenOsa o : osat) {
			hinta += o.osanTiedot();
		}
		System.out.println("\nKotelon hinta osineen: " + hinta);
		return hinta;
	}

	@Override
	public void lisaaOsa(TietokoneenOsa osa) {
		// TODO Auto-generated method stub
		osat.add(osa);
		}
	

}
