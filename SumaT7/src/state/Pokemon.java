package state;

public class Pokemon {
	private PokemonState state;
	
	public Pokemon() {
		state = Squirtle.getInstance();
	}
	
	public void waterAttack() {
		state.waterAttack();
	}
	
	public void normalAttack() {
		state.normalAttack();
	}
	
	public void speak() {
		state.speak();
	}
	
	public void changeState(PokemonState newState) {
		this.state = newState;
	}
	
	public void evolve() {
		state.evolve(this);
	}

}
