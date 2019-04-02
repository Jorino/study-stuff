package decorator;

public class Opiskelija {
	private String nimi;
	private int ika;
	
	public Opiskelija(String nimi, int ika) {
		this.nimi = nimi;
		this.ika = ika;
	}

	public String getNimi() {
		return nimi;
	}

	public int getIka() {
		return ika;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public void setIka(int ika) {
		this.ika = ika;
	}
	

}
