package kivipaperisakset;

/**
 * Paranneltu versio Ira Dookin Kivi-Sakset-Paperi pelistä.
 * @author jorin
 *
 */
public class Main {

	public static void main(String[] args) {
		Pelaaja matti = new Pelaaja ("Matti");
		Pelaaja teppo = new Pelaaja ("Teppo");
		Peli peli = new Peli(matti,teppo);
		
		peli.pelaa();

	}

}
