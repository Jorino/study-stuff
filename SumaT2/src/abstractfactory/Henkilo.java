package abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class Henkilo {
	
	private List<Vaate> vaatteet;
	private VaateTehdas tehdas;
	
	public Henkilo(VaateTehdas tehdas) {
		this.tehdas = tehdas;
	}
	
	public void puePaalle() {
		vaatteet = new ArrayList<>();
		vaatteet.add(tehdas.makeVaate("lippis"));
		vaatteet.add(tehdas.makeVaate("t-paita"));
		vaatteet.add(tehdas.makeVaate("farmarit"));
		vaatteet.add(tehdas.makeVaate("kengät"));
	}
	
	public void setTehdas(VaateTehdas tehdas) {
		this.tehdas = tehdas;
	}
	
	
	public void paallaOn() {
		vaatteet.forEach(System.out::println);
	}
	
	public void pukeuduJaEsittele() {
		puePaalle();
		paallaOn();
	}

}
