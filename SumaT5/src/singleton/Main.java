package singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VaateTehdas v = VaateTehdas.getInstance();
		PunainenVaate vaate = v.makeVaatteet("farkut");
		
		System.out.println(vaate.toString());

		
		
	}

}
