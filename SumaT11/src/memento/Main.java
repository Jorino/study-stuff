package memento;

public class Main {

	public static void main(String[] args) {
		Arvuuttaja arvuuttaja = new Arvuuttaja();
		Arvaaja arvaaja1 = new Arvaaja("Kalle");
		Arvaaja arvaaja2 = new Arvaaja("Tahvero");
		
		
		arvuuttaja.liityPeliin(arvaaja1);
		arvuuttaja.liityPeliin(arvaaja2);
		
		for(int i = 1; i <=10 ; i++) {
			arvaaja1.setArvaus(i);
			arvaaja2.setArvaus(11-i);
			arvuuttaja.arvaaLuku(arvaaja1);
			arvuuttaja.arvaaLuku(arvaaja2);
		}
		

	}

}
