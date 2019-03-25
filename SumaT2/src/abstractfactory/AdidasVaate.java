package abstractfactory;

public class AdidasVaate extends Vaate {
	
	public AdidasVaate(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	
	@Override
	public String toString() {
		
		return "Adidas "+ tyyppi;
	}

}
