package prototype;

public class Viisari implements Cloneable {
	
	private int arvo;
	private int maksimi;
	
	public Viisari(int maksimi) {
		this.maksimi = maksimi;
		arvo = 0;
	}
	
	public void etene() {
		if(arvo == maksimi) {
			arvo = 0;
		} else {
			arvo ++;
		}
	}

	public int getArvo() {
		return arvo;
	}

	public int getMaksimi() {
		return maksimi;
	}

	public void setArvo(int arvo) {
		this.arvo = arvo;
	}

	public void setMaksimi(int maksimi) {
		this.maksimi = maksimi;
	}
	
	public String toString() {
		if(arvo == 0) {
			return "00";
		} else if (arvo < 10) {
			return "0" + arvo;
		} else {
			return "" + arvo;
		}
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch(CloneNotSupportedException e) {
			return null;
		}
		
	}
	

}
