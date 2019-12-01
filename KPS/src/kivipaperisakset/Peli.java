package kivipaperisakset;

/**
 * Luokka Peli oliolle.
 * @author jorin
 */
public class Peli {
	private Pelaaja p1;	//Pelaaja 1
    private Pelaaja p2;	//Pelaaja 2
    
    private int pelatutKierrokset; //Erien lukumäärä
    private int tasapelit = 0;	//Tasapelien lukumäärä

	/**
	 * Pelin konstruktori.
	 * @param p1 Pelaaja nro 1
	 * @param p2 Pelaaja nro 2 
	 */
	public Peli (Pelaaja p1, Pelaaja p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.pelatutKierrokset = 0;
	}
	
	/**
	 * Pelin tilanne.
	 * Tulostaa erien, tasapelien ja voittojen lukumäärän.
	 */
	private void pelitilanne() {
		 System.out.println("Erä: "
                 + pelatutKierrokset + " =====================\n");
		 System.out.println("Tasapelien lukumäärä: "
                 + tasapelit + "\n");
		 System.out.println("Pelaajalle " + p1.getNimi() + " on kertynyt " + p1.getVoitot() + " voittoa.\n");
		 System.out.println("Pelaajalle " + p2.getNimi() + " on kertynyt " + p2.getVoitot() + " voittoa.\n");
		
	}
	
	/**
	 * Aloittaa pelin pelaajien p1 ja p2 välillä.
	 */
	public void pelaa() {
		do {
			pelilogiikka(p1.pelaajanValinta(), p2.pelaajanValinta());
			
			pelitilanne();
			
			System.out.println("Pelaajan " + p1.getNimi() +" valinta: "+ p1.getValinta() + "\n");
			System.out.println("Pelaajan " + p2.getNimi() +" valinta: "+ p2.getValinta() + "\n");
			
			
		} while (!peliloppuu());
	}
	
	/**
	 * Määrittää erän voittajan vertailemalla pelaajien tekemiä valintoja.
	 */
	public void pelilogiikka(String p1Valinta, String p2Valinta) {
		if (p1Valinta.equals(p2Valinta)) {
			tasapelit++;
		}
		else if (p1Valinta.equals("kivi") && p2Valinta.equals("sakset")) {
			p1.lisaaVoitto();
		}
		else if (p1Valinta.equals("sakset") && p2Valinta.equals("paperi")) {
			p1.lisaaVoitto();
		}
		else if (p1Valinta.equals("paperi") && p2Valinta.equals("kivi")) {
			p1.lisaaVoitto();
		}
		else {
			p2.lisaaVoitto();
		}
		pelatutKierrokset++;
	}
	
	/**
	 * Tarkistaa onko toisella pelaajista tarpeeksi voittoja pelin päättymiseksi.
	 * @return Palauttaa true tai false riippuen siitä, tuleeko peli lopettaa vai ei.
	 */
	public boolean peliloppuu() {
		if (p1.getVoitot() == 3 || p2.getVoitot() == 3) {
			System.out.println("***KOLME VOITTOA - PELI PÄÄTTYY***");
			if (p1.getVoitot() == 3) {
				System.out.println("***PELAAJA " + p1.getNimi() + " VOITTI!***\n***ONNEA " + p1.getNimi() + "!***\n");
			}
			else {
				System.out.println("***PELAAJA " + p2.getNimi() + " VOITTI!***\n***ONNEA " + p2.getNimi() + "!***\n");
			}
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Getteri tasapeleille.
	 * @return Palauttaa tasapelien lkm.
	 */
	public int getTasapelit() {
		return tasapelit;
	}

	/**
	 * Setteri tasapeleille.
	 * @param tasapelit parametri määrittää tasapelien määrän.
	 */
	public void setTasapelit(int tasapelit) {
		this.tasapelit = tasapelit;
	}
	
	
}
    

