package composite;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TietokoneenOsa piiri = new Muistipiiri(15);
		TietokoneenOsa ohjain = new Naytonohjain(15);
		TietokoneenOsa levy = new Verkkolevy(15);
		TietokoneenOsa prosessori = new Prosessori(15);
		
		TietokoneenOsa emo = new Emolevy(15);
		emo.lisaaOsa(prosessori);
		emo.lisaaOsa(piiri);
		emo.lisaaOsa(ohjain);
		emo.lisaaOsa(levy);
		
		TietokoneenOsa kotelo = new Kotelo(15);
		kotelo.lisaaOsa(emo);
		
		System.out.println("\n\nKokonaishinta: " + kotelo.osanTiedot());
		
		

	}

}
