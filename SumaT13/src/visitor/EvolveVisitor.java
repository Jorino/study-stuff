package visitor;

public class EvolveVisitor implements VisitorIF {
	
	@Override
	public void visit(Pokemon pokemon) {
		
		if(pokemon.getState() == "squirtle") {
			if(pokemon.getExp() >= 50) {
				pokemon.evolve();
			}
		} else if(pokemon.getState() == "wartortle") {
			if(pokemon.getExp() >= 100) {
				pokemon.evolve();
			}
		} else if(pokemon.getState() == "blastoise") {
			pokemon.evolve();
		}
	}

}
