package visitor;


public class Squirtle implements PokemonState {
	
	private static Squirtle INSTANCE;
	
	public static synchronized Squirtle getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Squirtle();
		}
		return INSTANCE;
		
	}

	@Override
	public void waterAttack() {
		System.out.println("\n\nSquirtle used BUBBLE, it was effective.");
		
	}

	@Override
	public void normalAttack() {
		System.out.println("\nSquirtle used TAIL WHIP, it wasn't very effective.");
	}

	@Override
	public void speak() {
		System.out.println("\nSquirtle says: \"squirtle, squirtle\"");
	}

	@Override
	public void evolve(Pokemon p) {
		p.changeState(Wartortle.getInstance());
		System.out.println("\nSquirtle has evolved into Wartortle!!!!!!!!!!!!!!!!!!");
	}

	@Override
	public String getState() {
		return "squirtle";
	}
	
	

}

