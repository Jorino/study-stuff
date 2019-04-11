package memento;

import java.util.Random;

public class Arvuuttaja {
	
	private Random rand;
	
	public Arvuuttaja() {
		rand = new Random();
	}
	
	public void arvaaLuku(Arvaaja a) {
		int arvaus = a.getArvaus();
		int arvottu = a.getArvottu().getLuku();
		if(arvaus == arvottu) {
			System.out.println("Hyvä " + a.getNimi() +", nyt meni oikein!!\nArvauksesi: " + arvaus + "\tSinulle arvottu luku: " + arvottu + "\n");
		} else {
			System.out.println("Väärin meni " + a.getNimi() + "!!\n" + "Arvauksesi: " + arvaus + "\n");
		}
		
	}
	
	public void liityPeliin(Arvaaja a) {
		 a.setArvottu(new Memento(rand.nextInt(10)+1));
	}
	
	public class Memento {
		
		private int luku;
		
		public Memento(int luku) {
			this.luku = luku;
		}
		
		private int getLuku() {
			return luku;
		}
	}

}
