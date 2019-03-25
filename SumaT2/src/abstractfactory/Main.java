package abstractfactory;

public class Main {

	public static void main(String[] args) {
		
		VaateTehdas adidas = new AdidasTehdas();
		VaateTehdas boss = new BossTehdas();
		
		Henkilo jasper = new Henkilo(adidas);
		
		System.out.println("Jasperin vaatetus opiskelijana: ");
		jasper.pukeuduJaEsittele();
		
		
		System.out.println("\nJasperin vaatetus insinöörinä: ");
		jasper.setTehdas(boss);
		jasper.pukeuduJaEsittele();

	}

}
