
package kivipaperisakset;

import java.util.Random;

/**
 * Luokka Pelaaja oliolle.
 * @author jorin
 */
public class Pelaaja {

    private int voitot;      // Voittojen lukumäärä
    private int randomi;	// Hyödynnetään myöhemmin pelaajan valinnassa
    private String nimi = "";	// Pelaajan nimi
    private Random rand;	// Randomilla arvotaan pelaajan valinta
    private String valinta;	// Pelaajan valinta (kivi, sakset tai paperi)

    /**
     * Konstruktori pelaajalle.
     * @param nimi pelaajan nimi
     */
	public Pelaaja (String nimi) {
    	this.nimi = nimi;
    	this.voitot = 0;
    	this.rand = new Random();
    	this.valinta = "";
    }
	
	/**
	 * Tyhjä konstruktori pelaajalle.
	 */
	public Pelaaja() {
		
	}

    /**
     * Valitse randomilla kivi, paperi tai sakset
     */
    public String pelaajanValinta() {
        randomi = rand.nextInt(3);
        switch (randomi) {
            case 0:
                this.valinta = ("kivi");
                break;
            case 1:
                this.valinta = ("paperi");
                break;
            case 2:
                this.valinta = ("sakset");
                break;                	
           default:
        	   this.valinta= ("");
        }
        return this.valinta;
    }

    /**
     * Metodi joka kasvattaa voittojen lkm. yhdellä.
     */
    public void lisaaVoitto() {
    	voitot++;
    }
    
    /**
     * Metodi jolla voittojen lkm. voidaan tarvittaessa muuttaa
     * esim. jos tarvitsee nollata voitot.
     * @param v voittojen lukumäärä
     */
    public void setVoitot(int v) {
        this.voitot = v;
    }

    /**
     * Getteri voittojen lkm.
     * @return Palauttaa voittojen lukumäärän.
     */
    public int getVoitot() {
        return (voitot);
    }
    
    /**
     * Getteri pelaajan nimelle.
     * @return Palauttaa pelaajan nimen.
     */
    public String getNimi() {
		return nimi;
	}

    /**
     * Setteri pelaajan nimelle.
     * @param nimi Pelaajan nimi.
     */
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	/**
	 * Getteri pelaajan valinnalle.
	 * @return Palauttaa pelaajan valinnan.
	 */
	public String getValinta() {
		return valinta;
	}

	/**
	 * Setteri pelaajan valinnalle.
	 * @param valinta Asettaa pelaajan valinnan.
	 */
	public void setValinta(String valinta) {
		this.valinta = valinta;
	}
	
	
}
