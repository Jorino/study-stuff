package state;

public class Blastoise implements PokemonState {

	private static Blastoise INSTANCE;
	
	public static synchronized Blastoise getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Blastoise();
		}
		return INSTANCE;
		
	}

	@Override
	public void waterAttack() {
		System.out.println("Blastoise used HYDRO PUMP, it was super effective.");
		
	}

	@Override
	public void normalAttack() {
		System.out.println("Blastoise used SKULL SMASH, it was very effective.");
	}

	@Override
	public void speak() {
		System.out.println("Blastoise says: \"BLASTOISEEEE!!!!\"");
	}

	@Override
	public void evolve(Pokemon p) {
		System.out.println("Blastoise is fully evolved.");
	}

}
