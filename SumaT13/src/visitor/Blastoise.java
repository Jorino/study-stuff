package visitor;


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
		System.out.println("\n\nBlastoise used HYDRO PUMP, it was super effective.");
		
	}

	@Override
	public void normalAttack() {
		System.out.println("\nBlastoise used SKULL SMASH, it was very effective.");
	}

	@Override
	public void speak() {
		System.out.println("\nBlastoise says: \"BLASTOISEEEE!!!!\"");
	}

	@Override
	public void evolve(Pokemon p) {
		System.out.println("\nBlastoise is fully evolved.");
	}

	@Override
	public String getState() {
		return "blastoise";
	}

}
