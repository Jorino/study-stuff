package decorator;

import java.util.ArrayList;

public class Opiskelijat {
	private ArrayList<Opiskelija> opiskelijat = new ArrayList<>();
	
	
	public void addOpiskelija(Opiskelija o) {
		opiskelijat.add(o);
	}
	
	public void removeOpiskelija(int i) {
		opiskelijat.remove(i);
	}
	
	public void printOpiskelijat() {
		System.out.println("Opiskelijat: ");
		for(Opiskelija o : opiskelijat) {
			System.out.println("Nimi: " + o.getNimi() + ", Ikä: " + o.getIka());
		}
	}

}
