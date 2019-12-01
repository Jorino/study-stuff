package test;

import static org.junit.Assert.*;
import kivipaperisakset.*;

import org.junit.Test;

/**
 * Luokka Pelaajan testaamiselle.
 * @author jorin
 *
 */
public class pelaajaTest {
	
	Pelaaja p1 = new Pelaaja("Kalle");
	Pelaaja p2 = new Pelaaja();

	@Test
	public void nimiTest() {
		assertEquals("Nimi väärin",p1.getNimi(),"Kalle");
	}
	
	@Test
	public void setNimi() {
		p2.setNimi("Niko");
		assertEquals("Nimen vaihtaminen ei toimi","Niko", p2.getNimi());
	}
	
	@Test
	public void testaaVoitot() {
		assertEquals("Voitot väärin", p1.getVoitot(), 0);
		p1.lisaaVoitto();
		assertEquals("Voittojen lisäys ei toimi", p1.getVoitot(),1);
		
	}
	
	@Test
	public void testaaValinta() {
		p1.setValinta("kivi");
		assertEquals("Valinnan asettaminen ei toiminut.", p1.getValinta(), "kivi");
	}

}
