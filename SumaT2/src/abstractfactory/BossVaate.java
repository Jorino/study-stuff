package abstractfactory;

public class BossVaate extends Vaate{

	public BossVaate(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	
	@Override
	public String toString() {
		
		return "Boss "+ tyyppi;
	}

}
