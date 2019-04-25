package prototype;

public class Main {

	public static void main(String[] args) {
		
		Kello klo1 = new Kello("Kello 1");
		klo1.kaynnistaKello();
		
		Kello klo2;
		klo2 = klo1.clone();
		klo2.setNimi("Klooni");
		klo2.kaynnistaKello();
		klo2.vaihdaAikaa(15, 45, 20);

	}

}
