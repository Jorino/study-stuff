package visitor;

import visitor.Pokemon;

public interface PokemonState {
	public void waterAttack();
	public void normalAttack();
	public void speak();
	public void evolve(Pokemon p);
	public String getState();

}
