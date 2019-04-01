package singleton;

public class PunainenVaate {
	private String tyyppi;
	
	public PunainenVaate(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	
	@Override
	public String toString() {
		return "Punaiset " + tyyppi;
	}
}
