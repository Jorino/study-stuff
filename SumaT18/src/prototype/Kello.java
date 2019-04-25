package prototype;

public class Kello implements Cloneable {
	
	private Viisari sekuntit;
	private Viisari minuutit;
	private Viisari tunnit;
	private String nimi;
	
	public Kello(String nimi) {
		this.nimi = nimi;
		this.sekuntit = new Viisari(59);
		this.minuutit = new Viisari(59);
		this.tunnit = new Viisari(23);
	}
	
	public void kaynnistaKello() {
		new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				tikita();
			}
		}).start();
	}
	
	private void tikita() {
		naytaAika();
		
		this.sekuntit.etene();
		if(this.sekuntit.getArvo() == 0) {
			this.minuutit.etene();
			if(this.minuutit.getArvo() == 0) {
				this.tunnit.etene();
			}
		}	
	}
	
	public void naytaAika() {
		System.out.println(nimi + "\t\t" + this.tunnit.toString() + ":" + this.minuutit.toString() +":" + this.sekuntit.toString());
	}
	
	public Kello clone() {
		
		Kello k = null;
		
		try {
			k = (Kello)super.clone();
			k.tunnit = (Viisari)tunnit.clone();
			k.minuutit = (Viisari)minuutit.clone();
			k.sekuntit = (Viisari)sekuntit.clone();
		} catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return k;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	
	public void vaihdaAikaa(int tunnit, int minuutit, int sekuntit) {
		this.tunnit.setArvo(tunnit);
		this.minuutit.setArvo(minuutit);
		this.sekuntit.setArvo(sekuntit);
	}
	
	

}
