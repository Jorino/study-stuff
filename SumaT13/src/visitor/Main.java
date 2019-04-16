package visitor;

public class Main {

	public static void main(String[] args) {
		
		Pokemon pokemon = new Pokemon(new EvolveVisitor());
		
		for(int i = 0 ; i < 7 ; i++) {
			
			/*pokemon.waterAttack();
			pokemon.normalAttack();
			pokemon.speak();
			pokemon.tellExp();*/
			
			pokemon.fight();
		}

	}

}
