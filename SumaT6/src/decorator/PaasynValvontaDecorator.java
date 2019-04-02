package decorator;

public class PaasynValvontaDecorator extends MenuDecorator {
	private String sala = "admin";
	private String kayttis = "admin";
	private String data1, data2;
	
	public PaasynValvontaDecorator(MenuIF menu) {
		super(menu);
	}
	
	@Override
	public void printMenu() {
		
		if(kirjaudu()) {
			super.printMenu();
		}
		
	}
	
	private boolean kirjaudu() {
		System.out.println("Anna käyttäjätunnus: ");
		data1 = new String(Lue.rivi());
		
		System.out.println("Anna salasana: ");
		data2 = new String(Lue.rivi());
		
		if(data1.equals(kayttis) && data2.equals(sala)) {
			System.out.println("Käyttäjätunnus ja salasana oikein!!");
			return true;
		}
		else {
			return false;
		}
		
	}

}
