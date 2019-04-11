package memento;

import memento.Arvuuttaja.Memento;

public class Arvaaja {
	
	private int arvaus;
	private Memento arvottu;
	private String nimi;
	
	

	public Arvaaja(String nimi) {
		this.nimi = nimi;
	}
	
	public Arvaaja(int arvaus) {
		this.arvaus = arvaus;
	}
	
	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public Memento getArvottu() {
		return arvottu;
	}

	public void setArvottu(Memento arvottu) {
		this.arvottu = arvottu;
	}

	public int getArvaus() {
		return arvaus;
	}

	public void setArvaus(int arvaus) {
		this.arvaus = arvaus;
	}
	
	
}
