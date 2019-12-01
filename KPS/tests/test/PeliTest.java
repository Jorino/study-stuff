package test;

import static org.junit.Assert.*;

import org.junit.Test;

import kivipaperisakset.*;

/**
 * Luokka Pelin testaamiselle.
 * @author jorin
 *
 */
public class PeliTest {
	
	Pelaaja p1 = new Pelaaja("Matti");
	Pelaaja p2 = new Pelaaja("Teppo");
	Peli kps = new Peli(p1,p2);
	

	@Test
	public void testTasapeli() {
		kps.pelilogiikka("kivi", "kivi");
		assertEquals("Tasapelien määrä ei ole oikein.",kps.getTasapelit(),1);
	}
	
	@Test
	public void testVoitto() {
		kps.pelilogiikka("kivi", "sakset");
		assertEquals("Pelilogiikka ei toimi oikein!", p1.getVoitot(), 1);
	}
	
	@Test
	public void testPeliLoppuu() {
		assertEquals("Peli loppuu liian aikaisin.",kps.peliloppuu(),false);
		p1.setVoitot(3);
		assertEquals("Peli ei pääty vaikka sen pitäisi.",kps.peliloppuu(),true);
	}

}
