package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements TietokoneenOsa{
	
	private int hinta;
	private List<TietokoneenOsa> osat = new ArrayList<>();

	public Emolevy(int hinta){
		this.hinta = hinta;
	}
	@Override
	public int osanTiedot() {
		// TODO Auto-generated method stub
		System.out.println("Emolevy: " + hinta);
		for(TietokoneenOsa o : osat) {
			hinta += o.osanTiedot();
		}
		System.out.println("\nEmolevyn hinta osineen: " + hinta);
		return hinta;
	}

	@Override
	public void lisaaOsa(TietokoneenOsa osa) {
		// TODO Auto-generated method stub
		osat.add(osa);
		}
	

}
