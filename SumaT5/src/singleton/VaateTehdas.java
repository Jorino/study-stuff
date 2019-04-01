package singleton;

public class VaateTehdas {
	
	private static VaateTehdas INSTANCE = null;
	
	private VaateTehdas() {
		
	}
	
	public static synchronized VaateTehdas getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new VaateTehdas();
		}
		return INSTANCE;
	}
	
	public PunainenVaate makeVaatteet(String tyyppi) {
		return new PunainenVaate(tyyppi);
	}

}
