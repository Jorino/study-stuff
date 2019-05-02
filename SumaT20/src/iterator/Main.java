package iterator;

import java.util.ArrayList;

public class Main {
	
	
	/* a) Tutki kuinka Javan iteraattori käyttäytyy,
	 * jos yritetään iteroida kokoelmaa kahdella säikeellä yhtä aikaa, 
	 * kun molemmilla on oma iterattori.
	 * 
	 * Osa listan jäsenistä jää jommaltakummalta iteraattoreista välistä
	 * lisäksi muutaman kerran kävi niin että edellistä pienempi arvo tulostettiin
	 * suuremman jälkeen vaikka niiden pitäisi tulostua suuruusjärjestyksessä.
	 * 
	 * b) Entä, jos säikeet käyttävät samaa iteraattoria vuorotellen?
	 * 
	 * Tässä tilanteessa säikeiden tulisi vuorotella iteraattorin käytössä,
	 * suurimmilta osin toimii hyvin mutta moni arvoista tulostuu kahteebn kertaan,
	 * iteraattori on siis alkanut tekemään kutsua threadilta liian aikaisin.
	 * 
	 * c) Kuinka käy, jos kokoelmaan tehdään muutoksia 
	 * iteroinnin läpikäynnin aikana. 
	 * 
	 * Tämä ei ole hyvä sillä se johtaa virheeseen/poikkeustilanteeseen.
	 * Exception in thread "Thread-0" java.util.ConcurrentModificationException
	 * 
	 * d) Keksi jotain muuta testattavaa.
	 * 
	 * Iteraattori 1 odottaa 600 millisekuntia, iteraattori 2 odottaa siitä 1/3 eli 200 millisekuntia.
	 * Arvot tulivat siististi ja jokainen vain yhden kerran, iteraattori 2 tietysti kerkesi hoitamaan suurimman osan listasta.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		int listsize = 20;

		for(int i = 0 ; i <= listsize ; i++) {
			list.add(i);
			if(i == listsize) {
				sb.append(" and " + i);
			} else {
				sb.append(i + ", ");
			}
			
		}
		
		System.out.println(sb.toString() + " added to list.\n");
		
		ListanLapiKayja lk = new ListanLapiKayja(list);
		
		lk.aloita();
		//lk.aloita2();
		lk.aloita3();
		
		
	}
	
	

}
