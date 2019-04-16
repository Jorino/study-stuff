package visitor;



public class Wartortle implements PokemonState {
	
private static Wartortle INSTANCE;
	
	public static synchronized Wartortle getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Wartortle();
		}
		return INSTANCE;
		
	}

	@Override
	public void waterAttack() {
		System.out.println("\n\nWartortle used BUBBLE BEAM, it was very effective.");
		
	}

	@Override
	public void normalAttack() {
		System.out.println("\nWartortle used HEADBUTT, it was effective.");
	}

	@Override
	public void speak() {
		System.out.println("\nWartortle says: \"Wartortle!\"");
	}

	@Override
	public void evolve(Pokemon p) {
		p.changeState(Blastoise.getInstance());
		System.out.println("\nWartortle has evolved into Blastoise!!!!!!!!!!!!!!!");
	}

	@Override
	public String getState() {
		
		return "wartortle";
	}


}

