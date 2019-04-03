package state;

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
		System.out.println("Wartortle used BUBBLE BEAM, it was very effective.");
		
	}

	@Override
	public void normalAttack() {
		System.out.println("Wartortle used HEADBUTT, it was effective.");
	}

	@Override
	public void speak() {
		System.out.println("Wartortle says: \"Wartortle!\"");
	}

	@Override
	public void evolve(Pokemon p) {
		p.changeState(Blastoise.getInstance());
		System.out.println("Wartortle has evolved into Blastoise!");
	}


}
